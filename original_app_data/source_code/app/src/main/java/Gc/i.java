package Gc;

import Cd.E;
import Cd.q0;
import Fc.D;
import Fc.L;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.U;
import Lc.X;
import Lc.j0;
import Lc.k0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5285g;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static final Object a(Object obj, InterfaceC1174b descriptor) {
        E e10;
        Class clsH;
        Method methodF;
        AbstractC4862t.e(descriptor, "descriptor");
        return (((descriptor instanceof U) && AbstractC5285g.d((k0) descriptor)) || (e10 = e(descriptor)) == null || (clsH = h(e10)) == null || (methodF = f(clsH, descriptor)) == null) ? obj : methodF.invoke(obj, null);
    }

    public static final e b(e eVar, InterfaceC1174b descriptor, boolean z10) {
        E returnType;
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(descriptor, "descriptor");
        if (!AbstractC5285g.a(descriptor)) {
            List listI = descriptor.i();
            AbstractC4862t.d(listI, "descriptor.valueParameters");
            if (listI != null && listI.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? eVar : eVar;
            }
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                E type = ((j0) it.next()).getType();
                AbstractC4862t.d(type, "it.type");
                if (AbstractC5285g.c(type)) {
                    break;
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !AbstractC5285g.c(returnType)) && ((eVar instanceof d) || !g(descriptor))) {
            }
        }
        return new h(descriptor, eVar, z10);
    }

    public static /* synthetic */ e c(e eVar, InterfaceC1174b interfaceC1174b, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(eVar, interfaceC1174b, z10);
    }

    public static final Method d(Class cls, InterfaceC1174b descriptor) {
        AbstractC4862t.e(cls, "<this>");
        AbstractC4862t.e(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", f(cls, descriptor).getReturnType());
            AbstractC4862t.d(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new D("No box method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final E e(InterfaceC1174b interfaceC1174b) {
        X xM = interfaceC1174b.M();
        X xJ = interfaceC1174b.J();
        if (xM != null) {
            return xM.getType();
        }
        if (xJ == null) {
            return null;
        }
        if (interfaceC1174b instanceof InterfaceC1184l) {
            return xJ.getType();
        }
        InterfaceC1185m interfaceC1185mB = interfaceC1174b.b();
        InterfaceC1177e interfaceC1177e = interfaceC1185mB instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mB : null;
        if (interfaceC1177e != null) {
            return interfaceC1177e.p();
        }
        return null;
    }

    public static final Method f(Class cls, InterfaceC1174b descriptor) {
        AbstractC4862t.e(cls, "<this>");
        AbstractC4862t.e(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            AbstractC4862t.d(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new D("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final boolean g(InterfaceC1174b interfaceC1174b) {
        E e10 = e(interfaceC1174b);
        return e10 != null && AbstractC5285g.c(e10);
    }

    public static final Class h(E e10) {
        E e11;
        AbstractC4862t.e(e10, "<this>");
        Class clsI = i(e10.N0().q());
        if (clsI == null) {
            return null;
        }
        if (q0.l(e10) && ((e11 = AbstractC5285g.e(e10)) == null || q0.l(e11) || Ic.g.r0(e11))) {
            return null;
        }
        return clsI;
    }

    public static final Class i(InterfaceC1185m interfaceC1185m) {
        if (!(interfaceC1185m instanceof InterfaceC1177e) || !AbstractC5285g.b(interfaceC1185m)) {
            return null;
        }
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) interfaceC1185m;
        Class clsP = L.p(interfaceC1177e);
        if (clsP != null) {
            return clsP;
        }
        throw new D("Class object for the class " + interfaceC1177e.getName() + " cannot be found (classId=" + AbstractC5823c.k((InterfaceC1180h) interfaceC1185m) + ')');
    }
}
