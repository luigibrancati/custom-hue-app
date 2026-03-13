package d2;

import D1.C0744b;
import D1.E;
import D1.F;
import G1.AbstractC0853a;
import K1.e1;
import K1.f1;
import K1.g1;
import K7.AbstractC1074n;
import K7.AbstractC1081v;
import K7.M;
import M1.D;
import a2.InterfaceC2611D;
import a2.n0;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C3807a;
import d2.n;
import d2.r;
import d2.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class n extends u implements f1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f32838l = M.b(new Comparator() { // from class: d2.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f32840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r.b f32841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f32842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f32843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f32844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0744b f32845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f32846k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f32848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f32849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e f32850h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f32851i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f32852j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f32853k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f32854l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f32855m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f32856n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f32857o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f32858p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f32859q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f32860r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f32861s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f32862t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f32863u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f32864v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f32865w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f32866x;

        public b(int i10, E e10, int i11, e eVar, int i12, boolean z10, J7.o oVar, int i13) {
            int i14;
            int iF;
            int iF2;
            super(i10, e10, i11);
            this.f32850h = eVar;
            int i15 = eVar.f32907y0 ? 24 : 16;
            this.f32855m = eVar.f32903u0 && (i13 & i15) != 0;
            this.f32849g = n.R(this.f32944d.f1794d);
            this.f32851i = f1.l(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f1552p.size()) {
                    iF = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iF = n.F(this.f32944d, (String) eVar.f1552p.get(i16), false);
                    if (iF > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f32853k = i16;
            this.f32852j = iF;
            this.f32854l = n.I(this.f32944d.f1796f, eVar.f1553q);
            D1.o oVar2 = this.f32944d;
            int i17 = oVar2.f1796f;
            this.f32856n = i17 == 0 || (i17 & 1) != 0;
            this.f32859q = (oVar2.f1795e & 1) != 0;
            this.f32866x = n.M(oVar2);
            D1.o oVar3 = this.f32944d;
            int i18 = oVar3.f1780G;
            this.f32860r = i18;
            this.f32861s = oVar3.f1781H;
            int i19 = oVar3.f1800j;
            this.f32862t = i19;
            this.f32848f = (i19 == -1 || i19 <= eVar.f1555s) && (i18 == -1 || i18 <= eVar.f1554r) && oVar.apply(oVar3);
            String[] strArrP0 = G1.M.p0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrP0.length) {
                    iF2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    iF2 = n.F(this.f32944d, strArrP0[i20], false);
                    if (iF2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f32857o = i20;
            this.f32858p = iF2;
            int i21 = 0;
            while (true) {
                if (i21 < eVar.f1556t.size()) {
                    String str = this.f32944d.f1805o;
                    if (str != null && str.equals(eVar.f1556t.get(i21))) {
                        i14 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f32863u = i14;
            this.f32864v = f1.k(i12) == 128;
            this.f32865w = f1.F(i12) == 64;
            this.f32847e = s(i12, z10, i15);
        }

        public static int j(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC1081v q(int i10, E e10, e eVar, int[] iArr, boolean z10, J7.o oVar, int i11) {
            AbstractC1081v.a aVarR = AbstractC1081v.r();
            for (int i12 = 0; i12 < e10.f1491a; i12++) {
                aVarR.a(new b(i10, e10, i12, eVar, iArr[i12], z10, oVar, i11));
            }
            return aVarR.k();
        }

        @Override // d2.n.i
        public int a() {
            return this.f32847e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            M mG = (this.f32848f && this.f32851i) ? n.f32838l : n.f32838l.g();
            AbstractC1074n abstractC1074nF = AbstractC1074n.j().g(this.f32851i, bVar.f32851i).f(Integer.valueOf(this.f32853k), Integer.valueOf(bVar.f32853k), M.d().g()).d(this.f32852j, bVar.f32852j).d(this.f32854l, bVar.f32854l).g(this.f32859q, bVar.f32859q).g(this.f32856n, bVar.f32856n).f(Integer.valueOf(this.f32857o), Integer.valueOf(bVar.f32857o), M.d().g()).d(this.f32858p, bVar.f32858p).g(this.f32848f, bVar.f32848f).f(Integer.valueOf(this.f32863u), Integer.valueOf(bVar.f32863u), M.d().g());
            if (this.f32850h.f1533B) {
                abstractC1074nF = abstractC1074nF.f(Integer.valueOf(this.f32862t), Integer.valueOf(bVar.f32862t), n.f32838l.g());
            }
            AbstractC1074n abstractC1074nF2 = abstractC1074nF.g(this.f32864v, bVar.f32864v).g(this.f32865w, bVar.f32865w).g(this.f32866x, bVar.f32866x).f(Integer.valueOf(this.f32860r), Integer.valueOf(bVar.f32860r), mG).f(Integer.valueOf(this.f32861s), Integer.valueOf(bVar.f32861s), mG);
            if (Objects.equals(this.f32849g, bVar.f32849g)) {
                abstractC1074nF2 = abstractC1074nF2.f(Integer.valueOf(this.f32862t), Integer.valueOf(bVar.f32862t), mG);
            }
            return abstractC1074nF2.i();
        }

        public final int s(int i10, boolean z10, int i11) {
            if (!f1.l(i10, this.f32850h.f32892A0)) {
                return 0;
            }
            if (!this.f32848f && !this.f32850h.f32902t0) {
                return 0;
            }
            e eVar = this.f32850h;
            if (eVar.f1557u.f1567a == 2 && !n.S(eVar, i10, this.f32944d)) {
                return 0;
            }
            if (!f1.l(i10, false) || !this.f32848f || this.f32944d.f1800j == -1) {
                return 1;
            }
            e eVar2 = this.f32850h;
            if (eVar2.f1534C || eVar2.f1533B) {
                return 1;
            }
            return ((!eVar2.f32894C0 && z10) || eVar2.f1557u.f1567a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // d2.n.i
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f32850h.f32905w0 && ((i11 = this.f32944d.f1780G) == -1 || i11 != bVar.f32944d.f1780G)) {
                return false;
            }
            if (!this.f32855m && ((str = this.f32944d.f1805o) == null || !TextUtils.equals(str, bVar.f32944d.f1805o))) {
                return false;
            }
            e eVar = this.f32850h;
            if (!eVar.f32904v0 && ((i10 = this.f32944d.f1781H) == -1 || i10 != bVar.f32944d.f1781H)) {
                return false;
            }
            if (eVar.f32906x0) {
                return true;
            }
            return this.f32864v == bVar.f32864v && this.f32865w == bVar.f32865w;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends i implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f32868f;

        public c(int i10, E e10, int i11, e eVar, int i12) {
            super(i10, e10, i11);
            this.f32867e = f1.l(i12, eVar.f32892A0) ? 1 : 0;
            this.f32868f = this.f32944d.e();
        }

        public static int j(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static AbstractC1081v q(int i10, E e10, e eVar, int[] iArr) {
            AbstractC1081v.a aVarR = AbstractC1081v.r();
            for (int i11 = 0; i11 < e10.f1491a; i11++) {
                aVarR.a(new c(i10, e10, i11, eVar, iArr[i11]));
            }
            return aVarR.k();
        }

        @Override // d2.n.i
        public int a() {
            return this.f32867e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f32868f, cVar.f32868f);
        }

        @Override // d2.n.i
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f32869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32870b;

        public d(D1.o oVar, int i10) {
            this.f32869a = (oVar.f1795e & 1) != 0;
            this.f32870b = f1.l(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return AbstractC1074n.j().g(this.f32870b, dVar.f32870b).g(this.f32869a, dVar.f32869a).i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends F {

        /* JADX INFO: renamed from: G0, reason: collision with root package name */
        public static final e f32871G0;

        /* JADX INFO: renamed from: H0, reason: collision with root package name */
        public static final e f32872H0;

        /* JADX INFO: renamed from: I0, reason: collision with root package name */
        public static final String f32873I0;

        /* JADX INFO: renamed from: J0, reason: collision with root package name */
        public static final String f32874J0;

        /* JADX INFO: renamed from: K0, reason: collision with root package name */
        public static final String f32875K0;

        /* JADX INFO: renamed from: L0, reason: collision with root package name */
        public static final String f32876L0;

        /* JADX INFO: renamed from: M0, reason: collision with root package name */
        public static final String f32877M0;

        /* JADX INFO: renamed from: N0, reason: collision with root package name */
        public static final String f32878N0;

        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        public static final String f32879O0;

        /* JADX INFO: renamed from: P0, reason: collision with root package name */
        public static final String f32880P0;

        /* JADX INFO: renamed from: Q0, reason: collision with root package name */
        public static final String f32881Q0;

        /* JADX INFO: renamed from: R0, reason: collision with root package name */
        public static final String f32882R0;

        /* JADX INFO: renamed from: S0, reason: collision with root package name */
        public static final String f32883S0;

        /* JADX INFO: renamed from: T0, reason: collision with root package name */
        public static final String f32884T0;

        /* JADX INFO: renamed from: U0, reason: collision with root package name */
        public static final String f32885U0;

        /* JADX INFO: renamed from: V0, reason: collision with root package name */
        public static final String f32886V0;

        /* JADX INFO: renamed from: W0, reason: collision with root package name */
        public static final String f32887W0;

        /* JADX INFO: renamed from: X0, reason: collision with root package name */
        public static final String f32888X0;

        /* JADX INFO: renamed from: Y0, reason: collision with root package name */
        public static final String f32889Y0;

        /* JADX INFO: renamed from: Z0, reason: collision with root package name */
        public static final String f32890Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final String f32891a1;

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public final boolean f32892A0;

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public final boolean f32893B0;

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public final boolean f32894C0;

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public final boolean f32895D0;

        /* JADX INFO: renamed from: E0, reason: collision with root package name */
        public final SparseArray f32896E0;

        /* JADX INFO: renamed from: F0, reason: collision with root package name */
        public final SparseBooleanArray f32897F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f32898p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f32899q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f32900r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f32901s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f32902t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f32903u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f32904v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f32905w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f32906x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f32907y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final boolean f32908z0;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends F.c {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            public boolean f32909F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            public boolean f32910G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            public boolean f32911H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            public boolean f32912I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            public boolean f32913J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            public boolean f32914K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            public boolean f32915L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            public boolean f32916M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            public boolean f32917N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public boolean f32918O;

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            public boolean f32919P;

            /* JADX INFO: renamed from: Q, reason: collision with root package name */
            public boolean f32920Q;

            /* JADX INFO: renamed from: R, reason: collision with root package name */
            public boolean f32921R;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            public boolean f32922S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            public boolean f32923T;

            /* JADX INFO: renamed from: U, reason: collision with root package name */
            public final SparseArray f32924U;

            /* JADX INFO: renamed from: V, reason: collision with root package name */
            public final SparseBooleanArray f32925V;

            public static SparseArray a0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            @Override // D1.F.c
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public e F() {
                return new e(this);
            }

            public final void b0() {
                this.f32909F = true;
                this.f32910G = false;
                this.f32911H = true;
                this.f32912I = false;
                this.f32913J = true;
                this.f32914K = false;
                this.f32915L = false;
                this.f32916M = false;
                this.f32917N = false;
                this.f32918O = true;
                this.f32919P = true;
                this.f32920Q = true;
                this.f32921R = false;
                this.f32922S = true;
                this.f32923T = false;
            }

            public a c0(F f10) {
                super.H(f10);
                return this;
            }

            public a() {
                this.f32924U = new SparseArray();
                this.f32925V = new SparseBooleanArray();
                b0();
            }

            public a(e eVar) {
                super(eVar);
                this.f32909F = eVar.f32898p0;
                this.f32910G = eVar.f32899q0;
                this.f32911H = eVar.f32900r0;
                this.f32912I = eVar.f32901s0;
                this.f32913J = eVar.f32902t0;
                this.f32914K = eVar.f32903u0;
                this.f32915L = eVar.f32904v0;
                this.f32916M = eVar.f32905w0;
                this.f32917N = eVar.f32906x0;
                this.f32918O = eVar.f32907y0;
                this.f32919P = eVar.f32908z0;
                this.f32920Q = eVar.f32892A0;
                this.f32921R = eVar.f32893B0;
                this.f32922S = eVar.f32894C0;
                this.f32923T = eVar.f32895D0;
                this.f32924U = a0(eVar.f32896E0);
                this.f32925V = eVar.f32897F0.clone();
            }
        }

        static {
            e eVarF = new a().F();
            f32871G0 = eVarF;
            f32872H0 = eVarF;
            f32873I0 = G1.M.z0(1000);
            f32874J0 = G1.M.z0(1001);
            f32875K0 = G1.M.z0(1002);
            f32876L0 = G1.M.z0(1003);
            f32877M0 = G1.M.z0(1004);
            f32878N0 = G1.M.z0(1005);
            f32879O0 = G1.M.z0(1006);
            f32880P0 = G1.M.z0(1007);
            f32881Q0 = G1.M.z0(1008);
            f32882R0 = G1.M.z0(1009);
            f32883S0 = G1.M.z0(1010);
            f32884T0 = G1.M.z0(1011);
            f32885U0 = G1.M.z0(1012);
            f32886V0 = G1.M.z0(1013);
            f32887W0 = G1.M.z0(1014);
            f32888X0 = G1.M.z0(1015);
            f32889Y0 = G1.M.z0(1016);
            f32890Z0 = G1.M.z0(1017);
            f32891a1 = G1.M.z0(1018);
        }

        public static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !e((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                n0 n0Var = (n0) entry.getKey();
                if (!map2.containsKey(n0Var) || !Objects.equals(entry.getValue(), map2.get(n0Var))) {
                    return false;
                }
            }
            return true;
        }

        @Override // D1.F
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f32898p0 == eVar.f32898p0 && this.f32899q0 == eVar.f32899q0 && this.f32900r0 == eVar.f32900r0 && this.f32901s0 == eVar.f32901s0 && this.f32902t0 == eVar.f32902t0 && this.f32903u0 == eVar.f32903u0 && this.f32904v0 == eVar.f32904v0 && this.f32905w0 == eVar.f32905w0 && this.f32906x0 == eVar.f32906x0 && this.f32907y0 == eVar.f32907y0 && this.f32908z0 == eVar.f32908z0 && this.f32892A0 == eVar.f32892A0 && this.f32893B0 == eVar.f32893B0 && this.f32894C0 == eVar.f32894C0 && this.f32895D0 == eVar.f32895D0 && c(this.f32897F0, eVar.f32897F0) && d(this.f32896E0, eVar.f32896E0)) {
                    return true;
                }
            }
            return false;
        }

        public a f() {
            return new a();
        }

        public boolean g(int i10) {
            return this.f32897F0.get(i10);
        }

        public f h(int i10, n0 n0Var) {
            Map map = (Map) this.f32896E0.get(i10);
            if (map != null) {
                android.support.v4.media.session.a.a(map.get(n0Var));
            }
            return null;
        }

        @Override // D1.F
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f32898p0 ? 1 : 0)) * 31) + (this.f32899q0 ? 1 : 0)) * 31) + (this.f32900r0 ? 1 : 0)) * 31) + (this.f32901s0 ? 1 : 0)) * 31) + (this.f32902t0 ? 1 : 0)) * 31) + (this.f32903u0 ? 1 : 0)) * 31) + (this.f32904v0 ? 1 : 0)) * 31) + (this.f32905w0 ? 1 : 0)) * 31) + (this.f32906x0 ? 1 : 0)) * 31) + (this.f32907y0 ? 1 : 0)) * 31) + (this.f32908z0 ? 1 : 0)) * 31) + (this.f32892A0 ? 1 : 0)) * 31) + (this.f32893B0 ? 1 : 0)) * 31) + (this.f32894C0 ? 1 : 0)) * 31) + (this.f32895D0 ? 1 : 0);
        }

        public boolean i(int i10, n0 n0Var) {
            Map map = (Map) this.f32896E0.get(i10);
            return map != null && map.containsKey(n0Var);
        }

        public e(a aVar) {
            super(aVar);
            this.f32898p0 = aVar.f32909F;
            this.f32899q0 = aVar.f32910G;
            this.f32900r0 = aVar.f32911H;
            this.f32901s0 = aVar.f32912I;
            this.f32902t0 = aVar.f32913J;
            this.f32903u0 = aVar.f32914K;
            this.f32904v0 = aVar.f32915L;
            this.f32905w0 = aVar.f32916M;
            this.f32906x0 = aVar.f32917N;
            this.f32907y0 = aVar.f32918O;
            this.f32908z0 = aVar.f32919P;
            this.f32892A0 = aVar.f32920Q;
            this.f32893B0 = aVar.f32921R;
            this.f32894C0 = aVar.f32922S;
            this.f32895D0 = aVar.f32923T;
            this.f32896E0 = aVar.f32924U;
            this.f32897F0 = aVar.f32925V;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f32926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f32928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Spatializer$OnSpatializerStateChangedListener f32929d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f32930a;

            public a(n nVar) {
                this.f32930a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f32930a.P();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f32930a.P();
            }
        }

        public g(Context context, n nVar, Boolean bool) {
            AudioManager audioManagerC = context == null ? null : E1.c.c(context);
            if (audioManagerC == null || (bool != null && bool.booleanValue())) {
                this.f32926a = null;
                this.f32927b = false;
                this.f32928c = null;
                this.f32929d = null;
                return;
            }
            Spatializer spatializer = audioManagerC.getSpatializer();
            this.f32926a = spatializer;
            this.f32927b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(nVar);
            this.f32929d = aVar;
            Handler handler = new Handler((Looper) AbstractC0853a.i(Looper.myLooper()));
            this.f32928c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new D(handler), aVar);
        }

        public boolean a(C0744b c0744b, D1.o oVar) {
            int i10;
            if (Objects.equals(oVar.f1805o, "audio/eac3-joc")) {
                i10 = oVar.f1780G;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(oVar.f1805o, "audio/iamf")) {
                i10 = oVar.f1780G;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(oVar.f1805o, "audio/ac4")) {
                i10 = oVar.f1780G;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = oVar.f1780G;
            }
            int iM = G1.M.M(i10);
            if (iM == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM);
            int i11 = oVar.f1781H;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return o.a(AbstractC0853a.e(this.f32926a)).canBeSpatialized(c0744b.a().f1674a, channelMask.build());
        }

        public boolean b() {
            return o.a(AbstractC0853a.e(this.f32926a)).isAvailable();
        }

        public boolean c() {
            return o.a(AbstractC0853a.e(this.f32926a)).isEnabled();
        }

        public boolean d() {
            return this.f32927b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f32926a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f32929d) == null || this.f32928c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f32928c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends i implements Comparable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f32933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f32934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32935h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f32936i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f32937j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f32938k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f32939l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f32940m;

        public h(int i10, E e10, int i11, e eVar, int i12, String str, String str2) {
            int iF;
            super(i10, e10, i11);
            int i13 = 0;
            this.f32933f = f1.l(i12, false);
            int i14 = this.f32944d.f1795e & (~eVar.f1561y);
            this.f32934g = (i14 & 1) != 0;
            this.f32935h = (i14 & 2) != 0;
            AbstractC1081v abstractC1081vA = str2 != null ? AbstractC1081v.A(str2) : eVar.f1558v.isEmpty() ? AbstractC1081v.A("") : eVar.f1558v;
            int i15 = 0;
            while (true) {
                if (i15 >= abstractC1081vA.size()) {
                    i15 = Integer.MAX_VALUE;
                    iF = 0;
                    break;
                } else {
                    iF = n.F(this.f32944d, (String) abstractC1081vA.get(i15), eVar.f1562z);
                    if (iF > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f32936i = i15;
            this.f32937j = iF;
            int I10 = n.I(this.f32944d.f1796f, str2 != null ? 1088 : eVar.f1559w);
            this.f32938k = I10;
            this.f32940m = (1088 & this.f32944d.f1796f) != 0;
            int iF2 = n.F(this.f32944d, str, n.R(str) == null);
            this.f32939l = iF2;
            boolean z10 = iF > 0 || (eVar.f1558v.isEmpty() && I10 > 0) || this.f32934g || (this.f32935h && iF2 > 0);
            if (f1.l(i12, eVar.f32892A0) && z10) {
                i13 = 1;
            }
            this.f32932e = i13;
        }

        public static int j(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static AbstractC1081v q(int i10, E e10, e eVar, int[] iArr, String str, String str2) {
            AbstractC1081v.a aVarR = AbstractC1081v.r();
            for (int i11 = 0; i11 < e10.f1491a; i11++) {
                aVarR.a(new h(i10, e10, i11, eVar, iArr[i11], str, str2));
            }
            return aVarR.k();
        }

        @Override // d2.n.i
        public int a() {
            return this.f32932e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            AbstractC1074n abstractC1074nD = AbstractC1074n.j().g(this.f32933f, hVar.f32933f).f(Integer.valueOf(this.f32936i), Integer.valueOf(hVar.f32936i), M.d().g()).d(this.f32937j, hVar.f32937j).d(this.f32938k, hVar.f32938k).g(this.f32934g, hVar.f32934g).f(Boolean.valueOf(this.f32935h), Boolean.valueOf(hVar.f32935h), this.f32937j == 0 ? M.d() : M.d().g()).d(this.f32939l, hVar.f32939l);
            if (this.f32938k == 0) {
                abstractC1074nD = abstractC1074nD.h(this.f32940m, hVar.f32940m);
            }
            return abstractC1074nD.i();
        }

        @Override // d2.n.i
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f32942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f32943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final D1.o f32944d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface a {
            List a(int i10, E e10, int[] iArr);
        }

        public i(int i10, E e10, int i11) {
            this.f32941a = i10;
            this.f32942b = e10;
            this.f32943c = i11;
            this.f32944d = e10.a(i11);
        }

        public abstract int a();

        public abstract boolean b(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f32945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f32946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f32947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32948h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f32949i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f32950j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f32951k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f32952l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f32953m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f32954n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f32955o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f32956p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f32957q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f32958r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f32959s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f32960t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f32961u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f32962v;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(int r5, D1.E r6, int r7, d2.n.e r8, int r9, java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.n.j.<init>(int, D1.E, int, d2.n$e, int, java.lang.String, int, boolean):void");
        }

        public static int q(j jVar, j jVar2) {
            AbstractC1074n abstractC1074nG = AbstractC1074n.j().g(jVar.f32948h, jVar2.f32948h).f(Integer.valueOf(jVar.f32953m), Integer.valueOf(jVar2.f32953m), M.d().g()).d(jVar.f32954n, jVar2.f32954n).d(jVar.f32955o, jVar2.f32955o).g(jVar.f32956p, jVar2.f32956p).d(jVar.f32957q, jVar2.f32957q).g(jVar.f32949i, jVar2.f32949i).g(jVar.f32945e, jVar2.f32945e).g(jVar.f32947g, jVar2.f32947g).f(Integer.valueOf(jVar.f32952l), Integer.valueOf(jVar2.f32952l), M.d().g()).g(jVar.f32960t, jVar2.f32960t).g(jVar.f32961u, jVar2.f32961u);
            if (jVar.f32960t && jVar.f32961u) {
                abstractC1074nG = abstractC1074nG.d(jVar.f32962v, jVar2.f32962v);
            }
            return abstractC1074nG.i();
        }

        public static int s(j jVar, j jVar2) {
            M mG = (jVar.f32945e && jVar.f32948h) ? n.f32838l : n.f32838l.g();
            AbstractC1074n abstractC1074nJ = AbstractC1074n.j();
            if (jVar.f32946f.f1533B) {
                abstractC1074nJ = abstractC1074nJ.f(Integer.valueOf(jVar.f32950j), Integer.valueOf(jVar2.f32950j), n.f32838l.g());
            }
            return abstractC1074nJ.f(Integer.valueOf(jVar.f32951k), Integer.valueOf(jVar2.f32951k), mG).f(Integer.valueOf(jVar.f32950j), Integer.valueOf(jVar2.f32950j), mG).i();
        }

        public static int u(List list, List list2) {
            return AbstractC1074n.j().f((j) Collections.max(list, new Comparator() { // from class: d2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.q((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: d2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.q((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: d2.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.q((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).f((j) Collections.max(list, new Comparator() { // from class: d2.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.s((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: d2.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.s((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: d2.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.s((n.j) obj, (n.j) obj2);
                }
            }).i();
        }

        public static AbstractC1081v v(int i10, E e10, e eVar, int[] iArr, String str, int i11, Point point) {
            int iG = n.G(e10, point != null ? point.x : eVar.f1545i, point != null ? point.y : eVar.f1546j, eVar.f1548l);
            AbstractC1081v.a aVarR = AbstractC1081v.r();
            for (int i12 = 0; i12 < e10.f1491a; i12++) {
                int iE = e10.a(i12).e();
                aVarR.a(new j(i10, e10, i12, eVar, iArr[i12], str, i11, iG == Integer.MAX_VALUE || (iE != -1 && iE <= iG)));
            }
            return aVarR.k();
        }

        @Override // d2.n.i
        public int a() {
            return this.f32959s;
        }

        public final int w(int i10, int i11) {
            if ((this.f32944d.f1796f & 16384) != 0 || !f1.l(i10, this.f32946f.f32892A0)) {
                return 0;
            }
            if (!this.f32945e && !this.f32946f.f32898p0) {
                return 0;
            }
            if (!f1.l(i10, false) || !this.f32947g || !this.f32945e || this.f32944d.f1800j == -1) {
                return 1;
            }
            e eVar = this.f32946f;
            return (eVar.f1534C || eVar.f1533B || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // d2.n.i
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f32958r && !Objects.equals(this.f32944d.f1805o, jVar.f32944d.f1805o)) {
                return false;
            }
            if (this.f32946f.f32901s0) {
                return true;
            }
            return this.f32960t == jVar.f32960t && this.f32961u == jVar.f32961u;
        }
    }

    public n(Context context) {
        this(context, new C3807a.b());
    }

    public static void C(u.a aVar, e eVar, r.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            n0 n0VarF = aVar.f(i10);
            if (eVar.i(i10, n0VarF)) {
                eVar.h(i10, n0VarF);
                aVarArr[i10] = null;
            }
        }
    }

    public static void D(u.a aVar, F f10, r.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            E(aVar.f(i10), f10, map);
        }
        E(aVar.h(), f10, map);
        for (int i11 = 0; i11 < iD; i11++) {
            android.support.v4.media.session.a.a(map.get(Integer.valueOf(aVar.e(i11))));
        }
    }

    public static void E(n0 n0Var, F f10, Map map) {
        for (int i10 = 0; i10 < n0Var.f20863a; i10++) {
            android.support.v4.media.session.a.a(f10.f1535D.get(n0Var.b(i10)));
        }
    }

    public static int F(D1.o oVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(oVar.f1794d)) {
            return 4;
        }
        String strR = R(str);
        String strR2 = R(oVar.f1794d);
        if (strR2 == null || strR == null) {
            return (z10 && strR2 == null) ? 1 : 0;
        }
        if (strR2.startsWith(strR) || strR.startsWith(strR2)) {
            return 3;
        }
        return G1.M.i1(strR2, "-")[0].equals(G1.M.i1(strR, "-")[0]) ? 2 : 0;
    }

    public static int G(E e10, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < e10.f1491a; i14++) {
                D1.o oVarA = e10.a(i14);
                int i15 = oVarA.f1812v;
                if (i15 > 0 && (i12 = oVarA.f1813w) > 0) {
                    Point pointD = w.d(z10, i10, i11, i15, i12);
                    int i16 = oVarA.f1812v;
                    int i17 = oVarA.f1813w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointD.x * 0.98f)) && i17 >= ((int) (pointD.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    public static String H(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return G1.M.e0(locale);
    }

    public static int I(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int J(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static boolean L(D1.o oVar) {
        String str = oVar.f1805o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static boolean M(D1.o oVar) {
        String str = oVar.f1805o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    public static void N(e eVar, u.a aVar, int[][][] iArr, g1[] g1VarArr, r[] rVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            r rVar = rVarArr[i12];
            if (iE != 1 && rVar != null) {
                return;
            }
            if (iE == 1 && rVar != null && rVar.length() == 1) {
                if (S(eVar, iArr[i12][aVar.f(i12).d(rVar.n())][rVar.f(0)], rVar.s())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f1557u.f1568b ? 1 : 2;
            g1 g1Var = g1VarArr[i10];
            if (g1Var != null && g1Var.f7059b) {
                z10 = true;
            }
            g1VarArr[i10] = new g1(i13, z10);
        }
    }

    public static void O(u.a aVar, int[][][] iArr, g1[] g1VarArr, r[] rVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            r rVar = rVarArr[i12];
            if ((iE == 1 || iE == 2) && rVar != null && T(iArr[i12], aVar.f(i12), rVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            g1 g1Var = new g1(0, true);
            g1VarArr[i11] = g1Var;
            g1VarArr[i10] = g1Var;
        }
    }

    public static String R(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean S(e eVar, int i10, D1.o oVar) {
        if (f1.z(i10) == 0) {
            return false;
        }
        if (eVar.f1557u.f1569c && (f1.z(i10) & RecognitionOptions.PDF417) == 0) {
            return false;
        }
        if (eVar.f1557u.f1568b) {
            boolean z10 = (oVar.f1783J == 0 && oVar.f1784K == 0) ? false : true;
            boolean z11 = (f1.z(i10) & RecognitionOptions.UPC_E) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static boolean T(int[][] iArr, n0 n0Var, r rVar) {
        if (rVar == null) {
            return false;
        }
        int iD = n0Var.d(rVar.n());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (f1.q(iArr[iD][rVar.f(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List p(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, E e10, int[] iArr2) {
        nVar.getClass();
        return b.q(i10, e10, eVar, iArr2, z10, new J7.o() { // from class: d2.m
            @Override // J7.o
            public final boolean apply(Object obj) {
                return this.f32836a.K((D1.o) obj, eVar);
            }
        }, iArr[i10]);
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public final boolean K(D1.o oVar, e eVar) {
        int i10;
        g gVar;
        g gVar2;
        if (!eVar.f32908z0) {
            return true;
        }
        Boolean bool = this.f32846k;
        if ((bool != null && bool.booleanValue()) || (i10 = oVar.f1780G) == -1 || i10 <= 2) {
            return true;
        }
        if (!L(oVar) || (Build.VERSION.SDK_INT >= 32 && (gVar2 = this.f32844i) != null && gVar2.d())) {
            return Build.VERSION.SDK_INT >= 32 && (gVar = this.f32844i) != null && gVar.d() && this.f32844i.b() && this.f32844i.c() && this.f32844i.a(this.f32845j, oVar);
        }
        return true;
    }

    public final void P() {
        boolean z10;
        g gVar;
        synchronized (this.f32839d) {
            try {
                z10 = this.f32842g.f32908z0 && Build.VERSION.SDK_INT >= 32 && (gVar = this.f32844i) != null && gVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            e();
        }
    }

    public final void Q(e1 e1Var) {
        boolean z10;
        synchronized (this.f32839d) {
            z10 = this.f32842g.f32895D0;
        }
        if (z10) {
            f(e1Var);
        }
    }

    public r.a[] U(u.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        String str;
        int iD = aVar.d();
        r.a[] aVarArr = new r.a[iD];
        Pair pairV = V(aVar, iArr, iArr2, eVar);
        if (pairV != null) {
            aVarArr[((Integer) pairV.second).intValue()] = (r.a) pairV.first;
        }
        if (pairV == null) {
            str = null;
        } else {
            Object obj = pairV.first;
            str = ((r.a) obj).f32963a.a(((r.a) obj).f32964b[0]).f1794d;
        }
        Pair pairA0 = a0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair pairW = (eVar.f1532A || pairA0 == null) ? W(aVar, iArr, eVar) : null;
        if (pairW != null) {
            aVarArr[((Integer) pairW.second).intValue()] = (r.a) pairW.first;
        } else if (pairA0 != null) {
            aVarArr[((Integer) pairA0.second).intValue()] = (r.a) pairA0.first;
        }
        Pair pairY = Y(aVar, iArr, eVar, str2);
        if (pairY != null) {
            aVarArr[((Integer) pairY.second).intValue()] = (r.a) pairY.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = X(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    public Pair V(u.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f20863a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return Z(1, aVar, iArr, new i.a() { // from class: d2.i
            @Override // d2.n.i.a
            public final List a(int i11, E e10, int[] iArr3) {
                return n.p(this.f32829a, eVar, z10, iArr2, i11, e10, iArr3);
            }
        }, new Comparator() { // from class: d2.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.j((List) obj, (List) obj2);
            }
        });
    }

    public Pair W(u.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f1557u.f1567a == 2) {
            return null;
        }
        return Z(4, aVar, iArr, new i.a() { // from class: d2.e
            @Override // d2.n.i.a
            public final List a(int i10, E e10, int[] iArr2) {
                return n.c.q(i10, e10, eVar, iArr2);
            }
        }, new Comparator() { // from class: d2.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.j((List) obj, (List) obj2);
            }
        });
    }

    public r.a X(int i10, n0 n0Var, int[][] iArr, e eVar) {
        if (eVar.f1557u.f1567a == 2) {
            return null;
        }
        int i11 = 0;
        E e10 = null;
        d dVar = null;
        for (int i12 = 0; i12 < n0Var.f20863a; i12++) {
            E eB = n0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < eB.f1491a; i13++) {
                if (f1.l(iArr2[i13], eVar.f32892A0)) {
                    d dVar2 = new d(eB.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        e10 = eB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (e10 == null) {
            return null;
        }
        return new r.a(e10, i11);
    }

    public Pair Y(u.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f1557u.f1567a == 2) {
            return null;
        }
        final String strH = eVar.f1560x ? H(this.f32840e) : null;
        return Z(3, aVar, iArr, new i.a() { // from class: d2.k
            @Override // d2.n.i.a
            public final List a(int i10, E e10, int[] iArr2) {
                return n.h.q(i10, e10, eVar, iArr2, str, strH);
            }
        }, new Comparator() { // from class: d2.l
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.j((List) obj, (List) obj2);
            }
        });
    }

    public final Pair Z(int i10, u.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessA;
        u.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                n0 n0VarF = aVar3.f(i12);
                for (int i13 = 0; i13 < n0VarF.f20863a; i13++) {
                    E eB = n0VarF.b(i13);
                    List listA = aVar2.a(i12, eB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[eB.f1491a];
                    int i14 = 0;
                    while (i14 < eB.f1491a) {
                        i iVar = (i) listA.get(i14);
                        int iA = iVar.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessA = AbstractC1081v.A(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < eB.f1491a) {
                                    i iVar2 = (i) listA.get(i15);
                                    int i16 = iD;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                randomAccessA = arrayList2;
                            }
                            i11 = iD;
                            arrayList.add(randomAccessA);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f32943c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new r.a(iVar3.f32942b, iArr2), Integer.valueOf(iVar3.f32941a));
    }

    @Override // K1.f1.a
    public void a(e1 e1Var) {
        Q(e1Var);
    }

    public Pair a0(u.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) {
        Context context;
        final Point pointW = null;
        if (eVar.f1557u.f1567a == 2) {
            return null;
        }
        if (eVar.f1547k && (context = this.f32840e) != null) {
            pointW = G1.M.W(context);
        }
        return Z(2, aVar, iArr, new i.a() { // from class: d2.g
            @Override // d2.n.i.a
            public final List a(int i10, E e10, int[] iArr3) {
                return n.j.v(i10, e10, eVar, iArr3, str, iArr2[i10], pointW);
            }
        }, new Comparator() { // from class: d2.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.u((List) obj, (List) obj2);
            }
        });
    }

    @Override // d2.x
    public boolean g() {
        return true;
    }

    @Override // d2.x
    public void i() {
        g gVar;
        synchronized (this.f32839d) {
            try {
                Thread thread = this.f32843h;
                if (thread != null) {
                    AbstractC0853a.h(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (gVar = this.f32844i) != null) {
            gVar.e();
            this.f32844i = null;
        }
        super.i();
    }

    @Override // d2.x
    public void k(C0744b c0744b) {
        if (this.f32845j.equals(c0744b)) {
            return;
        }
        this.f32845j = c0744b;
        P();
    }

    @Override // d2.u
    public final Pair o(u.a aVar, int[][][] iArr, int[] iArr2, InterfaceC2611D.b bVar, D1.D d10) {
        e eVar;
        Context context;
        synchronized (this.f32839d) {
            this.f32843h = Thread.currentThread();
            eVar = this.f32842g;
        }
        if (this.f32846k == null && (context = this.f32840e) != null) {
            this.f32846k = Boolean.valueOf(G1.M.H0(context));
        }
        if (eVar.f32908z0 && Build.VERSION.SDK_INT >= 32 && this.f32844i == null) {
            this.f32844i = new g(this.f32840e, this, this.f32846k);
        }
        int iD = aVar.d();
        r.a[] aVarArrU = U(aVar, iArr, iArr2, eVar);
        D(aVar, eVar, aVarArrU);
        C(aVar, eVar, aVarArrU);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.g(i10) || eVar.f1536E.contains(Integer.valueOf(iE))) {
                aVarArrU[i10] = null;
            }
        }
        r[] rVarArrA = this.f32841f.a(aVarArrU, b(), bVar, d10);
        g1[] g1VarArr = new g1[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            g1VarArr[i11] = (eVar.g(i11) || eVar.f1536E.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && rVarArrA[i11] == null)) ? null : g1.f7057c;
        }
        if (eVar.f32893B0) {
            O(aVar, iArr, g1VarArr, rVarArrA);
        }
        if (eVar.f1557u.f1567a != 0) {
            N(eVar, aVar, iArr, g1VarArr, rVarArrA);
        }
        return Pair.create(g1VarArr, rVarArrA);
    }

    public n(Context context, r.b bVar) {
        this(context, e.f32871G0, bVar);
    }

    public n(Context context, F f10, r.b bVar) {
        this(f10, bVar, context);
    }

    public n(F f10, r.b bVar, Context context) {
        this.f32839d = new Object();
        this.f32840e = context != null ? context.getApplicationContext() : null;
        this.f32841f = bVar;
        if (f10 instanceof e) {
            this.f32842g = (e) f10;
        } else {
            this.f32842g = e.f32871G0.f().c0(f10).F();
        }
        this.f32845j = C0744b.f1660h;
        if (this.f32842g.f32908z0 && context == null) {
            G1.t.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // d2.x
    public f1.a c() {
        return this;
    }
}
