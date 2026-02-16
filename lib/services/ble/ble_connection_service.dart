import 'dart:async';
import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import '../../core/constants/app_constants.dart';

enum BleDeviceConnectionState { disconnected, connecting, connected, disconnecting }

class BleConnectionService {
  final FlutterReactiveBle _ble;
  final Map<String, StreamSubscription<ConnectionStateUpdate>> _connections = {};
  final Map<String, BleDeviceConnectionState> _states = {};
  final _stateController = StreamController<MapEntry<String, BleDeviceConnectionState>>.broadcast();

  BleConnectionService(this._ble);

  Stream<MapEntry<String, BleDeviceConnectionState>> get stateUpdates => _stateController.stream;

  BleDeviceConnectionState getState(String deviceId) =>
      _states[deviceId] ?? BleDeviceConnectionState.disconnected;

  Future<void> connect(String deviceId) async {
    if (_connections.containsKey(deviceId)) return;

    _updateState(deviceId, BleDeviceConnectionState.connecting);

    _connections[deviceId] = _ble
        .connectToDevice(
          id: deviceId,
          connectionTimeout: AppConstants.bleConnectionTimeout,
        )
        .listen(
          (update) {
            switch (update.connectionState) {
              case DeviceConnectionState.connected:
                _updateState(deviceId, BleDeviceConnectionState.connected);
                break;
              case DeviceConnectionState.disconnected:
                _updateState(deviceId, BleDeviceConnectionState.disconnected);
                _connections.remove(deviceId)?.cancel();
                break;
              case DeviceConnectionState.connecting:
                _updateState(deviceId, BleDeviceConnectionState.connecting);
                break;
              case DeviceConnectionState.disconnecting:
                _updateState(deviceId, BleDeviceConnectionState.disconnecting);
                break;
            }
          },
          onError: (error) {
            _updateState(deviceId, BleDeviceConnectionState.disconnected);
            _connections.remove(deviceId)?.cancel();
          },
        );
  }

  Future<void> disconnect(String deviceId) async {
    _updateState(deviceId, BleDeviceConnectionState.disconnecting);
    await _connections.remove(deviceId)?.cancel();
    _updateState(deviceId, BleDeviceConnectionState.disconnected);
  }

  void _updateState(String deviceId, BleDeviceConnectionState state) {
    _states[deviceId] = state;
    _stateController.add(MapEntry(deviceId, state));
  }

  void dispose() {
    for (final sub in _connections.values) {
      sub.cancel();
    }
    _connections.clear();
    _stateController.close();
  }
}
