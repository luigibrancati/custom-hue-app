package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3342w4 extends C3250m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3160c f29715b;

    public C3342w4(C3160c c3160c) {
        this.f29715b = c3160c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.C3250m, com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    AbstractC3324u2.a("getEventName", 0, list);
                    return new C3312t(this.f29715b.c().b());
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    AbstractC3324u2.a("getTimestamp", 0, list);
                    return new C3214i(Double.valueOf(this.f29715b.c().a()));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    AbstractC3324u2.a("getParamValue", 1, list);
                    return V2.a(this.f29715b.c().e(t12.a((InterfaceC3277p) list.get(0)).b()));
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    AbstractC3324u2.a("getParams", 0, list);
                    Map mapF = this.f29715b.c().f();
                    C3250m c3250m = new C3250m();
                    for (String str2 : mapF.keySet()) {
                        c3250m.k(str2, V2.a(mapF.get(str2)));
                    }
                    return c3250m;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    AbstractC3324u2.a("setParamValue", 2, list);
                    String strB = t12.a((InterfaceC3277p) list.get(0)).b();
                    InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(1));
                    this.f29715b.c().d(strB, AbstractC3324u2.j(interfaceC3277pA));
                    return interfaceC3277pA;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    AbstractC3324u2.a("setEventName", 1, list);
                    InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(0));
                    if (InterfaceC3277p.f29567U.equals(interfaceC3277pA2) || InterfaceC3277p.f29568a0.equals(interfaceC3277pA2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.f29715b.c().c(interfaceC3277pA2.b());
                    return new C3312t(interfaceC3277pA2.b());
                }
                break;
        }
        return super.z(str, t12, list);
    }
}
