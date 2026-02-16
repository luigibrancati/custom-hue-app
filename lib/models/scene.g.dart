// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'scene.dart';

// **************************************************************************
// TypeAdapterGenerator
// **************************************************************************

class SceneAdapter extends TypeAdapter<Scene> {
  @override
  final int typeId = 2;

  @override
  Scene read(BinaryReader reader) {
    final numOfFields = reader.readByte();
    final fields = <int, dynamic>{
      for (int i = 0; i < numOfFields; i++) reader.readByte(): reader.read(),
    };
    return Scene(
      id: fields[0] as String,
      name: fields[1] as String,
      isPreset: fields[2] as bool,
      brightness: fields[3] as int,
      colorTempMireds: fields[4] as int?,
      colorX: fields[5] as double?,
      colorY: fields[6] as double?,
      lightIds: (fields[7] as List?)?.cast<String>(),
    );
  }

  @override
  void write(BinaryWriter writer, Scene obj) {
    writer
      ..writeByte(8)
      ..writeByte(0)
      ..write(obj.id)
      ..writeByte(1)
      ..write(obj.name)
      ..writeByte(2)
      ..write(obj.isPreset)
      ..writeByte(3)
      ..write(obj.brightness)
      ..writeByte(4)
      ..write(obj.colorTempMireds)
      ..writeByte(5)
      ..write(obj.colorX)
      ..writeByte(6)
      ..write(obj.colorY)
      ..writeByte(7)
      ..write(obj.lightIds);
  }

  @override
  int get hashCode => typeId.hashCode;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is SceneAdapter &&
          runtimeType == other.runtimeType &&
          typeId == other.typeId;
}
