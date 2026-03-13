package Rd;

import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements InterfaceC4992i.b, InterfaceC4992i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f15169a = new d1();

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, vc.p pVar) {
        return InterfaceC4992i.b.a.a(this, obj, pVar);
    }

    @Override // lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.b(this, cVar);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return InterfaceC4992i.b.a.c(this, cVar);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return InterfaceC4992i.b.a.d(this, interfaceC4992i);
    }

    @Override // lc.InterfaceC4992i.b
    public InterfaceC4992i.c getKey() {
        return this;
    }
}
