package e2;

import G1.AbstractC0853a;
import G1.I;
import G1.InterfaceC0864l;
import G1.M;
import G1.t;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import f2.InterfaceExecutorC3986a;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f33632d = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f33633e = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f33634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f33635g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceExecutorC3986a f33636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f33637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f33638c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f33640b;

        public boolean c() {
            int i10 = this.f33639a;
            return i10 == 0 || i10 == 1;
        }

        public c(int i10, long j10) {
            this.f33639a = i10;
            this.f33640b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f33642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f33643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b f33644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public IOException f33645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Thread f33647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f33648h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f33649i;

        public d(Looper looper, e eVar, b bVar, int i10, long j10) {
            super(looper);
            this.f33642b = eVar;
            this.f33644d = bVar;
            this.f33641a = i10;
            this.f33643c = j10;
        }

        public void a(boolean z10) {
            this.f33649i = z10;
            this.f33645e = null;
            if (hasMessages(1)) {
                this.f33648h = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f33648h = true;
                        this.f33642b.b();
                        Thread thread = this.f33647g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC0853a.e(this.f33644d)).t(this.f33642b, jElapsedRealtime, jElapsedRealtime - this.f33643c, true);
                this.f33644d = null;
            }
        }

        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) AbstractC0853a.e(this.f33644d)).s(this.f33642b, jElapsedRealtime, jElapsedRealtime - this.f33643c, this.f33646f);
            this.f33645e = null;
            m.this.f33636a.execute((Runnable) AbstractC0853a.e(m.this.f33637b));
        }

        public final void c() {
            m.this.f33637b = null;
        }

        public final long d() {
            return Math.min((this.f33646f - 1) * 1000, 5000);
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f33645e;
            if (iOException != null && this.f33646f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            AbstractC0853a.g(m.this.f33637b == null);
            m.this.f33637b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f33649i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f33643c;
            b bVar = (b) AbstractC0853a.e(this.f33644d);
            if (this.f33648h) {
                bVar.t(this.f33642b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.w(this.f33642b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    t.d("LoadTask", "Unexpected exception handling load completed", e10);
                    m.this.f33638c = new h(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f33645e = iOException;
            int i12 = this.f33646f + 1;
            this.f33646f = i12;
            c cVarO = bVar.o(this.f33642b, jElapsedRealtime, j10, iOException, i12);
            if (cVarO.f33639a == 3) {
                m.this.f33638c = this.f33645e;
            } else if (cVarO.f33639a != 2) {
                if (cVarO.f33639a == 1) {
                    this.f33646f = 1;
                }
                f(cVarO.f33640b != -9223372036854775807L ? cVarO.f33640b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f33648h;
                    this.f33647g = Thread.currentThread();
                }
                if (!z10) {
                    I.a("load:" + this.f33642b.getClass().getSimpleName());
                    try {
                        this.f33642b.load();
                        I.b();
                    } catch (Throwable th) {
                        I.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f33647g = null;
                    Thread.interrupted();
                }
                if (this.f33649i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f33649i) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f33649i) {
                    return;
                }
                t.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new h(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f33649i) {
                    return;
                }
                t.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new h(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f33649i) {
                    t.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void b();

        void load();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        void j();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f33651a;

        public g(f fVar) {
            this.f33651a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33651a.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends IOException {
        public h(Throwable th) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f33634f = new c(2, j10);
        f33635g = new c(3, j10);
    }

    public m(String str) {
        this(InterfaceExecutorC3986a.S(M.N0("ExoPlayer:Loader:" + str), new InterfaceC0864l() { // from class: e2.l
            @Override // G1.InterfaceC0864l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // e2.n
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC0853a.i(this.f33637b)).a(false);
    }

    public void g() {
        this.f33638c = null;
    }

    public boolean i() {
        return this.f33638c != null;
    }

    public boolean j() {
        return this.f33637b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f33638c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f33637b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f33641a;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f33637b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f33636a.execute(new g(fVar));
        }
        this.f33636a.release();
    }

    public long n(e eVar, b bVar, int i10) {
        Looper looper = (Looper) AbstractC0853a.i(Looper.myLooper());
        this.f33638c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    public m(InterfaceExecutorC3986a interfaceExecutorC3986a) {
        this.f33636a = interfaceExecutorC3986a;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        c o(e eVar, long j10, long j11, IOException iOException, int i10);

        void t(e eVar, long j10, long j11, boolean z10);

        void w(e eVar, long j10, long j11);

        default void s(e eVar, long j10, long j11, int i10) {
        }
    }
}
