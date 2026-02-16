import 'package:flutter/material.dart';
import 'package:flutter_colorpicker/flutter_colorpicker.dart';

class ColorWheelPicker extends StatelessWidget {
  final Color currentColor;
  final ValueChanged<Color> onColorChanged;

  const ColorWheelPicker({
    super.key,
    required this.currentColor,
    required this.onColorChanged,
  });

  @override
  Widget build(BuildContext context) {
    return ColorPicker(
      pickerColor: currentColor,
      onColorChanged: onColorChanged,
      colorPickerWidth: 280,
      pickerAreaHeightPercent: 0.7,
      enableAlpha: false,
      displayThumbColor: true,
      paletteType: PaletteType.hueWheel,
      labelTypes: const [],
      pickerAreaBorderRadius: const BorderRadius.all(Radius.circular(10)),
    );
  }
}
