import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import '../../core/constants/ble_uuids.dart';

class BlePairingService {
  final FlutterReactiveBle _ble;

  BlePairingService(this._ble);

  /// Attempt to pair with a Hue light by reading a protected characteristic.
  /// This triggers the OS-level bonding dialog on Android.
  Future<bool> pair(String deviceId) async {
    try {
      // Reading the device name char typically triggers bonding
      await _ble.readCharacteristic(
        QualifiedCharacteristic(
          characteristicId: BleUuids.deviceNameChar,
          serviceId: BleUuids.deviceConfigService,
          deviceId: deviceId,
        ),
      );
      return true;
    } catch (_) {
      // Bonding may still succeed even if read fails
      return false;
    }
  }

  /// Discover all services on a connected device.
  Future<List<Service>> discoverServices(String deviceId) async {
    try {
      return await _ble.getDiscoveredServices(deviceId);
    } catch (_) {
      return [];
    }
  }
}
