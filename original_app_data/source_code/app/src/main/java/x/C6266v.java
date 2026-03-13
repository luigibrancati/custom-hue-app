package x;

import B.C0691a;
import B0.c;
import D.l;
import E.AbstractC0807p0;
import E.C0781c0;
import E.InterfaceC0802n;
import L.AbstractC1114o;
import L.C1095e0;
import L.C1118q;
import L.F;
import L.InterfaceC1099g0;
import L.InterfaceC1133y;
import L.a1;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import w.C6107a;
import x.C6266v;
import y.C6378n;

/* JADX INFO: renamed from: x.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6266v implements L.F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f47146A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f47147B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final a f47148C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f47149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f47150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47151d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6378n f47152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F.d f47153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a1.b f47154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B1 f47155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r2 f47156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k2 f47157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K1 f47158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C6242m1 f47159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t2 f47160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D.g f47161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C6217e0 f47162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m2 f47163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f47164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0781c0.i f47165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f47166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f47167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f47168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile int f47169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0691a f47170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f47171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicLong f47172y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile O7.e f47173z;

    /* JADX INFO: renamed from: x.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC1114o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f47174a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f47175b = new ArrayMap();

        @Override // L.AbstractC1114o
        public void a(final int i10) {
            for (final AbstractC1114o abstractC1114o : this.f47174a) {
                try {
                    ((Executor) this.f47175b.get(abstractC1114o)).execute(new Runnable() { // from class: x.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC1114o.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0807p0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // L.AbstractC1114o
        public void b(final int i10, final InterfaceC1133y interfaceC1133y) {
            for (final AbstractC1114o abstractC1114o : this.f47174a) {
                try {
                    ((Executor) this.f47175b.get(abstractC1114o)).execute(new Runnable() { // from class: x.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC1114o.b(i10, interfaceC1133y);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0807p0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // L.AbstractC1114o
        public void c(final int i10, final C1118q c1118q) {
            for (final AbstractC1114o abstractC1114o : this.f47174a) {
                try {
                    ((Executor) this.f47175b.get(abstractC1114o)).execute(new Runnable() { // from class: x.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC1114o.c(i10, c1118q);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    AbstractC0807p0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        public void h(Executor executor, AbstractC1114o abstractC1114o) {
            this.f47174a.add(abstractC1114o);
            this.f47175b.put(abstractC1114o, executor);
        }
    }

    /* JADX INFO: renamed from: x.v$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f47176a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f47177b;

        public b(Executor executor) {
            this.f47177b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f47176a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f47176a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f47176a.add(cVar);
        }

        public void c(c cVar) {
            this.f47176a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f47177b.execute(new Runnable() { // from class: x.w
                @Override // java.lang.Runnable
                public final void run() {
                    C6266v.b.a(this.f47182a, totalCaptureResult);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x.v$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public C6266v(C6378n c6378n, ScheduledExecutorService scheduledExecutorService, Executor executor, F.d dVar, L.X0 x02) {
        a1.b bVar = new a1.b();
        this.f47154g = bVar;
        this.f47164q = 0;
        this.f47166s = 0;
        this.f47168u = false;
        this.f47169v = 2;
        this.f47171x = true;
        this.f47172y = new AtomicLong(0L);
        this.f47173z = O.n.p(null);
        this.f47146A = 1;
        this.f47147B = 0L;
        a aVar = new a();
        this.f47148C = aVar;
        this.f47152e = c6378n;
        this.f47153f = dVar;
        this.f47150c = executor;
        this.f47163p = new m2(executor);
        b bVar2 = new b(executor);
        this.f47149b = bVar2;
        bVar.y(this.f47146A);
        bVar.j(Y0.e(bVar2));
        bVar.j(aVar);
        this.f47159l = new C6242m1(this, c6378n, executor);
        this.f47155h = new B1(this, scheduledExecutorService, executor, x02);
        this.f47156i = new r2(this, c6378n, executor);
        this.f47157j = new k2(this, c6378n, executor);
        this.f47167t = c6378n.c();
        this.f47158k = new K1(this, c6378n, executor);
        this.f47160m = new x2(c6378n, executor);
        this.f47170w = new C0691a(x02);
        this.f47161n = new D.g(this, executor);
        this.f47162o = new C6217e0(this, c6378n, x02, executor, scheduledExecutorService);
    }

    public static int O(C6378n c6378n, int i10) {
        int[] iArr = (int[]) c6378n.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return Z(i10, iArr) ? i10 : Z(1, iArr) ? 1 : 0;
    }

    public static boolean Z(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean b0(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof L.k1) && (l10 = (Long) ((L.k1) tag).d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static /* synthetic */ Object n(final C6266v c6266v, final c.a aVar) {
        c6266v.getClass();
        try {
            c6266v.f47150c.execute(new Runnable() { // from class: x.i
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f47013a.f47171x));
                }
            });
            return "isRepeatingRequestAvailable";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
            return "isRepeatingRequestAvailable";
        }
    }

    public static /* synthetic */ Object s(C6266v c6266v, final long j10, final c.a aVar) {
        c6266v.getClass();
        c6266v.y(new c() { // from class: x.n
            @Override // x.C6266v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C6266v.x(j10, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public static /* synthetic */ Object u(final C6266v c6266v, final c.a aVar) {
        c6266v.f47150c.execute(new Runnable() { // from class: x.j
            @Override // java.lang.Runnable
            public final void run() {
                C6266v c6266v2 = this.f47024a;
                O.n.t(c6266v2.p0(c6266v2.o0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static /* synthetic */ boolean x(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!b0(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public void A() {
        synchronized (this.f47151d) {
            try {
                int i10 = this.f47164q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f47164q = i10 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(boolean z10) {
        if (this.f47168u == z10) {
            return;
        }
        if (z10 && c0()) {
            e0();
            this.f47166s = 0;
            this.f47157j.f();
        }
        this.f47168u = z10;
        o0();
    }

    public void C(int i10) {
        if (this.f47168u) {
            return;
        }
        this.f47166s = i10;
        if (i10 == 0) {
            e0();
        }
        o0();
    }

    public Rect D() {
        return this.f47156i.g();
    }

    public int E() {
        return this.f47169v;
    }

    public B1 F() {
        return this.f47155h;
    }

    public K1 G() {
        return this.f47158k;
    }

    public int H() {
        Integer num = (Integer) this.f47152e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int I() {
        Integer num = (Integer) this.f47152e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int J() {
        Integer num = (Integer) this.f47152e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public C0781c0.i K() {
        return this.f47165r;
    }

    public L.a1 L() {
        this.f47154g.y(this.f47146A);
        this.f47154g.t(M());
        this.f47154g.o("CameraControlSessionUpdateId", Long.valueOf(this.f47147B));
        return this.f47154g.p();
    }

    public InterfaceC1099g0 M() {
        C6107a.C0631a c0631a = new C6107a.C0631a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        InterfaceC1099g0.c cVar = InterfaceC1099g0.c.REQUIRED;
        c0631a.g(key, 1, cVar);
        this.f47155h.n(c0631a);
        this.f47156i.e(c0631a);
        int iA = this.f47155h.G() ? 5 : 1;
        if (this.f47168u) {
            iA = 6;
        } else if (c0()) {
            c0631a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f47166s == 1) {
                    c0631a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f47167t), cVar);
                } else if (this.f47166s == 2) {
                    c0631a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f47152e.c()), cVar);
                }
            }
        } else {
            int i10 = this.f47169v;
            if (i10 == 0) {
                iA = this.f47170w.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c0631a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(N(iA)), cVar);
        c0631a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(Q(1)), cVar);
        this.f47159l.c(c0631a);
        this.f47161n.i(c0631a);
        return c0631a.c();
    }

    public int N(int i10) {
        return O(this.f47152e, i10);
    }

    public int P(int i10) {
        int[] iArr = (int[]) this.f47152e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Z(i10, iArr)) {
            return i10;
        }
        if (Z(4, iArr)) {
            return 4;
        }
        return Z(1, iArr) ? 1 : 0;
    }

    public final int Q(int i10) {
        int[] iArr = (int[]) this.f47152e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return Z(i10, iArr) ? i10 : Z(1, iArr) ? 1 : 0;
    }

    public k2 R() {
        return this.f47157j;
    }

    public int S() {
        int i10;
        synchronized (this.f47151d) {
            i10 = this.f47164q;
        }
        return i10;
    }

    public r2 T() {
        return this.f47156i;
    }

    public t2 U() {
        return this.f47160m;
    }

    public void V() {
        synchronized (this.f47151d) {
            this.f47164q++;
        }
    }

    public final boolean W() {
        return S() > 0;
    }

    public boolean X() {
        int iA = this.f47163p.a();
        AbstractC0807p0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iA);
        return iA > 0;
    }

    public boolean Y() {
        return this.f47168u;
    }

    @Override // L.F
    public void a(a1.b bVar) {
        this.f47160m.a(bVar);
    }

    public final boolean a0() {
        try {
            return ((Boolean) B0.c.a(new c.InterfaceC0018c() { // from class: x.o
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return C6266v.n(this.f47088a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    @Override // L.F
    public void b() {
        this.f47160m.b();
    }

    @Override // E.InterfaceC0802n
    public O7.e c(float f10) {
        return !W() ? O.n.n(new InterfaceC0802n.a("Camera is not active.")) : O.n.s(this.f47156i.m(f10));
    }

    public boolean c0() {
        return this.f47166s != 0;
    }

    @Override // L.F
    public O7.e d(final List list, final int i10, final int i11) {
        if (W()) {
            final int iE = E();
            return O.d.c(O.n.s(this.f47173z)).g(new O.a() { // from class: x.k
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return this.f47035a.f47162o.h(list, i10, iE, i11);
                }
            }, this.f47150c);
        }
        AbstractC0807p0.l("Camera2CameraControlImp", "Camera is not active.");
        return O.n.n(new InterfaceC0802n.a("Camera is not active."));
    }

    public void d0(c cVar) {
        this.f47149b.c(cVar);
    }

    @Override // E.InterfaceC0802n
    public O7.e e(float f10) {
        return !W() ? O.n.n(new InterfaceC0802n.a("Camera is not active.")) : O.n.s(this.f47156i.n(f10));
    }

    public final void e0() {
        C1095e0.a aVar = new C1095e0.a();
        aVar.t(this.f47146A);
        aVar.u(true);
        C6107a.C0631a c0631a = new C6107a.C0631a();
        c0631a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(N(1)));
        c0631a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0631a.c());
        m0(Collections.singletonList(aVar.h()));
    }

    @Override // L.F
    public void f(int i10) {
        if (!W()) {
            AbstractC0807p0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f47169v = i10;
        AbstractC0807p0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f47169v);
        t2 t2Var = this.f47160m;
        boolean z10 = true;
        if (this.f47169v != 1 && this.f47169v != 0) {
            z10 = false;
        }
        t2Var.d(z10);
        this.f47173z = n0();
    }

    public void f0() {
        k0(1);
    }

    @Override // L.F
    public void g(InterfaceC1099g0 interfaceC1099g0) {
        this.f47161n.g(l.a.e(interfaceC1099g0).d()).b(new Runnable() { // from class: x.q
            @Override // java.lang.Runnable
            public final void run() {
                C6266v.o();
            }
        }, N.a.a());
    }

    public void g0(boolean z10) {
        AbstractC0807p0.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f47155h.J(z10);
        this.f47156i.l(z10);
        this.f47158k.d(z10);
        this.f47157j.i(z10);
        this.f47159l.b(z10);
        this.f47161n.o(z10);
        if (z10) {
            return;
        }
        this.f47165r = null;
        this.f47163p.b();
    }

    @Override // E.InterfaceC0802n
    public O7.e h(boolean z10) {
        return !W() ? O.n.n(new InterfaceC0802n.a("Camera is not active.")) : O.n.s(this.f47157j.d(z10));
    }

    public void h0(boolean z10) {
        this.f47171x = z10;
    }

    @Override // L.F
    public InterfaceC1099g0 i() {
        return this.f47161n.n();
    }

    public void i0(boolean z10) {
        this.f47158k.f(z10);
    }

    @Override // L.F
    public void j(C0781c0.i iVar) {
        this.f47165r = iVar;
    }

    public void j0(Rational rational) {
        this.f47155h.K(rational);
    }

    @Override // E.InterfaceC0802n
    public O7.e k(E.L l10) {
        return !W() ? O.n.n(new InterfaceC0802n.a("Camera is not active.")) : !a0() ? O.n.n(new InterfaceC0802n.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : O.n.s(this.f47155h.N(l10));
    }

    public void k0(int i10) {
        this.f47146A = i10;
        this.f47155h.L(i10);
        this.f47162o.g(this.f47146A);
    }

    @Override // L.F
    public O7.e l(final int i10, final int i11) {
        if (W()) {
            final int iE = E();
            return O.d.c(O.n.s(this.f47173z)).g(new O.a() { // from class: x.l
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return O.n.p(this.f47063a.f47162o.c(i10, iE, i11));
                }
            }, this.f47150c);
        }
        AbstractC0807p0.l("Camera2CameraControlImp", "Camera is not active.");
        return O.n.n(new InterfaceC0802n.a("Camera is not active."));
    }

    public void l0(boolean z10) {
        this.f47160m.e(z10);
    }

    @Override // L.F
    public void m() {
        this.f47161n.j().b(new Runnable() { // from class: x.r
            @Override // java.lang.Runnable
            public final void run() {
                C6266v.p();
            }
        }, N.a.a());
    }

    public void m0(List list) {
        this.f47153f.b(list);
    }

    public O7.e n0() {
        return O.n.s(B0.c.a(new c.InterfaceC0018c() { // from class: x.h
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return C6266v.u(this.f47004a, aVar);
            }
        }));
    }

    public long o0() {
        this.f47147B = this.f47172y.getAndIncrement();
        this.f47153f.a();
        return this.f47147B;
    }

    public final O7.e p0(final long j10) {
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.m
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return C6266v.s(this.f47071a, j10, aVar);
            }
        });
    }

    public void y(c cVar) {
        this.f47149b.b(cVar);
    }

    public void z(final Executor executor, final AbstractC1114o abstractC1114o) {
        this.f47150c.execute(new Runnable() { // from class: x.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f47095a.f47148C.h(executor, abstractC1114o);
            }
        });
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }
}
