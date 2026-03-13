package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3250m implements InterfaceC3277p, InterfaceC3241l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29544a = new HashMap();

    public final List a() {
        return new ArrayList(this.f29544a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return InterfaceC3241l.l(this.f29544a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3250m) {
            return this.f29544a.equals(((C3250m) obj).f29544a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final InterfaceC3277p h(String str) {
        Map map = this.f29544a;
        return map.containsKey(str) ? (InterfaceC3277p) map.get(str) : InterfaceC3277p.f29567U;
    }

    public final int hashCode() {
        return this.f29544a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final void k(String str, InterfaceC3277p interfaceC3277p) {
        Map map = this.f29544a;
        if (interfaceC3277p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC3277p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final boolean n(String str) {
        return this.f29544a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f29544a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        C3250m c3250m = new C3250m();
        for (Map.Entry entry : this.f29544a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC3241l) {
                c3250m.f29544a.put((String) entry.getKey(), (InterfaceC3277p) entry.getValue());
            } else {
                c3250m.f29544a.put((String) entry.getKey(), ((InterfaceC3277p) entry.getValue()).y());
            }
        }
        return c3250m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public InterfaceC3277p z(String str, T1 t12, List list) {
        return "toString".equals(str) ? new C3312t(toString()) : InterfaceC3241l.f(this, new C3312t(str), t12, list);
    }
}
