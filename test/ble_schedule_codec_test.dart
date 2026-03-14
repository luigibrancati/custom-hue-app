import 'dart:typed_data';

import 'package:flutter_test/flutter_test.dart';
import 'package:custom_hue/services/ble/ble_schedule_codec.dart';

void main() {
  group('BleScheduleCodec', () {
    test('builds a standard sleep payload with expected decoded fields', () {
      final payload = BleScheduleCodec.buildStandardSchedulePayload(
        kind: BleScheduleKind.sleep,
        scheduledForEpochSeconds: 1741903200,
        fadeDurationSeconds: 1800,
        title: 'Go to sleep',
        scheduleUuid: '58bebec8-3e7e-486b-8800-34fe855d0cb6',
      );

      expect(BleScheduleCodec.inferScheduleKind(payload), BleScheduleKind.sleep);
      expect(BleScheduleCodec.extractFadeDurationSeconds(payload), 1800);
      expect(BleScheduleCodec.extractScheduleTitle(payload), 'Go to sleep');
      expect(
        BleScheduleCodec.extractScheduleUuid(payload),
        '58bebec8-3e7e-486b-8800-34fe855d0cb6',
      );
      expect(BleScheduleCodec.resolveScheduledForTimestamp(payload), 1741903200);
    });

    test('wake schedules store fade-start timestamp in the payload', () {
      final payload = BleScheduleCodec.buildStandardSchedulePayload(
        kind: BleScheduleKind.wake,
        scheduledForEpochSeconds: 1741928400,
        fadeDurationSeconds: 600,
        title: 'Wake up',
        scheduleUuid: '1ccfe8ac-2edf-4764-863a-128aafc51762',
      );

      expect(BleScheduleCodec.extractPayloadTimestamp(payload), 1741927800);
      expect(BleScheduleCodec.resolveScheduledForTimestamp(payload), 1741928400);
    });

    test('parses list and detail notifications', () {
      final listNotification = Uint8List.fromList(
        const <int>[0x00, 0x00, 0x08, 0x02, 0x03, 0x00, 0x05, 0x00],
      );

      expect(BleScheduleCodec.parseScheduleListNotification(listNotification), [3, 5]);

      final payload = _hex(
        '01ffff000100607c9b69000e01010002010103024c0205025046230158bebec83e7e486b880034fe855d0cb601ffffffff0b476f20746f20736c65657001',
      );
      final detailNotification = Uint8List.fromList(<int>[
        0x02,
        0x00,
        0x03,
        0x00,
        payload.length - 3,
        0x00,
        0x00,
        0x00,
        ...payload.sublist(3),
      ]);

      final parsed = BleScheduleCodec.parseScheduleDetailNotification(detailNotification);
      expect(parsed, isNotNull);
      expect(parsed!.remoteId, 3);
      final details = BleScheduleCodec.decodeScheduleDetails(parsed.remoteId, parsed.payload);
      expect(details.remoteScheduleId, 3);
      expect(details.kind, BleScheduleKind.sleep);
      expect(details.title, 'Go to sleep');
      expect(details.fadeDurationSeconds, 1800);
    });

    test('decodes known notification patterns', () {
      final create = BleScheduleCodec.decodeNotification(
        Uint8List.fromList(const <int>[0x01, 0x00, 0xff, 0xff, 0x04, 0x00]),
      );
      expect(create.type, BleScheduleNotificationType.createAccepted);
      expect(create.resultId, 4);

      final update = BleScheduleCodec.decodeNotification(
        Uint8List.fromList(const <int>[0x01, 0x00, 0x05, 0x00, 0x06, 0x00]),
      );
      expect(update.type, BleScheduleNotificationType.updateAccepted);
      expect(update.sourceId, 5);
      expect(update.resultId, 6);

      final failure = BleScheduleCodec.decodeNotification(
        Uint8List.fromList(const <int>[0x01, 0x01, 0xff, 0xff, 0xff, 0xff]),
      );
      expect(failure.type, BleScheduleNotificationType.failure);
    });
  });
}

Uint8List _hex(String hex) {
  final normalized = hex.replaceAll(' ', '');
  return Uint8List.fromList([
    for (var i = 0; i < normalized.length; i += 2)
      int.parse(normalized.substring(i, i + 2), radix: 16),
  ]);
}