package Vd;

import Ud.InterfaceC2314f;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements InterfaceC2314f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Td.y f17594a;

    public z(Td.y yVar) {
        this.f17594a = yVar;
    }

    @Override // Ud.InterfaceC2314f
    public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
        Object objP = this.f17594a.p(obj, interfaceC4988e);
        return objP == C5046c.f() ? objP : C4015H.f34254a;
    }
}
