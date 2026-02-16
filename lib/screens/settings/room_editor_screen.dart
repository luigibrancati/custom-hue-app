import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../models/room.dart';
import '../../providers/room_provider.dart';
import '../../widgets/hue_app_bar.dart';

class RoomEditorScreen extends StatefulWidget {
  final Room room;

  const RoomEditorScreen({super.key, required this.room});

  @override
  State<RoomEditorScreen> createState() => _RoomEditorScreenState();
}

class _RoomEditorScreenState extends State<RoomEditorScreen> {
  late final TextEditingController _nameController;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController(text: widget.room.name);
  }

  @override
  void dispose() {
    _nameController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final roomProvider = context.watch<RoomProvider>();
    final roomLights = roomProvider.getLightsInRoom(widget.room.id);
    final unassigned = roomProvider.unassignedLights;

    return Scaffold(
      appBar: HueAppBar(
        title: 'Edit Room',
        actions: [
          IconButton(
            icon: const Icon(Icons.delete),
            onPressed: _deleteRoom,
          ),
        ],
      ),
      body: SafeArea(
        top: false,
        child: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          TextField(
            controller: _nameController,
            decoration: const InputDecoration(
              labelText: 'Room Name',
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
                  roomProvider.renameRoom(widget.room.id, name);
                  ScaffoldMessenger.of(context).showSnackBar(
                    const SnackBar(content: Text('Room renamed')),
                  );
                }
              },
              child: const Text('Save Name'),
            ),
          ),
          const SizedBox(height: 16),
          Text('Lights in this room',
              style: Theme.of(context).textTheme.titleSmall),
          if (roomLights.isEmpty)
            const Padding(
              padding: EdgeInsets.all(16),
              child: Text('No lights in this room',
                  style: TextStyle(color: Colors.grey)),
            ),
          ...roomLights.map((light) => ListTile(
                leading: const Icon(Icons.lightbulb),
                title: Text(light.name),
                trailing: IconButton(
                  icon: const Icon(Icons.remove_circle, color: Colors.red),
                  onPressed: () => roomProvider.removeLightFromRoom(
                      light.id, widget.room.id),
                ),
              )),
          if (unassigned.isNotEmpty) ...[
            const Divider(),
            Text('Available lights',
                style: Theme.of(context).textTheme.titleSmall),
            ...unassigned.map((light) => ListTile(
                  leading: const Icon(Icons.lightbulb_outline),
                  title: Text(light.name),
                  trailing: IconButton(
                    icon: const Icon(Icons.add_circle, color: Colors.green),
                    onPressed: () => roomProvider.addLightToRoom(
                        light.id, widget.room.id),
                  ),
                )),
          ],
        ],
        ),
      ),
    );
  }

  void _deleteRoom() {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Delete room?'),
        content:
            const Text('Lights in this room will become unassigned.'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              context.read<RoomProvider>().deleteRoom(widget.room.id);
              Navigator.pop(ctx);
              Navigator.pop(context);
            },
            child: const Text('Delete', style: TextStyle(color: Colors.red)),
          ),
        ],
      ),
    );
  }
}
