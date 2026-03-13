package D;

import E.InterfaceC0815u;
import L.C1092d;
import L.I;
import x.Y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Y f1426a;

    public h(Y y10) {
        this.f1426a = y10;
    }

    public static h a(InterfaceC0815u interfaceC0815u) {
        I implementation = ((I) interfaceC0815u).getImplementation();
        X0.h.b(implementation instanceof Y, "CameraInfo doesn't contain Camera2 implementation.");
        h hVarS = ((Y) implementation).s();
        if (interfaceC0815u instanceof C1092d) {
            ((C1092d) interfaceC0815u).u();
        }
        return hVarS;
    }

    public String b() {
        return this.f1426a.d();
    }
}
