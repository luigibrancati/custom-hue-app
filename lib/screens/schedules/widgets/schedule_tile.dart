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

  @override
  Widget build(BuildContext context) {
    final scheduledFor = schedule.scheduledForLocal;
    final dateLabel = MaterialLocalizations.of(context).formatMediumDate(scheduledFor);
    final timeLabel = TimeOfDay.fromDateTime(scheduledFor).format(context);
    final syncLabel = schedule.isSynced
        ? '${schedule.lightIds.length} bulb${schedule.lightIds.length == 1 ? '' : 's'}'
        : '${schedule.pendingLightCount} pending';

    return Card(
      child: ListTile(
        onTap: onTap,
        leading: Icon(
          schedule.isWake ? Icons.wb_sunny : Icons.nightlight,
          color: schedule.isEnabled ? Colors.amber : Colors.grey,
        ),
        title: Text(schedule.title),
        subtitle: Text('$dateLabel  $timeLabel  $syncLabel'),
        trailing: Switch(
          value: schedule.isEnabled,
          onChanged: onToggle,
        ),
      ),
    );
  }
}
