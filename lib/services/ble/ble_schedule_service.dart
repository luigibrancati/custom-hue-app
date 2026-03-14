import 'dart:async';
import 'dart:typed_data';

import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';

import '../../core/constants/app_constants.dart';
import '../../core/constants/ble_uuids.dart';
import 'ble_connection_service.dart';
import 'ble_schedule_codec.dart';

class BleScheduleService {
  BleScheduleService(this._ble, this._connectionService);

  final FlutterReactiveBle _ble;
  final BleConnectionService _connectionService;

  QualifiedCharacteristic _scheduleChar(String deviceId) {
    return QualifiedCharacteristic(
      characteristicId: BleUuids.scheduleChar,
      serviceId: BleUuids.scheduleService,
      deviceId: deviceId,
    );
  }

  QualifiedCharacteristic _clockChar(String deviceId) {
    return QualifiedCharacteristic(
      characteristicId: BleUuids.scheduleClockChar,
      serviceId: BleUuids.deviceConfigService,
      deviceId: deviceId,
    );
  }

  Future<List<BleScheduleDetails>> readSchedules(String deviceId) async {
    await _ensureConnected(deviceId);
    final notifications = <Uint8List>[];
    final subscription = _ble
        .subscribeToCharacteristic(_scheduleChar(deviceId))
        .listen((data) => notifications.add(Uint8List.fromList(data)));

    try {
      await Future<void>.delayed(const Duration(milliseconds: 300));
      await _ble.writeCharacteristicWithResponse(
        _scheduleChar(deviceId),
        value: BleScheduleCodec.buildQueryPayload(),
      );
      await Future<void>.delayed(AppConstants.bleScheduleQueryDelay);

      final lists = notifications
          .map(BleScheduleCodec.parseScheduleListNotification)
          .whereType<List<int>>()
          .toList();
      if (lists.isEmpty) {
        return const [];
      }

      final scheduleIds = lists.last;
      final details = <BleScheduleDetails>[];
      for (final scheduleId in scheduleIds) {
        final notificationStart = notifications.length;
        await _ble.writeCharacteristicWithResponse(
          _scheduleChar(deviceId),
          value: BleScheduleCodec.buildDetailRequest(scheduleId),
        );
        await Future<void>.delayed(AppConstants.bleScheduleQueryDelay);

        final parsed = notifications
            .sublist(notificationStart)
            .map(BleScheduleCodec.parseScheduleDetailNotification)
            .whereType<({int remoteId, Uint8List payload})>()
            .toList();
        if (parsed.isEmpty) {
          continue;
        }

        final detail = parsed.last;
        details.add(
          BleScheduleCodec.decodeScheduleDetails(
            detail.remoteId,
            detail.payload,
          ),
        );
      }

      return details;
    } finally {
      await subscription.cancel();
    }
  }

  Future<BleScheduleMutationResult> createStandardSchedule(
    String deviceId, {
    required BleScheduleKind kind,
    required int scheduledForEpochSeconds,
    required int fadeDurationSeconds,
    required String title,
    required bool enabled,
    String? scheduleUuid,
    bool syncClock = false,
  }) async {
    final resolvedUuid = scheduleUuid ?? _generateUuid();
    final payload = BleScheduleCodec.buildStandardSchedulePayload(
      kind: kind,
      scheduledForEpochSeconds: scheduledForEpochSeconds,
      fadeDurationSeconds: fadeDurationSeconds,
      title: title,
      scheduleUuid: resolvedUuid,
      enabled: enabled,
    );
    return _writeSchedulePayload(
      deviceId,
      payload: payload,
      scheduleUuid: resolvedUuid,
      syncClock: syncClock,
    );
  }

  Future<BleScheduleMutationResult> updateStandardSchedule(
    String deviceId, {
    required int sourceId,
    required BleScheduleKind kind,
    required int scheduledForEpochSeconds,
    required int fadeDurationSeconds,
    required String title,
    required String scheduleUuid,
    required bool enabled,
    bool syncClock = false,
  }) async {
    final payload = BleScheduleCodec.buildStandardSchedulePayload(
      kind: kind,
      scheduledForEpochSeconds: scheduledForEpochSeconds,
      fadeDurationSeconds: fadeDurationSeconds,
      title: title,
      scheduleUuid: scheduleUuid,
      enabled: enabled,
      sourceId: sourceId,
    );
    return _writeSchedulePayload(
      deviceId,
      payload: payload,
      scheduleUuid: scheduleUuid,
      syncClock: syncClock,
    );
  }

