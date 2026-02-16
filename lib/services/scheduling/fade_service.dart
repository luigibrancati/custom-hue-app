import 'dart:async';
import '../../core/constants/app_constants.dart';

class FadeService {
  Timer? _fadeTimer;
  bool _isFading = false;

  bool get isFading => _isFading;

  /// Start a gradual fade from [startBrightness] to [endBrightness] over [duration].
  /// Calls [onStep] with each new brightness value.
  /// Calls [onComplete] when done.
  void startFade({
    required int startBrightness,
    required int endBrightness,
    required Duration duration,
    required void Function(int brightness) onStep,
    void Function()? onComplete,
  }) {
    stop();
    _isFading = true;

    final totalSteps = duration.inMilliseconds ~/
        AppConstants.fadeStepInterval.inMilliseconds;
    if (totalSteps <= 0) {
      onStep(endBrightness);
      onComplete?.call();
      _isFading = false;
      return;
    }

    final stepSize = (endBrightness - startBrightness) / totalSteps;
    var currentStep = 0;
    var currentBrightness = startBrightness.toDouble();

    _fadeTimer = Timer.periodic(AppConstants.fadeStepInterval, (timer) {
      currentStep++;
      currentBrightness += stepSize;

      final brightnessInt = currentBrightness
          .round()
          .clamp(AppConstants.minBrightness, AppConstants.maxBrightness);
      onStep(brightnessInt);

      if (currentStep >= totalSteps) {
        timer.cancel();
        _isFading = false;
        onStep(endBrightness.clamp(
            AppConstants.minBrightness, AppConstants.maxBrightness));
        onComplete?.call();
      }
    });
  }

  void stop() {
    _fadeTimer?.cancel();
    _fadeTimer = null;
    _isFading = false;
  }

  void dispose() {
    stop();
  }
}
