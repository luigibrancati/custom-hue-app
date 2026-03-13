package qe;

import Fe.C0843e;
import Fe.InterfaceC0845g;
import Fe.J;
import Fe.K;
import Fe.v;
import kotlin.jvm.internal.AbstractC4862t;
import pe.D;
import pe.x;

/* JADX INFO: renamed from: qe.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5519b extends D implements J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f43458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43459c;

    public C5519b(x xVar, long j10) {
        this.f43458b = xVar;
        this.f43459c = j10;
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) {
        AbstractC4862t.e(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // pe.D
    public long a() {
        return this.f43459c;
    }

    @Override // pe.D
    public x b() {
        return this.f43458b;
    }

    @Override // pe.D
    public InterfaceC0845g c() {
        return v.c(this);
    }

    @Override // Fe.J
    public K n() {
        return K.f4081e;
    }

    @Override // pe.D, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
