import 'package:flutter/foundation.dart';
import 'package:uuid/uuid.dart';
import '../core/constants/app_constants.dart';
import '../models/scene.dart';
import '../services/persistence/scene_storage.dart';

class SceneProvider extends ChangeNotifier {
  final SceneStorage _storage;
  List<Scene> _scenes = [];

  SceneProvider(this._storage) {
    _ensurePresetScenes();
    refresh();
  }

  List<Scene> get scenes => _scenes;
  List<Scene> get presetScenes => _scenes.where((s) => s.isPreset).toList();
  List<Scene> get customScenes => _scenes.where((s) => !s.isPreset).toList();

  void refresh() {
    _scenes = _storage.getAllScenes();
    notifyListeners();
  }

  void _ensurePresetScenes() {
    final existing = _storage.getPresetScenes();
    if (existing.isNotEmpty) return;

    for (final entry in AppConstants.presetScenes.entries) {
      final scene = Scene(
        id: 'preset_${entry.key.toLowerCase()}',
        name: entry.key,
        isPreset: true,
        brightness: entry.value.brightness,
        colorTempMireds: entry.value.mireds,
      );
      _storage.saveScene(scene);
    }
  }

  Future<void> createScene(Scene scene) async {
    await _storage.saveScene(scene);
    refresh();
  }

  Future<void> updateScene(Scene scene) async {
    await _storage.saveScene(scene);
    refresh();
  }

  Future<void> deleteScene(String id) async {
    await _storage.deleteScene(id);
    refresh();
  }

  Scene createNewScene() {
    return Scene(id: const Uuid().v4(), name: 'New Scene');
  }
}
