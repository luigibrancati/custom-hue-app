package p9;

import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f42361b;

    public O(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        this.f42360a = interfaceC3978a;
        this.f42361b = interfaceC3978a2;
    }

    public static O a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        return new O(interfaceC3978a, interfaceC3978a2);
    }

    public static N c(X x10, Z z10) {
        return new N(x10, z10);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public N get() {
        return c((X) this.f42360a.get(), (Z) this.f42361b.get());
    }
}
