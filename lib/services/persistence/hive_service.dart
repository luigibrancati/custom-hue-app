import 'package:hive_flutter/hive_flutter.dart';
import '../../core/constants/app_constants.dart';
import '../../models/hue_light.dart';
import '../../models/room.dart';
import '../../models/scene.dart';
import '../../models/schedule.dart';
import '../../models/favorite_color.dart';

class HiveService {
  static Future<void> init() async {
    await Hive.initFlutter();

    Hive.registerAdapter(HueLightAdapter());
    Hive.registerAdapter(RoomAdapter());
    Hive.registerAdapter(SceneAdapter());
    Hive.registerAdapter(ScheduleAdapter());
    Hive.registerAdapter(FavoriteColorAdapter());

    await Future.wait([
      Hive.openBox<HueLight>(AppConstants.lightsBox),
      Hive.openBox<Room>(AppConstants.roomsBox),
      Hive.openBox<Scene>(AppConstants.scenesBox),
      Hive.openBox<Schedule>(AppConstants.schedulesBox),
      Hive.openBox<FavoriteColor>(AppConstants.favoritesBox),
    ]);
  }

  static Box<HueLight> get lightsBox => Hive.box<HueLight>(AppConstants.lightsBox);
  static Box<Room> get roomsBox => Hive.box<Room>(AppConstants.roomsBox);
  static Box<Scene> get scenesBox => Hive.box<Scene>(AppConstants.scenesBox);
  static Box<Schedule> get schedulesBox => Hive.box<Schedule>(AppConstants.schedulesBox);
  static Box<FavoriteColor> get favoritesBox => Hive.box<FavoriteColor>(AppConstants.favoritesBox);
}
