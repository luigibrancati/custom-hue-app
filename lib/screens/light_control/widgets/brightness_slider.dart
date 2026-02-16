import 'package:flutter/material.dart';

class BrightnessSlider extends StatelessWidget {
  final int brightness;
  final ValueChanged<int> onChanged;

  const BrightnessSlider({
    super.key,
    required this.brightness,
    required this.onChanged,
  });

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Row(
          children: [
            const Icon(Icons.brightness_low, size: 20),
            Expanded(
              child: Slider(
                value: brightness.toDouble(),
                min: 1,
                max: 254,
                onChanged: (v) => onChanged(v.round()),
              ),
            ),
            const Icon(Icons.brightness_high, size: 20),
          ],
        ),
        Center(
          child: Text(
            '${(brightness / 254 * 100).round()}%',
            style: Theme.of(context).textTheme.bodySmall,
          ),
        ),
      ],
    );
  }
}
