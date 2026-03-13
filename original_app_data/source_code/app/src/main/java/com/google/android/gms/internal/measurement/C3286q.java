package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3286q implements InterfaceC3277p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f29581b;

    public C3286q(String str, List list) {
        this.f29580a = str;
        ArrayList arrayList = new ArrayList();
        this.f29581b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f29580a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3286q)) {
            return false;
        }
        C3286q c3286q = (C3286q) obj;
        String str = this.f29580a;
        if (str == null ? c3286q.f29580a == null : str.equals(c3286q.f29580a)) {
            return this.f29581b.equals(c3286q.f29581b);
        }
        return false;
    }

    public final ArrayList f() {
        return this.f29581b;
    }

    public final int hashCode() {
        String str = this.f29580a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f29581b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return this;
    }
}
