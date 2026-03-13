package Sb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements Eb.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.p f15658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f15659b;

    public c0(Eb.p pVar, AtomicReference atomicReference) {
        this.f15658a = pVar;
        this.f15659b = atomicReference;
    }

    @Override // Eb.p
    public void a() {
        this.f15658a.a();
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        Kb.c.p(this.f15659b, cVar);
    }

    @Override // Eb.p
    public void c(Object obj) {
        this.f15658a.c(obj);
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        this.f15658a.onError(th);
    }
}
