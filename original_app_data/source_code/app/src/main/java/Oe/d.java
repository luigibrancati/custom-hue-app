package Oe;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Me.d f12472f = new Me.d() { // from class: Oe.c
        @Override // Me.d
        public final Object apply(Object obj) {
            return b.f12470a;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Me.c f12474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Me.d f12475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12477e;

    public d(int i10, Me.c cVar, Me.d dVar) {
        this.f12473a = i10 < 0 ? 0 : i10;
        this.f12474b = cVar == null ? Me.c.b() : cVar;
        this.f12475c = dVar == null ? f12472f : dVar;
    }

    public void b(int i10) {
        if (this.f12477e || this.f12476d + ((long) i10) <= this.f12473a) {
            return;
        }
        this.f12477e = true;
        f();
    }

    public OutputStream c() {
        return (OutputStream) this.f12475c.apply(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        d().close();
    }

    public OutputStream d() {
        return c();
    }

    public void f() {
        this.f12474b.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        d().flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        b(bArr.length);
        d().write(bArr);
        this.f12476d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        b(i11);
        d().write(bArr, i10, i11);
        this.f12476d += (long) i11;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        b(1);
        d().write(i10);
        this.f12476d++;
    }
}
