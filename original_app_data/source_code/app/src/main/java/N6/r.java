package N6;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f10434a;

    static {
        B c1448q;
        try {
            SystemClock.elapsedRealtimeNanos();
            c1448q = new C1435p();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c1448q = new C1448q();
        }
        f10434a = c1448q;
    }

    public static B a() {
        return f10434a;
    }
}
