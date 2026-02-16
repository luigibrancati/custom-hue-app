import 'package:flutter/foundation.dart';
import 'package:uuid/uuid.dart';
import '../models/schedule.dart';
import '../services/persistence/schedule_storage.dart';
import '../services/scheduling/alarm_scheduler_service.dart';

class ScheduleProvider extends ChangeNotifier {
  final ScheduleStorage _storage;
  final AlarmSchedulerService _alarmService;
  List<Schedule> _schedules = [];

  ScheduleProvider(this._storage, this._alarmService) {
    refresh();
  }

  List<Schedule> get schedules => _schedules;
  List<Schedule> get enabledSchedules =>
      _schedules.where((s) => s.isEnabled).toList();

  void refresh() {
    _schedules = _storage.getAllSchedules();
    notifyListeners();
  }

  Future<void> createSchedule(Schedule schedule) async {
    await _storage.saveSchedule(schedule);
    if (schedule.isEnabled) {
      await _alarmService.scheduleAlarm(schedule);
    }
    refresh();
  }

  Future<void> updateSchedule(Schedule schedule) async {
    await _storage.saveSchedule(schedule);
    if (schedule.isEnabled) {
      await _alarmService.scheduleAlarm(schedule);
    } else {
      await _alarmService.cancelAlarm(schedule);
    }
    refresh();
  }

  Future<void> toggleEnabled(String id) async {
    final schedule = _storage.getSchedule(id);
    if (schedule != null) {
      schedule.isEnabled = !schedule.isEnabled;
      await schedule.save();
      if (schedule.isEnabled) {
        await _alarmService.scheduleAlarm(schedule);
      } else {
        await _alarmService.cancelAlarm(schedule);
      }
      refresh();
    }
  }

  Future<void> deleteSchedule(String id) async {
    final schedule = _storage.getSchedule(id);
    if (schedule != null) {
      await _alarmService.cancelAlarm(schedule);
    }
    await _storage.deleteSchedule(id);
    refresh();
  }

  Schedule createNewSchedule() {
    return Schedule(
      id: const Uuid().v4(),
      name: 'New Schedule',
      hour: 8,
      minute: 0,
    );
  }
}
