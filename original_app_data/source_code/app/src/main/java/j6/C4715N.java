package j6;

import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import l6.InterfaceC4957a;

/* JADX INFO: renamed from: j6.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4715N implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f39031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f39032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f39033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f39034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f39035e;

    public C4715N(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        this.f39031a = interfaceC3978a;
        this.f39032b = interfaceC3978a2;
        this.f39033c = interfaceC3978a3;
        this.f39034d = interfaceC3978a4;
        this.f39035e = interfaceC3978a5;
    }

    public static C4715N a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5) {
        return new C4715N(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5);
    }

    public static C4714M c(InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, Object obj, Object obj2, InterfaceC3978a interfaceC3978a) {
        return new C4714M(interfaceC4957a, interfaceC4957a2, (AbstractC4726e) obj, (W) obj2, interfaceC3978a);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4714M get() {
        return c((InterfaceC4957a) this.f39031a.get(), (InterfaceC4957a) this.f39032b.get(), this.f39033c.get(), this.f39034d.get(), this.f39035e);
    }
}
