import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../core/constants/app_constants.dart';
import '../../models/schedule.dart';
import '../../providers/schedule_provider.dart';
import '../../providers/room_provider.dart';
import '../../widgets/hue_app_bar.dart';
import 'widgets/day_selector.dart';

class ScheduleEditorScreen extends StatefulWidget {
  final Schedule schedule;

  const ScheduleEditorScreen({super.key, required this.schedule});

  @override
  State<ScheduleEditorScreen> createState() => _ScheduleEditorScreenState();
}

class _ScheduleEditorScreenState extends State<ScheduleEditorScreen> {
  late final TextEditingController _nameController;
  late int _hour;
  late int _minute;
  late List<int> _daysOfWeek;
  late bool _turnOn;
  late int _brightness;
  late int _colorTempMireds;
  late List<String> _selectedLightIds;
  late int? _fadeDuration;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController(text: widget.schedule.name);
    _hour = widget.schedule.hour;
    _minute = widget.schedule.minute;
    _daysOfWeek = List.from(widget.schedule.daysOfWeek);
    _turnOn = widget.schedule.turnOn;
    _brightness = widget.schedule.brightness ?? 254;
    _colorTempMireds = widget.schedule.colorTempMireds ?? 300;
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

    return Scaffold(
      appBar: HueAppBar(
        title: 'Edit Schedule',
        actions: [
          IconButton(
            icon: const Icon(Icons.delete),
            onPressed: _deleteSchedule,
          ),
        ],
      ),
      body: SafeArea(
        top: false,
        child: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          TextField(
            controller: _nameController,
            decoration: const InputDecoration(
              labelText: 'Schedule Name',
              border: OutlineInputBorder(),
            ),
          ),
          const SizedBox(height: 24),
          // Time picker
          ListTile(
            leading: const Icon(Icons.access_time),
            title: Text(
              '${_hour.toString().padLeft(2, '0')}:${_minute.toString().padLeft(2, '0')}',
              style: Theme.of(context).textTheme.headlineMedium,
            ),
            onTap: _pickTime,
          ),
          const SizedBox(height: 16),
          Text('Repeat on', style: Theme.of(context).textTheme.titleSmall),
          const SizedBox(height: 8),
          DaySelector(
            selectedDays: _daysOfWeek,
            onChanged: (days) => setState(() => _daysOfWeek = days),
          ),
          const SizedBox(height: 24),
          SwitchListTile(
            title: const Text('Turn lights on'),
            subtitle: Text(_turnOn ? 'Lights will turn on' : 'Lights will turn off'),
            value: _turnOn,
            onChanged: (v) => setState(() => _turnOn = v),
          ),
          if (_turnOn) ...[
            const SizedBox(height: 16),
            Text('Brightness: ${(_brightness / 254 * 100).round()}%'),
            Slider(
              value: _brightness.toDouble(),
              min: 1,
              max: 254,
              onChanged: (v) => setState(() => _brightness = v.round()),
            ),
            const SizedBox(height: 8),
            Text(
                'Color Temperature: ${(1000000 / _colorTempMireds).round()}K'),
            Slider(
              value: _colorTempMireds.toDouble(),
              min: AppConstants.minMireds.toDouble(),
              max: AppConstants.maxMireds.toDouble(),
              onChanged: (v) =>
                  setState(() => _colorTempMireds = v.round()),
            ),
          ],
          const SizedBox(height: 16),
          SwitchListTile(
            title: const Text('Fade transition'),
            subtitle: _fadeDuration != null
                ? Text('${_fadeDuration! ~/ 60} min ${_fadeDuration! % 60} sec')
                : null,
            value: _fadeDuration != null,
            onChanged: (v) =>
                setState(() => _fadeDuration = v ? 30 : null),
          ),
          if (_fadeDuration != null) ...[
            Slider(
              value: _fadeDuration!.toDouble(),
              min: 10,
              max: 1800,
              divisions: 35,
              label: '${_fadeDuration! ~/ 60}m ${_fadeDuration! % 60}s',
              onChanged: (v) =>
                  setState(() => _fadeDuration = v.round()),
            ),
          ],
          const SizedBox(height: 24),
          Text('Lights', style: Theme.of(context).textTheme.titleSmall),
          const SizedBox(height: 8),
          ...allLights.map((light) => CheckboxListTile(
                title: Text(light.name),
                value: _selectedLightIds.contains(light.id),
                onChanged: (v) {
                  setState(() {
                    if (v == true) {
                      _selectedLightIds.add(light.id);
                    } else {
                      _selectedLightIds.remove(light.id);
                    }
                  });
                },
              )),
          const SizedBox(height: 24),
          FilledButton(
            onPressed: _saveSchedule,
            child: const Text('Save Schedule'),
          ),
        ],
        ),
      ),
    );
  }

  Future<void> _pickTime() async {
    final time = await showTimePicker(
      context: context,
      initialTime: TimeOfDay(hour: _hour, minute: _minute),
    );
    if (time != null) {
      setState(() {
        _hour = time.hour;
        _minute = time.minute;
      });
    }
  }

  void _saveSchedule() {
    widget.schedule.name = _nameController.text.trim();
    widget.schedule.hour = _hour;
    widget.schedule.minute = _minute;
    widget.schedule.daysOfWeek = _daysOfWeek;
    widget.schedule.turnOn = _turnOn;
    widget.schedule.brightness = _turnOn ? _brightness : null;
    widget.schedule.colorTempMireds = _turnOn ? _colorTempMireds : null;
    widget.schedule.lightIds = _selectedLightIds;
    widget.schedule.fadeDurationSeconds = _fadeDuration;

    context.read<ScheduleProvider>().createSchedule(widget.schedule);
    Navigator.pop(context);
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
