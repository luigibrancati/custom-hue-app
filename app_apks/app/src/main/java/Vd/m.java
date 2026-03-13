package Vd;

import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements InterfaceC4992i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4992i f17578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f17579b;

    public m(Throwable th, InterfaceC4992i interfaceC4992i) {
        this.f17578a = interfaceC4992i;
        this.f17579b = th;
    }

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, vc.p pVar) {
        return this.f17578a.fold(obj, pVar);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        return this.f17578a.get(cVar);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return this.f17578a.minusKey(cVar);
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return this.f17578a.plus(interfaceC4992i);
    }
}
