import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../providers/room_provider.dart';
import '../../providers/ble_connection_provider.dart';
import 'light_settings_screen.dart';
import 'room_editor_screen.dart';

class SettingsScreen extends StatelessWidget {
  const SettingsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final roomProvider = context.watch<RoomProvider>();

    return SafeArea(
      child: ListView(
        padding: const EdgeInsets.fromLTRB(0, 16, 0, 0),
        children: [
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16),
            child: Text('Settings',
                style: Theme.of(context).textTheme.headlineMedium),
          ),
          const SizedBox(height: 16),
          // Lights section
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
            child: Text('Lights',
                style: Theme.of(context).textTheme.titleSmall),
          ),
          ...roomProvider.allLights.map((light) {
            final isConnected =
                context.read<BleConnectionProvider>().isConnected(light.macAddress);
            return ListTile(
              leading: Icon(Icons.lightbulb,
                  color: isConnected ? Colors.amber : Colors.grey),
              title: Text(light.name),
              subtitle: Text(isConnected ? 'Connected' : 'Disconnected'),
              trailing: const Icon(Icons.chevron_right),
              onTap: () => Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (_) => LightSettingsScreen(light: light),
                ),
              ),
            );
          }),
          const Divider(),
          // Rooms section
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
            child: Row(
              children: [
                Text('Rooms',
                    style: Theme.of(context).textTheme.titleSmall),
                const Spacer(),
                IconButton(
                  icon: const Icon(Icons.add),
                  onPressed: () => _createRoom(context),
                ),
              ],
            ),
          ),
          ...roomProvider.rooms.map((room) => ListTile(
                leading: const Icon(Icons.room),
                title: Text(room.name),
                subtitle: Text('${room.lightIds.length} lights'),
                trailing: const Icon(Icons.chevron_right),
                onTap: () => Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (_) => RoomEditorScreen(room: room),
                  ),
                ),
              )),
          if (roomProvider.rooms.isEmpty)
            const Padding(
              padding: EdgeInsets.all(16),
              child: Text('No rooms created yet',
                  style: TextStyle(color: Colors.grey)),
            ),
          const Divider(),
          // App info
          ListTile(
            leading: const Icon(Icons.info),
            title: const Text('About'),
            subtitle: const Text('Custom Hue v1.0.2'),
            onTap: () => showAboutDialog(
              context: context,
              applicationName: 'Custom Hue',
              applicationVersion: '1.0.2',
              applicationLegalese: 'Philips Hue BLE Control App',
            ),
          ),
        ],
      ),
    );
  }

  void _createRoom(BuildContext context) {
    final controller = TextEditingController();
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('New Room'),
        content: TextField(
          controller: controller,
          decoration: const InputDecoration(
            labelText: 'Room Name',
            hintText: 'Living Room',
          ),
          autofocus: true,
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              final name = controller.text.trim();
              if (name.isNotEmpty) {
                context.read<RoomProvider>().createRoom(name);
              }
              Navigator.pop(ctx);
            },
            child: const Text('Create'),
          ),
        ],
      ),
    );
  }
}
