package s9;

import ec.InterfaceC3978a;
import p9.C5426b;
import p9.X;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f44359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f44360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f44361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f44362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f44363e;

    public g(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        this.f44359a = interfaceC3978a;
        this.f44360b = interfaceC3978a2;
        this.f44361c = interfaceC3978a3;
        this.f44362d = interfaceC3978a4;
        this.f44363e = interfaceC3978a5;
    }

    public static g a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        return new g(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5);
    }

    public static d c(X x10, P8.h hVar, C5426b c5426b, InterfaceC5812a interfaceC5812a, l lVar) {
        return new d(x10, hVar, c5426b, interfaceC5812a, lVar);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((X) this.f44359a.get(), (P8.h) this.f44360b.get(), (C5426b) this.f44361c.get(), (InterfaceC5812a) this.f44362d.get(), (l) this.f44363e.get());
    }
}
