package J1;

import G1.AbstractC0853a;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f5889a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f[] f5893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g[] f5894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f5897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f5898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5901m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5890b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5902n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5891c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f5892d = new ArrayDeque();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.v();
        }
    }

    public h(f[] fVarArr, g[] gVarArr) {
        this.f5893e = fVarArr;
        this.f5895g = fVarArr.length;
        for (int i10 = 0; i10 < this.f5895g; i10++) {
            this.f5893e[i10] = i();
        }
        this.f5894f = gVarArr;
        this.f5896h = gVarArr.length;
        for (int i11 = 0; i11 < this.f5896h; i11++) {
            this.f5894f[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f5889a = aVar;
        aVar.start();
    }

    @Override // J1.d
    public final void d(long j10) {
        synchronized (this.f5890b) {
            try {
                AbstractC0853a.g(this.f5895g == this.f5893e.length || this.f5899k);
                this.f5902n = j10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(f fVar) {
        synchronized (this.f5890b) {
            r();
            AbstractC0853a.a(fVar == this.f5897i);
            this.f5891c.addLast(fVar);
            q();
            this.f5897i = null;
        }
    }

    @Override // J1.d
    public final void flush() {
        synchronized (this.f5890b) {
            try {
                this.f5899k = true;
                this.f5901m = 0;
                f fVar = this.f5897i;
                if (fVar != null) {
                    s(fVar);
                    this.f5897i = null;
                }
                while (!this.f5891c.isEmpty()) {
                    s((f) this.f5891c.removeFirst());
                }
                while (!this.f5892d.isEmpty()) {
                    ((g) this.f5892d.removeFirst()).C();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        return !this.f5891c.isEmpty() && this.f5896h > 0;
    }

    public abstract f i();

    public abstract g j();

    public abstract e k(Throwable th);

    public abstract e l(f fVar, g gVar, boolean z10);

    public final boolean m() {
        e eVarK;
        synchronized (this.f5890b) {
            while (!this.f5900l && !h()) {
                try {
                    this.f5890b.wait();
                } finally {
                }
            }
            if (this.f5900l) {
                return false;
            }
            f fVar = (f) this.f5891c.removeFirst();
            g[] gVarArr = this.f5894f;
            int i10 = this.f5896h - 1;
            this.f5896h = i10;
            g gVar = gVarArr[i10];
            boolean z10 = this.f5899k;
            this.f5899k = false;
            if (fVar.w()) {
                gVar.q(4);
            } else {
                gVar.f5886b = fVar.f5880f;
                if (fVar.x()) {
                    gVar.q(134217728);
                }
                if (!p(fVar.f5880f)) {
                    gVar.f5888d = true;
                }
                try {
                    eVarK = l(fVar, gVar, z10);
                } catch (OutOfMemoryError e10) {
                    eVarK = k(e10);
                } catch (RuntimeException e11) {
                    eVarK = k(e11);
                }
                if (eVarK != null) {
                    synchronized (this.f5890b) {
                        this.f5898j = eVarK;
                    }
                    return false;
                }
            }
            synchronized (this.f5890b) {
                try {
                    if (this.f5899k) {
                        gVar.C();
                    } else if (gVar.f5888d) {
                        this.f5901m++;
                        gVar.C();
                    } else {
                        gVar.f5887c = this.f5901m;
                        this.f5901m = 0;
                        this.f5892d.addLast(gVar);
                    }
                    s(fVar);
                } finally {
                }
            }
            return true;
        }
    }

    @Override // J1.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f e() {
        f fVar;
        synchronized (this.f5890b) {
            r();
            AbstractC0853a.g(this.f5897i == null);
            int i10 = this.f5895g;
            if (i10 == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.f5893e;
                int i11 = i10 - 1;
                this.f5895g = i11;
                fVar = fVarArr[i11];
            }
            this.f5897i = fVar;
        }
        return fVar;
    }

    @Override // J1.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final g a() {
        synchronized (this.f5890b) {
            try {
                r();
                if (this.f5892d.isEmpty()) {
                    return null;
                }
                return (g) this.f5892d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(long j10) {
        boolean z10;
        synchronized (this.f5890b) {
            long j11 = this.f5902n;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    public final void q() {
        if (h()) {
            this.f5890b.notify();
        }
    }

    public final void r() throws e {
        e eVar = this.f5898j;
        if (eVar != null) {
            throw eVar;
        }
    }

    @Override // J1.d
    public void release() {
        synchronized (this.f5890b) {
            this.f5900l = true;
            this.f5890b.notify();
        }
        try {
            this.f5889a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(f fVar) {
        fVar.s();
        f[] fVarArr = this.f5893e;
        int i10 = this.f5895g;
        this.f5895g = i10 + 1;
        fVarArr[i10] = fVar;
    }

    public void t(g gVar) {
        synchronized (this.f5890b) {
            u(gVar);
            q();
        }
    }

    public final void u(g gVar) {
        gVar.s();
        g[] gVarArr = this.f5894f;
        int i10 = this.f5896h;
        this.f5896h = i10 + 1;
        gVarArr[i10] = gVar;
    }

    public final void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    public final void w(int i10) {
        AbstractC0853a.g(this.f5895g == this.f5893e.length);
        for (f fVar : this.f5893e) {
            fVar.D(i10);
        }
    }
}
