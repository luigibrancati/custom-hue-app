package Vd;

import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC2313e interfaceC2313e, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, int i11, AbstractC4854k abstractC4854k) {
        this(interfaceC2313e, (i11 & 2) != 0 ? C4993j.f40088a : interfaceC4992i, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? Td.a.SUSPEND : aVar);
    }

    @Override // Vd.e
    public e f(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return new h(this.f17531d, interfaceC4992i, i10, aVar);
    }

    @Override // Vd.g
    public Object m(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        Object objCollect = this.f17531d.collect(interfaceC2314f, interfaceC4988e);
        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
    }

    public h(InterfaceC2313e interfaceC2313e, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        super(interfaceC2313e, interfaceC4992i, i10, aVar);
    }
}
