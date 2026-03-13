package E;

import L.InterfaceC1134y0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class W extends V {
    @Override // E.V
    public androidx.camera.core.d d(InterfaceC1134y0 interfaceC1134y0) {
        return interfaceC1134y0.f();
    }

    @Override // E.V
    public void l(androidx.camera.core.d dVar) {
        O.n.j(e(dVar), new a(dVar), N.a.a());
    }

    @Override // E.V
    public void f() {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f2918a;

        public a(androidx.camera.core.d dVar) {
            this.f2918a = dVar;
        }

        @Override // O.c
        public void a(Throwable th) {
            this.f2918a.close();
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
