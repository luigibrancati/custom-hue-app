import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../core/constants/app_constants.dart';
import '../../models/scene.dart';
import '../../providers/scene_provider.dart';
import '../../providers/room_provider.dart';
import '../../widgets/hue_app_bar.dart';

class SceneEditorScreen extends StatefulWidget {
  final Scene scene;

  const SceneEditorScreen({super.key, required this.scene});

  @override
  State<SceneEditorScreen> createState() => _SceneEditorScreenState();
}

class _SceneEditorScreenState extends State<SceneEditorScreen> {
  late final TextEditingController _nameController;
  late int _brightness;
  late int _colorTempMireds;
  late List<String> _selectedLightIds;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController(text: widget.scene.name);
    _brightness = widget.scene.brightness;
    _colorTempMireds = widget.scene.colorTempMireds ?? 300;
    _selectedLightIds = List.from(widget.scene.lightIds);
  }

  @override
  void dispose() {
    _nameController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final allLights = context.watch<RoomProvider>().allLights;

    return Scaffold(
      appBar: HueAppBar(
        title: widget.scene.id.startsWith('preset_')
            ? 'Scene Details'
            : 'Edit Scene',
        actions: [
          if (!widget.scene.isPreset)
            IconButton(
              icon: const Icon(Icons.delete),
              onPressed: _deleteScene,
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
              labelText: 'Scene Name',
              border: OutlineInputBorder(),
            ),
            readOnly: widget.scene.isPreset,
          ),
          const SizedBox(height: 24),
          Text('Brightness: ${(_brightness / 254 * 100).round()}%'),
          Slider(
            value: _brightness.toDouble(),
            min: 1,
            max: 254,
            onChanged: (v) => setState(() => _brightness = v.round()),
          ),
          const SizedBox(height: 16),
          Text(
              'Color Temperature: ${(1000000 / _colorTempMireds).round()}K'),
          Slider(
            value: _colorTempMireds.toDouble(),
            min: AppConstants.minMireds.toDouble(),
            max: AppConstants.maxMireds.toDouble(),
            onChanged: (v) =>
                setState(() => _colorTempMireds = v.round()),
          ),
          const SizedBox(height: 24),
          Text('Lights', style: Theme.of(context).textTheme.titleSmall),
          const SizedBox(height: 8),
          ...allLights.map((light) => CheckboxListTile(
                title: Text(light.name),
                value: _selectedLightIds.contains(light.id),
                onChanged: (v) {
                  setState(() {
                    if (v == true) {
                      _selectedLightIds.add(light.id);
                    } else {
                      _selectedLightIds.remove(light.id);
                    }
                  });
                },
              )),
          const SizedBox(height: 24),
          if (!widget.scene.isPreset)
            FilledButton(
              onPressed: _saveScene,
              child: const Text('Save Scene'),
            ),
        ],
        ),
      ),
    );
  }

  void _saveScene() {
    widget.scene.name = _nameController.text.trim();
    widget.scene.brightness = _brightness;
    widget.scene.colorTempMireds = _colorTempMireds;
    widget.scene.lightIds = _selectedLightIds;

    context.read<SceneProvider>().createScene(widget.scene);
    Navigator.pop(context);
  }

  void _deleteScene() {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Delete scene?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              context.read<SceneProvider>().deleteScene(widget.scene.id);
              Navigator.pop(ctx);
              Navigator.pop(context);
            },
            child: const Text('Delete'),
          ),
        ],
      ),
    );
  }
}
