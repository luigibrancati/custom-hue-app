package Ne;

import io.sentry.SentryEnvelopeItemHeader;
import java.io.InputStream;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10689d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends Ke.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10691l;

        public final byte[] n() {
            return b().c();
        }

        public h o() {
            return new h(this);
        }

        public b p(byte[] bArr) {
            Objects.requireNonNull(bArr, "origin");
            this.f10691l = bArr.length;
            return (b) super.d(bArr);
        }

        public b q(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("length cannot be negative");
            }
            this.f10691l = i10;
            return this;
        }

        public b r(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("offset cannot be negative");
            }
            this.f10690k = i10;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    public static int b(byte[] bArr, int i10) {
        c(i10, "defaultValue");
        return Math.min(i10, bArr.length > 0 ? bArr.length : i10);
    }

    public static int c(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    @Override // java.io.InputStream
    public int available() {
        int i10 = this.f10688c;
        int i11 = this.f10687b;
        if (i10 < i11) {
            return i11 - i10;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f10689d = this.f10688c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i10 = this.f10688c;
        if (i10 >= this.f10687b) {
            return -1;
        }
        byte[] bArr = this.f10686a;
        this.f10688c = i10 + 1;
        return bArr[i10] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f10688c = this.f10689d;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i10 = this.f10687b;
        int i11 = this.f10688c;
        long j11 = i10 - i11;
        if (j10 < j11) {
            j11 = j10;
        }
        this.f10688c = Math.addExact(i11, Math.toIntExact(j10));
        return j11;
    }

    public h(b bVar) {
        this(bVar.n(), bVar.f10690k, bVar.f10691l);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    public h(byte[] bArr) {
        this(bArr, bArr.length, 0, 0);
    }

    public h(byte[] bArr, int i10, int i11) {
        c(i10, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        c(i11, SentryEnvelopeItemHeader.JsonKeys.LENGTH);
        Objects.requireNonNull(bArr, "data");
        this.f10686a = bArr;
        this.f10687b = Math.min(b(bArr, i10) + i11, bArr.length);
        this.f10688c = b(bArr, i10);
        this.f10689d = b(bArr, i10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "dest");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int i12 = this.f10688c;
            int i13 = this.f10687b;
            if (i12 >= i13) {
                return -1;
            }
            int i14 = i13 - i12;
            if (i11 >= i14) {
                i11 = i14;
            }
            if (i11 <= 0) {
                return 0;
            }
            System.arraycopy(this.f10686a, i12, bArr, i10, i11);
            this.f10688c += i11;
            return i11;
        }
        throw new IndexOutOfBoundsException();
    }

    public h(byte[] bArr, int i10, int i11, int i12) {
        Objects.requireNonNull(bArr, "data");
        this.f10686a = bArr;
        this.f10687b = i10;
        this.f10688c = i11;
        this.f10689d = i12;
    }
}
