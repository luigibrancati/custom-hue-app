package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f29347a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f29348b = new TreeMap();

    public static final int c(T1 t12, C3268o c3268o, InterfaceC3277p interfaceC3277p) {
        InterfaceC3277p interfaceC3277pA = c3268o.a(t12, Collections.singletonList(interfaceC3277p));
        if (interfaceC3277pA instanceof C3214i) {
            return AbstractC3324u2.g(interfaceC3277pA.c().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, C3268o c3268o, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f29348b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f29347a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c3268o);
    }

    public final void b(T1 t12, C3160c c3160c) {
        C3342w4 c3342w4 = new C3342w4(c3160c);
        TreeMap treeMap = this.f29347a;
        for (Integer num : treeMap.keySet()) {
            C3151b c3151bClone = c3160c.c().clone();
            int iC = c(t12, (C3268o) treeMap.get(num), c3342w4);
            if (iC == 2 || iC == -1) {
                c3160c.d(c3151bClone);
            }
        }
        TreeMap treeMap2 = this.f29348b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(t12, (C3268o) treeMap2.get((Integer) it.next()), c3342w4);
        }
    }
}
