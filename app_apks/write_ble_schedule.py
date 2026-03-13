import argparse
import asyncio
import struct
import time
import uuid
from typing import Iterable

from bleak import BleakClient


DEFAULT_CHARACTERISTIC_UUID = "9da2ddf1-0001-44d0-909c-3f3d3cb34a7b"
DEFAULT_QUERY_HEX = "00"

# Frame-1112-style value only, without ATT opcode/handle bytes.
# The capture-derived template is patched at runtime with a fresh Unix timestamp and UUID.
DEFAULT_PAYLOAD_TEMPLATE_HEX = (
    "01 ff ff 00 01 00 d0 7a b4 69 00 0e 01 01 00 02 01 01 03 02 "
    "4c 02 05 02 50 46 28 01 cd bf 5c 7f 10 d1 45 f4 a4 da 8c 5e "
    "04 ab 43 b0 01 ff ff ff ff 10 54 65 73 74 20 67 6f 20 74 6f "
    "20 73 6c 65 65 70 01"
)

TIMESTAMP_OFFSET = 6
UUID_OFFSET = 28
UUID_LENGTH = 16


def parse_hex_bytes(text: str) -> bytes:
    normalized = text.replace(" ", "").replace(":", "").replace("-", "")
    if normalized.startswith("0x"):
        normalized = normalized[2:]
    if len(normalized) % 2 != 0:
        raise ValueError("Hex payload must contain an even number of digits")
    return bytes.fromhex(normalized)


def format_bytes(values: Iterable[int]) -> str:
    return " ".join(f"{value:02x}" for value in values)


def build_default_payload(created_at: int | None = None, schedule_id: uuid.UUID | None = None) -> bytes:
    payload = bytearray(parse_hex_bytes(DEFAULT_PAYLOAD_TEMPLATE_HEX))
    payload[TIMESTAMP_OFFSET : TIMESTAMP_OFFSET + 4] = struct.pack("<I", created_at or int(time.time()))
    payload[UUID_OFFSET : UUID_OFFSET + UUID_LENGTH] = (schedule_id or uuid.uuid4()).bytes
    return bytes(payload)


def notification_handler(_: int, data: bytearray) -> None:
    print(f"Notification {time.monotonic():.3f}: {format_bytes(data)}")


async def write_payload(
    address: str,
    characteristic_uuid: str,
    payload: bytes,
    created_at: int | None,
    schedule_id: uuid.UUID | None,
    query_first: bool,
    query_payload: bytes,
    query_with_response: bool,
    query_delay: float,
    write_with_response: bool,
    continue_after_query_error: bool,
    continue_after_write_error: bool,
    post_write_wait: float,
) -> None:
    async with BleakClient(address) as client:
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
        print(f"Payload length: {len(payload)} bytes")
        if created_at is not None:
            print(f"Payload timestamp: {created_at} ({time.strftime('%Y-%m-%d %H:%M:%S UTC', time.gmtime(created_at))})")
        if schedule_id is not None:
            print(f"Payload schedule UUID: {schedule_id}")
        print(f"Payload: {format_bytes(payload)}")

        notifications_enabled = False
        try:
            await client.start_notify(characteristic_uuid, notification_handler)
            notifications_enabled = True
            print("Notifications enabled")
            await asyncio.sleep(0.5)
        except Exception as exc:
            print(f"Enabling notifications failed: {exc}")

        if client.mtu_size and len(payload) > client.mtu_size - 3:
            print(
                "Warning: payload is larger than ATT_MTU-3. "
                "If the BlueZ backend does not handle long writes for this characteristic, the write may fail."
            )

        try:
            if query_first:
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
        help="Hex payload to write. If omitted, a frame-1112-style payload is generated with a fresh timestamp and UUID.",
    )
    parser.add_argument(
        "--created-at",
        type=int,
        help="Unix timestamp to inject into the default generated payload. Defaults to the current time.",
    )
    parser.add_argument(
        "--schedule-id",
        help="UUID to inject into the default generated payload. Defaults to a fresh UUIDv4.",
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
    parser.set_defaults(query_first=True)
    parser.set_defaults(query_with_response=True)
    parser.set_defaults(continue_after_query_error=True)
    parser.set_defaults(write_with_response=True)
    parser.set_defaults(continue_after_write_error=True)
    return parser


def main() -> None:
    parser = build_parser()
    args = parser.parse_args()
    created_at = None
    schedule_id = None
    if args.payload:
        payload = parse_hex_bytes(args.payload)
    else:
        created_at = args.created_at or int(time.time())
        schedule_id = uuid.UUID(args.schedule_id) if args.schedule_id else uuid.uuid4()
        payload = build_default_payload(created_at=created_at, schedule_id=schedule_id)
    query_payload = parse_hex_bytes(args.query_payload)
    asyncio.run(
        write_payload(
            args.address,
            args.characteristic,
            payload,
            created_at,
            schedule_id,
            args.query_first,
            query_payload,
            args.query_with_response,
            args.query_delay,
            args.write_with_response,
            args.continue_after_query_error,
            args.continue_after_write_error,
            args.post_write_wait,
        )
    )


if __name__ == "__main__":
    main()