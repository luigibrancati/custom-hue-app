package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f30003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f30004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F3 f30005c;

    public B3(F3 f32, Comparable comparable, Object obj) {
        this.f30005c = f32;
        this.f30003a = comparable;
        this.f30004b = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f30003a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f30003a.compareTo(((B3) obj).f30003a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f30003a, entry.getKey()) && b(this.f30004b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f30003a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f30004b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f30003a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f30004b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f30005c.o();
        Object obj2 = this.f30004b;
        this.f30004b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f30003a) + "=" + String.valueOf(this.f30004b);
    }
}
