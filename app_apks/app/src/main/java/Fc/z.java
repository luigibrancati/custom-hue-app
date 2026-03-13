package Fc;

import Cd.q0;
import Fc.y;
import Gc.f;
import Lc.InterfaceC1185m;
import Lc.U;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Gc.e b(Fc.y.a r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc.z.b(Fc.y$a, boolean):Gc.e");
    }

    public static final Gc.f c(y.a aVar, boolean z10, Field field) {
        return (g(aVar.i().y()) || !Modifier.isStatic(field.getModifiers())) ? z10 ? aVar.A() ? new f.AbstractC0078f.a(field, f(aVar)) : new f.AbstractC0078f.c(field) : aVar.A() ? new f.g.a(field, e(aVar), f(aVar)) : new f.g.c(field, e(aVar)) : d(aVar) ? z10 ? aVar.A() ? new f.AbstractC0078f.b(field) : new f.AbstractC0078f.d(field) : aVar.A() ? new f.g.b(field, e(aVar)) : new f.g.d(field, e(aVar)) : z10 ? new f.AbstractC0078f.e(field) : new f.g.e(field, e(aVar));
    }

    public static final boolean d(y.a aVar) {
        return aVar.i().y().getAnnotations().K(L.j());
    }

    public static final boolean e(y.a aVar) {
        return !q0.l(aVar.i().y().getType());
    }

    public static final Object f(y.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        return aVar.i().C();
    }

    public static final boolean g(U u10) {
        InterfaceC1185m containingDeclaration = u10.b();
        AbstractC4862t.d(containingDeclaration, "containingDeclaration");
        if (!AbstractC5283e.x(containingDeclaration)) {
            return false;
        }
        InterfaceC1185m interfaceC1185mB = containingDeclaration.b();
        if (AbstractC5283e.C(interfaceC1185mB) || AbstractC5283e.t(interfaceC1185mB)) {
            return (u10 instanceof Ad.j) && C4768i.f(((Ad.j) u10).e0());
        }
        return true;
    }
}
