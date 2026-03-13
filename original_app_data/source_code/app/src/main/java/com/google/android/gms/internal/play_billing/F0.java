package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F0 extends AbstractC3583o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC3559k0 f30019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f30020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f30021e;

    public F0(AbstractC3559k0 abstractC3559k0, Object[] objArr, int i10, int i11) {
        this.f30019c = abstractC3559k0;
        this.f30020d = objArr;
        this.f30021e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final int c(Object[] objArr, int i10) {
        return f().c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f30019c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3583o0
    public final AbstractC3541h0 n() {
        return new E0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30021e;
    }
}
