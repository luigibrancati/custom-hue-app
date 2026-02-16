// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'schedule.dart';

// **************************************************************************
// TypeAdapterGenerator
// **************************************************************************

class ScheduleAdapter extends TypeAdapter<Schedule> {
  @override
  final int typeId = 3;

  @override
  Schedule read(BinaryReader reader) {
    final numOfFields = reader.readByte();
    final fields = <int, dynamic>{
      for (int i = 0; i < numOfFields; i++) reader.readByte(): reader.read(),
    };
    return Schedule(
      id: fields[0] as String,
      name: fields[1] as String,
      hour: fields[2] as int,
      minute: fields[3] as int,
      daysOfWeek: (fields[4] as List?)?.cast<int>(),
      turnOn: fields[5] as bool,
      brightness: fields[6] as int?,
      colorTempMireds: fields[7] as int?,
      colorX: fields[8] as double?,
      colorY: fields[9] as double?,
      lightIds: (fields[10] as List?)?.cast<String>(),
      isEnabled: fields[11] as bool,
      fadeDurationSeconds: fields[12] as int?,
    );
  }

  @override
  void write(BinaryWriter writer, Schedule obj) {
    writer
      ..writeByte(13)
      ..writeByte(0)
      ..write(obj.id)
      ..writeByte(1)
      ..write(obj.name)
      ..writeByte(2)
      ..write(obj.hour)
      ..writeByte(3)
      ..write(obj.minute)
      ..writeByte(4)
      ..write(obj.daysOfWeek)
      ..writeByte(5)
      ..write(obj.turnOn)
      ..writeByte(6)
      ..write(obj.brightness)
      ..writeByte(7)
      ..write(obj.colorTempMireds)
      ..writeByte(8)
      ..write(obj.colorX)
      ..writeByte(9)
      ..write(obj.colorY)
      ..writeByte(10)
      ..write(obj.lightIds)
      ..writeByte(11)
      ..write(obj.isEnabled)
      ..writeByte(12)
      ..write(obj.fadeDurationSeconds);
  }

  @override
  int get hashCode => typeId.hashCode;

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
      other is ScheduleAdapter &&
          runtimeType == other.runtimeType &&
          typeId == other.typeId;
}
