import 'package:flutter/material.dart';

class DaySelector extends StatelessWidget {
  final List<int> selectedDays;
  final ValueChanged<List<int>> onChanged;

  const DaySelector({
    super.key,
    required this.selectedDays,
    required this.onChanged,
  });

  static const _dayLabels = [
    (1, 'Mon'),
    (2, 'Tue'),
    (3, 'Wed'),
    (4, 'Thu'),
    (5, 'Fri'),
    (6, 'Sat'),
    (7, 'Sun'),
  ];

  @override
  Widget build(BuildContext context) {
    return Wrap(
      spacing: 8,
      children: _dayLabels.map((entry) {
        final (day, label) = entry;
        final isSelected = selectedDays.contains(day);
        return FilterChip(
          label: Text(label),
          selected: isSelected,
          onSelected: (selected) {
            final newDays = List<int>.from(selectedDays);
            if (selected) {
              newDays.add(day);
            } else {
              newDays.remove(day);
            }
            newDays.sort();
            onChanged(newDays);
          },
        );
      }).toList(),
    );
  }
}
