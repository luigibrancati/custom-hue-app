package org.apache.tika.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TailStream extends FilterInputStream {
    private static final int SKIP_SIZE = 4096;
    private long bytesRead;
    private int currentIndex;
    private byte[] markBuffer;
    private long markBytesRead;
    private int markIndex;
    private final byte[] tailBuffer;
    private final int tailSize;

    public TailStream(InputStream inputStream, int i10) {
        super(inputStream);
        this.tailSize = i10;
        this.tailBuffer = new byte[i10];
    }

    private void appendBuf(byte[] bArr, int i10, int i11) {
        if (i11 >= this.tailSize) {
            replaceTailBuffer(bArr, i10, i11);
        } else {
            copyToTailBuffer(bArr, i10, i11);
        }
        this.bytesRead += (long) i11;
    }

    private void appendByte(byte b10) {
        byte[] bArr = this.tailBuffer;
        int i10 = this.currentIndex;
        int i11 = i10 + 1;
        this.currentIndex = i11;
        bArr[i10] = b10;
        if (i11 >= this.tailSize) {
            this.currentIndex = 0;
        }
        this.bytesRead++;
    }

    private void copyToTailBuffer(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(this.tailSize - this.currentIndex, i11);
        System.arraycopy(bArr, i10, this.tailBuffer, this.currentIndex, iMin);
        System.arraycopy(bArr, i10 + iMin, this.tailBuffer, 0, i11 - iMin);
        this.currentIndex = (this.currentIndex + i11) % this.tailSize;
    }

    private void replaceTailBuffer(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.tailSize;
        System.arraycopy(bArr, i12 - i13, this.tailBuffer, 0, i13);
        this.currentIndex = 0;
    }

    public byte[] getTail() {
        int iMin = (int) Math.min(this.tailSize, this.bytesRead);
        byte[] bArr = new byte[iMin];
        byte[] bArr2 = this.tailBuffer;
        int i10 = this.currentIndex;
        System.arraycopy(bArr2, i10, bArr, 0, iMin - i10);
        byte[] bArr3 = this.tailBuffer;
        int i11 = this.currentIndex;
        System.arraycopy(bArr3, 0, bArr, iMin - i11, i11);
        return bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        int i11 = this.tailSize;
        byte[] bArr = new byte[i11];
        this.markBuffer = bArr;
        System.arraycopy(this.tailBuffer, 0, bArr, 0, i11);
        this.markIndex = this.currentIndex;
        this.markBytesRead = this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            appendByte((byte) i10);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        byte[] bArr = this.markBuffer;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.tailBuffer, 0, this.tailSize);
            this.currentIndex = this.markIndex;
            this.bytesRead = this.markBytesRead;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        int iMin = (int) Math.min(j10, 4096L);
        byte[] bArr = new byte[iMin];
        long j11 = 0;
        int i10 = 0;
        while (j11 < j10 && i10 != -1) {
            i10 = read(bArr, 0, (int) Math.min(iMin, j10 - j11));
            if (i10 != -1) {
                j11 += (long) i10;
            }
        }
        if (i10 >= 0 || j11 != 0) {
            return j11;
        }
        return -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i10 = super.read(bArr);
        if (i10 > 0) {
            appendBuf(bArr, 0, i10);
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 > 0) {
            appendBuf(bArr, i10, i12);
        }
        return i12;
    }
}
