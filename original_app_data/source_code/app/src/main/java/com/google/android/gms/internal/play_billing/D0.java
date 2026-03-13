package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D0 extends AbstractC3541h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3541h0 f30011e = new D0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f30012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f30013d;

    public D0(Object[] objArr, int i10) {
        this.f30012c = objArr;
        this.f30013d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0, com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f30012c, 0, objArr, 0, this.f30013d);
        return this.f30013d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int d() {
        return this.f30013d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3629w.a(i10, this.f30013d, "index");
        Object obj = this.f30012c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final Object[] k() {
        return this.f30012c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30013d;
    }
}
