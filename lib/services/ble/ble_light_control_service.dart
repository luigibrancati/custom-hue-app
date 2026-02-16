import 'package:flutter_reactive_ble/flutter_reactive_ble.dart';
import '../../core/constants/ble_uuids.dart';
import '../../core/utils/color_utils.dart';
import '../../models/light_state.dart';
import 'tlv_encoder.dart';

class BleLightControlService {
  final FlutterReactiveBle _ble;

  BleLightControlService(this._ble);

  QualifiedCharacteristic _char(String deviceId, Uuid charUuid) {
    return QualifiedCharacteristic(
      characteristicId: charUuid,
      serviceId: BleUuids.lightControlService,
      deviceId: deviceId,
    );
  }

  Future<void> setOnOff(String deviceId, bool on) async {
    final data = TlvEncoder.encodeOnOff(on);
    await _ble.writeCharacteristicWithResponse(
      _char(deviceId, BleUuids.combinedControlChar),
      value: data,
    );
  }

  Future<void> setBrightness(String deviceId, int brightness) async {
    final data = TlvEncoder.encodeBrightness(brightness);
    await _ble.writeCharacteristicWithResponse(
      _char(deviceId, BleUuids.combinedControlChar),
      value: data,
    );
  }

  Future<void> setColorTemp(String deviceId, int mireds) async {
    final data = TlvEncoder.encodeColorTemp(mireds);
    await _ble.writeCharacteristicWithResponse(
      _char(deviceId, BleUuids.combinedControlChar),
      value: data,
    );
  }

  Future<void> setColor(String deviceId, double cieX, double cieY) async {
    final xInt = (cieX * 65535).round().clamp(0, 65535);
    final yInt = (cieY * 65535).round().clamp(0, 65535);
    final data = TlvEncoder.encodeColor(xInt, yInt);
    await _ble.writeCharacteristicWithResponse(
      _char(deviceId, BleUuids.combinedControlChar),
      value: data,
    );
  }

  Future<void> setCombined(
    String deviceId, {
    bool? on,
    int? brightness,
    int? colorTempMireds,
    double? cieX,
    double? cieY,
  }) async {
    final data = TlvEncoder.encodeCombined(
      on: on,
      brightness: brightness,
      colorTempMireds: colorTempMireds,
      cieX: cieX != null ? (cieX * 65535).round().clamp(0, 65535) : null,
      cieY: cieY != null ? (cieY * 65535).round().clamp(0, 65535) : null,
    );
    await _ble.writeCharacteristicWithResponse(
      _char(deviceId, BleUuids.combinedControlChar),
      value: data,
    );
  }

  Future<LightState> readState(String deviceId) async {
    try {
      final data = await _ble.readCharacteristic(
        _char(deviceId, BleUuids.combinedControlChar),
      );
      final fields = TlvEncoder.decode(data);

      final isOn = fields[TlvEncoder.tagOnOff]?.first == 0x01;
      final brightness = fields[TlvEncoder.tagBrightness]?.first ?? 127;

      int? mireds;
      if (fields.containsKey(TlvEncoder.tagColorTemp)) {
        final b = fields[TlvEncoder.tagColorTemp]!;
        mireds = b[0] | (b[1] << 8);
      }

      double colorX = 0.3127, colorY = 0.3290;
      if (fields.containsKey(TlvEncoder.tagColor)) {
        final b = fields[TlvEncoder.tagColor]!;
        (colorX, colorY) = ColorUtils.bytesToCieXy(b);
      }

      return LightState(
        isOn: isOn,
        brightness: brightness,
        colorX: colorX,
        colorY: colorY,
        colorTempMireds: mireds,
        displayColor: mireds != null
            ? ColorUtils.miredsToColor(mireds)
            : ColorUtils.cieXyToColor(colorX, colorY, 1.0),
      );
    } catch (_) {
      return const LightState();
    }
  }

  Future<String?> readDeviceName(String deviceId) async {
    try {
      final data = await _ble.readCharacteristic(
        QualifiedCharacteristic(
          characteristicId: BleUuids.deviceNameChar,
          serviceId: BleUuids.deviceConfigService,
          deviceId: deviceId,
        ),
      );
      return String.fromCharCodes(data);
    } catch (_) {
      return null;
    }
  }
}
