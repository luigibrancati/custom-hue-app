"""Helpers for reading and writing Philips Hue BLE schedules.

This script grew out of reverse-engineering sessions against the Hue BLE
schedule characteristic. It now supports four protocol flows on the schedule
characteristic:

- create a standard wake or sleep schedule from high-level parameters
- update an existing schedule by resending the full body
- delete a schedule by id
- query and read back stored schedules

The protocol is application-layer strict even when ATT transport succeeds, so
the helper preserves the capture-derived byte layout and exposes a few high-
level conveniences such as semantic timestamp patching and decoded
notifications.
"""

import argparse
import asyncio
import datetime as dt
import struct
import sys
import time
import uuid
from typing import Any, Iterable

from bleak import BleakClient, BleakScanner
from bleak.backends.device import BLEDevice
from bleak.exc import BleakDeviceNotFoundError

if sys.platform == "linux":
    from bleak.backends.bluezdbus import defs
    from bleak.backends.bluezdbus.manager import get_global_bluez_manager


DEFAULT_CHARACTERISTIC_UUID = "9da2ddf1-0001-44d0-909c-3f3d3cb34a7b"
DEFAULT_CLOCK_CHARACTERISTIC_UUID = "97fe6561-1001-4f62-86e9-b71ee2da3d22"
DEFAULT_QUERY_HEX = "00"
CREATE_SOURCE_ID = 0xFFFF
DEFAULT_SLEEP_TITLE = "Go to sleep"
DEFAULT_WAKE_TITLE = "Wake up"
DEFAULT_SLEEP_FADE_SECONDS = 1800
DEFAULT_WAKE_FADE_SECONDS = 600
TITLE_FIELD_BASE = 0x0118
SLEEP_TEMPLATE_PREFIX = bytes.fromhex("00 0e 01 01 00 02 01 01 03 02 4c 02 05 02")
WAKE_TEMPLATE_PREFIX = bytes.fromhex("00 0e 01 01 01 02 01 fe 03 02 bf 01 05 02")
RECURRENCE_SENTINEL = b"\xff\xff\xff\xff"

TIMESTAMP_OFFSET = 6
UUID_OFFSET = 28
UUID_LENGTH = 16
SCHEDULE_KIND_OFFSET = 14
FADE_DURATION_OFFSET = 24
SOURCE_ID_OFFSET = 1
ENABLED_HEADER_OFFSET = 4
ENABLED_BYTE_OFFSET = -1
TITLE_LENGTH_OFFSET = 48
TITLE_OFFSET = 49
DEFAULT_CONNECT_TIMEOUT = 10.0


def build_bluez_cached_device(address: str, manager: Any) -> BLEDevice | None:
    """Return a BlueZ-backed BLEDevice for an address already known to the adapter."""
    normalized_address = address.upper()
    for path, interfaces in manager._properties.items():
        device_props = interfaces.get(defs.DEVICE_INTERFACE)
        if not device_props or device_props.get("Address", "").upper() != normalized_address:
            continue

        alias = device_props.get("Alias")
        device_name = None if alias == normalized_address.replace(":", "-") else alias
        return BLEDevice(
            normalized_address,
            device_name,
            {"path": path, "props": device_props},
        )
    return None


async def resolve_ble_target(address: str, connect_timeout: float) -> BLEDevice | str:
    """Resolve the best Bleak connection target for the requested address.

    On Linux, Bleak's BlueZ backend insists on discovering an address before it
    can connect. That fails for devices the OS already knows about but that are
    not currently advertising. When BlueZ already has a cached device object, we
    reuse it directly and skip the rediscovery step.
    """
    normalized_address = address.upper()

    if sys.platform == "linux":
        manager = await get_global_bluez_manager()
        cached_device = build_bluez_cached_device(normalized_address, manager)
        if cached_device is not None:
            device_path = cached_device.details["path"]
            print(f"Using cached BlueZ device: {device_path}")
            return cached_device

    discovered_device = await BleakScanner.find_device_by_address(
        normalized_address,
        timeout=connect_timeout,
    )
    if discovered_device is not None:
        print(f"Resolved device by scan: {normalized_address}")
        return discovered_device

    raise BleakDeviceNotFoundError(
        normalized_address,
        (
            f"Device with address {normalized_address} was not found. "
            "If the bulb is already paired on Linux, make sure BlueZ still lists it; "
            "otherwise bring it into range and increase --connect-timeout if needed."
        ),
    )


