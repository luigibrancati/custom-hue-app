from __future__ import annotations

import argparse
import struct
from dataclasses import dataclass
from pathlib import Path
from typing import Iterable, Iterator, Sequence


BTSNOOP_MAGIC = b"btsnoop\x00"
BTSNOOP_HEADER_SIZE = 16
BTSNOOP_RECORD_HEADER_SIZE = 24
HCI_ACL_PACKET = 0x02
ATT_CID = 0x0004


@dataclass(frozen=True)
class BTSnoopRecord:
    index: int
    orig_len: int
    inc_len: int
    flags: int
    drops: int
    timestamp_us: int
    packet: bytes


@dataclass(frozen=True)
class ATTEvent:
    record_index: int
    flags: int
    direction: str
    opcode: int
    method: int
    kind: str
    handle: int | tuple[int, ...] | tuple[int, int, str] | None
    value: bytes


def read_btsnoop_records(path: str | Path) -> list[BTSnoopRecord]:
    data = Path(path).read_bytes()
    if len(data) < BTSNOOP_HEADER_SIZE or data[:8] != BTSNOOP_MAGIC:
        raise ValueError(f"{path} is not a BTSnoop file")

    records: list[BTSnoopRecord] = []
    offset = BTSNOOP_HEADER_SIZE
    index = 0
    while offset + BTSNOOP_RECORD_HEADER_SIZE <= len(data):
        orig_len, inc_len, flags, drops, timestamp_us = struct.unpack_from(
            ">IIIIq", data, offset
        )
        offset += BTSNOOP_RECORD_HEADER_SIZE
        packet = data[offset : offset + inc_len]
        offset += inc_len
        index += 1
        records.append(
            BTSnoopRecord(
                index=index,
                orig_len=orig_len,
                inc_len=inc_len,
                flags=flags,
                drops=drops,
                timestamp_us=timestamp_us,
                packet=packet,
            )
        )
    return records


def iter_att_events(path: str | Path) -> Iterator[ATTEvent]:
    for record in read_btsnoop_records(path):
        if not record.packet or record.packet[0] != HCI_ACL_PACKET or len(record.packet) < 9:
            continue

        _, data_total_len = struct.unpack_from("<HH", record.packet, 1)
        acl_payload = record.packet[5 : 5 + data_total_len]
        if len(acl_payload) < 4:
            continue

        l2cap_len, cid = struct.unpack_from("<HH", acl_payload, 0)
        if cid != ATT_CID:
            continue

        att_payload = acl_payload[4 : 4 + l2cap_len]
        event = parse_att_payload(
            att_payload,
            record_index=record.index,
            flags=record.flags,
        )
        if event is not None:
            yield event


