package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte BYTE_0 = 48;
    private static final byte BYTE_BACKSLASH = 92;
    private static final byte BYTE_COLON = 58;
    private static final byte BYTE_COMMA = 44;
    private static final byte BYTE_LBRACKET = 91;
    private static final byte BYTE_LCURLY = 123;
    private static final byte BYTE_RBRACKET = 93;
    private static final byte BYTE_RCURLY = 125;
    private static final int MAX_BYTES_TO_BUFFER = 512;
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _entityBuffer;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar;
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final byte BYTE_u = 117;
    private static final byte[] NULL_BYTES = {110, BYTE_u, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, BYTE_u, 101};
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};

    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream, char c10) {
        super(iOContext, i10, objectCodec);
        this._outputStream = outputStream;
        this._quoteChar = (byte) c10;
        if (c10 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c10);
        }
        this._bufferRecyclable = true;
        byte[] bArrAllocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = bArrAllocWriteEncodingBuffer;
        int length = bArrAllocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = cArrAllocConcatBuffer;
        this._charBufferLength = cArrAllocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _handleLongCustomEscape(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IOException {
        int length = bArr2.length;
        if (i10 + length > i11) {
            this._outputTail = i10;
            _flushBuffer();
            i10 = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i10;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i10, length);
        int i13 = i10 + length;
        if ((i12 * 6) + i13 <= i11) {
            return i13;
        }
        this._outputTail = i13;
        _flushBuffer();
        return this._outputTail;
    }

    private final int _outputMultiByteChar(int i10, int i11) {
        byte[] bArr = this._outputBuffer;
        if (i10 < 55296 || i10 > 57343) {
            bArr[i11] = (byte) ((i10 >> 12) | 224);
            int i12 = i11 + 2;
            bArr[i11 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            int i13 = i11 + 3;
            bArr[i12] = (byte) ((i10 & 63) | 128);
            return i13;
        }
        bArr[i11] = BYTE_BACKSLASH;
        bArr[i11 + 1] = BYTE_u;
        byte[] bArr2 = HEX_CHARS;
        bArr[i11 + 2] = bArr2[(i10 >> 12) & 15];
        bArr[i11 + 3] = bArr2[(i10 >> 8) & 15];
        int i14 = i11 + 5;
        bArr[i11 + 4] = bArr2[(i10 >> 4) & 15];
        int i15 = i11 + 6;
        bArr[i14] = bArr2[i10 & 15];
        return i15;
    }

    private final int _outputRawMultiByteChar(int i10, char[] cArr, int i11, int i12) throws IOException {
        if (i10 >= 55296 && i10 <= 57343) {
            if (i11 >= i12 || cArr == null) {
                _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i10)));
            }
            _outputSurrogates(i10, cArr[i11]);
            return i11 + 1;
        }
        byte[] bArr = this._outputBuffer;
        int i13 = this._outputTail;
        int i14 = i13 + 1;
        this._outputTail = i14;
        bArr[i13] = (byte) ((i10 >> 12) | 224);
        int i15 = i13 + 2;
        this._outputTail = i15;
        bArr[i14] = (byte) (((i10 >> 6) & 63) | 128);
        this._outputTail = i13 + 3;
        bArr[i15] = (byte) ((i10 & 63) | 128);
        return i11;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14 = 0;
        while (i10 < i11) {
            bArr[i14] = bArr[i10];
            i14++;
            i10++;
        }
        int iMin = Math.min(i12, bArr.length);
        do {
            int i15 = iMin - i14;
            if (i15 == 0 || (i13 = inputStream.read(bArr, i14, i15)) < 0) {
                return i14;
            }
            i14 += i13;
        } while (i14 < 3);
        return i14;
    }

    private final void _writeBytes(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final int _writeCustomEscape(byte[] bArr, int i10, SerializableString serializableString, int i11) {
        byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i10, this._outputEnd, bArrAsUnquotedUTF8, i11);
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i10, length);
        return i10 + length;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i10, int i11) throws IOException {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i12 = this._maximumNonEscapedChar;
        if (i12 <= 0) {
            i12 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i14 = iArr[c10];
                if (i14 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) c10;
                    i10 = i13;
                    i_outputMultiByteChar++;
                } else if (i14 > 0) {
                    int i15 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = BYTE_BACKSLASH;
                    i_outputMultiByteChar += 2;
                    bArr[i15] = (byte) i14;
                } else if (i14 == -2) {
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c10);
                    if (escapeSequence == null) {
                        _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c10) + ", although was supposed to have one");
                    }
                    i_outputMultiByteChar = _writeCustomEscape(bArr, i_outputMultiByteChar, escapeSequence, i11 - i13);
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(c10, i_outputMultiByteChar);
                }
            } else if (c10 > i12) {
                i_outputMultiByteChar = _writeGenericEscape(c10, i_outputMultiByteChar);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c10);
                if (escapeSequence2 != null) {
                    i_outputMultiByteChar = _writeCustomEscape(bArr, i_outputMultiByteChar, escapeSequence2, i11 - i13);
                } else if (c10 <= 2047) {
                    int i16 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = (byte) ((c10 >> 6) | 192);
                    i_outputMultiByteChar += 2;
                    bArr[i16] = (byte) ((c10 & '?') | 128);
                } else {
                    i_outputMultiByteChar = _outputMultiByteChar(c10, i_outputMultiByteChar);
                }
            }
            i10 = i13;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    private int _writeGenericEscape(int i10, int i11) {
        int i12;
        byte[] bArr = this._outputBuffer;
        bArr[i11] = BYTE_BACKSLASH;
        int i13 = i11 + 2;
        bArr[i11 + 1] = BYTE_u;
        if (i10 > 255) {
            int i14 = i10 >> 8;
            int i15 = i11 + 3;
            byte[] bArr2 = HEX_CHARS;
            bArr[i13] = bArr2[(i14 & 255) >> 4];
            i12 = i11 + 4;
            bArr[i15] = bArr2[i14 & 15];
            i10 &= 255;
        } else {
            int i16 = i11 + 3;
            bArr[i13] = BYTE_0;
            i12 = i11 + 4;
            bArr[i16] = BYTE_0;
        }
        int i17 = i12 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i12] = bArr3[i10 >> 4];
        int i18 = i12 + 2;
        bArr[i17] = bArr3[i10 & 15];
        return i18;
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i10) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr[i11] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(i10, bArr, i12);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        bArr2[iOutputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j10) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int iOutputLong = NumberOutput.outputLong(j10, bArr, i11);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputLong + 1;
        bArr2[iOutputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s10) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s10, bArr, i11);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        bArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeRawSegment(char[] cArr, int i10, int i11) throws IOException {
        while (i10 < i11) {
            do {
                char c10 = cArr[i10];
                if (c10 > 127) {
                    i10++;
                    if (c10 < 2048) {
                        byte[] bArr = this._outputBuffer;
                        int i12 = this._outputTail;
                        int i13 = i12 + 1;
                        this._outputTail = i13;
                        bArr[i12] = (byte) ((c10 >> 6) | 192);
                        this._outputTail = i12 + 2;
                        bArr[i13] = (byte) ((c10 & '?') | 128);
                    } else {
                        i10 = _outputRawMultiByteChar(c10, cArr, i10, i11);
                    }
                } else {
                    byte[] bArr2 = this._outputBuffer;
                    int i14 = this._outputTail;
                    this._outputTail = i14 + 1;
                    bArr2[i14] = (byte) c10;
                    i10++;
                }
            } while (i10 < i11);
            return;
        }
    }

    private final void _writeSegmentedRaw(char[] cArr, int i10, int i11) throws IOException {
        int i12 = this._outputEnd;
        byte[] bArr = this._outputBuffer;
        int i13 = i11 + i10;
        while (i10 < i13) {
            do {
                char c10 = cArr[i10];
                if (c10 >= 128) {
                    if (this._outputTail + 3 >= this._outputEnd) {
                        _flushBuffer();
                    }
                    int i14 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 < 2048) {
                        int i15 = this._outputTail;
                        int i16 = i15 + 1;
                        this._outputTail = i16;
                        bArr[i15] = (byte) ((c11 >> 6) | 192);
                        this._outputTail = i15 + 2;
                        bArr[i16] = (byte) ((c11 & '?') | 128);
                        i10 = i14;
                    } else {
                        i10 = _outputRawMultiByteChar(c11, cArr, i14, i13);
                    }
                } else {
                    if (this._outputTail >= i12) {
                        _flushBuffer();
                    }
                    int i17 = this._outputTail;
                    this._outputTail = i17 + 1;
                    bArr[i17] = (byte) c10;
                    i10++;
                }
            } while (i10 < i13);
            return;
        }
    }

    private final void _writeStringSegment(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i12) {
            char c10 = cArr[i10];
            if (c10 > 127 || iArr[c10] != 0) {
                break;
            }
            bArr[i13] = (byte) c10;
            i10++;
            i13++;
        }
        this._outputTail = i13;
        if (i10 < i12) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(cArr, i10, i12);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(cArr, i10, i12);
            } else {
                _writeStringSegmentASCII2(cArr, i10, i12);
            }
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i10, int i11) throws IOException {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i11) {
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i13 = iArr[c10];
                if (i13 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) c10;
                    i10 = i12;
                    i_outputMultiByteChar++;
                } else if (i13 > 0) {
                    int i14 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = BYTE_BACKSLASH;
                    i_outputMultiByteChar += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(c10, i_outputMultiByteChar);
                }
            } else if (c10 <= 2047) {
                int i15 = i_outputMultiByteChar + 1;
                bArr[i_outputMultiByteChar] = (byte) ((c10 >> 6) | 192);
                i_outputMultiByteChar += 2;
                bArr[i15] = (byte) ((c10 & '?') | 128);
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(c10, i_outputMultiByteChar);
            }
            i10 = i12;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i10, int i11) throws IOException {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i12 = this._maximumNonEscapedChar;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= 127) {
                int i14 = iArr[c10];
                if (i14 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) c10;
                    i10 = i13;
                    i_outputMultiByteChar++;
                } else if (i14 > 0) {
                    int i15 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = BYTE_BACKSLASH;
                    i_outputMultiByteChar += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(c10, i_outputMultiByteChar);
                }
            } else if (c10 > i12) {
                i_outputMultiByteChar = _writeGenericEscape(c10, i_outputMultiByteChar);
            } else if (c10 <= 2047) {
                int i16 = i_outputMultiByteChar + 1;
                bArr[i_outputMultiByteChar] = (byte) ((c10 >> 6) | 192);
                i_outputMultiByteChar += 2;
                bArr[i16] = (byte) ((c10 & '?') | 128);
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(c10, i_outputMultiByteChar);
            }
            i10 = i13;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    private final void _writeStringSegments(String str, boolean z10) throws IOException {
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = this._quoteChar;
        }
        int length = str.length();
        int i11 = 0;
        while (length > 0) {
            int iMin = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i11, iMin);
            i11 += iMin;
            length -= iMin;
        }
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            bArr2[i12] = this._quoteChar;
        }
    }

    private final void _writeUTF8Segment(byte[] bArr, int i10, int i11) throws IOException {
        int[] iArr = this._outputEscapes;
        int i12 = i10 + i11;
        int i13 = i10;
        while (i13 < i12) {
            int i14 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 >= 0 && iArr[b10] != 0) {
                _writeUTF8Segment2(bArr, i10, i11);
                return;
            }
            i13 = i14;
        }
        if (this._outputTail + i11 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
        this._outputTail += i11;
    }

    private final void _writeUTF8Segment2(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i_writeGenericEscape = this._outputTail;
        if ((i11 * 6) + i_writeGenericEscape > this._outputEnd) {
            _flushBuffer();
            i_writeGenericEscape = this._outputTail;
        }
        byte[] bArr2 = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i13 = i11 + i10;
        while (i10 < i13) {
            int i14 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0 || (i12 = iArr[b10]) == 0) {
                bArr2[i_writeGenericEscape] = b10;
                i10 = i14;
                i_writeGenericEscape++;
            } else {
                if (i12 > 0) {
                    int i15 = i_writeGenericEscape + 1;
                    bArr2[i_writeGenericEscape] = BYTE_BACKSLASH;
                    i_writeGenericEscape += 2;
                    bArr2[i15] = (byte) i12;
                } else {
                    i_writeGenericEscape = _writeGenericEscape(b10, i_writeGenericEscape);
                }
                i10 = i14;
            }
        }
        this._outputTail = i_writeGenericEscape;
    }

    private final void _writeUTF8Segments(byte[] bArr, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this._outputMaxContiguous, i11);
            _writeUTF8Segment(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    private final void _writeUnq(SerializableString serializableString) throws IOException {
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
    }

    public final void _flushBuffer() throws IOException {
        int i10 = this._outputTail;
        if (i10 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i10);
        }
    }

    public final void _outputSurrogates(int i10, int i11) throws IOException {
        int i_decodeSurrogate = _decodeSurrogate(i10, i11);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr[i12] = (byte) ((i_decodeSurrogate >> 18) | 240);
        int i14 = i12 + 2;
        this._outputTail = i14;
        bArr[i13] = (byte) (((i_decodeSurrogate >> 12) & 63) | 128);
        int i15 = i12 + 3;
        this._outputTail = i15;
        bArr[i14] = (byte) (((i_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i12 + 4;
        bArr[i15] = (byte) ((i_decodeSurrogate & 63) | 128);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        byte b10;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            b10 = BYTE_COMMA;
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                }
                SerializableString serializableString = this._rootValueSeparator;
                if (serializableString != null) {
                    byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        _writeBytes(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b10 = BYTE_COLON;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = b10;
    }

    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        int iEncodeBase64Chunk;
        int i12 = i11 - 3;
        int i13 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i14 = maxLineLength >> 2;
            while (i10 <= i12) {
                if (this._outputTail > i13) {
                    _flushBuffer();
                }
                int i15 = i10 + 2;
                int i16 = ((bArr[i10 + 1] & ForkServer.ERROR) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i16 | (bArr[i15] & ForkServer.ERROR), this._outputBuffer, this._outputTail);
                this._outputTail = iEncodeBase64Chunk;
                i14--;
                if (i14 <= 0) {
                    break;
                }
            }
            byte[] bArr2 = this._outputBuffer;
            int i17 = iEncodeBase64Chunk + 1;
            this._outputTail = i17;
            bArr2[iEncodeBase64Chunk] = BYTE_BACKSLASH;
            this._outputTail = iEncodeBase64Chunk + 2;
            bArr2[i17] = 110;
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i18 = i11 - i10;
        if (i18 > 0) {
            if (this._outputTail > i13) {
                _flushBuffer();
            }
            int i19 = i10 + 1;
            int i20 = bArr[i10] << 16;
            if (i18 == 2) {
                i20 |= (bArr[i19] & ForkServer.ERROR) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i20, i18, this._outputBuffer, this._outputTail);
        }
    }

    public final void _writePPFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(this._charBuffer, 0, length);
        } else {
            _writeStringSegments(this._charBuffer, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    } else {
                        writeEndObject();
                    }
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._outputStream == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._outputStream.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return this._outputTail;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._outputStream;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i10, i11 + i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z10) throws IOException {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z10 ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_RBRACKET;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_RCURLY;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_COMMA;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr2[i11] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i12 + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s10);
        } else {
            this._outputTail = NumberOutput.outputInt(s10, this._outputBuffer, this._outputTail);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length > cArr.length) {
            writeRaw(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        _writeBytes(bArr, i10, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = BYTE_LBRACKET;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = BYTE_LCURLY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        if (i11 <= this._outputMaxContiguous) {
            _writeUTF8Segment(bArr, i10, i11);
        } else {
            _writeUTF8Segments(bArr, i10, i11);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    private final void _writeBytes(byte[] bArr, int i10, int i11) throws IOException {
        if (this._outputTail + i11 > this._outputEnd) {
            _flushBuffer();
            if (i11 > 512) {
                this._outputStream.write(bArr, i10, i11);
                return;
            }
        }
        System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
        this._outputTail += i11;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i10);
        } else {
            this._outputTail = NumberOutput.outputInt(i10, this._outputBuffer, this._outputTail);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i10, int i11) throws IOException {
        char c10;
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            writeRaw(cArr, 0, i11);
            return;
        }
        int i12 = this._outputEnd;
        int iMin = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = iMin * 3;
        while (i11 > 0) {
            int iMin2 = Math.min(iMin, i11);
            str.getChars(i10, i10 + iMin2, cArr, 0);
            if (this._outputTail + i13 > this._outputEnd) {
                _flushBuffer();
            }
            if (iMin2 > 1 && (c10 = cArr[iMin2 - 1]) >= 55296 && c10 <= 56319) {
                iMin2--;
            }
            _writeRawSegment(cArr, 0, iMin2);
            i10 += iMin2;
            i11 -= iMin2;
        }
    }

    private void _writeQuotedRaw(char[] cArr, int i10, int i11) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr[i12] = this._quoteChar;
        writeRaw(cArr, i10, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr2[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(int i10) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr[i11] = BYTE_LBRACKET;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext(obj);
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = BYTE_LCURLY;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr[i11] = this._quoteChar;
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i10 < 0) {
                i10 = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer);
            } else {
                int i_writeBinary = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer, i10);
                if (i_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + i_writeBinary + " bytes (out of " + i10 + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            bArr2[i12] = this._quoteChar;
            return i10;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th;
        }
    }

    private final void _writeStringSegments(char[] cArr, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this._outputMaxContiguous, i11);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream, char c10, byte[] bArr, int i11, boolean z10) {
        super(iOContext, i10, objectCodec);
        this._outputStream = outputStream;
        this._quoteChar = (byte) c10;
        if (c10 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c10);
        }
        this._bufferRecyclable = z10;
        this._outputTail = i11;
        this._outputBuffer = bArr;
        int length = bArr.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = cArrAllocConcatBuffer;
        this._charBufferLength = cArrAllocConcatBuffer.length;
    }

    private final void _writeStringSegment(String str, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i12) {
            char cCharAt = str.charAt(i10);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i13] = (byte) cCharAt;
            i10++;
            i13++;
        }
        this._outputTail = i13;
        if (i10 < i12) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(str, i10, i12);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(str, i10, i12);
            } else {
                _writeStringSegmentASCII2(str, i10, i12);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j10);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j10, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i10) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        char[] cArr = this._charBuffer;
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr[i12] = this._quoteChar;
        while (i11 > 0) {
            int i13 = reader.read(cArr, 0, Math.min(i11, cArr.length));
            if (i13 <= 0) {
                break;
            }
            if (this._outputTail + i10 >= this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegments(cArr, 0, i13);
            i11 -= i13;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr2[i14] = this._quoteChar;
        if (i11 <= 0 || i10 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    private final void _writeStringSegment2(String str, int i10, int i11) throws IOException {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i13 = iArr[cCharAt];
                if (i13 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) cCharAt;
                    i10 = i12;
                    i_outputMultiByteChar++;
                } else if (i13 > 0) {
                    int i14 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = BYTE_BACKSLASH;
                    i_outputMultiByteChar += 2;
                    bArr[i14] = (byte) i13;
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
                }
            } else if (cCharAt <= 2047) {
                int i15 = i_outputMultiByteChar + 1;
                bArr[i_outputMultiByteChar] = (byte) ((cCharAt >> 6) | 192);
                i_outputMultiByteChar += 2;
                bArr[i15] = (byte) ((cCharAt & '?') | 128);
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(cCharAt, i_outputMultiByteChar);
            }
            i10 = i12;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    private final void _writeStringSegments(String str, int i10, int i11) throws IOException {
        do {
            int iMin = Math.min(this._outputMaxContiguous, i11);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        UTF8JsonGenerator uTF8JsonGenerator;
        InputStream inputStream2;
        byte[] bArr2;
        int i_readMore;
        int i11 = this._outputEnd - 6;
        int i12 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i13 = -3;
        int i14 = i10;
        int i15 = 0;
        int i_readMore2 = 0;
        while (true) {
            if (i14 <= 2) {
                uTF8JsonGenerator = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            uTF8JsonGenerator = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i15 > i13) {
                i_readMore2 = uTF8JsonGenerator._readMore(inputStream2, bArr2, i15, i_readMore2, i14);
                if (i_readMore2 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = i_readMore2 - 3;
                i15 = 0;
            }
            if (uTF8JsonGenerator._outputTail > i11) {
                uTF8JsonGenerator._flushBuffer();
            }
            int i16 = i15 + 2;
            int i17 = ((bArr2[i15 + 1] & ForkServer.ERROR) | (bArr2[i15] << 8)) << 8;
            i15 += 3;
            i14 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr2[i16] & ForkServer.ERROR), uTF8JsonGenerator._outputBuffer, uTF8JsonGenerator._outputTail);
            uTF8JsonGenerator._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr3 = uTF8JsonGenerator._outputBuffer;
                int i18 = iEncodeBase64Chunk + 1;
                uTF8JsonGenerator._outputTail = i18;
                bArr3[iEncodeBase64Chunk] = BYTE_BACKSLASH;
                uTF8JsonGenerator._outputTail = iEncodeBase64Chunk + 2;
                bArr3[i18] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            this = uTF8JsonGenerator;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i14 <= 0 || (i_readMore = uTF8JsonGenerator._readMore(inputStream2, bArr2, i15, i_readMore2, i14)) <= 0) {
            return i14;
        }
        if (uTF8JsonGenerator._outputTail > i11) {
            uTF8JsonGenerator._flushBuffer();
        }
        int i19 = bArr2[0] << 16;
        if (1 < i_readMore) {
            i19 |= (bArr2[1] & ForkServer.ERROR) << 8;
        } else {
            i12 = 1;
        }
        uTF8JsonGenerator._outputTail = base64Variant.encodeBase64Partial(i19, i12, uTF8JsonGenerator._outputBuffer, uTF8JsonGenerator._outputTail);
        return i14 - i12;
    }

    private final void _writeStringSegmentASCII2(String str, int i10, int i11) throws IOException {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i12 = this._maximumNonEscapedChar;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i14 = iArr[cCharAt];
                if (i14 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) cCharAt;
                    i10 = i13;
                    i_outputMultiByteChar++;
                } else if (i14 > 0) {
                    int i15 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = BYTE_BACKSLASH;
                    i_outputMultiByteChar += 2;
                    bArr[i15] = (byte) i14;
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
                }
            } else if (cCharAt > i12) {
                i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
            } else if (cCharAt <= 2047) {
                int i16 = i_outputMultiByteChar + 1;
                bArr[i_outputMultiByteChar] = (byte) ((cCharAt >> 6) | 192);
                i_outputMultiByteChar += 2;
                bArr[i16] = (byte) ((cCharAt & '?') | 128);
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(cCharAt, i_outputMultiByteChar);
            }
            i10 = i13;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int iAppendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i11 + i11;
        int i13 = this._outputTail + i12;
        int i14 = this._outputEnd;
        if (i13 > i14) {
            if (i14 < i12) {
                _writeSegmentedRaw(cArr, i10, i11);
                return;
            }
            _flushBuffer();
        }
        int i15 = i11 + i10;
        while (i10 < i15) {
            do {
                char c10 = cArr[i10];
                if (c10 > 127) {
                    i10++;
                    if (c10 < 2048) {
                        byte[] bArr = this._outputBuffer;
                        int i16 = this._outputTail;
                        int i17 = i16 + 1;
                        this._outputTail = i17;
                        bArr[i16] = (byte) ((c10 >> 6) | 192);
                        this._outputTail = i16 + 2;
                        bArr[i17] = (byte) ((c10 & '?') | 128);
                    } else {
                        i10 = _outputRawMultiByteChar(c10, cArr, i10, i15);
                    }
                } else {
                    byte[] bArr2 = this._outputBuffer;
                    int i18 = this._outputTail;
                    this._outputTail = i18 + 1;
                    bArr2[i18] = (byte) c10;
                    i10++;
                }
            } while (i10 < i15);
            return;
        }
    }

    public final void _writePPFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z10 = this._cfgUnqNames;
        if (!z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = this._quoteChar;
        }
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
        if (z10) {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    @Deprecated
    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream) {
        this(iOContext, i10, objectCodec, outputStream, JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = BYTE_COMMA;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr2[i11] = this._quoteChar;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i12);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d10) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(d10) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d10));
        } else {
            writeString(String.valueOf(d10));
        }
    }

    @Deprecated
    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream, byte[] bArr, int i11, boolean z10) {
        this(iOContext, i10, objectCodec, outputStream, JsonFactory.DEFAULT_QUOTE_CHAR, bArr, i11, z10);
    }

    private final void _writeCustomStringSegment2(String str, int i10, int i11) throws IOException {
        if (this._outputTail + ((i11 - i10) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i12 = this._maximumNonEscapedChar;
        if (i12 <= 0) {
            i12 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i10 < i11) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 127) {
                int i14 = iArr[cCharAt];
                if (i14 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) cCharAt;
                    i10 = i13;
                    i_outputMultiByteChar++;
                } else if (i14 > 0) {
                    int i15 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = BYTE_BACKSLASH;
                    i_outputMultiByteChar += 2;
                    bArr[i15] = (byte) i14;
                } else if (i14 == -2) {
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence == null) {
                        _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                    }
                    i_outputMultiByteChar = _writeCustomEscape(bArr, i_outputMultiByteChar, escapeSequence, i11 - i13);
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
                }
            } else if (cCharAt > i12) {
                i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                if (escapeSequence2 != null) {
                    i_outputMultiByteChar = _writeCustomEscape(bArr, i_outputMultiByteChar, escapeSequence2, i11 - i13);
                } else if (cCharAt <= 2047) {
                    int i16 = i_outputMultiByteChar + 1;
                    bArr[i_outputMultiByteChar] = (byte) ((cCharAt >> 6) | 192);
                    i_outputMultiByteChar += 2;
                    bArr[i16] = (byte) ((cCharAt & '?') | 128);
                } else {
                    i_outputMultiByteChar = _outputMultiByteChar(cCharAt, i_outputMultiByteChar);
                }
            }
            i10 = i13;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr[i12] = this._quoteChar;
        if (i11 <= this._outputMaxContiguous) {
            if (i13 + i11 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i10, i11);
        } else {
            _writeStringSegments(cArr, i10, i11);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr2[i14] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c10 <= 127) {
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = (byte) c10;
        } else {
            if (c10 < 2048) {
                int i11 = this._outputTail;
                int i12 = i11 + 1;
                this._outputTail = i12;
                bArr[i11] = (byte) ((c10 >> 6) | 192);
                this._outputTail = i11 + 2;
                bArr[i12] = (byte) ((c10 & '?') | 128);
                return;
            }
            _outputRawMultiByteChar(c10, null, 0, 0);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f10) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f10));
        } else {
            writeString(String.valueOf(f10));
        }
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2 = bArr;
        int i10 = this._outputEnd - 6;
        int i11 = 2;
        int i12 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i13 = 0;
        int i_readMore = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                i_readMore = _readMore(inputStream, bArr2, i13, i_readMore, bArr2.length);
                if (i_readMore < 3) {
                    break;
                }
                i12 = i_readMore - 3;
                i13 = 0;
            }
            if (this._outputTail > i10) {
                _flushBuffer();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & ForkServer.ERROR) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i16 | (bArr[i15] & ForkServer.ERROR), this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr3 = this._outputBuffer;
                int i17 = iEncodeBase64Chunk + 1;
                this._outputTail = i17;
                bArr3[iEncodeBase64Chunk] = BYTE_BACKSLASH;
                this._outputTail = iEncodeBase64Chunk + 2;
                bArr3[i17] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            bArr2 = bArr;
        }
        if (i_readMore <= 0) {
            return i14;
        }
        if (this._outputTail > i10) {
            _flushBuffer();
        }
        int i18 = bArr[0] << 16;
        if (1 < i_readMore) {
            i18 |= (bArr[1] & ForkServer.ERROR) << 8;
        } else {
            i11 = 1;
        }
        int i19 = i14 + i11;
        this._outputTail = base64Variant.encodeBase64Partial(i18, i11, this._outputBuffer, this._outputTail);
        return i19;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i11);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(char[] cArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(cArr, i10, i11);
        } else {
            writeRaw(cArr, i10, i11);
        }
    }
}
