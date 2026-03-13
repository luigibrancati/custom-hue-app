package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3205h implements InterfaceC3277p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3277p f29480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29481b;

    public C3205h() {
        this.f29480a = InterfaceC3277p.f29567U;
        this.f29481b = "return";
    }

    public final InterfaceC3277p a() {
        return this.f29480a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3205h)) {
            return false;
        }
        C3205h c3205h = (C3205h) obj;
        return this.f29481b.equals(c3205h.f29481b) && this.f29480a.equals(c3205h.f29480a);
    }

    public final String f() {
        return this.f29481b;
    }

    public final int hashCode() {
        return (this.f29481b.hashCode() * 31) + this.f29480a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return new C3205h(this.f29481b, this.f29480a.y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C3205h(String str) {
        this.f29480a = InterfaceC3277p.f29567U;
        this.f29481b = str;
    }

    public C3205h(String str, InterfaceC3277p interfaceC3277p) {
        this.f29480a = interfaceC3277p;
        this.f29481b = str;
    }
}
