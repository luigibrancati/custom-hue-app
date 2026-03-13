package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S5 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f29330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f29331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V5 f29332c;

    public S5(V5 v52, Comparable comparable, Object obj) {
        Objects.requireNonNull(v52);
        this.f29332c = v52;
        this.f29330a = comparable;
        this.f29331b = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f29330a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f29330a.compareTo(((S5) obj).f29330a);
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
        return b(this.f29330a, entry.getKey()) && b(this.f29331b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f29330a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29331b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f29330a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f29331b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f29332c.h();
        Object obj2 = this.f29331b;
        this.f29331b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f29330a);
        String strValueOf2 = String.valueOf(this.f29331b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
