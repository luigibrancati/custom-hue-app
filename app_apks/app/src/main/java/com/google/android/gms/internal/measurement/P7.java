package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P7 extends AbstractC3223j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f29314c;

    public P7(T7 t72) {
        super("internal.registerCallback");
        this.f29314c = t72;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        AbstractC3324u2.a(this.f29502a, 3, list);
        String strB = t12.a((InterfaceC3277p) list.get(0)).b();
        InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(1));
        if (!(interfaceC3277pA instanceof C3268o)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(2));
        if (!(interfaceC3277pA2 instanceof C3250m)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C3250m c3250m = (C3250m) interfaceC3277pA2;
        if (!c3250m.n("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f29314c.a(strB, c3250m.n("priority") ? AbstractC3324u2.g(c3250m.h("priority").c().doubleValue()) : 1000, (C3268o) interfaceC3277pA, c3250m.h("type").b());
        return InterfaceC3277p.f29567U;
    }
}