def build_delete_payload(schedule_id: int) -> bytes:
    """Build the short delete command captured in logs7 for a schedule id."""
    return bytes([0x03]) + struct.pack("<H", schedule_id)


def encode_title(title: str) -> bytes:
    """Encode a schedule title using the ASCII encoding observed in captures."""
    try:
        return title.encode("ascii")
    except UnicodeEncodeError as exc:
        raise ValueError("Schedule titles must be ASCII for the currently understood payload format") from exc


def default_title_for_kind(kind: str) -> str:
    """Return the app-style default title for a standard schedule kind."""
    return DEFAULT_WAKE_TITLE if kind == "wake" else DEFAULT_SLEEP_TITLE


def default_fade_for_kind(kind: str) -> int:
    """Return the standard fade duration for a schedule kind in seconds."""
    return DEFAULT_WAKE_FADE_SECONDS if kind == "wake" else DEFAULT_SLEEP_FADE_SECONDS


def resolve_schedule_timestamp(kind: str, raw_timestamp: int | None, scheduled_for: int | None, fade_seconds: int) -> int | None:
    """Resolve the timestamp stored in the payload for a standard schedule.

    Wake schedules store the fade-start time. Sleep schedules store the visible
    scheduled time itself.
    """
    if raw_timestamp is not None:
        return raw_timestamp
    if scheduled_for is None:
        return None
    if kind == "wake":
        return scheduled_for - fade_seconds
    return scheduled_for


def build_standard_schedule_payload(
    kind: str,
    schedule_timestamp: int,
    fade_seconds: int,
    title: str,
    schedule_id: uuid.UUID,
    *,
    source_id: int = CREATE_SOURCE_ID,
    enabled: bool = True,
    sleep_lights_off: bool = True,
) -> bytes:
    """Build a standard wake or sleep payload from high-level parameters.

    This builder uses only the field layout and fixed byte blocks that have been
    confirmed from captures. It intentionally targets the standard wake and
    sleep variants, not every app-side customization that may exist.
    """
    if fade_seconds < 0:
        raise ValueError("Fade duration must be zero or positive")
    if fade_seconds > 0xFFFF // 10:
        raise ValueError("Fade duration is too large for the payload field")

    title_bytes = encode_title(title)
    if len(title_bytes) > 0xFF:
        raise ValueError("Schedule title is too long for the payload format")

    payload = bytearray()
    payload.append(0x01)
    payload += struct.pack("<H", source_id)
    payload += b"\x00"
    payload += bytes([int(enabled)])
    payload += b"\x00"
    payload += struct.pack("<I", schedule_timestamp)
    payload += WAKE_TEMPLATE_PREFIX if kind == "wake" else SLEEP_TEMPLATE_PREFIX
    payload += struct.pack("<H", fade_seconds * 10)
    payload += struct.pack("<H", TITLE_FIELD_BASE + len(title_bytes))
    payload += schedule_id.bytes
    payload += bytes([0x00 if kind == "wake" else int(sleep_lights_off)])
    payload += RECURRENCE_SENTINEL
    payload += bytes([len(title_bytes)])
    payload += title_bytes
    payload += bytes([int(enabled)])
    return bytes(payload)


