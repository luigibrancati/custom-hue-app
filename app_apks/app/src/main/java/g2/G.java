package g2;

import D1.K;
import G1.AbstractC0853a;
import G1.M;
import K1.C1003j;
import K1.C1005k;
import android.os.Handler;
import android.os.SystemClock;
import g2.G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface G {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f35138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f35139b;

        public a(Handler handler, G g10) {
            this.f35138a = g10 != null ? (Handler) AbstractC0853a.e(handler) : null;
            this.f35139b = g10;
        }

        public static /* synthetic */ void d(a aVar, C1003j c1003j) {
            aVar.getClass();
            c1003j.c();
            ((G) M.i(aVar.f35139b)).k(c1003j);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35369a.f35139b)).f(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35123a.f35139b)).e(str);
                    }
                });
            }
        }

        public void m(final C1003j c1003j) {
            c1003j.c();
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        G.a.d(this.f35136a, c1003j);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35125a.f35139b)).m(i10, j10);
                    }
                });
            }
        }

        public void o(final C1003j c1003j) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35131a.f35139b)).q(c1003j);
                    }
                });
            }
        }

        public void p(final D1.o oVar, final C1005k c1005k) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35133a.f35139b)).d(oVar, c1005k);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f35138a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f35138a.post(new Runnable() { // from class: g2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35375a.f35139b)).o(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35128a.f35139b)).s(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35378a.f35139b)).l(exc);
                    }
                });
            }
        }

        public void t(final K k10) {
            Handler handler = this.f35138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: g2.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((G) M.i(this.f35373a.f35139b)).onVideoSizeChanged(k10);
                    }
                });
            }
        }
    }

    void d(D1.o oVar, C1005k c1005k);

    void e(String str);

    void f(String str, long j10, long j11);

    void k(C1003j c1003j);

    void l(Exception exc);

    void m(int i10, long j10);

    void o(Object obj, long j10);

    void onVideoSizeChanged(K k10);

    void q(C1003j c1003j);

    void s(long j10, int i10);
}
