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

    final isLegacyShape = fields.containsKey(12) ||
        fields[4] is List ||
        fields[5] is bool ||
        fields[6] is int? ||
        fields[7] is int?;

    if (isLegacyShape) {
      return Schedule(
        id: fields[0] as String,
        name: fields[1] as String? ?? 'Legacy schedule',
        scheduledForEpochSeconds: 0,
        kindIndex: ScheduleKind.sleep.index,
        isEnabled: false,
        fadeDurationSeconds: 0,
        lightIds: const [],
        remoteScheduleIds: const {},
        remoteScheduleUuids: const {},
      );
    }

    return Schedule(
      id: fields[0] as String,
      name: fields[1] as String,
      scheduledForEpochSeconds: fields[2] as int,
      kindIndex: fields[3] as int,
      isEnabled: fields[4] as bool,
      fadeDurationSeconds: fields[5] as int,
      lightIds: (fields[6] as List?)?.cast<String>(),
      remoteScheduleIds:
          (fields[7] as Map?)?.cast<String, int>() ?? const {},
      remoteScheduleUuids:
          (fields[8] as Map?)?.cast<String, String>() ?? const {},
    );
  }

  @override
  void write(BinaryWriter writer, Schedule obj) {
    writer
      ..writeByte(9)
      ..writeByte(0)
      ..write(obj.id)
      ..writeByte(1)
      ..write(obj.name)
      ..writeByte(2)
      ..write(obj.scheduledForEpochSeconds)
      ..writeByte(3)
      ..write(obj.kindIndex)
      ..writeByte(4)
      ..write(obj.isEnabled)
      ..writeByte(5)
      ..write(obj.fadeDurationSeconds)
      ..writeByte(6)
      ..write(obj.lightIds)
      ..writeByte(7)
      ..write(obj.remoteScheduleIds)
      ..writeByte(8)
      ..write(obj.remoteScheduleUuids);
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
