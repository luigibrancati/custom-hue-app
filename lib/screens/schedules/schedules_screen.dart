import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../providers/schedule_provider.dart';
import '../../providers/room_provider.dart';
import '../../widgets/empty_state.dart';
import 'schedule_editor_screen.dart';
import 'widgets/schedule_tile.dart';

class SchedulesScreen extends StatelessWidget {
  const SchedulesScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final scheduleProvider = context.watch<ScheduleProvider>();
    final schedules = scheduleProvider.schedules;
    final allLights = context.watch<RoomProvider>().allLights;

    return SafeArea(
      child: Column(
        children: [
          Padding(
            padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
            child: Row(
              children: [
                Text('Schedules',
                    style: Theme.of(context).textTheme.headlineMedium),
                const Spacer(),
                IconButton(
                  icon: const Icon(Icons.download),
                  onPressed: scheduleProvider.isBusy
                      ? null
                      : () => scheduleProvider.importSchedules(
                          allLights.map((light) => light.id),
                        ),
                  tooltip: 'Import from bulbs',
                ),
                IconButton(
                  icon: const Icon(Icons.add),
                  onPressed: () => _createSchedule(context),
                ),
              ],
            ),
          ),
          if (scheduleProvider.lastError != null)
            Padding(
              padding: const EdgeInsets.fromLTRB(16, 0, 16, 8),
              child: Text(
                scheduleProvider.lastError!,
                style: TextStyle(color: Theme.of(context).colorScheme.error),
              ),
            ),
          Expanded(
            child: schedules.isEmpty
                ? EmptyState(
                    icon: Icons.schedule,
                    title: 'No schedules',
                    subtitle:
                        'Import or create a wake or sleep schedule stored on your bulbs',
                    action: ElevatedButton.icon(
                      onPressed: () => _createSchedule(context),
                      icon: const Icon(Icons.add),
                      label: const Text('Create schedule'),
                    ),
                  )
                : ListView.builder(
                    padding: const EdgeInsets.symmetric(horizontal: 8),
                    itemCount: schedules.length,
                    itemBuilder: (context, index) {
                      final schedule = schedules[index];
                      return ScheduleTile(
                        schedule: schedule,
                        onTap: () => Navigator.push(
                          context,
                          MaterialPageRoute(
                            builder: (_) =>
                                ScheduleEditorScreen(schedule: schedule),
                          ),
                        ),
                        onToggle: (_) =>
                            scheduleProvider.isBusy
                                ? null
                                : scheduleProvider.toggleEnabled(schedule.id),
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }

  void _createSchedule(BuildContext context) {
    final schedule = context.read<ScheduleProvider>().createNewSchedule();
    Navigator.push(
      context,
      MaterialPageRoute(
          builder: (_) => ScheduleEditorScreen(schedule: schedule)),
    );
  }
}
