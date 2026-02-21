import 'package:flutter/material.dart';
import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import 'package:provider/provider.dart';
import 'app.dart';
import 'providers/ble_scan_provider.dart';
import 'providers/ble_connection_provider.dart';
import 'providers/light_control_provider.dart';
import 'providers/room_provider.dart';
import 'providers/scene_provider.dart';
import 'providers/schedule_provider.dart';
import 'providers/favorite_provider.dart';
import 'services/ble/ble_scanner_service.dart';
import 'services/ble/ble_connection_service.dart';
import 'services/ble/ble_light_control_service.dart';
import 'services/persistence/hive_service.dart';
import 'services/persistence/light_storage.dart';
import 'services/persistence/scene_storage.dart';
import 'services/persistence/schedule_storage.dart';
import 'services/persistence/favorite_storage.dart';
import 'services/scheduling/alarm_scheduler_service.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await HiveService.init();
  await AlarmSchedulerService.init();

  final ble = FlutterReactiveBle();
  final scannerService = BleScannerService(ble);
  final connectionService = BleConnectionService(ble);
  final lightControlService = BleLightControlService(ble);

  final lightControlProvider = LightControlProvider(lightControlService);
  final bleConnectionProvider = BleConnectionProvider(
    connectionService,
    onDeviceConnected: (id) => lightControlProvider.readState(id),
  );

  // Auto-reconnect to all previously paired lights
  for (final light in HiveService.lightsBox.values) {
    connectionService.connect(light.id);
  }

  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider(create: (_) => BleScanProvider(scannerService)),
        ChangeNotifierProvider.value(value: bleConnectionProvider),
        ChangeNotifierProvider.value(value: lightControlProvider),
        ChangeNotifierProvider(create: (_) => RoomProvider(LightStorage())),
        ChangeNotifierProvider(create: (_) => SceneProvider(SceneStorage())),
        ChangeNotifierProvider(
          create: (_) => ScheduleProvider(
              ScheduleStorage(), AlarmSchedulerService()),
        ),
        ChangeNotifierProvider(
            create: (_) => FavoriteProvider(FavoriteStorage())),
      ],
      child: const CustomHueApp(),
    ),
  );
}
