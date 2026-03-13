package p9;

import ec.InterfaceC3978a;
import h8.C4288f;
import lc.InterfaceC4992i;
import r9.InterfaceC5679b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f42354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f42355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f42356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f42357e;

    public M(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        this.f42353a = interfaceC3978a;
        this.f42354b = interfaceC3978a2;
        this.f42355c = interfaceC3978a3;
        this.f42356d = interfaceC3978a4;
        this.f42357e = interfaceC3978a5;
    }

    public static M a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        return new M(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5);
    }

    public static L c(C4288f c4288f, P8.h hVar, s9.j jVar, InterfaceC5432h interfaceC5432h, InterfaceC4992i interfaceC4992i) {
        return new L(c4288f, hVar, jVar, interfaceC5432h, interfaceC4992i);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public L get() {
        return c((C4288f) this.f42353a.get(), (P8.h) this.f42354b.get(), (s9.j) this.f42355c.get(), (InterfaceC5432h) this.f42356d.get(), (InterfaceC4992i) this.f42357e.get());
    }
}
