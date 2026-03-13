package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q7 extends AbstractC3223j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3341w3 f29320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f29321d;

    public Q7(C3341w3 c3341w3) {
        super("require");
        this.f29321d = new HashMap();
        this.f29320c = c3341w3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3223j
    public final InterfaceC3277p a(T1 t12, List list) {
        InterfaceC3277p interfaceC3277p;
        AbstractC3324u2.a("require", 1, list);
        String strB = t12.a((InterfaceC3277p) list.get(0)).b();
        Map map = this.f29321d;
        if (map.containsKey(strB)) {
            return (InterfaceC3277p) map.get(strB);
        }
        Map map2 = this.f29320c.f29714a;
        if (map2.containsKey(strB)) {
            try {
                interfaceC3277p = (InterfaceC3277p) ((Callable) map2.get(strB)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strB)));
            }
        } else {
            interfaceC3277p = InterfaceC3277p.f29567U;
        }
        if (interfaceC3277p instanceof AbstractC3223j) {
            this.f29321d.put(strB, (AbstractC3223j) interfaceC3277p);
        }
        return interfaceC3277p;
    }
}
