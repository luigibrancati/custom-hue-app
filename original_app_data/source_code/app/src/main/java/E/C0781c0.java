package E;

import K.C0982y;
import K.InterfaceC0981x;
import L.C1092d;
import L.C1128v0;
import L.InterfaceC1099g0;
import L.InterfaceC1130w0;
import L.InterfaceC1132x0;
import L.InterfaceC1134y0;
import L.a1;
import L.c1;
import L.e1;
import L.f1;
import L.s1;
import L.t1;
import X.c;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import s.InterfaceC5702a;

/* JADX INFO: renamed from: E.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0781c0 extends W0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final c f2949D = new c();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final S.b f2950E = new S.b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public K.X f2951A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a1.c f2952B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final InterfaceC0981x f2953C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1134y0.a f2954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f2956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rational f2959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public P.k f2960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a1.b f2961y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0982y f2962z;

    /* JADX INFO: renamed from: E.c0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC0981x {
        public a() {
        }

        @Override // K.InterfaceC0981x
        public O7.e a(List list) {
            return C0781c0.this.H0(list);
        }

        @Override // K.InterfaceC0981x
        public void b() {
            C0781c0.this.D0();
        }

        @Override // K.InterfaceC0981x
        public void c() {
            C0781c0.this.J0();
        }
    }

    /* JADX INFO: renamed from: E.c0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements s1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L.M0 f2964a;

        public b() {
            this(L.M0.g0());
        }

        public static b d(InterfaceC1099g0 interfaceC1099g0) {
            return new b(L.M0.h0(interfaceC1099g0));
        }

        @Override // E.K
        public L.L0 a() {
            return this.f2964a;
        }

        public C0781c0 c() {
            Integer num = (Integer) a().c(C1128v0.f8202T, null);
            if (num != null) {
                a().H(InterfaceC1130w0.f8213j, num);
            } else if (C0781c0.y0(a())) {
                a().H(InterfaceC1130w0.f8213j, 32);
            } else if (C0781c0.z0(a())) {
                a().H(InterfaceC1130w0.f8213j, 32);
                a().H(InterfaceC1130w0.f8214k, 256);
            } else if (C0781c0.A0(a())) {
                a().H(InterfaceC1130w0.f8213j, 4101);
                a().H(InterfaceC1130w0.f8215l, J.f2793c);
            } else {
                a().H(InterfaceC1130w0.f8213j, 256);
            }
            C1128v0 c1128v0B = b();
            InterfaceC1132x0.k(c1128v0B);
            C0781c0 c0781c0 = new C0781c0(c1128v0B);
            Size size = (Size) a().c(InterfaceC1132x0.f8220q, null);
            if (size != null) {
                c0781c0.E0(new Rational(size.getWidth(), size.getHeight()));
            }
            X0.h.h((Executor) a().c(P.i.f12518L, N.a.c()), "The IO executor can't be null");
            L.L0 l0A = a();
            InterfaceC1099g0.a aVar = C1128v0.f8200R;
            if (l0A.d(aVar)) {
                Integer num2 = (Integer) a().a(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && a().c(C1128v0.f8209a0, null) == null) {
                    throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return c0781c0;
        }

        @Override // L.s1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1128v0 b() {
            return new C1128v0(L.R0.f0(this.f2964a));
        }

        public b f(t1.b bVar) {
            a().H(s1.f8181G, bVar);
            return this;
        }

        public b g(J j10) {
            a().H(InterfaceC1130w0.f8215l, j10);
            return this;
        }

        public b h(int i10) {
            a().H(C1128v0.f8203U, Integer.valueOf(i10));
            return this;
        }

        public b i(X.c cVar) {
            a().H(InterfaceC1132x0.f8224u, cVar);
            return this;
        }

        public b j(f1 f1Var) {
            a().H(s1.f8185K, f1Var);
            return this;
        }

        public b k(int i10) {
            a().H(s1.f8175A, Integer.valueOf(i10));
            return this;
        }

        public b l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().H(InterfaceC1132x0.f8216m, Integer.valueOf(i10));
            return this;
        }

        public b m(Class cls) {
            a().H(P.q.f12542N, cls);
            if (a().c(P.q.f12541M, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b n(String str) {
            a().H(P.q.f12541M, str);
            return this;
        }

        public b(L.M0 m02) {
            this.f2964a = m02;
            Class cls = (Class) m02.c(P.q.f12542N, null);
            if (cls == null || cls.equals(C0781c0.class)) {
                f(t1.b.IMAGE_CAPTURE);
                m(C0781c0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: E.c0$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f1 f2965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final X.c f2966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1128v0 f2967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final J f2968d;

        static {
            f1 f1Var = f1.STILL_CAPTURE;
            f2965a = f1Var;
            X.c cVarA = new c.a().d(X.a.f17971c).f(X.d.f17983c).a();
            f2966b = cVarA;
            J j10 = J.f2794d;
            f2968d = j10;
            f2967c = new b().k(4).j(f1Var).l(0).i(cVarA).h(0).g(j10).b();
        }

        public C1128v0 a() {
            return f2967c;
        }
    }

    /* JADX INFO: renamed from: E.c0$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements InterfaceC0783d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0815u f2969a;

        public d(InterfaceC0815u interfaceC0815u) {
            this.f2969a = interfaceC0815u;
        }

        @Override // E.InterfaceC0783d0
        public Set a() {
            Set setB = b();
            if (setB != null) {
                return setB;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (d()) {
                hashSet.add(1);
            }
            if (c()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }

        public final Set b() {
            InterfaceC0815u interfaceC0815u = this.f2969a;
            HashSet hashSet = null;
            if (!(interfaceC0815u instanceof C1092d)) {
                return null;
            }
            InterfaceC1099g0 interfaceC1099g0A = ((C1092d) interfaceC0815u).s().j().a(t1.b.IMAGE_CAPTURE, 1);
            if (interfaceC1099g0A != null) {
                InterfaceC1099g0.a aVar = InterfaceC1132x0.f8223t;
                if (interfaceC1099g0A.d(aVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) interfaceC1099g0A.a(aVar)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        public final boolean c() {
            InterfaceC0815u interfaceC0815u = this.f2969a;
            if (!(interfaceC0815u instanceof L.I)) {
                return false;
            }
            L.I i10 = (L.I) interfaceC0815u;
            if (i10.m().contains(3)) {
                return i10.a().contains(32);
            }
            return false;
        }

        public final boolean d() {
            InterfaceC0815u interfaceC0815u = this.f2969a;
            if (interfaceC0815u instanceof L.I) {
                return ((L.I) interfaceC0815u).a().contains(4101);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: E.c0$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
    }

    /* JADX INFO: renamed from: E.c0$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {
    }

    /* JADX INFO: renamed from: E.c0$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f2970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2971b;

        public h(Uri uri, int i10) {
            this.f2970a = uri;
            this.f2971b = i10;
        }
    }

    /* JADX INFO: renamed from: E.c0$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface i {
        void a(long j10, j jVar);

        void clear();
    }

    /* JADX INFO: renamed from: E.c0$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface j {
        void a();
    }

    public C0781c0(C1128v0 c1128v0) {
        super(c1128v0);
        this.f2954r = new InterfaceC1134y0.a() { // from class: E.a0
            @Override // L.InterfaceC1134y0.a
            public final void a(InterfaceC1134y0 interfaceC1134y0) {
                C0781c0.f0(interfaceC1134y0);
            }
        };
        this.f2956t = new AtomicReference(null);
        this.f2958v = -1;
        this.f2959w = null;
        this.f2953C = new a();
        C1128v0 c1128v02 = (C1128v0) l();
        if (c1128v02.d(C1128v0.f8199Q)) {
            this.f2955s = c1128v02.e0();
        } else {
            this.f2955s = 1;
        }
        this.f2957u = c1128v02.g0(0);
        this.f2960x = P.k.g(c1128v02.j0());
    }

    public static boolean A0(L.L0 l02) {
        return Objects.equals(l02.c(C1128v0.f8203U, null), 1);
    }

    public static /* synthetic */ void e0(C0781c0 c0781c0, a1 a1Var, a1.g gVar) {
        if (c0781c0.i() == null) {
            return;
        }
        c0781c0.f2951A.pause();
        c0781c0.o0(true);
        a1.b bVarP0 = c0781c0.p0(c0781c0.k(), (C1128v0) c0781c0.l(), (e1) X0.h.g(c0781c0.g()));
        c0781c0.f2961y = bVarP0;
        c0781c0.b0(List.of(bVarP0.p()));
        c0781c0.L();
        c0781c0.f2951A.resume();
    }

    public static /* synthetic */ void f0(InterfaceC1134y0 interfaceC1134y0) {
        try {
            androidx.camera.core.d dVarAcquireLatestImage = interfaceC1134y0.acquireLatestImage();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + dVarAcquireLatestImage);
                if (dVarAcquireLatestImage != null) {
                    dVarAcquireLatestImage.close();
                }
            } finally {
            }
        } catch (IllegalStateException e10) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e10);
        }
    }

    public static /* synthetic */ Void g0(List list) {
        return null;
    }

    private void n0() {
        o0(false);
    }

    public static InterfaceC0783d0 u0(InterfaceC0815u interfaceC0815u) {
        return new d(interfaceC0815u);
    }

    public static boolean x0(List list, int i10) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    public static boolean y0(L.L0 l02) {
        return Objects.equals(l02.c(C1128v0.f8203U, null), 2);
    }

    public static boolean z0(L.L0 l02) {
        return Objects.equals(l02.c(C1128v0.f8203U, null), 3);
    }

    public boolean B0() {
        return ((Boolean) l().c(C1128v0.f8211c0, Boolean.FALSE)).booleanValue();
    }

    @Override // E.W0
    public Set C() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final boolean C0() {
        if (i() == null) {
            return false;
        }
        i().e().q(null);
        return false;
    }

    public void D0() {
        synchronized (this.f2956t) {
            try {
                if (this.f2956t.get() != null) {
                    return;
                }
                this.f2956t.set(Integer.valueOf(t0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.W0
    public s1.b E(InterfaceC1099g0 interfaceC1099g0) {
        return b.d(interfaceC1099g0);
    }

    public void E0(Rational rational) {
        this.f2959w = rational;
    }

    public final void F0() {
        G0(this.f2960x);
    }

    public final void G0(i iVar) {
        j().j(iVar);
    }

    public O7.e H0(List list) {
        M.x.b();
        return O.n.x(j().d(list, this.f2955s, this.f2957u), new InterfaceC5702a() { // from class: E.b0
            @Override // s.InterfaceC5702a
            public final Object apply(Object obj) {
                return C0781c0.g0((List) obj);
            }
        }, N.a.a());
    }

    public final void I0() {
        synchronized (this.f2956t) {
            try {
                if (this.f2956t.get() != null) {
                    return;
                }
                j().f(t0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void J0() {
        synchronized (this.f2956t) {
            try {
                Integer num = (Integer) this.f2956t.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != t0()) {
                    I0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.W0
    public void N() {
        X0.h.h(i(), "Attached camera cannot be null");
        if (t0() == 3 && r0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // E.W0
    public void O() {
        AbstractC0807p0.a("ImageCapture", "onCameraControlReady");
        I0();
        F0();
    }

    @Override // E.W0
    public s1 P(L.I i10, s1.b bVar) {
        l0(bVar);
        if (i10.k().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            L.L0 l0A = bVar.a();
            InterfaceC1099g0.a aVar = C1128v0.f8206X;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(l0A.c(aVar, bool2))) {
                AbstractC0807p0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC0807p0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.a().H(aVar, bool2);
            }
        }
        boolean zQ0 = q0(bVar.a());
        Integer num = (Integer) bVar.a().c(C1128v0.f8202T, null);
        if (num != null) {
            X0.h.b(!C0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.a().H(InterfaceC1130w0.f8213j, Integer.valueOf(zQ0 ? 35 : num.intValue()));
        } else if (y0(bVar.a())) {
            bVar.a().H(InterfaceC1130w0.f8213j, 32);
        } else if (z0(bVar.a())) {
            bVar.a().H(InterfaceC1130w0.f8213j, 32);
            bVar.a().H(InterfaceC1130w0.f8214k, 256);
        } else if (A0(bVar.a())) {
            bVar.a().H(InterfaceC1130w0.f8213j, 4101);
            bVar.a().H(InterfaceC1130w0.f8215l, J.f2793c);
        } else if (zQ0) {
            bVar.a().H(InterfaceC1130w0.f8213j, 35);
        } else {
            List list = (List) bVar.a().c(InterfaceC1132x0.f8223t, null);
            if (list == null || x0(list, 256)) {
                bVar.a().H(InterfaceC1130w0.f8213j, 256);
            } else if (x0(list, 35)) {
                bVar.a().H(InterfaceC1130w0.f8213j, 35);
            }
        }
        return bVar.b();
    }

    @Override // E.W0
    public void R() {
        h0();
    }

    @Override // E.W0
    public e1 S(InterfaceC1099g0 interfaceC1099g0) {
        this.f2961y.g(interfaceC1099g0);
        b0(List.of(this.f2961y.p()));
        return g().i().d(interfaceC1099g0).a();
    }

    @Override // E.W0
    public e1 T(e1 e1Var, e1 e1Var2) {
        AbstractC0807p0.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + e1Var + ", secondaryStreamSpec " + e1Var2);
        a1.b bVarP0 = p0(k(), (C1128v0) l(), e1Var);
        this.f2961y = bVarP0;
        b0(List.of(bVarP0.p()));
        J();
        return e1Var;
    }

    @Override // E.W0
    public void U() {
        h0();
        n0();
        G0(null);
    }

    public final void h0() {
        this.f2960x.f();
        K.X x10 = this.f2951A;
        if (x10 != null) {
            x10.b();
        }
    }

    public final void l0(s1.b bVar) {
        Set<G.b> setO = o();
        if (setO != null) {
            int iF = 0;
            for (G.b bVar2 : setO) {
                if (bVar2 instanceof I.d) {
                    iF = ((I.d) bVar2).f();
                }
            }
            bVar.a().H(C1128v0.f8203U, Integer.valueOf(iF));
        }
    }

    @Override // E.W0
    public s1 m(boolean z10, t1 t1Var) {
        c cVar = f2949D;
        InterfaceC1099g0 interfaceC1099g0A = t1Var.a(cVar.a().S(), s0());
        if (z10) {
            interfaceC1099g0A = InterfaceC1099g0.F(interfaceC1099g0A, cVar.a());
        }
        if (interfaceC1099g0A == null) {
            return null;
        }
        return E(interfaceC1099g0A).b();
    }

    public final K.F m0(int i10, Size size) {
        w0();
        return null;
    }

    public final void o0(boolean z10) {
        K.X x10;
        Log.d("ImageCapture", "clearPipeline");
        M.x.b();
        a1.c cVar = this.f2952B;
        if (cVar != null) {
            cVar.b();
            this.f2952B = null;
        }
        C0982y c0982y = this.f2962z;
        if (c0982y != null) {
            c0982y.a();
            this.f2962z = null;
        }
        if (!z10 && (x10 = this.f2951A) != null) {
            x10.b();
            this.f2951A = null;
        }
        j().b();
    }

    public final a1.b p0(String str, C1128v0 c1128v0, e1 e1Var) {
        M.x.b();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, e1Var));
        Size sizeF = e1Var.f();
        L.J jI = i();
        Objects.requireNonNull(jI);
        boolean z10 = !jI.p();
        if (this.f2962z != null) {
            X0.h.i(z10);
            this.f2962z.a();
        }
        Set setA = u0(i().b()).a();
        X0.h.b(setA.contains(Integer.valueOf(v0())), "The specified output format (" + v0() + ") is not supported by current configuration. Supported output formats: " + setA);
        CameraCharacteristics cameraCharacteristics = null;
        K.F fM0 = B0() ? m0(c1128v0.getInputFormat(), sizeF) : null;
        if (i() != null) {
            try {
                Object objH = i().i().h();
                if (objH instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objH;
                }
            } catch (Exception e10) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e10);
            }
        }
        CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
        n();
        this.f2962z = new C0982y(c1128v0, sizeF, cameraCharacteristics2, null, z10, fM0);
        if (this.f2951A == null) {
            this.f2951A = l().o().a(this.f2953C);
        }
        this.f2951A.c(this.f2962z);
        a1.b bVarF = this.f2962z.f(e1Var.f());
        bVarF.x(e1Var.g());
        if (s0() == 2 && !e1Var.h()) {
            j().a(bVarF);
        }
        if (e1Var.d() != null) {
            bVarF.g(e1Var.d());
        }
        a1.c cVar = this.f2952B;
        if (cVar != null) {
            cVar.b();
        }
        a1.c cVar2 = new a1.c(new a1.d() { // from class: E.Z
            @Override // L.a1.d
            public final void a(a1 a1Var, a1.g gVar) {
                C0781c0.e0(this.f2940a, a1Var, gVar);
            }
        });
        this.f2952B = cVar2;
        bVarF.r(cVar2);
        return bVarF;
    }

    public boolean q0(L.L0 l02) {
        boolean z10;
        Boolean bool = Boolean.TRUE;
        InterfaceC1099g0.a aVar = C1128v0.f8206X;
        Boolean bool2 = Boolean.FALSE;
        boolean z11 = false;
        if (bool.equals(l02.c(aVar, bool2))) {
            if (C0()) {
                AbstractC0807p0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            } else {
                z10 = true;
            }
            Integer num = (Integer) l02.c(C1128v0.f8202T, null);
            if (num == null || num.intValue() == 256) {
                z11 = z10;
            } else {
                AbstractC0807p0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z11) {
                AbstractC0807p0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                l02.H(aVar, bool2);
            }
        }
        return z11;
    }

    public final int r0() {
        L.J jI = i();
        if (jI != null) {
            return jI.b().f();
        }
        return -1;
    }

    public int s0() {
        return this.f2955s;
    }

    public int t0() {
        int iF0;
        synchronized (this.f2956t) {
            iF0 = this.f2958v;
            if (iF0 == -1) {
                iF0 = ((C1128v0) l()).f0(2);
            }
        }
        return iF0;
    }

    public String toString() {
        return "ImageCapture:" + r();
    }

    public int v0() {
        return ((Integer) X0.h.g((Integer) l().c(C1128v0.f8203U, 0))).intValue();
    }

    public final c1 w0() {
        i().e().q(null);
        return null;
    }

    /* JADX INFO: renamed from: E.c0$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {
        public void b() {
        }

        public void a(int i10) {
        }

        public void c(androidx.camera.core.d dVar) {
        }

        public void d(C0785e0 c0785e0) {
        }

        public void e(Bitmap bitmap) {
        }
    }
}
