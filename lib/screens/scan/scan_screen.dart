import 'package:flutter/material.dart';
import 'package:permission_handler/permission_handler.dart';
import 'package:provider/provider.dart';
import '../../models/hue_light.dart';
import '../../providers/ble_scan_provider.dart';
import '../../providers/ble_connection_provider.dart';
import '../../providers/room_provider.dart';
import '../../services/ble/ble_connection_service.dart';
import '../../widgets/hue_app_bar.dart';
import '../../widgets/empty_state.dart';
import 'widgets/discovered_device_tile.dart';

class ScanScreen extends StatefulWidget {
  const ScanScreen({super.key});

  @override
  State<ScanScreen> createState() => _ScanScreenState();
}

class _ScanScreenState extends State<ScanScreen> {
  @override
  void initState() {
    super.initState();
    _requestPermissionsAndScan();
  }

  Future<void> _requestPermissionsAndScan() async {
    final statuses = await [
      Permission.bluetoothScan,
      Permission.bluetoothConnect,
      Permission.location,
    ].request();

    if (!mounted) return;

    final denied = statuses.entries
        .where((e) => !e.value.isGranted)
        .map((e) => e.key.toString())
        .toList();

    if (denied.isNotEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(
            'Permissions required for scanning: ${denied.join(', ')}',
          ),
          action: SnackBarAction(
            label: 'Settings',
            onPressed: openAppSettings,
          ),
        ),
      );
      return;
    }

    context.read<BleScanProvider>().startScan();
  }

  @override
  Widget build(BuildContext context) {
    final scanProvider = context.watch<BleScanProvider>();
    final connectionProvider = context.watch<BleConnectionProvider>();

    return Scaffold(
      appBar: HueAppBar(
        title: 'Scan for Lights',
        actions: [
          if (scanProvider.isScanning)
            const Padding(
              padding: EdgeInsets.all(16),
              child: SizedBox(
                width: 20,
                height: 20,
                child: CircularProgressIndicator(strokeWidth: 2),
              ),
            )
          else
            IconButton(
              icon: const Icon(Icons.refresh),
              onPressed: () => _requestPermissionsAndScan(),
            ),
        ],
      ),
      body: SafeArea(
        top: false,
        child: scanProvider.error != null
          ? EmptyState(
              icon: Icons.bluetooth_disabled,
              title: 'Scan failed',
              subtitle: scanProvider.error!,
            )
          : scanProvider.devices.isEmpty
          ? EmptyState(
              icon: Icons.bluetooth_searching,
              title: scanProvider.isScanning
                  ? 'Scanning...'
                  : 'No devices found',
              subtitle: scanProvider.isScanning
                  ? 'Looking for Hue lights nearby'
                  : 'Make sure your Hue light is powered on and in range',
            )
          : ListView.builder(
              itemCount: scanProvider.devices.length,
              itemBuilder: (context, index) {
                final device = scanProvider.devices[index];
                final connState = connectionProvider.getState(device.id);
                return DiscoveredDeviceTile(
                  device: device,
                  isConnecting:
                      connState == BleDeviceConnectionState.connecting,
                  isConnected:
                      connState == BleDeviceConnectionState.connected,
                  onConnect: () => _connectAndPair(device.id, device.name),
                );
              },
            ),
      ),
    );
  }

  Future<void> _connectAndPair(String deviceId, String name) async {
    final connectionProvider = context.read<BleConnectionProvider>();
    final roomProvider = context.read<RoomProvider>();

    await connectionProvider.connect(deviceId);

    // Save the light
    final light = HueLight(
      id: deviceId,
      name: name.isNotEmpty ? name : 'Hue Light',
      macAddress: deviceId,
    );
    await roomProvider.saveLight(light);

    if (mounted) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text('${light.name} paired successfully')),
      );
    }
  }
}
