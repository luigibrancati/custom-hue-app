import 'dart:async';
import 'package:android_alarm_manager_plus/android_alarm_manager_plus.dart';
import 'package:flutter/widgets.dart';
import 'package:hive_flutter/hive_flutter.dart';
import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import '../../core/constants/app_constants.dart';
import '../../core/constants/ble_uuids.dart';
import '../../models/schedule.dart';
import '../../models/hue_light.dart';
import '../../models/room.dart';
import '../../models/scene.dart';
import '../../models/favorite_color.dart';
import '../ble/tlv_encoder.dart';

/// Top-level function for alarm callback. Runs in a separate isolate.
@pragma('vm:entry-point')
void alarmCallback() async {
  debugPrint('[AlarmCallback] invoked');
  WidgetsFlutterBinding.ensureInitialized();

  // Initialize Hive in the isolate
  await Hive.initFlutter();
  if (!Hive.isAdapterRegistered(0)) Hive.registerAdapter(HueLightAdapter());
  if (!Hive.isAdapterRegistered(1)) Hive.registerAdapter(RoomAdapter());
  if (!Hive.isAdapterRegistered(2)) Hive.registerAdapter(SceneAdapter());
  if (!Hive.isAdapterRegistered(3)) Hive.registerAdapter(ScheduleAdapter());
  if (!Hive.isAdapterRegistered(4)) Hive.registerAdapter(FavoriteColorAdapter());

  final schedulesBox = await Hive.openBox<Schedule>(AppConstants.schedulesBox);
  final lightsBox = await Hive.openBox<HueLight>(AppConstants.lightsBox);

  final now = DateTime.now();
  final currentDay = now.weekday;

  debugPrint('[AlarmCallback] fired at $now, checking ${schedulesBox.length} schedules');

  try {
    // Find matching schedules
    for (final schedule in schedulesBox.values) {
      debugPrint('[AlarmCallback] checking schedule "${schedule.name}" (enabled=${schedule.isEnabled}, days=${schedule.daysOfWeek}, time=${schedule.hour}:${schedule.minute.toString().padLeft(2, '0')})');
      if (!schedule.isEnabled) continue;
      if (schedule.daysOfWeek.isNotEmpty && !schedule.daysOfWeek.contains(currentDay)) continue;
      if (schedule.hour != now.hour) continue;
      if ((schedule.minute - now.minute).abs() > 1) continue;

      debugPrint('[AlarmCallback] executing "${schedule.name}" (turnOn=${schedule.turnOn})');
      // Execute the schedule
      final ble = FlutterReactiveBle();
      for (final lightId in schedule.lightIds) {
        final light = lightsBox.get(lightId);
        if (light == null) continue;

        // Hold the subscription open — canceling it disconnects the device.
        StreamSubscription<ConnectionStateUpdate>? subscription;
        try {
          final connectedCompleter = Completer<void>();
          subscription = ble
              .connectToDevice(
                id: light.macAddress,
                connectionTimeout: AppConstants.bleConnectionTimeout,
              )
              .listen((update) {
            if (update.connectionState == DeviceConnectionState.connected &&
                !connectedCompleter.isCompleted) {
              connectedCompleter.complete();
            }
          });

          await connectedCompleter.future.timeout(AppConstants.bleConnectionTimeout);

          // Build command
          final data = TlvEncoder.encodeCombined(
            on: schedule.turnOn,
            brightness: schedule.brightness,
            colorTempMireds: schedule.colorTempMireds,
            cieX: schedule.colorX != null
                ? (schedule.colorX! * 65535).round().clamp(0, 65535)
                : null,
            cieY: schedule.colorY != null
                ? (schedule.colorY! * 65535).round().clamp(0, 65535)
                : null,
          );

          await ble.writeCharacteristicWithResponse(
            QualifiedCharacteristic(
              characteristicId: BleUuids.combinedControlChar,
              serviceId: BleUuids.lightControlService,
              deviceId: light.macAddress,
            ),
            value: data,
          );
        } catch (e) {
          debugPrint('[AlarmCallback] BLE write failed for ${light.name}: $e');
        } finally {
          await subscription?.cancel();
        }
      }
    }
  } catch (e) {
    debugPrint('[AlarmCallback] Error during schedule execution: $e');
  } finally {
    // Reschedule all enabled weekly schedules as fresh one-shots.
    // periodic() uses setRepeating() which Android Doze mode defers; oneShotAt()
    // with allowWhileIdle uses setExactAndAllowWhileIdle() which is Doze-safe.
    // This always runs, even if BLE commands failed, so the next occurrence is
    // never missed due to a transient failure (e.g. light out of BLE range).
    await AndroidAlarmManager.initialize();
    for (final schedule in schedulesBox.values) {
      if (!schedule.isEnabled || schedule.daysOfWeek.isEmpty) continue;
      for (final day in schedule.daysOfWeek) {
        final id = _alarmId(schedule.id, day);
        final next = _nextOccurrence(schedule.hour, schedule.minute, day);
        await AndroidAlarmManager.oneShotAt(
          next,
          id,
          alarmCallback,
          exact: true,
          wakeup: true,
          allowWhileIdle: true,
          rescheduleOnReboot: true,
        );
      }
    }
  }

  await Hive.close();
}

int _alarmId(String scheduleId, int day) {
  return (scheduleId.hashCode.abs() % 100000000) * 10 + day;
}

DateTime _nextOccurrence(int hour, int minute, int dayOfWeek) {
  final now = DateTime.now();
  var date = DateTime(now.year, now.month, now.day, hour, minute);
  final currentDay = now.weekday;
  var daysUntil = dayOfWeek - currentDay;
  if (daysUntil < 0 || (daysUntil == 0 && date.isBefore(now))) {
    daysUntil += 7;
  }
  return date.add(Duration(days: daysUntil));
}
