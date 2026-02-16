import 'package:hive/hive.dart';

part 'schedule.g.dart';

@HiveType(typeId: 3)
class Schedule extends HiveObject {
  @HiveField(0)
  final String id;

  @HiveField(1)
  String name;

  @HiveField(2)
  int hour;

  @HiveField(3)
  int minute;

  @HiveField(4)
  List<int> daysOfWeek; // 1=Mon, 7=Sun

  @HiveField(5)
  bool turnOn;

  @HiveField(6)
  int? brightness;

  @HiveField(7)
  int? colorTempMireds;

  @HiveField(8)
  double? colorX;

  @HiveField(9)
  double? colorY;

  @HiveField(10)
  List<String> lightIds;

  @HiveField(11)
  bool isEnabled;

  @HiveField(12)
  int? fadeDurationSeconds;

  Schedule({
    required this.id,
    required this.name,
    required this.hour,
    required this.minute,
    List<int>? daysOfWeek,
    this.turnOn = true,
    this.brightness,
    this.colorTempMireds,
    this.colorX,
    this.colorY,
    List<String>? lightIds,
    this.isEnabled = true,
    this.fadeDurationSeconds,
  })  : daysOfWeek = daysOfWeek ?? [],
        lightIds = lightIds ?? [];
}
