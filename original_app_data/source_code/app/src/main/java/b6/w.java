package b6;

import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import h6.InterfaceC4280e;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f25378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f25379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f25380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f25381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f25382e;

    public w(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        this.f25378a = interfaceC3978a;
        this.f25379b = interfaceC3978a2;
        this.f25380c = interfaceC3978a3;
        this.f25381d = interfaceC3978a4;
        this.f25382e = interfaceC3978a5;
    }

    public static w a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        return new w(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5);
    }

    public static u c(InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, InterfaceC4280e interfaceC4280e, i6.r rVar, i6.v vVar) {
        return new u(interfaceC4957a, interfaceC4957a2, interfaceC4280e, rVar, vVar);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((InterfaceC4957a) this.f25378a.get(), (InterfaceC4957a) this.f25379b.get(), (InterfaceC4280e) this.f25380c.get(), (i6.r) this.f25381d.get(), (i6.v) this.f25382e.get());
    }
}
