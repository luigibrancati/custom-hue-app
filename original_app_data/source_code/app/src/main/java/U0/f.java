package U0;

import android.os.OutcomeReceiver;
import fc.AbstractC4036s;
import fc.C4035r;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4988e f16575a;

    public f(InterfaceC4988e interfaceC4988e) {
        super(false);
        this.f16575a = interfaceC4988e;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            InterfaceC4988e interfaceC4988e = this.f16575a;
            C4035r.a aVar = C4035r.f34274b;
            interfaceC4988e.resumeWith(C4035r.b(AbstractC4036s.a(th)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f16575a.resumeWith(C4035r.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
