package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3268o extends AbstractC3223j implements InterfaceC3241l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f29560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f29561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T1 f29562e;

    public C3268o(C3268o c3268o) {
        super(c3268o.f29502a);
        ArrayList arrayList = new ArrayList(c3268o.f29560c.size());
        this.f29560c = arrayList;
        arrayList.addAll(c3268o.f29560c);
        ArrayList arrayList2 = new ArrayList(c3268o.f29561d.size());
        this.f29561d = arrayList2;
        arrayList2.addAll(c3268o.f29561d);
        this.f29562e = c3268o.f29562e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        T1 t1C = this.f29562e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f29560c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                t1C.f((String) list2.get(i10), t12.a((InterfaceC3277p) list.get(i10)));
            } else {
                t1C.f((String) list2.get(i10), InterfaceC3277p.f29567U);
            }
            i10++;
        }
        for (InterfaceC3277p interfaceC3277p : this.f29561d) {
            InterfaceC3277p interfaceC3277pA = t1C.a(interfaceC3277p);
            if (interfaceC3277pA instanceof C3286q) {
                interfaceC3277pA = t1C.a(interfaceC3277p);
            }
            if (interfaceC3277pA instanceof C3205h) {
                return ((C3205h) interfaceC3277pA).a();
            }
        }
        return InterfaceC3277p.f29567U;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j, com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return new C3268o(this);
    }

    public C3268o(String str, List list, List list2, T1 t12) {
        super(str);
        this.f29560c = new ArrayList();
        this.f29562e = t12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f29560c.add(((InterfaceC3277p) it.next()).b());
            }
        }
        this.f29561d = new ArrayList(list2);
    }
}
