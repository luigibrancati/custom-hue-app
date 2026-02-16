import 'package:hive/hive.dart';

part 'hue_light.g.dart';

@HiveType(typeId: 0)
class HueLight extends HiveObject {
  @HiveField(0)
  final String id;

  @HiveField(1)
  String name;

  @HiveField(2)
  final String macAddress;

  @HiveField(3)
  String? roomId;

  HueLight({
    required this.id,
    required this.name,
    required this.macAddress,
    this.roomId,
  });
}
