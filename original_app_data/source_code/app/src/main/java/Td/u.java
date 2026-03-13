package Td;

import Rd.K;
import Td.y;
import fc.C4015H;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends h implements v {
    public u(InterfaceC4992i interfaceC4992i, g gVar) {
        super(interfaceC4992i, gVar, true, true);
    }

    @Override // Rd.AbstractC2116a
    public void Q0(Throwable th, boolean z10) {
        if (U0().w(th) || z10) {
            return;
        }
        K.a(getContext(), th);
    }

    @Override // Rd.AbstractC2116a
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void R0(C4015H c4015h) {
        y.a.a(U0(), null, 1, null);
    }

    @Override // Rd.AbstractC2116a, Rd.F0, Rd.InterfaceC2166z0
    public boolean c() {
        return super.c();
    }

    @Override // Td.v
    public /* bridge */ /* synthetic */ y j() {
        return T0();
    }
}
