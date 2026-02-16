import 'dart:typed_data';

/// TLV (Type-Length-Value) encoder/decoder for Hue combined control characteristic.
///
/// Tags:
/// - 0x01: On/Off (1 byte: 0x00=off, 0x01=on)
/// - 0x02: Brightness (1 byte: 1-254)
/// - 0x03: Color temperature (2 bytes LE: mireds)
/// - 0x04: Color (4 bytes: CIE x LE 16-bit, CIE y LE 16-bit)
class TlvEncoder {
  TlvEncoder._();

  static const tagOnOff = 0x01;
  static const tagBrightness = 0x02;
  static const tagColorTemp = 0x03;
  static const tagColor = 0x04;

  static Uint8List encode(Map<int, List<int>> fields) {
    final buffer = BytesBuilder();
    for (final entry in fields.entries) {
      buffer.addByte(entry.key);
      buffer.addByte(entry.value.length);
      buffer.add(entry.value);
    }
    return buffer.toBytes();
  }

  static Map<int, List<int>> decode(List<int> data) {
    final result = <int, List<int>>{};
    var i = 0;
    while (i + 1 < data.length) {
      final tag = data[i];
      final length = data[i + 1];
      i += 2;
      if (i + length > data.length) break;
      result[tag] = data.sublist(i, i + length);
      i += length;
    }
    return result;
  }

  static Uint8List encodeOnOff(bool on) {
    return encode({tagOnOff: [on ? 0x01 : 0x00]});
  }

  static Uint8List encodeBrightness(int brightness) {
    return encode({tagBrightness: [brightness.clamp(1, 254)]});
  }

  static Uint8List encodeColorTemp(int mireds) {
    return encode({
      tagColorTemp: [mireds & 0xFF, (mireds >> 8) & 0xFF],
    });
  }

  static Uint8List encodeColor(int cieX, int cieY) {
    return encode({
      tagColor: [
        cieX & 0xFF, (cieX >> 8) & 0xFF,
        cieY & 0xFF, (cieY >> 8) & 0xFF,
      ],
    });
  }

  static Uint8List encodeCombined({
    bool? on,
    int? brightness,
    int? colorTempMireds,
    int? cieX,
    int? cieY,
  }) {
    final fields = <int, List<int>>{};
    if (on != null) fields[tagOnOff] = [on ? 0x01 : 0x00];
    if (brightness != null) fields[tagBrightness] = [brightness.clamp(1, 254)];
    if (colorTempMireds != null) {
      fields[tagColorTemp] = [
        colorTempMireds & 0xFF,
        (colorTempMireds >> 8) & 0xFF,
      ];
    }
    if (cieX != null && cieY != null) {
      fields[tagColor] = [
        cieX & 0xFF, (cieX >> 8) & 0xFF,
        cieY & 0xFF, (cieY >> 8) & 0xFF,
      ];
    }
    return encode(fields);
  }
}
