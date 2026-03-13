package org.apache.tika.io;

import Je.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class BoundedInputStream extends InputStream {
    private static final int EOF = -1;
    private final InputStream in;
    private final long max;
    private long pos;

    public BoundedInputStream(long j10, InputStream inputStream) {
        this.max = j10;
        this.in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.in.available();
    }

    public long getPos() {
        return this.pos;
    }

    public boolean hasHitBound() {
        return this.pos >= this.max;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.in.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j10 = this.max;
        if (j10 >= 0 && this.pos >= j10) {
            return -1;
        }
        int i10 = this.in.read();
        this.pos++;
        return i10;
    }

    @Override // java.io.InputStream
    public byte[] readNBytes(int i10) {
        return this.in.readNBytes(i10);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.in.reset();
        this.pos = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = this.max;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11 - this.pos);
        }
        long jSkip = this.in.skip(j10);
        this.pos += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        return f.n(this, outputStream);
    }

    @Override // java.io.InputStream
    public int readNBytes(byte[] bArr, int i10, int i11) {
        return this.in.readNBytes(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.max;
        if (j10 >= 0 && this.pos >= j10) {
            return -1;
        }
        int i12 = this.in.read(bArr, i10, (int) (j10 >= 0 ? Math.min(i11, j10 - this.pos) : i11));
        if (i12 == -1) {
            return -1;
        }
        this.pos += (long) i12;
        return i12;
    }
}
