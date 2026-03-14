import '../../models/schedule.dart';
import 'hive_service.dart';

class ScheduleStorage {
  List<Schedule> getAllSchedules() => HiveService.schedulesBox.values.toList();

  Schedule? getSchedule(String id) => HiveService.schedulesBox.get(id);

  Future<void> saveSchedule(Schedule schedule) async {
    await HiveService.schedulesBox.put(schedule.id, schedule);
  }

  Future<void> replaceAll(List<Schedule> schedules) async {
    await HiveService.schedulesBox.clear();
    await HiveService.schedulesBox.putAll({
      for (final schedule in schedules) schedule.id: schedule,
    });
  }

  Future<void> deleteSchedule(String id) async {
    await HiveService.schedulesBox.delete(id);
  }
}