def describe_schedule_notification(data: bytes) -> str | None:
    """Decode known schedule notifications into a human-readable summary.

    The characteristic reuses compact binary notifications for multiple
    operations. This helper keeps the raw bytes visible while also translating
    the confirmed patterns for create, update, delete, and the known failure
    response into plain text.
    """
    if len(data) >= 6 and data[:6] == b"\x01\x01\xff\xff\xff\xff":
        return "Schedule operation failed: bulb rejected the request at the application layer"

    if len(data) == 6 and data[0] == 0x01 and data[1] == 0x00:
        source_id = struct.unpack_from("<H", data, 2)[0]
        result_id = struct.unpack_from("<H", data, 4)[0]
        if source_id == CREATE_SOURCE_ID:
            return f"Create accepted: assigned schedule id {result_id}"
        return f"Update accepted: source id {source_id} replaced by schedule id {result_id}"

    if len(data) == 4 and data[0] == 0x03 and data[1] == 0x00:
        deleted_id = struct.unpack_from("<H", data, 2)[0]
        return f"Delete accepted: schedule id {deleted_id} removed"

    if len(data) == 5 and data[0] == 0x04:
        source_id = struct.unpack_from("<H", data, 1)[0]
        result_id = struct.unpack_from("<H", data, 3)[0]
        if source_id == CREATE_SOURCE_ID:
            return f"Create completed: new schedule id {result_id}"
        if result_id == CREATE_SOURCE_ID:
            return f"Delete completed: removed schedule id {source_id}"
        return f"Update completed: source id {source_id} replaced by schedule id {result_id}"

    return None


def parse_local_datetime(text: str) -> int:
    """Parse an ISO datetime into a Unix timestamp using the local timezone by default."""
    parsed = dt.datetime.fromisoformat(text)
    if parsed.tzinfo is None:
        parsed = parsed.replace(tzinfo=dt.datetime.now().astimezone().tzinfo)
    return int(parsed.timestamp())


def parse_hex_bytes(text: str) -> bytes:
    """Normalize a user-supplied hex string and convert it to raw bytes."""
    normalized = text.replace(" ", "").replace(":", "").replace("-", "")
    if normalized.startswith("0x"):
        normalized = normalized[2:]
    if len(normalized) % 2 != 0:
        raise ValueError("Hex payload must contain an even number of digits")
    return bytes.fromhex(normalized)


def format_bytes(values: Iterable[int]) -> str:
    """Render bytes in the same spaced hex form used throughout the notes and logs."""
    return " ".join(f"{value:02x}" for value in values)


def infer_schedule_kind(payload: bytes) -> str:
    """Infer whether a schedule payload is a wake or sleep schedule."""
    marker = payload[SCHEDULE_KIND_OFFSET]
    if marker == 0x01:
        return "wake"
    if marker == 0x00:
        return "sleep"
    raise ValueError(f"Unsupported schedule kind marker at offset {SCHEDULE_KIND_OFFSET}: 0x{marker:02x}")


def extract_fade_duration_seconds(payload: bytes) -> int:
    """Extract the fade duration from the payload and return it in seconds."""
    fade_deciseconds = struct.unpack_from("<H", payload, FADE_DURATION_OFFSET)[0]
    return fade_deciseconds // 10


def resolve_payload_timestamp(
    payload: bytes,
    raw_timestamp: int | None,
    scheduled_for: int | None,
) -> int | None:
    """Resolve the semantic schedule timestamp written at payload offset 6.

    Reverse-engineering established that wake schedules store the fade start
    time, whereas sleep schedules store the user-selected sleep time directly.
    """
    if raw_timestamp is not None:
        return raw_timestamp
    if scheduled_for is None:
        return None

    if infer_schedule_kind(payload) == "wake":
        return scheduled_for - extract_fade_duration_seconds(payload)
    return scheduled_for


def patch_payload(
    template: bytes,
    payload_timestamp: int | None = None,
    schedule_id: uuid.UUID | None = None,
    source_id: int | None = None,
    enabled: bool | None = None,
) -> bytes:
    """Patch a capture-derived payload template with runtime values.

    The underlying protocol expects a full binary body even for updates, so
    this helper edits the few fields that are known to vary between runs:
    source id, enabled state, timestamp, and schedule UUID.
    """
    payload = bytearray(template)
    if source_id is not None:
        struct.pack_into("<H", payload, SOURCE_ID_OFFSET, source_id)
    if enabled is not None:
        payload[3] = 0x00
        payload[ENABLED_HEADER_OFFSET] = int(enabled)
        payload[5] = 0x00
    if payload_timestamp is not None:
        payload[TIMESTAMP_OFFSET : TIMESTAMP_OFFSET + 4] = struct.pack("<I", payload_timestamp)
    if schedule_id is not None:
        payload[UUID_OFFSET : UUID_OFFSET + UUID_LENGTH] = schedule_id.bytes
    if enabled is not None:
        payload[ENABLED_BYTE_OFFSET] = int(enabled)
    return bytes(payload)


