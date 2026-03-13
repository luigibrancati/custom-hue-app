package i6;

import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import j6.InterfaceC4725d;
import java.util.concurrent.Executor;
import k6.InterfaceC4806b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f37306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f37307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f37308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f37309d;

    public w(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4) {
        this.f37306a = interfaceC3978a;
        this.f37307b = interfaceC3978a2;
        this.f37308c = interfaceC3978a3;
        this.f37309d = interfaceC3978a4;
    }

    public static w a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4) {
        return new w(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4);
    }

    public static v c(Executor executor, InterfaceC4725d interfaceC4725d, x xVar, InterfaceC4806b interfaceC4806b) {
        return new v(executor, interfaceC4725d, xVar, interfaceC4806b);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f37306a.get(), (InterfaceC4725d) this.f37307b.get(), (x) this.f37308c.get(), (InterfaceC4806b) this.f37309d.get());
    }
}
