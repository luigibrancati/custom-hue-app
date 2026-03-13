package Rd;

import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends Wd.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f15164e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public c1(InterfaceC4992i interfaceC4992i, InterfaceC4988e interfaceC4988e) {
        d1 d1Var = d1.f15169a;
        super(interfaceC4992i.get(d1Var) == null ? interfaceC4992i.plus(d1Var) : interfaceC4992i, interfaceC4988e);
        this.f15164e = new ThreadLocal();
        if (interfaceC4988e.getContext().get(InterfaceC4989f.f40086j0) instanceof I) {
            return;
        }
        Object objI = Wd.L.i(interfaceC4992i, null);
        Wd.L.f(interfaceC4992i, objI);
        W0(interfaceC4992i, objI);
    }

    @Override // Wd.A, Rd.AbstractC2116a
    public void P0(Object obj) {
        V0();
        Object objA = C.a(obj, this.f17895d);
        InterfaceC4988e interfaceC4988e = this.f17895d;
        InterfaceC4992i context = interfaceC4988e.getContext();
        Object objI = Wd.L.i(context, null);
        c1 c1VarM = objI != Wd.L.f17903a ? G.m(interfaceC4988e, context, objI) : null;
        try {
            this.f17895d.resumeWith(objA);
            C4015H c4015h = C4015H.f34254a;
            if (c1VarM == null || c1VarM.U0()) {
                Wd.L.f(context, objI);
            }
        } catch (Throwable th) {
            if (c1VarM == null || c1VarM.U0()) {
                Wd.L.f(context, objI);
            }
            throw th;
        }
    }

    @Override // Wd.A
    public void T0() {
        V0();
    }

    public final boolean U0() {
        boolean z10 = this.threadLocalIsSet && this.f15164e.get() == null;
        this.f15164e.remove();
        return !z10;
    }

    public final void V0() {
        if (this.threadLocalIsSet) {
            C4034q c4034q = (C4034q) this.f15164e.get();
            if (c4034q != null) {
                Wd.L.f((InterfaceC4992i) c4034q.a(), c4034q.b());
            }
            this.f15164e.remove();
        }
    }

    public final void W0(InterfaceC4992i interfaceC4992i, Object obj) {
        this.threadLocalIsSet = true;
        this.f15164e.set(AbstractC4040w.a(interfaceC4992i, obj));
    }
}
