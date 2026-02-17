# Custom Hue

A Flutter app for controlling Philips Hue lights over Bluetooth Low Energy (BLE). Communicates directly with lights, bypassing the Hue Bridge entirely.

## Features

- **BLE scanning & pairing** — discover and pair with nearby Hue lights
- **Light control** — on/off, brightness, color temperature, and full color via CIE xy color wheel
- **Rooms** — organize lights into rooms with grouped controls
- **Scenes** — save and recall lighting presets with preset templates
- **Schedules** — schedule light actions with weekly recurrence and gradual fade transitions
- **Favorites** — quick-access favorite colors

**Note**: since I only own a white light, I wasn't able to thoroughly test the color functionalities. Any help is welcome.

## Requirements

- Flutter SDK (Dart `^3.11.0`)
- Android device with BLE support

## Getting Started

```bash
# Install dependencies
flutter pub get

# Generate Hive type adapters
dart run build_runner build --delete-conflicting-outputs

# Run the app
flutter run
```

## Architecture

```
lib/
├── core/           # Constants, theme, utilities
├── models/         # Data classes with Hive annotations
├── providers/      # ChangeNotifier state management
├── services/
│   ├── ble/        # BLE scanning, connection, pairing, TLV command encoding
│   ├── persistence/# Hive local storage
│   └── scheduling/ # Alarm scheduling and fade transitions
├── screens/        # UI screens with per-screen widgets/ subdirectories
└── widgets/        # Shared UI components
```

**State management:** Provider pattern with `ChangeNotifierProvider`, wired up via `MultiProvider` in `main.dart`.

**BLE protocol:** Commands use a custom Type-Length-Value binary encoding. Tags encode on/off, brightness, color temperature (mireds), and CIE xy color, all written to a single combined control characteristic.

**Persistence:** Hive for local storage with generated type adapters (`build_runner`). Boxes: lights, rooms, scenes, schedules, favorites.

## Common Commands

| Command | Description |
|---------|-------------|
| `flutter run` | Run the app |
| `flutter analyze` | Static analysis |
| `flutter test` | Run tests |
| `dart run build_runner build --delete-conflicting-outputs` | Regenerate Hive adapters |


## Contribute

This is a small app for my personal use, I only own a Philips Hue white lightbulb, so functionalities like colors and more complex scenes haven't been thoroughly tested.

If you want to contribute, open a branch and merge with a PR.