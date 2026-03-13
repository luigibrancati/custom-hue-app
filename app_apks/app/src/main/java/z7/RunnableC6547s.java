package z7;

import android.util.Log;

/* JADX INFO: renamed from: z7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6547s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C6529a f48828a;

    public RunnableC6547s(C6529a c6529a) {
        this.f48828a = c6529a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f48828a.f48800a.k();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
