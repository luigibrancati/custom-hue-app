import 'package:flutter/material.dart';

class FadeControls extends StatefulWidget {
  final bool isFading;
  final VoidCallback onFadeIn;
  final VoidCallback onFadeOut;
  final VoidCallback onStop;
  final ValueChanged<Duration> onDurationChanged;
  final Duration fadeDuration;

  const FadeControls({
    super.key,
    required this.isFading,
    required this.onFadeIn,
    required this.onFadeOut,
    required this.onStop,
    required this.onDurationChanged,
    required this.fadeDuration,
  });

  @override
  State<FadeControls> createState() => _FadeControlsState();
}

class _FadeControlsState extends State<FadeControls> {
  static const _durations = [
    Duration(seconds: 10),
    Duration(seconds: 30),
    Duration(minutes: 1),
    Duration(minutes: 5),
    Duration(minutes: 10),
    Duration(minutes: 30),
  ];

  String _formatDuration(Duration d) {
    if (d.inMinutes >= 1) return '${d.inMinutes}m';
    return '${d.inSeconds}s';
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Padding(
          padding: EdgeInsets.symmetric(horizontal: 16),
          child: Text('Fade Controls'),
        ),
        const SizedBox(height: 8),
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: 16),
          child: Row(
            children: [
              const Text('Duration: '),
              Expanded(
                child: SingleChildScrollView(
                  scrollDirection: Axis.horizontal,
                  child: Row(
                    children: _durations.map((d) => Padding(
                          padding: const EdgeInsets.symmetric(horizontal: 2),
                          child: ChoiceChip(
                            label: Text(_formatDuration(d)),
                            selected: widget.fadeDuration == d,
                            onSelected: (_) => widget.onDurationChanged(d),
                            visualDensity: VisualDensity.compact,
                          ),
                        )).toList(),
                  ),
                ),
              ),
            ],
          ),
        ),
        const SizedBox(height: 12),
        Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton.icon(
              onPressed: widget.isFading ? null : widget.onFadeIn,
              icon: const Icon(Icons.wb_sunny),
              label: const Text('Fade In'),
            ),
            const SizedBox(width: 12),
            if (widget.isFading)
              ElevatedButton.icon(
                onPressed: widget.onStop,
                icon: const Icon(Icons.stop),
                label: const Text('Stop'),
                style: ElevatedButton.styleFrom(
                    backgroundColor: Colors.red[700]),
              )
            else
              ElevatedButton.icon(
                onPressed: widget.onFadeOut,
                icon: const Icon(Icons.nightlight),
                label: const Text('Fade Out'),
              ),
          ],
        ),
      ],
    );
  }
}