def notification_handler(_: int, data: bytearray) -> None:
    """Print a raw notification and, when recognized, its decoded meaning."""
    print(f"Notification {time.monotonic():.3f}: {format_bytes(data)}")
    decoded = describe_schedule_notification(bytes(data))
    if decoded is not None:
        print(f"Decoded notification: {decoded}")


def parse_schedule_list_notification(data: bytes) -> list[int] | None:
    """Parse the `00 00 ...` list response and return the advertised schedule ids."""
    if len(data) < 4 or data[0] != 0x00 or data[1] != 0x00:
        return None

    count = data[3]
    ids_data = data[4:]
    if len(ids_data) < count * 2:
        return None
    return [struct.unpack_from("<H", ids_data, offset)[0] for offset in range(0, count * 2, 2)]


def parse_schedule_detail_notification(data: bytes) -> tuple[int, bytes] | None:
    """Parse a `0x02` detail notification and reconstruct a schedule-like payload.

    The device returns the schedule body in a read-back container that omits the
    leading create/update opcode and instead carries the schedule id separately.
    Reconstructing `01 <id_le> <body...>` lets the rest of the decoder reuse the
    same field offsets as write payloads.
    """
    if len(data) < 8 or data[0] != 0x02 or data[1] != 0x00:
        return None

    schedule_id = struct.unpack_from("<H", data, 2)[0]
    body_length = data[4]
    body = data[8 : 8 + body_length]
    if len(body) != body_length:
        return None

    reconstructed_payload = bytes([0x01]) + struct.pack("<H", schedule_id) + body
    return schedule_id, reconstructed_payload


def extract_schedule_title(payload: bytes) -> str:
    """Extract the ASCII schedule title from a schedule payload."""
    if len(payload) <= TITLE_LENGTH_OFFSET:
        return ""
    title_length = payload[TITLE_LENGTH_OFFSET]
    raw_title = payload[TITLE_OFFSET : TITLE_OFFSET + title_length]
    return raw_title.decode("ascii", errors="replace")


def format_local_timestamp(timestamp: int) -> str:
    """Format a Unix timestamp in the local timezone for readable output."""
    return dt.datetime.fromtimestamp(timestamp).isoformat()


def print_schedule_details(schedule_id: int, payload: bytes) -> None:
    """Print a capture-style decoded view of a reconstructed schedule payload."""
    payload_timestamp = struct.unpack_from("<I", payload, TIMESTAMP_OFFSET)[0]
    enabled = bool(payload[ENABLED_BYTE_OFFSET])
    schedule_uuid = uuid.UUID(bytes=payload[UUID_OFFSET : UUID_OFFSET + UUID_LENGTH])
    print(f"Schedule {schedule_id}:")
    print(f"  name: {extract_schedule_title(payload) or '<empty>'}")
    print(f"  kind: {infer_schedule_kind(payload)}")
    print(f"  enabled: {enabled}")
    print(f"  fade_seconds: {extract_fade_duration_seconds(payload)}")
    print(f"  payload_timestamp_utc: {time.strftime('%Y-%m-%d %H:%M:%S UTC', time.gmtime(payload_timestamp))}")
    print(f"  payload_timestamp_local: {format_local_timestamp(payload_timestamp)}")
    print(f"  schedule_uuid: {schedule_uuid}")
    print(f"  payload: {format_bytes(payload)}")


def describe_operation(payload: bytes) -> str:
    """Classify a payload as create, update, or delete for logging."""
    if payload and payload[0] == 0x03:
        return "delete"

    source_id = struct.unpack_from("<H", payload, SOURCE_ID_OFFSET)[0]
    enabled = bool(payload[ENABLED_HEADER_OFFSET])
    if source_id == CREATE_SOURCE_ID:
        return "create"
    return "activate" if enabled else "deactivate"


