import 'package:hive/hive.dart';

part 'scene.g.dart';

@HiveType(typeId: 2)
class Scene extends HiveObject {
  @HiveField(0)
  final String id;

  @HiveField(1)
  String name;

  @HiveField(2)
  final bool isPreset;

  @HiveField(3)
  int brightness;

  @HiveField(4)
  int? colorTempMireds;

  @HiveField(5)
  double? colorX;

  @HiveField(6)
  double? colorY;

  @HiveField(7)
  List<String> lightIds;

  Scene({
    required this.id,
    required this.name,
    this.isPreset = false,
    this.brightness = 127,
    this.colorTempMireds,
    this.colorX,
    this.colorY,
    List<String>? lightIds,
  }) : lightIds = lightIds ?? [];
}
