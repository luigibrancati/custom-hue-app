package B6;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f672a = new h();

    public static e d() {
        return f672a;
    }

    @Override // B6.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // B6.e
    public final long b() {
        return System.nanoTime();
    }

    @Override // B6.e
    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
