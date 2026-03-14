import 'dart:typed_data';

enum BleScheduleKind { wake, sleep }

enum BleScheduleNotificationType {
  createAccepted,
  updateAccepted,
  deleteAccepted,
  createCompleted,
  updateCompleted,
  deleteCompleted,
  failure,
  unknown,
}

class BleScheduleNotification {
  const BleScheduleNotification({
    required this.type,
    this.sourceId,
    this.resultId,
    this.message,
  });

  final BleScheduleNotificationType type;
  final int? sourceId;
  final int? resultId;
  final String? message;
}

class BleScheduleDetails {
  const BleScheduleDetails({
    required this.remoteScheduleId,
    required this.title,
    required this.kind,
    required this.enabled,
    required this.fadeDurationSeconds,
    required this.payloadTimestamp,
    required this.scheduledForEpochSeconds,
    required this.scheduleUuid,
    required this.payload,
  });

  final int remoteScheduleId;
  final String title;
  final BleScheduleKind kind;
  final bool enabled;
  final int fadeDurationSeconds;
  final int payloadTimestamp;
  final int scheduledForEpochSeconds;
  final String scheduleUuid;
  final Uint8List payload;
}

class BleScheduleMutationResult {
  const BleScheduleMutationResult({
    required this.remoteScheduleId,
    required this.scheduleUuid,
    required this.notifications,
  });

  final int remoteScheduleId;
  final String scheduleUuid;
  final List<BleScheduleNotification> notifications;
}

class BleScheduleCodec {
  BleScheduleCodec._();

  static const int createSourceId = 0xFFFF;
  static const int titleFieldBase = 0x0118;
  static const int timestampOffset = 6;
  static const int uuidOffset = 28;
  static const int uuidLength = 16;
  static const int scheduleKindOffset = 14;
  static const int fadeDurationOffset = 24;
  static const int sourceIdOffset = 1;
  static const int enabledHeaderOffset = 4;
  static const int enabledByteOffset = -1;
  static const int titleLengthOffset = 49;
  static const int titleOffset = 50;

  static final Uint8List sleepTemplatePrefix =
      Uint8List.fromList(const <int>[
    0x00,
    0x0e,
    0x01,
    0x01,
    0x00,
    0x02,
    0x01,
    0x01,
    0x03,
    0x02,
    0x4c,
    0x02,
    0x05,
    0x02,
  ]);
  static final Uint8List wakeTemplatePrefix =
      Uint8List.fromList(const <int>[
    0x00,
    0x0e,
    0x01,
    0x01,
    0x01,
    0x02,
    0x01,
    0xfe,
    0x03,
    0x02,
    0xbf,
    0x01,
    0x05,
    0x02,
  ]);
  static final Uint8List recurrenceSentinel =
      Uint8List.fromList(const <int>[0xff, 0xff, 0xff, 0xff]);

  static String defaultTitleForKind(BleScheduleKind kind) =>
      kind == BleScheduleKind.wake ? 'Wake up' : 'Go to sleep';

  static int defaultFadeForKind(BleScheduleKind kind) =>
      kind == BleScheduleKind.wake ? 600 : 1800;

  static int resolveScheduleTimestamp(
    BleScheduleKind kind,
    int scheduledForEpochSeconds,
    int fadeSeconds,
  ) {
    return kind == BleScheduleKind.wake
        ? scheduledForEpochSeconds - fadeSeconds
        : scheduledForEpochSeconds;
  }

  static Uint8List buildStandardSchedulePayload({
    required BleScheduleKind kind,
    required int scheduledForEpochSeconds,
    required int fadeDurationSeconds,
    required String title,
    required String scheduleUuid,
    int sourceId = createSourceId,
    bool enabled = true,
    bool sleepLightsOff = true,
  }) {
    if (fadeDurationSeconds < 0) {
      throw ArgumentError.value(
        fadeDurationSeconds,
        'fadeDurationSeconds',
        'Fade duration must be zero or positive',
      );
    }
    if (fadeDurationSeconds > 0xFFFF ~/ 10) {
      throw ArgumentError.value(
        fadeDurationSeconds,
        'fadeDurationSeconds',
        'Fade duration is too large for the payload field',
      );
    }

    final titleBytes = _encodeTitle(title);
    if (titleBytes.length > 0xFF) {
      throw ArgumentError.value(title, 'title', 'Schedule title is too long');
    }

    final payload = BytesBuilder();
    payload.addByte(0x01);
    payload.add(_uint16Le(sourceId));
    payload.addByte(0x00);
    payload.addByte(enabled ? 0x01 : 0x00);
    payload.addByte(0x00);
    payload.add(_uint32Le(
      resolveScheduleTimestamp(kind, scheduledForEpochSeconds, fadeDurationSeconds),
    ));
    payload.add(kind == BleScheduleKind.wake
        ? wakeTemplatePrefix
        : sleepTemplatePrefix);
    payload.add(_uint16Le(fadeDurationSeconds * 10));
    payload.add(_uint16Le(titleFieldBase + titleBytes.length));
    payload.add(_uuidBytes(scheduleUuid));
    payload.addByte(kind == BleScheduleKind.wake
        ? 0x00
        : (sleepLightsOff ? 0x01 : 0x00));
    payload.add(recurrenceSentinel);
    payload.addByte(titleBytes.length);
    payload.add(titleBytes);
    payload.addByte(enabled ? 0x01 : 0x00);
    return payload.toBytes();
  }

