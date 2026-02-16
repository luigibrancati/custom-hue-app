import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../models/hue_light.dart';
import '../../providers/room_provider.dart';
import '../../providers/ble_connection_provider.dart';
import '../../widgets/hue_app_bar.dart';

class LightSettingsScreen extends StatefulWidget {
  final HueLight light;

  const LightSettingsScreen({super.key, required this.light});

  @override
  State<LightSettingsScreen> createState() => _LightSettingsScreenState();
}

class _LightSettingsScreenState extends State<LightSettingsScreen> {
  late final TextEditingController _nameController;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController(text: widget.light.name);
  }

  @override
  void dispose() {
    _nameController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final roomProvider = context.watch<RoomProvider>();
    final connectionProvider = context.watch<BleConnectionProvider>();
    final isConnected =
        connectionProvider.isConnected(widget.light.macAddress);

    return Scaffold(
      appBar: HueAppBar(title: 'Light Settings'),
      body: SafeArea(
        top: false,
        child: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          // Connection status
          ListTile(
            leading: Icon(
              Icons.bluetooth,
              color: isConnected ? Colors.blue : Colors.grey,
            ),
            title: Text(isConnected ? 'Connected' : 'Disconnected'),
            subtitle: Text('MAC: ${widget.light.macAddress}'),
            trailing: isConnected
                ? TextButton(
                    onPressed: () =>
                        connectionProvider.disconnect(widget.light.macAddress),
                    child: const Text('Disconnect'),
                  )
                : TextButton(
                    onPressed: () =>
                        connectionProvider.connect(widget.light.macAddress),
                    child: const Text('Connect'),
                  ),
          ),
          const Divider(),
          const SizedBox(height: 16),
          // Rename
          TextField(
            controller: _nameController,
            decoration: const InputDecoration(
              labelText: 'Light Name',
              border: OutlineInputBorder(),
            ),
          ),
          const SizedBox(height: 8),
          Align(
            alignment: Alignment.centerRight,
            child: TextButton(
              onPressed: () {
                final name = _nameController.text.trim();
                if (name.isNotEmpty) {
                  roomProvider.renameLight(widget.light.id, name);
                  ScaffoldMessenger.of(context).showSnackBar(
                    const SnackBar(content: Text('Light renamed')),
                  );
                }
              },
              child: const Text('Save Name'),
            ),
          ),
          const SizedBox(height: 16),
          // Room assignment
          Text('Room', style: Theme.of(context).textTheme.titleSmall),
          const SizedBox(height: 8),
          DropdownButtonFormField<String?>(
            initialValue: widget.light.roomId,
            decoration: const InputDecoration(border: OutlineInputBorder()),
            hint: const Text('No room'),
            items: [
              const DropdownMenuItem(value: null, child: Text('No room')),
              ...roomProvider.rooms.map((room) => DropdownMenuItem(
                    value: room.id,
                    child: Text(room.name),
                  )),
            ],
            onChanged: (roomId) {
              if (widget.light.roomId != null) {
                roomProvider.removeLightFromRoom(
                    widget.light.id, widget.light.roomId!);
              }
              if (roomId != null) {
                roomProvider.addLightToRoom(widget.light.id, roomId);
              }
            },
          ),
          const SizedBox(height: 32),
          // Unpair / Delete
          OutlinedButton.icon(
            onPressed: () => _unpairLight(context),
            icon: const Icon(Icons.delete, color: Colors.red),
            label: const Text('Unpair Light',
                style: TextStyle(color: Colors.red)),
            style: OutlinedButton.styleFrom(side: const BorderSide(color: Colors.red)),
          ),
        ],
        ),
      ),
    );
  }

  void _unpairLight(BuildContext context) {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Unpair light?'),
        content: const Text(
            'This will remove the light from the app. You can re-pair it later.'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              context
                  .read<BleConnectionProvider>()
                  .disconnect(widget.light.macAddress);
              context.read<RoomProvider>().deleteLight(widget.light.id);
              Navigator.pop(ctx);
              Navigator.pop(context);
            },
            child: const Text('Unpair', style: TextStyle(color: Colors.red)),
          ),
        ],
      ),
    );
  }
}
