package Rd;

import fc.AbstractC4036s;
import fc.C4035r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2142n f15145e;

    public P0(C2142n c2142n) {
        this.f15145e = c2142n;
    }

    @Override // Rd.E0
    public boolean v() {
        return false;
    }

    @Override // Rd.E0
    public void w(Throwable th) {
        Object objH0 = u().h0();
        if (objH0 instanceof A) {
            C2142n c2142n = this.f15145e;
            C4035r.a aVar = C4035r.f34274b;
            c2142n.resumeWith(C4035r.b(AbstractC4036s.a(((A) objH0).f15106a)));
        } else {
            C2142n c2142n2 = this.f15145e;
            C4035r.a aVar2 = C4035r.f34274b;
            c2142n2.resumeWith(C4035r.b(G0.h(objH0)));
        }
    }
}
