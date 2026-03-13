package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M0 extends AbstractC3583o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object f30064c;

    public M0(Object obj) {
        obj.getClass();
        this.f30064c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int c(Object[] objArr, int i10) {
        objArr[0] = this.f30064c;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f30064c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0, com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final AbstractC3541h0 f() {
        return AbstractC3541h0.t(this.f30064c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30064c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C3606s0(this.f30064c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f30064c.toString() + "]";
    }
}
