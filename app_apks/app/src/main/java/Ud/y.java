package Ud;

import Rd.InterfaceC2166z0;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements E, InterfaceC2313e, Vd.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f17128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2166z0 f17129b;

    public y(E e10, InterfaceC2166z0 interfaceC2166z0) {
        this.f17128a = e10;
        this.f17129b = interfaceC2166z0;
    }

    @Override // Vd.q
    public InterfaceC2313e a(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return G.d(this, interfaceC4992i, i10, aVar);
    }

    @Override // Ud.A, Ud.InterfaceC2313e
    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        return this.f17128a.collect(interfaceC2314f, interfaceC4988e);
    }

    @Override // Ud.E
    public Object getValue() {
        return this.f17128a.getValue();
    }
}
