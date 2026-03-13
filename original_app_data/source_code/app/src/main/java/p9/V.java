package p9;

import ec.InterfaceC3978a;
import g1.InterfaceC4099i;
import lc.InterfaceC4992i;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f42410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f42411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f42412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f42413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3978a f42414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3978a f42415g;

    public V(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5, InterfaceC3978a interfaceC3978a6, InterfaceC3978a interfaceC3978a7) {
        this.f42409a = interfaceC3978a;
        this.f42410b = interfaceC3978a2;
        this.f42411c = interfaceC3978a3;
        this.f42412d = interfaceC3978a4;
        this.f42413e = interfaceC3978a5;
        this.f42414f = interfaceC3978a6;
        this.f42415g = interfaceC3978a7;
    }

    public static V a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5, InterfaceC3978a interfaceC3978a6, InterfaceC3978a interfaceC3978a7) {
        return new V(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5, interfaceC3978a6, interfaceC3978a7);
    }

    public static U c(s9.j jVar, N n10, K k10, X x10, InterfaceC4099i interfaceC4099i, InterfaceC5446w interfaceC5446w, InterfaceC4992i interfaceC4992i) {
        return new U(jVar, n10, k10, x10, interfaceC4099i, interfaceC5446w, interfaceC4992i);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((s9.j) this.f42409a.get(), (N) this.f42410b.get(), (K) this.f42411c.get(), (X) this.f42412d.get(), (InterfaceC4099i) this.f42413e.get(), (InterfaceC5446w) this.f42414f.get(), (InterfaceC4992i) this.f42415g.get());
    }
}
