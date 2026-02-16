import 'package:flutter/material.dart';
import '../../../core/constants/app_constants.dart';
import '../../../core/utils/color_utils.dart';

class ColorTempSlider extends StatelessWidget {
  final int mireds;
  final ValueChanged<int> onChanged;

  const ColorTempSlider({
    super.key,
    required this.mireds,
    required this.onChanged,
  });

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 16),
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              const Text('Color Temperature'),
              Text('${(1000000 / mireds).round()}K'),
            ],
          ),
        ),
        const SizedBox(height: 4),
        Container(
          margin: const EdgeInsets.symmetric(horizontal: 16),
          height: 24,
          decoration: BoxDecoration(
            borderRadius: BorderRadius.circular(12),
            gradient: LinearGradient(
              colors: [
                ColorUtils.miredsToColor(AppConstants.minMireds),
                ColorUtils.miredsToColor(250),
                ColorUtils.miredsToColor(AppConstants.maxMireds),
              ],
            ),
          ),
        ),
        Slider(
          value: mireds.toDouble(),
          min: AppConstants.minMireds.toDouble(),
          max: AppConstants.maxMireds.toDouble(),
          onChanged: (v) => onChanged(v.round()),
        ),
      ],
    );
  }
}
