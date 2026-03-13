package I1;

import G1.AbstractC0853a;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5432b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5436f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5434d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5435e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5433c = new byte[1];

    public h(f fVar, j jVar) {
        this.f5431a = fVar;
        this.f5432b = jVar;
    }

    public final void a() {
        if (this.f5434d) {
            return;
        }
        this.f5431a.f(this.f5432b);
        this.f5434d = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5435e) {
            return;
        }
        this.f5431a.close();
        this.f5435e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f5433c) == -1) {
            return -1;
        }
        return this.f5433c[0] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        AbstractC0853a.g(!this.f5435e);
        a();
        int i12 = this.f5431a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f5436f += (long) i12;
        return i12;
    }
}
