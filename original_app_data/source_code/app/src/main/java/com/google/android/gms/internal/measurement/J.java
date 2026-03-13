package com.google.android.gms.internal.measurement;

import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends AbstractC3337w {
    public J() {
        this.f29713a.add(M.ADD);
        this.f29713a.add(M.DIVIDE);
        this.f29713a.add(M.MODULUS);
        this.f29713a.add(M.MULTIPLY);
        this.f29713a.add(M.NEGATE);
        this.f29713a.add(M.POST_DECREMENT);
        this.f29713a.add(M.POST_INCREMENT);
        this.f29713a.add(M.PRE_DECREMENT);
        this.f29713a.add(M.PRE_INCREMENT);
        this.f29713a.add(M.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        M m10 = M.ADD;
        int iOrdinal = AbstractC3324u2.e(str).ordinal();
        if (iOrdinal == 0) {
            AbstractC3324u2.a(M.ADD.name(), 2, list);
            InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
            InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(1));
            if (!(interfaceC3277pA instanceof InterfaceC3241l) && !(interfaceC3277pA instanceof C3312t) && !(interfaceC3277pA2 instanceof InterfaceC3241l) && !(interfaceC3277pA2 instanceof C3312t)) {
                return new C3214i(Double.valueOf(interfaceC3277pA.c().doubleValue() + interfaceC3277pA2.c().doubleValue()));
            }
            return new C3312t(String.valueOf(interfaceC3277pA.b()).concat(String.valueOf(interfaceC3277pA2.b())));
        }
        if (iOrdinal == 21) {
            AbstractC3324u2.a(M.DIVIDE.name(), 2, list);
            return new C3214i(Double.valueOf(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue() / t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()));
        }
        if (iOrdinal == 59) {
            AbstractC3324u2.a(M.SUBTRACT.name(), 2, list);
            return new C3214i(Double.valueOf(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue() + new C3214i(Double.valueOf(-t12.a((InterfaceC3277p) list.get(1)).c().doubleValue())).c().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            AbstractC3324u2.a(str, 2, list);
            InterfaceC3277p interfaceC3277pA3 = t12.a((InterfaceC3277p) list.get(0));
            t12.a((InterfaceC3277p) list.get(1));
            return interfaceC3277pA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            AbstractC3324u2.a(str, 1, list);
            return t12.a((InterfaceC3277p) list.get(0));
        }
        switch (iOrdinal) {
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                AbstractC3324u2.a(M.MODULUS.name(), 2, list);
                return new C3214i(Double.valueOf(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue() % t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()));
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                AbstractC3324u2.a(M.MULTIPLY.name(), 2, list);
                return new C3214i(Double.valueOf(t12.a((InterfaceC3277p) list.get(0)).c().doubleValue() * t12.a((InterfaceC3277p) list.get(1)).c().doubleValue()));
            case 46:
                AbstractC3324u2.a(M.NEGATE.name(), 1, list);
                return new C3214i(Double.valueOf(-t12.a((InterfaceC3277p) list.get(0)).c().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
