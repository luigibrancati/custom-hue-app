package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3402g2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f29855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f29856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3432m2 f29857c;

    public C3402g2(AbstractC3432m2 abstractC3432m2, Comparable comparable, Object obj) {
        this.f29857c = abstractC3432m2;
        this.f29855a = comparable;
        this.f29856b = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f29855a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f29855a.compareTo(((C3402g2) obj).f29855a);
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
        return b(this.f29855a, entry.getKey()) && b(this.f29856b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f29855a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29856b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f29855a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f29856b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f29857c.o();
        Object obj2 = this.f29856b;
        this.f29856b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f29855a) + "=" + String.valueOf(this.f29856b);
    }
}
