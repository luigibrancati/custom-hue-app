package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W3 extends AbstractC3223j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3160c f29380c;

    public W3(C3160c c3160c) {
        super("internal.eventLogger");
        this.f29380c = c3160c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        AbstractC3324u2.a(this.f29502a, 3, list);
        String strB = t12.a((InterfaceC3277p) list.get(0)).b();
        long jI = (long) AbstractC3324u2.i(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue());
        InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(2));
        this.f29380c.e(strB, jI, interfaceC3277pA instanceof C3250m ? AbstractC3324u2.k((C3250m) interfaceC3277pA) : new HashMap());
        return InterfaceC3277p.f29567U;
    }
}
