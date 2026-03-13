package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3535g0 extends AbstractC3541h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f30169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f30170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC3541h0 f30171e;

    public C3535g0(AbstractC3541h0 abstractC3541h0, int i10, int i11) {
        this.f30171e = abstractC3541h0;
        this.f30169c = i10;
        this.f30170d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int d() {
        return this.f30171e.e() + this.f30169c + this.f30170d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int e() {
        return this.f30171e.e() + this.f30169c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3629w.a(i10, this.f30170d, "index");
        return this.f30171e.get(i10 + this.f30169c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final Object[] k() {
        return this.f30171e.k();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0
    /* JADX INFO: renamed from: n */
    public final AbstractC3541h0 subList(int i10, int i11) {
        AbstractC3629w.e(i10, i11, this.f30170d);
        int i12 = this.f30169c;
        return this.f30171e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30170d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
