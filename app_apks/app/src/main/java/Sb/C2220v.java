package Sb;

import bc.AbstractC2904a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Sb.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2220v extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15818e;

    /* JADX INFO: renamed from: Sb.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f15820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f15821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile Mb.h f15822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15823e;

        public a(b bVar, long j10) {
            this.f15819a = j10;
            this.f15820b = bVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15821c = true;
            this.f15820b.g();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar) && (cVar instanceof Mb.c)) {
                Mb.c cVar2 = (Mb.c) cVar;
                int iQ = cVar2.q(7);
                if (iQ == 1) {
                    this.f15823e = iQ;
                    this.f15822d = cVar2;
                    this.f15821c = true;
                    this.f15820b.g();
                    return;
                }
                if (iQ == 2) {
                    this.f15823e = iQ;
                    this.f15822d = cVar2;
                }
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15823e == 0) {
                this.f15820b.l(obj, this);
            } else {
                this.f15820b.g();
            }
        }

        public void d() {
            Kb.c.a(this);
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (!this.f15820b.f15833h.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            b bVar = this.f15820b;
            if (!bVar.f15828c) {
                bVar.f();
            }
            this.f15821c = true;
            this.f15820b.g();
        }
    }

    /* JADX INFO: renamed from: Sb.v$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicInteger implements Hb.c, Eb.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a[] f15824q = new a[0];

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a[] f15825r = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f15830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Mb.g f15831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f15832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Yb.b f15833h = new Yb.b();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f15834i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference f15835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Hb.c f15836k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f15837l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f15838m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15839n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Queue f15840o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f15841p;

        public b(Eb.p pVar, Jb.e eVar, boolean z10, int i10, int i11) {
            this.f15826a = pVar;
            this.f15827b = eVar;
            this.f15828c = z10;
            this.f15829d = i10;
            this.f15830e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f15840o = new ArrayDeque(i10);
            }
            this.f15835j = new AtomicReference(f15824q);
        }

        @Override // Eb.p
        public void a() {
            if (this.f15832g) {
                return;
            }
            this.f15832g = true;
            g();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15836k, cVar)) {
                this.f15836k = cVar;
                this.f15826a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15832g) {
                return;
            }
            try {
                Eb.n nVar = (Eb.n) Lb.b.e(this.f15827b.apply(obj), "The mapper returned a null ObservableSource");
                if (this.f15829d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.f15841p;
                            if (i10 == this.f15829d) {
                                this.f15840o.offer(nVar);
                                return;
                            }
                            this.f15841p = i10 + 1;
                        } finally {
                        }
                    }
                }
                k(nVar);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15836k.dispose();
                onError(th);
            }
        }

        public boolean d(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f15835j.get();
                if (aVarArr == f15825r) {
                    aVar.d();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!T1.e.a(this.f15835j, aVarArr, aVarArr2));
            return true;
        }

        @Override // Hb.c
        public void dispose() {
            Throwable thB;
            if (this.f15834i) {
                return;
            }
            this.f15834i = true;
            if (!f() || (thB = this.f15833h.b()) == null || thB == Yb.f.f19877a) {
                return;
            }
            AbstractC2904a.q(thB);
        }

        public boolean e() {
            if (this.f15834i) {
                return true;
            }
            Throwable th = (Throwable) this.f15833h.get();
            if (this.f15828c || th == null) {
                return false;
            }
            f();
            Throwable thB = this.f15833h.b();
            if (thB != Yb.f.f19877a) {
                this.f15826a.onError(thB);
            }
            return true;
        }

        public boolean f() {
            a[] aVarArr;
            this.f15836k.dispose();
            a[] aVarArr2 = (a[]) this.f15835j.get();
            a[] aVarArr3 = f15825r;
            if (aVarArr2 == aVarArr3 || (aVarArr = (a[]) this.f15835j.getAndSet(aVarArr3)) == aVarArr3) {
                return false;
            }
            for (a aVar : aVarArr) {
                aVar.d();
            }
            return true;
        }

        public void g() {
            if (getAndIncrement() == 0) {
                h();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00f8 A[PHI: r4
          0x00f8: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:71:0x00d7, B:83:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h() {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Sb.C2220v.b.h():void");
        }

        public void i(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f15835j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f15824q;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!T1.e.a(this.f15835j, aVarArr, aVarArr2));
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15834i;
        }

        public void k(Eb.n nVar) {
            boolean z10;
            while (nVar instanceof Callable) {
                if (!m((Callable) nVar) || this.f15829d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        nVar = (Eb.n) this.f15840o.poll();
                        if (nVar == null) {
                            z10 = true;
                            this.f15841p--;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z10) {
                    g();
                    return;
                }
            }
            long j10 = this.f15837l;
            this.f15837l = 1 + j10;
            a aVar = new a(this, j10);
            if (d(aVar)) {
                nVar.f(aVar);
            }
        }

        public void l(Object obj, a aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f15826a.c(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Mb.h cVar = aVar.f15822d;
                if (cVar == null) {
                    cVar = new Ub.c(this.f15830e);
                    aVar.f15822d = cVar;
                }
                cVar.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            h();
        }

        public boolean m(Callable callable) {
            try {
                Object objCall = callable.call();
                if (objCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f15826a.c(objCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    Mb.g cVar = this.f15831f;
                    if (cVar == null) {
                        cVar = this.f15829d == Integer.MAX_VALUE ? new Ub.c(this.f15830e) : new Ub.b(this.f15829d);
                        this.f15831f = cVar;
                    }
                    if (!cVar.offer(objCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                h();
                return true;
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15833h.a(th);
                g();
                return true;
            }
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15832g) {
                AbstractC2904a.q(th);
            } else if (!this.f15833h.a(th)) {
                AbstractC2904a.q(th);
            } else {
                this.f15832g = true;
                g();
            }
        }
    }

    public C2220v(Eb.n nVar, Jb.e eVar, boolean z10, int i10, int i11) {
        super(nVar);
        this.f15815b = eVar;
        this.f15816c = z10;
        this.f15817d = i10;
        this.f15818e = i11;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        if (T.b(this.f15624a, pVar, this.f15815b)) {
            return;
        }
        this.f15624a.f(new b(pVar, this.f15815b, this.f15816c, this.f15817d, this.f15818e));
    }
}
