import 'dart:async';
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

  await Hive.close();
}
