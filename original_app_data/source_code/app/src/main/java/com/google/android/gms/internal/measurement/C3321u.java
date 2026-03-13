package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3321u implements InterfaceC3277p {
    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C3321u;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return InterfaceC3277p.f29567U;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
