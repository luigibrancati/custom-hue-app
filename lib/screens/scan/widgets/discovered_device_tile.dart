import 'package:flutter/material.dart';
import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';

class DiscoveredDeviceTile extends StatelessWidget {
  final DiscoveredDevice device;
  final bool isConnecting;
  final bool isConnected;
  final VoidCallback onConnect;

  const DiscoveredDeviceTile({
    super.key,
    required this.device,
    required this.isConnecting,
    required this.isConnected,
    required this.onConnect,
  });

  @override
  Widget build(BuildContext context) {
    return ListTile(
      leading: Icon(
        Icons.lightbulb_outline,
        color: isConnected ? Colors.green : null,
      ),
      title: Text(device.name.isNotEmpty ? device.name : 'Unknown Hue Light'),
      subtitle: Text(
        isConnected
            ? 'Connected'
            : isConnecting
                ? 'Connecting...'
                : 'RSSI: ${device.rssi} dBm',
      ),
      trailing: isConnecting
          ? const SizedBox(
              width: 24,
              height: 24,
              child: CircularProgressIndicator(strokeWidth: 2),
            )
          : isConnected
              ? const Icon(Icons.check_circle, color: Colors.green)
              : ElevatedButton(
                  onPressed: onConnect,
                  child: const Text('Pair'),
                ),
    );
  }
}
