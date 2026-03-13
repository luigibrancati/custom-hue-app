package androidx.camera.core;

import E.AbstractC0807p0;
import E.C0780c;
import E.G0;
import E.InterfaceC0787f0;
import L.AbstractC1114o;
import L.InterfaceC1133y;
import L.InterfaceC1134y0;
import X0.h;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC1134y0, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1114o f21993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1134y0.a f21995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1134y0 f21997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1134y0.a f21998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f21999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray f22000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray f22001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f22003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f22004m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC1114o {
        public a() {
        }

        @Override // L.AbstractC1114o
        public void b(int i10, InterfaceC1133y interfaceC1133y) {
            super.b(i10, interfaceC1133y);
            e.this.p(interfaceC1133y);
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this(i(i10, i11, i12, i13));
    }

    public static /* synthetic */ void g(e eVar, InterfaceC1134y0.a aVar) {
        eVar.getClass();
        aVar.a(eVar);
    }

    public static /* synthetic */ void h(e eVar, InterfaceC1134y0 interfaceC1134y0) {
        synchronized (eVar.f21992a) {
            eVar.f21994c++;
        }
        eVar.m(interfaceC1134y0);
    }

    public static InterfaceC1134y0 i(int i10, int i11, int i12, int i13) {
        return new C0780c(ImageReader.newInstance(i10, i11, i12, i13));
    }

    @Override // androidx.camera.core.b.a
    public void a(d dVar) {
        synchronized (this.f21992a) {
            j(dVar);
        }
    }

    @Override // L.InterfaceC1134y0
    public d acquireLatestImage() {
        synchronized (this.f21992a) {
            try {
                if (this.f22003l.isEmpty()) {
                    return null;
                }
                if (this.f22002k >= this.f22003l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f22003l.size() - 1; i10++) {
                    if (!this.f22004m.contains(this.f22003l.get(i10))) {
                        arrayList.add((d) this.f22003l.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                int size = this.f22003l.size();
                List list = this.f22003l;
                this.f22002k = size;
                d dVar = (d) list.get(size - 1);
                this.f22004m.add(dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L.InterfaceC1134y0
    public int b() {
        int iB;
        synchronized (this.f21992a) {
            iB = this.f21997f.b();
        }
        return iB;
    }

    @Override // L.InterfaceC1134y0
    public void c() {
        synchronized (this.f21992a) {
            this.f21997f.c();
            this.f21998g = null;
            this.f21999h = null;
            this.f21994c = 0;
        }
    }

    @Override // L.InterfaceC1134y0
    public void close() {
        synchronized (this.f21992a) {
            try {
                if (this.f21996e) {
                    return;
                }
                Iterator it = new ArrayList(this.f22003l).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                this.f22003l.clear();
                this.f21997f.close();
                this.f21996e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L.InterfaceC1134y0
    public void d(InterfaceC1134y0.a aVar, Executor executor) {
        synchronized (this.f21992a) {
            this.f21998g = (InterfaceC1134y0.a) h.g(aVar);
            this.f21999h = (Executor) h.g(executor);
            this.f21997f.d(this.f21995d, executor);
        }
    }

    @Override // L.InterfaceC1134y0
    public int e() {
        int iE;
        synchronized (this.f21992a) {
            iE = this.f21997f.e();
        }
        return iE;
    }

    @Override // L.InterfaceC1134y0
    public d f() {
        synchronized (this.f21992a) {
            try {
                if (this.f22003l.isEmpty()) {
                    return null;
                }
                if (this.f22002k >= this.f22003l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f22003l;
                int i10 = this.f22002k;
                this.f22002k = i10 + 1;
                d dVar = (d) list.get(i10);
                this.f22004m.add(dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L.InterfaceC1134y0
    public int getHeight() {
        int height;
        synchronized (this.f21992a) {
            height = this.f21997f.getHeight();
        }
        return height;
    }

    @Override // L.InterfaceC1134y0
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f21992a) {
            surface = this.f21997f.getSurface();
        }
        return surface;
    }

    @Override // L.InterfaceC1134y0
    public int getWidth() {
        int width;
        synchronized (this.f21992a) {
            width = this.f21997f.getWidth();
        }
        return width;
    }

    public final void j(d dVar) {
        synchronized (this.f21992a) {
            try {
                int iIndexOf = this.f22003l.indexOf(dVar);
                if (iIndexOf >= 0) {
                    this.f22003l.remove(iIndexOf);
                    int i10 = this.f22002k;
                    if (iIndexOf <= i10) {
                        this.f22002k = i10 - 1;
                    }
                }
                this.f22004m.remove(dVar);
                if (this.f21994c > 0) {
                    m(this.f21997f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(G0 g02) {
        final InterfaceC1134y0.a aVar;
        Executor executor;
        synchronized (this.f21992a) {
            try {
                if (this.f22003l.size() < e()) {
                    g02.a(this);
                    this.f22003l.add(g02);
                    aVar = this.f21998g;
                    executor = this.f21999h;
                } else {
                    AbstractC0807p0.a("TAG", "Maximum image number reached.");
                    g02.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: E.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.e.g(this.f3015a, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public AbstractC1114o l() {
        return this.f21993b;
    }

    public void m(InterfaceC1134y0 interfaceC1134y0) {
        d dVarF;
        synchronized (this.f21992a) {
            try {
                if (this.f21996e) {
                    return;
                }
                int size = this.f22001j.size() + this.f22003l.size();
                if (size >= interfaceC1134y0.e()) {
                    AbstractC0807p0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        dVarF = interfaceC1134y0.f();
                        if (dVarF != null) {
                            this.f21994c--;
                            size++;
                            this.f22001j.put(dVarF.L0().getTimestamp(), dVarF);
                            n();
                        }
                    } catch (IllegalStateException e10) {
                        AbstractC0807p0.b("MetadataImageReader", "Failed to acquire next image.", e10);
                        dVarF = null;
                    }
                    if (dVarF == null || this.f21994c <= 0) {
                        break;
                    }
                } while (size < interfaceC1134y0.e());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        synchronized (this.f21992a) {
            try {
                for (int size = this.f22000i.size() - 1; size >= 0; size--) {
                    InterfaceC0787f0 interfaceC0787f0 = (InterfaceC0787f0) this.f22000i.valueAt(size);
                    long timestamp = interfaceC0787f0.getTimestamp();
                    d dVar = (d) this.f22001j.get(timestamp);
                    if (dVar != null) {
                        this.f22001j.remove(timestamp);
                        this.f22000i.removeAt(size);
                        k(new G0(dVar, interfaceC0787f0));
                    }
                }
                o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.f21992a) {
            try {
                if (this.f22001j.size() != 0 && this.f22000i.size() != 0) {
                    long jKeyAt = this.f22001j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f22000i.keyAt(0);
                    h.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f22001j.size() - 1; size >= 0; size--) {
                            if (this.f22001j.keyAt(size) < jKeyAt2) {
                                ((d) this.f22001j.valueAt(size)).close();
                                this.f22001j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f22000i.size() - 1; size2 >= 0; size2--) {
                            if (this.f22000i.keyAt(size2) < jKeyAt) {
                                this.f22000i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void p(InterfaceC1133y interfaceC1133y) {
        synchronized (this.f21992a) {
            try {
                if (this.f21996e) {
                    return;
                }
                this.f22000i.put(interfaceC1133y.getTimestamp(), new P.c(interfaceC1133y));
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(InterfaceC1134y0 interfaceC1134y0) {
        this.f21992a = new Object();
        this.f21993b = new a();
        this.f21994c = 0;
        this.f21995d = new InterfaceC1134y0.a() { // from class: E.q0
            @Override // L.InterfaceC1134y0.a
            public final void a(InterfaceC1134y0 interfaceC1134y02) {
                androidx.camera.core.e.h(this.f3010a, interfaceC1134y02);
            }
        };
        this.f21996e = false;
        this.f22000i = new LongSparseArray();
        this.f22001j = new LongSparseArray();
        this.f22004m = new ArrayList();
        this.f21997f = interfaceC1134y0;
        this.f22002k = 0;
        this.f22003l = new ArrayList(e());
    }
}
