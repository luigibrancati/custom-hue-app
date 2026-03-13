package z7;

import android.util.Log;
import java.util.Set;

/* JADX INFO: renamed from: z7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6548t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f48829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C6529a f48830b;

    public RunnableC6548t(C6529a c6529a, Set set) {
        this.f48830b = c6529a;
        this.f48829a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f48830b.h(this.f48829a);
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e10);
        }
    }
}
