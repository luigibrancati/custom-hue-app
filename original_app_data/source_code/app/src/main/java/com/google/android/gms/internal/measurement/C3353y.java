package com.google.android.gms.internal.measurement;

import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3353y extends AbstractC3337w {
    public C3353y() {
        this.f29713a.add(M.EQUALS);
        this.f29713a.add(M.GREATER_THAN);
        this.f29713a.add(M.GREATER_THAN_EQUALS);
        this.f29713a.add(M.IDENTITY_EQUALS);
        this.f29713a.add(M.IDENTITY_NOT_EQUALS);
        this.f29713a.add(M.LESS_THAN);
        this.f29713a.add(M.LESS_THAN_EQUALS);
        this.f29713a.add(M.NOT_EQUALS);
    }

    public static boolean c(InterfaceC3277p interfaceC3277p, InterfaceC3277p interfaceC3277p2) {
        if (interfaceC3277p instanceof InterfaceC3241l) {
            interfaceC3277p = new C3312t(interfaceC3277p.b());
        }
        if (interfaceC3277p2 instanceof InterfaceC3241l) {
            interfaceC3277p2 = new C3312t(interfaceC3277p2.b());
        }
        if ((interfaceC3277p instanceof C3312t) && (interfaceC3277p2 instanceof C3312t)) {
            return interfaceC3277p.b().compareTo(interfaceC3277p2.b()) < 0;
        }
        double dDoubleValue = interfaceC3277p.c().doubleValue();
        double dDoubleValue2 = interfaceC3277p2.c().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(InterfaceC3277p interfaceC3277p, InterfaceC3277p interfaceC3277p2) {
        if (interfaceC3277p.getClass().equals(interfaceC3277p2.getClass())) {
            if ((interfaceC3277p instanceof C3321u) || (interfaceC3277p instanceof C3259n)) {
                return true;
            }
            return interfaceC3277p instanceof C3214i ? (Double.isNaN(interfaceC3277p.c().doubleValue()) || Double.isNaN(interfaceC3277p2.c().doubleValue()) || interfaceC3277p.c().doubleValue() != interfaceC3277p2.c().doubleValue()) ? false : true : interfaceC3277p instanceof C3312t ? interfaceC3277p.b().equals(interfaceC3277p2.b()) : interfaceC3277p instanceof C3196g ? interfaceC3277p.d().equals(interfaceC3277p2.d()) : interfaceC3277p == interfaceC3277p2;
        }
        if (((interfaceC3277p instanceof C3321u) || (interfaceC3277p instanceof C3259n)) && ((interfaceC3277p2 instanceof C3321u) || (interfaceC3277p2 instanceof C3259n))) {
            return true;
        }
        boolean z10 = interfaceC3277p instanceof C3214i;
        if (z10 && (interfaceC3277p2 instanceof C3312t)) {
            return d(interfaceC3277p, new C3214i(interfaceC3277p2.c()));
        }
        boolean z11 = interfaceC3277p instanceof C3312t;
        if (z11 && (interfaceC3277p2 instanceof C3214i)) {
            return d(new C3214i(interfaceC3277p.c()), interfaceC3277p2);
        }
        if (interfaceC3277p instanceof C3196g) {
            return d(new C3214i(interfaceC3277p.c()), interfaceC3277p2);
        }
        if (interfaceC3277p2 instanceof C3196g) {
            return d(interfaceC3277p, new C3214i(interfaceC3277p2.c()));
        }
        if ((z11 || z10) && (interfaceC3277p2 instanceof InterfaceC3241l)) {
            return d(interfaceC3277p, new C3312t(interfaceC3277p2.b()));
        }
        if ((interfaceC3277p instanceof InterfaceC3241l) && ((interfaceC3277p2 instanceof C3312t) || (interfaceC3277p2 instanceof C3214i))) {
            return d(new C3312t(interfaceC3277p.b()), interfaceC3277p2);
        }
        return false;
    }

    public static boolean e(InterfaceC3277p interfaceC3277p, InterfaceC3277p interfaceC3277p2) {
        if (interfaceC3277p instanceof InterfaceC3241l) {
            interfaceC3277p = new C3312t(interfaceC3277p.b());
        }
        if (interfaceC3277p2 instanceof InterfaceC3241l) {
            interfaceC3277p2 = new C3312t(interfaceC3277p2.b());
        }
        return (((interfaceC3277p instanceof C3312t) && (interfaceC3277p2 instanceof C3312t)) || !(Double.isNaN(interfaceC3277p.c().doubleValue()) || Double.isNaN(interfaceC3277p2.c().doubleValue()))) && !c(interfaceC3277p2, interfaceC3277p);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3337w
    public final InterfaceC3277p a(String str, T1 t12, List list) {
        boolean zD;
        boolean zD2;
        AbstractC3324u2.a(AbstractC3324u2.e(str).name(), 2, list);
        InterfaceC3277p interfaceC3277pA = t12.a((InterfaceC3277p) list.get(0));
        InterfaceC3277p interfaceC3277pA2 = t12.a((InterfaceC3277p) list.get(1));
        int iOrdinal = AbstractC3324u2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(interfaceC3277pA, interfaceC3277pA2);
            } else if (iOrdinal == 42) {
                zD = c(interfaceC3277pA, interfaceC3277pA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zD = c(interfaceC3277pA2, interfaceC3277pA);
                        break;
                    case 38:
                        zD = e(interfaceC3277pA2, interfaceC3277pA);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        zD = AbstractC3324u2.f(interfaceC3277pA, interfaceC3277pA2);
                        break;
                    case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        zD2 = AbstractC3324u2.f(interfaceC3277pA, interfaceC3277pA2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zD = e(interfaceC3277pA, interfaceC3277pA2);
            }
            zD = !zD2;
        } else {
            zD = d(interfaceC3277pA, interfaceC3277pA2);
        }
        return zD ? InterfaceC3277p.f29572e0 : InterfaceC3277p.f29573f0;
    }
}
