package dd;

import Cd.o0;
import Kc.c;
import cd.AbstractC3117s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import td.C5881d;
import td.EnumC5882e;

/* JADX INFO: renamed from: dd.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3895C {
    public static final Object a(InterfaceC3909n interfaceC3909n, Object possiblyPrimitiveType, boolean z10) {
        AbstractC4862t.e(interfaceC3909n, "<this>");
        AbstractC4862t.e(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? interfaceC3909n.c(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final Object b(o0 o0Var, Gd.i type, InterfaceC3909n typeFactory, C3894B mode) {
        List listI;
        AbstractC4862t.e(o0Var, "<this>");
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(typeFactory, "typeFactory");
        AbstractC4862t.e(mode, "mode");
        Gd.n nVarA0 = o0Var.a0(type);
        if (!o0Var.e0(nVarA0)) {
            return null;
        }
        Ic.h hVarB = o0Var.B(nVarA0);
        if (hVarB != null) {
            return a(typeFactory, typeFactory.b(hVarB), o0Var.p0(type) || AbstractC3117s.c(o0Var, type));
        }
        Ic.h hVarT0 = o0Var.t0(nVarA0);
        if (hVarT0 != null) {
            return typeFactory.a('[' + EnumC5882e.b(hVarT0).p());
        }
        if (o0Var.S(nVarA0)) {
            kd.d dVarT = o0Var.t(nVarA0);
            kd.b bVarN = dVarT != null ? Kc.c.f7792a.n(dVarT) : null;
            if (bVarN != null) {
                if (!mode.a() && ((listI = Kc.c.f7792a.i()) == null || !listI.isEmpty())) {
                    Iterator it = listI.iterator();
                    while (it.hasNext()) {
                        if (AbstractC4862t.a(((c.a) it.next()).d(), bVarN)) {
                            return null;
                        }
                    }
                }
                String strF = C5881d.b(bVarN).f();
                AbstractC4862t.d(strF, "byClassId(classId).internalName");
                return typeFactory.e(strF);
            }
        }
        return null;
    }
}
