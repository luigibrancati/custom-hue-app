package s9;

import ec.InterfaceC3978a;
import g1.InterfaceC4099i;
import lc.InterfaceC4992i;
import p9.X;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f44395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f44396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f44397c;

    public n(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        this.f44395a = interfaceC3978a;
        this.f44396b = interfaceC3978a2;
        this.f44397c = interfaceC3978a3;
    }

    public static n a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3) {
        return new n(interfaceC3978a, interfaceC3978a2, interfaceC3978a3);
    }

    public static m c(InterfaceC4992i interfaceC4992i, X x10, InterfaceC4099i interfaceC4099i) {
        return new m(interfaceC4992i, x10, interfaceC4099i);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((InterfaceC4992i) this.f44395a.get(), (X) this.f44396b.get(), (InterfaceC4099i) this.f44397c.get());
    }
}
