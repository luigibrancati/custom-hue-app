package b7;

import java.util.Objects;

/* JADX INFO: renamed from: b7.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2889w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2890x f25438a;

    public RunnableC2889w(C2890x c2890x) {
        Objects.requireNonNull(c2890x);
        this.f25438a = c2890x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2890x c2890x = this.f25438a;
        synchronized (c2890x.a()) {
            try {
                if (c2890x.c() != null) {
                    c2890x.c().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
