package L;

import L.P0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 implements P0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8022b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8021a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8023c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8024d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f8025e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f8026f = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a b(Throwable th) {
            return new C1108l(th);
        }

        public abstract Throwable a();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f8027h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f8028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final P0.a f8029b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference f8031d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f8030c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f8032e = f8027h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8033f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f8034g = false;

        public b(AtomicReference atomicReference, Executor executor, P0.a aVar) {
            this.f8031d = atomicReference;
            this.f8028a = executor;
            this.f8029b = aVar;
        }

        public void a() {
            this.f8030c.set(false);
        }

        public void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f8030c.get()) {
                        if (i10 <= this.f8033f) {
                            return;
                        }
                        this.f8033f = i10;
                        if (this.f8034g) {
                            return;
                        }
                        this.f8034g = true;
                        try {
                            this.f8028a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f8034g = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f8030c.get()) {
                        this.f8034g = false;
                        return;
                    }
                    Object obj = this.f8031d.get();
                    int i10 = this.f8033f;
                    while (true) {
                        if (!Objects.equals(this.f8032e, obj)) {
                            this.f8032e = obj;
                            if (obj instanceof a) {
                                this.f8029b.onError(((a) obj).a());
                            } else {
                                this.f8029b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f8033f || !this.f8030c.get()) {
                                    break;
                                }
                                obj = this.f8031d.get();
                                i10 = this.f8033f;
                            } finally {
                            }
                        }
                    }
                    this.f8034g = false;
                } finally {
                }
            }
        }
    }

    public d1(Object obj, boolean z10) {
        if (!z10) {
            this.f8022b = new AtomicReference(obj);
        } else {
            X0.h.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f8022b = new AtomicReference(a.b((Throwable) obj));
        }
    }

    @Override // L.P0
    public void a(P0.a aVar) {
        synchronized (this.f8021a) {
            d(aVar);
        }
    }

    @Override // L.P0
    public O7.e b() {
        Object obj = this.f8022b.get();
        return obj instanceof a ? O.n.n(((a) obj).a()) : O.n.p(obj);
    }

    @Override // L.P0
    public void c(Executor executor, P0.a aVar) {
        b bVar;
        synchronized (this.f8021a) {
            d(aVar);
            bVar = new b(this.f8022b, executor, aVar);
            this.f8025e.put(aVar, bVar);
            this.f8026f.add(bVar);
        }
        bVar.b(0);
    }

    public final void d(P0.a aVar) {
        b bVar = (b) this.f8025e.remove(aVar);
        if (bVar != null) {
            bVar.a();
            this.f8026f.remove(bVar);
        }
    }

    public void e(Object obj) {
        f(obj);
    }

    public final void f(Object obj) {
        Iterator it;
        int i10;
        synchronized (this.f8021a) {
            try {
                if (Objects.equals(this.f8022b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f8023c + 1;
                this.f8023c = i11;
                if (this.f8024d) {
                    return;
                }
                this.f8024d = true;
                Iterator it2 = this.f8026f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((b) it2.next()).b(i11);
                    } else {
                        synchronized (this.f8021a) {
                            try {
                                if (this.f8023c == i11) {
                                    this.f8024d = false;
                                    return;
                                } else {
                                    it = this.f8026f.iterator();
                                    i10 = this.f8023c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } finally {
            }
        }
    }
}
