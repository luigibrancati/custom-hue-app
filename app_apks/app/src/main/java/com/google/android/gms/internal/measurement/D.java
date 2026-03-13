package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends AbstractC3337w {
    public D() {
        this.f29713a.add(M.AND);
        this.f29713a.add(M.NOT);
        this.f29713a.add(M.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        M m10 = M.ADD;
        int iOrdinal = AbstractC3324u2.e(str).ordinal();
        if (iOrdinal == 1) {
            AbstractC3324u2.a(M.AND.name(), 2, list);
            InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
            return interfaceC3277pA.d().booleanValue() ? t12.a((InterfaceC3277p) list.get(1)) : interfaceC3277pA;
        }
        if (iOrdinal == 47) {
            AbstractC3324u2.a(M.NOT.name(), 1, list);
            return new C3196g(Boolean.valueOf(!t12.a((InterfaceC3277p) list.get(0)).d().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        AbstractC3324u2.a(M.OR.name(), 2, list);
        InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(0));
        return !interfaceC3277pA2.d().booleanValue() ? t12.a((InterfaceC3277p) list.get(1)) : interfaceC3277pA2;
    }
}
