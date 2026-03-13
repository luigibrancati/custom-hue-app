package Pb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends Pb.a {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.g, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f13233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f13235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f13236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Mb.h f13237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f13238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13239h;

        public a(b bVar, long j10) {
            this.f13232a = j10;
            this.f13233b = bVar;
            int i10 = bVar.f13246e;
            this.f13235d = i10;
            this.f13234c = i10 >> 2;
        }

        @Override // Ze.b
        public void a() {
            this.f13236e = true;
            this.f13233b.h();
        }

        public void b(long j10) {
            if (this.f13239h != 1) {
                long j11 = this.f13238g + j10;
                if (j11 < this.f13234c) {
                    this.f13238g = j11;
                } else {
                    this.f13238g = 0L;
                    ((Ze.c) get()).p(j11);
                }
            }
        }

        @Override // Ze.b
        public void c(Object obj) {
            if (this.f13239h != 2) {
                this.f13233b.n(obj, this);
            } else {
                this.f13233b.h();
            }
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            if (Xb.g.u(this, cVar)) {
                if (cVar instanceof Mb.e) {
                    Mb.e eVar = (Mb.e) cVar;
                    int iQ = eVar.q(7);
                    if (iQ == 1) {
                        this.f13239h = iQ;
                        this.f13237f = eVar;
                        this.f13236e = true;
                        this.f13233b.h();
                        return;
                    }
                    if (iQ == 2) {
                        this.f13239h = iQ;
                        this.f13237f = eVar;
                    }
                }
                cVar.p(this.f13235d);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Xb.g.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return get() == Xb.g.CANCELLED;
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            lazySet(Xb.g.CANCELLED);
            this.f13233b.l(this, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicInteger implements Eb.g, Ze.c {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a[] f13240r = new a[0];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a[] f13241s = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ze.b f13242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f13243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f13244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f13245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f13246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Mb.g f13247f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f13248g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Yb.b f13249h = new Yb.b();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f13250i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference f13251j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicLong f13252k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Ze.c f13253l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f13254m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f13255n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f13256o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f13257p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f13258q;

        public b(Ze.b bVar, Jb.e eVar, boolean z10, int i10, int i11) {
            AtomicReference atomicReference = new AtomicReference();
            this.f13251j = atomicReference;
            this.f13252k = new AtomicLong();
            this.f13242a = bVar;
            this.f13243b = eVar;
            this.f13244c = z10;
            this.f13245d = i10;
            this.f13246e = i11;
            this.f13258q = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f13240r);
        }

        @Override // Ze.b
        public void a() {
            if (this.f13248g) {
                return;
            }
            this.f13248g = true;
            h();
        }

        public boolean b(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f13251j.get();
                if (aVarArr == f13241s) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!T1.e.a(this.f13251j, aVarArr, aVarArr2));
            return true;
        }

        @Override // Ze.b
        public void c(Object obj) {
            if (this.f13248g) {
                return;
            }
            try {
                Ze.a aVar = (Ze.a) Lb.b.e(this.f13243b.apply(obj), "The mapper returned a null Publisher");
                if (!(aVar instanceof Callable)) {
                    long j10 = this.f13254m;
                    this.f13254m = 1 + j10;
                    a aVar2 = new a(this, j10);
                    if (b(aVar2)) {
                        aVar.a(aVar2);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) aVar).call();
                    if (objCall != null) {
                        o(objCall);
                        return;
                    }
                    if (this.f13245d == Integer.MAX_VALUE || this.f13250i) {
                        return;
                    }
                    int i10 = this.f13257p + 1;
                    this.f13257p = i10;
                    int i11 = this.f13258q;
                    if (i10 == i11) {
                        this.f13257p = 0;
                        this.f13253l.p(i11);
                    }
                } catch (Throwable th) {
                    Ib.b.b(th);
                    this.f13249h.a(th);
                    h();
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f13253l.cancel();
                onError(th2);
            }
        }

        @Override // Ze.c
        public void cancel() {
            Mb.g gVar;
            if (this.f13250i) {
                return;
            }
            this.f13250i = true;
            this.f13253l.cancel();
            g();
            if (getAndIncrement() != 0 || (gVar = this.f13247f) == null) {
                return;
            }
            gVar.clear();
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            if (Xb.g.w(this.f13253l, cVar)) {
                this.f13253l = cVar;
                this.f13242a.d(this);
                if (this.f13250i) {
                    return;
                }
                int i10 = this.f13245d;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.p(Long.MAX_VALUE);
                } else {
                    cVar.p(i10);
                }
            }
        }

        public boolean e() {
            if (this.f13250i) {
                f();
                return true;
            }
            if (this.f13244c || this.f13249h.get() == null) {
                return false;
            }
            f();
            Throwable thB = this.f13249h.b();
            if (thB != Yb.f.f19877a) {
                this.f13242a.onError(thB);
            }
            return true;
        }

        public void f() {
            Mb.g gVar = this.f13247f;
            if (gVar != null) {
                gVar.clear();
            }
        }

        public void g() {
            a[] aVarArr;
            a[] aVarArr2 = (a[]) this.f13251j.get();
            a[] aVarArr3 = f13241s;
            if (aVarArr2 == aVarArr3 || (aVarArr = (a[]) this.f13251j.getAndSet(aVarArr3)) == aVarArr3) {
                return;
            }
            for (a aVar : aVarArr) {
                aVar.dispose();
            }
            Throwable thB = this.f13249h.b();
            if (thB == null || thB == Yb.f.f19877a) {
                return;
            }
            AbstractC2904a.q(thB);
        }

        public void h() {
            if (getAndIncrement() == 0) {
                i();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:155:0x018d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i() {
            /*
                Method dump skipped, instruction units count: 441
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Pb.e.b.i():void");
        }

        public Mb.h j(a aVar) {
            Mb.h hVar = aVar.f13237f;
            if (hVar != null) {
                return hVar;
            }
            Ub.b bVar = new Ub.b(this.f13246e);
            aVar.f13237f = bVar;
            return bVar;
        }

        public Mb.h k() {
            Mb.g cVar = this.f13247f;
            if (cVar == null) {
                cVar = this.f13245d == Integer.MAX_VALUE ? new Ub.c(this.f13246e) : new Ub.b(this.f13245d);
                this.f13247f = cVar;
            }
            return cVar;
        }

        public void l(a aVar, Throwable th) {
            if (!this.f13249h.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            aVar.f13236e = true;
            if (!this.f13244c) {
                this.f13253l.cancel();
                for (a aVar2 : (a[]) this.f13251j.getAndSet(f13241s)) {
                    aVar2.dispose();
                }
            }
            h();
        }

        public void m(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f13251j.get();
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
                    aVarArr2 = f13240r;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!T1.e.a(this.f13251j, aVarArr, aVarArr2));
        }

        public void n(Object obj, a aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f13252k.get();
                Mb.h hVarJ = aVar.f13237f;
                if (j10 == 0 || !(hVarJ == null || hVarJ.isEmpty())) {
                    if (hVarJ == null) {
                        hVarJ = j(aVar);
                    }
                    if (!hVarJ.offer(obj)) {
                        onError(new Ib.c("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f13242a.c(obj);
                    if (j10 != Long.MAX_VALUE) {
                        this.f13252k.decrementAndGet();
                    }
                    aVar.b(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Mb.h bVar = aVar.f13237f;
                if (bVar == null) {
                    bVar = new Ub.b(this.f13246e);
                    aVar.f13237f = bVar;
                }
                if (!bVar.offer(obj)) {
                    onError(new Ib.c("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            i();
        }

        public void o(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f13252k.get();
                Mb.h hVarK = this.f13247f;
                if (j10 == 0 || !(hVarK == null || hVarK.isEmpty())) {
                    if (hVarK == null) {
                        hVarK = k();
                    }
                    if (!hVarK.offer(obj)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f13242a.c(obj);
                    if (j10 != Long.MAX_VALUE) {
                        this.f13252k.decrementAndGet();
                    }
                    if (this.f13245d != Integer.MAX_VALUE && !this.f13250i) {
                        int i10 = this.f13257p + 1;
                        this.f13257p = i10;
                        int i11 = this.f13258q;
                        if (i10 == i11) {
                            this.f13257p = 0;
                            this.f13253l.p(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!k().offer(obj)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            i();
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            if (this.f13248g) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f13249h.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            this.f13248g = true;
            if (!this.f13244c) {
                for (a aVar : (a[]) this.f13251j.getAndSet(f13241s)) {
                    aVar.dispose();
                }
            }
            h();
        }

        @Override // Ze.c
        public void p(long j10) {
            if (Xb.g.v(j10)) {
                Yb.c.a(this.f13252k, j10);
                h();
            }
        }
    }

    public static Eb.g k(Ze.b bVar, Jb.e eVar, boolean z10, int i10, int i11) {
        return new b(bVar, eVar, z10, i10, i11);
    }
}
