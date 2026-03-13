package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3529f0 extends AbstractC3541h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC3541h0 f30159c;

    public C3529f0(AbstractC3541h0 abstractC3541h0) {
        this.f30159c = abstractC3541h0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0, com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30159c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3629w.a(i10, this.f30159c.size(), "index");
        return this.f30159c.get(x(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final boolean h() {
        return this.f30159c.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f30159c.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return x(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0
    public final AbstractC3541h0 l() {
        return this.f30159c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f30159c.indexOf(obj);
        if (iIndexOf >= 0) {
            return x(iIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0
    /* JADX INFO: renamed from: n */
    public final AbstractC3541h0 subList(int i10, int i11) {
        AbstractC3629w.e(i10, i11, this.f30159c.size());
        AbstractC3541h0 abstractC3541h0 = this.f30159c;
        return abstractC3541h0.subList(abstractC3541h0.size() - i11, this.f30159c.size() - i10).l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30159c.size();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3541h0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    public final int x(int i10) {
        return (this.f30159c.size() - 1) - i10;
    }
}
