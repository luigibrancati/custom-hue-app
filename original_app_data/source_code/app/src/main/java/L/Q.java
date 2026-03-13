package L;

import E.AbstractC0807p0;
import E.AbstractC0819w;
import E.C0813t;
import L.P0;
import androidx.lifecycle.AbstractC2763t;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f7919l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f7920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f7922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public W f7923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public P0 f7924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f7925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile List f7926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f7927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f7928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f7929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f7930k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements P0.a {
        public b() {
        }

        @Override // L.P0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            H h10;
            List listK;
            if (Q.this.f7927h.get() && (h10 = Q.this.f7922c) != null) {
                if (list != null) {
                    listK = new ArrayList(C4207u.v(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        listK.add(((C0813t) it.next()).c());
                    }
                } else {
                    listK = C4206t.k();
                }
                try {
                    h10.e(listK);
                    Set<String> setD = h10.d();
                    AbstractC4862t.d(setD, "getAvailableCameraIds(...)");
                    ArrayList arrayList = new ArrayList(C4207u.v(setD, 10));
                    for (String str : setD) {
                        C0813t.a aVar = C0813t.f3022c;
                        AbstractC4862t.b(str);
                        arrayList.add(C0813t.a.d(aVar, str, null, null, 6, null));
                    }
                    Q.this.p(arrayList);
                } catch (Exception e10) {
                    AbstractC0807p0.d("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e10);
                    P0 p02 = Q.this.f7924e;
                    if (p02 != null) {
                        p02.b();
                    }
                }
            }
        }

        @Override // L.P0.a
        public void onError(Throwable t10) {
            AbstractC4862t.e(t10, "t");
            if (Q.this.f7927h.get()) {
                AbstractC0807p0.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", t10);
                P0 p02 = Q.this.f7924e;
                if (p02 != null) {
                    p02.b();
                }
            }
        }
    }

    public Q(Executor backgroundExecutor) {
        AbstractC4862t.e(backgroundExecutor, "backgroundExecutor");
        this.f7920a = backgroundExecutor;
        this.f7921b = new Object();
        this.f7925f = new b();
        this.f7926g = C4206t.k();
        this.f7927h = new AtomicBoolean(false);
        this.f7928i = new CopyOnWriteArrayList();
        this.f7929j = new CopyOnWriteArrayList();
        this.f7930k = new LinkedHashMap();
    }

    public static final void k(List list, androidx.lifecycle.x xVar, String str) {
        Object next;
        AbstractC2763t abstractC2763tO;
        try {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (AbstractC4862t.a(((I) next).d(), str)) {
                        break;
                    }
                }
            }
            I i10 = (I) next;
            if (i10 == null || (abstractC2763tO = i10.o()) == null) {
                return;
            }
            abstractC2763tO.removeObserver(xVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static final void r(J j10, androidx.lifecycle.x xVar) {
        j10.i().o().removeObserver(xVar);
    }

    public static final void t(Q q10, String str, AbstractC0819w abstractC0819w) {
        if (!q10.f7927h.get()) {
            AbstractC0807p0.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if ((abstractC0819w != null ? abstractC0819w.c() : null) == null) {
            if ((abstractC0819w != null ? abstractC0819w.d() : null) != AbstractC0819w.b.CLOSED) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera ");
        sb2.append(str);
        sb2.append(" state changed to ");
        sb2.append(abstractC0819w.d());
        sb2.append(" with error: ");
        AbstractC0819w.a aVarC = abstractC0819w.c();
        sb2.append(aVarC != null ? Integer.valueOf(aVarC.d()) : null);
        sb2.append(". Triggering refresh.");
        AbstractC0807p0.l("CameraPresencePrvdr", sb2.toString());
        P0 p02 = q10.f7924e;
        if (p02 != null) {
            p02.b();
        }
    }

    public static final void u(I i10, androidx.lifecycle.x xVar) {
        i10.o().observeForever(xVar);
    }

    public final void i(A0 listener) {
        AbstractC4862t.e(listener, "listener");
        this.f7928i.add(listener);
    }

    public final void j() {
        synchronized (this.f7921b) {
            if (this.f7930k.isEmpty()) {
                return;
            }
            Map mapU = gc.Q.u(this.f7930k);
            this.f7930k.clear();
            C4015H c4015h = C4015H.f34254a;
            W w10 = this.f7923d;
            if (w10 != null) {
                LinkedHashSet linkedHashSetM = w10.m();
                AbstractC4862t.d(linkedHashSetM, "getCameras(...)");
                final ArrayList arrayList = new ArrayList(C4207u.v(linkedHashSetM, 10));
                Iterator it = linkedHashSetM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((J) it.next()).i());
                }
                AbstractC0807p0.a("CameraPresencePrvdr", "Clearing all " + mapU.size() + " state observers.");
                ArrayList arrayList2 = new ArrayList(mapU.size());
                for (Map.Entry entry : mapU.entrySet()) {
                    final String str = (String) entry.getKey();
                    final androidx.lifecycle.x xVar = (androidx.lifecycle.x) entry.getValue();
                    N.a.d().execute(new Runnable() { // from class: L.M
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q.k(arrayList, xVar, str);
                        }
                    });
                    arrayList2.add(C4015H.f34254a);
                }
            }
        }
    }

    public final void l(String str) {
        W w10 = this.f7923d;
        if (w10 == null) {
            return;
        }
        try {
            J jL = w10.l(str);
            AbstractC4862t.d(jL, "getCamera(...)");
            I i10 = jL.i();
            AbstractC4862t.d(i10, "getCameraInfoInternal(...)");
            s(i10);
        } catch (IllegalArgumentException unused) {
            AbstractC0807p0.l("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void m(Set set) {
        Iterator it = this.f7929j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            throw null;
        }
    }

    public final void n(Set set) {
        Iterator it = this.f7929j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            throw null;
        }
    }

    public final void o(Set set, Set set2) {
        if (!set.isEmpty()) {
            AbstractC0807p0.e("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            m(set);
        }
        if (set2.isEmpty()) {
            return;
        }
        AbstractC0807p0.e("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        n(set2);
    }

    public final void p(List list) {
        List listV0 = C4179C.V0(this.f7926g);
        if (AbstractC4862t.a(list, listV0)) {
            return;
        }
        Set setZ0 = C4179C.Z0(listV0);
        Set setZ02 = C4179C.Z0(list);
        Set setI = gc.V.i(setZ02, setZ0);
        Set setI2 = gc.V.i(setZ0, setZ02);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0813t) it.next()).c());
        }
        try {
            Iterator it2 = setI2.iterator();
            while (it2.hasNext()) {
                q(((C0813t) it2.next()).c());
            }
            W w10 = this.f7923d;
            if (w10 != null) {
                AbstractC0807p0.a("CameraPresencePrvdr", "Updating CameraRepository...");
                w10.d(arrayList2);
                arrayList.add(w10);
                AbstractC0807p0.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!this.f7928i.isEmpty()) {
                AbstractC0807p0.a("CameraPresencePrvdr", "Updating " + this.f7928i.size() + " dependent listeners...");
                for (A0 a02 : this.f7928i) {
                    a02.d(arrayList2);
                    AbstractC4862t.b(a02);
                    arrayList.add(a02);
                }
            }
            this.f7926g = list;
            Iterator it3 = setI.iterator();
            while (it3.hasNext()) {
                l(((C0813t) it3.next()).c());
            }
            o(setI, setI2);
        } catch (Exception e10) {
            AbstractC0807p0.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e10);
            ArrayList arrayList3 = new ArrayList(C4207u.v(listV0, 10));
            Iterator it4 = listV0.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((C0813t) it4.next()).c());
            }
            for (A0 a03 : gc.z.R(arrayList)) {
                try {
                    a03.d(arrayList3);
                } catch (Exception e11) {
                    AbstractC0807p0.d("CameraPresencePrvdr", "Failed to rollback listener: " + a03, e11);
                }
            }
            Iterator it5 = setI2.iterator();
            while (it5.hasNext()) {
                l(((C0813t) it5.next()).c());
            }
            Iterator it6 = setI.iterator();
            while (it6.hasNext()) {
                q(((C0813t) it6.next()).c());
            }
        }
    }

    public final void q(String str) {
        synchronized (this.f7921b) {
            final androidx.lifecycle.x xVar = (androidx.lifecycle.x) this.f7930k.remove(str);
            W w10 = this.f7923d;
            if (xVar != null && w10 != null) {
                try {
                    final J jL = w10.l(str);
                    AbstractC4862t.d(jL, "getCamera(...)");
                    N.a.d().execute(new Runnable() { // from class: L.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q.r(jL, xVar);
                        }
                    });
                    AbstractC0807p0.a("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            C4015H c4015h = C4015H.f34254a;
        }
    }

    public final void s(final I i10) {
        final String strD = i10.d();
        AbstractC4862t.d(strD, "getCameraId(...)");
        if (this.f7927h.get()) {
            synchronized (this.f7921b) {
                if (this.f7930k.containsKey(strD)) {
                    return;
                }
                final androidx.lifecycle.x xVar = new androidx.lifecycle.x() { // from class: L.O
                    @Override // androidx.lifecycle.x
                    public final void b(Object obj) {
                        Q.t(this.f7915a, strD, (AbstractC0819w) obj);
                    }
                };
                N.a.d().execute(new Runnable() { // from class: L.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        Q.u(i10, xVar);
                    }
                });
                this.f7930k.put(strD, xVar);
                AbstractC0807p0.a("CameraPresencePrvdr", "Registered state observer for camera: " + strD);
                C4015H c4015h = C4015H.f34254a;
            }
        }
    }

    public final void v() {
        if (!this.f7927h.getAndSet(false)) {
            AbstractC0807p0.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        AbstractC0807p0.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        P0 p02 = this.f7924e;
        if (p02 != null) {
            p02.a(this.f7925f);
        }
        j();
        this.f7928i.clear();
        this.f7929j.clear();
        this.f7926g = C4206t.k();
        this.f7922c = null;
        this.f7923d = null;
    }

    public final void w(H cameraFactory, W cameraRepository) {
        AbstractC4862t.e(cameraFactory, "cameraFactory");
        AbstractC4862t.e(cameraRepository, "cameraRepository");
        if (this.f7927h.compareAndSet(false, true)) {
            AbstractC0807p0.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            Set<String> setD = cameraFactory.d();
            AbstractC4862t.d(setD, "getAvailableCameraIds(...)");
            ArrayList arrayList = new ArrayList(C4207u.v(setD, 10));
            for (String str : setD) {
                C0813t.a aVar = C0813t.f3022c;
                AbstractC4862t.b(str);
                arrayList.add(C0813t.a.d(aVar, str, null, null, 6, null));
            }
            this.f7926g = arrayList;
            this.f7922c = cameraFactory;
            this.f7923d = cameraRepository;
            P0 p0C = cameraFactory.c();
            this.f7924e = p0C;
            if (p0C != null) {
                p0C.c(this.f7920a, this.f7925f);
            }
        }
    }
}
