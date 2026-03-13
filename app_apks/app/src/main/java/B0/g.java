package B0;

import Rd.InterfaceC2138l;
import fc.AbstractC4036s;
import fc.C4035r;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O7.e f565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2138l f566b;

    public g(O7.e eVar, InterfaceC2138l interfaceC2138l) {
        this.f565a = eVar;
        this.f566b = interfaceC2138l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f565a.isCancelled()) {
            InterfaceC2138l.a.a(this.f566b, null, 1, null);
            return;
        }
        try {
            InterfaceC2138l interfaceC2138l = this.f566b;
            C4035r.a aVar = C4035r.f34274b;
            interfaceC2138l.resumeWith(C4035r.b(a.z(this.f565a)));
        } catch (ExecutionException e10) {
            InterfaceC2138l interfaceC2138l2 = this.f566b;
            C4035r.a aVar2 = C4035r.f34274b;
            interfaceC2138l2.resumeWith(C4035r.b(AbstractC4036s.a(e.b(e10))));
        }
    }
}
