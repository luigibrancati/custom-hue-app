package h6;

import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import i6.x;
import j6.InterfaceC4725d;
import java.util.concurrent.Executor;
import k6.InterfaceC4806b;

/* JADX INFO: renamed from: h6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4279d implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f36271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f36272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f36273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f36274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f36275e;

    public C4279d(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        this.f36271a = interfaceC3978a;
        this.f36272b = interfaceC3978a2;
        this.f36273c = interfaceC3978a3;
        this.f36274d = interfaceC3978a4;
        this.f36275e = interfaceC3978a5;
    }

    public static C4279d a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        return new C4279d(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5);
    }

    public static C4278c c(Executor executor, c6.e eVar, x xVar, InterfaceC4725d interfaceC4725d, InterfaceC4806b interfaceC4806b) {
        return new C4278c(executor, eVar, xVar, interfaceC4725d, interfaceC4806b);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4278c get() {
        return c((Executor) this.f36271a.get(), (c6.e) this.f36272b.get(), (x) this.f36273c.get(), (InterfaceC4725d) this.f36274d.get(), (InterfaceC4806b) this.f36275e.get());
    }
}
