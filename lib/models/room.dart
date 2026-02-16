import 'package:hive/hive.dart';

part 'room.g.dart';

@HiveType(typeId: 1)
class Room extends HiveObject {
  @HiveField(0)
  final String id;

  @HiveField(1)
  String name;

  @HiveField(2)
  List<String> lightIds;

  Room({
    required this.id,
    required this.name,
    List<String>? lightIds,
  }) : lightIds = lightIds ?? [];
}
