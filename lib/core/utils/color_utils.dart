import 'dart:math';
import 'package:flutter/material.dart';

class ColorUtils {
  ColorUtils._();

  /// Convert Flutter Color (sRGB) to CIE 1931 xy coordinates.
  static (double x, double y) colorToCieXy(Color color) {
    double r = color.r;
    double g = color.g;
    double b = color.b;

    // Apply reverse sRGB gamma correction
    r = r > 0.04045 ? pow((r + 0.055) / 1.055, 2.4).toDouble() : r / 12.92;
    g = g > 0.04045 ? pow((g + 0.055) / 1.055, 2.4).toDouble() : g / 12.92;
    b = b > 0.04045 ? pow((b + 0.055) / 1.055, 2.4).toDouble() : b / 12.92;

    // Wide gamut D65 conversion (Hue gamut)
    final X = r * 0.664511 + g * 0.154324 + b * 0.162028;
    final Y = r * 0.283881 + g * 0.668433 + b * 0.047685;
    final Z = r * 0.000088 + g * 0.072310 + b * 0.986039;

    final sum = X + Y + Z;
    if (sum == 0) return (0.3127, 0.3290); // D65 white point

    return (X / sum, Y / sum);
  }

  /// Convert CIE xy to closest Flutter Color (approximation).
  static Color cieXyToColor(double x, double y, double brightness) {
    final z = 1.0 - x - y;
    final yy = brightness;
    final xx = (yy / y) * x;
    final zz = (yy / y) * z;

    var r = xx * 1.656492 - yy * 0.354851 - zz * 0.255038;
    var g = -xx * 0.707196 + yy * 1.655397 + zz * 0.036152;
    var b = xx * 0.051713 - yy * 0.121364 + zz * 1.011530;

    // Apply sRGB gamma
    r = r <= 0.0031308 ? 12.92 * r : (1.055 * pow(r, 1 / 2.4) - 0.055);
    g = g <= 0.0031308 ? 12.92 * g : (1.055 * pow(g, 1 / 2.4) - 0.055);
    b = b <= 0.0031308 ? 12.92 * b : (1.055 * pow(b, 1 / 2.4) - 0.055);

    return Color.from(
      alpha: 1.0,
      red: r.clamp(0, 1).toDouble(),
      green: g.clamp(0, 1).toDouble(),
      blue: b.clamp(0, 1).toDouble(),
    );
  }

  /// Encode CIE xy as bytes for BLE (16-bit each, scaled to 0xFFFF).
  static List<int> cieXyToBytes(double x, double y) {
    final xInt = (x * 65535).round().clamp(0, 65535);
    final yInt = (y * 65535).round().clamp(0, 65535);
    return [xInt & 0xFF, (xInt >> 8) & 0xFF, yInt & 0xFF, (yInt >> 8) & 0xFF];
  }

  /// Decode CIE xy from BLE bytes.
  static (double x, double y) bytesToCieXy(List<int> bytes) {
    if (bytes.length < 4) return (0.3127, 0.3290);
    final xInt = bytes[0] | (bytes[1] << 8);
    final yInt = bytes[2] | (bytes[3] << 8);
    return (xInt / 65535.0, yInt / 65535.0);
  }

  /// Convert mireds to approximate color for UI display.
  static Color miredsToColor(int mireds) {
    final kelvin = 1000000.0 / mireds;
    final temp = kelvin / 100;
    double r, g, b;

    if (temp <= 66) {
      r = 255;
      g = 99.4708025861 * log(temp) - 161.1195681661;
      b = temp <= 19
          ? 0
          : 138.5177312231 * log(temp - 10) - 305.0447927307;
    } else {
      r = 329.698727446 * pow(temp - 60, -0.1332047592);
      g = 288.1221695283 * pow(temp - 60, -0.0755148492);
      b = 255;
    }

    return Color.from(
      alpha: 1.0,
      red: (r / 255).clamp(0, 1).toDouble(),
      green: (g / 255).clamp(0, 1).toDouble(),
      blue: (b / 255).clamp(0, 1).toDouble(),
    );
  }
}
