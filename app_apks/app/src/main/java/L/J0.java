package L;

import B0.c;
import L.J0;
import L.P0;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J0 implements P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.w f7903a = new androidx.lifecycle.w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7904b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.x f7905c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f7907b;

        public a(Object obj, Throwable th) {
            this.f7906a = obj;
            this.f7907b = th;
        }

        public static a b(Object obj) {
            return new a(obj, null);
        }

        public boolean a() {
            return this.f7907b == null;
        }

        public Throwable c() {
            return this.f7907b;
        }

        public Object d() {
            if (a()) {
                return this.f7906a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f7906a;
            } else {
                str = "Error: " + this.f7907b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public static /* synthetic */ void d(J0 j02, final a aVar) {
        HashMap map;
        synchronized (j02.f7904b) {
            map = new HashMap(j02.f7904b);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: L.D0
                @Override // java.lang.Runnable
                public final void run() {
                    J0.e(entry, aVar);
                }
            });
        }
    }

    public static /* synthetic */ void e(Map.Entry entry, a aVar) {
        P0.a aVar2 = (P0.a) entry.getKey();
        if (aVar.a()) {
            aVar2.a(aVar.d());
        } else {
            X0.h.g(aVar.c());
            aVar2.onError(aVar.c());
        }
    }

    public static /* synthetic */ Object f(final J0 j02, final c.a aVar) {
        j02.getClass();
        N.a.d().execute(new Runnable() { // from class: L.I0
            @Override // java.lang.Runnable
            public final void run() {
                J0.j(this.f7901a, aVar);
            }
        });
        return j02 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void g(final J0 j02) {
        if (j02.f7905c == null) {
            j02.f7905c = new androidx.lifecycle.x() { // from class: L.C0
                @Override // androidx.lifecycle.x
                public final void b(Object obj) {
                    J0.d(this.f7887a, (J0.a) obj);
                }
            };
        }
        j02.f7903a.observeForever(j02.f7905c);
    }

    public static /* synthetic */ void h(J0 j02) {
        androidx.lifecycle.x xVar = j02.f7905c;
        if (xVar != null) {
            j02.f7903a.removeObserver(xVar);
        }
    }

    public static /* synthetic */ void i(J0 j02, P0.a aVar) {
        a aVar2 = (a) j02.f7903a.getValue();
        if (aVar2 == null) {
            return;
        }
        if (aVar2.a()) {
            aVar.a(aVar2.d());
        } else {
            X0.h.g(aVar2.c());
            aVar.onError(aVar2.c());
        }
    }

    public static /* synthetic */ void j(J0 j02, c.a aVar) {
        a aVar2 = (a) j02.f7903a.getValue();
        if (aVar2 == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (aVar2.a()) {
            aVar.c(aVar2.d());
        } else {
            X0.h.g(aVar2.c());
            aVar.f(aVar2.c());
        }
    }

    @Override // L.P0
    public void a(P0.a aVar) {
        synchronized (this.f7904b) {
            try {
                this.f7904b.remove(aVar);
                if (this.f7904b.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L.P0
    public O7.e b() {
        return B0.c.a(new c.InterfaceC0018c() { // from class: L.F0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return J0.f(this.f7898a, aVar);
            }
        });
    }

    @Override // L.P0
    public void c(Executor executor, final P0.a aVar) {
        synchronized (this.f7904b) {
            try {
                boolean zIsEmpty = this.f7904b.isEmpty();
                this.f7904b.put(aVar, executor);
                if (zIsEmpty) {
                    l();
                } else {
                    executor.execute(new Runnable() { // from class: L.E0
                        @Override // java.lang.Runnable
                        public final void run() {
                            J0.i(this.f7893a, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        N.a.d().execute(new Runnable() { // from class: L.G0
            @Override // java.lang.Runnable
            public final void run() {
                J0.h(this.f7899a);
            }
        });
    }

    public final void l() {
        N.a.d().execute(new Runnable() { // from class: L.H0
            @Override // java.lang.Runnable
            public final void run() {
                J0.g(this.f7900a);
            }
        });
    }

    public void m(Object obj) {
        this.f7903a.postValue(a.b(obj));
    }
}
