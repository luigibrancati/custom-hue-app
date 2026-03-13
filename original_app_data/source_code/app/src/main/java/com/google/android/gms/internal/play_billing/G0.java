package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 extends AbstractC3583o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC3559k0 f30029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractC3541h0 f30030d;

    public G0(AbstractC3559k0 abstractC3559k0, AbstractC3541h0 abstractC3541h0) {
        this.f30029c = abstractC3559k0;
        this.f30030d = abstractC3541h0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int c(Object[] objArr, int i10) {
        return this.f30030d.c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30029c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0, com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final AbstractC3541h0 f() {
        return this.f30030d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f30030d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30029c.size();
    }
}
