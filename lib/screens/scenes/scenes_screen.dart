import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../models/scene.dart';
import '../../providers/scene_provider.dart';
import '../../providers/light_control_provider.dart';
import '../../providers/room_provider.dart';
import '../../providers/ble_connection_provider.dart';
import '../../widgets/empty_state.dart';
import 'scene_editor_screen.dart';
import 'widgets/scene_card.dart';
import 'widgets/preset_scene_list.dart';

class ScenesScreen extends StatelessWidget {
  const ScenesScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final sceneProvider = context.watch<SceneProvider>();
    final presets = sceneProvider.presetScenes;
    final custom = sceneProvider.customScenes;

    return SafeArea(
      child: Column(
        children: [
          Padding(
            padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
            child: Row(
              children: [
                Text('Scenes',
                    style: Theme.of(context).textTheme.headlineMedium),
                const Spacer(),
                IconButton(
                  icon: const Icon(Icons.add),
                  onPressed: () => _createScene(context),
                ),
              ],
            ),
          ),
          Expanded(
            child: ListView(
              children: [
                if (presets.isNotEmpty)
                  PresetSceneList(
                    presets: presets,
                    onApply: (scene) => _applyScene(context, scene),
                  ),
                if (custom.isNotEmpty) ...[
                  Padding(
                    padding:
                        const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
                    child: Text('Custom Scenes',
                        style: Theme.of(context).textTheme.titleSmall),
                  ),
                  ...custom.map((scene) => SceneCard(
                        scene: scene,
                        onTap: () => _applyScene(context, scene),
                        onEdit: () => Navigator.push(
                          context,
                          MaterialPageRoute(
                            builder: (_) => SceneEditorScreen(scene: scene),
                          ),
                        ),
                      )),
                ],
                if (presets.isEmpty && custom.isEmpty)
                  const EmptyState(
                    icon: Icons.palette,
                    title: 'No scenes',
                    subtitle: 'Create a scene to quickly set your lights',
                  ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  void _applyScene(BuildContext context, Scene scene) {
    final lightProvider = context.read<LightControlProvider>();
    final connectionProvider = context.read<BleConnectionProvider>();
    final roomProvider = context.read<RoomProvider>();

    // Apply to all connected lights, or scene-specific lights
    final targetLights = scene.lightIds.isNotEmpty
        ? scene.lightIds
        : roomProvider.allLights.map((l) => l.macAddress).toList();

    for (final lightId in targetLights) {
      if (connectionProvider.isConnected(lightId)) {
        lightProvider.applyScene(
          lightId,
          brightness: scene.brightness,
          colorTempMireds: scene.colorTempMireds,
          colorX: scene.colorX,
          colorY: scene.colorY,
        );
      }
    }

    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text('Applied "${scene.name}"')),
    );
  }

  void _createScene(BuildContext context) {
    final scene = context.read<SceneProvider>().createNewScene();
    Navigator.push(
      context,
      MaterialPageRoute(builder: (_) => SceneEditorScreen(scene: scene)),
    );
  }
}
