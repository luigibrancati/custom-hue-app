// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'favorite_color.dart';

// **************************************************************************
// TypeAdapterGenerator
// **************************************************************************

class FavoriteColorAdapter extends TypeAdapter<FavoriteColor> {
  @override
  final int typeId = 4;

  @override
  FavoriteColor read(BinaryReader reader) {
    final numOfFields = reader.readByte();
    final fields = <int, dynamic>{
      for (int i = 0; i < numOfFields; i++) reader.readByte(): reader.read(),
    };
    return FavoriteColor(
      id: fields[0] as String,
      name: fields[1] as String,
      colorX: fields[2] as double,
      colorY: fields[3] as double,
      colorTempMireds: fields[4] as int?,
      colorValue: fields[5] as int,
    );
  }

  @override
  void write(BinaryWriter writer, FavoriteColor obj) {
    writer
      ..writeByte(6)
      ..writeByte(0)
      ..write(obj.id)
      ..writeByte(1)
      ..write(obj.name)
      ..writeByte(2)
      ..write(obj.colorX)
      ..writeByte(3)
      ..write(obj.colorY)
      ..writeByte(4)
      ..write(obj.colorTempMireds)
      ..writeByte(5)
      ..write(obj.colorValue);
  }

  @override
  int get hashCode => typeId.hashCode;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is FavoriteColorAdapter &&
          runtimeType == other.runtimeType &&
          typeId == other.typeId;
}
