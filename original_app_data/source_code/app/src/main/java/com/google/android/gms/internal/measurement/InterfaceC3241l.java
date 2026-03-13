package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3241l {
    static InterfaceC3277p f(InterfaceC3241l interfaceC3241l, InterfaceC3277p interfaceC3277p, T1 t12, List list) {
        if (interfaceC3241l.n(interfaceC3277p.b())) {
            InterfaceC3277p interfaceC3277pH = interfaceC3241l.h(interfaceC3277p.b());
            if (interfaceC3277pH instanceof AbstractC3223j) {
                return ((AbstractC3223j) interfaceC3277pH).a(t12, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC3277p.b()));
        }
        if (!"hasOwnProperty".equals(interfaceC3277p.b())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC3277p.b()));
        }
        AbstractC3324u2.a("hasOwnProperty", 1, list);
        return interfaceC3241l.n(t12.a((InterfaceC3277p) list.get(0)).b()) ? InterfaceC3277p.f29572e0 : InterfaceC3277p.f29573f0;
    }

    static Iterator l(Map map) {
        return new C3232k(map.keySet().iterator());
    }

    InterfaceC3277p h(String str);

    void k(String str, InterfaceC3277p interfaceC3277p);

    boolean n(String str);
}
