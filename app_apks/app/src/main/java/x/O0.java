package x;

import L.InterfaceC1099g0;
import L.a1;
import android.util.Size;
import w.C6107a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O0 implements a1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f46689a = new O0();

    @Override // L.a1.e
    public void a(Size size, L.s1 s1Var, a1.b bVar) {
        L.a1 a1VarP = s1Var.p(null);
        InterfaceC1099g0 interfaceC1099g0E0 = L.R0.e0();
        int iP = L.a1.b().p();
        if (a1VarP != null) {
            iP = a1VarP.p();
            bVar.b(a1VarP.c());
            bVar.d(a1VarP.l());
            bVar.c(a1VarP.j());
            interfaceC1099g0E0 = a1VarP.g();
        }
        bVar.t(interfaceC1099g0E0);
        if (s1Var instanceof L.S0) {
            B.o.b(size, bVar);
        }
        C6107a c6107a = new C6107a(s1Var);
        bVar.y(c6107a.f0(iP));
        bVar.f(c6107a.g0(S0.b()));
        bVar.k(c6107a.j0(R0.b()));
        bVar.e(Y0.e(c6107a.i0(Z.c())));
        bVar.z(s1Var.u());
        bVar.w(s1Var.z());
        L.M0 m0G0 = L.M0.g0();
        m0G0.H(C6107a.f46068W, c6107a.h0(null));
        m0G0.H(C6107a.f46063R, Long.valueOf(c6107a.k0(-1L)));
        bVar.g(m0G0);
        bVar.g(c6107a.e0());
    }
}
