import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';

class BleUuids {
  BleUuids._();

  // Light Control Service
  static final lightControlService =
      Uuid.parse('932c32bd-0000-47a2-835a-a8d455b859dd');

  // Characteristics
  static final onOffChar =
      Uuid.parse('932c32bd-0002-47a2-835a-a8d455b859dd');
  static final brightnessChar =
      Uuid.parse('932c32bd-0003-47a2-835a-a8d455b859dd');
  static final colorChar =
      Uuid.parse('932c32bd-0005-47a2-835a-a8d455b859dd');
  static final combinedControlChar =
      Uuid.parse('932c32bd-0007-47a2-835a-a8d455b859dd');

  // Device Config Service
  static final deviceConfigService =
      Uuid.parse('0000fe0f-0000-1000-8000-00805f9b34fb');

  // Device Name Characteristic
  static final deviceNameChar =
      Uuid.parse('97fe6561-0003-4f62-86e9-b71ee2da3d22');
}
