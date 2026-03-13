package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2407i2 f18374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O5 f18375b;

    public J5(O5 o52, InterfaceC2407i2 interfaceC2407i2) {
        this.f18374a = interfaceC2407i2;
        Objects.requireNonNull(o52);
        this.f18375b = o52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        O5 o52 = this.f18375b;
        synchronized (o52) {
            try {
                o52.d(false);
                U5 u52 = o52.f18465c;
                if (!u52.W()) {
                    u52.f18400a.a().v().a("Connected to remote service");
                    u52.z(this.f18374a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        U5 u53 = this.f18375b.f18465c;
        if (u53.P() != null) {
            u53.P().shutdownNow();
            u53.Q(null);
        }
    }
}
