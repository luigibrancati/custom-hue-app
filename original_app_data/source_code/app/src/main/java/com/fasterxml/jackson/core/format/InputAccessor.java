package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InputAccessor {
    boolean hasMoreBytes();

    byte nextByte();

    void reset();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Std implements InputAccessor {
        protected final byte[] _buffer;
        protected int _bufferedEnd;
        protected final int _bufferedStart;
        protected final InputStream _in;
        protected int _ptr;

        public Std(InputStream inputStream, byte[] bArr) {
            this._in = inputStream;
            this._buffer = bArr;
            this._bufferedStart = 0;
            this._ptr = 0;
            this._bufferedEnd = 0;
        }

        public DataFormatMatcher createMatcher(JsonFactory jsonFactory, MatchStrength matchStrength) {
            InputStream inputStream = this._in;
            byte[] bArr = this._buffer;
            int i10 = this._bufferedStart;
            return new DataFormatMatcher(inputStream, bArr, i10, this._bufferedEnd - i10, jsonFactory, matchStrength);
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public boolean hasMoreBytes() {
            int i10;
            int i11 = this._ptr;
            if (i11 < this._bufferedEnd) {
                return true;
            }
            InputStream inputStream = this._in;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this._buffer;
            int length = bArr.length - i11;
            if (length < 1 || (i10 = inputStream.read(bArr, i11, length)) <= 0) {
                return false;
            }
            this._bufferedEnd += i10;
            return true;
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public byte nextByte() throws EOFException {
            if (this._ptr < this._bufferedEnd || hasMoreBytes()) {
                byte[] bArr = this._buffer;
                int i10 = this._ptr;
                this._ptr = i10 + 1;
                return bArr[i10];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this._ptr + " bytes (max buffer size: " + this._buffer.length + ")");
        }

        @Override // com.fasterxml.jackson.core.format.InputAccessor
        public void reset() {
            this._ptr = this._bufferedStart;
        }

        public Std(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        public Std(byte[] bArr, int i10, int i11) {
            this._in = null;
            this._buffer = bArr;
            this._ptr = i10;
            this._bufferedStart = i10;
            this._bufferedEnd = i10 + i11;
        }
    }
}
