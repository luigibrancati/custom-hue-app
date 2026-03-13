package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f29337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3345x f29338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f29339c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f29340d = new HashMap();

    public T1(T1 t12, C3345x c3345x) {
        this.f29337a = t12;
        this.f29338b = c3345x;
    }

    public final InterfaceC3277p a(InterfaceC3277p interfaceC3277p) {
        return this.f29338b.b(this, interfaceC3277p);
    }

    public final InterfaceC3277p b(C3187f c3187f) {
        InterfaceC3277p interfaceC3277pB = InterfaceC3277p.f29567U;
        Iterator itR = c3187f.r();
        while (itR.hasNext()) {
            interfaceC3277pB = this.f29338b.b(this, c3187f.v(((Integer) itR.next()).intValue()));
            if (interfaceC3277pB instanceof C3205h) {
                break;
            }
        }
        return interfaceC3277pB;
    }

    public final T1 c() {
        return new T1(this, this.f29338b);
    }

    public final boolean d(String str) {
        if (this.f29339c.containsKey(str)) {
            return true;
        }
        T1 t12 = this.f29337a;
        if (t12 != null) {
            return t12.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC3277p interfaceC3277p) {
        T1 t12;
        Map map = this.f29339c;
        if (!map.containsKey(str) && (t12 = this.f29337a) != null && t12.d(str)) {
            t12.e(str, interfaceC3277p);
        } else {
            if (this.f29340d.containsKey(str)) {
                return;
            }
            if (interfaceC3277p == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC3277p);
            }
        }
    }

    public final void f(String str, InterfaceC3277p interfaceC3277p) {
        if (this.f29340d.containsKey(str)) {
            return;
        }
        if (interfaceC3277p == null) {
            this.f29339c.remove(str);
        } else {
            this.f29339c.put(str, interfaceC3277p);
        }
    }

    public final void g(String str, InterfaceC3277p interfaceC3277p) {
        f(str, interfaceC3277p);
        this.f29340d.put(str, Boolean.TRUE);
    }

    public final InterfaceC3277p h(String str) {
        Map map = this.f29339c;
        if (map.containsKey(str)) {
            return (InterfaceC3277p) map.get(str);
        }
        T1 t12 = this.f29337a;
        if (t12 != null) {
            return t12.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
