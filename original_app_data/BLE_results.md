# Results


## Progress:

- Characteristic UUID used for schedules: 9da2ddf1‑0001‑44d0‑909c‑3f3d3cb34a7b (handle 0x0072)
- The payload isn't encrypted and is made up of about 74 bytes for "Go to sleep" schedules and 70 bytes for "Wake up" schedules 
- The payload structure is described in the following sections
- I was able to decompile the source code into Java and Flutter artifacts. An analysis on this artifact confirmed that all relevant info (uuids, payload construction etc.) are done in Flutter and only final values are handed to Java, so unfortunately the java code isn't useful
- Wrote a python script to interact with the bulb and simulate writes similar to those performed by the app

## Consolidated Schedule Protocol Reference

This section consolidates the confirmed on-wire layout for the schedule characteristic `9da2ddf1-0001-44d0-909c-3f3d3cb34a7b` on handle `0x0072`.

The app-level flow that consistently works is:

1. Enable notifications on the schedule characteristic CCCD.
2. Optionally synchronize the bulb clock on `97fe6561-1001-4f62-86e9-b71ee2da3d22`.
3. Query the schedule characteristic with `00`.
4. Send either a create/update payload, a detail-read request, or a delete request.
5. Interpret the resulting notifications on the same characteristic.

### 1. Common Full Schedule Payload Layout

Create and update operations both use the same full schedule-body format.

Confirmed byte layout:

| Offset | Size (bytes) | Meaning | Status |
| :-- | :-- | :-- | :-- |
| `0` | 1 | Operation opcode `01` | confirmed |
| `1..2` | 2 | Source schedule id, little-endian. `ff ff` for create, existing id for update | confirmed |
| `3` | 1 | Constant `00` in captured create/update payloads | confirmed |
| `4` | 1 | Enabled flag in update flows. `01` for active, `00` for disabled | confirmed |
| `5` | 1 | Constant `00` in captured create/update payloads | confirmed |
| `6..9` | 4 | Semantic schedule timestamp, little-endian Unix time | confirmed |
| `10..13` | 4 | Fixed bytes `00 0e 01 01` for standard wake/sleep payloads | confirmed for standard wake/sleep |
| `14` | 1 | Schedule kind marker: `00` sleep, `01` wake | confirmed |
| `15..22` | 8 | Type-specific fixed block identifying the schedule behavior | confirmed as fixed per kind |
| `23..24` | 2 | Fade duration in deciseconds, little-endian | confirmed |
| `25..26` | 2 | Type/title-derived field. For standard payloads this matches `0x0118 + title_len` | confirmed for standard wake/sleep builder |
| `27..42` in early notes / `28..43` in opcode-included payloads | 16 | Schedule UUIDv4 bytes | confirmed |
| `43` in early notes / `44` in opcode-included payloads | 1 | Type-specific flag. `01` for captured sleep schedules, `00` for captured wake schedules | confirmed by capture, semantics inferred |
| next `4` bytes | 4 | Constant recurrence/sentinel field `ff ff ff ff` | confirmed |
| next `1` byte | 1 | ASCII title length | confirmed |
| next `N` bytes | N | ASCII schedule title | confirmed |
| final byte | 1 | Enabled state in stored/read-back payloads and update flows | confirmed |

Important timestamp rule:

- Sleep schedules store the visible selected sleep time directly.
- Wake schedules store the fade-start time, not the visible wake completion time.

Important type-specific fixed blocks for standard payloads:

| Schedule kind | Fixed bytes at `10..22` | Meaning |
| :-- | :-- | :-- |
| sleep | `00 0e 01 01 00 02 01 01 03 02 4c 02 05 02` | standard go-to-sleep payload prefix |
| wake | `00 0e 01 01 01 02 01 fe 03 02 bf 01 05 02` | standard wake-up payload prefix |

### 2. Create A New Schedule

Create uses the full schedule-body format with a source id of `ffff`.

Generic create payload shape:

```text
01 ff ff 00 01 00 <timestamp_le> <type_specific_bytes> <fade_ds_le> <field_25_26> <uuid16> <kind_flag> ff ff ff ff <title_len> <title_ascii> 01
```

For a standard sleep schedule built from parameters:

