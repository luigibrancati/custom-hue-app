import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../providers/schedule_provider.dart';
import '../../widgets/hue_app_bar.dart';
import 'widgets/weekly_grid.dart';

class WeeklyViewScreen extends StatelessWidget {
  const WeeklyViewScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final schedules = context.watch<ScheduleProvider>().schedules;

    return Scaffold(
      appBar: const HueAppBar(title: 'Weekly View'),
      body: SafeArea(
        top: false,
        child: SingleChildScrollView(
        padding: const EdgeInsets.all(16),
        child: WeeklyGrid(schedules: schedules),
        ),
      ),
    );
  }
}
