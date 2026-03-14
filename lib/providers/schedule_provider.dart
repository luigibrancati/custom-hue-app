import 'package:flutter/foundation.dart';
import 'package:uuid/uuid.dart';
import '../models/schedule.dart';
import '../services/ble/ble_schedule_codec.dart';
import '../services/ble/ble_schedule_service.dart';
import '../services/persistence/schedule_storage.dart';

class ScheduleProvider extends ChangeNotifier {
  final ScheduleStorage _storage;
  final BleScheduleService _scheduleService;
  List<Schedule> _schedules = [];
  bool _isBusy = false;
  String? _lastError;

  ScheduleProvider(this._storage, this._scheduleService) {
    refresh();
  }

  List<Schedule> get schedules => List.unmodifiable(_schedules);
  bool get isBusy => _isBusy;
  String? get lastError => _lastError;

  void refresh() {
    final entries = _storage.getAllSchedules();
    entries.sort((a, b) =>
        a.scheduledForEpochSeconds.compareTo(b.scheduledForEpochSeconds));
    _schedules = entries;
    notifyListeners();
  }

  Future<void> createSchedule(Schedule schedule) async {
    try {
      _setBusy(true);
      _clearError();
      final synced = schedule.copyWith(
        remoteScheduleIds: {},
        remoteScheduleUuids: {},
      );

      for (final lightId in schedule.lightIds) {
        final result = await _scheduleService.createStandardSchedule(
          lightId,
          kind: _toBleKind(schedule.kind),
          scheduledForEpochSeconds: schedule.scheduledForEpochSeconds,
          fadeDurationSeconds: schedule.fadeDurationSeconds,
          title: schedule.title,
          enabled: schedule.isEnabled,
          syncClock: true,
        );
        synced.remoteScheduleIds[lightId] = result.remoteScheduleId;
        synced.remoteScheduleUuids[lightId] = result.scheduleUuid;
      }
      await _storage.saveSchedule(synced);
    } catch (e, stackTrace) {
      debugPrint('Failed to create remote schedule: $e\n$stackTrace');
      _lastError = e.toString();
      await _storage.saveSchedule(schedule);
    } finally {
      _setBusy(false);
    }
    refresh();
  }

  Future<void> updateSchedule(Schedule schedule) async {
    final existing = _storage.getSchedule(schedule.id);
    try {
      _setBusy(true);
      _clearError();

      final updated = schedule.copyWith(
        remoteScheduleIds: existing == null
            ? schedule.remoteScheduleIds
            : Map<String, int>.from(existing.remoteScheduleIds),
        remoteScheduleUuids: existing == null
            ? schedule.remoteScheduleUuids
            : Map<String, String>.from(existing.remoteScheduleUuids),
      );

      final previousLightIds = existing?.lightIds ?? const <String>[];

      for (final removedLightId
          in previousLightIds.where((id) => !schedule.lightIds.contains(id))) {
        final remoteId = existing?.remoteScheduleIds[removedLightId];
        if (remoteId != null) {
          await _scheduleService.deleteSchedule(removedLightId, remoteId);
        }
        updated.remoteScheduleIds.remove(removedLightId);
        updated.remoteScheduleUuids.remove(removedLightId);
      }

      for (final lightId in schedule.lightIds) {
        final remoteId = existing?.remoteScheduleIds[lightId];
        final remoteUuid = existing?.remoteScheduleUuids[lightId];
        if (remoteId == null || remoteUuid == null) {
          final created = await _scheduleService.createStandardSchedule(
            lightId,
            kind: _toBleKind(schedule.kind),
            scheduledForEpochSeconds: schedule.scheduledForEpochSeconds,
            fadeDurationSeconds: schedule.fadeDurationSeconds,
            title: schedule.title,
            enabled: schedule.isEnabled,
            syncClock: true,
          );
          updated.remoteScheduleIds[lightId] = created.remoteScheduleId;
          updated.remoteScheduleUuids[lightId] = created.scheduleUuid;
          continue;
        }

        final result = await _scheduleService.updateStandardSchedule(
          lightId,
          sourceId: remoteId,
          kind: _toBleKind(schedule.kind),
          scheduledForEpochSeconds: schedule.scheduledForEpochSeconds,
          fadeDurationSeconds: schedule.fadeDurationSeconds,
          title: schedule.title,
          scheduleUuid: remoteUuid,
          enabled: schedule.isEnabled,
          syncClock: true,
        );
        updated.remoteScheduleIds[lightId] = result.remoteScheduleId;
        updated.remoteScheduleUuids[lightId] = result.scheduleUuid;
      }

      await _storage.saveSchedule(updated);
    } catch (e, stackTrace) {
      debugPrint('Failed to update remote schedule: $e\n$stackTrace');
      _lastError = e.toString();
      await _storage.saveSchedule(schedule);
    } finally {
      _setBusy(false);
    }
    refresh();
  }

