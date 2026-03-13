package Rd;

import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: renamed from: Rd.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2159w extends F0 implements InterfaceC2157v {
    public C2159w(InterfaceC2166z0 interfaceC2166z0) {
        super(true);
        m0(interfaceC2166z0);
    }

    @Override // Rd.InterfaceC2157v
    public boolean C(Object obj) {
        return s0(obj);
    }

    @Override // Rd.F0
    public boolean c0() {
        return true;
    }

    @Override // Rd.U
    public Object f() {
        return W();
    }

    @Override // Rd.U
    public Object i(InterfaceC4988e interfaceC4988e) throws Throwable {
        Object objI = I(interfaceC4988e);
        C5046c.f();
        return objI;
    }

    @Override // Rd.InterfaceC2157v
    public boolean q(Throwable th) {
        return s0(new A(th, false, 2, null));
    }
}
