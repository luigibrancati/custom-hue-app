package X6;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC3269o0;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2539z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f19325d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N3 f19326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f19327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f19328c;

    public AbstractC2539z(N3 n32) {
        AbstractC6056k.l(n32);
        this.f19326a = n32;
        this.f19327b = new RunnableC2531y(this, n32);
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            N3 n32 = this.f19326a;
            this.f19328c = n32.e().a();
            if (f().postDelayed(this.f19327b, j10)) {
                return;
            }
            n32.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f19328c != 0;
    }

    public final void d() {
        this.f19328c = 0L;
        f().removeCallbacks(this.f19327b);
    }

    public final /* synthetic */ void e(long j10) {
        this.f19328c = 0L;
    }

    public final Handler f() {
        Handler handler;
        if (f19325d != null) {
            return f19325d;
        }
        synchronized (AbstractC2539z.class) {
            try {
                if (f19325d == null) {
                    f19325d = new HandlerC3269o0(this.f19326a.d().getMainLooper());
                }
                handler = f19325d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
