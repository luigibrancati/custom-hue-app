package dc;

import Eb.p;
import Yb.a;
import Yb.f;
import Yb.h;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: dc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3890a extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f33314h = new Object[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0406a[] f33315i = new C0406a[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0406a[] f33316j = new C0406a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f33317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f33318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReadWriteLock f33319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f33320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f33321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f33322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33323g;

    /* JADX INFO: renamed from: dc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0406a implements Hb.c, a.InterfaceC0251a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f33324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3890a f33325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f33326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f33327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Yb.a f33328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f33329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f33330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f33331h;

        public C0406a(p pVar, C3890a c3890a) {
            this.f33324a = pVar;
            this.f33325b = c3890a;
        }

        public void a() {
            if (this.f33330g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f33330g) {
                        return;
                    }
                    if (this.f33326c) {
                        return;
                    }
                    C3890a c3890a = this.f33325b;
                    Lock lock = c3890a.f33320d;
                    lock.lock();
                    this.f33331h = c3890a.f33323g;
                    Object obj = c3890a.f33317a.get();
                    lock.unlock();
                    this.f33327d = obj != null;
                    this.f33326c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            Yb.a aVar;
            while (!this.f33330g) {
                synchronized (this) {
                    try {
                        aVar = this.f33328e;
                        if (aVar == null) {
                            this.f33327d = false;
                            return;
                        }
                        this.f33328e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar.c(this);
            }
        }

        public void c(Object obj, long j10) {
            if (this.f33330g) {
                return;
            }
            if (!this.f33329f) {
                synchronized (this) {
                    try {
                        if (this.f33330g) {
                            return;
                        }
                        if (this.f33331h == j10) {
                            return;
                        }
                        if (this.f33327d) {
                            Yb.a aVar = this.f33328e;
                            if (aVar == null) {
                                aVar = new Yb.a(4);
                                this.f33328e = aVar;
                            }
                            aVar.b(obj);
                            return;
                        }
                        this.f33326c = true;
                        this.f33329f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f33330g) {
                return;
            }
            this.f33330g = true;
            this.f33325b.T0(this);
        }

        @Override // Hb.c
        public boolean j() {
            return this.f33330g;
        }

        @Override // Yb.a.InterfaceC0251a, Jb.g
        public boolean test(Object obj) {
            return this.f33330g || h.a(obj, this.f33324a);
        }
    }

    public C3890a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f33319c = reentrantReadWriteLock;
        this.f33320d = reentrantReadWriteLock.readLock();
        this.f33321e = reentrantReadWriteLock.writeLock();
        this.f33318b = new AtomicReference(f33315i);
        this.f33317a = new AtomicReference();
        this.f33322f = new AtomicReference();
    }

    public static C3890a Q0() {
        return new C3890a();
    }

    public static C3890a R0(Object obj) {
        return new C3890a(obj);
    }

    public boolean P0(C0406a c0406a) {
        C0406a[] c0406aArr;
        C0406a[] c0406aArr2;
        do {
            c0406aArr = (C0406a[]) this.f33318b.get();
            if (c0406aArr == f33316j) {
                return false;
            }
            int length = c0406aArr.length;
            c0406aArr2 = new C0406a[length + 1];
            System.arraycopy(c0406aArr, 0, c0406aArr2, 0, length);
            c0406aArr2[length] = c0406a;
        } while (!T1.e.a(this.f33318b, c0406aArr, c0406aArr2));
        return true;
    }

    public Object S0() {
        Object obj = this.f33317a.get();
        if (h.u(obj) || h.v(obj)) {
            return null;
        }
        return h.s(obj);
    }

    public void T0(C0406a c0406a) {
        C0406a[] c0406aArr;
        C0406a[] c0406aArr2;
        do {
            c0406aArr = (C0406a[]) this.f33318b.get();
            int length = c0406aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c0406aArr[i10] == c0406a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c0406aArr2 = f33315i;
            } else {
                C0406a[] c0406aArr3 = new C0406a[length - 1];
                System.arraycopy(c0406aArr, 0, c0406aArr3, 0, i10);
                System.arraycopy(c0406aArr, i10 + 1, c0406aArr3, i10, (length - i10) - 1);
                c0406aArr2 = c0406aArr3;
            }
        } while (!T1.e.a(this.f33318b, c0406aArr, c0406aArr2));
    }

    public void U0(Object obj) {
        this.f33321e.lock();
        this.f33323g++;
        this.f33317a.lazySet(obj);
        this.f33321e.unlock();
    }

    public C0406a[] V0(Object obj) {
        AtomicReference atomicReference = this.f33318b;
        C0406a[] c0406aArr = f33316j;
        C0406a[] c0406aArr2 = (C0406a[]) atomicReference.getAndSet(c0406aArr);
        if (c0406aArr2 != c0406aArr) {
            U0(obj);
        }
        return c0406aArr2;
    }

    @Override // Eb.p
    public void a() {
        if (T1.e.a(this.f33322f, null, f.f19877a)) {
            Object objJ = h.j();
            for (C0406a c0406a : V0(objJ)) {
                c0406a.c(objJ, this.f33323g);
            }
        }
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        if (this.f33322f.get() != null) {
            cVar.dispose();
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        Lb.b.e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33322f.get() != null) {
            return;
        }
        Object objW = h.w(obj);
        U0(objW);
        for (C0406a c0406a : (C0406a[]) this.f33318b.get()) {
            c0406a.c(objW, this.f33323g);
        }
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        Lb.b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!T1.e.a(this.f33322f, null, th)) {
            AbstractC2904a.q(th);
            return;
        }
        Object objQ = h.q(th);
        for (C0406a c0406a : V0(objQ)) {
            c0406a.c(objQ, this.f33323g);
        }
    }

    @Override // Eb.k
    public void v0(p pVar) {
        C0406a c0406a = new C0406a(pVar, this);
        pVar.b(c0406a);
        if (P0(c0406a)) {
            if (c0406a.f33330g) {
                T0(c0406a);
                return;
            } else {
                c0406a.a();
                return;
            }
        }
        Throwable th = (Throwable) this.f33322f.get();
        if (th == f.f19877a) {
            pVar.a();
        } else {
            pVar.onError(th);
        }
    }

    public C3890a(Object obj) {
        this();
        this.f33317a.lazySet(Lb.b.e(obj, "defaultValue is null"));
    }
}
