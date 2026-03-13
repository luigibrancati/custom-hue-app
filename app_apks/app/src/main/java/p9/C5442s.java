package p9;

import ec.InterfaceC3978a;
import h8.C4288f;
import lc.InterfaceC4992i;
import r9.InterfaceC5679b;

/* JADX INFO: renamed from: p9.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5442s implements InterfaceC5679b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f42487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f42488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f42489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f42490d;

    public C5442s(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4) {
        this.f42487a = interfaceC3978a;
        this.f42488b = interfaceC3978a2;
        this.f42489c = interfaceC3978a3;
        this.f42490d = interfaceC3978a4;
    }

    public static C5442s a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4) {
        return new C5442s(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4);
    }

    public static C5436l c(C4288f c4288f, s9.j jVar, InterfaceC4992i interfaceC4992i, Q q10) {
        return new C5436l(c4288f, jVar, interfaceC4992i, q10);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5436l get() {
        return c((C4288f) this.f42487a.get(), (s9.j) this.f42488b.get(), (InterfaceC4992i) this.f42489c.get(), (Q) this.f42490d.get());
    }
}