async def write_payload(
    address: str,
    characteristic_uuid: str,
    payload: bytes | None,
    payload_timestamp: int | None,
    schedule_id: uuid.UUID | None,
    sync_clock: bool,
    clock_characteristic_uuid: str,
    clock_timestamp: int | None,
    list_schedules: bool,
    read_schedules: bool,
    query_first: bool,
    query_payload: bytes,
    query_with_response: bool,
    query_delay: float,
    write_with_response: bool,
    continue_after_query_error: bool,
    continue_after_write_error: bool,
    post_write_wait: float,
    connect_timeout: float,
) -> None:
    """Execute one complete BLE schedule session.

    Depending on CLI flags this may synchronize the clock, query the schedule
    state, read back stored schedules, send a create/update/delete command, and
    print both raw and decoded notifications.
    """
    target = await resolve_ble_target(address, connect_timeout)
    async with BleakClient(target, timeout=connect_timeout) as client:
        notifications: list[bytes] = []

        def handle_notification(_: int, data: bytearray) -> None:
            """Capture notifications so query/read flows can parse them afterward."""
            raw = bytes(data)
            notifications.append(raw)
            notification_handler(_, data)

        print(f"Connected: {client.is_connected}")

        # Bleak on BlueZ reports the default MTU until the private acquire step runs.
        backend = getattr(client, "_backend", None)
        acquire_mtu = getattr(backend, "_acquire_mtu", None)
        if callable(acquire_mtu):
            try:
                await acquire_mtu()
            except Exception as exc:
                print(f"MTU acquisition failed: {exc}")

        print(f"Negotiated MTU: {client.mtu_size}")
        if payload is not None:
            print(f"Payload length: {len(payload)} bytes")
            print(f"Operation: {describe_operation(payload)}")
            if payload_timestamp is not None:
                print(
                    "Payload timestamp: "
                    f"{payload_timestamp} ({time.strftime('%Y-%m-%d %H:%M:%S UTC', time.gmtime(payload_timestamp))})"
                )
                print(f"Schedule kind: {infer_schedule_kind(payload)}")
                print(f"Fade duration: {extract_fade_duration_seconds(payload)} seconds")
            if schedule_id is not None:
                print(f"Payload schedule UUID: {schedule_id}")
            print(f"Payload: {format_bytes(payload)}")

        notifications_enabled = False
        try:
            await client.start_notify(characteristic_uuid, handle_notification)
            notifications_enabled = True
            print("Notifications enabled")
            await asyncio.sleep(0.5)
        except Exception as exc:
            print(f"Enabling notifications failed: {exc}")

        if payload is not None and client.mtu_size and len(payload) > client.mtu_size - 3:
            print(
                "Warning: payload is larger than ATT_MTU-3. "
                "If the BlueZ backend does not handle long writes for this characteristic, the write may fail."
            )

        try:
            if sync_clock:
                sync_value = struct.pack("<I", clock_timestamp or int(time.time()))
                print(f"Clock sync characteristic: {clock_characteristic_uuid}")
                print(f"Clock sync payload: {format_bytes(sync_value)}")
                await client.write_gatt_char(
                    clock_characteristic_uuid,
                    sync_value,
                    response=True,
                )
                print("Clock sync write completed")
                await asyncio.sleep(0.2)

            if query_first:
                notifications.clear()
                print(f"Query payload: {format_bytes(query_payload)}")
                print(f"Query write mode: {'request' if query_with_response else 'command'}")
                try:
                    await client.write_gatt_char(
                        characteristic_uuid,
                        query_payload,
                        response=query_with_response,
                    )
                    print("Query write completed")
                except Exception as exc:
                    print(f"Query write failed: {exc}")
                    if not continue_after_query_error:
                        raise
                await asyncio.sleep(query_delay)

                if list_schedules or read_schedules:
                    # Query responses can include other notifications, so retain
                    # only frames that match the confirmed list container.
                    parsed_lists = [ids for ids in (parse_schedule_list_notification(item) for item in notifications) if ids is not None]
                    if parsed_lists:
                        current_ids = parsed_lists[-1]
                        if current_ids:
                            print(f"Current schedule ids: {', '.join(str(value) for value in current_ids)}")
                        else:
                            print("Current schedule ids: none")
                    else:
                        print("Could not parse a schedule list from the query notifications")
                        return

                    if list_schedules and not read_schedules:
                        return

                    for current_id in current_ids:
                        notifications.clear()
                        # logs6 established the per-schedule read-back command.
                        detail_request = bytes([0x02]) + struct.pack("<H", current_id) + b"\x00\x00"
                        print(f"Read request for schedule {current_id}: {format_bytes(detail_request)}")
                        await client.write_gatt_char(
                            characteristic_uuid,
                            detail_request,
                            response=True,
                        )
                        await asyncio.sleep(query_delay)

                        parsed_details = [detail for detail in (parse_schedule_detail_notification(item) for item in notifications) if detail is not None]
                        if not parsed_details:
                            print(f"Could not parse details for schedule {current_id}")
                            continue

                        detail_id, detail_payload = parsed_details[-1]
                        print_schedule_details(detail_id, detail_payload)
                    return

            if payload is None:
                raise ValueError("Schedule payload is required unless --list-schedules is used")

            try:
                print(f"Schedule write mode: {'request' if write_with_response else 'command'}")
                await client.write_gatt_char(
                    characteristic_uuid,
                    payload,
                    response=write_with_response,
                )
                print("Write completed")
            except Exception as exc:
                print(f"Schedule write failed: {exc}")
                if not continue_after_write_error:
                    raise

            await asyncio.sleep(post_write_wait)
        finally:
            if notifications_enabled:
                try:
                    await client.stop_notify(characteristic_uuid)
                except Exception as exc:
                    print(f"Stopping notifications failed: {exc}")


