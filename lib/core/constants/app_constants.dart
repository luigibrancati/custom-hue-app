class AppConstants {
  AppConstants._();

  // BLE
  static const bleScanTimeout = Duration(seconds: 15);
  static const bleConnectionTimeout = Duration(seconds: 10);
  static const bleWriteThrottleMs = 80;

  // Brightness range
  static const minBrightness = 1;
  static const maxBrightness = 254;

  // Color temperature range (mireds)
  static const minMireds = 153; // ~6500K cool
  static const maxMireds = 500; // ~2000K warm

  // Fade defaults
  static const defaultFadeDuration = Duration(seconds: 30);
  static const fadeStepInterval = Duration(milliseconds: 100);

  // Preset scenes: name -> (mireds, brightness)
  static const presetScenes = {
    'Relax': (mireds: 447, brightness: 144),
    'Concentrate': (mireds: 233, brightness: 254),
    'Energize': (mireds: 156, brightness: 254),
    'Read': (mireds: 346, brightness: 240),
  };

  // Hive box names
  static const lightsBox = 'lights';
  static const roomsBox = 'rooms';
  static const scenesBox = 'scenes';
  static const schedulesBox = 'schedules';
  static const favoritesBox = 'favorites';
}