  static Uint8List buildDeletePayload(int scheduleId) {
    return Uint8List.fromList(<int>[0x03, ..._uint16Le(scheduleId)]);
  }

  static Uint8List buildQueryPayload() => Uint8List.fromList(const <int>[0x00]);

  static Uint8List buildDetailRequest(int scheduleId) {
    return Uint8List.fromList(<int>[0x02, ..._uint16Le(scheduleId), 0x00, 0x00]);
  }

  static Uint8List buildClockSyncPayload(int timestamp) => _uint32Le(timestamp);

  static BleScheduleKind inferScheduleKind(Uint8List payload) {
    final marker = payload[scheduleKindOffset];
    if (marker == 0x01) {
      return BleScheduleKind.wake;
    }
    if (marker == 0x00) {
      return BleScheduleKind.sleep;
    }
    throw StateError(
      'Unsupported schedule kind marker at offset $scheduleKindOffset: 0x${marker.toRadixString(16).padLeft(2, '0')}',
    );
  }

  static int extractFadeDurationSeconds(Uint8List payload) {
    return _readUint16Le(payload, fadeDurationOffset) ~/ 10;
  }

  static int extractPayloadTimestamp(Uint8List payload) {
    return _readUint32Le(payload, timestampOffset);
  }

  static int resolveScheduledForTimestamp(Uint8List payload) {
    final payloadTimestamp = extractPayloadTimestamp(payload);
    if (inferScheduleKind(payload) == BleScheduleKind.wake) {
      return payloadTimestamp + extractFadeDurationSeconds(payload);
    }
    return payloadTimestamp;
  }

  static String extractScheduleTitle(Uint8List payload) {
    if (payload.length <= titleLengthOffset) {
      return '';
    }
    final titleLength = payload[titleLengthOffset];
    final titleBytes = payload.sublist(titleOffset, titleOffset + titleLength);
    return String.fromCharCodes(titleBytes);
  }

  static String extractScheduleUuid(Uint8List payload) {
    final uuidBytes = payload.sublist(uuidOffset, uuidOffset + uuidLength);
    final hex = uuidBytes.map((byte) => byte.toRadixString(16).padLeft(2, '0')).join();
    return '${hex.substring(0, 8)}-${hex.substring(8, 12)}-${hex.substring(12, 16)}-${hex.substring(16, 20)}-${hex.substring(20)}';
  }

  static int extractSourceId(Uint8List payload) {
    return _readUint16Le(payload, sourceIdOffset);
  }

  static Uint8List patchPayload(
    Uint8List template, {
    int? payloadTimestamp,
    String? scheduleUuid,
    int? sourceId,
    bool? enabled,
  }) {
    final patched = Uint8List.fromList(template);
    if (sourceId != null) {
      _writeUint16Le(patched, sourceIdOffset, sourceId);
    }
    if (enabled != null) {
      patched[3] = 0x00;
      patched[enabledHeaderOffset] = enabled ? 0x01 : 0x00;
      patched[5] = 0x00;
      patched[patched.length + enabledByteOffset] = enabled ? 0x01 : 0x00;
    }
    if (payloadTimestamp != null) {
      patched.setRange(
        timestampOffset,
        timestampOffset + 4,
        _uint32Le(payloadTimestamp),
      );
    }
    if (scheduleUuid != null) {
      patched.setRange(uuidOffset, uuidOffset + uuidLength, _uuidBytes(scheduleUuid));
    }
    return patched;
  }

  static List<int>? parseScheduleListNotification(Uint8List data) {
    if (data.length < 4 || data[0] != 0x00 || data[1] != 0x00) {
      return null;
    }
    final count = data[3];
    final idsData = data.sublist(4);
    if (idsData.length < count * 2) {
      return null;
    }

    return [
      for (var offset = 0; offset < count * 2; offset += 2)
        _readUint16Le(idsData, offset),
    ];
  }

  static ({int remoteId, Uint8List payload})? parseScheduleDetailNotification(
    Uint8List data,
  ) {
    if (data.length < 8 || data[0] != 0x02 || data[1] != 0x00) {
      return null;
    }

    final scheduleId = _readUint16Le(data, 2);
    final bodyLength = data[4];
    final body = data.sublist(8, 8 + bodyLength);
    if (body.length != bodyLength) {
      return null;
    }

    return (
      remoteId: scheduleId,
      payload: Uint8List.fromList(<int>[0x01, ..._uint16Le(scheduleId), ...body]),
    );
  }

