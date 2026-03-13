package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3223j implements InterfaceC3277p, InterfaceC3241l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f29503b = new HashMap();

    public AbstractC3223j(String str) {
        this.f29502a = str;
    }

    public abstract InterfaceC3277p a(T1 t12, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        return this.f29502a;
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
        return InterfaceC3241l.l(this.f29503b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3223j)) {
            return false;
        }
        AbstractC3223j abstractC3223j = (AbstractC3223j) obj;
        String str = this.f29502a;
        if (str != null) {
            return str.equals(abstractC3223j.f29502a);
        }
        return false;
    }

    public final String g() {
        return this.f29502a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final InterfaceC3277p h(String str) {
        Map map = this.f29503b;
        return map.containsKey(str) ? (InterfaceC3277p) map.get(str) : InterfaceC3277p.f29567U;
    }

    public final int hashCode() {
        String str = this.f29502a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final void k(String str, InterfaceC3277p interfaceC3277p) {
        Map map = this.f29503b;
        if (interfaceC3277p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC3277p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3241l
    public final boolean n(String str) {
        return this.f29503b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        return "toString".equals(str) ? new C3312t(this.f29502a) : InterfaceC3241l.f(this, new C3312t(str), t12, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public InterfaceC3277p y() {
        return this;
    }
}
