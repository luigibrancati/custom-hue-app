import '../../models/hue_light.dart';
import '../../models/room.dart';
import 'hive_service.dart';

class LightStorage {
  List<HueLight> getAllLights() => HiveService.lightsBox.values.toList();

  HueLight? getLight(String id) => HiveService.lightsBox.get(id);

  Future<void> saveLight(HueLight light) async {
    await HiveService.lightsBox.put(light.id, light);
  }

  Future<void> deleteLight(String id) async {
    await HiveService.lightsBox.delete(id);
    // Remove from all rooms
    for (final room in HiveService.roomsBox.values) {
      if (room.lightIds.remove(id)) {
        await room.save();
      }
    }
  }

  Future<void> renameLight(String id, String name) async {
    final light = HiveService.lightsBox.get(id);
    if (light != null) {
      light.name = name;
      await light.save();
    }
  }

  // Room operations
  List<Room> getAllRooms() => HiveService.roomsBox.values.toList();

  Room? getRoom(String id) => HiveService.roomsBox.get(id);

  Future<void> saveRoom(Room room) async {
    await HiveService.roomsBox.put(room.id, room);
  }

  Future<void> deleteRoom(String id) async {
    // Unassign lights from this room
    for (final light in HiveService.lightsBox.values) {
      if (light.roomId == id) {
        light.roomId = null;
        await light.save();
      }
    }
    await HiveService.roomsBox.delete(id);
  }

  List<HueLight> getLightsInRoom(String roomId) {
    return HiveService.lightsBox.values
        .where((l) => l.roomId == roomId)
        .toList();
  }

  List<HueLight> getUnassignedLights() {
    return HiveService.lightsBox.values
        .where((l) => l.roomId == null)
        .toList();
  }
}
