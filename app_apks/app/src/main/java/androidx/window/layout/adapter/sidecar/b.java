package androidx.window.layout.adapter.sidecar;

import C3.s;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import fc.C4015H;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import z3.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements D3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f24695d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.window.layout.adapter.sidecar.a f24697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f24698b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24694c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f24696e = new ReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final b a(Context context) {
            AbstractC4862t.e(context, "context");
            if (b.f24695d == null) {
                ReentrantLock reentrantLock = b.f24696e;
                reentrantLock.lock();
                try {
                    if (b.f24695d == null) {
                        b.f24695d = new b(b.f24694c.b(context));
                    }
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.f24695d;
            AbstractC4862t.b(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            AbstractC4862t.e(context, "context");
            try {
                if (c(SidecarCompat.f24682f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.n()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(l lVar) {
            return lVar != null && lVar.compareTo(l.f48733f.a()) >= 0;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0317b implements a.InterfaceC0316a {
        public C0317b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0316a
        public void a(Activity activity, s newLayout) {
            AbstractC4862t.e(activity, "activity");
            AbstractC4862t.e(newLayout, "newLayout");
            Iterator it = b.this.g().iterator();
            AbstractC4862t.d(it, "iterator(...)");
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (AbstractC4862t.a(cVar.d(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f24700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f24701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final X0.a f24702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public s f24703d;

        public c(Activity activity, Executor executor, X0.a callback) {
            AbstractC4862t.e(activity, "activity");
            AbstractC4862t.e(executor, "executor");
            AbstractC4862t.e(callback, "callback");
            this.f24700a = activity;
            this.f24701b = executor;
            this.f24702c = callback;
        }

        public static final void c(c cVar, s sVar) {
            cVar.f24702c.accept(sVar);
        }

        public final void b(final s newLayoutInfo) {
            AbstractC4862t.e(newLayoutInfo, "newLayoutInfo");
            this.f24703d = newLayoutInfo;
            this.f24701b.execute(new Runnable() { // from class: F3.g
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(this.f3712a, newLayoutInfo);
                }
            });
        }

        public final Activity d() {
            return this.f24700a;
        }

        public final X0.a e() {
            return this.f24702c;
        }

        public final s f() {
            return this.f24703d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f24697a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f24697a;
        if (aVar2 != null) {
            aVar2.a(new C0317b());
        }
    }

    @Override // D3.a
    public void a(X0.a callback) {
        AbstractC4862t.e(callback, "callback");
        synchronized (f24696e) {
            try {
                if (this.f24697a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f24698b.iterator();
                AbstractC4862t.d(it, "iterator(...)");
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e() == callback) {
                        AbstractC4862t.b(cVar);
                        arrayList.add(cVar);
                    }
                }
                this.f24698b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).d());
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D3.a
    public void b(Context context, Executor executor, X0.a callback) {
        Object next;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(callback, "callback");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            callback.accept(new s(C4206t.k()));
            return;
        }
        ReentrantLock reentrantLock = f24696e;
        reentrantLock.lock();
        try {
            androidx.window.layout.adapter.sidecar.a aVar = this.f24697a;
            if (aVar == null) {
                callback.accept(new s(C4206t.k()));
                return;
            }
            boolean zH = h(activity);
            c cVar = new c(activity, executor, callback);
            this.f24698b.add(cVar);
            if (zH) {
                Iterator it = this.f24698b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (AbstractC4862t.a(activity, ((c) next).d())) {
                            break;
                        }
                    }
                }
                c cVar2 = (c) next;
                s sVarF = cVar2 != null ? cVar2.f() : null;
                if (sVarF != null) {
                    cVar.b(sVarF);
                }
            } else {
                aVar.b(activity);
            }
            C4015H c4015h = C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24698b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC4862t.a(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.f24697a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f24698b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24698b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
