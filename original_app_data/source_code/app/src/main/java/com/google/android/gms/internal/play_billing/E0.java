package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E0 extends AbstractC3541h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F0 f30016c;

    public E0(F0 f02) {
        this.f30016c = f02;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC3629w.a(i10, this.f30016c.f30021e, "index");
        int i11 = i10 + i10;
        Object obj = this.f30016c.f30020d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f30016c.f30020d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3511c0
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30016c.f30021e;
    }
}
