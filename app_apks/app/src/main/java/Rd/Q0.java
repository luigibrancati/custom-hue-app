package Rd;

import fc.C4015H;
import fc.C4035r;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Q0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4988e f15146e;

    public Q0(InterfaceC4988e interfaceC4988e) {
        this.f15146e = interfaceC4988e;
    }

    @Override // Rd.E0
    public boolean v() {
        return false;
    }

    @Override // Rd.E0
    public void w(Throwable th) {
        InterfaceC4988e interfaceC4988e = this.f15146e;
        C4035r.a aVar = C4035r.f34274b;
        interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
    }
}
