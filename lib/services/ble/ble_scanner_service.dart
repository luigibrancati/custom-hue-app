import 'dart:async';
import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import '../../core/constants/ble_uuids.dart';
import '../../core/constants/app_constants.dart';

class BleScannerService {
  final FlutterReactiveBle _ble;
  StreamSubscription<DiscoveredDevice>? _scanSub;
  final _devicesController = StreamController<List<DiscoveredDevice>>.broadcast();
  final Map<String, DiscoveredDevice> _discovered = {};

  BleScannerService(this._ble);

  Stream<List<DiscoveredDevice>> get devices => _devicesController.stream;
  List<DiscoveredDevice> get currentDevices => _discovered.values.toList();
  bool _isScanning = false;
  bool get isScanning => _isScanning;

  void startScan() {
    if (_ble.status != BleStatus.ready) {
      _devicesController.addError(
        'Bluetooth is not enabled. Please turn on Bluetooth and try again.',
      );
      return;
    }
    _discovered.clear();
    _isScanning = true;
    _scanSub?.cancel();
    _scanSub = _ble.scanForDevices(
      withServices: [BleUuids.deviceConfigService],
      scanMode: ScanMode.lowLatency,
    ).listen(
      (device) {
        _discovered[device.id] = device;
        _devicesController.add(_discovered.values.toList());
      },
      onError: (error) {
        _devicesController.addError(error);
      },
    );

    // Auto-stop after timeout
    Future.delayed(AppConstants.bleScanTimeout, stopScan);
  }

  void stopScan() {
    _scanSub?.cancel();
    _scanSub = null;
    _isScanning = false;
  }

  void dispose() {
    stopScan();
    _devicesController.close();
  }
}
