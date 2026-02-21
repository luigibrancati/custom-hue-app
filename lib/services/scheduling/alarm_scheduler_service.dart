import 'package:android_alarm_manager_plus/android_alarm_manager_plus.dart';
import '../../models/schedule.dart';
import 'alarm_callback_dispatcher.dart';
import 'package:flutter/widgets.dart';

class AlarmSchedulerService {
  static Future<void> init() async {
    await AndroidAlarmManager.initialize();
  }

  Future<void> scheduleAlarm(Schedule schedule) async {
    debugPrint('Scheduling alarm for schedule: ${schedule.id}, day of week: ${schedule.daysOfWeek}, time: ${schedule.hour}:${schedule.minute.toString().padLeft(2, '0')}');
    if (!schedule.isEnabled) {
      debugPrint('Schedule is disabled, skipping alarm setup.');
      return;
    }

    // Cancel existing alarms for this schedule
    await cancelAlarm(schedule);

    if (schedule.daysOfWeek.isEmpty) {
      // No days specified: fire once today only
      final now = DateTime.now();
      final todayOccurrence = DateTime(now.year, now.month, now.day, schedule.hour, schedule.minute);
      await AndroidAlarmManager.oneShotAt(
        todayOccurrence,
        _alarmId(schedule.id, 0),
        alarmCallback,
        exact: true,
        wakeup: true,
        allowWhileIdle: true,
      );
      return;
    }

    // Schedule for each day of the week
    for (final day in schedule.daysOfWeek) {
      final alarmId = _alarmId(schedule.id, day);
      final nextOccurrence = _nextOccurrence(schedule.hour, schedule.minute, day);

      await AndroidAlarmManager.oneShotAt(
        nextOccurrence,
        alarmId,
        alarmCallback,
        exact: true,
        wakeup: true,
        allowWhileIdle: true,
        rescheduleOnReboot: true,
      );
    }
  }

  Future<void> cancelAlarm(Schedule schedule) async {
    for (var day = 0; day <= 7; day++) {
      await AndroidAlarmManager.cancel(_alarmId(schedule.id, day));
    }
  }

  static int _alarmId(String scheduleId, int day) {
    // Constrain to stay within Java int32 range (max 2,147,483,647).
    // Without the modulo, hashCode * 10 can exceed 2^31-1 on 64-bit Dart,
    // causing truncation/overflow when passed to Android's AlarmManager.
    return (scheduleId.hashCode.abs() % 100000000) * 10 + day;
  }

  static DateTime _nextOccurrence(int hour, int minute, int dayOfWeek) {
    final now = DateTime.now();
    var date = DateTime(now.year, now.month, now.day, hour, minute);

    // Dart: Monday=1, Sunday=7 (same as our model)
    final currentDay = now.weekday;
    var daysUntil = dayOfWeek - currentDay;
    if (daysUntil < 0 || (daysUntil == 0 && date.isBefore(now))) {
      daysUntil += 7;
    }

    return date.add(Duration(days: daysUntil));
  }
}
