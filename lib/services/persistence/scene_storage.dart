import '../../models/scene.dart';
import 'hive_service.dart';

class SceneStorage {
  List<Scene> getAllScenes() => HiveService.scenesBox.values.toList();

  Scene? getScene(String id) => HiveService.scenesBox.get(id);

  Future<void> saveScene(Scene scene) async {
    await HiveService.scenesBox.put(scene.id, scene);
  }

  Future<void> deleteScene(String id) async {
    await HiveService.scenesBox.delete(id);
  }

  List<Scene> getPresetScenes() =>
      HiveService.scenesBox.values.where((s) => s.isPreset).toList();

  List<Scene> getCustomScenes() =>
      HiveService.scenesBox.values.where((s) => !s.isPreset).toList();
}
