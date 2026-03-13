package N6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: N6.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268c1 extends Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10196e;

    public C1268c1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f10192a = atomicReferenceFieldUpdater;
        this.f10193b = atomicReferenceFieldUpdater2;
        this.f10194c = atomicReferenceFieldUpdater3;
        this.f10195d = atomicReferenceFieldUpdater4;
        this.f10196e = atomicReferenceFieldUpdater5;
    }

    @Override // N6.Y0
    public final C1255b1 a(AbstractC1346i1 abstractC1346i1, C1255b1 c1255b1) {
        return (C1255b1) this.f10195d.getAndSet(abstractC1346i1, c1255b1);
    }

    @Override // N6.Y0
    public final C1333h1 b(AbstractC1346i1 abstractC1346i1, C1333h1 c1333h1) {
        return (C1333h1) this.f10194c.getAndSet(abstractC1346i1, c1333h1);
    }

    @Override // N6.Y0
    public final void c(C1333h1 c1333h1, C1333h1 c1333h12) {
        this.f10193b.lazySet(c1333h1, c1333h12);
    }

    @Override // N6.Y0
    public final void d(C1333h1 c1333h1, Thread thread) {
        this.f10192a.lazySet(c1333h1, thread);
    }

    @Override // N6.Y0
    public final boolean e(AbstractC1346i1 abstractC1346i1, C1255b1 c1255b1, C1255b1 c1255b12) {
        return AbstractC1372k1.a(this.f10195d, abstractC1346i1, c1255b1, c1255b12);
    }

    @Override // N6.Y0
    public final boolean f(AbstractC1346i1 abstractC1346i1, Object obj, Object obj2) {
        return AbstractC1372k1.a(this.f10196e, abstractC1346i1, obj, obj2);
    }

    @Override // N6.Y0
    public final boolean g(AbstractC1346i1 abstractC1346i1, C1333h1 c1333h1, C1333h1 c1333h12) {
        return AbstractC1372k1.a(this.f10194c, abstractC1346i1, c1333h1, c1333h12);
    }
}
