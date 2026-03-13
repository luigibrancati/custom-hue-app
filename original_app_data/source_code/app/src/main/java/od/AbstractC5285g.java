package od;

import Cd.E;
import Cd.M;
import Lc.C1197z;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.U;
import Lc.V;
import Lc.k0;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: od.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5285g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.c f41540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.b f41541b;

    static {
        kd.c cVar = new kd.c("kotlin.jvm.JvmInline");
        f41540a = cVar;
        kd.b bVarM = kd.b.m(cVar);
        AbstractC4862t.d(bVarM, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f41541b = bVarM;
    }

    public static final boolean a(InterfaceC1173a interfaceC1173a) {
        AbstractC4862t.e(interfaceC1173a, "<this>");
        if (!(interfaceC1173a instanceof V)) {
            return false;
        }
        U correspondingProperty = ((V) interfaceC1173a).T();
        AbstractC4862t.d(correspondingProperty, "correspondingProperty");
        return d(correspondingProperty);
    }

    public static final boolean b(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        return (interfaceC1185m instanceof InterfaceC1177e) && (((InterfaceC1177e) interfaceC1185m).S() instanceof C1197z);
    }

    public static final boolean c(E e10) {
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ != null) {
            return b(interfaceC1180hQ);
        }
        return false;
    }

    public static final boolean d(k0 k0Var) {
        C1197z c1197zN;
        AbstractC4862t.e(k0Var, "<this>");
        if (k0Var.M() != null) {
            return false;
        }
        InterfaceC1185m interfaceC1185mB = k0Var.b();
        kd.f fVarC = null;
        InterfaceC1177e interfaceC1177e = interfaceC1185mB instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mB : null;
        if (interfaceC1177e != null && (c1197zN = AbstractC5823c.n(interfaceC1177e)) != null) {
            fVarC = c1197zN.c();
        }
        return AbstractC4862t.a(fVarC, k0Var.getName());
    }

    public static final E e(E e10) {
        C1197z c1197zN;
        AbstractC4862t.e(e10, "<this>");
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (!(interfaceC1180hQ instanceof InterfaceC1177e)) {
            interfaceC1180hQ = null;
        }
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) interfaceC1180hQ;
        if (interfaceC1177e == null || (c1197zN = AbstractC5823c.n(interfaceC1177e)) == null) {
            return null;
        }
        return (M) c1197zN.d();
    }
}