  static BleScheduleDetails decodeScheduleDetails(int remoteId, Uint8List payload) {
    final kind = inferScheduleKind(payload);
    final fadeDurationSeconds = extractFadeDurationSeconds(payload);
    final payloadTimestamp = extractPayloadTimestamp(payload);
    return BleScheduleDetails(
      remoteScheduleId: remoteId,
      title: extractScheduleTitle(payload),
      kind: kind,
      enabled: payload[payload.length - 1] == 0x01,
      fadeDurationSeconds: fadeDurationSeconds,
      payloadTimestamp: payloadTimestamp,
      scheduledForEpochSeconds: resolveScheduledForTimestamp(payload),
      scheduleUuid: extractScheduleUuid(payload),
      payload: payload,
    );
  }

  static BleScheduleNotification decodeNotification(Uint8List data) {
    if (data.length >= 6 &&
        data[0] == 0x01 &&
        data[1] == 0x01 &&
        data[2] == 0xff &&
        data[3] == 0xff &&
        data[4] == 0xff &&
        data[5] == 0xff) {
      return const BleScheduleNotification(
        type: BleScheduleNotificationType.failure,
        message:
            'Schedule operation failed: bulb rejected the request at the application layer',
      );
    }

    if (data.length == 6 && data[0] == 0x01 && data[1] == 0x00) {
      final sourceId = _readUint16Le(data, 2);
      final resultId = _readUint16Le(data, 4);
      if (sourceId == createSourceId) {
        return BleScheduleNotification(
          type: BleScheduleNotificationType.createAccepted,
          sourceId: sourceId,
          resultId: resultId,
          message: 'Create accepted: assigned schedule id $resultId',
        );
      }
      return BleScheduleNotification(
        type: BleScheduleNotificationType.updateAccepted,
        sourceId: sourceId,
        resultId: resultId,
        message: 'Update accepted: source id $sourceId replaced by schedule id $resultId',
      );
    }

    if (data.length == 4 && data[0] == 0x03 && data[1] == 0x00) {
      final deletedId = _readUint16Le(data, 2);
      return BleScheduleNotification(
        type: BleScheduleNotificationType.deleteAccepted,
        resultId: deletedId,
        message: 'Delete accepted: schedule id $deletedId removed',
      );
    }

    if (data.length == 5 && data[0] == 0x04) {
      final sourceId = _readUint16Le(data, 1);
      final resultId = _readUint16Le(data, 3);
      if (sourceId == createSourceId) {
        return BleScheduleNotification(
          type: BleScheduleNotificationType.createCompleted,
          sourceId: sourceId,
          resultId: resultId,
          message: 'Create completed: new schedule id $resultId',
        );
      }
      if (resultId == createSourceId) {
        return BleScheduleNotification(
          type: BleScheduleNotificationType.deleteCompleted,
          sourceId: sourceId,
          resultId: resultId,
          message: 'Delete completed: removed schedule id $sourceId',
        );
      }
      return BleScheduleNotification(
        type: BleScheduleNotificationType.updateCompleted,
        sourceId: sourceId,
        resultId: resultId,
        message: 'Update completed: source id $sourceId replaced by schedule id $resultId',
      );
    }

    return const BleScheduleNotification(
      type: BleScheduleNotificationType.unknown,
    );
  }

  static Uint8List _encodeTitle(String title) {
    final runes = title.runes;
    if (runes.any((rune) => rune > 0x7f)) {
      throw ArgumentError.value(
        title,
        'title',
        'Schedule titles must be ASCII for the current payload format',
      );
    }
    return Uint8List.fromList(title.codeUnits);
  }

  static Uint8List _uuidBytes(String value) {
    final normalized = value.replaceAll('-', '');
    if (normalized.length != 32) {
      throw ArgumentError.value(value, 'scheduleUuid', 'Invalid UUID length');
    }
    return Uint8List.fromList([
      for (var i = 0; i < normalized.length; i += 2)
        int.parse(normalized.substring(i, i + 2), radix: 16),
    ]);
  }

  static Uint8List _uint16Le(int value) {
    final bytes = ByteData(2)..setUint16(0, value, Endian.little);
    return bytes.buffer.asUint8List();
  }

  static Uint8List _uint32Le(int value) {
    final bytes = ByteData(4)..setUint32(0, value, Endian.little);
    return bytes.buffer.asUint8List();
  }

  static int _readUint16Le(List<int> data, int offset) {
    final byteData = ByteData.sublistView(Uint8List.fromList(data));
    return byteData.getUint16(offset, Endian.little);
  }

  static int _readUint32Le(List<int> data, int offset) {
    final byteData = ByteData.sublistView(Uint8List.fromList(data));
    return byteData.getUint32(offset, Endian.little);
  }

  static void _writeUint16Le(Uint8List data, int offset, int value) {
    ByteData.sublistView(data).setUint16(offset, value, Endian.little);
  }
}