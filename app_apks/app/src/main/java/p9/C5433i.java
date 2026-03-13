package p9;

import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: renamed from: p9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5433i implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42476a;

    public C5433i(InterfaceC3978a interfaceC3978a) {
        this.f42476a = interfaceC3978a;
    }

    public static C5433i a(InterfaceC3978a interfaceC3978a) {
        return new C5433i(interfaceC3978a);
    }

    public static C5431g c(O8.b bVar) {
        return new C5431g(bVar);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5431g get() {
        return c((O8.b) this.f42476a.get());
    }
}
