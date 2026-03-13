package J3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: J3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0896d implements I3.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5984a = U0.g.a(Looper.getMainLooper());

    @Override // I3.G
    public void a(Runnable runnable) {
        this.f5984a.removeCallbacks(runnable);
    }

    @Override // I3.G
    public void b(long j10, Runnable runnable) {
        this.f5984a.postDelayed(runnable, j10);
    }
}
