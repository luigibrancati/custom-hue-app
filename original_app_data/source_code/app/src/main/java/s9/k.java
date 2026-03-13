package s9;

import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f44379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f44380b;

    public k(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        this.f44379a = interfaceC3978a;
        this.f44380b = interfaceC3978a2;
    }

    public static k a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2) {
        return new k(interfaceC3978a, interfaceC3978a2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((o) this.f44379a.get(), (o) this.f44380b.get());
    }
}