  Future<void> deleteSchedule(String deviceId, int remoteScheduleId) async {
    await _ensureConnected(deviceId);
    final notifications = <Uint8List>[];
    final subscription = _ble
        .subscribeToCharacteristic(_scheduleChar(deviceId))
        .listen((data) => notifications.add(Uint8List.fromList(data)));

    try {
      await Future<void>.delayed(const Duration(milliseconds: 300));
      await _ble.writeCharacteristicWithResponse(
        _scheduleChar(deviceId),
        value: BleScheduleCodec.buildDeletePayload(remoteScheduleId),
      );
      await Future<void>.delayed(AppConstants.bleSchedulePostWriteWait);
      final decoded = notifications.map(BleScheduleCodec.decodeNotification).toList();
      final failure = decoded.where(
        (notification) =>
            notification.type == BleScheduleNotificationType.failure,
      );
      if (failure.isNotEmpty) {
        throw StateError(failure.first.message ?? 'Delete failed');
      }
      final accepted = decoded.where(
        (notification) =>
            notification.type == BleScheduleNotificationType.deleteAccepted ||
            notification.type == BleScheduleNotificationType.deleteCompleted,
      );
      if (accepted.isEmpty) {
        throw StateError('Bulb did not acknowledge schedule deletion');
      }
    } finally {
      await subscription.cancel();
    }
  }

  Future<BleScheduleMutationResult> _writeSchedulePayload(
    String deviceId, {
    required Uint8List payload,
    required String scheduleUuid,
    required bool syncClock,
  }) async {
    await _ensureConnected(deviceId);
    final notifications = <Uint8List>[];
    final subscription = _ble
        .subscribeToCharacteristic(_scheduleChar(deviceId))
        .listen((data) => notifications.add(Uint8List.fromList(data)));

    try {
      await Future<void>.delayed(const Duration(milliseconds: 300));
      if (syncClock) {
        await _ble.writeCharacteristicWithResponse(
          _clockChar(deviceId),
          value: BleScheduleCodec.buildClockSyncPayload(
            DateTime.now().toUtc().millisecondsSinceEpoch ~/ 1000,
          ),
        );
        await Future<void>.delayed(const Duration(milliseconds: 200));
      }

      await _ble.writeCharacteristicWithResponse(
        _scheduleChar(deviceId),
        value: payload,
      );
      await Future<void>.delayed(AppConstants.bleSchedulePostWriteWait);

      final decoded = notifications.map(BleScheduleCodec.decodeNotification).toList();
      final failure = decoded.where(
        (notification) =>
            notification.type == BleScheduleNotificationType.failure,
      );
      if (failure.isNotEmpty) {
        throw StateError(failure.first.message ?? 'Schedule write failed');
      }

      final successful = decoded.where(
        (notification) =>
            notification.type == BleScheduleNotificationType.createAccepted ||
            notification.type == BleScheduleNotificationType.updateAccepted ||
            notification.type == BleScheduleNotificationType.createCompleted ||
            notification.type == BleScheduleNotificationType.updateCompleted,
      );
      if (successful.isEmpty) {
        throw StateError('Bulb did not acknowledge the schedule write');
      }

      final remoteScheduleId = successful.last.resultId;
      if (remoteScheduleId == null) {
        throw StateError('Bulb acknowledged the write without a schedule id');
      }

      return BleScheduleMutationResult(
        remoteScheduleId: remoteScheduleId,
        scheduleUuid: scheduleUuid,
        notifications: decoded,
      );
    } finally {
      await subscription.cancel();
    }
  }

  Future<void> _ensureConnected(String deviceId) async {
    if (_connectionService.getState(deviceId) ==
        BleDeviceConnectionState.connected) {
      return;
    }

    final completer = Completer<void>();
    late final StreamSubscription<MapEntry<String, BleDeviceConnectionState>> subscription;
    subscription = _connectionService.stateUpdates.listen((entry) {
      if (entry.key != deviceId || completer.isCompleted) {
        return;
      }
      if (entry.value == BleDeviceConnectionState.connected) {
        completer.complete();
      }
      if (entry.value == BleDeviceConnectionState.disconnected) {
        completer.completeError(
          StateError('Failed to connect to bulb $deviceId'),
        );
      }
    });

    try {
      await _connectionService.connect(deviceId);
      if (_connectionService.getState(deviceId) ==
          BleDeviceConnectionState.connected) {
        return;
      }
      await completer.future.timeout(AppConstants.bleScheduleConnectTimeout);
    } finally {
      await subscription.cancel();
    }
  }

  String _generateUuid() {
    final now = DateTime.now().microsecondsSinceEpoch.toRadixString(16)
        .padLeft(32, '0')
        .substring(0, 32);
    return '${now.substring(0, 8)}-${now.substring(8, 12)}-${now.substring(12, 16)}-${now.substring(16, 20)}-${now.substring(20)}';
  }
}