import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../models/schedule.dart';
import '../../providers/schedule_provider.dart';
import '../../providers/room_provider.dart';
import '../../services/ble/ble_schedule_codec.dart';
import '../../widgets/hue_app_bar.dart';

class ScheduleEditorScreen extends StatefulWidget {
  final Schedule schedule;

  const ScheduleEditorScreen({super.key, required this.schedule});

  @override
  State<ScheduleEditorScreen> createState() => _ScheduleEditorScreenState();
}

class _ScheduleEditorScreenState extends State<ScheduleEditorScreen> {
  late final TextEditingController _nameController;
  late DateTime _scheduledFor;
  late ScheduleKind _kind;
  late bool _isEnabled;
  late List<String> _selectedLightIds;
  late int _fadeDuration;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController(text: widget.schedule.title);
    _scheduledFor = widget.schedule.scheduledForLocal;
    _kind = widget.schedule.kind;
    _isEnabled = widget.schedule.isEnabled;
    _selectedLightIds = List.from(widget.schedule.lightIds);
    _fadeDuration = widget.schedule.fadeDurationSeconds;
  }

  @override
  void dispose() {
    _nameController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final allLights = context.watch<RoomProvider>().allLights;
    final scheduleProvider = context.watch<ScheduleProvider>();
    final kindOptions = ScheduleKind.values;
    final scheduledDateLabel = MaterialLocalizations.of(context)
        .formatFullDate(_scheduledFor);
    final scheduledTimeLabel = TimeOfDay.fromDateTime(_scheduledFor)
        .format(context);

    return Scaffold(
      appBar: HueAppBar(
        title: 'Edit Schedule',
        actions: [
          IconButton(
            icon: const Icon(Icons.delete),
            onPressed: scheduleProvider.isBusy ? null : _deleteSchedule,
          ),
        ],
      ),
      body: SafeArea(
        top: false,
        child: ListView(
          padding: const EdgeInsets.all(16),
          children: [
            DropdownButtonFormField<ScheduleKind>(
              initialValue: _kind,
              decoration: const InputDecoration(
                labelText: 'Schedule Type',
                border: OutlineInputBorder(),
              ),
              items: kindOptions
                  .map(
                    (kind) => DropdownMenuItem(
                      value: kind,
                      child: Text(kind == ScheduleKind.wake ? 'Wake up' : 'Go to sleep'),
                    ),
                  )
                  .toList(),
              onChanged: (value) {
                if (value == null) {
                  return;
                }
                setState(() {
                  final previousKind = _kind;
                  _kind = value;
                  final previousDefault = _defaultTitle(previousKind);
                  if (_nameController.text.trim().isEmpty ||
                      _nameController.text.trim() == previousDefault) {
                    _nameController.text = _defaultTitle(value);
                  }
                  final previousFade = BleScheduleCodec.defaultFadeForKind(
                    previousKind == ScheduleKind.wake
                        ? BleScheduleKind.wake
                        : BleScheduleKind.sleep,
                  );
                  if (_fadeDuration == previousFade) {
                    _fadeDuration = BleScheduleCodec.defaultFadeForKind(
                      value == ScheduleKind.wake
                          ? BleScheduleKind.wake
                          : BleScheduleKind.sleep,
                    );
                  }
                });
              },
            ),
            const SizedBox(height: 16),
            TextField(
              controller: _nameController,
              decoration: const InputDecoration(
                labelText: 'Schedule Title',
                border: OutlineInputBorder(),
              ),
            ),
            const SizedBox(height: 24),
            ListTile(
              contentPadding: EdgeInsets.zero,
              leading: const Icon(Icons.event),
              title: Text(scheduledDateLabel),
              subtitle: Text(scheduledTimeLabel),
              onTap: _pickDateTime,
            ),
            const SizedBox(height: 8),
            SwitchListTile(
              contentPadding: EdgeInsets.zero,
              title: const Text('Enabled'),
              subtitle: const Text('Disabled schedules stay stored on the bulb'),
              value: _isEnabled,
              onChanged: (value) => setState(() => _isEnabled = value),
            ),
            const SizedBox(height: 16),
            Text(
              _kind == ScheduleKind.wake
                  ? 'Fade in: ${_fadeDuration ~/ 60}m'
                  : 'Fade out: ${_fadeDuration ~/ 60}m',
            ),
            Slider(
              value: _fadeDuration.toDouble(),
              min: 0,
              max: 1800,
              divisions: 30,
              label: '${_fadeDuration ~/ 60}m',
              onChanged: (value) => setState(() => _fadeDuration = value.round()),
            ),
            const SizedBox(height: 24),
            Text('Bulbs', style: Theme.of(context).textTheme.titleSmall),
            const SizedBox(height: 8),
            ...allLights.map(
              (light) => CheckboxListTile(
                title: Text(light.name),
                subtitle: Text(light.id),
                value: _selectedLightIds.contains(light.id),
                onChanged: (selected) {
                  setState(() {
                    if (selected == true) {
                      _selectedLightIds.add(light.id);
                    } else {
                      _selectedLightIds.remove(light.id);
                    }
                  });
                },
              ),
            ),
            const SizedBox(height: 24),
            FilledButton(
              onPressed: scheduleProvider.isBusy ? null : _saveSchedule,
              child: Text(scheduleProvider.isBusy ? 'Saving...' : 'Save Schedule'),
            ),
          ],
        ),
      ),
    );
  }

  Future<void> _pickDateTime() async {
    final date = await showDatePicker(
      context: context,
      initialDate: _scheduledFor,
      firstDate: DateTime.now().subtract(const Duration(days: 1)),
      lastDate: DateTime.now().add(const Duration(days: 365)),
    );
    if (date == null || !mounted) {
      return;
    }

    final time = await showTimePicker(
      context: context,
      initialTime: TimeOfDay.fromDateTime(_scheduledFor),
    );
    if (time != null) {
      setState(() {
        _scheduledFor = DateTime(
          date.year,
          date.month,
          date.day,
          time.hour,
          time.minute,
        );
      });
    }
  }

  Future<void> _saveSchedule() async {
    final title = _nameController.text.trim();
    if (title.isEmpty || _selectedLightIds.isEmpty) {
      return;
    }

    widget.schedule.title = title;
    widget.schedule.scheduledForLocal = _scheduledFor;
    widget.schedule.kind = _kind;
    widget.schedule.isEnabled = _isEnabled;
    widget.schedule.fadeDurationSeconds = _fadeDuration;
    widget.schedule.lightIds = _selectedLightIds;

    final provider = context.read<ScheduleProvider>();
    final isExisting =
        provider.schedules.any((s) => s.id == widget.schedule.id);
    if (isExisting) {
      await provider.updateSchedule(widget.schedule);
    } else {
      await provider.createSchedule(widget.schedule);
    }
    if (mounted) Navigator.pop(context);
  }

  String _defaultTitle(ScheduleKind kind) {
    return BleScheduleCodec.defaultTitleForKind(
      kind == ScheduleKind.wake ? BleScheduleKind.wake : BleScheduleKind.sleep,
    );
  }

  void _deleteSchedule() {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Delete schedule?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              context
                  .read<ScheduleProvider>()
                  .deleteSchedule(widget.schedule.id);
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
