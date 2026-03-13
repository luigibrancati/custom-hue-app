package Uc;

import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1196y;
import Lc.n0;
import bd.InterfaceC2907C;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class J {
    public static final Mc.c a(Xc.g c10, InterfaceC2907C wildcardType) {
        Object next;
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(wildcardType, "wildcardType");
        if (wildcardType.w() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new Xc.d(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Mc.c cVar = (Mc.c) next;
            for (kd.c cVar2 : v.f()) {
                if (AbstractC4862t.a(cVar.e(), cVar2)) {
                    break loop0;
                }
            }
        }
        return (Mc.c) next;
    }

    public static final boolean b(InterfaceC1174b memberDescriptor) {
        AbstractC4862t.e(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC1196y) && AbstractC4862t.a(memberDescriptor.y0(Wc.e.f17889H), Boolean.TRUE);
    }

    public static final boolean c(x javaTypeEnhancementState) {
        AbstractC4862t.e(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(v.e()) == G.STRICT;
    }

    public static final AbstractC1192u d(n0 n0Var) {
        AbstractC4862t.e(n0Var, "<this>");
        AbstractC1192u abstractC1192uG = s.g(n0Var);
        AbstractC4862t.d(abstractC1192uG, "toDescriptorVisibility(this)");
        return abstractC1192uG;
    }
}
