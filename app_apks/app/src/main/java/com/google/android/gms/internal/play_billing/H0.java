package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H0 extends AbstractC3541h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f30032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f30033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f30034e;

    public H0(Object[] objArr, int i10, int i11) {
        this.f30032c = objArr;
        this.f30033d = i10;
        this.f30034e = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3629w.a(i10, this.f30034e, "index");
        Object obj = this.f30032c[i10 + i10 + this.f30033d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30034e;
    }
}
