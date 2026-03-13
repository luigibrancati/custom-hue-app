# Hue BLE Schedule Helper

This workspace contains reverse-engineering notes and a Python helper for working with Philips Hue BLE schedules over the characteristic `9da2ddf1-0001-44d0-909c-3f3d3cb34a7b`.

The helper script is [write_ble_schedule.py](/home/luigi/projects/custom_hue/original_app_data/write_ble_schedule.py). It supports:

- creating schedules
- reading current schedule ids
- reading back full stored schedule details
- updating existing schedules
- deleting schedules by id

## Install

This project uses `uv` and depends on `bleak`.

```bash
uv sync
```

## Common Commands

Replace the example BLE address with your bulb address.

### List current schedule ids

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 --list-schedules
```

### Read back and decode stored schedules

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 --read-schedules
```

### Create a sleep schedule

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 \
	--kind sleep \
	--scheduled-for 2026-03-13T23:00+01:00 \
	--fade-seconds 1800 \
	--title "Go to sleep" \
	--sync-clock \
	--write-without-response
```

For sleep schedules, `--scheduled-for` is interpreted as the selected sleep time itself.

### Create a wake schedule

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 \
	--kind wake \
	--scheduled-for 2026-03-14T07:00+01:00 \
	--fade-seconds 600 \
	--title "Wake up" \
	--sync-clock \
	--write-without-response
```

For wake schedules, offset `6..9` stores the fade-start time rather than the visible wake completion time, so the builder subtracts the fade duration from `--scheduled-for` automatically.

### Advanced: write an explicit payload

Raw payload mode is still available when you want to replay or patch a known body directly.

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 \
	--payload "01 04 00 00 01 00 08 f7 b4 69 00 0e 01 01 01 02 01 fe 03 02 bf 01 05 02 70 17 1f 01 1c cf e8 ac 2e df 47 64 86 3a 12 8a af c5 17 62 00 ff ff ff ff 07 57 61 6b 65 20 75 70 01" \
	--schedule-id 1ccfe8ac-2edf-4764-863a-128aafc51762 \
	--created-at 1741931400 \
	--write-without-response
```

### Update an existing schedule

Read the schedule first, then resend the same full body with the existing source id and the same schedule UUID.

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 \
	--payload "01 04 00 00 01 00 08 f7 b4 69 00 0e 01 01 01 02 01 fe 03 02 bf 01 05 02 70 17 1f 01 1c cf e8 ac 2e df 47 64 86 3a 12 8a af c5 17 62 00 ff ff ff ff 07 57 61 6b 65 20 75 70 01" \
	--source-id 4 \
	--schedule-id 1ccfe8ac-2edf-4764-863a-128aafc51762 \
	--enabled \
	--write-without-response
```

Use `--disabled` instead of `--enabled` to deactivate the schedule.

### Delete a schedule

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 --delete-id 5
```

## Typical Workflow

This is the safest loop when changing an existing schedule.

### 1. Read the current schedules

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 --read-schedules
```

This prints the current ids and a decoded view of each schedule, including title, kind, enabled flag, fade duration, timestamp, UUID, and reconstructed payload.

### 2. Update one schedule

Copy the reconstructed payload for the schedule you want to change, then resend it with the current schedule id as `--source-id`.

Example: keep schedule `4` enabled.

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 \
	--payload "01 04 00 00 01 00 08 f7 b4 69 00 0e 01 01 01 02 01 fe 03 02 bf 01 05 02 70 17 1f 01 1c cf e8 ac 2e df 47 64 86 3a 12 8a af c5 17 62 00 ff ff ff ff 07 57 61 6b 65 20 75 70 01" \
	--source-id 4 \
	--schedule-id 1ccfe8ac-2edf-4764-863a-128aafc51762 \
	--enabled \
	--write-without-response
```

The bulb does not mutate schedules in place. A successful update returns a new schedule id in the decoded notifications.

Updates still use explicit payload mode because the full body must be resent exactly as the bulb expects.

### 3. Verify the result

```bash
uv run write_ble_schedule.py C2:83:04:71:78:74 --read-schedules
```

Confirm that:

- the new schedule id is present
- the old id has been replaced
- the decoded schedule body matches the expected title, timestamp, fade, and enabled state

## Notes

- The bulb expects notifications to be enabled on the schedule characteristic before meaningful schedule traffic.
- On Linux, the helper now reuses a BlueZ-cached device object when the bulb is already paired or connected, which avoids Bleak's address rediscovery failure for non-advertising devices.
- If the bulb is not yet known to BlueZ, use `--connect-timeout` to give the fallback discovery step more time before connect.
- Successful create, update, and delete operations emit compact notifications that the script now decodes into human-readable summaries.
- A direct replay with stale timestamps or missing clock sync is usually rejected with `01 01 ff ff ff ff`.

## Notification Reference

The schedule characteristic returns compact binary notifications. The helper prints the raw bytes and decodes the confirmed cases below.

| Notification | Meaning |
| :-- | :-- |
| `00 00 ...` | Schedule list response. The fourth byte is the count and the remaining bytes contain little-endian schedule ids. |
| `02 00 <id_le> <body_len> ...` | Schedule detail response for a prior `02 <id_le> 00 00` read request. |
| `01 00 ff ff <new_id_le>` | Create accepted. The bulb assigned a new schedule id. |
| `04 ff ff <new_id_le>` | Create completed. |
| `01 00 <source_id_le> <new_id_le>` | Update accepted. The bulb replaced the source schedule with a new id. |
| `04 <source_id_le> <new_id_le>` | Update completed. |
| `03 00 <schedule_id_le>` | Delete accepted. |
| `04 <schedule_id_le> ff ff` | Delete completed. |
| `01 01 ff ff ff ff` | Application-layer failure. The bulb rejected the schedule operation. |

Observed examples:

- create success: `01 00 ff ff 05 00`, then `04 ff ff 05 00`
- update success: `01 00 02 00 03 00`, then `04 02 00 03 00`
- delete success: `03 00 05 00`, then `04 05 00 ff ff`
- failure: `01 01 ff ff ff ff`

## Reverse-Engineering Notes

Detailed protocol findings, captures, and confirmed payload layouts are documented in [BLE_reverse_eng.md](/home/luigi/projects/custom_hue/original_app_data/BLE_reverse_eng.md).
