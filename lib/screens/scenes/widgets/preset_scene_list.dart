import 'package:flutter/material.dart';
import '../../../models/scene.dart';
import 'scene_card.dart';

class PresetSceneList extends StatelessWidget {
  final List<Scene> presets;
  final ValueChanged<Scene> onApply;

  const PresetSceneList({
    super.key,
    required this.presets,
    required this.onApply,
  });

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
          child: Text('Preset Scenes',
              style: Theme.of(context).textTheme.titleSmall),
        ),
        ...presets.map((scene) => SceneCard(
              scene: scene,
              onTap: () => onApply(scene),
            )),
      ],
    );
  }
}
