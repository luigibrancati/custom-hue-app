import 'package:flutter/material.dart';
import '../core/constants/app_constants.dart';
import '../core/utils/color_utils.dart';
import '../core/utils/throttle.dart';
import '../models/light_state.dart';
import '../services/ble/ble_light_control_service.dart';
import '../services/scheduling/fade_service.dart';

class LightControlProvider extends ChangeNotifier {
  final BleLightControlService _lightControl;
  final FadeService _fadeService = FadeService();
  final Map<String, LightState> _states = {};
  final Map<String, Throttle> _throttles = {};

  LightControlProvider(this._lightControl);

  LightState getState(String deviceId) =>
      _states[deviceId] ?? const LightState();

  bool get isFading => _fadeService.isFading;

  Throttle _getThrottle(String deviceId) {
    return _throttles.putIfAbsent(
      deviceId,
      () => Throttle(
          duration:
              const Duration(milliseconds: AppConstants.bleWriteThrottleMs)),
    );
  }

  Future<void> readState(String deviceId) async {
    final state = await _lightControl.readState(deviceId);
    _states[deviceId] = state;
    notifyListeners();
  }

  Future<void> toggleOnOff(String deviceId) async {
    final current = getState(deviceId);
    final newOn = !current.isOn;
    _states[deviceId] = current.copyWith(isOn: newOn);
    notifyListeners();
    await _lightControl.setOnOff(deviceId, newOn);
  }

  Future<void> setOnOff(String deviceId, bool on) async {
    _states[deviceId] = getState(deviceId).copyWith(isOn: on);
    notifyListeners();
    await _lightControl.setOnOff(deviceId, on);
  }

  void setBrightness(String deviceId, int brightness) {
    _states[deviceId] = getState(deviceId).copyWith(brightness: brightness);
    notifyListeners();
    _getThrottle(deviceId).call(() {
      _lightControl.setBrightness(deviceId, brightness);
    });
  }

  void setColorTemp(String deviceId, int mireds) {
    _states[deviceId] = getState(deviceId).copyWith(
      colorTempMireds: mireds,
      displayColor: ColorUtils.miredsToColor(mireds),
    );
    notifyListeners();
    _getThrottle(deviceId).call(() {
      _lightControl.setColorTemp(deviceId, mireds);
    });
  }

  void setColor(String deviceId, Color color) {
    final (x, y) = ColorUtils.colorToCieXy(color);
    _states[deviceId] = getState(deviceId).copyWith(
      colorX: x,
      colorY: y,
      colorTempMireds: null,
      displayColor: color,
    );
    notifyListeners();
    _getThrottle(deviceId).call(() {
      _lightControl.setColor(deviceId, x, y);
    });
  }

  void startFadeIn(String deviceId, {Duration? duration}) {
    final current = getState(deviceId);
    _fadeService.startFade(
      startBrightness: AppConstants.minBrightness,
      endBrightness: current.brightness > AppConstants.minBrightness
          ? current.brightness
          : AppConstants.maxBrightness,
      duration: duration ?? AppConstants.defaultFadeDuration,
      onStep: (b) => setBrightness(deviceId, b),
      onComplete: () => notifyListeners(),
    );
    // Ensure light is on
    if (!current.isOn) setOnOff(deviceId, true);
    notifyListeners();
  }

  void startFadeOut(String deviceId, {Duration? duration}) {
    final current = getState(deviceId);
    _fadeService.startFade(
      startBrightness: current.brightness,
      endBrightness: AppConstants.minBrightness,
      duration: duration ?? AppConstants.defaultFadeDuration,
      onStep: (b) => setBrightness(deviceId, b),
      onComplete: () {
        setOnOff(deviceId, false);
        notifyListeners();
      },
    );
    notifyListeners();
  }

  void stopFade() {
    _fadeService.stop();
    notifyListeners();
  }

  Future<void> applyScene(
    String deviceId, {
    required int brightness,
    int? colorTempMireds,
    double? colorX,
    double? colorY,
  }) async {
    await _lightControl.setCombined(
      deviceId,
      on: true,
      brightness: brightness,
      colorTempMireds: colorTempMireds,
      cieX: colorX,
      cieY: colorY,
    );
    await readState(deviceId);
  }

  @override
  void dispose() {
    _fadeService.dispose();
    for (final t in _throttles.values) {
      t.dispose();
    }
    super.dispose();
  }
}
