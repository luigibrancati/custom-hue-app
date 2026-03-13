package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.google.ar.core.ImageMetadata;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.tika.fork.ForkServer;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class NonBlockingJsonParser extends NonBlockingJsonParserBase implements ByteArrayFeeder {
    protected byte[] _inputBuffer;
    protected int _origBufferLen;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public NonBlockingJsonParser(IOContext iOContext, int i10, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i10, byteQuadsCanonicalizer);
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
    }

    private final int _decodeCharEscape() {
        return this._inputEnd - this._inputPtr < 5 ? _decodeSplitEscaped(0, -1) : _decodeFastCharEscape();
    }

    private final int _decodeFastCharEscape() {
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return 8;
        }
        if (b10 == 102) {
            return 12;
        }
        if (b10 == 110) {
            return 10;
        }
        if (b10 == 114) {
            return 13;
        }
        if (b10 == 116) {
            return 9;
        }
        if (b10 != 117) {
            return _handleUnrecognizedCharacterEscape((char) b10);
        }
        this._inputPtr = i10 + 2;
        byte b11 = bArr[i11];
        int iCharToHex = CharTypes.charToHex(b11);
        if (iCharToHex >= 0) {
            byte[] bArr2 = this._inputBuffer;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            b11 = bArr2[i12];
            int iCharToHex2 = CharTypes.charToHex(b11);
            if (iCharToHex2 >= 0) {
                int i13 = (iCharToHex << 4) | iCharToHex2;
                byte[] bArr3 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                byte b12 = bArr3[i14];
                int iCharToHex3 = CharTypes.charToHex(b12);
                if (iCharToHex3 >= 0) {
                    int i15 = (i13 << 4) | iCharToHex3;
                    byte[] bArr4 = this._inputBuffer;
                    int i16 = this._inputPtr;
                    this._inputPtr = i16 + 1;
                    b12 = bArr4[i16];
                    int iCharToHex4 = CharTypes.charToHex(b12);
                    if (iCharToHex4 >= 0) {
                        return (i15 << 4) | iCharToHex4;
                    }
                }
                b11 = b12;
            }
        }
        _reportUnexpectedChar(b11 & ForkServer.ERROR, "expected a hex-digit for character escape sequence");
        return -1;
    }

    private int _decodeSplitEscaped(int i10, int i11) {
        int i12 = this._inputPtr;
        int i13 = this._inputEnd;
        if (i12 >= i13) {
            this._quoted32 = i10;
            this._quotedDigits = i11;
            return -1;
        }
        byte[] bArr = this._inputBuffer;
        int i14 = i12 + 1;
        this._inputPtr = i14;
        byte b10 = bArr[i12];
        if (i11 == -1) {
            if (b10 == 34 || b10 == 47 || b10 == 92) {
                return b10;
            }
            if (b10 == 98) {
                return 8;
            }
            if (b10 == 102) {
                return 12;
            }
            if (b10 == 110) {
                return 10;
            }
            if (b10 == 114) {
                return 13;
            }
            if (b10 == 116) {
                return 9;
            }
            if (b10 != 117) {
                return _handleUnrecognizedCharacterEscape((char) b10);
            }
            i11 = 0;
            if (i14 >= i13) {
                this._quotedDigits = 0;
                this._quoted32 = 0;
                return -1;
            }
            this._inputPtr = i12 + 2;
            b10 = bArr[i14];
        }
        int i15 = b10 & ForkServer.ERROR;
        while (true) {
            int iCharToHex = CharTypes.charToHex(i15);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(i15 & 255, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | iCharToHex;
            i11++;
            if (i11 == 4) {
                return i10;
            }
            int i16 = this._inputPtr;
            if (i16 >= this._inputEnd) {
                this._quotedDigits = i11;
                this._quoted32 = i10;
                return -1;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i16 + 1;
            i15 = bArr2[i16] & ForkServer.ERROR;
        }
    }

    private final boolean _decodeSplitMultiByte(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            int i_decodeSplitEscaped = _decodeSplitEscaped(0, -1);
            if (i_decodeSplitEscaped < 0) {
                this._minorState = 41;
                return false;
            }
            this._textBuffer.append((char) i_decodeSplitEscaped);
            return true;
        }
        if (i11 == 2) {
            if (!z10) {
                this._minorState = 42;
                this._pending32 = i10;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            this._textBuffer.append((char) _decodeUTF8_2(i10, bArr[i12]));
            return true;
        }
        if (i11 == 3) {
            int i13 = i10 & 15;
            if (z10) {
                byte[] bArr2 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                return _decodeSplitUTF8_3(i13, 1, bArr2[i14]);
            }
            this._minorState = 43;
            this._pending32 = i13;
            this._pendingBytes = 1;
            return false;
        }
        if (i11 != 4) {
            if (i10 < 32) {
                _throwUnquotedSpace(i10, "string value");
            } else {
                _reportInvalidChar(i10);
            }
            this._textBuffer.append((char) i10);
            return true;
        }
        int i15 = i10 & 7;
        if (z10) {
            byte[] bArr3 = this._inputBuffer;
            int i16 = this._inputPtr;
            this._inputPtr = i16 + 1;
            return _decodeSplitUTF8_4(i15, 1, bArr3[i16]);
        }
        this._pending32 = i15;
        this._pendingBytes = 1;
        this._minorState = 44;
        return false;
    }

    private final boolean _decodeSplitUTF8_3(int i10, int i11, int i12) {
        if (i11 == 1) {
            if ((i12 & 192) != 128) {
                _reportInvalidOther(i12 & 255, this._inputPtr);
            }
            i10 = (i10 << 6) | (i12 & 63);
            int i13 = this._inputPtr;
            if (i13 >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i10;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i13 + 1;
            i12 = bArr[i13];
        }
        if ((i12 & 192) != 128) {
            _reportInvalidOther(i12 & 255, this._inputPtr);
        }
        this._textBuffer.append((char) ((i10 << 6) | (i12 & 63)));
        return true;
    }

    private final boolean _decodeSplitUTF8_4(int i10, int i11, int i12) {
        if (i11 == 1) {
            if ((i12 & 192) != 128) {
                _reportInvalidOther(i12 & 255, this._inputPtr);
            }
            i10 = (i10 << 6) | (i12 & 63);
            int i13 = this._inputPtr;
            if (i13 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i10;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i13 + 1;
            i12 = bArr[i13];
            i11 = 2;
        }
        if (i11 == 2) {
            if ((i12 & 192) != 128) {
                _reportInvalidOther(i12 & 255, this._inputPtr);
            }
            i10 = (i10 << 6) | (i12 & 63);
            int i14 = this._inputPtr;
            if (i14 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i10;
                this._pendingBytes = 3;
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i14 + 1;
            i12 = bArr2[i14];
        }
        if ((i12 & 192) != 128) {
            _reportInvalidOther(i12 & 255, this._inputPtr);
        }
        int i15 = ((i10 << 6) | (i12 & 63)) - ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        this._textBuffer.append((char) ((i15 >> 10) | GeneratorBase.SURR1_FIRST));
        this._textBuffer.append((char) ((i15 & 1023) | GeneratorBase.SURR2_FIRST));
        return true;
    }

    private final int _decodeUTF8_2(int i10, int i11) {
        if ((i11 & 192) != 128) {
            _reportInvalidOther(i11 & 255, this._inputPtr);
        }
        return ((i10 & 31) << 6) | (i11 & 63);
    }

    private final int _decodeUTF8_3(int i10, int i11, int i12) {
        int i13 = i10 & 15;
        if ((i11 & 192) != 128) {
            _reportInvalidOther(i11 & 255, this._inputPtr);
        }
        int i14 = (i13 << 6) | (i11 & 63);
        if ((i12 & 192) != 128) {
            _reportInvalidOther(i12 & 255, this._inputPtr);
        }
        return (i14 << 6) | (i12 & 63);
    }

    private final int _decodeUTF8_4(int i10, int i11, int i12, int i13) {
        if ((i11 & 192) != 128) {
            _reportInvalidOther(i11 & 255, this._inputPtr);
        }
        int i14 = ((i10 & 7) << 6) | (i11 & 63);
        if ((i12 & 192) != 128) {
            _reportInvalidOther(i12 & 255, this._inputPtr);
        }
        int i15 = (i14 << 6) | (i12 & 63);
        if ((i13 & 192) != 128) {
            _reportInvalidOther(i13 & 255, this._inputPtr);
        }
        return ((i15 << 6) | (i13 & 63)) - ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }

    private final String _fastParseName() {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & ForkServer.ERROR;
        if (iArr[i12] != 0) {
            if (i12 != 34) {
                return null;
            }
            this._inputPtr = i11;
            return "";
        }
        int i13 = i10 + 2;
        int i14 = bArr[i11] & ForkServer.ERROR;
        if (iArr[i14] != 0) {
            if (i14 != 34) {
                return null;
            }
            this._inputPtr = i13;
            return _findName(i12, 1);
        }
        int i15 = i14 | (i12 << 8);
        int i16 = i10 + 3;
        int i17 = bArr[i13] & ForkServer.ERROR;
        if (iArr[i17] != 0) {
            if (i17 != 34) {
                return null;
            }
            this._inputPtr = i16;
            return _findName(i15, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i10 + 4;
        int i20 = bArr[i16] & ForkServer.ERROR;
        if (iArr[i20] != 0) {
            if (i20 != 34) {
                return null;
            }
            this._inputPtr = i19;
            return _findName(i18, 3);
        }
        int i21 = (i18 << 8) | i20;
        int i22 = i10 + 5;
        int i23 = bArr[i19] & ForkServer.ERROR;
        if (iArr[i23] == 0) {
            this._quad1 = i21;
            return _parseMediumName(i22, i23);
        }
        if (i23 != 34) {
            return null;
        }
        this._inputPtr = i22;
        return _findName(i21, 4);
    }

    private JsonToken _finishAposName(int i10, int i11, int i12) {
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = _icLatin1;
        while (true) {
            int i13 = this._inputPtr;
            if (i13 >= this._inputEnd) {
                this._quadLength = i10;
                this._pending32 = i11;
                this._pendingBytes = i12;
                this._minorState = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i13 + 1;
            int i_decodeCharEscape = bArr[i13] & ForkServer.ERROR;
            if (i_decodeCharEscape == 39) {
                if (i12 > 0) {
                    if (i10 >= iArrGrowArrayBy.length) {
                        iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy;
                    }
                    iArrGrowArrayBy[i10] = NonBlockingJsonParserBase._padLastQuad(i11, i12);
                    i10++;
                } else if (i10 == 0) {
                    return _fieldComplete("");
                }
                String strFindName = this._symbols.findName(iArrGrowArrayBy, i10);
                if (strFindName == null) {
                    strFindName = _addName(iArrGrowArrayBy, i10, i12);
                }
                return _fieldComplete(strFindName);
            }
            if (i_decodeCharEscape != 34 && iArr[i_decodeCharEscape] != 0) {
                if (i_decodeCharEscape != 92) {
                    _throwUnquotedSpace(i_decodeCharEscape, "name");
                } else {
                    i_decodeCharEscape = _decodeCharEscape();
                    if (i_decodeCharEscape < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i10;
                        this._pending32 = i11;
                        this._pendingBytes = i12;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i_decodeCharEscape > 127) {
                    int i14 = 0;
                    if (i12 >= 4) {
                        if (i10 >= iArrGrowArrayBy.length) {
                            iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                            this._quadBuffer = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (i_decodeCharEscape < 2048) {
                        i11 = (i11 << 8) | (i_decodeCharEscape >> 6) | 192;
                        i12++;
                    } else {
                        int i15 = (i11 << 8) | (i_decodeCharEscape >> 12) | 224;
                        int i16 = i12 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArrGrowArrayBy.length) {
                                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                this._quadBuffer = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((i_decodeCharEscape >> 6) & 63) | 128;
                        i12 = i16 + 1;
                    }
                    i_decodeCharEscape = (i_decodeCharEscape & 63) | 128;
                }
            }
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | i_decodeCharEscape;
            } else {
                if (i10 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i10] = i11;
                i10++;
                i11 = i_decodeCharEscape;
                i12 = 1;
            }
        }
    }

    private final JsonToken _finishAposString() {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i10 = this._inputPtr;
        int i11 = this._inputEnd - 5;
        while (i10 < this._inputEnd) {
            int i12 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int iMin = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i10);
            while (true) {
                if (i10 < iMin) {
                    int i13 = i10 + 1;
                    int i_decodeFastCharEscape = bArr[i10] & ForkServer.ERROR;
                    int i14 = iArr[i_decodeFastCharEscape];
                    if (i14 == 0 || i_decodeFastCharEscape == 34) {
                        if (i_decodeFastCharEscape == 39) {
                            this._inputPtr = i13;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        bufferWithoutReset[currentSegmentSize] = (char) i_decodeFastCharEscape;
                        currentSegmentSize++;
                        i10 = i13;
                    } else if (i13 >= i11) {
                        this._inputPtr = i13;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        if (!_decodeSplitMultiByte(i_decodeFastCharEscape, iArr[i_decodeFastCharEscape], i13 < this._inputEnd)) {
                            this._minorStateAfterSplit = 45;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                        bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                        currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        i10 = this._inputPtr;
                    } else {
                        if (i14 == 1) {
                            this._inputPtr = i13;
                            i_decodeFastCharEscape = _decodeFastCharEscape();
                            i10 = this._inputPtr;
                        } else if (i14 == 2) {
                            i10 += 2;
                            i_decodeFastCharEscape = _decodeUTF8_2(i_decodeFastCharEscape, this._inputBuffer[i13]);
                        } else if (i14 == 3) {
                            byte[] bArr2 = this._inputBuffer;
                            int i15 = i10 + 2;
                            i10 += 3;
                            i_decodeFastCharEscape = _decodeUTF8_3(i_decodeFastCharEscape, bArr2[i13], bArr2[i15]);
                        } else if (i14 != 4) {
                            if (i_decodeFastCharEscape < 32) {
                                _throwUnquotedSpace(i_decodeFastCharEscape, "string value");
                            } else {
                                _reportInvalidChar(i_decodeFastCharEscape);
                            }
                            i10 = i13;
                        } else {
                            byte[] bArr3 = this._inputBuffer;
                            byte b10 = bArr3[i13];
                            int i16 = i10 + 3;
                            byte b11 = bArr3[i10 + 2];
                            i10 += 4;
                            int i_decodeUTF8_4 = _decodeUTF8_4(i_decodeFastCharEscape, b10, b11, bArr3[i16]);
                            int i17 = currentSegmentSize + 1;
                            bufferWithoutReset[currentSegmentSize] = (char) ((i_decodeUTF8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i17 >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                currentSegmentSize = 0;
                            } else {
                                currentSegmentSize = i17;
                            }
                            i_decodeFastCharEscape = (i_decodeUTF8_4 & 1023) | GeneratorBase.SURR2_FIRST;
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                        } else {
                            i12 = currentSegmentSize;
                        }
                        currentSegmentSize = i12 + 1;
                        bufferWithoutReset[i12] = (char) i_decodeFastCharEscape;
                    }
                }
            }
        }
        this._inputPtr = i10;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final JsonToken _finishBOM(int i10) {
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._pending32 = i10;
                this._minorState = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i11 + 1;
            int i12 = bArr[i11] & ForkServer.ERROR;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this._currInputProcessed -= 3;
                        return _startDocument(i12);
                    }
                } else if (i12 != 191) {
                    _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i12));
                }
            } else if (i12 != 187) {
                _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i12));
            }
            i10++;
        }
    }

    private final JsonToken _finishCComment(int i10, boolean z10) {
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._minorState = z10 ? 52 : 53;
                this._pending32 = i10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            int i13 = bArr[i11] & ForkServer.ERROR;
            if (i13 < 32) {
                if (i13 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i12;
                } else if (i13 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i12;
                } else if (i13 != 9) {
                    _throwInvalidSpace(i13);
                }
            } else if (i13 == 42) {
                z10 = true;
            } else if (i13 == 47 && z10) {
                return _startAfterComment(i10);
            }
            z10 = false;
        }
    }

    private final JsonToken _finishCppComment(int i10) {
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._minorState = 54;
                this._pending32 = i10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            int i13 = bArr[i11] & ForkServer.ERROR;
            if (i13 < 32) {
                if (i13 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i12;
                    break;
                }
                if (i13 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i12;
                    break;
                }
                if (i13 != 9) {
                    _throwInvalidSpace(i13);
                }
            }
        }
        return _startAfterComment(i10);
    }

    private final JsonToken _finishHashComment(int i10) {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._minorState = 55;
                this._pending32 = i10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            int i13 = bArr[i11] & ForkServer.ERROR;
            if (i13 < 32) {
                if (i13 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i12;
                    break;
                }
                if (i13 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i12;
                    break;
                }
                if (i13 != 9) {
                    _throwInvalidSpace(i13);
                }
            }
        }
        return _startAfterComment(i10);
    }

    private final JsonToken _finishRegularString() {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i10 = this._inputPtr;
        int i11 = this._inputEnd - 5;
        while (i10 < this._inputEnd) {
            int i12 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int iMin = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i10);
            while (true) {
                if (i10 < iMin) {
                    int i13 = i10 + 1;
                    int i_decodeFastCharEscape = bArr[i10] & ForkServer.ERROR;
                    int i14 = iArr[i_decodeFastCharEscape];
                    if (i14 == 0) {
                        bufferWithoutReset[currentSegmentSize] = (char) i_decodeFastCharEscape;
                        currentSegmentSize++;
                        i10 = i13;
                    } else {
                        if (i_decodeFastCharEscape == 34) {
                            this._inputPtr = i13;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        if (i13 >= i11) {
                            this._inputPtr = i13;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            if (!_decodeSplitMultiByte(i_decodeFastCharEscape, iArr[i_decodeFastCharEscape], i13 < this._inputEnd)) {
                                this._minorStateAfterSplit = 40;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i10 = this._inputPtr;
                        } else {
                            if (i14 == 1) {
                                this._inputPtr = i13;
                                i_decodeFastCharEscape = _decodeFastCharEscape();
                                i10 = this._inputPtr;
                            } else if (i14 == 2) {
                                i10 += 2;
                                i_decodeFastCharEscape = _decodeUTF8_2(i_decodeFastCharEscape, this._inputBuffer[i13]);
                            } else if (i14 == 3) {
                                byte[] bArr2 = this._inputBuffer;
                                int i15 = i10 + 2;
                                i10 += 3;
                                i_decodeFastCharEscape = _decodeUTF8_3(i_decodeFastCharEscape, bArr2[i13], bArr2[i15]);
                            } else if (i14 != 4) {
                                if (i_decodeFastCharEscape < 32) {
                                    _throwUnquotedSpace(i_decodeFastCharEscape, "string value");
                                } else {
                                    _reportInvalidChar(i_decodeFastCharEscape);
                                }
                                i10 = i13;
                            } else {
                                byte[] bArr3 = this._inputBuffer;
                                byte b10 = bArr3[i13];
                                int i16 = i10 + 3;
                                byte b11 = bArr3[i10 + 2];
                                i10 += 4;
                                int i_decodeUTF8_4 = _decodeUTF8_4(i_decodeFastCharEscape, b10, b11, bArr3[i16]);
                                int i17 = currentSegmentSize + 1;
                                bufferWithoutReset[currentSegmentSize] = (char) ((i_decodeUTF8_4 >> 10) | GeneratorBase.SURR1_FIRST);
                                if (i17 >= bufferWithoutReset.length) {
                                    bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                    currentSegmentSize = 0;
                                } else {
                                    currentSegmentSize = i17;
                                }
                                i_decodeFastCharEscape = (i_decodeUTF8_4 & 1023) | GeneratorBase.SURR2_FIRST;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i12 = currentSegmentSize;
                            }
                            currentSegmentSize = i12 + 1;
                            bufferWithoutReset[i12] = (char) i_decodeFastCharEscape;
                        }
                    }
                }
            }
        }
        this._inputPtr = i10;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private JsonToken _finishUnquotedName(int i10, int i11, int i12) {
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (true) {
            int i13 = this._inputPtr;
            if (i13 >= this._inputEnd) {
                this._quadLength = i10;
                this._pending32 = i11;
                this._pendingBytes = i12;
                this._minorState = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            int i14 = this._inputBuffer[i13] & ForkServer.ERROR;
            if (inputCodeUtf8JsNames[i14] != 0) {
                if (i12 > 0) {
                    if (i10 >= iArrGrowArrayBy.length) {
                        iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy;
                    }
                    iArrGrowArrayBy[i10] = i11;
                    i10++;
                }
                String strFindName = this._symbols.findName(iArrGrowArrayBy, i10);
                if (strFindName == null) {
                    strFindName = _addName(iArrGrowArrayBy, i10, i12);
                }
                return _fieldComplete(strFindName);
            }
            this._inputPtr = i13 + 1;
            if (i12 < 4) {
                i12++;
                i11 = (i11 << 8) | i14;
            } else {
                if (i10 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i10] = i11;
                i12 = 1;
                i10++;
                i11 = i14;
            }
        }
    }

    private JsonToken _handleOddName(int i10) {
        if (i10 != 35) {
            if (i10 != 39) {
                if (i10 == 47) {
                    return _startSlashComment(4);
                }
                if (i10 == 93) {
                    return _closeArrayScope();
                }
            } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _finishAposName(0, 0, 0);
            }
        } else if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) != 0) {
            return _finishHashComment(4);
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) i10, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i10] != 0) {
            _reportUnexpectedChar(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return _finishUnquotedName(0, i10, 1);
    }

    private final JsonToken _parseEscapedName(int i10, int i11, int i12) {
        int i13;
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = _icLatin1;
        while (true) {
            int i14 = this._inputPtr;
            if (i14 >= this._inputEnd) {
                this._quadLength = i10;
                this._pending32 = i11;
                this._pendingBytes = i12;
                this._minorState = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i14 + 1;
            int i_decodeCharEscape = bArr[i14] & ForkServer.ERROR;
            if (iArr[i_decodeCharEscape] == 0) {
                if (i12 < 4) {
                    i12++;
                    i11 = (i11 << 8) | i_decodeCharEscape;
                } else {
                    if (i10 >= iArrGrowArrayBy.length) {
                        int[] iArrGrowArrayBy2 = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                        this._quadBuffer = iArrGrowArrayBy2;
                        iArrGrowArrayBy = iArrGrowArrayBy2;
                    }
                    i13 = i10 + 1;
                    iArrGrowArrayBy[i10] = i11;
                    i10 = i13;
                    i11 = i_decodeCharEscape;
                    i12 = 1;
                }
            } else {
                if (i_decodeCharEscape == 34) {
                    if (i12 > 0) {
                        if (i10 >= iArrGrowArrayBy.length) {
                            iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                            this._quadBuffer = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i10] = NonBlockingJsonParserBase._padLastQuad(i11, i12);
                        i10++;
                    } else if (i10 == 0) {
                        return _fieldComplete("");
                    }
                    String strFindName = this._symbols.findName(iArrGrowArrayBy, i10);
                    if (strFindName == null) {
                        strFindName = _addName(iArrGrowArrayBy, i10, i12);
                    }
                    return _fieldComplete(strFindName);
                }
                if (i_decodeCharEscape != 92) {
                    _throwUnquotedSpace(i_decodeCharEscape, "name");
                } else {
                    i_decodeCharEscape = _decodeCharEscape();
                    if (i_decodeCharEscape < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i10;
                        this._pending32 = i11;
                        this._pendingBytes = i12;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i10 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                if (i_decodeCharEscape > 127) {
                    int i15 = 0;
                    if (i12 >= 4) {
                        iArrGrowArrayBy[i10] = i11;
                        i10++;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (i_decodeCharEscape < 2048) {
                        i11 = (i11 << 8) | (i_decodeCharEscape >> 6) | 192;
                        i12++;
                    } else {
                        int i16 = (i11 << 8) | (i_decodeCharEscape >> 12) | 224;
                        int i17 = i12 + 1;
                        if (i17 >= 4) {
                            iArrGrowArrayBy[i10] = i16;
                            i10++;
                            i17 = 0;
                        } else {
                            i15 = i16;
                        }
                        i11 = (i15 << 8) | ((i_decodeCharEscape >> 6) & 63) | 128;
                        i12 = i17 + 1;
                    }
                    i_decodeCharEscape = (i_decodeCharEscape & 63) | 128;
                }
                if (i12 < 4) {
                    i12++;
                    i11 = (i11 << 8) | i_decodeCharEscape;
                } else {
                    i13 = i10 + 1;
                    iArrGrowArrayBy[i10] = i11;
                    i10 = i13;
                    i11 = i_decodeCharEscape;
                    i12 = 1;
                }
            }
        }
    }

    private final String _parseMediumName(int i10, int i11) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i12 = i10 + 1;
        int i13 = bArr[i10] & ForkServer.ERROR;
        if (iArr[i13] != 0) {
            if (i13 != 34) {
                return null;
            }
            this._inputPtr = i12;
            return _findName(this._quad1, i11, 1);
        }
        int i14 = (i11 << 8) | i13;
        int i15 = i10 + 2;
        int i16 = bArr[i12] & ForkServer.ERROR;
        if (iArr[i16] != 0) {
            if (i16 != 34) {
                return null;
            }
            this._inputPtr = i15;
            return _findName(this._quad1, i14, 2);
        }
        int i17 = (i14 << 8) | i16;
        int i18 = i10 + 3;
        int i19 = bArr[i15] & ForkServer.ERROR;
        if (iArr[i19] != 0) {
            if (i19 != 34) {
                return null;
            }
            this._inputPtr = i18;
            return _findName(this._quad1, i17, 3);
        }
        int i20 = (i17 << 8) | i19;
        int i21 = i10 + 4;
        int i22 = bArr[i18] & ForkServer.ERROR;
        if (iArr[i22] == 0) {
            return _parseMediumName2(i21, i22, i20);
        }
        if (i22 != 34) {
            return null;
        }
        this._inputPtr = i21;
        return _findName(this._quad1, i20, 4);
    }

    private final String _parseMediumName2(int i10, int i11, int i12) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i13 = i10 + 1;
        int i14 = bArr[i10] & ForkServer.ERROR;
        if (iArr[i14] != 0) {
            if (i14 != 34) {
                return null;
            }
            this._inputPtr = i13;
            return _findName(this._quad1, i12, i11, 1);
        }
        int i15 = (i11 << 8) | i14;
        int i16 = i10 + 2;
        int i17 = bArr[i13] & ForkServer.ERROR;
        if (iArr[i17] != 0) {
            if (i17 != 34) {
                return null;
            }
            this._inputPtr = i16;
            return _findName(this._quad1, i12, i15, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i10 + 3;
        int i20 = bArr[i16] & ForkServer.ERROR;
        if (iArr[i20] != 0) {
            if (i20 != 34) {
                return null;
            }
            this._inputPtr = i19;
            return _findName(this._quad1, i12, i18, 3);
        }
        int i21 = (i18 << 8) | i20;
        int i22 = i10 + 4;
        if ((bArr[i19] & ForkServer.ERROR) != 34) {
            return null;
        }
        this._inputPtr = i22;
        return _findName(this._quad1, i12, i21, 4);
    }

    private final int _skipWS(int i10) {
        do {
            if (i10 != 32) {
                if (i10 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i10 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i10 != 9) {
                    _throwInvalidSpace(i10);
                }
            }
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i11 + 1;
            i10 = bArr[i11] & ForkServer.ERROR;
        } while (i10 <= 32);
        return i10;
    }

    private final JsonToken _startAfterComment(int i10) {
        int i11 = this._inputPtr;
        if (i11 >= this._inputEnd) {
            this._minorState = i10;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i11 + 1;
        int i12 = bArr[i11] & ForkServer.ERROR;
        if (i10 == 4) {
            return _startFieldName(i12);
        }
        if (i10 == 5) {
            return _startFieldNameAfterComma(i12);
        }
        switch (i10) {
            case 12:
                return _startValue(i12);
            case 13:
                return _startValueExpectComma(i12);
            case 14:
                return _startValueExpectColon(i12);
            case 15:
                return _startValueAfterComma(i12);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    private final JsonToken _startDocument(int i10) {
        int i11 = i10 & 255;
        if (i11 == 239 && this._minorState != 1) {
            return _finishBOM(1);
        }
        while (i11 <= 32) {
            if (i11 != 32) {
                if (i11 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i11 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i11 != 9) {
                    _throwInvalidSpace(i11);
                }
            }
            int i12 = this._inputPtr;
            if (i12 >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                return this._endOfInput ? _eofAsNextToken() : JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i12 + 1;
            i11 = bArr[i12] & ForkServer.ERROR;
        }
        return _startValue(i11);
    }

    private final JsonToken _startFieldName(int i10) {
        String str_fastParseName;
        if (i10 > 32 || (i10 = _skipWS(i10)) > 0) {
            _updateTokenLocation();
            return i10 != 34 ? i10 == 125 ? _closeObjectScope() : _handleOddName(i10) : (this._inputPtr + 13 > this._inputEnd || (str_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(str_fastParseName);
        }
        this._minorState = 4;
        return this._currToken;
    }

    private final JsonToken _startFieldNameAfterComma(int i10) {
        String str_fastParseName;
        if (i10 <= 32 && (i10 = _skipWS(i10)) <= 0) {
            this._minorState = 5;
            return this._currToken;
        }
        if (i10 != 44) {
            if (i10 == 125) {
                return _closeObjectScope();
            }
            if (i10 == 35) {
                return _finishHashComment(5);
            }
            if (i10 == 47) {
                return _startSlashComment(5);
            }
            _reportUnexpectedChar(i10, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        int i11 = this._inputPtr;
        if (i11 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i_skipWS = this._inputBuffer[i11];
        this._inputPtr = i11 + 1;
        if (i_skipWS > 32 || (i_skipWS = _skipWS(i_skipWS)) > 0) {
            _updateTokenLocation();
            return i_skipWS != 34 ? (i_skipWS != 125 || (this._features & FEAT_MASK_TRAILING_COMMA) == 0) ? _handleOddName(i_skipWS) : _closeObjectScope() : (this._inputPtr + 13 > this._inputEnd || (str_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(str_fastParseName);
        }
        this._minorState = 4;
        return this._currToken;
    }

    private final JsonToken _startSlashComment(int i10) {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i11 = this._inputPtr;
        if (i11 >= this._inputEnd) {
            this._pending32 = i10;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 == 42) {
            return _finishCComment(i10, false);
        }
        if (b10 == 47) {
            return _finishCppComment(i10);
        }
        _reportUnexpectedChar(b10 & ForkServer.ERROR, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final JsonToken _startValue(int i10) {
        if (i10 <= 32 && (i10 = _skipWS(i10)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i10 == 34) {
            return _startString();
        }
        if (i10 == 35) {
            return _finishHashComment(12);
        }
        if (i10 == 91) {
            return _startArrayScope();
        }
        if (i10 == 93) {
            return _closeArrayScope();
        }
        if (i10 == 102) {
            return _startFalseToken();
        }
        if (i10 == 110) {
            return _startNullToken();
        }
        if (i10 == 116) {
            return _startTrueToken();
        }
        if (i10 == 123) {
            return _startObjectScope();
        }
        if (i10 == 125) {
            return _closeObjectScope();
        }
        switch (i10) {
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return _startNegativeNumber();
            case 46:
                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                    return _startFloatThatStartsWithPeriod();
                }
                break;
            case 47:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(i10);
        }
        return _startUnexpectedValue(false, i10);
    }

    private final JsonToken _startValueAfterComma(int i10) {
        if (i10 <= 32 && (i10 = _skipWS(i10)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i10 == 34) {
            return _startString();
        }
        if (i10 == 35) {
            return _finishHashComment(15);
        }
        if (i10 == 45) {
            return _startNegativeNumber();
        }
        if (i10 == 91) {
            return _startArrayScope();
        }
        if (i10 != 93) {
            if (i10 == 102) {
                return _startFalseToken();
            }
            if (i10 == 110) {
                return _startNullToken();
            }
            if (i10 == 116) {
                return _startTrueToken();
            }
            if (i10 == 123) {
                return _startObjectScope();
            }
            if (i10 != 125) {
                switch (i10) {
                    case 47:
                        return _startSlashComment(15);
                    case 48:
                        return _startNumberLeadingZero();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return _startPositiveNumber(i10);
                }
            }
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
            return _closeArrayScope();
        }
        return _startUnexpectedValue(true, i10);
    }

    private final JsonToken _startValueExpectColon(int i10) {
        if (i10 <= 32 && (i10 = _skipWS(i10)) <= 0) {
            this._minorState = 14;
            return this._currToken;
        }
        if (i10 != 58) {
            if (i10 == 47) {
                return _startSlashComment(14);
            }
            if (i10 == 35) {
                return _finishHashComment(14);
            }
            _reportUnexpectedChar(i10, "was expecting a colon to separate field name and value");
        }
        int i11 = this._inputPtr;
        if (i11 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i_skipWS = this._inputBuffer[i11];
        this._inputPtr = i11 + 1;
        if (i_skipWS <= 32 && (i_skipWS = _skipWS(i_skipWS)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i_skipWS == 34) {
            return _startString();
        }
        if (i_skipWS == 35) {
            return _finishHashComment(12);
        }
        if (i_skipWS == 45) {
            return _startNegativeNumber();
        }
        if (i_skipWS == 91) {
            return _startArrayScope();
        }
        if (i_skipWS == 102) {
            return _startFalseToken();
        }
        if (i_skipWS == 110) {
            return _startNullToken();
        }
        if (i_skipWS == 116) {
            return _startTrueToken();
        }
        if (i_skipWS == 123) {
            return _startObjectScope();
        }
        switch (i_skipWS) {
            case 47:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(i_skipWS);
            default:
                return _startUnexpectedValue(false, i_skipWS);
        }
    }

    private final JsonToken _startValueExpectComma(int i10) {
        if (i10 <= 32 && (i10 = _skipWS(i10)) <= 0) {
            this._minorState = 13;
            return this._currToken;
        }
        if (i10 != 44) {
            if (i10 == 93) {
                return _closeArrayScope();
            }
            if (i10 == 125) {
                return _closeObjectScope();
            }
            if (i10 == 47) {
                return _startSlashComment(13);
            }
            if (i10 == 35) {
                return _finishHashComment(13);
            }
            _reportUnexpectedChar(i10, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        this._parsingContext.expectComma();
        int i11 = this._inputPtr;
        if (i11 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i_skipWS = this._inputBuffer[i11];
        this._inputPtr = i11 + 1;
        if (i_skipWS <= 32 && (i_skipWS = _skipWS(i_skipWS)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i_skipWS == 34) {
            return _startString();
        }
        if (i_skipWS == 35) {
            return _finishHashComment(15);
        }
        if (i_skipWS == 45) {
            return _startNegativeNumber();
        }
        if (i_skipWS == 91) {
            return _startArrayScope();
        }
        if (i_skipWS != 93) {
            if (i_skipWS == 102) {
                return _startFalseToken();
            }
            if (i_skipWS == 110) {
                return _startNullToken();
            }
            if (i_skipWS == 116) {
                return _startTrueToken();
            }
            if (i_skipWS == 123) {
                return _startObjectScope();
            }
            if (i_skipWS != 125) {
                switch (i_skipWS) {
                    case 47:
                        return _startSlashComment(15);
                    case 48:
                        return _startNumberLeadingZero();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return _startPositiveNumber(i_skipWS);
                }
            }
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
            return _closeArrayScope();
        }
        return _startUnexpectedValue(true, i_skipWS);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() {
        VersionUtil.throwInternal();
        return ' ';
    }

    public JsonToken _finishErrorToken() {
        do {
            int i10 = this._inputPtr;
            if (i10 >= this._inputEnd) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i10 + 1;
            char c10 = (char) bArr[i10];
            if (!Character.isJavaIdentifierPart(c10)) {
                break;
            }
            this._textBuffer.append(c10);
        } while (this._textBuffer.size() < 256);
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public JsonToken _finishErrorTokenWithEOF() {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public final JsonToken _finishFieldWithEscape() {
        int i10;
        int i11;
        int i_decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
        if (i_decodeSplitEscaped < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i12 = this._quadLength;
        int[] iArr = this._quadBuffer;
        if (i12 >= iArr.length) {
            this._quadBuffer = ParserBase.growArrayBy(iArr, 32);
        }
        int i13 = this._pending32;
        int i14 = this._pendingBytes;
        int i15 = 1;
        if (i_decodeSplitEscaped > 127) {
            int i16 = 0;
            if (i14 >= 4) {
                int[] iArr2 = this._quadBuffer;
                int i17 = this._quadLength;
                this._quadLength = i17 + 1;
                iArr2[i17] = i13;
                i13 = 0;
                i14 = 0;
            }
            if (i_decodeSplitEscaped < 2048) {
                i10 = i13 << 8;
                i11 = (i_decodeSplitEscaped >> 6) | 192;
            } else {
                int i18 = (i13 << 8) | (i_decodeSplitEscaped >> 12) | 224;
                i14++;
                if (i14 >= 4) {
                    int[] iArr3 = this._quadBuffer;
                    int i19 = this._quadLength;
                    this._quadLength = i19 + 1;
                    iArr3[i19] = i18;
                    i14 = 0;
                } else {
                    i16 = i18;
                }
                i10 = i16 << 8;
                i11 = ((i_decodeSplitEscaped >> 6) & 63) | 128;
            }
            i13 = i10 | i11;
            i14++;
            i_decodeSplitEscaped = (i_decodeSplitEscaped & 63) | 128;
        }
        if (i14 < 4) {
            i15 = 1 + i14;
            i_decodeSplitEscaped |= i13 << 8;
        } else {
            int[] iArr4 = this._quadBuffer;
            int i20 = this._quadLength;
            this._quadLength = i20 + 1;
            iArr4[i20] = i13;
        }
        return this._minorStateAfterSplit == 9 ? _finishAposName(this._quadLength, i_decodeSplitEscaped, i15) : _parseEscapedName(this._quadLength, i_decodeSplitEscaped, i15);
    }

    public JsonToken _finishFloatExponent(boolean z10, int i10) {
        if (z10) {
            this._minorState = 32;
            if (i10 == 45 || i10 == 43) {
                this._textBuffer.append((char) i10);
                int i11 = this._inputPtr;
                if (i11 >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i11 + 1;
                i10 = bArr[i11];
            }
        }
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i12 = this._expLength;
        while (i10 >= 48 && i10 <= 57) {
            i12++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i13 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) i10;
            int i14 = this._inputPtr;
            if (i14 >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i13);
                this._expLength = i12;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i14 + 1;
            i10 = bArr2[i14];
            currentSegmentSize = i13;
        }
        int i15 = i10 & 255;
        if (i12 == 0) {
            reportUnexpectedNumberChar(i15, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        this._expLength = i12;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r0 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        reportUnexpectedNumberChar(r3, "Decimal point not followed by a digit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r6._fractLength = r0;
        r6._textBuffer.setCurrentLength(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r3 == 101) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r3 != 69) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r6._inputPtr--;
        r6._textBuffer.setCurrentLength(r2);
        r6._expLength = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r6._textBuffer.append((char) r3);
        r6._expLength = 0;
        r0 = r6._inputPtr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r0 < r6._inputEnd) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r6._minorState = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        r6._minorState = 32;
        r1 = r6._inputBuffer;
        r6._inputPtr = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        return _finishFloatExponent(true, r1[r0] & org.apache.tika.fork.ForkServer.ERROR);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishFloatFraction() {
        /*
            r6 = this;
            int r0 = r6._fractLength
            com.fasterxml.jackson.core.util.TextBuffer r1 = r6._textBuffer
            char[] r1 = r1.getBufferWithoutReset()
            com.fasterxml.jackson.core.util.TextBuffer r2 = r6._textBuffer
            int r2 = r2.getCurrentSegmentSize()
        Le:
            byte[] r3 = r6._inputBuffer
            int r4 = r6._inputPtr
            int r5 = r4 + 1
            r6._inputPtr = r5
            r3 = r3[r4]
            r4 = 48
            if (r3 < r4) goto L42
            r4 = 57
            if (r3 > r4) goto L42
            int r0 = r0 + 1
            int r4 = r1.length
            if (r2 < r4) goto L2b
            com.fasterxml.jackson.core.util.TextBuffer r1 = r6._textBuffer
            char[] r1 = r1.expandCurrentSegment()
        L2b:
            int r4 = r2 + 1
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r6._inputPtr
            int r3 = r6._inputEnd
            if (r2 < r3) goto L40
            com.fasterxml.jackson.core.util.TextBuffer r1 = r6._textBuffer
            r1.setCurrentLength(r4)
            r6._fractLength = r0
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            return r6
        L40:
            r2 = r4
            goto Le
        L42:
            if (r0 != 0) goto L49
            java.lang.String r1 = "Decimal point not followed by a digit"
            r6.reportUnexpectedNumberChar(r3, r1)
        L49:
            r6._fractLength = r0
            com.fasterxml.jackson.core.util.TextBuffer r0 = r6._textBuffer
            r0.setCurrentLength(r2)
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            r4 = 1
            if (r3 == r0) goto L6e
            r0 = 69
            if (r3 != r0) goto L5b
            goto L6e
        L5b:
            int r0 = r6._inputPtr
            int r0 = r0 - r4
            r6._inputPtr = r0
            com.fasterxml.jackson.core.util.TextBuffer r0 = r6._textBuffer
            r0.setCurrentLength(r2)
            r6._expLength = r1
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            com.fasterxml.jackson.core.JsonToken r6 = r6._valueComplete(r0)
            return r6
        L6e:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r6._textBuffer
            char r2 = (char) r3
            r0.append(r2)
            r6._expLength = r1
            int r0 = r6._inputPtr
            int r1 = r6._inputEnd
            if (r0 < r1) goto L83
            r0 = 31
            r6._minorState = r0
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            return r6
        L83:
            r1 = 32
            r6._minorState = r1
            byte[] r1 = r6._inputBuffer
            int r2 = r0 + 1
            r6._inputPtr = r2
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.fasterxml.jackson.core.JsonToken r6 = r6._finishFloatExponent(r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishFloatFraction():com.fasterxml.jackson.core.JsonToken");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        r3._minorState = 50;
        r3._textBuffer.resetWithCopy(r4, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishKeywordToken(java.lang.String r4, int r5, com.fasterxml.jackson.core.JsonToken r6) {
        /*
            r3 = this;
            int r0 = r4.length()
        L4:
            int r1 = r3._inputPtr
            int r2 = r3._inputEnd
            if (r1 < r2) goto L11
            r3._pending32 = r5
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r3._currToken = r4
            return r4
        L11:
            byte[] r2 = r3._inputBuffer
            r1 = r2[r1]
            if (r5 != r0) goto L28
            r0 = 48
            if (r1 < r0) goto L23
            r0 = 93
            if (r1 == r0) goto L23
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L2e
        L23:
            com.fasterxml.jackson.core.JsonToken r3 = r3._valueComplete(r6)
            return r3
        L28:
            char r2 = r4.charAt(r5)
            if (r1 == r2) goto L3d
        L2e:
            r6 = 50
            r3._minorState = r6
            com.fasterxml.jackson.core.util.TextBuffer r6 = r3._textBuffer
            r0 = 0
            r6.resetWithCopy(r4, r0, r5)
            com.fasterxml.jackson.core.JsonToken r3 = r3._finishErrorToken()
            return r3
        L3d:
            int r5 = r5 + 1
            int r1 = r3._inputPtr
            int r1 = r1 + 1
            r3._inputPtr = r1
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishKeywordToken(java.lang.String, int, com.fasterxml.jackson.core.JsonToken):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishKeywordTokenWithEOF(String str, int i10, JsonToken jsonToken) {
        if (i10 == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i10);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r4._minorState = 50;
        r4._textBuffer.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishNonStdToken(int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4._nonStdToken(r5)
            int r1 = r0.length()
        L8:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L1b
            r4._nonStdTokenType = r5
            r4._pending32 = r6
            r5 = 19
            r4._minorState = r5
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r3 = r4._inputBuffer
            r2 = r3[r2]
            if (r6 != r1) goto L32
            r1 = 48
            if (r2 < r1) goto L2d
            r1 = 93
            if (r2 == r1) goto L2d
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 != r1) goto L38
        L2d:
            com.fasterxml.jackson.core.JsonToken r4 = r4._valueNonStdNumberComplete(r5)
            return r4
        L32:
            char r3 = r0.charAt(r6)
            if (r2 == r3) goto L47
        L38:
            r5 = 50
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r1 = 0
            r5.resetWithCopy(r0, r1, r6)
            com.fasterxml.jackson.core.JsonToken r4 = r4._finishErrorToken()
            return r4
        L47:
            int r6 = r6 + 1
            int r2 = r4._inputPtr
            int r2 = r2 + 1
            r4._inputPtr = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNonStdToken(int, int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishNonStdTokenWithEOF(int i10, int i11) {
        String str_nonStdToken = _nonStdToken(i10);
        if (i11 == str_nonStdToken.length()) {
            return _valueNonStdNumberComplete(i10);
        }
        this._textBuffer.resetWithCopy(str_nonStdToken, 0, i11);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r4._intLength = r0 + r6;
        r4._textBuffer.setCurrentLength(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishNumberIntegralPart(char[] r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4._numberNegative
            if (r0 == 0) goto L6
            r0 = -1
            goto L7
        L6:
            r0 = 0
        L7:
            int r1 = r4._inputPtr
            int r2 = r4._inputEnd
            if (r1 < r2) goto L1b
            r5 = 26
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r2 = r4._inputBuffer
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 48
            if (r2 >= r3) goto L35
            r3 = 46
            if (r2 != r3) goto L42
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r4 = r4._startFloat(r5, r6, r2)
            return r4
        L35:
            r3 = 57
            if (r2 <= r3) goto L5d
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L51
            r3 = 69
            if (r2 != r3) goto L42
            goto L51
        L42:
            int r0 = r0 + r6
            r4._intLength = r0
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            com.fasterxml.jackson.core.JsonToken r4 = r4._valueComplete(r5)
            return r4
        L51:
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r4 = r4._startFloat(r5, r6, r2)
            return r4
        L5d:
            int r1 = r1 + 1
            r4._inputPtr = r1
            int r1 = r5.length
            if (r6 < r1) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.expandCurrentSegment()
        L6a:
            int r1 = r6 + 1
            char r2 = (char) r2
            r5[r6] = r2
            r6 = r1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNumberIntegralPart(char[], int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishNumberLeadingNegZeroes() {
        int i10;
        do {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._minorState = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i11 + 1;
            i10 = bArr[i11] & ForkServer.ERROR;
            if (i10 < 48) {
                if (i10 == 46) {
                    char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment[0] = '-';
                    cArrEmptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, 2, i10);
                }
            } else if (i10 > 57) {
                if (i10 == 101 || i10 == 69) {
                    char[] cArrEmptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment2[0] = '-';
                    cArrEmptyAndGetCurrentSegment2[1] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment2, 2, i10);
                }
                if (i10 != 93 && i10 != 125) {
                    reportUnexpectedNumberChar(i10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr--;
            return _valueCompleteInt(0, WebrtcBuildVersion.maint_version);
        } while (i10 == 48);
        char[] cArrEmptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment3[0] = '-';
        cArrEmptyAndGetCurrentSegment3[1] = (char) i10;
        this._intLength = 1;
        return _finishNumberIntegralPart(cArrEmptyAndGetCurrentSegment3, 2);
    }

    public JsonToken _finishNumberLeadingZeroes() {
        int i10;
        do {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                this._minorState = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i11 + 1;
            i10 = bArr[i11] & ForkServer.ERROR;
            if (i10 < 48) {
                if (i10 == 46) {
                    char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, 1, i10);
                }
            } else if (i10 > 57) {
                if (i10 == 101 || i10 == 69) {
                    char[] cArrEmptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment2[0] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment2, 1, i10);
                }
                if (i10 != 93 && i10 != 125) {
                    reportUnexpectedNumberChar(i10, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr--;
            return _valueCompleteInt(0, WebrtcBuildVersion.maint_version);
        } while (i10 == 48);
        char[] cArrEmptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment3[0] = (char) i10;
        this._intLength = 1;
        return _finishNumberIntegralPart(cArrEmptyAndGetCurrentSegment3, 1);
    }

    public JsonToken _finishNumberMinus(int i10) {
        if (i10 <= 48) {
            if (i10 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i10 > 57) {
            if (i10 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        cArrEmptyAndGetCurrentSegment[1] = (char) i10;
        this._intLength = 1;
        return _finishNumberIntegralPart(cArrEmptyAndGetCurrentSegment, 2);
    }

    public final JsonToken _finishToken() {
        int i10 = this._minorState;
        if (i10 == 1) {
            return _finishBOM(this._pending32);
        }
        if (i10 == 4) {
            byte[] bArr = this._inputBuffer;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            return _startFieldName(bArr[i11] & ForkServer.ERROR);
        }
        if (i10 == 5) {
            byte[] bArr2 = this._inputBuffer;
            int i12 = this._inputPtr;
            this._inputPtr = i12 + 1;
            return _startFieldNameAfterComma(bArr2[i12] & ForkServer.ERROR);
        }
        switch (i10) {
            case 7:
                return _parseEscapedName(this._quadLength, this._pending32, this._pendingBytes);
            case 8:
                return _finishFieldWithEscape();
            case 9:
                return _finishAposName(this._quadLength, this._pending32, this._pendingBytes);
            case 10:
                return _finishUnquotedName(this._quadLength, this._pending32, this._pendingBytes);
            default:
                switch (i10) {
                    case 12:
                        byte[] bArr3 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        this._inputPtr = i13 + 1;
                        return _startValue(bArr3[i13] & ForkServer.ERROR);
                    case 13:
                        byte[] bArr4 = this._inputBuffer;
                        int i14 = this._inputPtr;
                        this._inputPtr = i14 + 1;
                        return _startValueExpectComma(bArr4[i14] & ForkServer.ERROR);
                    case 14:
                        byte[] bArr5 = this._inputBuffer;
                        int i15 = this._inputPtr;
                        this._inputPtr = i15 + 1;
                        return _startValueExpectColon(bArr5[i15] & ForkServer.ERROR);
                    case 15:
                        byte[] bArr6 = this._inputBuffer;
                        int i16 = this._inputPtr;
                        this._inputPtr = i16 + 1;
                        return _startValueAfterComma(bArr6[i16] & ForkServer.ERROR);
                    case 16:
                        return _finishKeywordToken("null", this._pending32, JsonToken.VALUE_NULL);
                    case 17:
                        return _finishKeywordToken("true", this._pending32, JsonToken.VALUE_TRUE);
                    case 18:
                        return _finishKeywordToken("false", this._pending32, JsonToken.VALUE_FALSE);
                    case 19:
                        return _finishNonStdToken(this._nonStdTokenType, this._pending32);
                    default:
                        switch (i10) {
                            case 23:
                                byte[] bArr7 = this._inputBuffer;
                                int i17 = this._inputPtr;
                                this._inputPtr = i17 + 1;
                                return _finishNumberMinus(bArr7[i17] & ForkServer.ERROR);
                            case 24:
                                return _finishNumberLeadingZeroes();
                            case 25:
                                return _finishNumberLeadingNegZeroes();
                            case 26:
                                return _finishNumberIntegralPart(this._textBuffer.getBufferWithoutReset(), this._textBuffer.getCurrentSegmentSize());
                            default:
                                switch (i10) {
                                    case Build.API_LEVELS.API_30 /* 30 */:
                                        return _finishFloatFraction();
                                    case 31:
                                        byte[] bArr8 = this._inputBuffer;
                                        int i18 = this._inputPtr;
                                        this._inputPtr = i18 + 1;
                                        return _finishFloatExponent(true, bArr8[i18] & ForkServer.ERROR);
                                    case 32:
                                        byte[] bArr9 = this._inputBuffer;
                                        int i19 = this._inputPtr;
                                        this._inputPtr = i19 + 1;
                                        return _finishFloatExponent(false, bArr9[i19] & ForkServer.ERROR);
                                    default:
                                        switch (i10) {
                                            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                                return _finishRegularString();
                                            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                                                int i_decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
                                                if (i_decodeSplitEscaped < 0) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                this._textBuffer.append((char) i_decodeSplitEscaped);
                                                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                TextBuffer textBuffer = this._textBuffer;
                                                int i20 = this._pending32;
                                                byte[] bArr10 = this._inputBuffer;
                                                int i21 = this._inputPtr;
                                                this._inputPtr = i21 + 1;
                                                textBuffer.append((char) _decodeUTF8_2(i20, bArr10[i21]));
                                                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 43:
                                                int i22 = this._pending32;
                                                int i23 = this._pendingBytes;
                                                byte[] bArr11 = this._inputBuffer;
                                                int i24 = this._inputPtr;
                                                this._inputPtr = i24 + 1;
                                                return !_decodeSplitUTF8_3(i22, i23, bArr11[i24]) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                int i25 = this._pending32;
                                                int i26 = this._pendingBytes;
                                                byte[] bArr12 = this._inputBuffer;
                                                int i27 = this._inputPtr;
                                                this._inputPtr = i27 + 1;
                                                return !_decodeSplitUTF8_4(i25, i26, bArr12[i27]) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                return _finishAposString();
                                            default:
                                                switch (i10) {
                                                    case 50:
                                                        return _finishErrorToken();
                                                    case 51:
                                                        return _startSlashComment(this._pending32);
                                                    case 52:
                                                        return _finishCComment(this._pending32, true);
                                                    case 53:
                                                        return _finishCComment(this._pending32, false);
                                                    case 54:
                                                        return _finishCppComment(this._pending32);
                                                    case 55:
                                                        return _finishHashComment(this._pending32);
                                                    default:
                                                        VersionUtil.throwInternal();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final JsonToken _finishTokenWithEOF() {
        JsonToken jsonToken = this._currToken;
        int i10 = this._minorState;
        if (i10 == 3) {
            return _eofAsNextToken();
        }
        if (i10 == 12) {
            return _eofAsNextToken();
        }
        if (i10 == 50) {
            return _finishErrorTokenWithEOF();
        }
        switch (i10) {
            case 16:
                return _finishKeywordTokenWithEOF("null", this._pending32, JsonToken.VALUE_NULL);
            case 17:
                return _finishKeywordTokenWithEOF("true", this._pending32, JsonToken.VALUE_TRUE);
            case 18:
                return _finishKeywordTokenWithEOF("false", this._pending32, JsonToken.VALUE_FALSE);
            case 19:
                return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
            default:
                switch (i10) {
                    case 24:
                    case 25:
                        return _valueCompleteInt(0, WebrtcBuildVersion.maint_version);
                    case 26:
                        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        if (this._numberNegative) {
                            currentSegmentSize--;
                        }
                        this._intLength = currentSegmentSize;
                        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
                    default:
                        switch (i10) {
                            case Build.API_LEVELS.API_30 /* 30 */:
                                this._expLength = 0;
                                return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                            case 31:
                                _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                return _eofAsNextToken();
                            case 32:
                                return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                            default:
                                switch (i10) {
                                    case 52:
                                    case 53:
                                        _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                        break;
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        _reportInvalidEOF(": was expecting rest of token (internal state: " + this._minorState + ")", this._currToken);
                                        return jsonToken;
                                }
                                return _eofAsNextToken();
                        }
                }
        }
    }

    public JsonToken _reportErrorToken(String str) {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    public JsonToken _startAposString() {
        int i10 = this._inputPtr;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this._inputBuffer;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & ForkServer.ERROR;
            if (i12 == 39) {
                this._inputPtr = i10 + 1;
                this._textBuffer.setCurrentLength(i11);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
            if (iArr[i12] != 0) {
                break;
            }
            i10++;
            cArrEmptyAndGetCurrentSegment[i11] = (char) i12;
            i11++;
        }
        this._textBuffer.setCurrentLength(i11);
        this._inputPtr = i10;
        return _finishAposString();
    }

    public JsonToken _startFalseToken() {
        int i10;
        int i11 = this._inputPtr;
        if (i11 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            if (bArr[i11] == 97) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 115) {
                        int i15 = i11 + 4;
                        if (bArr[i14] == 101 && ((i10 = bArr[i15] & ForkServer.ERROR) < 48 || i10 == 93 || i10 == 125)) {
                            this._inputPtr = i15;
                            return _valueComplete(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken("false", 1, JsonToken.VALUE_FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00ee -> B:40:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _startFloat(char[] r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startFloat(char[], int, int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _startFloatThatStartsWithPeriod() {
        this._numberNegative = false;
        this._intLength = 0;
        return _startFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46);
    }

    public JsonToken _startNegativeNumber() {
        this._numberNegative = true;
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i10 + 1;
        int i11 = bArr[i10] & ForkServer.ERROR;
        int i12 = 2;
        if (i11 <= 48) {
            if (i11 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i11 > 57) {
            if (i11 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i11, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        cArrEmptyAndGetCurrentSegment[1] = (char) i11;
        int i13 = this._inputPtr;
        if (i13 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        int i14 = this._inputBuffer[i13];
        while (true) {
            if (i14 < 48) {
                if (i14 == 46) {
                    this._intLength = i12 - 1;
                    this._inputPtr++;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, i12, i14);
                }
            } else if (i14 <= 57) {
                if (i12 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i15 = i12 + 1;
                cArrEmptyAndGetCurrentSegment[i12] = (char) i14;
                int i16 = this._inputPtr + 1;
                this._inputPtr = i16;
                if (i16 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i15);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                i14 = this._inputBuffer[i16] & ForkServer.ERROR;
                i12 = i15;
            } else if (i14 == 101 || i14 == 69) {
                this._intLength = i12 - 1;
                this._inputPtr++;
                return _startFloat(cArrEmptyAndGetCurrentSegment, i12, i14);
            }
        }
        this._intLength = i12 - 1;
        this._textBuffer.setCurrentLength(i12);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startNullToken() {
        int i10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            if (bArr[i11] == 117) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 108 && ((i10 = bArr[i14] & ForkServer.ERROR) < 48 || i10 == 93 || i10 == 125)) {
                        this._inputPtr = i14;
                        return _valueComplete(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken("null", 1, JsonToken.VALUE_NULL);
    }

    public JsonToken _startNumberLeadingZero() {
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i11 = i10 + 1;
        int i12 = this._inputBuffer[i10] & ForkServer.ERROR;
        if (i12 < 48) {
            if (i12 == 46) {
                this._inputPtr = i11;
                this._intLength = 1;
                char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                cArrEmptyAndGetCurrentSegment[0] = '0';
                return _startFloat(cArrEmptyAndGetCurrentSegment, 1, i12);
            }
        } else {
            if (i12 <= 57) {
                return _finishNumberLeadingZeroes();
            }
            if (i12 == 101 || i12 == 69) {
                this._inputPtr = i11;
                this._intLength = 1;
                char[] cArrEmptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                cArrEmptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(cArrEmptyAndGetCurrentSegment2, 1, i12);
            }
            if (i12 != 93 && i12 != 125) {
                reportUnexpectedNumberChar(i12, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return _valueCompleteInt(0, WebrtcBuildVersion.maint_version);
    }

    public JsonToken _startPositiveNumber(int i10) {
        this._numberNegative = false;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = (char) i10;
        int i11 = this._inputPtr;
        if (i11 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i12 = this._inputBuffer[i11] & ForkServer.ERROR;
        int i13 = 1;
        while (true) {
            if (i12 < 48) {
                if (i12 == 46) {
                    this._intLength = i13;
                    this._inputPtr++;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, i13, i12);
                }
            } else if (i12 <= 57) {
                if (i13 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i14 = i13 + 1;
                cArrEmptyAndGetCurrentSegment[i13] = (char) i12;
                int i15 = this._inputPtr + 1;
                this._inputPtr = i15;
                if (i15 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i14);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                i12 = this._inputBuffer[i15] & ForkServer.ERROR;
                i13 = i14;
            } else if (i12 == 101 || i12 == 69) {
                this._intLength = i13;
                this._inputPtr++;
                return _startFloat(cArrEmptyAndGetCurrentSegment, i13, i12);
            }
        }
        this._intLength = i13;
        this._textBuffer.setCurrentLength(i13);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startString() {
        int i10 = this._inputPtr;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this._inputBuffer;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            int i12 = bArr[i10] & ForkServer.ERROR;
            if (iArr[i12] == 0) {
                i10++;
                cArrEmptyAndGetCurrentSegment[i11] = (char) i12;
                i11++;
            } else if (i12 == 34) {
                this._inputPtr = i10 + 1;
                this._textBuffer.setCurrentLength(i11);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
        }
        this._textBuffer.setCurrentLength(i11);
        this._inputPtr = i10;
        return _finishRegularString();
    }

    public JsonToken _startTrueToken() {
        int i10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            if (bArr[i11] == 114) {
                int i13 = i11 + 2;
                if (bArr[i12] == 117) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 101 && ((i10 = bArr[i14] & ForkServer.ERROR) < 48 || i10 == 93 || i10 == 125)) {
                        this._inputPtr = i14;
                        return _valueComplete(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken("true", 1, JsonToken.VALUE_TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _startUnexpectedValue(boolean r3, int r4) {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L53
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L4e
            r3 = 78
            if (r4 == r3) goto L48
            r3 = 93
            if (r4 == r3) goto L24
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L5f
            r3 = 43
            if (r4 == r3) goto L1e
            r3 = 44
            if (r4 == r3) goto L2d
            goto L5f
        L1e:
            r3 = 2
            com.fasterxml.jackson.core.JsonToken r2 = r2._finishNonStdToken(r3, r0)
            return r2
        L24:
            com.fasterxml.jackson.core.json.JsonReadContext r3 = r2._parsingContext
            boolean r3 = r3.inArray()
            if (r3 != 0) goto L2d
            goto L5f
        L2d:
            com.fasterxml.jackson.core.json.JsonReadContext r3 = r2._parsingContext
            boolean r3 = r3.inRoot()
            if (r3 != 0) goto L5f
            int r3 = r2._features
            int r1 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_MISSING
            r3 = r3 & r1
            if (r3 == 0) goto L5f
            int r3 = r2._inputPtr
            int r3 = r3 - r0
            r2._inputPtr = r3
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            com.fasterxml.jackson.core.JsonToken r2 = r2._valueComplete(r3)
            return r2
        L48:
            r3 = 0
            com.fasterxml.jackson.core.JsonToken r2 = r2._finishNonStdToken(r3, r0)
            return r2
        L4e:
            com.fasterxml.jackson.core.JsonToken r2 = r2._finishNonStdToken(r0, r0)
            return r2
        L53:
            int r3 = r2._features
            int r0 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r3 = r3 & r0
            if (r3 == 0) goto L5f
            com.fasterxml.jackson.core.JsonToken r2 = r2._startAposString()
            return r2
        L5f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "expected a valid value "
            r3.append(r0)
            java.lang.String r0 = r2._validJsonValueList()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2._reportUnexpectedChar(r4, r3)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startUnexpectedValue(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override // com.fasterxml.jackson.core.async.ByteArrayFeeder
    public void feedInput(byte[] bArr, int i10, int i11) {
        int i12 = this._inputPtr;
        int i13 = this._inputEnd;
        if (i12 < i13) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i13 - i12));
        }
        if (i11 < i10) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += (long) this._origBufferLen;
        this._currInputRowStart = i10 - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = i10;
        this._inputBuffer = bArr;
        this._inputPtr = i10;
        this._inputEnd = i11;
        this._origBufferLen = i11 - i10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ByteArrayFeeder getNonBlockingInputFeeder() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public final boolean needMoreInput() {
        return this._inputPtr >= this._inputEnd && !this._endOfInput;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            return this._endOfInput ? this._currToken == JsonToken.NOT_AVAILABLE ? _finishTokenWithEOF() : _eofAsNextToken() : JsonToken.NOT_AVAILABLE;
        }
        if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        }
        this._numTypesValid = 0;
        this._tokenInputTotal = this._currInputProcessed + ((long) i10);
        this._binaryValue = null;
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i10 + 1;
        int i11 = bArr[i10] & ForkServer.ERROR;
        switch (this._majorState) {
            case 0:
                return _startDocument(i11);
            case 1:
                return _startValue(i11);
            case 2:
                return _startFieldName(i11);
            case 3:
                return _startFieldNameAfterComma(i11);
            case 4:
                return _startValueExpectColon(i11);
            case 5:
                return _startValue(i11);
            case 6:
                return _startValueExpectComma(i11);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase, com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 > 0) {
            outputStream.write(this._inputBuffer, i11, i12);
        }
        return i12;
    }
}
