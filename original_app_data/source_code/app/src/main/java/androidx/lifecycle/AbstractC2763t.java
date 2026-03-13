package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import java.util.Map;
import q.C5473c;
import r.C5522b;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2763t {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C5522b mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* JADX INFO: renamed from: androidx.lifecycle.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC2763t.this.mDataLock) {
                obj = AbstractC2763t.this.mPendingData;
                AbstractC2763t.this.mPendingData = AbstractC2763t.NOT_SET;
            }
            AbstractC2763t.this.setValue(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends d {
        public b(x xVar) {
            super(xVar);
        }

        @Override // androidx.lifecycle.AbstractC2763t.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends d implements InterfaceC2756l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC2758n f23483e;

        public c(InterfaceC2758n interfaceC2758n, x xVar) {
            super(xVar);
            this.f23483e = interfaceC2758n;
        }

        @Override // androidx.lifecycle.AbstractC2763t.d
        public void b() {
            this.f23483e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.AbstractC2763t.d
        public boolean c(InterfaceC2758n interfaceC2758n) {
            return this.f23483e == interfaceC2758n;
        }

        @Override // androidx.lifecycle.InterfaceC2756l
        public void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
            AbstractC2754j.b bVarB = this.f23483e.getLifecycle().b();
            if (bVarB == AbstractC2754j.b.DESTROYED) {
                AbstractC2763t.this.removeObserver(this.f23485a);
                return;
            }
            AbstractC2754j.b bVar = null;
            while (bVar != bVarB) {
                a(e());
                bVar = bVarB;
                bVarB = this.f23483e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.AbstractC2763t.d
        public boolean e() {
            return this.f23483e.getLifecycle().b().b(AbstractC2754j.b.STARTED);
        }
    }

    public AbstractC2763t(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new C5522b();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (C5473c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void a(d dVar) {
        if (dVar.f23486b) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f23487c;
            int i11 = this.mVersion;
            if (i10 >= i11) {
                return;
            }
            dVar.f23487c = i11;
            dVar.f23485a.b(this.mData);
        }
    }

    public void changeActiveCounter(int i10) {
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 == i12) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    onActive();
                } else if (z11) {
                    onInactive();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(androidx.lifecycle.t.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                a(dVar);
                dVar = null;
            } else {
                C5522b.d dVarE = this.mObservers.e();
                while (dVarE.hasNext()) {
                    a((d) ((Map.Entry) dVarE.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(InterfaceC2758n interfaceC2758n, x xVar) {
        assertMainThread("observe");
        if (interfaceC2758n.getLifecycle().b() == AbstractC2754j.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC2758n, xVar);
        d dVar = (d) this.mObservers.k(xVar, cVar);
        if (dVar != null && !dVar.c(interfaceC2758n)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC2758n.getLifecycle().a(cVar);
    }

    public void observeForever(x xVar) {
        assertMainThread("observeForever");
        b bVar = new b(xVar);
        d dVar = (d) this.mObservers.k(xVar, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    public void postValue(Object obj) {
        boolean z10;
        synchronized (this.mDataLock) {
            z10 = this.mPendingData == NOT_SET;
            this.mPendingData = obj;
        }
        if (z10) {
            C5473c.g().c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(x xVar) {
        assertMainThread("removeObserver");
        d dVar = (d) this.mObservers.l(xVar);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    public void removeObservers(InterfaceC2758n interfaceC2758n) {
        assertMainThread("removeObservers");
        for (Map.Entry entry : this.mObservers) {
            if (((d) entry.getValue()).c(interfaceC2758n)) {
                removeObserver((x) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public AbstractC2763t() {
        this.mDataLock = new Object();
        this.mObservers = new C5522b();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.t$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f23485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23487c = -1;

        public d(x xVar) {
            this.f23485a = xVar;
        }

        public void a(boolean z10) {
            if (z10 == this.f23486b) {
                return;
            }
            this.f23486b = z10;
            AbstractC2763t.this.changeActiveCounter(z10 ? 1 : -1);
            if (this.f23486b) {
                AbstractC2763t.this.dispatchingValue(this);
            }
        }

        public boolean c(InterfaceC2758n interfaceC2758n) {
            return false;
        }

        public abstract boolean e();

        public void b() {
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}
