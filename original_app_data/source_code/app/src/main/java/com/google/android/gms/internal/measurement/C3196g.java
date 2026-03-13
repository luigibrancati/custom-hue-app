package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3196g implements InterfaceC3277p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29470a;

    public C3196g(Boolean bool) {
        this.f29470a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        return Boolean.toString(this.f29470a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        return Double.valueOf(true != this.f29470a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        return Boolean.valueOf(this.f29470a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3196g) && this.f29470a == ((C3196g) obj).f29470a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f29470a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f29470a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return new C3196g(Boolean.valueOf(this.f29470a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C3312t(Boolean.toString(this.f29470a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f29470a), str));
    }
}
