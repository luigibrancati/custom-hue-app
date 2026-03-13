package Y0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f19609b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f19610a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends b {
        public c() {
        }

        @Override // Y0.S.f
        public void c(int i10, O0.b bVar) {
            this.f19612c.setInsets(p.a(i10), bVar.d());
        }

        public c(S s10) {
            super(s10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends c {
        public d() {
        }

        public d(S s10) {
            super(s10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends d {
        public e() {
        }

        @Override // Y0.S.c, Y0.S.f
        public void c(int i10, O0.b bVar) {
            this.f19612c.setInsets(q.a(i10), bVar.d());
        }

        public e(S s10) {
            super(s10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f19613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public O0.b[] f19614b;

        public f() {
            this(new S((S) null));
        }

        public final void a() {
            O0.b[] bVarArr = this.f19614b;
            if (bVarArr != null) {
                O0.b bVarF = bVarArr[o.d(1)];
                O0.b bVarF2 = this.f19614b[o.d(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f19613a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f19613a.f(1);
                }
                g(O0.b.a(bVarF, bVarF2));
                O0.b bVar = this.f19614b[o.d(16)];
                if (bVar != null) {
                    f(bVar);
                }
                O0.b bVar2 = this.f19614b[o.d(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                O0.b bVar3 = this.f19614b[o.d(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        public abstract S b();

        public abstract void c(int i10, O0.b bVar);

        public abstract void d(O0.b bVar);

        public abstract void e(O0.b bVar);

        public abstract void f(O0.b bVar);

        public abstract void g(O0.b bVar);

        public abstract void h(O0.b bVar);

        public f(S s10) {
            this.f19613a = s10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends h {
        public i(S s10, WindowInsets windowInsets) {
            super(s10, windowInsets);
        }

        @Override // Y0.S.n
        public S a() {
            return S.v(this.f19615c.consumeDisplayCutout());
        }

        @Override // Y0.S.g, Y0.S.n
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f19615c, iVar.f19615c) && Objects.equals(this.f19619g, iVar.f19619g) && g.z(this.f19620h, iVar.f19620h);
        }

        @Override // Y0.S.n
        public C2553g f() {
            return C2553g.e(this.f19615c.getDisplayCutout());
        }

        @Override // Y0.S.n
        public int hashCode() {
            return this.f19615c.hashCode();
        }

        public i(S s10, i iVar) {
            super(s10, iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final S f19625m = S.v(WindowInsets.CONSUMED);

        public k(S s10, WindowInsets windowInsets) {
            super(s10, windowInsets);
        }

        @Override // Y0.S.g, Y0.S.n
        public O0.b g(int i10) {
            return O0.b.c(this.f19615c.getInsets(p.a(i10)));
        }

        @Override // Y0.S.g, Y0.S.n
        public boolean p(int i10) {
            return this.f19615c.isVisible(p.a(i10));
        }

        public k(S s10, k kVar) {
            super(s10, kVar);
        }

        @Override // Y0.S.g, Y0.S.n
        public final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l extends k {
        public l(S s10, WindowInsets windowInsets) {
            super(s10, windowInsets);
        }

        public l(S s10, l lVar) {
            super(s10, lVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class m extends l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final S f19626n = S.v(WindowInsets.CONSUMED);

        public m(S s10, WindowInsets windowInsets) {
            super(s10, windowInsets);
        }

        @Override // Y0.S.k, Y0.S.g, Y0.S.n
        public O0.b g(int i10) {
            return O0.b.c(this.f19615c.getInsets(q.a(i10)));
        }

        @Override // Y0.S.k, Y0.S.g, Y0.S.n
        public boolean p(int i10) {
            return this.f19615c.isVisible(q.a(i10));
        }

        public m(S s10, m mVar) {
            super(s10, mVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class o {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 519;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class p {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class q {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f19609b = m.f19626n;
        } else {
            f19609b = k.f19625m;
        }
    }

    public S(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.f19610a = new m(this, windowInsets);
        } else {
            this.f19610a = new l(this, windowInsets);
        }
    }

    public static O0.b m(O0.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f10746a - i10);
        int iMax2 = Math.max(0, bVar.f10747b - i11);
        int iMax3 = Math.max(0, bVar.f10748c - i12);
        int iMax4 = Math.max(0, bVar.f10749d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : O0.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static S v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static S w(WindowInsets windowInsets, View view) {
        S s10 = new S((WindowInsets) X0.h.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            s10.s(E.B(view));
            s10.d(view.getRootView());
            s10.t(view.getWindowSystemUiVisibility());
        }
        return s10;
    }

    public S a() {
        return this.f19610a.a();
    }

    public S b() {
        return this.f19610a.b();
    }

    public S c() {
        return this.f19610a.c();
    }

    public void d(View view) {
        this.f19610a.d(view);
    }

    public C2553g e() {
        return this.f19610a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S) {
            return X0.c.a(this.f19610a, ((S) obj).f19610a);
        }
        return false;
    }

    public O0.b f(int i10) {
        return this.f19610a.g(i10);
    }

    public O0.b g() {
        return this.f19610a.i();
    }

    public int h() {
        return this.f19610a.k().f10749d;
    }

    public int hashCode() {
        n nVar = this.f19610a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public int i() {
        return this.f19610a.k().f10746a;
    }

    public int j() {
        return this.f19610a.k().f10748c;
    }

    public int k() {
        return this.f19610a.k().f10747b;
    }

    public S l(int i10, int i11, int i12, int i13) {
        return this.f19610a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f19610a.n();
    }

    public boolean o(int i10) {
        return this.f19610a.p(i10);
    }

    public S p(int i10, int i11, int i12, int i13) {
        return new a(this).d(O0.b.b(i10, i11, i12, i13)).a();
    }

    public void q(O0.b[] bVarArr) {
        this.f19610a.q(bVarArr);
    }

    public void r(O0.b bVar) {
        this.f19610a.r(bVar);
    }

    public void s(S s10) {
        this.f19610a.s(s10);
    }

    public void t(int i10) {
        this.f19610a.t(i10);
    }

    public WindowInsets u() {
        n nVar = this.f19610a;
        if (nVar instanceof g) {
            return ((g) nVar).f19615c;
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f19612c;

        public b() {
            this.f19612c = new WindowInsets.Builder();
        }

        @Override // Y0.S.f
        public S b() {
            a();
            S sV = S.v(this.f19612c.build());
            sV.q(this.f19614b);
            return sV;
        }

        @Override // Y0.S.f
        public void d(O0.b bVar) {
            this.f19612c.setMandatorySystemGestureInsets(bVar.d());
        }

        @Override // Y0.S.f
        public void e(O0.b bVar) {
            this.f19612c.setStableInsets(bVar.d());
        }

        @Override // Y0.S.f
        public void f(O0.b bVar) {
            this.f19612c.setSystemGestureInsets(bVar.d());
        }

        @Override // Y0.S.f
        public void g(O0.b bVar) {
            this.f19612c.setSystemWindowInsets(bVar.d());
        }

        @Override // Y0.S.f
        public void h(O0.b bVar) {
            this.f19612c.setTappableElementInsets(bVar.d());
        }

        public b(S s10) {
            WindowInsets.Builder builder;
            super(s10);
            WindowInsets windowInsetsU = s10.u();
            if (windowInsetsU != null) {
                builder = new WindowInsets.Builder(windowInsetsU);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f19612c = builder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public O0.b f19621i;

        public h(S s10, WindowInsets windowInsets) {
            super(s10, windowInsets);
            this.f19621i = null;
        }

        @Override // Y0.S.n
        public S b() {
            return S.v(this.f19615c.consumeStableInsets());
        }

        @Override // Y0.S.n
        public S c() {
            return S.v(this.f19615c.consumeSystemWindowInsets());
        }

        @Override // Y0.S.n
        public final O0.b i() {
            if (this.f19621i == null) {
                this.f19621i = O0.b.b(this.f19615c.getStableInsetLeft(), this.f19615c.getStableInsetTop(), this.f19615c.getStableInsetRight(), this.f19615c.getStableInsetBottom());
            }
            return this.f19621i;
        }

        @Override // Y0.S.n
        public boolean n() {
            return this.f19615c.isConsumed();
        }

        public h(S s10, h hVar) {
            super(s10, hVar);
            this.f19621i = null;
            this.f19621i = hVar.f19621i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f19615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public O0.b[] f19616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public O0.b f19617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public S f19618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public O0.b f19619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19620h;

        public g(S s10, WindowInsets windowInsets) {
            super(s10);
            this.f19617e = null;
            this.f19615c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private O0.b u(int i10, boolean z10) {
            O0.b bVarA = O0.b.f10745e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = O0.b.a(bVarA, v(i11, z10));
                }
            }
            return bVarA;
        }

        private O0.b w() {
            S s10 = this.f19618f;
            return s10 != null ? s10.g() : O0.b.f10745e;
        }

        private O0.b x(View view) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public static boolean z(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        @Override // Y0.S.n
        public void d(View view) {
            O0.b bVarX = x(view);
            if (bVarX == null) {
                bVarX = O0.b.f10745e;
            }
            r(bVarX);
        }

        @Override // Y0.S.n
        public void e(S s10) {
            s10.s(this.f19618f);
            s10.r(this.f19619g);
            s10.t(this.f19620h);
        }

        @Override // Y0.S.n
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f19619g, gVar.f19619g) && z(this.f19620h, gVar.f19620h);
        }

        @Override // Y0.S.n
        public O0.b g(int i10) {
            return u(i10, false);
        }

        @Override // Y0.S.n
        public final O0.b k() {
            if (this.f19617e == null) {
                this.f19617e = O0.b.b(this.f19615c.getSystemWindowInsetLeft(), this.f19615c.getSystemWindowInsetTop(), this.f19615c.getSystemWindowInsetRight(), this.f19615c.getSystemWindowInsetBottom());
            }
            return this.f19617e;
        }

        @Override // Y0.S.n
        public S m(int i10, int i11, int i12, int i13) {
            a aVar = new a(S.v(this.f19615c));
            aVar.d(S.m(k(), i10, i11, i12, i13));
            aVar.c(S.m(i(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // Y0.S.n
        public boolean o() {
            return this.f19615c.isRound();
        }

        @Override // Y0.S.n
        @SuppressLint({"WrongConstant"})
        public boolean p(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !y(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // Y0.S.n
        public void q(O0.b[] bVarArr) {
            this.f19616d = bVarArr;
        }

        @Override // Y0.S.n
        public void r(O0.b bVar) {
            this.f19619g = bVar;
        }

        @Override // Y0.S.n
        public void s(S s10) {
            this.f19618f = s10;
        }

        @Override // Y0.S.n
        public void t(int i10) {
            this.f19620h = i10;
        }

        public O0.b v(int i10, boolean z10) {
            O0.b bVarG;
            int i11;
            if (i10 == 1) {
                return z10 ? O0.b.b(0, Math.max(w().f10747b, k().f10747b), 0, 0) : (this.f19620h & 4) != 0 ? O0.b.f10745e : O0.b.b(0, k().f10747b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    O0.b bVarW = w();
                    O0.b bVarI = i();
                    return O0.b.b(Math.max(bVarW.f10746a, bVarI.f10746a), 0, Math.max(bVarW.f10748c, bVarI.f10748c), Math.max(bVarW.f10749d, bVarI.f10749d));
                }
                if ((this.f19620h & 2) != 0) {
                    return O0.b.f10745e;
                }
                O0.b bVarK = k();
                S s10 = this.f19618f;
                bVarG = s10 != null ? s10.g() : null;
                int iMin = bVarK.f10749d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f10749d);
                }
                return O0.b.b(bVarK.f10746a, 0, bVarK.f10748c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return O0.b.f10745e;
                }
                S s11 = this.f19618f;
                C2553g c2553gE = s11 != null ? s11.e() : f();
                return c2553gE != null ? O0.b.b(c2553gE.b(), c2553gE.d(), c2553gE.c(), c2553gE.a()) : O0.b.f10745e;
            }
            O0.b[] bVarArr = this.f19616d;
            bVarG = bVarArr != null ? bVarArr[o.d(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            O0.b bVarK2 = k();
            O0.b bVarW2 = w();
            int i12 = bVarK2.f10749d;
            if (i12 > bVarW2.f10749d) {
                return O0.b.b(0, 0, 0, i12);
            }
            O0.b bVar = this.f19619g;
            return (bVar == null || bVar.equals(O0.b.f10745e) || (i11 = this.f19619g.f10749d) <= bVarW2.f10749d) ? O0.b.f10745e : O0.b.b(0, 0, 0, i11);
        }

        public boolean y(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !v(i10, false).equals(O0.b.f10745e);
        }

        public g(S s10, g gVar) {
            this(s10, new WindowInsets(gVar.f19615c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f19611a;

        public a() {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f19611a = new e();
            } else {
                this.f19611a = new d();
            }
        }

        public S a() {
            return this.f19611a.b();
        }

        public a b(int i10, O0.b bVar) {
            this.f19611a.c(i10, bVar);
            return this;
        }

        public a c(O0.b bVar) {
            this.f19611a.e(bVar);
            return this;
        }

        public a d(O0.b bVar) {
            this.f19611a.g(bVar);
            return this;
        }

        public a(S s10) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f19611a = new e(s10);
            } else {
                this.f19611a = new d(s10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends i {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public O0.b f19622j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public O0.b f19623k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public O0.b f19624l;

        public j(S s10, WindowInsets windowInsets) {
            super(s10, windowInsets);
            this.f19622j = null;
            this.f19623k = null;
            this.f19624l = null;
        }

        @Override // Y0.S.n
        public O0.b h() {
            if (this.f19623k == null) {
                this.f19623k = O0.b.c(this.f19615c.getMandatorySystemGestureInsets());
            }
            return this.f19623k;
        }

        @Override // Y0.S.n
        public O0.b j() {
            if (this.f19622j == null) {
                this.f19622j = O0.b.c(this.f19615c.getSystemGestureInsets());
            }
            return this.f19622j;
        }

        @Override // Y0.S.n
        public O0.b l() {
            if (this.f19624l == null) {
                this.f19624l = O0.b.c(this.f19615c.getTappableElementInsets());
            }
            return this.f19624l;
        }

        @Override // Y0.S.g, Y0.S.n
        public S m(int i10, int i11, int i12, int i13) {
            return S.v(this.f19615c.inset(i10, i11, i12, i13));
        }

        public j(S s10, j jVar) {
            super(s10, jVar);
            this.f19622j = null;
            this.f19623k = null;
            this.f19624l = null;
        }
    }

    public S(S s10) {
        if (s10 != null) {
            n nVar = s10.f19610a;
            if (Build.VERSION.SDK_INT >= 34 && (nVar instanceof m)) {
                this.f19610a = new m(this, (m) nVar);
            } else if (nVar instanceof l) {
                this.f19610a = new l(this, (l) nVar);
            } else if (nVar instanceof k) {
                this.f19610a = new k(this, (k) nVar);
            } else if (nVar instanceof j) {
                this.f19610a = new j(this, (j) nVar);
            } else if (nVar instanceof i) {
                this.f19610a = new i(this, (i) nVar);
            } else if (nVar instanceof h) {
                this.f19610a = new h(this, (h) nVar);
            } else if (nVar instanceof g) {
                this.f19610a = new g(this, (g) nVar);
            } else {
                this.f19610a = new n(this);
            }
            nVar.e(this);
            return;
        }
        this.f19610a = new n(this);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final S f19627b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f19628a;

        public n(S s10) {
            this.f19628a = s10;
        }

        public S a() {
            return this.f19628a;
        }

        public S b() {
            return this.f19628a;
        }

        public S c() {
            return this.f19628a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return o() == nVar.o() && n() == nVar.n() && X0.c.a(k(), nVar.k()) && X0.c.a(i(), nVar.i()) && X0.c.a(f(), nVar.f());
        }

        public C2553g f() {
            return null;
        }

        public O0.b g(int i10) {
            return O0.b.f10745e;
        }

        public O0.b h() {
            return k();
        }

        public int hashCode() {
            return X0.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public O0.b i() {
            return O0.b.f10745e;
        }

        public O0.b j() {
            return k();
        }

        public O0.b k() {
            return O0.b.f10745e;
        }

        public O0.b l() {
            return k();
        }

        public S m(int i10, int i11, int i12, int i13) {
            return f19627b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public boolean p(int i10) {
            return true;
        }

        public void d(View view) {
        }

        public void e(S s10) {
        }

        public void q(O0.b[] bVarArr) {
        }

        public void r(O0.b bVar) {
        }

        public void s(S s10) {
        }

        public void t(int i10) {
        }
    }
}
