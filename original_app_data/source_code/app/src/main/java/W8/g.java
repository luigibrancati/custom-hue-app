package W8;

import P8.h;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import ec.InterfaceC3978a;
import h8.C4288f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Sa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f17864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f17865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f17866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f17867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f17868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3978a f17869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3978a f17870g;

    public g(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5, InterfaceC3978a interfaceC3978a6, InterfaceC3978a interfaceC3978a7) {
        this.f17864a = interfaceC3978a;
        this.f17865b = interfaceC3978a2;
        this.f17866c = interfaceC3978a3;
        this.f17867d = interfaceC3978a4;
        this.f17868e = interfaceC3978a5;
        this.f17869f = interfaceC3978a6;
        this.f17870g = interfaceC3978a7;
    }

    public static g a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5, InterfaceC3978a interfaceC3978a6, InterfaceC3978a interfaceC3978a7) {
        return new g(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5, interfaceC3978a6, interfaceC3978a7);
    }

    public static e c(C4288f c4288f, O8.b bVar, h hVar, O8.b bVar2, RemoteConfigManager remoteConfigManager, Y8.a aVar, SessionManager sessionManager) {
        return new e(c4288f, bVar, hVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((C4288f) this.f17864a.get(), (O8.b) this.f17865b.get(), (h) this.f17866c.get(), (O8.b) this.f17867d.get(), (RemoteConfigManager) this.f17868e.get(), (Y8.a) this.f17869f.get(), (SessionManager) this.f17870g.get());
    }
}
