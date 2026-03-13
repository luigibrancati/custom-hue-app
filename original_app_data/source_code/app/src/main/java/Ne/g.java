package Ne;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f10681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10685f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends Ke.d {
        public g k() {
            return new g(this);
        }
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f10684e;
        if (i10 != -1) {
            int i11 = this.f10685f - i10;
            int i12 = this.f10683d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f10681b = bArr2;
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f10685f - this.f10684e;
                this.f10685f = i13;
                this.f10684e = 0;
                this.f10682c = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f10685f;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f10682c = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f10684e = -1;
            this.f10685f = 0;
            this.f10682c = i16;
        }
        return i16;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f10692a;
        if (this.f10681b == null || inputStream == null) {
            throw new IOException("Stream is closed");
        }
        return (this.f10682c - this.f10685f) + inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10681b = null;
        InputStream inputStream = this.f10692a;
        this.f10692a = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f10683d = i10;
        this.f10684e = this.f10685f;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f10681b;
        InputStream inputStream = this.f10692a;
        if (bArr == null || inputStream == null) {
            throw new IOException("Stream is closed");
        }
        if (this.f10685f >= this.f10682c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f10681b && (bArr = this.f10681b) == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f10682c;
        int i11 = this.f10685f;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f10685f = i11 + 1;
        return bArr[i11] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f10681b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f10684e;
        if (-1 == i10) {
            throw new IOException("Mark has been invalidated");
        }
        this.f10685f = i10;
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        byte[] bArr = this.f10681b;
        InputStream inputStream = this.f10692a;
        if (bArr == null) {
            throw new IOException("Stream is closed");
        }
        if (j10 < 1) {
            return 0L;
        }
        if (inputStream == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f10682c;
        int i11 = this.f10685f;
        if (i10 - i11 >= j10) {
            this.f10685f = i11 + ((int) j10);
            return j10;
        }
        int i12 = i10 - i11;
        this.f10685f = i10;
        if (this.f10684e == -1 || j10 > this.f10683d) {
            long j11 = i12;
            return j11 + inputStream.skip(j10 - j11);
        }
        if (a(inputStream, bArr) == -1) {
            return i12;
        }
        int i13 = this.f10682c;
        int i14 = this.f10685f;
        if (i13 - i14 >= j10 - ((long) i12)) {
            this.f10685f = i14 + (((int) j10) - i12);
            return j10;
        }
        this.f10685f = i13;
        return i12 + (i13 - i14);
    }

    public g(b bVar) {
        super(bVar.h());
        this.f10684e = -1;
        int iG = bVar.g();
        if (iG <= 0) {
            throw new IllegalArgumentException("Size must be > 0");
        }
        this.f10681b = new byte[iG];
    }

    @Override // Ne.i, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f10681b;
        if (bArr2 != null) {
            if (i10 > bArr.length - i11 || i10 < 0 || i11 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return 0;
            }
            InputStream inputStream = this.f10692a;
            if (inputStream != null) {
                int i14 = this.f10685f;
                int i15 = this.f10682c;
                if (i14 < i15) {
                    int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                    System.arraycopy(bArr2, i14, bArr, i10, i16);
                    this.f10685f += i16;
                    if (i16 == i11 || inputStream.available() == 0) {
                        return i16;
                    }
                    i10 += i16;
                    i12 = i11 - i16;
                } else {
                    i12 = i11;
                }
                while (true) {
                    if (this.f10684e == -1 && i12 >= bArr2.length) {
                        i13 = inputStream.read(bArr, i10, i12);
                        if (i13 == -1) {
                            if (i12 == i11) {
                                return -1;
                            }
                            return i11 - i12;
                        }
                    } else {
                        if (a(inputStream, bArr2) == -1) {
                            if (i12 == i11) {
                                return -1;
                            }
                            return i11 - i12;
                        }
                        if (bArr2 != this.f10681b && (bArr2 = this.f10681b) == null) {
                            throw new IOException("Stream is closed");
                        }
                        int i17 = this.f10682c;
                        int i18 = this.f10685f;
                        i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                        System.arraycopy(bArr2, i18, bArr, i10, i13);
                        this.f10685f += i13;
                    }
                    i12 -= i13;
                    if (i12 == 0) {
                        return i11;
                    }
                    if (inputStream.available() == 0) {
                        return i11 - i12;
                    }
                    i10 += i13;
                }
            } else {
                throw new IOException("Stream is closed");
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }
}
