import 'dart:async';

class Throttle {
  final Duration duration;
  Timer? _timer;
  DateTime? _lastRun;

  Throttle({required this.duration});

  void call(void Function() action) {
    final now = DateTime.now();
    if (_lastRun == null ||
        now.difference(_lastRun!) >= duration) {
      _lastRun = now;
      action();
    } else {
      _timer?.cancel();
      _timer = Timer(
        duration - now.difference(_lastRun!),
        () {
          _lastRun = DateTime.now();
          action();
        },
      );
    }
  }

  void dispose() {
    _timer?.cancel();
  }
}
