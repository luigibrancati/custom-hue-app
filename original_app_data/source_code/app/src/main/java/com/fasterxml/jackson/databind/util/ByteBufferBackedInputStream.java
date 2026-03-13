package com.fasterxml.jackson.databind.util;

import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferBackedInputStream extends InputStream {
    protected final ByteBuffer _b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this._b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this._b.remaining();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this._b.hasRemaining()) {
            return this._b.get() & ForkServer.ERROR;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (!this._b.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, this._b.remaining());
        this._b.get(bArr, i10, iMin);
        return iMin;
    }
}
