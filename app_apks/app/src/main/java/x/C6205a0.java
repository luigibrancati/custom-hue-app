package x;

import L.C1095e0;
import L.InterfaceC1099g0;
import w.C6107a;

/* JADX INFO: renamed from: x.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6205a0 implements C1095e0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6205a0 f46865a = new C6205a0();

    @Override // L.C1095e0.b
    public void a(L.s1 s1Var, C1095e0.a aVar) {
        C1095e0 c1095e0V = s1Var.V(null);
        InterfaceC1099g0 interfaceC1099g0E0 = L.R0.e0();
        int iK = C1095e0.b().k();
        if (c1095e0V != null) {
            iK = c1095e0V.k();
            aVar.a(c1095e0V.c());
            interfaceC1099g0E0 = c1095e0V.g();
        }
        aVar.q(interfaceC1099g0E0);
        C6107a c6107a = new C6107a(s1Var);
        aVar.t(c6107a.f0(iK));
        aVar.c(Y0.e(c6107a.i0(Z.c())));
        aVar.e(c6107a.e0());
    }
}
