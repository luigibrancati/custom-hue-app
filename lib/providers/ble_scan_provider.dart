import 'dart:async';
import 'package:flutter/foundation.dart';
import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import '../core/constants/app_constants.dart';
import '../services/ble/ble_scanner_service.dart';

class BleScanProvider extends ChangeNotifier {
  final BleScannerService _scanner;
  StreamSubscription<List<DiscoveredDevice>>? _sub;
  List<DiscoveredDevice> _devices = [];
  bool _isScanning = false;
  String? _error;

  BleScanProvider(this._scanner) {
    _sub = _scanner.devices.listen(
      (devices) {
        _devices = devices;
        notifyListeners();
      },
      onError: (error) {
        _error = error.toString();
        _isScanning = false;
        notifyListeners();
      },
    );
  }

  List<DiscoveredDevice> get devices => _devices;
  bool get isScanning => _isScanning;
  String? get error => _error;

  void startScan() {
    _isScanning = true;
    _devices = [];
    _error = null;
    notifyListeners();
    _scanner.startScan();

    // Auto-update scanning state when done
    Future.delayed(
      AppConstants.bleScanTimeout + const Duration(seconds: 1),
      () {
        if (_isScanning) {
          _isScanning = false;
          notifyListeners();
        }
      },
    );
  }

  void stopScan() {
    _scanner.stopScan();
    _isScanning = false;
    notifyListeners();
  }

  @override
  void dispose() {
    _sub?.cancel();
    _scanner.dispose();
    super.dispose();
  }
}
