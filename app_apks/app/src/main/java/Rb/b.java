package Rb;

import Eb.k;
import Eb.p;
import Eb.t;
import Eb.v;
import Jb.e;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15029c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements p, Hb.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0183a f15030i = new C0183a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f15031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f15032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Yb.b f15034d = new Yb.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference f15035e = new AtomicReference();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Hb.c f15036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f15037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f15038h;

        /* JADX INFO: renamed from: Rb.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0183a extends AtomicReference implements t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f15039a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public volatile Object f15040b;

            public C0183a(a aVar) {
                this.f15039a = aVar;
            }

            public void a() {
                Kb.c.a(this);
            }

            @Override // Eb.t
            public void b(Hb.c cVar) {
                Kb.c.u(this, cVar);
            }

            @Override // Eb.t
            public void onError(Throwable th) {
                this.f15039a.f(this, th);
            }

            @Override // Eb.t
            public void onSuccess(Object obj) {
                this.f15040b = obj;
                this.f15039a.e();
            }
        }

        public a(p pVar, e eVar, boolean z10) {
            this.f15031a = pVar;
            this.f15032b = eVar;
            this.f15033c = z10;
        }

        @Override // Eb.p
        public void a() {
            this.f15037g = true;
            e();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15036f, cVar)) {
                this.f15036f = cVar;
                this.f15031a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            C0183a c0183a;
            C0183a c0183a2 = (C0183a) this.f15035e.get();
            if (c0183a2 != null) {
                c0183a2.a();
            }
            try {
                v vVar = (v) Lb.b.e(this.f15032b.apply(obj), "The mapper returned a null SingleSource");
                C0183a c0183a3 = new C0183a(this);
                do {
                    c0183a = (C0183a) this.f15035e.get();
                    if (c0183a == f15030i) {
                        return;
                    }
                } while (!T1.e.a(this.f15035e, c0183a, c0183a3));
                vVar.c(c0183a3);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15036f.dispose();
                this.f15035e.getAndSet(f15030i);
                onError(th);
            }
        }

        public void d() {
            AtomicReference atomicReference = this.f15035e;
            C0183a c0183a = f15030i;
            C0183a c0183a2 = (C0183a) atomicReference.getAndSet(c0183a);
            if (c0183a2 == null || c0183a2 == c0183a) {
                return;
            }
            c0183a2.a();
        }

        @Override // Hb.c
        public void dispose() {
            this.f15038h = true;
            this.f15036f.dispose();
            d();
        }

        public void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            p pVar = this.f15031a;
            Yb.b bVar = this.f15034d;
            AtomicReference atomicReference = this.f15035e;
            int iAddAndGet = 1;
            while (!this.f15038h) {
                if (bVar.get() != null && !this.f15033c) {
                    pVar.onError(bVar.b());
                    return;
                }
                boolean z10 = this.f15037g;
                C0183a c0183a = (C0183a) atomicReference.get();
                boolean z11 = c0183a == null;
                if (z10 && z11) {
                    Throwable thB = bVar.b();
                    if (thB != null) {
                        pVar.onError(thB);
                        return;
                    } else {
                        pVar.a();
                        return;
                    }
                }
                if (z11 || c0183a.f15040b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    T1.e.a(atomicReference, c0183a, null);
                    pVar.c(c0183a.f15040b);
                }
            }
        }

        public void f(C0183a c0183a, Throwable th) {
            if (!T1.e.a(this.f15035e, c0183a, null) || !this.f15034d.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f15033c) {
                this.f15036f.dispose();
                d();
            }
            e();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15038h;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (!this.f15034d.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f15033c) {
                d();
            }
            this.f15037g = true;
            e();
        }
    }

    public b(k kVar, e eVar, boolean z10) {
        this.f15027a = kVar;
        this.f15028b = eVar;
        this.f15029c = z10;
    }

    @Override // Eb.k
    public void v0(p pVar) {
        if (c.a(this.f15027a, this.f15028b, pVar)) {
            return;
        }
        this.f15027a.f(new a(pVar, this.f15028b, this.f15029c));
    }
}
