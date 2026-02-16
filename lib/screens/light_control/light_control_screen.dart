import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../core/constants/app_constants.dart';
import '../../core/utils/color_utils.dart';
import '../../models/hue_light.dart';
import '../../models/favorite_color.dart';
import '../../providers/light_control_provider.dart';
import '../../providers/ble_connection_provider.dart';
import '../../providers/favorite_provider.dart';
import '../../widgets/hue_app_bar.dart';
import '../favorites/favorites_strip.dart';
import 'widgets/power_button.dart';
import 'widgets/brightness_slider.dart';
import 'widgets/color_wheel_picker.dart';
import 'widgets/color_temp_slider.dart';
import 'widgets/fade_controls.dart';

class LightControlScreen extends StatefulWidget {
  final HueLight light;

  const LightControlScreen({super.key, required this.light});

  @override
  State<LightControlScreen> createState() => _LightControlScreenState();
}

class _LightControlScreenState extends State<LightControlScreen> {
  Duration _fadeDuration = AppConstants.defaultFadeDuration;
  bool _showColorWheel = true;

  String get _deviceId => widget.light.macAddress;

  @override
  Widget build(BuildContext context) {
    final lightProvider = context.watch<LightControlProvider>();
    final connectionProvider = context.watch<BleConnectionProvider>();
    final state = lightProvider.getState(_deviceId);
    final isConnected = connectionProvider.isConnected(_deviceId);

    return Scaffold(
      appBar: HueAppBar(title: widget.light.name),
      body: SafeArea(
        top: false,
        child: !isConnected
          ? Center(
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  const Icon(Icons.bluetooth_disabled,
                      size: 64, color: Colors.grey),
                  const SizedBox(height: 16),
                  const Text('Light is not connected'),
                  const SizedBox(height: 16),
                  ElevatedButton(
                    onPressed: () =>
                        connectionProvider.connect(_deviceId),
                    child: const Text('Reconnect'),
                  ),
                ],
              ),
            )
          : SingleChildScrollView(
              padding: const EdgeInsets.symmetric(vertical: 16),
              child: Column(
                children: [
                  PowerButton(
                    isOn: state.isOn,
                    onToggle: () => lightProvider.toggleOnOff(_deviceId),
                  ),
                  const SizedBox(height: 24),
                  Padding(
                    padding: const EdgeInsets.symmetric(horizontal: 16),
                    child: BrightnessSlider(
                      brightness: state.brightness,
                      onChanged: (v) =>
                          lightProvider.setBrightness(_deviceId, v),
                    ),
                  ),
                  const SizedBox(height: 16),
                  // Color mode toggle
                  Padding(
                    padding: const EdgeInsets.symmetric(horizontal: 16),
                    child: SegmentedButton<bool>(
                      segments: const [
                        ButtonSegment(
                            value: true, label: Text('Color'), icon: Icon(Icons.palette)),
                        ButtonSegment(
                            value: false, label: Text('Temperature'), icon: Icon(Icons.thermostat)),
                      ],
                      selected: {_showColorWheel},
                      onSelectionChanged: (v) =>
                          setState(() => _showColorWheel = v.first),
                    ),
                  ),
                  const SizedBox(height: 16),
                  if (_showColorWheel)
                    ColorWheelPicker(
                      currentColor: state.displayColor,
                      onColorChanged: (c) =>
                          lightProvider.setColor(_deviceId, c),
                    )
                  else
                    ColorTempSlider(
                      mireds: state.colorTempMireds ?? 300,
                      onChanged: (v) =>
                          lightProvider.setColorTemp(_deviceId, v),
                    ),
                  const SizedBox(height: 16),
                  // Favorites
                  Padding(
                    padding: const EdgeInsets.symmetric(horizontal: 16),
                    child: Align(
                      alignment: Alignment.centerLeft,
                      child: Text('Favorites',
                          style: Theme.of(context).textTheme.titleSmall),
                    ),
                  ),
                  const SizedBox(height: 8),
                  FavoritesStrip(
                    onSelect: (fav) => _applyFavorite(fav, lightProvider),
                    onAdd: () => _addFavorite(state.displayColor),
                  ),
                  const SizedBox(height: 24),
                  // Fade controls
                  FadeControls(
                    isFading: lightProvider.isFading,
                    fadeDuration: _fadeDuration,
                    onFadeIn: () => lightProvider.startFadeIn(
                      _deviceId,
                      duration: _fadeDuration,
                    ),
                    onFadeOut: () => lightProvider.startFadeOut(
                      _deviceId,
                      duration: _fadeDuration,
                    ),
                    onStop: () => lightProvider.stopFade(),
                    onDurationChanged: (d) =>
                        setState(() => _fadeDuration = d),
                  ),
                  const SizedBox(height: 32),
                ],
              ),
            ),
      ),
    );
  }

  void _applyFavorite(FavoriteColor fav, LightControlProvider provider) {
    if (fav.colorTempMireds != null) {
      provider.setColorTemp(_deviceId, fav.colorTempMireds!);
    } else {
      final color = ColorUtils.cieXyToColor(fav.colorX, fav.colorY, 1.0);
      provider.setColor(_deviceId, color);
    }
  }

  void _addFavorite(Color currentColor) {
    final nameController = TextEditingController();
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Save Favorite'),
        content: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            CircleAvatar(radius: 30, backgroundColor: currentColor),
            const SizedBox(height: 16),
            TextField(
              controller: nameController,
              decoration:
                  const InputDecoration(labelText: 'Name', hintText: 'My Color'),
            ),
          ],
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              final name =
                  nameController.text.trim().isEmpty ? 'Favorite' : nameController.text.trim();
              context.read<FavoriteProvider>().addFavorite(name, currentColor);
              Navigator.pop(ctx);
            },
            child: const Text('Save'),
          ),
        ],
      ),
    );
  }
}
