import 'package:flutter/material.dart';
import '../../../core/utils/color_utils.dart';
import '../../../models/scene.dart';

class SceneCard extends StatelessWidget {
  final Scene scene;
  final VoidCallback onTap;
  final VoidCallback? onEdit;

  const SceneCard({
    super.key,
    required this.scene,
    required this.onTap,
    this.onEdit,
  });

  @override
  Widget build(BuildContext context) {
    final color = scene.colorTempMireds != null
        ? ColorUtils.miredsToColor(scene.colorTempMireds!)
        : scene.colorX != null && scene.colorY != null
            ? ColorUtils.cieXyToColor(scene.colorX!, scene.colorY!, 1.0)
            : Colors.white;

    return Card(
      child: InkWell(
        onTap: onTap,
        borderRadius: BorderRadius.circular(12),
        child: Padding(
          padding: const EdgeInsets.all(16),
          child: Row(
            children: [
              Container(
                width: 48,
                height: 48,
                decoration: BoxDecoration(
                  shape: BoxShape.circle,
                  color: color,
                  boxShadow: [
                    BoxShadow(
                      color: color.withAlpha(102),
                      blurRadius: 8,
                    ),
                  ],
                ),
              ),
              const SizedBox(width: 16),
              Expanded(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(scene.name,
                        style: Theme.of(context).textTheme.titleMedium),
                    Text(
                      '${(scene.brightness / 254 * 100).round()}% brightness',
                      style: Theme.of(context)
                          .textTheme
                          .bodySmall
                          ?.copyWith(color: Colors.grey),
                    ),
                  ],
                ),
              ),
              if (scene.isPreset)
                const Chip(label: Text('Preset'))
              else if (onEdit != null)
                IconButton(
                  icon: const Icon(Icons.edit),
                  onPressed: onEdit,
                ),
            ],
          ),
        ),
      ),
    );
  }
}