  Future<void> toggleEnabled(String id) async {
    final schedule = _storage.getSchedule(id);
    if (schedule != null) {
      await updateSchedule(
        schedule.copyWith(isEnabled: !schedule.isEnabled),
      );
    }
  }

  Future<void> deleteSchedule(String id) async {
    final schedule = _storage.getSchedule(id);
    if (schedule == null) {
      return;
    }

    try {
      _setBusy(true);
      _clearError();
      final remainingLightIds = <String>[];
      final remainingRemoteIds = <String, int>{};
      final remainingRemoteUuids = <String, String>{};

      for (final lightId in schedule.lightIds) {
        final remoteId = schedule.remoteScheduleIds[lightId];
        if (remoteId == null) {
          continue;
        }

        try {
          await _scheduleService.deleteSchedule(lightId, remoteId);
        } catch (e) {
          remainingLightIds.add(lightId);
          remainingRemoteIds[lightId] = remoteId;
          final uuid = schedule.remoteScheduleUuids[lightId];
          if (uuid != null) {
            remainingRemoteUuids[lightId] = uuid;
          }
          _lastError = e.toString();
        }
      }

      if (remainingLightIds.isEmpty) {
        await _storage.deleteSchedule(id);
      } else {
        await _storage.saveSchedule(
          schedule.copyWith(
            lightIds: remainingLightIds,
            remoteScheduleIds: remainingRemoteIds,
            remoteScheduleUuids: remainingRemoteUuids,
          ),
        );
      }
    } finally {
      _setBusy(false);
    }
    refresh();
  }

  Future<void> importSchedules(Iterable<String> lightIds) async {
    try {
      _setBusy(true);
      _clearError();
      final grouped = <String, Schedule>{};

      for (final lightId in lightIds) {
        final remoteSchedules = await _scheduleService.readSchedules(lightId);
        for (final remoteSchedule in remoteSchedules) {
          final key = [
            remoteSchedule.kind.name,
            remoteSchedule.scheduledForEpochSeconds,
            remoteSchedule.fadeDurationSeconds,
            remoteSchedule.enabled,
            remoteSchedule.title,
          ].join('|');

          final existing = grouped[key];
          if (existing == null) {
            grouped[key] = Schedule(
              id: const Uuid().v4(),
              name: remoteSchedule.title,
              scheduledForEpochSeconds: remoteSchedule.scheduledForEpochSeconds,
              kindIndex: _fromBleKind(remoteSchedule.kind).index,
              isEnabled: remoteSchedule.enabled,
              fadeDurationSeconds: remoteSchedule.fadeDurationSeconds,
              lightIds: [lightId],
              remoteScheduleIds: {lightId: remoteSchedule.remoteScheduleId},
              remoteScheduleUuids: {lightId: remoteSchedule.scheduleUuid},
            );
            continue;
          }

          if (!existing.lightIds.contains(lightId)) {
            existing.lightIds.add(lightId);
          }
          existing.remoteScheduleIds[lightId] = remoteSchedule.remoteScheduleId;
          existing.remoteScheduleUuids[lightId] = remoteSchedule.scheduleUuid;
        }
      }

      await _storage.replaceAll(grouped.values.toList());
    } catch (e, stackTrace) {
      debugPrint('Failed to import schedules: $e\n$stackTrace');
      _lastError = e.toString();
    } finally {
      _setBusy(false);
    }
    refresh();
  }

  Schedule createNewSchedule() {
    final scheduledFor = DateTime.now().add(const Duration(hours: 1));
    return Schedule(
      id: const Uuid().v4(),
      name: BleScheduleCodec.defaultTitleForKind(BleScheduleKind.sleep),
      scheduledForEpochSeconds:
          scheduledFor.toUtc().millisecondsSinceEpoch ~/ 1000,
      kindIndex: ScheduleKind.sleep.index,
      fadeDurationSeconds:
          BleScheduleCodec.defaultFadeForKind(BleScheduleKind.sleep),
    );
  }

  void _setBusy(bool value) {
    _isBusy = value;
    notifyListeners();
  }

  void _clearError() {
    _lastError = null;
  }

  BleScheduleKind _toBleKind(ScheduleKind kind) =>
      kind == ScheduleKind.wake ? BleScheduleKind.wake : BleScheduleKind.sleep;

  ScheduleKind _fromBleKind(BleScheduleKind kind) =>
      kind == BleScheduleKind.wake ? ScheduleKind.wake : ScheduleKind.sleep;
}
