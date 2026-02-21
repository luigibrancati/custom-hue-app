import 'package:flutter/foundation.dart';
import 'package:uuid/uuid.dart';
import '../models/hue_light.dart';
import '../models/room.dart';
import '../services/persistence/light_storage.dart';

class RoomProvider extends ChangeNotifier {
  final LightStorage _storage;
  List<Room> _rooms = [];
  List<HueLight> _allLights = [];

  RoomProvider(this._storage) {
    refresh();
  }

  List<Room> get rooms => _rooms;
  List<HueLight> get allLights => _allLights;

  void refresh() {
    _rooms = _storage.getAllRooms();
    _allLights = _storage.getAllLights();
    notifyListeners();
  }

  List<HueLight> getLightsInRoom(String roomId) =>
      _storage.getLightsInRoom(roomId);

  List<HueLight> get unassignedLights => _storage.getUnassignedLights();

  Future<void> createRoom(String name) async {
    final room = Room(id: const Uuid().v4(), name: name);
    await _storage.saveRoom(room);
    refresh();
  }

  Future<void> renameRoom(String id, String name) async {
    final room = _storage.getRoom(id);
    if (room != null) {
      room.name = name;
      await room.save();
      refresh();
    }
  }

  Future<void> deleteRoom(String id) async {
    await _storage.deleteRoom(id);
    refresh();
  }

  Future<void> addLightToRoom(String lightId, String roomId) async {
    final light = _storage.getLight(lightId);
    if (light != null) {
      light.roomId = roomId;
      await light.save();
      final room = _storage.getRoom(roomId);
      if (room != null && !room.lightIds.contains(lightId)) {
        room.lightIds.add(lightId);
        await room.save();
      }
      refresh();
    }
  }

  Future<void> removeLightFromRoom(String lightId, String roomId) async {
    final light = _storage.getLight(lightId);
    if (light != null) {
      light.roomId = null;
      await light.save();
      final room = _storage.getRoom(roomId);
      if (room != null) {
        room.lightIds.remove(lightId);
        await room.save();
      }
      refresh();
    }
  }

  Future<void> saveLight(HueLight light) async {
    await _storage.saveLight(light);
    refresh();
  }

  Future<void> renameLight(String id, String name) async {
    await _storage.renameLight(id, name);
    refresh();
  }

  Future<void> setLightSupportsColor(String id, bool supportsColor) async {
    await _storage.setSupportsColor(id, supportsColor);
    refresh();
  }

  Future<void> deleteLight(String id) async {
    await _storage.deleteLight(id);
    refresh();
  }
}