def build_parser() -> argparse.ArgumentParser:
    """Build the command-line interface for schedule create/read/update/delete flows."""
    parser = argparse.ArgumentParser(
        description="Write a Hue BLE schedule payload to a characteristic using Bleak."
    )
    parser.add_argument(
        "address",
        help="BLE MAC address of the target bulb, for example EA:15:3E:2E:26:A2",
    )
    parser.add_argument(
        "--characteristic",
        default=DEFAULT_CHARACTERISTIC_UUID,
        help=f"Characteristic UUID. Default: {DEFAULT_CHARACTERISTIC_UUID}",
    )
    parser.add_argument(
        "--payload",
        help="Hex payload to write. If omitted, the script builds a standard wake or sleep payload from the other CLI parameters.",
    )
    parser.add_argument(
        "--kind",
        choices=["sleep", "wake"],
        help="Standard schedule kind to build when --payload is omitted. Defaults to sleep for create operations.",
    )
    parser.add_argument(
        "--created-at",
        type=int,
        help="Raw Unix timestamp to inject at payload offset 6. This is the schedule timestamp field, not a creation time.",
    )
    parser.add_argument(
        "--scheduled-for",
        help=(
            "Local or timezone-aware ISO datetime for the schedule's UI-selected time, for example "
            "2026-03-13T23:00 or 2026-03-13T23:00+01:00. "
            "Wake payloads are converted to fade-start time; sleep payloads use the timestamp as-is."
        ),
    )
    parser.add_argument(
        "--schedule-id",
        help="UUID to inject into the generated or explicit payload. Defaults to a fresh UUIDv4 for create operations.",
    )
    parser.add_argument(
        "--title",
        help="Schedule title to embed in a generated standard payload. Defaults to 'Go to sleep' or 'Wake up'.",
    )
    parser.add_argument(
        "--fade-seconds",
        type=int,
        help="Fade duration in seconds for a generated standard payload. Defaults to 1800 for sleep and 600 for wake.",
    )
    parser.add_argument(
        "--list-schedules",
        action="store_true",
        help="Query the schedule characteristic and print the currently advertised schedule ids without sending a schedule write.",
    )
    parser.add_argument(
        "--read-schedules",
        action="store_true",
        help="Query the current schedule ids, then read back and decode each advertised schedule body.",
    )
    parser.add_argument(
        "--delete-id",
        type=lambda value: int(value, 0),
        help="Delete an existing schedule by id using the `03 <id_le>` command captured in logs7.",
    )
    parser.add_argument(
        "--source-id",
        type=lambda value: int(value, 0),
        help=(
            "Existing schedule id to update. Use 0xffff or omit for create. "
            "When set together with --enabled/--disabled, the script emits the update format observed in logs6."
        ),
    )
    enabled_group = parser.add_mutually_exclusive_group()
    enabled_group.add_argument(
        "--enabled",
        dest="enabled",
        action="store_true",
        help="Mark the schedule as enabled in both the update header and final payload byte.",
    )
    enabled_group.add_argument(
        "--disabled",
        dest="enabled",
        action="store_false",
        help="Mark the schedule as disabled in both the update header and final payload byte.",
    )
    parser.add_argument(
        "--sync-clock",
        action="store_true",
        help=(
            "Write the current Unix time to the app-observed clock characteristic before querying/writing schedules. "
            f"Default characteristic: {DEFAULT_CLOCK_CHARACTERISTIC_UUID}"
        ),
    )
    parser.add_argument(
        "--clock-characteristic",
        default=DEFAULT_CLOCK_CHARACTERISTIC_UUID,
        help=f"Clock-sync characteristic UUID. Default: {DEFAULT_CLOCK_CHARACTERISTIC_UUID}",
    )
    parser.add_argument(
        "--clock-timestamp",
        type=int,
        help="Unix timestamp to send to the clock-sync characteristic. Defaults to the current time when --sync-clock is used.",
    )
    parser.add_argument(
        "--query-payload",
        default=DEFAULT_QUERY_HEX,
        help="Optional hex payload to write first, before the schedule payload. Default: 00",
    )
    parser.add_argument(
        "--query-delay",
        type=float,
        default=0.5,
        help="Delay in seconds between the query write and the schedule write. Default: 0.5",
    )
    parser.add_argument(
        "--query-without-response",
        dest="query_with_response",
        action="store_false",
        help="Send the preliminary query as a Write Command instead of a Write Request.",
    )
    parser.add_argument(
        "--no-query-first",
        dest="query_first",
        action="store_false",
        help="Disable the preliminary query write before the schedule write.",
    )
    parser.add_argument(
        "--write-without-response",
        dest="write_with_response",
        action="store_false",
        help="Send the schedule payload as a Write Command instead of a Write Request.",
    )
    parser.add_argument(
        "--stop-on-query-error",
        dest="continue_after_query_error",
        action="store_false",
        help="Abort immediately if the preliminary query write returns an error.",
    )
    parser.add_argument(
        "--stop-on-write-error",
        dest="continue_after_write_error",
        action="store_false",
        help="Abort immediately if the schedule write returns an error.",
    )
    parser.add_argument(
        "--post-write-wait",
        type=float,
        default=1.5,
        help="Time in seconds to keep listening for notifications after the schedule write. Default: 1.5",
    )
    parser.add_argument(
        "--connect-timeout",
        type=float,
        default=DEFAULT_CONNECT_TIMEOUT,
        help=(
            "Seconds to wait when Bleak must discover the device before connecting. "
            f"Default: {DEFAULT_CONNECT_TIMEOUT}"
        ),
    )
    parser.set_defaults(query_first=True)
    parser.set_defaults(query_with_response=True)
    parser.set_defaults(continue_after_query_error=True)
    parser.set_defaults(write_with_response=True)
    parser.set_defaults(continue_after_write_error=True)
    parser.set_defaults(enabled=None)
    return parser


