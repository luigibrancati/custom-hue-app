package R9;

import java.io.Closeable;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f14948a;

    public /* synthetic */ J(n nVar, I i10) {
        this.f14948a = nVar;
        AbstractC6056k.p(((Thread) nVar.f14999d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14948a.f14999d.set(null);
        this.f14948a.d();
    }
}
