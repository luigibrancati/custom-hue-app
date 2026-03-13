package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3329v extends AbstractC3337w {
    public C3329v() {
        this.f29713a.add(M.BITWISE_AND);
        this.f29713a.add(M.BITWISE_LEFT_SHIFT);
        this.f29713a.add(M.BITWISE_NOT);
        this.f29713a.add(M.BITWISE_OR);
        this.f29713a.add(M.BITWISE_RIGHT_SHIFT);
        this.f29713a.add(M.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f29713a.add(M.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        M m10 = M.ADD;
        switch (AbstractC3324u2.e(str).ordinal()) {
            case 4:
                AbstractC3324u2.a(M.BITWISE_AND.name(), 2, list);
                return new C3214i(Double.valueOf(AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()) & AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue())));
            case 5:
                AbstractC3324u2.a(M.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C3214i(Double.valueOf(AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()) << ((int) (AbstractC3324u2.h(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()) & 31))));
            case 6:
                AbstractC3324u2.a(M.BITWISE_NOT.name(), 1, list);
                return new C3214i(Double.valueOf(~AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue())));
            case 7:
                AbstractC3324u2.a(M.BITWISE_OR.name(), 2, list);
                return new C3214i(Double.valueOf(AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()) | AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue())));
            case 8:
                AbstractC3324u2.a(M.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C3214i(Double.valueOf(AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()) >> ((int) (AbstractC3324u2.h(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()) & 31))));
            case 9:
                AbstractC3324u2.a(M.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C3214i(Double.valueOf(AbstractC3324u2.h(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()) >>> ((int) (AbstractC3324u2.h(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()) & 31))));
            case 10:
                AbstractC3324u2.a(M.BITWISE_XOR.name(), 2, list);
                return new C3214i(Double.valueOf(AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()) ^ AbstractC3324u2.g(t12.a((InterfaceC3277p) list.get(1)).c().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
