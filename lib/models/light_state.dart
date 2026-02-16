import 'package:flutter/material.dart';

class LightState {
  final bool isOn;
  final int brightness; // 1-254
  final double colorX;
  final double colorY;
  final int? colorTempMireds; // 153-500
  final Color displayColor;

  const LightState({
    this.isOn = false,
    this.brightness = 127,
    this.colorX = 0.3127,
    this.colorY = 0.3290,
    this.colorTempMireds,
    this.displayColor = Colors.white,
  });

  LightState copyWith({
    bool? isOn,
    int? brightness,
    double? colorX,
    double? colorY,
    int? colorTempMireds,
    Color? displayColor,
  }) {
    return LightState(
      isOn: isOn ?? this.isOn,
      brightness: brightness ?? this.brightness,
      colorX: colorX ?? this.colorX,
      colorY: colorY ?? this.colorY,
      colorTempMireds: colorTempMireds ?? this.colorTempMireds,
      displayColor: displayColor ?? this.displayColor,
    );
  }
}
