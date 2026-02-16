import 'package:flutter/material.dart';
import '../../../models/schedule.dart';

class ScheduleTile extends StatelessWidget {
  final Schedule schedule;
  final VoidCallback onTap;
  final ValueChanged<bool> onToggle;

  const ScheduleTile({
    super.key,
    required this.schedule,
    required this.onTap,
    required this.onToggle,
  });

  static const _dayNames = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'];

  @override
  Widget build(BuildContext context) {
    final timeStr =
        '${schedule.hour.toString().padLeft(2, '0')}:${schedule.minute.toString().padLeft(2, '0')}';
    final daysStr = schedule.daysOfWeek.isEmpty
        ? 'No days selected'
        : schedule.daysOfWeek.map((d) => _dayNames[d - 1]).join(', ');

    return Card(
      child: ListTile(
        onTap: onTap,
        leading: Icon(
          schedule.turnOn ? Icons.wb_sunny : Icons.nightlight,
          color: schedule.isEnabled ? Colors.amber : Colors.grey,
        ),
        title: Text(schedule.name),
        subtitle: Text('$timeStr  $daysStr'),
        trailing: Switch(
          value: schedule.isEnabled,
          onChanged: onToggle,
        ),
      ),
    );
  }
}
