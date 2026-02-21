// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'hue_light.dart';

// **************************************************************************
// TypeAdapterGenerator
// **************************************************************************

class HueLightAdapter extends TypeAdapter<HueLight> {
  @override
  final int typeId = 0;

  @override
  HueLight read(BinaryReader reader) {
    final numOfFields = reader.readByte();
    final fields = <int, dynamic>{
      for (int i = 0; i < numOfFields; i++) reader.readByte(): reader.read(),
    };
    return HueLight(
      id: fields[0] as String,
      name: fields[1] as String,
      macAddress: fields[2] as String,
      roomId: fields[3] as String?,
      supportsColor: fields[4] as bool? ?? true,
    );
  }

  @override
  void write(BinaryWriter writer, HueLight obj) {
    writer
      ..writeByte(5)
      ..writeByte(0)
      ..write(obj.id)
      ..writeByte(1)
      ..write(obj.name)
      ..writeByte(2)
      ..write(obj.macAddress)
      ..writeByte(3)
      ..write(obj.roomId)
      ..writeByte(4)
      ..write(obj.supportsColor);
  }

  @override
  int get hashCode => typeId.hashCode;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is HueLightAdapter &&
          runtimeType == other.runtimeType &&
          typeId == other.typeId;
}
