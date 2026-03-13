package md;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import md.p;

/* JADX INFO: renamed from: md.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5047a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40286a = 0;

    public v b() {
        return new v(this);
    }

    public void c(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        C5052f c5052fI = C5052f.I(outputStream, C5052f.t(C5052f.u(serializedSize) + serializedSize));
        c5052fI.n0(serializedSize);
        a(c5052fI);
        c5052fI.H();
    }

    /* JADX INFO: renamed from: md.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0530a implements p.a {
        public static v i(p pVar) {
            return new v(pVar);
        }

        @Override // 
        public abstract AbstractC0530a e();

        @Override // md.p.a
        /* JADX INFO: renamed from: g */
        public abstract AbstractC0530a v0(C5051e c5051e, C5053g c5053g);

        /* JADX INFO: renamed from: md.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0531a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f40287a;

            public C0531a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f40287a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f40287a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f40287a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f40287a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f40287a));
                if (jSkip >= 0) {
                    this.f40287a = (int) (((long) this.f40287a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f40287a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f40287a -= i13;
                }
                return i13;
            }
        }
    }
}
