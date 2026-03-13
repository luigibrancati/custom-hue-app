package r8;

import O8.a;
import n9.InterfaceC5150a;
import w8.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O8.a f43835a;

    public k(O8.a aVar) {
        this.f43835a = aVar;
    }

    public static /* synthetic */ void a(C5676e c5676e, O8.b bVar) {
        ((InterfaceC5150a) bVar.get()).a("firebase", c5676e);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final C5676e c5676e = new C5676e(pVar);
            this.f43835a.a(new a.InterfaceC0156a() { // from class: r8.j
                @Override // O8.a.InterfaceC0156a
                public final void a(O8.b bVar) {
                    k.a(c5676e, bVar);
                }
            });
        }
    }
}
