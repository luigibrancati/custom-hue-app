import 'package:flutter/material.dart';
import '../../../models/schedule.dart';

class WeeklyGrid extends StatelessWidget {
  final List<Schedule> schedules;

  const WeeklyGrid({super.key, required this.schedules});

  static const _dayLabels = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'];

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      scrollDirection: Axis.horizontal,
      child: SizedBox(
        width: 24 * 40.0 + 60,
        child: Column(
          children: [
            // Hour header
            Row(
              children: [
                const SizedBox(width: 60),
                ...List.generate(
                  24,
                  (h) => SizedBox(
                    width: 40,
                    child: Center(
                      child: Text(
                        '$h',
                        style: Theme.of(context).textTheme.labelSmall,
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const Divider(height: 1),
            // Day rows
            ...List.generate(7, (dayIndex) {
              final day = dayIndex + 1;
              return Row(
                children: [
                  SizedBox(
                    width: 60,
                    child: Padding(
                      padding: const EdgeInsets.all(4),
                      child: Text(_dayLabels[dayIndex]),
                    ),
                  ),
                  ...List.generate(24, (hour) {
                    final hasSchedule = schedules.any(
                      (s) =>
                          s.isEnabled &&
                          s.daysOfWeek.contains(day) &&
                          s.hour == hour,
                    );
                    return Container(
                      width: 40,
                      height: 32,
                      decoration: BoxDecoration(
                        color: hasSchedule
                            ? Theme.of(context)
                                .colorScheme
                                .primary
                                .withAlpha(153)
                            : Colors.transparent,
                        border: Border.all(
                            color: Colors.grey.withAlpha(51), width: 0.5),
                      ),
                    );
                  }),
                ],
              );
            }),
          ],
        ),
      ),
    );
  }
}
