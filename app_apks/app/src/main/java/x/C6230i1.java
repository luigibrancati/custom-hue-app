package x;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import x.C6230i1;

/* JADX INFO: renamed from: x.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6230i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f47016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47017b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f47018c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f47019d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f47020e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraDevice.StateCallback f47021f = new a();

    public C6230i1(Executor executor) {
        this.f47016a = executor;
    }

    public static void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            U1 u12 = (U1) it.next();
            u12.m().r(u12);
        }
    }

    public final void a(U1 u12) {
        U1 u13;
        Iterator it = f().iterator();
        while (it.hasNext() && (u13 = (U1) it.next()) != u12) {
            u13.a();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f47021f;
    }

    public List d() {
        ArrayList arrayList;
        synchronized (this.f47017b) {
            arrayList = new ArrayList(this.f47018c);
        }
        return arrayList;
    }

    public List e() {
        ArrayList arrayList;
        synchronized (this.f47017b) {
            arrayList = new ArrayList(this.f47020e);
        }
        return arrayList;
    }

    public List f() {
        ArrayList arrayList;
        synchronized (this.f47017b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    public void g(U1 u12) {
        synchronized (this.f47017b) {
            this.f47018c.remove(u12);
            this.f47019d.remove(u12);
        }
    }

    public void h(U1 u12) {
        synchronized (this.f47017b) {
            this.f47019d.add(u12);
        }
    }

    public void i(U1 u12) {
        a(u12);
        synchronized (this.f47017b) {
            this.f47020e.remove(u12);
        }
    }

    public void j(U1 u12) {
        synchronized (this.f47017b) {
            this.f47018c.add(u12);
            this.f47020e.remove(u12);
        }
        a(u12);
    }

    public void k(U1 u12) {
        synchronized (this.f47017b) {
            this.f47020e.add(u12);
        }
    }

    /* JADX INFO: renamed from: x.i1$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((U1) it.next()).c(i10);
            }
        }

        public final void c() {
            List listF;
            synchronized (C6230i1.this.f47017b) {
                listF = C6230i1.this.f();
                C6230i1.this.f47020e.clear();
                C6230i1.this.f47018c.clear();
                C6230i1.this.f47019d.clear();
            }
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                ((U1) it.next()).a();
            }
        }

        public final void d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C6230i1.this.f47017b) {
                linkedHashSet.addAll(C6230i1.this.f47020e);
                linkedHashSet.addAll(C6230i1.this.f47018c);
            }
            C6230i1.this.f47016a.execute(new Runnable() { // from class: x.h1
                @Override // java.lang.Runnable
                public final void run() {
                    C6230i1.a.a(linkedHashSet, i10);
                }
            });
        }

        public final void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C6230i1.this.f47017b) {
                linkedHashSet.addAll(C6230i1.this.f47020e);
                linkedHashSet.addAll(C6230i1.this.f47018c);
            }
            C6230i1.this.f47016a.execute(new Runnable() { // from class: x.g1
                @Override // java.lang.Runnable
                public final void run() {
                    C6230i1.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }
}
