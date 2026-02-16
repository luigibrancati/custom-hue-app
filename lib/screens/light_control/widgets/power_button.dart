import 'package:flutter/material.dart';

class PowerButton extends StatelessWidget {
  final bool isOn;
  final VoidCallback onToggle;

  const PowerButton({super.key, required this.isOn, required this.onToggle});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onToggle,
      child: Container(
        width: 80,
        height: 80,
        decoration: BoxDecoration(
          shape: BoxShape.circle,
          color: isOn
              ? Theme.of(context).colorScheme.primary
              : Colors.grey[800],
          boxShadow: isOn
              ? [
                  BoxShadow(
                    color: Theme.of(context)
                        .colorScheme
                        .primary
                        .withAlpha(102),
                    blurRadius: 20,
                    spreadRadius: 2,
                  )
                ]
              : null,
        ),
        child: Icon(
          Icons.power_settings_new,
          size: 40,
          color: isOn ? Colors.white : Colors.grey,
        ),
      ),
    );
  }
}