def parse_att_payload(payload: bytes, record_index: int = 0, flags: int = 0) -> ATTEvent | None:
    if not payload:
        return None

    opcode = payload[0]
    method = opcode & 0x3F
    is_command = bool(opcode & 0x40)
    direction = "phone->bulb" if flags in (0, 2) else "bulb->phone"

    if method == 0x12:
        handle = struct.unpack_from("<H", payload, 1)[0]
        return ATTEvent(record_index, flags, direction, opcode, method, "write_cmd" if is_command else "write_req", handle, payload[3:])

    if method == 0x13:
        return ATTEvent(record_index, flags, direction, opcode, method, "write_rsp", None, payload[1:])

    if method == 0x1B:
        handle = struct.unpack_from("<H", payload, 1)[0]
        return ATTEvent(record_index, flags, direction, opcode, method, "notify", handle, payload[3:])

    if method == 0x1D:
        handle = struct.unpack_from("<H", payload, 1)[0]
        return ATTEvent(record_index, flags, direction, opcode, method, "indicate", handle, payload[3:])

    if method == 0x1E:
        return ATTEvent(record_index, flags, direction, opcode, method, "confirm", None, payload[1:])

    if method == 0x0A:
        handle = struct.unpack_from("<H", payload, 1)[0]
        return ATTEvent(record_index, flags, direction, opcode, method, "read_req", handle, b"")

    if method == 0x0B:
        return ATTEvent(record_index, flags, direction, opcode, method, "read_rsp", None, payload[1:])

    if method == 0x08:
        start, end = struct.unpack_from("<HH", payload, 1)
        uuid = payload[5:7].hex()
        return ATTEvent(record_index, flags, direction, opcode, method, "read_by_type_req", (start, end, uuid), b"")

    if method == 0x09:
        return ATTEvent(record_index, flags, direction, opcode, method, "read_by_type_rsp", None, payload[1:])

    if method == 0x04:
        start, end = struct.unpack_from("<HH", payload, 1)
        return ATTEvent(record_index, flags, direction, opcode, method, "find_info_req", (start, end), b"")

    if method == 0x05:
        return ATTEvent(record_index, flags, direction, opcode, method, "find_info_rsp", None, payload[1:])

    if method == 0x10:
        start, end = struct.unpack_from("<HH", payload, 1)
        return ATTEvent(record_index, flags, direction, opcode, method, "read_by_group_req", (start, end), b"")

    if method == 0x11:
        return ATTEvent(record_index, flags, direction, opcode, method, "read_by_group_rsp", None, payload[1:])

    if method == 0x01:
        request_opcode = payload[1] if len(payload) > 1 else 0
        handle = struct.unpack_from("<H", payload, 2)[0] if len(payload) >= 4 else 0
        error_code = payload[4] if len(payload) > 4 else 0
        return ATTEvent(record_index, flags, direction, opcode, method, "error_rsp", (request_opcode, handle, error_code), b"")

    return ATTEvent(record_index, flags, direction, opcode, method, f"op_{opcode:02x}", None, payload[1:])


def filter_events(
    events: Iterable[ATTEvent],
    *,
    handles: Sequence[int] | None = None,
    kinds: Sequence[str] | None = None,
    directions: Sequence[str] | None = None,
) -> Iterator[ATTEvent]:
    handle_set = set(handles or [])
    kind_set = set(kinds or [])
    direction_set = set(directions or [])

    for event in events:
        if handle_set and not isinstance(event.handle, int):
            continue
        if handle_set and event.handle not in handle_set:
            continue
        if kind_set and event.kind not in kind_set:
            continue
        if direction_set and event.direction not in direction_set:
            continue
        yield event


def format_event(event: ATTEvent) -> str:
    handle = event.handle
    if isinstance(handle, int):
        handle_text = f"0x{handle:04x}"
    elif handle is None:
        handle_text = "-"
    else:
        handle_text = str(handle)
    return "\t".join(
        [
            str(event.record_index),
            str(event.flags),
            event.direction,
            event.kind,
            handle_text,
            event.value.hex(),
        ]
    )


def _parse_handle_filters(values: Sequence[str]) -> list[int]:
    parsed: list[int] = []
    for value in values:
        parsed.append(int(value, 0))
    return parsed


def build_parser() -> argparse.ArgumentParser:
    parser = argparse.ArgumentParser(description="Dump ATT events from a BTSnoop HCI log.")
    parser.add_argument("path", help="Path to a BTSnoop HCI log")
    parser.add_argument(
        "--handle",
        action="append",
        default=[],
        help="Filter by ATT handle. Repeatable. Accepts decimal or 0x-prefixed hex.",
    )
    parser.add_argument(
        "--kind",
        action="append",
        default=[],
        help="Filter by decoded ATT event kind, for example write_req, notify, error_rsp.",
    )
    parser.add_argument(
        "--direction",
        action="append",
        default=[],
        help="Filter by direction. Supported values: phone->bulb, bulb->phone.",
    )
    parser.add_argument(
        "--limit",
        type=int,
        default=0,
        help="Stop after printing this many matching events. Default: no limit.",
    )
    return parser


def main() -> None:
    args = build_parser().parse_args()
    matches = filter_events(
        iter_att_events(args.path),
        handles=_parse_handle_filters(args.handle),
        kinds=args.kind,
        directions=args.direction,
    )

    count = 0
    for event in matches:
        print(format_event(event))
        count += 1
        if args.limit and count >= args.limit:
            break


if __name__ == "__main__":
    main()