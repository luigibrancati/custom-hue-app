package e9;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: e9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3970b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f33847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f33848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c9.h f33849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33850d = -1;

    public C3970b(OutputStream outputStream, c9.h hVar, l lVar) {
        this.f33847a = outputStream;
        this.f33849c = hVar;
        this.f33848b = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j10 = this.f33850d;
        if (j10 != -1) {
            this.f33849c.m(j10);
        }
        this.f33849c.r(this.f33848b.c());
        try {
            this.f33847a.close();
        } catch (IOException e10) {
            this.f33849c.t(this.f33848b.c());
            h.d(this.f33849c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f33847a.flush();
        } catch (IOException e10) {
            this.f33849c.t(this.f33848b.c());
            h.d(this.f33849c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        try {
            this.f33847a.write(i10);
            long j10 = this.f33850d + 1;
            this.f33850d = j10;
            this.f33849c.m(j10);
        } catch (IOException e10) {
            this.f33849c.t(this.f33848b.c());
            h.d(this.f33849c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f33847a.write(bArr);
            long length = this.f33850d + ((long) bArr.length);
            this.f33850d = length;
            this.f33849c.m(length);
        } catch (IOException e10) {
            this.f33849c.t(this.f33848b.c());
            h.d(this.f33849c);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f33847a.write(bArr, i10, i11);
            long j10 = this.f33850d + ((long) i11);
            this.f33850d = j10;
            this.f33849c.m(j10);
        } catch (IOException e10) {
            this.f33849c.t(this.f33848b.c());
            h.d(this.f33849c);
            throw e10;
        }
    }
}
