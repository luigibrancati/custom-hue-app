package ea;

import Eb.p;
import ea.C3973a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ea.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3974b extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f33872f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a[] f33873g = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f33874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f33875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f33876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f33877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f33878e;

    /* JADX INFO: renamed from: ea.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Hb.c, C3973a.InterfaceC0427a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f33879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3974b f33880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f33881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f33882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C3973a f33883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f33884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f33885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f33886h;

        public a(p pVar, C3974b c3974b) {
            this.f33879a = pVar;
            this.f33880b = c3974b;
        }

        public void a() {
            if (this.f33885g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f33885g) {
                        return;
                    }
                    if (this.f33881c) {
                        return;
                    }
                    C3974b c3974b = this.f33880b;
                    Lock lock = c3974b.f33876c;
                    lock.lock();
                    this.f33886h = c3974b.f33878e;
                    Object obj = c3974b.f33874a.get();
                    lock.unlock();
                    this.f33882d = obj != null;
                    this.f33881c = true;
                    if (obj != null) {
                        test(obj);
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b() {
            C3973a c3973a;
            while (!this.f33885g) {
                synchronized (this) {
                    try {
                        c3973a = this.f33883e;
                        if (c3973a == null) {
                            this.f33882d = false;
                            return;
                        }
                        this.f33883e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c3973a.c(this);
            }
        }

        public void c(Object obj, long j10) {
            if (this.f33885g) {
                return;
            }
            if (!this.f33884f) {
                synchronized (this) {
                    try {
                        if (this.f33885g) {
                            return;
                        }
                        if (this.f33886h == j10) {
                            return;
                        }
                        if (this.f33882d) {
                            C3973a c3973a = this.f33883e;
                            if (c3973a == null) {
                                c3973a = new C3973a(4);
                                this.f33883e = c3973a;
                            }
                            c3973a.b(obj);
                            return;
                        }
                        this.f33881c = true;
                        this.f33884f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f33885g) {
                return;
            }
            this.f33885g = true;
            this.f33880b.U0(this);
        }

        @Override // Hb.c
        public boolean j() {
            return this.f33885g;
        }

        @Override // ea.C3973a.InterfaceC0427a, Jb.g
        public boolean test(Object obj) {
            if (this.f33885g) {
                return false;
            }
            this.f33879a.c(obj);
            return false;
        }
    }

    public C3974b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f33876c = reentrantReadWriteLock.readLock();
        this.f33877d = reentrantReadWriteLock.writeLock();
        this.f33875b = new AtomicReference(f33873g);
        this.f33874a = new AtomicReference();
    }

    public static C3974b R0() {
        return new C3974b();
    }

    public static C3974b S0(Object obj) {
        return new C3974b(obj);
    }

    @Override // ea.d
    public boolean O0() {
        return ((a[]) this.f33875b.get()).length != 0;
    }

    public void Q0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f33875b.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!T1.e.a(this.f33875b, aVarArr, aVarArr2));
    }

    public Object T0() {
        return this.f33874a.get();
    }

    public void U0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f33875b.get();
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
                aVarArr2 = f33873g;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!T1.e.a(this.f33875b, aVarArr, aVarArr2));
    }

    public void V0(Object obj) {
        this.f33877d.lock();
        this.f33878e++;
        this.f33874a.lazySet(obj);
        this.f33877d.unlock();
    }

    @Override // ea.d, Jb.d
    public void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        V0(obj);
        for (a aVar : (a[]) this.f33875b.get()) {
            aVar.c(obj, this.f33878e);
        }
    }

    @Override // Eb.k
    public void v0(p pVar) {
        a aVar = new a(pVar, this);
        pVar.b(aVar);
        Q0(aVar);
        if (aVar.f33885g) {
            U0(aVar);
        } else {
            aVar.a();
        }
    }

    public C3974b(Object obj) {
        this();
        if (obj != null) {
            this.f33874a.lazySet(obj);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
