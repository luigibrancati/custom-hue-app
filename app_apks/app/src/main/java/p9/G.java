package p9;

import ec.InterfaceC3978a;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42322a;

    public G(InterfaceC3978a interfaceC3978a) {
        this.f42322a = interfaceC3978a;
    }

    public static G a(InterfaceC3978a interfaceC3978a) {
        return new G(interfaceC3978a);
    }

    public static F c(N n10) {
        return new F(n10);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public F get() {
        return c((N) this.f42322a.get());
    }
}
