package com.google.android.gms.internal.measurement;

import K7.AbstractC1085z;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3151b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1085z f29410d = AbstractC1085z.B("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f29413c;

    public C3151b(String str, long j10, Map map) {
        this.f29411a = str;
        this.f29412b = j10;
        HashMap map2 = new HashMap();
        this.f29413c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f29410d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f29412b;
    }

    public final String b() {
        return this.f29411a;
    }

    public final void c(String str) {
        this.f29411a = str;
    }

    public final void d(String str, Object obj) {
        Map map = this.f29413c;
        if (obj == null) {
            map.remove(str);
        } else {
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f29413c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3151b)) {
            return false;
        }
        C3151b c3151b = (C3151b) obj;
        if (this.f29412b == c3151b.f29412b && this.f29411a.equals(c3151b.f29411a)) {
            return this.f29413c.equals(c3151b.f29413c);
        }
        return false;
    }

    public final Map f() {
        return this.f29413c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C3151b clone() {
        return new C3151b(this.f29411a, this.f29412b, new HashMap(this.f29413c));
    }

    public final int hashCode() {
        int iHashCode = this.f29411a.hashCode() * 31;
        long j10 = this.f29412b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f29413c.hashCode();
    }

    public final String toString() {
        String str = this.f29411a;
        String string = this.f29413c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f29412b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
