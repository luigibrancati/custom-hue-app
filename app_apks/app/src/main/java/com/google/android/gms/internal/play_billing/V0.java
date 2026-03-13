package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V0 extends R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f30102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f30103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f30104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f30105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f30106e;

    public V0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f30102a = atomicReferenceFieldUpdater;
        this.f30103b = atomicReferenceFieldUpdater2;
        this.f30104c = atomicReferenceFieldUpdater3;
        this.f30105d = atomicReferenceFieldUpdater4;
        this.f30106e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final U0 a(AbstractC3512c1 abstractC3512c1, U0 u02) {
        return (U0) this.f30105d.getAndSet(abstractC3512c1, u02);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final C3506b1 b(AbstractC3512c1 abstractC3512c1, C3506b1 c3506b1) {
        return (C3506b1) this.f30104c.getAndSet(abstractC3512c1, c3506b1);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final void c(C3506b1 c3506b1, C3506b1 c3506b12) {
        this.f30103b.lazySet(c3506b1, c3506b12);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final void d(C3506b1 c3506b1, Thread thread) {
        this.f30102a.lazySet(c3506b1, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean e(AbstractC3512c1 abstractC3512c1, U0 u02, U0 u03) {
        return AbstractC3518d1.a(this.f30105d, abstractC3512c1, u02, u03);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean f(AbstractC3512c1 abstractC3512c1, Object obj, Object obj2) {
        return AbstractC3518d1.a(this.f30106e, abstractC3512c1, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    public final boolean g(AbstractC3512c1 abstractC3512c1, C3506b1 c3506b1, C3506b1 c3506b12) {
        return AbstractC3518d1.a(this.f30104c, abstractC3512c1, c3506b1, c3506b12);
    }
}
