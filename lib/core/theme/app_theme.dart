import 'package:flutter/material.dart';

class AppTheme {
  AppTheme._();

  static final darkTheme = ThemeData(
    useMaterial3: true,
    brightness: Brightness.dark,
    colorScheme: ColorScheme.fromSeed(
      seedColor: const Color(0xFF6750A4),
      brightness: Brightness.dark,
    ),
    scaffoldBackgroundColor: const Color(0xFF121212),
    cardTheme: const CardThemeData(
      elevation: 2,
      margin: EdgeInsets.symmetric(horizontal: 12, vertical: 6),
    ),
    sliderTheme: const SliderThemeData(
      activeTrackColor: Color(0xFFBB86FC),
      thumbColor: Color(0xFFBB86FC),
    ),
    floatingActionButtonTheme: const FloatingActionButtonThemeData(
      backgroundColor: Color(0xFFBB86FC),
      foregroundColor: Colors.black,
    ),
    bottomNavigationBarTheme: const BottomNavigationBarThemeData(
      backgroundColor: Color(0xFF1E1E1E),
      selectedItemColor: Color(0xFFBB86FC),
      unselectedItemColor: Colors.grey,
    ),
  );
}
