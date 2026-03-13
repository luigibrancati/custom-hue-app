package Sb;

import bc.AbstractC2904a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Q extends Zb.a implements Kb.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f15546e = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f15548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eb.n f15550d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        e call();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AtomicInteger implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f15553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.p f15554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f15556d;

        public c(g gVar, Eb.p pVar) {
            this.f15553a = gVar;
            this.f15554b = pVar;
        }

        public Object a() {
            return this.f15555c;
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15556d) {
                return;
            }
            this.f15556d = true;
            this.f15553a.e(this);
            this.f15555c = null;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15556d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AtomicReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f15557a;

        public d(Object obj) {
            this.f15557a = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface e {
        void complete();

        void e(Object obj);

        void error(Throwable th);

        void n(c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15558a;

        public f(int i10) {
            this.f15558a = i10;
        }

        @Override // Sb.Q.b
        public e call() {
            return new i(this.f15558a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends AtomicReference implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c[] f15559e = new c[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c[] f15560f = new c[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f15561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference f15563c = new AtomicReference(f15559e);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f15564d = new AtomicBoolean();

        public g(e eVar) {
            this.f15561a = eVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15562b) {
                return;
            }
            this.f15562b = true;
            this.f15561a.complete();
            g();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                f();
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15562b) {
                return;
            }
            this.f15561a.e(obj);
            f();
        }

        public boolean d(c cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.f15563c.get();
                if (cVarArr == f15560f) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!T1.e.a(this.f15563c, cVarArr, cVarArr2));
            return true;
        }

        @Override // Hb.c
        public void dispose() {
            this.f15563c.set(f15560f);
            Kb.c.a(this);
        }

        public void e(c cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.f15563c.get();
                int length = cVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (cVarArr[i10].equals(cVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    cVarArr2 = f15559e;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i10);
                    System.arraycopy(cVarArr, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                    cVarArr2 = cVarArr3;
                }
            } while (!T1.e.a(this.f15563c, cVarArr, cVarArr2));
        }

        public void f() {
            for (c cVar : (c[]) this.f15563c.get()) {
                this.f15561a.n(cVar);
            }
        }

        public void g() {
            for (c cVar : (c[]) this.f15563c.getAndSet(f15560f)) {
                this.f15561a.n(cVar);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15563c.get() == f15560f;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15562b) {
                AbstractC2904a.q(th);
                return;
            }
            this.f15562b = true;
            this.f15561a.error(th);
            g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h implements Eb.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f15565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f15566b;

        public h(AtomicReference atomicReference, b bVar) {
            this.f15565a = atomicReference;
            this.f15566b = bVar;
        }

        @Override // Eb.n
        public void f(Eb.p pVar) {
            g gVar;
            while (true) {
                gVar = (g) this.f15565a.get();
                if (gVar != null) {
                    break;
                }
                g gVar2 = new g(this.f15566b.call());
                if (T1.e.a(this.f15565a, null, gVar2)) {
                    gVar = gVar2;
                    break;
                }
            }
            c cVar = new c(gVar, pVar);
            pVar.b(cVar);
            gVar.d(cVar);
            if (cVar.j()) {
                gVar.e(cVar);
            } else {
                gVar.f15561a.n(cVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15567c;

        public i(int i10) {
            this.f15567c = i10;
        }

        @Override // Sb.Q.a
        public void i() {
            if (this.f15552b > this.f15567c) {
                f();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j implements b {
        @Override // Sb.Q.b
        public e call() {
            return new k(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k extends ArrayList implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile int f15568a;

        public k(int i10) {
            super(i10);
        }

        @Override // Sb.Q.e
        public void complete() {
            add(Yb.h.j());
            this.f15568a++;
        }

        @Override // Sb.Q.e
        public void e(Object obj) {
            add(Yb.h.w(obj));
            this.f15568a++;
        }

        @Override // Sb.Q.e
        public void error(Throwable th) {
            add(Yb.h.q(th));
            this.f15568a++;
        }

        @Override // Sb.Q.e
        public void n(c cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            Eb.p pVar = cVar.f15554b;
            int iAddAndGet = 1;
            while (!cVar.j()) {
                int i10 = this.f15568a;
                Integer num = (Integer) cVar.a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (Yb.h.a(get(iIntValue), pVar) || cVar.j()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                cVar.f15555c = Integer.valueOf(iIntValue);
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public Q(Eb.n nVar, Eb.n nVar2, AtomicReference atomicReference, b bVar) {
        this.f15550d = nVar;
        this.f15547a = nVar2;
        this.f15548b = atomicReference;
        this.f15549c = bVar;
    }

    public static Zb.a T0(Eb.n nVar, int i10) {
        return i10 == Integer.MAX_VALUE ? V0(nVar) : U0(nVar, new f(i10));
    }

    public static Zb.a U0(Eb.n nVar, b bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return AbstractC2904a.o(new Q(new h(atomicReference, bVar), nVar, atomicReference, bVar));
    }

    public static Zb.a V0(Eb.n nVar) {
        return U0(nVar, f15546e);
    }

    @Override // Zb.a
    public void Q0(Jb.d dVar) {
        g gVar;
        while (true) {
            gVar = (g) this.f15548b.get();
            if (gVar != null && !gVar.j()) {
                break;
            }
            g gVar2 = new g(this.f15549c.call());
            if (T1.e.a(this.f15548b, gVar, gVar2)) {
                gVar = gVar2;
                break;
            }
        }
        boolean z10 = !gVar.f15564d.get() && gVar.f15564d.compareAndSet(false, true);
        try {
            dVar.accept(gVar);
            if (z10) {
                this.f15547a.f(gVar);
            }
        } catch (Throwable th) {
            if (z10) {
                gVar.f15564d.compareAndSet(true, false);
            }
            Ib.b.b(th);
            throw Yb.f.d(th);
        }
    }

    @Override // Kb.f
    public void d(Hb.c cVar) {
        T1.e.a(this.f15548b, (g) cVar, null);
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15550d.f(pVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends AtomicReference implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f15551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15552b;

        public a() {
            d dVar = new d(null);
            this.f15551a = dVar;
            set(dVar);
        }

        public final void a(d dVar) {
            this.f15551a.set(dVar);
            this.f15551a = dVar;
            this.f15552b++;
        }

        public d c() {
            return (d) get();
        }

        @Override // Sb.Q.e
        public final void complete() {
            a(new d(b(Yb.h.j())));
            j();
        }

        @Override // Sb.Q.e
        public final void e(Object obj) {
            a(new d(b(Yb.h.w(obj))));
            i();
        }

        @Override // Sb.Q.e
        public final void error(Throwable th) {
            a(new d(b(Yb.h.q(th))));
            j();
        }

        public final void f() {
            this.f15552b--;
            g((d) ((d) get()).get());
        }

        public final void g(d dVar) {
            set(dVar);
        }

        public final void h() {
            d dVar = (d) get();
            if (dVar.f15557a != null) {
                d dVar2 = new d(null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        public abstract void i();

        public void j() {
            h();
        }

        @Override // Sb.Q.e
        public final void n(c cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                d dVarC = (d) cVar.a();
                if (dVarC == null) {
                    dVarC = c();
                    cVar.f15555c = dVarC;
                }
                while (!cVar.j()) {
                    d dVar = (d) dVarC.get();
                    if (dVar == null) {
                        cVar.f15555c = dVarC;
                        iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    } else {
                        if (Yb.h.a(d(dVar.f15557a), cVar.f15554b)) {
                            cVar.f15555c = null;
                            return;
                        }
                        dVarC = dVar;
                    }
                }
                cVar.f15555c = null;
                return;
            } while (iAddAndGet != 0);
        }

        public Object b(Object obj) {
            return obj;
        }

        public Object d(Object obj) {
            return obj;
        }
    }
}
