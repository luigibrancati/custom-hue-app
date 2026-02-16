import 'package:hive/hive.dart';

part 'favorite_color.g.dart';

@HiveType(typeId: 4)
class FavoriteColor extends HiveObject {
  @HiveField(0)
  final String id;

  @HiveField(1)
  String name;

  @HiveField(2)
  double colorX;

  @HiveField(3)
  double colorY;

  @HiveField(4)
  int? colorTempMireds;

  @HiveField(5)
  int colorValue; // Flutter Color value for display

  FavoriteColor({
    required this.id,
    required this.name,
    required this.colorX,
    required this.colorY,
    this.colorTempMireds,
    required this.colorValue,
  });
}
