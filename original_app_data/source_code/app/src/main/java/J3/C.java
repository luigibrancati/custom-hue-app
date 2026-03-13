package J3;

import Rd.InterfaceC2138l;
import fc.AbstractC4036s;
import fc.C4035r;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O7.e f5947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2138l f5948b;

    public C(O7.e futureToObserve, InterfaceC2138l continuation) {
        AbstractC4862t.e(futureToObserve, "futureToObserve");
        AbstractC4862t.e(continuation, "continuation");
        this.f5947a = futureToObserve;
        this.f5948b = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5947a.isCancelled()) {
            InterfaceC2138l.a.a(this.f5948b, null, 1, null);
            return;
        }
        try {
            InterfaceC2138l interfaceC2138l = this.f5948b;
            C4035r.a aVar = C4035r.f34274b;
            interfaceC2138l.resumeWith(C4035r.b(o0.e(this.f5947a)));
        } catch (ExecutionException e10) {
            InterfaceC2138l interfaceC2138l2 = this.f5948b;
            C4035r.a aVar2 = C4035r.f34274b;
            interfaceC2138l2.resumeWith(C4035r.b(AbstractC4036s.a(o0.f(e10))));
        }
    }
}
