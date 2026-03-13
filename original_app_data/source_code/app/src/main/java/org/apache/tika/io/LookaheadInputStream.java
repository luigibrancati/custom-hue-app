package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LookaheadInputStream extends InputStream {
    private final byte[] buffer;
    private InputStream stream;
    private int buffered = 0;
    private int position = 0;
    private int mark = 0;

    public LookaheadInputStream(InputStream inputStream, int i10) {
        this.stream = inputStream;
        this.buffer = new byte[i10];
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    private void fill() throws IOException {
        InputStream inputStream;
        if (available() == 0) {
            int i10 = this.buffered;
            byte[] bArr = this.buffer;
            if (i10 >= bArr.length || (inputStream = this.stream) == null) {
                return;
            }
            int i11 = inputStream.read(bArr, i10, bArr.length - i10);
            if (i11 != -1) {
                this.buffered += i11;
            } else {
                close();
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.buffered - this.position;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            inputStream.reset();
            this.stream = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        this.mark = this.position;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        fill();
        int i10 = this.buffered;
        int i11 = this.position;
        if (i10 <= i11) {
            return -1;
        }
        byte[] bArr = this.buffer;
        this.position = i11 + 1;
        return bArr[i11] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.position = this.mark;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        fill();
        long jMin = Math.min(j10, available());
        this.position = (int) (((long) this.position) + jMin);
        return jMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        fill();
        int i12 = this.buffered;
        int i13 = this.position;
        if (i12 <= i13) {
            return -1;
        }
        int iMin = Math.min(i11, i12 - i13);
        System.arraycopy(this.buffer, this.position, bArr, i10, iMin);
        this.position += iMin;
        return iMin;
    }
}
