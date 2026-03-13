package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A4 extends F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f29995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f29996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f29997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f29998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f29999e;

    public A4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f29995a = atomicReferenceFieldUpdater;
        this.f29996b = atomicReferenceFieldUpdater2;
        this.f29997c = atomicReferenceFieldUpdater3;
        this.f29998d = atomicReferenceFieldUpdater4;
        this.f29999e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void a(a5 a5Var, a5 a5Var2) {
        this.f29996b.lazySet(a5Var, a5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final void b(a5 a5Var, Thread thread) {
        this.f29995a.lazySet(a5Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean c(c5 c5Var, C3651z3 c3651z3, C3651z3 c3651z32) {
        return Z3.a(this.f29998d, c5Var, c3651z3, c3651z32);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean d(c5 c5Var, Object obj, Object obj2) {
        return Z3.a(this.f29999e, c5Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    public final boolean e(c5 c5Var, a5 a5Var, a5 a5Var2) {
        return Z3.a(this.f29997c, c5Var, a5Var, a5Var2);
    }
}
