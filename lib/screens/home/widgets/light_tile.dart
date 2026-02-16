import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../../providers/light_control_provider.dart';
import '../../../providers/ble_connection_provider.dart';
import '../../../models/hue_light.dart';

class LightTile extends StatelessWidget {
  final HueLight light;
  final VoidCallback onTap;

  const LightTile({super.key, required this.light, required this.onTap});

  @override
  Widget build(BuildContext context) {
    final connectionProvider = context.watch<BleConnectionProvider>();
    final lightProvider = context.watch<LightControlProvider>();
    final isConnected = connectionProvider.isConnected(light.macAddress);
    final state = lightProvider.getState(light.macAddress);

    return Card(
      child: InkWell(
        onTap: onTap,
        borderRadius: BorderRadius.circular(12),
        child: Padding(
          padding: const EdgeInsets.all(12),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Row(
                children: [
                  Icon(
                    Icons.lightbulb,
                    color: isConnected && state.isOn
                        ? state.displayColor
                        : Colors.grey,
                    size: 32,
                  ),
                  const Spacer(),
                  if (isConnected)
                    Switch(
                      value: state.isOn,
                      onChanged: (_) =>
                          lightProvider.toggleOnOff(light.macAddress),
                    )
                  else
                    const Icon(Icons.bluetooth_disabled,
                        size: 16, color: Colors.grey),
                ],
              ),
              const SizedBox(height: 8),
              Text(
                light.name,
                style: Theme.of(context).textTheme.titleSmall,
                maxLines: 1,
                overflow: TextOverflow.ellipsis,
              ),
              if (isConnected && state.isOn) ...[
                const SizedBox(height: 4),
                SliderTheme(
                  data: SliderTheme.of(context).copyWith(
                    trackHeight: 4,
                    thumbShape:
                        const RoundSliderThumbShape(enabledThumbRadius: 6),
                  ),
                  child: Slider(
                    value: state.brightness.toDouble(),
                    min: 1,
                    max: 254,
                    onChanged: (v) => lightProvider.setBrightness(
                        light.macAddress, v.round()),
                  ),
                ),
              ],
            ],
          ),
        ),
      ),
    );
  }
}
