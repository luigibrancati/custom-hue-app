package Wd;

import Rd.InterfaceC2127f0;
import Rd.InterfaceC2138l;
import Rd.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lc.C4993j;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Wd.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2332l extends Rd.I implements W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17931h = AtomicIntegerFieldUpdater.newUpdater(C2332l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f17932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rd.I f17933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2337q f17936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17937g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: Wd.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f17938a;

        public a(Runnable runnable) {
            this.f17938a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f17938a.run();
                } catch (Throwable th) {
                    Rd.K.a(C4993j.f40088a, th);
                }
                Runnable runnableD1 = C2332l.this.d1();
                if (runnableD1 == null) {
                    return;
                }
                try {
                    this.f17938a = runnableD1;
                    i10++;
                    if (i10 >= 16 && AbstractC2330j.d(C2332l.this.f17933c, C2332l.this)) {
                        AbstractC2330j.c(C2332l.this.f17933c, C2332l.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = C2332l.this.f17937g;
                    C2332l c2332l = C2332l.this;
                    synchronized (obj) {
                        C2332l.c1().decrementAndGet(c2332l);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2332l(Rd.I i10, int i11, String str) {
        W w10 = i10 instanceof W ? (W) i10 : null;
        this.f17932b = w10 == null ? Rd.T.a() : w10;
        this.f17933c = i10;
        this.f17934d = i11;
        this.f17935e = str;
        this.f17936f = new C2337q(false);
        this.f17937g = new Object();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater c1() {
        return f17931h;
    }

    @Override // Rd.I
    public Rd.I C0(int i10, String str) {
        AbstractC2333m.a(i10);
        return i10 >= this.f17934d ? AbstractC2333m.b(this, str) : super.C0(i10, str);
    }

    @Override // Rd.W
    public void G(long j10, InterfaceC2138l interfaceC2138l) {
        this.f17932b.G(j10, interfaceC2138l);
    }

    @Override // Rd.W
    public InterfaceC2127f0 H(long j10, Runnable runnable, InterfaceC4992i interfaceC4992i) {
        return this.f17932b.H(j10, runnable, interfaceC4992i);
    }

    public final Runnable d1() {
        while (true) {
            Runnable runnable = (Runnable) this.f17936f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f17937g) {
                f17931h.decrementAndGet(this);
                if (this.f17936f.c() == 0) {
                    return null;
                }
                f17931h.incrementAndGet(this);
            }
        }
    }

    public final boolean e1() {
        synchronized (this.f17937g) {
            if (f17931h.get(this) >= this.f17934d) {
                return false;
            }
            f17931h.incrementAndGet(this);
            return true;
        }
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        Runnable runnableD1;
        this.f17936f.a(runnable);
        if (f17931h.get(this) >= this.f17934d || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        try {
            AbstractC2330j.c(this.f17933c, this, new a(runnableD1));
        } catch (Throwable th) {
            f17931h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // Rd.I
    public void p0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        Runnable runnableD1;
        this.f17936f.a(runnable);
        if (f17931h.get(this) >= this.f17934d || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        try {
            this.f17933c.p0(this, new a(runnableD1));
        } catch (Throwable th) {
            f17931h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // Rd.I
    public String toString() {
        String str = this.f17935e;
        if (str != null) {
            return str;
        }
        return this.f17933c + ".limitedParallelism(" + this.f17934d + ')';
    }
}
