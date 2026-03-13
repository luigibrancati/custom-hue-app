package M1;

import G1.AbstractC0853a;
import G1.M;
import K1.C1003j;
import K1.C1005k;
import M1.r;
import M1.s;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f9145b;

        public a(Handler handler, r rVar) {
            this.f9144a = rVar != null ? (Handler) AbstractC0853a.e(handler) : null;
            this.f9145b = rVar;
        }

        public static /* synthetic */ void d(a aVar, C1003j c1003j) {
            aVar.getClass();
            c1003j.c();
            ((r) M.i(aVar.f9145b)).t(c1003j);
        }

        public void n(final Exception exc) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9113a.f9145b)).p(exc);
                    }
                });
            }
        }

        public void o(final int i10) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9142a.f9145b)).onAudioSessionIdChanged(i10);
                    }
                });
            }
        }

        public void p(final Exception exc) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9135a.f9145b)).a(exc);
                    }
                });
            }
        }

        public void q(final s.a aVar) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9133a.f9145b)).b(aVar);
                    }
                });
            }
        }

        public void r(final s.a aVar) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9119a.f9145b)).c(aVar);
                    }
                });
            }
        }

        public void s(final String str, final long j10, final long j11) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9121a.f9145b)).i(str, j10, j11);
                    }
                });
            }
        }

        public void t(final String str) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9125a.f9145b)).h(str);
                    }
                });
            }
        }

        public void u(final C1003j c1003j) {
            c1003j.c();
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.d(this.f9115a, c1003j);
                    }
                });
            }
        }

        public void v(final C1003j c1003j) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9127a.f9145b)).n(c1003j);
                    }
                });
            }
        }

        public void w(final D1.o oVar, final C1005k c1005k) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9137a.f9145b)).g(oVar, c1005k);
                    }
                });
            }
        }

        public void x(final long j10) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9117a.f9145b)).j(j10);
                    }
                });
            }
        }

        public void y(final boolean z10) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9140a.f9145b)).onSkipSilenceEnabledChanged(z10);
                    }
                });
            }
        }

        public void z(final int i10, final long j10, final long j11) {
            Handler handler = this.f9144a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: M1.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((r) M.i(this.f9129a.f9145b)).r(i10, j10, j11);
                    }
                });
            }
        }
    }

    void a(Exception exc);

    void b(s.a aVar);

    void c(s.a aVar);

    void g(D1.o oVar, C1005k c1005k);

    void h(String str);

    void i(String str, long j10, long j11);

    void j(long j10);

    void n(C1003j c1003j);

    void onAudioSessionIdChanged(int i10);

    void onSkipSilenceEnabledChanged(boolean z10);

    void p(Exception exc);

    void r(int i10, long j10, long j11);

    void t(C1003j c1003j);
}
