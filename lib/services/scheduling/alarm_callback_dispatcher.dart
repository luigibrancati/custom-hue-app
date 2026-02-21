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
  WidgetsFlutterBinding.ensureInitialized();

  // Initialize Hive in the isolate
  await Hive.initFlutter();
  Hive.registerAdapter(HueLightAdapter());
  Hive.registerAdapter(RoomAdapter());
  Hive.registerAdapter(SceneAdapter());
  Hive.registerAdapter(ScheduleAdapter());
  Hive.registerAdapter(FavoriteColorAdapter());

  final schedulesBox = await Hive.openBox<Schedule>(AppConstants.schedulesBox);
  final lightsBox = await Hive.openBox<HueLight>(AppConstants.lightsBox);

  final now = DateTime.now();
  final currentDay = now.weekday;

  // Find matching schedules
  for (final schedule in schedulesBox.values) {
    if (!schedule.isEnabled) continue;
    if (!schedule.daysOfWeek.contains(currentDay)) continue;
    if (schedule.hour != now.hour) continue;
    if ((schedule.minute - now.minute).abs() > 2) continue;

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
      } catch (_) {
        // Best effort - light may be out of range
      } finally {
        await subscription?.cancel();
      }
    }
  }

  await Hive.close();
}