def main() -> None:
    """Parse arguments, validate incompatible modes, and run the selected flow."""
    parser = build_parser()
    args = parser.parse_args()
    if args.read_schedules and not args.query_first:
        parser.error("--read-schedules requires the initial query step; do not combine it with --no-query-first.")
    if args.delete_id is not None and args.read_schedules:
        parser.error("--delete-id cannot be combined with --read-schedules.")
    if args.delete_id is not None and args.list_schedules:
        parser.error("--delete-id cannot be combined with --list-schedules.")
    if args.delete_id is not None and args.payload:
        parser.error("--delete-id cannot be combined with --payload.")
    if args.delete_id is not None and args.schedule_id:
        parser.error("--delete-id does not use --schedule-id.")
    if args.delete_id is not None and args.source_id is not None:
        parser.error("--delete-id cannot be combined with --source-id.")
    if args.delete_id is not None and args.enabled is not None:
        parser.error("--delete-id cannot be combined with --enabled or --disabled.")
    if args.delete_id is not None and (args.created_at is not None or args.scheduled_for is not None):
        parser.error("--delete-id cannot be combined with --created-at or --scheduled-for.")
    if args.payload and args.fade_seconds is not None:
        parser.error("--fade-seconds applies only when building a standard payload; do not combine it with --payload.")
    if args.payload and args.title is not None:
        parser.error("--title applies only when building a standard payload; do not combine it with --payload.")
    if args.payload and args.kind is not None:
        parser.error("--kind applies only when building a standard payload; do not combine it with --payload.")
    if (args.list_schedules or args.read_schedules or args.delete_id is not None) and args.fade_seconds is not None:
        parser.error("--fade-seconds is only meaningful for generated create payloads.")
    if (args.list_schedules or args.read_schedules or args.delete_id is not None) and args.title is not None:
        parser.error("--title is only meaningful for generated create payloads.")
    if (args.list_schedules or args.read_schedules or args.delete_id is not None) and args.kind is not None:
        parser.error("--kind is only meaningful for generated create payloads.")

    schedule_id = uuid.UUID(args.schedule_id) if args.schedule_id else None
    if args.delete_id is not None:
        payload = build_delete_payload(args.delete_id)
        payload_timestamp = None
    elif args.list_schedules or args.read_schedules:
        payload = None
        payload_timestamp = None
    elif args.payload:
        payload = parse_hex_bytes(args.payload)
        payload_timestamp = resolve_payload_timestamp(payload, args.created_at, scheduled_for := (parse_local_datetime(args.scheduled_for) if args.scheduled_for else None))
    else:
        payload = None
        scheduled_for = parse_local_datetime(args.scheduled_for) if args.scheduled_for else None
        build_kind = args.kind or "sleep"
        fade_seconds = args.fade_seconds if args.fade_seconds is not None else default_fade_for_kind(build_kind)
        title = args.title or default_title_for_kind(build_kind)
        payload_timestamp = resolve_schedule_timestamp(build_kind, args.created_at, scheduled_for, fade_seconds)

        if args.source_id is not None:
            parser.error("Generated standard payload mode only supports create operations. Use --payload for updates.")
        if payload_timestamp is None:
            parser.error(
                "Generated standard payloads need a real schedule time. Pass --scheduled-for or --created-at."
            )

        if schedule_id is None:
            schedule_id = uuid.uuid4()

        try:
            payload = build_standard_schedule_payload(
                build_kind,
                payload_timestamp,
                fade_seconds,
                title,
                schedule_id,
                enabled=args.enabled if args.enabled is not None else True,
            )
        except ValueError as exc:
            parser.error(str(exc))

    source_id = args.source_id if args.source_id is not None else CREATE_SOURCE_ID

    if payload is not None and args.delete_id is None and source_id == CREATE_SOURCE_ID and args.payload is not None and schedule_id is None:
        schedule_id = uuid.uuid4()

    if payload is not None and args.delete_id is None and source_id != CREATE_SOURCE_ID and schedule_id is None:
        parser.error(
            "Updating an existing schedule requires --schedule-id so the full schedule body can be resent exactly as the bulb expects."
        )

    if payload is not None and args.delete_id is None and args.payload is not None:
        payload = patch_payload(
            payload,
            payload_timestamp=payload_timestamp,
            schedule_id=schedule_id,
            source_id=source_id,
            enabled=args.enabled,
        )

    query_payload = parse_hex_bytes(args.query_payload)
    asyncio.run(
        write_payload(
            args.address,
            args.characteristic,
            payload,
            payload_timestamp,
            schedule_id,
            args.sync_clock,
            args.clock_characteristic,
            args.clock_timestamp,
            args.list_schedules,
            args.read_schedules,
            args.query_first,
            query_payload,
            args.query_with_response,
            args.query_delay,
            args.write_with_response,
            args.continue_after_query_error,
            args.continue_after_write_error,
            args.post_write_wait,
            args.connect_timeout,
        )
    )


if __name__ == "__main__":
    main()