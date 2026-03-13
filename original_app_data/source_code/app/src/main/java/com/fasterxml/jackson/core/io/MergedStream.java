package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class MergedStream extends InputStream {
    private byte[] _b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this._b = bArr;
        this._ptr = i10;
        this._end = i11;
    }

    private void _free() {
        byte[] bArr = this._b;
        if (bArr != null) {
            this._b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this._b != null ? this._end - this._ptr : this._in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        _free();
        this._in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        if (this._b == null) {
            this._in.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this._b == null && this._in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this._b;
        if (bArr == null) {
            return this._in.read();
        }
        int i10 = this._ptr;
        int i11 = i10 + 1;
        this._ptr = i11;
        int i12 = bArr[i10] & ForkServer.ERROR;
        if (i11 >= this._end) {
            _free();
        }
        return i12;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this._b == null) {
            this._in.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        long j11;
        if (this._b != null) {
            int i10 = this._end;
            int i11 = this._ptr;
            j11 = i10 - i11;
            if (j11 > j10) {
                this._ptr = i11 + ((int) j10);
                return j10;
            }
            _free();
            j10 -= j11;
        } else {
            j11 = 0;
        }
        return j10 > 0 ? j11 + this._in.skip(j10) : j11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this._b;
        if (bArr2 != null) {
            int i12 = this._end;
            int i13 = this._ptr;
            int i14 = i12 - i13;
            if (i11 > i14) {
                i11 = i14;
            }
            System.arraycopy(bArr2, i13, bArr, i10, i11);
            int i15 = this._ptr + i11;
            this._ptr = i15;
            if (i15 >= this._end) {
                _free();
            }
            return i11;
        }
        return this._in.read(bArr, i10, i11);
    }
}