- opcode `01`
- source id `ff ff`
- enabled bytes `00 01 00`
- timestamp = selected sleep time
- type-specific block = `00 0e 01 01 00 02 01 01 03 02 4c 02 05 02`
- fade = requested fade in deciseconds
- title field = `0x0118 + title_len`
- type flag byte = `01`
- recurrence/sentinel = `ff ff ff ff`
- final byte = `01`

For a standard wake schedule built from parameters:

- opcode `01`
- source id `ff ff`
- enabled bytes `00 01 00`
- timestamp = visible wake time minus fade duration
- type-specific block = `00 0e 01 01 01 02 01 fe 03 02 bf 01 05 02`
- fade = requested fade in deciseconds
- title field = `0x0118 + title_len`
- type flag byte = `00`
- recurrence/sentinel = `ff ff ff ff`
- final byte = `01`

Create success notifications:

```text
01 00 ff ff <new_id_le>
04 ff ff <new_id_le>
```

Create failure notification:

```text
01 01 ff ff ff ff
```

### 3. List Current Schedules

Listing schedules is a short query, not a full-body payload.

Request:

```text
00
```

Response shape:

```text
00 00 <unknown_or_status> <count> <id0_le> <id1_le> ...
```

Confirmed live example:

```text
00 00 07 02 01 00 04 00
```

Decoded meaning:

- two schedules are currently advertised
- the ids are `1` and `4`

### 4. Read Back One Schedule In Detail

Detail-read is a short request followed by a containerized schedule body.

Request format:

```text
02 <schedule_id_le> 00 00
```

Response shape:

```text
02 00 <schedule_id_le> <body_len> 00 00 00 <body...>
```

The `<body...>` bytes can be reconstructed into a normal schedule-like payload as:

```text
01 <schedule_id_le> <body...>
```

That reconstructed payload reuses the same offsets as create/update payloads, which is why read-back decoding can extract title, kind, fade, timestamp, UUID, and enabled flag directly.

### 5. Update An Existing Schedule

Update reuses the full schedule-body format from create, but changes the source id and, when toggling state, the enabled bytes.

Generic update prefix:

```text
01 <source_id_le> 00 <enabled_flag> 00
```

Rules:

- the full body must be resent, not just the changed field
- `source_id_le` is the existing schedule id to replace
- the final byte of the payload mirrors the enabled flag
- the bulb does not mutate schedules in place; it returns a replacement id

Update success notifications:

```text
01 00 <source_id_le> <new_id_le>
04 <source_id_le> <new_id_le>
```

### 6. Activate Or Deactivate A Schedule

Activate and deactivate are specialized update operations using the same full-body update format.

Deactivate:

```text
01 <source_id_le> 00 00 00 ... <final_byte=00>
```

Activate:

```text
01 <source_id_le> 00 01 00 ... <final_byte=01>
```

Confirmed live deactivate example:

```text
01 02 00 00 00 00 ...
01 00 02 00 03 00
04 02 00 03 00
```

Meaning: schedule id `2` was replaced by disabled schedule id `3`.

Confirmed live reactivate example:

```text
01 03 00 00 01 00 ...
01 00 03 00 04 00
04 03 00 04 00
```

Meaning: schedule id `3` was replaced by enabled schedule id `4`.

### 7. Delete A Schedule

Delete is a separate short command and does not use the full schedule body.

Request format:

```text
03 <schedule_id_le>
```

Success notifications:

```text
03 00 <schedule_id_le>
04 <schedule_id_le> ff ff
```

Confirmed example for deleting schedule id `5`:

```text
03 05 00
03 00 05 00
04 05 00 ff ff
```

### 8. What Is Still Not Fully Closed-Form

The following parts are still partly inferred even though the overall command format is operational:

- the exact semantics of the fixed bytes at offsets `10..22` beyond their role as kind/behavior descriptors
- the deeper meaning of the `0x0118 + title_len` field at offsets `25..26`, even though it is confirmed for the standard wake/sleep builder
- whether the sentinel `ff ff ff ff` is strictly a recurrence mask, a default-all-days marker, or another scheduler bitfield
- whether additional app-side wake or sleep styles use different type-specific fixed blocks beyond the standard variants already captured

Despite those remaining unknowns, the protocol is now operationally understood well enough to:

- create standard wake and sleep schedules from parameters
- list existing schedule ids
- read back stored schedule details
- deactivate and reactivate schedules
- delete schedules by id