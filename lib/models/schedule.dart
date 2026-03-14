import 'package:hive/hive.dart';

part 'schedule.g.dart';

enum ScheduleKind { wake, sleep }

@HiveType(typeId: 3)
class Schedule extends HiveObject {
  @HiveField(0)
  final String id;

  @HiveField(1)
  String name;

  @HiveField(2)
  int scheduledForEpochSeconds;

  @HiveField(3)
  int kindIndex;

  @HiveField(4)
  bool isEnabled;

  @HiveField(5)
  int fadeDurationSeconds;

  @HiveField(6)
  List<String> lightIds;

  @HiveField(7)
  Map<String, int> remoteScheduleIds;

  @HiveField(8)
  Map<String, String> remoteScheduleUuids;

  Schedule({
    required this.id,
    required this.name,
    required this.scheduledForEpochSeconds,
    this.kindIndex = 1,
    this.isEnabled = true,
    required this.fadeDurationSeconds,
    List<String>? lightIds,
    Map<String, int>? remoteScheduleIds,
    Map<String, String>? remoteScheduleUuids,
  })  : lightIds = lightIds ?? [],
        remoteScheduleIds = remoteScheduleIds ?? {},
        remoteScheduleUuids = remoteScheduleUuids ?? {};

  ScheduleKind get kind => ScheduleKind.values[kindIndex];
  set kind(ScheduleKind value) => kindIndex = value.index;

  String get title => name;
  set title(String value) => name = value;

  DateTime get scheduledForLocal =>
      DateTime.fromMillisecondsSinceEpoch(scheduledForEpochSeconds * 1000)
          .toLocal();

  set scheduledForLocal(DateTime value) {
    scheduledForEpochSeconds = value.toUtc().millisecondsSinceEpoch ~/ 1000;
  }

  int get hour => scheduledForLocal.hour;
  int get minute => scheduledForLocal.minute;
  List<int> get daysOfWeek => [scheduledForLocal.weekday];
  bool get isWake => kind == ScheduleKind.wake;
  bool get isSleep => kind == ScheduleKind.sleep;
  bool get isSynced =>
      lightIds.isNotEmpty &&
      remoteScheduleIds.length == lightIds.length &&
      remoteScheduleUuids.length == lightIds.length;
  int get pendingLightCount => lightIds.length - remoteScheduleIds.length;

  Schedule copyWith({
    String? id,
    String? name,
    int? scheduledForEpochSeconds,
    ScheduleKind? kind,
    bool? isEnabled,
    int? fadeDurationSeconds,
    List<String>? lightIds,
    Map<String, int>? remoteScheduleIds,
    Map<String, String>? remoteScheduleUuids,
  }) {
    return Schedule(
      id: id ?? this.id,
      name: name ?? this.name,
      scheduledForEpochSeconds:
          scheduledForEpochSeconds ?? this.scheduledForEpochSeconds,
      kindIndex: (kind ?? this.kind).index,
      isEnabled: isEnabled ?? this.isEnabled,
      fadeDurationSeconds: fadeDurationSeconds ?? this.fadeDurationSeconds,
      lightIds: lightIds ?? List<String>.from(this.lightIds),
      remoteScheduleIds:
          remoteScheduleIds ?? Map<String, int>.from(this.remoteScheduleIds),
      remoteScheduleUuids: remoteScheduleUuids ??
          Map<String, String>.from(this.remoteScheduleUuids),
    );
  }
}
