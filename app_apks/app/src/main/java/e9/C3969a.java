package e9;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: e9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3969a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f33841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.h f33842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f33843c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f33845e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33844d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f33846f = -1;

    public C3969a(InputStream inputStream, c9.h hVar, l lVar) {
        this.f33843c = lVar;
        this.f33841a = inputStream;
        this.f33842b = hVar;
        this.f33845e = hVar.e();
    }

    public final void a(long j10) {
        long j11 = this.f33844d;
        if (j11 == -1) {
            this.f33844d = j10;
        } else {
            this.f33844d = j11 + j10;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f33841a.available();
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f33843c.c();
        if (this.f33846f == -1) {
            this.f33846f = jC;
        }
        try {
            this.f33841a.close();
            long j10 = this.f33844d;
            if (j10 != -1) {
                this.f33842b.q(j10);
            }
            long j11 = this.f33845e;
            if (j11 != -1) {
                this.f33842b.u(j11);
            }
            this.f33842b.t(this.f33846f);
            this.f33842b.b();
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f33841a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f33841a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i10 = this.f33841a.read();
            long jC = this.f33843c.c();
            if (this.f33845e == -1) {
                this.f33845e = jC;
            }
            if (i10 != -1 || this.f33846f != -1) {
                a(1L);
                this.f33842b.q(this.f33844d);
                return i10;
            }
            this.f33846f = jC;
            this.f33842b.t(jC);
            this.f33842b.b();
            return i10;
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f33841a.reset();
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            long jSkip = this.f33841a.skip(j10);
            long jC = this.f33843c.c();
            if (this.f33845e == -1) {
                this.f33845e = jC;
            }
            if (jSkip == 0 && j10 != 0 && this.f33846f == -1) {
                this.f33846f = jC;
                this.f33842b.t(jC);
                return jSkip;
            }
            a(jSkip);
            this.f33842b.q(this.f33844d);
            return jSkip;
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            int i12 = this.f33841a.read(bArr, i10, i11);
            long jC = this.f33843c.c();
            if (this.f33845e == -1) {
                this.f33845e = jC;
            }
            if (i12 == -1 && this.f33846f == -1) {
                this.f33846f = jC;
                this.f33842b.t(jC);
                this.f33842b.b();
                return i12;
            }
            a(i12);
            this.f33842b.q(this.f33844d);
            return i12;
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i10 = this.f33841a.read(bArr);
            long jC = this.f33843c.c();
            if (this.f33845e == -1) {
                this.f33845e = jC;
            }
            if (i10 == -1 && this.f33846f == -1) {
                this.f33846f = jC;
                this.f33842b.t(jC);
                this.f33842b.b();
                return i10;
            }
            a(i10);
            this.f33842b.q(this.f33844d);
            return i10;
        } catch (IOException e10) {
            this.f33842b.t(this.f33843c.c());
            h.d(this.f33842b);
            throw e10;
        }
    }
}
