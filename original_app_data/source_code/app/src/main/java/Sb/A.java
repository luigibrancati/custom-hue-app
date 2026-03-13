package Sb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.e f15433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15435e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Object f15436i = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Jb.e f15439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f15441e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Hb.c f15443g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f15444h = new AtomicBoolean();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map f15442f = new ConcurrentHashMap();

        public a(Eb.p pVar, Jb.e eVar, Jb.e eVar2, int i10, boolean z10) {
            this.f15437a = pVar;
            this.f15438b = eVar;
            this.f15439c = eVar2;
            this.f15440d = i10;
            this.f15441e = z10;
            lazySet(1);
        }

        @Override // Eb.p
        public void a() {
            ArrayList arrayList = new ArrayList(this.f15442f.values());
            this.f15442f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
            this.f15437a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15443g, cVar)) {
                this.f15443g = cVar;
                this.f15437a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            try {
                Object objApply = this.f15438b.apply(obj);
                Object obj2 = objApply != null ? objApply : f15436i;
                b bVarO0 = (b) this.f15442f.get(obj2);
                if (bVarO0 == null) {
                    if (this.f15444h.get()) {
                        return;
                    }
                    bVarO0 = b.O0(objApply, this.f15440d, this, this.f15441e);
                    this.f15442f.put(obj2, bVarO0);
                    getAndIncrement();
                    this.f15437a.c(bVarO0);
                }
                try {
                    bVarO0.c(Lb.b.e(this.f15439c.apply(obj), "The value supplied is null"));
                } catch (Throwable th) {
                    Ib.b.b(th);
                    this.f15443g.dispose();
                    this.onError(th);
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f15443g.dispose();
                onError(th2);
            }
        }

        public void d(Object obj) {
            if (obj == null) {
                obj = f15436i;
            }
            this.f15442f.remove(obj);
            if (decrementAndGet() == 0) {
                this.f15443g.dispose();
            }
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15444h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f15443g.dispose();
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15444h.get();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.f15442f.values());
            this.f15442f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onError(th);
            }
            this.f15437a.onError(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Zb.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f15445b;

        public b(Object obj, c cVar) {
            super(obj);
            this.f15445b = cVar;
        }

        public static b O0(Object obj, int i10, a aVar, boolean z10) {
            return new b(obj, new c(i10, aVar, obj, z10));
        }

        public void a() {
            this.f15445b.c();
        }

        public void c(Object obj) {
            this.f15445b.e(obj);
        }

        public void onError(Throwable th) {
            this.f15445b.d(th);
        }

        @Override // Eb.k
        public void v0(Eb.p pVar) {
            this.f15445b.f(pVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AtomicInteger implements Hb.c, Eb.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f15446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ub.c f15447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f15448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f15450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f15451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f15452g = new AtomicBoolean();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f15453h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference f15454i = new AtomicReference();

        public c(int i10, a aVar, Object obj, boolean z10) {
            this.f15447b = new Ub.c(i10);
            this.f15448c = aVar;
            this.f15446a = obj;
            this.f15449d = z10;
        }

        public boolean a(boolean z10, boolean z11, Eb.p pVar, boolean z12) {
            if (this.f15452g.get()) {
                this.f15447b.clear();
                this.f15448c.d(this.f15446a);
                this.f15454i.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th = this.f15451f;
                this.f15454i.lazySet(null);
                if (th != null) {
                    pVar.onError(th);
                } else {
                    pVar.a();
                }
                return true;
            }
            Throwable th2 = this.f15451f;
            if (th2 != null) {
                this.f15447b.clear();
                this.f15454i.lazySet(null);
                pVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f15454i.lazySet(null);
            pVar.a();
            return true;
        }

        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Ub.c cVar = this.f15447b;
            boolean z10 = this.f15449d;
            Eb.p pVar = (Eb.p) this.f15454i.get();
            int iAddAndGet = 1;
            while (true) {
                if (pVar != null) {
                    while (true) {
                        boolean z11 = this.f15450e;
                        Object objPoll = cVar.poll();
                        boolean z12 = objPoll == null;
                        if (a(z11, z12, pVar, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            pVar.c(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (pVar == null) {
                    pVar = (Eb.p) this.f15454i.get();
                }
            }
        }

        public void c() {
            this.f15450e = true;
            b();
        }

        public void d(Throwable th) {
            this.f15451f = th;
            this.f15450e = true;
            b();
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15452g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f15454i.lazySet(null);
                this.f15448c.d(this.f15446a);
            }
        }

        public void e(Object obj) {
            this.f15447b.offer(obj);
            b();
        }

        @Override // Eb.n
        public void f(Eb.p pVar) {
            if (!this.f15453h.compareAndSet(false, true)) {
                Kb.d.p(new IllegalStateException("Only one Observer allowed!"), pVar);
                return;
            }
            pVar.b(this);
            this.f15454i.lazySet(pVar);
            if (this.f15452g.get()) {
                this.f15454i.lazySet(null);
            } else {
                b();
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15452g.get();
        }
    }

    public A(Eb.n nVar, Jb.e eVar, Jb.e eVar2, int i10, boolean z10) {
        super(nVar);
        this.f15432b = eVar;
        this.f15433c = eVar2;
        this.f15434d = i10;
        this.f15435e = z10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15432b, this.f15433c, this.f15434d, this.f15435e));
    }
}
