import 'package:flutter/material.dart';
import '../../../models/room.dart';

class RoomTabBar extends StatelessWidget {
  final List<Room> rooms;
  final int selectedIndex;
  final ValueChanged<int> onSelected;

  const RoomTabBar({
    super.key,
    required this.rooms,
    required this.selectedIndex,
    required this.onSelected,
  });

  @override
  Widget build(BuildContext context) {
    final tabs = ['All', ...rooms.map((r) => r.name)];

    return SizedBox(
      height: 40,
      child: ListView.builder(
        scrollDirection: Axis.horizontal,
        padding: const EdgeInsets.symmetric(horizontal: 8),
        itemCount: tabs.length,
        itemBuilder: (context, index) {
          final isSelected = index == selectedIndex;
          return Padding(
            padding: const EdgeInsets.symmetric(horizontal: 4),
            child: ChoiceChip(
              label: Text(tabs[index]),
              selected: isSelected,
              onSelected: (_) => onSelected(index),
            ),
          );
        },
      ),
    );
  }
}
