package Rd;

import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import nc.InterfaceC5161e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G {
    public static final InterfaceC4992i d(InterfaceC4992i interfaceC4992i, InterfaceC4992i interfaceC4992i2, final boolean z10) {
        boolean zH = h(interfaceC4992i);
        boolean zH2 = h(interfaceC4992i2);
        if (!zH && !zH2) {
            return interfaceC4992i.plus(interfaceC4992i2);
        }
        final kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f39776a = interfaceC4992i2;
        C4993j c4993j = C4993j.f40088a;
        InterfaceC4992i interfaceC4992i3 = (InterfaceC4992i) interfaceC4992i.fold(c4993j, new vc.p() { // from class: Rd.E
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return G.e(l10, z10, (InterfaceC4992i) obj, (InterfaceC4992i.b) obj2);
            }
        });
        if (zH2) {
            l10.f39776a = ((InterfaceC4992i) l10.f39776a).fold(c4993j, new vc.p() { // from class: Rd.F
                @Override // vc.p
                public final Object invoke(Object obj, Object obj2) {
                    return G.f((InterfaceC4992i) obj, (InterfaceC4992i.b) obj2);
                }
            });
        }
        return interfaceC4992i3.plus((InterfaceC4992i) l10.f39776a);
    }

    public static final InterfaceC4992i e(kotlin.jvm.internal.L l10, boolean z10, InterfaceC4992i interfaceC4992i, InterfaceC4992i.b bVar) {
        return interfaceC4992i.plus(bVar);
    }

    public static final InterfaceC4992i f(InterfaceC4992i interfaceC4992i, InterfaceC4992i.b bVar) {
        return interfaceC4992i.plus(bVar);
    }

    public static final String g(InterfaceC4992i interfaceC4992i) {
        return null;
    }

    public static final boolean h(InterfaceC4992i interfaceC4992i) {
        return ((Boolean) interfaceC4992i.fold(Boolean.FALSE, new vc.p() { // from class: Rd.D
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(G.i(((Boolean) obj).booleanValue(), (InterfaceC4992i.b) obj2));
            }
        })).booleanValue();
    }

    public static final boolean i(boolean z10, InterfaceC4992i.b bVar) {
        return z10;
    }

    public static final InterfaceC4992i j(M m10, InterfaceC4992i interfaceC4992i) {
        InterfaceC4992i interfaceC4992iD = d(m10.getCoroutineContext(), interfaceC4992i, true);
        return (interfaceC4992iD == C2123d0.a() || interfaceC4992iD.get(InterfaceC4989f.f40086j0) != null) ? interfaceC4992iD : interfaceC4992iD.plus(C2123d0.a());
    }

    public static final InterfaceC4992i k(InterfaceC4992i interfaceC4992i, InterfaceC4992i interfaceC4992i2) {
        return !h(interfaceC4992i2) ? interfaceC4992i.plus(interfaceC4992i2) : d(interfaceC4992i, interfaceC4992i2, false);
    }

    public static final c1 l(InterfaceC5161e interfaceC5161e) {
        while (!(interfaceC5161e instanceof Z) && (interfaceC5161e = interfaceC5161e.getCallerFrame()) != null) {
            if (interfaceC5161e instanceof c1) {
                return (c1) interfaceC5161e;
            }
        }
        return null;
    }

    public static final c1 m(InterfaceC4988e interfaceC4988e, InterfaceC4992i interfaceC4992i, Object obj) {
        if (!(interfaceC4988e instanceof InterfaceC5161e) || interfaceC4992i.get(d1.f15169a) == null) {
            return null;
        }
        c1 c1VarL = l((InterfaceC5161e) interfaceC4988e);
        if (c1VarL != null) {
            c1VarL.W0(interfaceC4992i, obj);
        }
        return c1VarL;
    }
}
