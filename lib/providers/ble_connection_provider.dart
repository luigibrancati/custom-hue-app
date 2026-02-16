import 'dart:async';
import 'package:flutter/foundation.dart';
import '../services/ble/ble_connection_service.dart';

class BleConnectionProvider extends ChangeNotifier {
  final BleConnectionService _connectionService;
  StreamSubscription<MapEntry<String, BleDeviceConnectionState>>? _sub;
  final Map<String, BleDeviceConnectionState> _states = {};

  BleConnectionProvider(this._connectionService) {
    _sub = _connectionService.stateUpdates.listen((entry) {
      _states[entry.key] = entry.value;
      notifyListeners();
    });
  }

  BleDeviceConnectionState getState(String deviceId) =>
      _states[deviceId] ?? BleDeviceConnectionState.disconnected;

  bool isConnected(String deviceId) =>
      getState(deviceId) == BleDeviceConnectionState.connected;

  List<String> get connectedDeviceIds => _states.entries
      .where((e) => e.value == BleDeviceConnectionState.connected)
      .map((e) => e.key)
      .toList();

  Future<void> connect(String deviceId) async {
    await _connectionService.connect(deviceId);
  }

  Future<void> disconnect(String deviceId) async {
    await _connectionService.disconnect(deviceId);
  }

  @override
  void dispose() {
    _sub?.cancel();
    _connectionService.dispose();
    super.dispose();
  }
}
