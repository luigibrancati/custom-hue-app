import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../providers/room_provider.dart';
import '../../providers/ble_connection_provider.dart';
import '../../providers/light_control_provider.dart';
import '../../models/hue_light.dart';
import '../../widgets/empty_state.dart';
import '../scan/scan_screen.dart';
import '../light_control/light_control_screen.dart';
import '../scenes/scenes_screen.dart';
import '../schedules/schedules_screen.dart';
import '../settings/settings_screen.dart';
import 'widgets/light_tile.dart';
import 'widgets/room_tab_bar.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  int _navIndex = 0;
  int _roomTabIndex = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: IndexedStack(
        index: _navIndex,
        children: [
          _buildLightsTab(),
          const ScenesScreen(),
          const SchedulesScreen(),
          const SettingsScreen(),
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _navIndex,
        onTap: (i) => setState(() => _navIndex = i),
        type: BottomNavigationBarType.fixed,
        items: const [
          BottomNavigationBarItem(icon: Icon(Icons.lightbulb), label: 'Lights'),
          BottomNavigationBarItem(
              icon: Icon(Icons.palette), label: 'Scenes'),
          BottomNavigationBarItem(
              icon: Icon(Icons.schedule), label: 'Schedules'),
          BottomNavigationBarItem(
              icon: Icon(Icons.settings), label: 'Settings'),
        ],
      ),
      floatingActionButton: _navIndex == 0
          ? FloatingActionButton(
              onPressed: () => Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const ScanScreen()),
              ),
              child: const Icon(Icons.bluetooth_searching),
            )
          : null,
    );
  }

  Widget _buildLightsTab() {
    final roomProvider = context.watch<RoomProvider>();
    final rooms = roomProvider.rooms;
    final allLights = roomProvider.allLights;

    List<HueLight> displayLights;
    if (_roomTabIndex == 0) {
      displayLights = allLights;
    } else if (_roomTabIndex <= rooms.length) {
      displayLights = roomProvider.getLightsInRoom(rooms[_roomTabIndex - 1].id);
    } else {
      displayLights = allLights;
    }

    return SafeArea(
      child: Column(
        children: [
          Padding(
            padding: const EdgeInsets.fromLTRB(16, 16, 16, 8),
            child: Row(
              children: [
                Text('Custom Hue',
                    style: Theme.of(context).textTheme.headlineMedium),
              ],
            ),
          ),
          if (rooms.isNotEmpty)
            RoomTabBar(
              rooms: rooms,
              selectedIndex: _roomTabIndex,
              onSelected: (i) => setState(() => _roomTabIndex = i),
            ),
          const SizedBox(height: 8),
          Expanded(
            child: displayLights.isEmpty
                ? EmptyState(
                    icon: Icons.lightbulb_outline,
                    title: 'No lights found',
                    subtitle: 'Tap the scan button to discover Hue lights',
                    action: ElevatedButton.icon(
                      onPressed: () => Navigator.push(
                        context,
                        MaterialPageRoute(builder: (_) => const ScanScreen()),
                      ),
                      icon: const Icon(Icons.bluetooth_searching),
                      label: const Text('Scan for lights'),
                    ),
                  )
                : GridView.builder(
                    padding: const EdgeInsets.all(8),
                    gridDelegate:
                        const SliverGridDelegateWithFixedCrossAxisCount(
                      crossAxisCount: 2,
                      childAspectRatio: 1.2,
                    ),
                    itemCount: displayLights.length,
                    itemBuilder: (context, index) {
                      final light = displayLights[index];
                      return LightTile(
                        light: light,
                        onTap: () => _openLightControl(light),
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }

  void _openLightControl(HueLight light) {
    final connectionProvider = context.read<BleConnectionProvider>();
    if (connectionProvider.isConnected(light.macAddress)) {
      context.read<LightControlProvider>().readState(light.macAddress);
    }
    Navigator.push(
      context,
      MaterialPageRoute(
        builder: (_) => LightControlScreen(light: light),
      ),
    );
  }
}
