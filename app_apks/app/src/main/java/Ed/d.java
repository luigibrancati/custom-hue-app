package Ed;

import Lc.F;
import Lc.G;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.P;
import gc.C4206t;
import gc.U;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3395a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.f f3396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f3397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f3398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f3399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ic.g f3400f;

    static {
        kd.f fVarW = kd.f.w(b.ERROR_MODULE.b());
        AbstractC4862t.d(fVarW, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f3396b = fVarW;
        f3397c = C4206t.k();
        f3398d = C4206t.k();
        f3399e = U.d();
        f3400f = Ic.e.f5685h.a();
    }

    @Override // Lc.G
    public Object Y(F capability) {
        AbstractC4862t.e(capability, "capability");
        return null;
    }

    @Override // Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        return null;
    }

    public kd.f g0() {
        return f3396b;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        return Mc.g.f9435K.b();
    }

    @Override // Lc.I
    public kd.f getName() {
        return g0();
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o visitor, Object obj) {
        AbstractC4862t.e(visitor, "visitor");
        return null;
    }

    @Override // Lc.G
    public Ic.g n() {
        return f3400f;
    }

    @Override // Lc.G
    public Collection t(kd.c fqName, vc.l nameFilter) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return C4206t.k();
    }

    @Override // Lc.G
    public List w0() {
        return f3398d;
    }

    @Override // Lc.G
    public boolean y(G targetModule) {
        AbstractC4862t.e(targetModule, "targetModule");
        return false;
    }

    @Override // Lc.G
    public P z0(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // Lc.InterfaceC1185m
    public InterfaceC1185m a() {
        return this;
    }
}
