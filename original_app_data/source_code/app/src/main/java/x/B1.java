package x;

import B0.c;
import E.AbstractC0807p0;
import E.C0812s0;
import E.InterfaceC0802n;
import L.AbstractC1114o;
import L.C1095e0;
import L.C1118q;
import L.F;
import L.InterfaceC1099g0;
import L.InterfaceC1133y;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Log;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w.C6107a;
import x.C6266v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class B1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final MeteringRectangle[] f46576x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6266v f46577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f46578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f46579c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B.l f46582f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f46585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture f46586j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f46593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f46594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f46595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c.a f46596t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c.a f46597u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f46598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C6266v.c f46599w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f46580d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Rational f46581e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46583g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f46584h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46587k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46588l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46589m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46590n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C6266v.c f46591o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C6266v.c f46592p = null;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC1114o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f46600a;

        public a(c.a aVar) {
            this.f46600a = aVar;
        }

        @Override // L.AbstractC1114o
        public void a(int i10) {
            c.a aVar = this.f46600a;
            if (aVar != null) {
                aVar.f(new InterfaceC0802n.a("Camera is closed"));
            }
        }

        @Override // L.AbstractC1114o
        public void b(int i10, InterfaceC1133y interfaceC1133y) {
            c.a aVar = this.f46600a;
            if (aVar != null) {
                aVar.c(interfaceC1133y);
            }
        }

        @Override // L.AbstractC1114o
        public void c(int i10, C1118q c1118q) {
            c.a aVar = this.f46600a;
            if (aVar != null) {
                aVar.f(new F.c(c1118q));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC1114o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f46602a;

        public b(c.a aVar) {
            this.f46602a = aVar;
        }

        @Override // L.AbstractC1114o
        public void a(int i10) {
            c.a aVar = this.f46602a;
            if (aVar != null) {
                aVar.f(new InterfaceC0802n.a("Camera is closed"));
            }
        }

        @Override // L.AbstractC1114o
        public void b(int i10, InterfaceC1133y interfaceC1133y) {
            if (this.f46602a != null) {
                AbstractC0807p0.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f46602a.c(null);
            }
        }

        @Override // L.AbstractC1114o
        public void c(int i10, C1118q c1118q) {
            c.a aVar = this.f46602a;
            if (aVar != null) {
                aVar.f(new F.c(c1118q));
            }
        }
    }

    public B1(C6266v c6266v, ScheduledExecutorService scheduledExecutorService, Executor executor, L.X0 x02) {
        MeteringRectangle[] meteringRectangleArr = f46576x;
        this.f46593q = meteringRectangleArr;
        this.f46594r = meteringRectangleArr;
        this.f46595s = meteringRectangleArr;
        this.f46596t = null;
        this.f46597u = null;
        this.f46598v = false;
        this.f46599w = null;
        this.f46577a = c6266v;
        this.f46578b = executor;
        this.f46579c = scheduledExecutorService;
        this.f46582f = new B.l(x02);
    }

    public static PointF C(C0812s0 c0812s0, Rational rational, Rational rational2, int i10, B.l lVar) {
        if (c0812s0.b() != null) {
            rational2 = c0812s0.b();
        }
        PointF pointFA = lVar.a(c0812s0, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFA.y = (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointFA.y) * (1.0f / fDoubleValue);
                return pointFA;
            }
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointFA.x = (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointFA.x) * (1.0f / fDoubleValue2);
        }
        return pointFA;
    }

    public static MeteringRectangle D(C0812s0 c0812s0, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iA = ((int) (c0812s0.a() * rect.width())) / 2;
        int iA2 = ((int) (c0812s0.a() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iA, iHeight - iA2, iWidth + iA, iHeight + iA2);
        rect2.left = I(rect2.left, rect.right, rect.left);
        rect2.right = I(rect2.right, rect.right, rect.left);
        rect2.top = I(rect2.top, rect.bottom, rect.top);
        rect2.bottom = I(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    public static boolean H(C0812s0 c0812s0) {
        return c0812s0.c() >= 0.0f && c0812s0.c() <= 1.0f && c0812s0.d() >= 0.0f && c0812s0.d() <= 1.0f;
    }

    public static int I(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    public static /* synthetic */ boolean a(B1 b12, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        b12.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C6266v.b0(totalCaptureResult, j10)) {
            return false;
        }
        b12.t();
        return true;
    }

    public static /* synthetic */ void b(B1 b12, boolean z10, c.a aVar) {
        b12.f46577a.d0(b12.f46599w);
        b12.f46598v = z10;
        b12.w(aVar);
    }

    public static /* synthetic */ Object c(final B1 b12, final E.L l10, final long j10, final c.a aVar) {
        b12.f46578b.execute(new Runnable() { // from class: x.q1
            @Override // java.lang.Runnable
            public final void run() {
                this.f47105a.P(aVar, l10, j10);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ Object f(final B1 b12, final boolean z10, final c.a aVar) {
        b12.f46578b.execute(new Runnable() { // from class: x.y1
            @Override // java.lang.Runnable
            public final void run() {
                B1.b(this.f47223a, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ boolean h(B1 b12, long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        b12.getClass();
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        AbstractC0807p0.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != b12.f46598v || !C6266v.b0(totalCaptureResult, j10)) {
            return false;
        }
        AbstractC0807p0.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public static /* synthetic */ Object i(final B1 b12, final c.a aVar) {
        b12.f46578b.execute(new Runnable() { // from class: x.z1
            @Override // java.lang.Runnable
            public final void run() {
                this.f47230a.R(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public static /* synthetic */ void j(B1 b12, long j10) {
        if (j10 == b12.f46587k) {
            b12.f46589m = false;
            b12.s(false);
        }
    }

    public static /* synthetic */ boolean k(B1 b12, boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        b12.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (b12.M()) {
            if (!z10 || num == null) {
                b12.f46589m = true;
                b12.f46588l = true;
            } else if (b12.f46584h.intValue() == 3) {
                if (num.intValue() == 4) {
                    b12.f46589m = true;
                    b12.f46588l = true;
                } else if (num.intValue() == 5) {
                    b12.f46589m = false;
                    b12.f46588l = true;
                }
            }
        }
        if (b12.f46588l && C6266v.b0(totalCaptureResult, j10)) {
            b12.s(b12.f46589m);
            return true;
        }
        if (!b12.f46584h.equals(num) && num != null) {
            b12.f46584h = num;
        }
        return false;
    }

    public static /* synthetic */ void l(B1 b12, long j10) {
        if (j10 == b12.f46587k) {
            b12.q();
        }
    }

    public int A() {
        return this.f46590n != 3 ? 4 : 3;
    }

    public final Rational B() {
        if (this.f46581e != null) {
            return this.f46581e;
        }
        Rect rectD = this.f46577a.D();
        return new Rational(rectD.width(), rectD.height());
    }

    public final List E(List list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0812s0 c0812s0 = (C0812s0) it.next();
            if (arrayList.size() == i10) {
                break;
            }
            if (H(c0812s0)) {
                MeteringRectangle meteringRectangleD = D(c0812s0, C(c0812s0, rational2, rational, i11, this.f46582f), rect);
                if (meteringRectangleD.getWidth() != 0 && meteringRectangleD.getHeight() != 0) {
                    arrayList.add(meteringRectangleD);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean F() {
        return this.f46577a.P(1) == 1;
    }

    public boolean G() {
        return this.f46598v;
    }

    public void J(boolean z10) {
        if (z10 == this.f46580d) {
            return;
        }
        this.f46580d = z10;
        if (this.f46580d) {
            return;
        }
        q();
    }

    public void K(Rational rational) {
        this.f46581e = rational;
    }

    public void L(int i10) {
        this.f46590n = i10;
    }

    public final boolean M() {
        return this.f46593q.length > 0;
    }

    public O7.e N(E.L l10) {
        return O(l10, 5000L);
    }

    public O7.e O(final E.L l10, final long j10) {
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.p1
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return B1.c(this.f47098a, l10, j10, aVar);
            }
        });
    }

    public void P(c.a aVar, E.L l10, long j10) {
        if (!this.f46580d) {
            aVar.f(new InterfaceC0802n.a("Camera is not active."));
            return;
        }
        Rect rectD = this.f46577a.D();
        Rational rationalB = B();
        List listE = E(l10.c(), this.f46577a.I(), rationalB, rectD, 1);
        List listE2 = E(l10.b(), this.f46577a.H(), rationalB, rectD, 2);
        List listE3 = E(l10.d(), this.f46577a.J(), rationalB, rectD, 4);
        if (listE.isEmpty() && listE2.isEmpty() && listE3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        y("Cancelled by another startFocusAndMetering()");
        z("Cancelled by another startFocusAndMetering()");
        u();
        this.f46596t = aVar;
        MeteringRectangle[] meteringRectangleArr = f46576x;
        x((MeteringRectangle[]) listE.toArray(meteringRectangleArr), (MeteringRectangle[]) listE2.toArray(meteringRectangleArr), (MeteringRectangle[]) listE3.toArray(meteringRectangleArr), l10, j10);
    }

    public O7.e Q() {
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.x1
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return B1.i(this.f47205a, aVar);
            }
        });
    }

    public void R(c.a aVar) {
        AbstractC0807p0.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f46580d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0802n.a("Camera is not active."));
                return;
            }
            return;
        }
        C1095e0.a aVar2 = new C1095e0.a();
        aVar2.t(this.f46590n);
        aVar2.u(true);
        C6107a.C0631a c0631a = new C6107a.C0631a();
        c0631a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0631a.c());
        aVar2.c(new b(aVar));
        this.f46577a.m0(Collections.singletonList(aVar2.h()));
    }

    public void S(c.a aVar, boolean z10) {
        if (!this.f46580d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0802n.a("Camera is not active."));
                return;
            }
            return;
        }
        C1095e0.a aVar2 = new C1095e0.a();
        aVar2.t(this.f46590n);
        aVar2.u(true);
        C6107a.C0631a c0631a = new C6107a.C0631a();
        c0631a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0631a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f46577a.N(1)), InterfaceC1099g0.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0631a.c());
        aVar2.c(new a(aVar));
        this.f46577a.m0(Collections.singletonList(aVar2.h()));
    }

    public void n(C6107a.C0631a c0631a) {
        int iA = this.f46583g ? 1 : A();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Object objValueOf = Integer.valueOf(this.f46577a.P(iA));
        InterfaceC1099g0.c cVar = InterfaceC1099g0.c.REQUIRED;
        c0631a.g(key, objValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f46593q;
        if (meteringRectangleArr.length != 0) {
            c0631a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f46594r;
        if (meteringRectangleArr2.length != 0) {
            c0631a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f46595s;
        if (meteringRectangleArr3.length != 0) {
            c0631a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    public void o(boolean z10, boolean z11) {
        if (this.f46580d) {
            C1095e0.a aVar = new C1095e0.a();
            aVar.u(true);
            aVar.t(this.f46590n);
            C6107a.C0631a c0631a = new C6107a.C0631a();
            if (z10) {
                c0631a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c0631a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0631a.c());
            this.f46577a.m0(Collections.singletonList(aVar.h()));
        }
    }

    public void p(c.a aVar) {
        z("Cancelled by another cancelFocusAndMetering()");
        y("Cancelled by cancelFocusAndMetering()");
        this.f46597u = aVar;
        u();
        r();
        if (M()) {
            o(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f46576x;
        this.f46593q = meteringRectangleArr;
        this.f46594r = meteringRectangleArr;
        this.f46595s = meteringRectangleArr;
        this.f46583g = false;
        final long jO0 = this.f46577a.o0();
        if (this.f46597u != null) {
            final int iP = this.f46577a.P(A());
            C6266v.c cVar = new C6266v.c() { // from class: x.r1
                @Override // x.C6266v.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return B1.a(this.f47115a, iP, jO0, totalCaptureResult);
                }
            };
            this.f46592p = cVar;
            this.f46577a.y(cVar);
        }
    }

    public void q() {
        p(null);
    }

    public final void r() {
        ScheduledFuture scheduledFuture = this.f46586j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f46586j = null;
        }
    }

    public void s(boolean z10) {
        r();
        c.a aVar = this.f46596t;
        if (aVar != null) {
            aVar.c(E.M.a(z10));
            this.f46596t = null;
        }
    }

    public final void t() {
        c.a aVar = this.f46597u;
        if (aVar != null) {
            aVar.c(null);
            this.f46597u = null;
        }
    }

    public final void u() {
        ScheduledFuture scheduledFuture = this.f46585i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f46585i = null;
        }
    }

    public O7.e v(final boolean z10) {
        if (this.f46577a.N(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return O.n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.w1
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return B1.f(this.f47186a, z10, aVar);
            }
        });
    }

    public final void w(final c.a aVar) {
        if (!this.f46580d) {
            if (aVar != null) {
                aVar.f(new InterfaceC0802n.a("Camera is not active."));
            }
        } else {
            final long jO0 = this.f46577a.o0();
            C6266v.c cVar = new C6266v.c() { // from class: x.A1
                @Override // x.C6266v.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return B1.h(this.f46570a, jO0, aVar, totalCaptureResult);
                }
            };
            this.f46599w = cVar;
            this.f46577a.y(cVar);
        }
    }

    public final void x(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, E.L l10, long j10) {
        final long jO0;
        this.f46577a.d0(this.f46591o);
        u();
        r();
        this.f46593q = meteringRectangleArr;
        this.f46594r = meteringRectangleArr2;
        this.f46595s = meteringRectangleArr3;
        if (M()) {
            this.f46583g = true;
            this.f46588l = false;
            this.f46589m = false;
            jO0 = this.f46577a.o0();
            S(null, true);
        } else {
            this.f46583g = false;
            this.f46588l = true;
            this.f46589m = false;
            jO0 = this.f46577a.o0();
        }
        this.f46584h = 0;
        final boolean zF = F();
        C6266v.c cVar = new C6266v.c() { // from class: x.o1
            @Override // x.C6266v.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return B1.k(this.f47090a, zF, jO0, totalCaptureResult);
            }
        };
        this.f46591o = cVar;
        this.f46577a.y(cVar);
        final long j11 = this.f46587k + 1;
        this.f46587k = j11;
        Runnable runnable = new Runnable() { // from class: x.s1
            @Override // java.lang.Runnable
            public final void run() {
                B1 b12 = this.f47129a;
                b12.f46578b.execute(new Runnable() { // from class: x.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        B1.j(b12, j);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f46579c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f46586j = scheduledExecutorService.schedule(runnable, j10, timeUnit);
        if (l10.e()) {
            this.f46585i = this.f46579c.schedule(new Runnable() { // from class: x.t1
                @Override // java.lang.Runnable
                public final void run() {
                    B1 b12 = this.f47139a;
                    b12.f46578b.execute(new Runnable() { // from class: x.u1
                        @Override // java.lang.Runnable
                        public final void run() {
                            B1.l(b12, j);
                        }
                    });
                }
            }, l10.a(), timeUnit);
        }
    }

    public final void y(String str) {
        this.f46577a.d0(this.f46591o);
        c.a aVar = this.f46596t;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a(str));
            this.f46596t = null;
        }
    }

    public final void z(String str) {
        this.f46577a.d0(this.f46592p);
        c.a aVar = this.f46597u;
        if (aVar != null) {
            aVar.f(new InterfaceC0802n.a(str));
            this.f46597u = null;
        }
    }
}
