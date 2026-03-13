package L;

import E.B0;
import E.C0803n0;
import E.C0821x;
import L.AbstractC1091c0;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class S implements B0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f7938d;

    public S(long j10, int i10, Throwable th) {
        this.f7937c = SystemClock.elapsedRealtime() - j10;
        this.f7936b = i10;
        if (th instanceof AbstractC1091c0.b) {
            this.f7935a = 2;
            this.f7938d = th;
            return;
        }
        if (!(th instanceof C0803n0)) {
            this.f7935a = 0;
            this.f7938d = th;
            return;
        }
        Throwable cause = th.getCause();
        th = cause != null ? cause : th;
        this.f7938d = th;
        if (th instanceof C0821x) {
            this.f7935a = 2;
        } else if (th instanceof IllegalArgumentException) {
            this.f7935a = 1;
        } else {
            this.f7935a = 0;
        }
    }

    @Override // E.B0.b
    public Throwable a() {
        return this.f7938d;
    }

    @Override // E.B0.b
    public long b() {
        return this.f7937c;
    }

    @Override // E.B0.b
    public int getStatus() {
        return this.f7935a;
    }
}
