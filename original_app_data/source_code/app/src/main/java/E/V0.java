package E;

import B0.c;
import E.V0;
import L.AbstractC1109l0;
import L.e1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range f2888q = e1.f8057a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2889a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f2890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f2891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f2892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.J f2893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O7.e f2896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.a f2897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O7.e f2898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.a f2899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.a f2900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC1109l0 f2901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f2902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f2903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f2904p;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f2905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O7.e f2906b;

        public a(c.a aVar, O7.e eVar) {
            this.f2905a = aVar;
            this.f2906b = eVar;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (th instanceof f) {
                X0.h.i(this.f2906b.cancel(false));
            } else {
                X0.h.i(this.f2905a.c(null));
            }
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            X0.h.i(this.f2905a.c(null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC1109l0 {
        public b(Size size, int i10) {
            super(size, i10);
        }

        @Override // L.AbstractC1109l0
        public O7.e o() {
            return V0.this.f2896h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O7.e f2909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.a f2910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f2911c;

        public c(O7.e eVar, c.a aVar, String str) {
            this.f2909a = eVar;
            this.f2910b = aVar;
            this.f2911c = str;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f2910b.c(null);
                return;
            }
            X0.h.i(this.f2910b.f(new f(this.f2911c + " cancelled.", th)));
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            O.n.t(this.f2909a, this.f2910b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ X0.a f2913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Surface f2914b;

        public d(X0.a aVar, Surface surface) {
            this.f2913a = aVar;
            this.f2914b = surface;
        }

        @Override // O.c
        public void a(Throwable th) {
            X0.h.j(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f2913a.accept(g.c(1, this.f2914b));
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            this.f2913a.accept(g.c(0, this.f2914b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends RuntimeException {
        public f(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class g {
        public static g c(int i10, Surface surface) {
            return new C0796k(i10, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class h {
        public static h g(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
            return new C0798l(rect, i10, i11, z10, matrix, z11);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface i {
        void a(h hVar);
    }

    public V0(Size size, L.J j10, boolean z10, J j11, int i10, Range range, Runnable runnable) {
        this.f2890b = size;
        this.f2893e = j10;
        this.f2894f = z10;
        X0.h.b(j11.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f2891c = j11;
        this.f2895g = i10;
        this.f2892d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: E.N0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return V0.a(atomicReference, str, aVar);
            }
        });
        c.a aVar = (c.a) X0.h.g((c.a) atomicReference.get());
        this.f2900l = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        O7.e eVarA2 = B0.c.a(new c.InterfaceC0018c() { // from class: E.O0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar2) {
                return V0.j(atomicReference2, str, aVar2);
            }
        });
        this.f2898j = eVarA2;
        O.n.j(eVarA2, new a(aVar, eVarA), N.a.a());
        c.a aVar2 = (c.a) X0.h.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        O7.e eVarA3 = B0.c.a(new c.InterfaceC0018c() { // from class: E.P0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar3) {
                return V0.c(atomicReference3, str, aVar3);
            }
        });
        this.f2896h = eVarA3;
        this.f2897i = (c.a) X0.h.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f2901m = bVar;
        O7.e eVarK = bVar.k();
        O.n.j(eVarA3, new c(eVarK, aVar2, str), N.a.a());
        eVarK.b(new Runnable() { // from class: E.Q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2828a.f2896h.cancel(true);
            }
        }, N.a.a());
        this.f2899k = o(N.a.a(), runnable);
    }

    public static /* synthetic */ Object a(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(V0 v02, AtomicReference atomicReference, c.a aVar) {
        v02.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + v02.hashCode() + ")";
    }

    public static /* synthetic */ Object j(AtomicReference atomicReference, String str, c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public void k() {
        synchronized (this.f2889a) {
            this.f2903o = null;
            this.f2904p = null;
        }
    }

    public AbstractC1109l0 l() {
        return this.f2901m;
    }

    public J m() {
        return this.f2891c;
    }

    public Size n() {
        return this.f2890b;
    }

    public final c.a o(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        O.n.j(B0.c.a(new c.InterfaceC0018c() { // from class: E.U0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return V0.g(this.f2865a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (c.a) X0.h.g((c.a) atomicReference.get());
    }

    public boolean p() {
        u();
        return this.f2899k.c(null);
    }

    public boolean q() {
        return this.f2894f;
    }

    public void r(final Surface surface, Executor executor, final X0.a aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: E.R0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(V0.g.c(2, surface));
                }
            });
            return;
        }
        if (this.f2897i.c(surface) || this.f2896h.isCancelled()) {
            O.n.j(this.f2898j, new d(aVar, surface), executor);
            return;
        }
        X0.h.i(this.f2896h.isDone());
        try {
            this.f2896h.get();
            executor.execute(new Runnable() { // from class: E.S0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(V0.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: E.T0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.accept(V0.g.c(4, surface));
                }
            });
        }
    }

    public void s(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f2889a) {
            this.f2903o = iVar;
            this.f2904p = executor;
            hVar = this.f2902n;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: E.L0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void t(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f2889a) {
            this.f2902n = hVar;
            iVar = this.f2903o;
            executor = this.f2904p;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: E.M0
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean u() {
        return this.f2897i.f(new AbstractC1109l0.b("Surface request will not complete."));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f2916a;

        public e(Runnable runnable) {
            this.f2916a = runnable;
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f2916a.run();
        }

        @Override // O.c
        public void a(Throwable th) {
        }
    }
}
