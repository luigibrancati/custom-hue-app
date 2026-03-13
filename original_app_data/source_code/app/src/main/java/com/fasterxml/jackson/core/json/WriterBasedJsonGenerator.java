package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected static final int SHORT_WRITE = 32;
    protected char[] _copyBuffer;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar;
    protected final Writer _writer;

    @Deprecated
    public WriterBasedJsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, Writer writer) {
        this(iOContext, i10, objectCodec, writer, JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    private char[] _allocateCopyBuffer() {
        if (this._copyBuffer == null) {
            this._copyBuffer = this._ioContext.allocNameCopyBuffer(2000);
        }
        return this._copyBuffer;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c10, int i10) throws IOException {
        String value;
        int i11;
        if (i10 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i12 = this._outputTail;
            int i13 = i12 + 1;
            this._outputTail = i13;
            cArr[i12] = '\\';
            this._outputTail = i12 + 2;
            cArr[i13] = (char) i10;
            return;
        }
        if (i10 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i14 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        cArr2[i14] = '\\';
        int i15 = i14 + 2;
        cArr2[i14 + 1] = 'u';
        if (c10 > 255) {
            int i16 = c10 >> '\b';
            int i17 = i14 + 3;
            char[] cArr3 = HEX_CHARS;
            cArr2[i15] = cArr3[(i16 & 255) >> 4];
            i11 = i14 + 4;
            cArr2[i17] = cArr3[i16 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i18 = i14 + 3;
            cArr2[i15] = '0';
            i11 = i14 + 4;
            cArr2[i18] = '0';
        }
        char[] cArr4 = HEX_CHARS;
        cArr2[i11] = cArr4[c10 >> 4];
        cArr2[i11 + 1] = cArr4[c10 & 15];
        this._outputTail = i11 + 2;
    }

    private void _prependOrWriteCharacterEscape(char c10, int i10) throws IOException {
        String value;
        int i11;
        if (i10 >= 0) {
            int i12 = this._outputTail;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this._outputHead = i13;
                char[] cArr = this._outputBuffer;
                cArr[i13] = '\\';
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr_allocateEntityBuffer[1] = (char) i10;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return;
        }
        if (i10 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            int i14 = this._outputTail;
            if (i14 < length) {
                this._outputHead = i14;
                this._writer.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this._outputHead = i15;
                value.getChars(0, length, this._outputBuffer, i15);
                return;
            }
        }
        int i16 = this._outputTail;
        if (i16 < 6) {
            char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
            if (cArr_allocateEntityBuffer2 == null) {
                cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c10 <= 255) {
                char[] cArr2 = HEX_CHARS;
                cArr_allocateEntityBuffer2[6] = cArr2[c10 >> 4];
                cArr_allocateEntityBuffer2[7] = cArr2[c10 & 15];
                this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
                return;
            }
            int i17 = c10 >> '\b';
            char[] cArr3 = HEX_CHARS;
            cArr_allocateEntityBuffer2[10] = cArr3[(i17 & 255) >> 4];
            cArr_allocateEntityBuffer2[11] = cArr3[i17 & 15];
            cArr_allocateEntityBuffer2[12] = cArr3[(c10 & 255) >> 4];
            cArr_allocateEntityBuffer2[13] = cArr3[c10 & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return;
        }
        char[] cArr4 = this._outputBuffer;
        int i18 = i16 - 6;
        this._outputHead = i18;
        cArr4[i18] = '\\';
        cArr4[i16 - 5] = 'u';
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            char[] cArr5 = HEX_CHARS;
            cArr4[i16 - 4] = cArr5[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr4[i11] = cArr5[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr4[i16 - 4] = '0';
            i11 = i16 - 3;
            cArr4[i11] = '0';
        }
        char[] cArr6 = HEX_CHARS;
        cArr4[i11 + 1] = cArr6[c10 >> 4];
        cArr4[i11 + 2] = cArr6[c10 & 15];
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) {
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

    private final void _writeFieldNameTail(SerializableString serializableString) throws IOException {
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
    }

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i10 = 0;
        while (true) {
            int i11 = this._outputEnd;
            if (i10 + i11 > length) {
                i11 = length - i10;
            }
            int i12 = i10 + i11;
            str.getChars(i10, i12, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i11);
            } else {
                int i13 = this._maximumNonEscapedChar;
                if (i13 != 0) {
                    _writeSegmentASCII(i11, i13);
                } else {
                    _writeSegment(i11);
                }
            }
            if (i12 >= length) {
                return;
            } else {
                i10 = i12;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i10 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i10] = 'n';
        cArr[i10 + 1] = 'u';
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this._outputTail = i10 + 4;
    }

    private void _writeQuotedInt(int i10) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        cArr[i11] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(i10, cArr, i12);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j10) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int iOutputLong = NumberOutput.outputLong(j10, cArr, i11);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputLong + 1;
        cArr2[iOutputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    private void _writeQuotedShort(short s10) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s10, cArr, i11);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeSegment(int i10) throws IOException {
        char[] cArr;
        char c10;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i11 = 0;
        int i_prependOrWriteCharacterEscape = 0;
        while (i11 < i10) {
            do {
                cArr = this._outputBuffer;
                c10 = cArr[i11];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i11++;
                }
            } while (i11 < i10);
            int i12 = i11 - i_prependOrWriteCharacterEscape;
            if (i12 > 0) {
                this._writer.write(cArr, i_prependOrWriteCharacterEscape, i12);
                if (i11 >= i10) {
                    return;
                }
            }
            int i13 = i11 + 1;
            i_prependOrWriteCharacterEscape = _prependOrWriteCharacterEscape(this._outputBuffer, i13, i10, c10, iArr[c10]);
            i11 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[PHI: r4
      0x001e: PHI (r4v7 int) = (r4v2 int), (r4v8 int) binds: [B:9:0x001a, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeSegmentASCII(int r13, int r14) throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r2 >= r13) goto L3c
        Le:
            char[] r5 = r12._outputBuffer
            char r10 = r5[r2]
            if (r10 >= r1) goto L1a
            r4 = r0[r10]
            if (r4 == 0) goto L1e
        L18:
            r11 = r4
            goto L23
        L1a:
            if (r10 <= r14) goto L1e
            r4 = -1
            goto L18
        L1e:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
            goto L18
        L23:
            int r4 = r2 - r3
            if (r4 <= 0) goto L2f
            java.io.Writer r6 = r12._writer
            r6.write(r5, r3, r4)
            if (r2 < r13) goto L2f
            goto L3c
        L2f:
            int r8 = r2 + 1
            char[] r7 = r12._outputBuffer
            r6 = r12
            r9 = r13
            int r3 = r6._prependOrWriteCharacterEscape(r7, r8, r9, r10, r11)
            r2 = r8
            r4 = r11
            goto Lc
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentASCII(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[PHI: r6
      0x0032: PHI (r6v8 int) = (r6v2 int), (r6v9 int) binds: [B:15:0x002e, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeSegmentCustom(int r15) throws java.io.IOException {
        /*
            r14 = this;
            int[] r0 = r14._outputEscapes
            int r1 = r14._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto La
            r1 = 65535(0xffff, float:9.1834E-41)
        La:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r14._characterEscapes
            r4 = 0
            r5 = r4
            r6 = r5
        L16:
            if (r4 >= r15) goto L52
        L18:
            char[] r7 = r14._outputBuffer
            char r12 = r7[r4]
            if (r12 >= r2) goto L24
            r6 = r0[r12]
            if (r6 == 0) goto L32
        L22:
            r13 = r6
            goto L37
        L24:
            if (r12 <= r1) goto L28
            r6 = -1
            goto L22
        L28:
            com.fasterxml.jackson.core.SerializableString r7 = r3.getEscapeSequence(r12)
            r14._currentEscape = r7
            if (r7 == 0) goto L32
            r6 = -2
            goto L22
        L32:
            int r4 = r4 + 1
            if (r4 < r15) goto L18
            goto L22
        L37:
            int r6 = r4 - r5
            if (r6 <= 0) goto L45
            java.io.Writer r7 = r14._writer
            char[] r8 = r14._outputBuffer
            r7.write(r8, r5, r6)
            if (r4 < r15) goto L45
            goto L52
        L45:
            int r10 = r4 + 1
            char[] r9 = r14._outputBuffer
            r8 = r14
            r11 = r15
            int r5 = r8._prependOrWriteCharacterEscape(r9, r10, r11, r12, r13)
            r4 = r10
            r6 = r13
            goto L16
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentCustom(int):void");
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i10 = this._outputEnd;
        if (length > i10) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i10) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i11 = this._maximumNonEscapedChar;
        if (i11 != 0) {
            _writeStringASCII(length, i11);
        } else {
            _writeString2(length);
        }
    }

    private void _writeString2(SerializableString serializableString) throws IOException {
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(cArrAsQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringASCII(int r9, int r10) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8._outputHead
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8._writer
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            r8._prependOrWriteCharacterEscape(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8._outputTail = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringCustom(int r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11._outputTail
            int r0 = r0 + r12
            int[] r12 = r11._outputEscapes
            int r1 = r11._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto Ld
            r1 = 65535(0xffff, float:9.1834E-41)
        Ld:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.io.CharacterEscapes r4 = r11._characterEscapes
        L16:
            int r5 = r11._outputTail
            if (r5 >= r0) goto L52
        L1a:
            char[] r5 = r11._outputBuffer
            int r6 = r11._outputTail
            char r5 = r5[r6]
            if (r5 >= r3) goto L27
            r6 = r12[r5]
            if (r6 == 0) goto L4b
            goto L34
        L27:
            if (r5 <= r1) goto L2b
            r6 = -1
            goto L34
        L2b:
            com.fasterxml.jackson.core.SerializableString r6 = r4.getEscapeSequence(r5)
            r11._currentEscape = r6
            if (r6 == 0) goto L4b
            r6 = -2
        L34:
            int r7 = r11._outputTail
            int r8 = r11._outputHead
            int r7 = r7 - r8
            if (r7 <= 0) goto L42
            java.io.Writer r9 = r11._writer
            char[] r10 = r11._outputBuffer
            r9.write(r10, r8, r7)
        L42:
            int r7 = r11._outputTail
            int r7 = r7 + r2
            r11._outputTail = r7
            r11._prependOrWriteCharacterEscape(r5, r6)
            goto L16
        L4b:
            int r5 = r11._outputTail
            int r5 = r5 + r2
            r11._outputTail = r5
            if (r5 < r0) goto L1a
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(int):void");
    }

    private void writeRawLong(String str) throws IOException {
        int i10 = this._outputEnd;
        int i11 = this._outputTail;
        int i12 = i10 - i11;
        str.getChars(0, i12, this._outputBuffer, i11);
        this._outputTail += i12;
        _flushBuffer();
        int length = str.length() - i12;
        while (true) {
            int i13 = this._outputEnd;
            if (length <= i13) {
                str.getChars(i12, i12 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i13;
                _flushBuffer();
                length -= i13;
                i12 = i14;
            }
        }
    }

    public void _flushBuffer() throws IOException {
        int i10 = this._outputTail;
        int i11 = this._outputHead;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i11, i12);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._copyBuffer;
        if (cArr2 != null) {
            this._copyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        char c10;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            c10 = ',';
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    SerializableString serializableString = this._rootValueSeparator;
                    if (serializableString != null) {
                        writeRaw(serializableString.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = ':';
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = c10;
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
            char[] cArr = this._outputBuffer;
            int i17 = iEncodeBase64Chunk + 1;
            this._outputTail = i17;
            cArr[iEncodeBase64Chunk] = '\\';
            this._outputTail = iEncodeBase64Chunk + 2;
            cArr[i17] = 'n';
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

    public final void _writeFieldName(String str, boolean z10) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z10);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr3[i12] = this._quoteChar;
    }

    public final void _writePPFieldName(String str, boolean z10) throws IOException {
        if (z10) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteFormattedNumbers() {
        return true;
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
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return Math.max(0, this._outputTail - this._outputHead);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._writer;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr[i12] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i10, i11 + i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr2[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z10) throws IOException {
        int i10;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = 'u';
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = 's';
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this._outputTail = i10 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
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
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = ']';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
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
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = '}';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(str, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s10);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s10, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i10 = this._outputEnd - this._outputTail;
        if (i10 == 0) {
            _flushBuffer();
            i10 = this._outputEnd - this._outputTail;
        }
        if (i10 < length) {
            writeRawLong(str);
        } else {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i10, int i11) {
        _reportUnsupportedOperation();
    }

    public WriterBasedJsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, Writer writer, char c10) {
        super(iOContext, i10, objectCodec);
        this._writer = writer;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = cArrAllocConcatBuffer;
        this._outputEnd = cArrAllocConcatBuffer.length;
        this._quoteChar = c10;
        if (c10 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c10);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializableString, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i10);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i10, this._outputBuffer, this._outputTail);
    }

    private void _writeQuotedRaw(char[] cArr, int i10, int i11) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
        writeRaw(cArr, i10, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i10, int i11) throws IOException {
        int i12 = this._outputEnd - this._outputTail;
        if (i12 < i11) {
            _flushBuffer();
            i12 = this._outputEnd - this._outputTail;
        }
        if (i12 >= i11) {
            str.getChars(i10, i10 + i11, this._outputBuffer, this._outputTail);
            this._outputTail += i11;
        } else {
            writeRawLong(str.substring(i10, i11 + i10));
        }
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
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr[i11] = '[';
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
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = '{';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr[i11] = this._quoteChar;
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
            char[] cArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            cArr2[i12] = this._quoteChar;
            return i10;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i10) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        if (this._outputTail + i10 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr[i12] = this._quoteChar;
        char[] cArr_allocateCopyBuffer = _allocateCopyBuffer();
        while (i11 > 0) {
            int i13 = reader.read(cArr_allocateCopyBuffer, 0, Math.min(i11, cArr_allocateCopyBuffer.length));
            if (i13 <= 0) {
                break;
            }
            if (this._outputTail + i10 >= this._outputEnd) {
                _flushBuffer();
            }
            _writeString(cArr_allocateCopyBuffer, 0, i13);
            i11 -= i13;
        }
        if (this._outputTail + i10 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        cArr2[i14] = this._quoteChar;
        if (i11 <= 0 || i10 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    private void _writeString(char[] cArr, int i10, int i11) throws IOException {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i10, i11);
            return;
        }
        int i12 = this._maximumNonEscapedChar;
        if (i12 != 0) {
            _writeStringASCII(cArr, i10, i11, i12);
            return;
        }
        int i13 = i11 + i10;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i10 < i13) {
            int i14 = i10;
            do {
                char c10 = cArr[i14];
                if (c10 < length && iArr[c10] != 0) {
                    break;
                } else {
                    i14++;
                }
            } while (i14 < i13);
            int i15 = i14 - i10;
            if (i15 < 32) {
                if (this._outputTail + i15 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i15 > 0) {
                    System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i15);
                    this._outputTail += i15;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i10, i15);
            }
            if (i14 >= i13) {
                return;
            }
            i10 = i14 + 1;
            char c11 = cArr[i14];
            _appendCharacterEscape(c11, iArr[c11]);
        }
    }

    private void _writeString2(int i10) throws IOException {
        int i11;
        int i12 = this._outputTail + i10;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i12) {
            do {
                char[] cArr = this._outputBuffer;
                int i13 = this._outputTail;
                char c10 = cArr[i13];
                if (c10 < length && iArr[c10] != 0) {
                    int i14 = this._outputHead;
                    int i15 = i13 - i14;
                    if (i15 > 0) {
                        this._writer.write(cArr, i14, i15);
                    }
                    char[] cArr2 = this._outputBuffer;
                    int i16 = this._outputTail;
                    this._outputTail = i16 + 1;
                    char c11 = cArr2[i16];
                    _prependOrWriteCharacterEscape(c11, iArr[c11]);
                } else {
                    i11 = i13 + 1;
                    this._outputTail = i11;
                }
            } while (i11 < i12);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r2
      0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringASCII(char[] r9, int r10, int r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8._outputEscapes
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8._outputTail
            int r6 = r6 + r5
            int r7 = r8._outputEnd
            if (r6 <= r7) goto L2f
            r8._flushBuffer()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8._outputBuffer
            int r7 = r8._outputTail
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8._outputTail
            int r10 = r10 + r5
            r8._outputTail = r10
            goto L46
        L3e:
            r8._flushBuffer()
            java.io.Writer r6 = r8._writer
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8._appendCharacterEscape(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(char[], int, int, int):void");
    }

    public final void _writePPFieldName(SerializableString serializableString, boolean z10) throws IOException {
        if (z10) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    public final void _writeFieldName(SerializableString serializableString, boolean z10) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z10);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = ',';
        }
        if (this._cfgUnqNames) {
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        cArr2[i11] = this._quoteChar;
        int iAppendQuoted = serializableString.appendQuoted(cArr2, i12);
        if (iAppendQuoted < 0) {
            _writeFieldNameTail(serializableString);
            return;
        }
        int i13 = this._outputTail + iAppendQuoted;
        this._outputTail = i13;
        if (i13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        cArr3[i14] = this._quoteChar;
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
    public void writeRaw(SerializableString serializableString) throws IOException {
        int iAppendUnquoted = serializableString.appendUnquoted(this._outputBuffer, this._outputTail);
        if (iAppendUnquoted < 0) {
            writeRaw(serializableString.getValue());
        } else {
            this._outputTail += iAppendUnquoted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[PHI: r4
      0x002f: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002b, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringCustom(char[] r11, int r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            int r13 = r13 + r12
            int[] r0 = r10._outputEscapes
            int r1 = r10._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto Lb
            r1 = 65535(0xffff, float:9.1834E-41)
        Lb:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r10._characterEscapes
            r4 = 0
        L15:
            if (r12 >= r13) goto L63
            r5 = r12
        L18:
            char r6 = r11[r5]
            if (r6 >= r2) goto L21
            r4 = r0[r6]
            if (r4 == 0) goto L2f
            goto L33
        L21:
            if (r6 <= r1) goto L25
            r4 = -1
            goto L33
        L25:
            com.fasterxml.jackson.core.SerializableString r7 = r3.getEscapeSequence(r6)
            r10._currentEscape = r7
            if (r7 == 0) goto L2f
            r4 = -2
            goto L33
        L2f:
            int r5 = r5 + 1
            if (r5 < r13) goto L18
        L33:
            int r7 = r5 - r12
            r8 = 32
            if (r7 >= r8) goto L52
            int r8 = r10._outputTail
            int r8 = r8 + r7
            int r9 = r10._outputEnd
            if (r8 <= r9) goto L43
            r10._flushBuffer()
        L43:
            if (r7 <= 0) goto L5a
            char[] r8 = r10._outputBuffer
            int r9 = r10._outputTail
            java.lang.System.arraycopy(r11, r12, r8, r9, r7)
            int r12 = r10._outputTail
            int r12 = r12 + r7
            r10._outputTail = r12
            goto L5a
        L52:
            r10._flushBuffer()
            java.io.Writer r8 = r10._writer
            r8.write(r11, r12, r7)
        L5a:
            if (r5 < r13) goto L5d
            goto L63
        L5d:
            int r12 = r5 + 1
            r10._appendCharacterEscape(r6, r4)
            goto L15
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(char[], int, int):void");
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator;
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
                writerBasedJsonGenerator = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            writerBasedJsonGenerator = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i15 > i13) {
                i_readMore2 = writerBasedJsonGenerator._readMore(inputStream2, bArr2, i15, i_readMore2, i14);
                if (i_readMore2 < 3) {
                    i15 = 0;
                    break;
                }
                i13 = i_readMore2 - 3;
                i15 = 0;
            }
            if (writerBasedJsonGenerator._outputTail > i11) {
                writerBasedJsonGenerator._flushBuffer();
            }
            int i16 = i15 + 2;
            int i17 = ((bArr2[i15 + 1] & ForkServer.ERROR) | (bArr2[i15] << 8)) << 8;
            i15 += 3;
            i14 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i17 | (bArr2[i16] & ForkServer.ERROR), writerBasedJsonGenerator._outputBuffer, writerBasedJsonGenerator._outputTail);
            writerBasedJsonGenerator._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = writerBasedJsonGenerator._outputBuffer;
                int i18 = iEncodeBase64Chunk + 1;
                writerBasedJsonGenerator._outputTail = i18;
                cArr[iEncodeBase64Chunk] = '\\';
                writerBasedJsonGenerator._outputTail = iEncodeBase64Chunk + 2;
                cArr[i18] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            this = writerBasedJsonGenerator;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i14 <= 0 || (i_readMore = writerBasedJsonGenerator._readMore(inputStream2, bArr2, i15, i_readMore2, i14)) <= 0) {
            return i14;
        }
        if (writerBasedJsonGenerator._outputTail > i11) {
            writerBasedJsonGenerator._flushBuffer();
        }
        int i19 = bArr2[0] << 16;
        if (1 < i_readMore) {
            i19 |= (bArr2[1] & ForkServer.ERROR) << 8;
        } else {
            i12 = 1;
        }
        writerBasedJsonGenerator._outputTail = base64Variant.encodeBase64Partial(i19, i12, writerBasedJsonGenerator._outputBuffer, writerBasedJsonGenerator._outputTail);
        return i14 - i12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        if (i11 < 32) {
            if (i11 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i11);
            this._outputTail += i11;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i10, i11);
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
    public void writeRaw(char c10) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d10) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(d10) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d10));
        } else {
            writeString(String.valueOf(d10));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
        _writeString(cArr, i10, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f10) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f10) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f10));
        } else {
            writeString(String.valueOf(f10));
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int iAppendQuoted = serializableString.appendQuoted(cArr, i11);
        if (iAppendQuoted < 0) {
            _writeString2(serializableString);
            return;
        }
        int i12 = this._outputTail + iAppendQuoted;
        this._outputTail = i12;
        if (i12 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr2[i13] = this._quoteChar;
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
                char[] cArr = this._outputBuffer;
                int i17 = iEncodeBase64Chunk + 1;
                this._outputTail = i17;
                cArr[iEncodeBase64Chunk] = '\\';
                this._outputTail = iEncodeBase64Chunk + 2;
                cArr[i17] = 'n';
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
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i10, int i11, char c10, int i12) throws IOException {
        String value;
        int i13;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = '\\';
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            cArr_allocateEntityBuffer[1] = (char) i12;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (i10 >= length && i10 < i11) {
                int i15 = i10 - length;
                value.getChars(0, length, cArr, i15);
                return i15;
            }
            this._writer.write(value);
            return i10;
        }
        if (i10 > 5 && i10 < i11) {
            cArr[i10 - 6] = '\\';
            int i16 = i10 - 4;
            cArr[i10 - 5] = 'u';
            if (c10 > 255) {
                int i17 = c10 >> '\b';
                int i18 = i10 - 3;
                char[] cArr2 = HEX_CHARS;
                cArr[i16] = cArr2[(i17 & 255) >> 4];
                i13 = i10 - 2;
                cArr[i18] = cArr2[i17 & 15];
                c10 = (char) (c10 & 255);
            } else {
                int i19 = i10 - 3;
                cArr[i16] = '0';
                i13 = i10 - 2;
                cArr[i19] = '0';
            }
            char[] cArr3 = HEX_CHARS;
            cArr[i13] = cArr3[c10 >> 4];
            cArr[i13 + 1] = cArr3[c10 & 15];
            return i13 - 4;
        }
        char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
        if (cArr_allocateEntityBuffer2 == null) {
            cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
        }
        this._outputHead = this._outputTail;
        if (c10 > 255) {
            int i20 = c10 >> '\b';
            char[] cArr4 = HEX_CHARS;
            cArr_allocateEntityBuffer2[10] = cArr4[(i20 & 255) >> 4];
            cArr_allocateEntityBuffer2[11] = cArr4[i20 & 15];
            cArr_allocateEntityBuffer2[12] = cArr4[(c10 & 255) >> 4];
            cArr_allocateEntityBuffer2[13] = cArr4[c10 & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return i10;
        }
        char[] cArr5 = HEX_CHARS;
        cArr_allocateEntityBuffer2[6] = cArr5[c10 >> 4];
        cArr_allocateEntityBuffer2[7] = cArr5[c10 & 15];
        this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
        return i10;
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
