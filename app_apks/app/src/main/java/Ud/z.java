package Ud;

import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends AbstractC2309a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.p f17130a;

    public z(vc.p pVar) {
        this.f17130a = pVar;
    }

    @Override // Ud.AbstractC2309a
    public Object b(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        Object objInvoke = this.f17130a.invoke(interfaceC2314f, interfaceC4988e);
        return objInvoke == C5046c.f() ? objInvoke : C4015H.f34254a;
    }
}
