package x;

import E.AbstractC0807p0;
import E.C0821x;
import L.AbstractC1096f;
import L.AbstractC1109l0;
import L.a1;
import L.e1;
import L.h1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import fc.C4016I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import vc.InterfaceC6082a;
import y.C6369e;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class T1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C6239l1 f46788B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final G1 f46789C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final H.a f46790D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f46801k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC6216e f46802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C6378n f46803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final B.f f46804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f46805o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f46808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f46809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f46811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f46812v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public L.i1 f46813w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C6236k1 f46815y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46791a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46792b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46793c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46794d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f46795e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f46796f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f46797g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f46798h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f46799i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f46800j = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f46814x = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final B.x f46816z = new B.x();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B.t f46787A = new B.t();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static b f(List list, List list2, int i10, int i11, int i12) {
            return new C6210c(list, list2, i10, i11, i12);
        }

        public abstract List a();

        public abstract List b();

        public abstract int c();

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        WITHOUT_FEATURE_COMBO,
        WITH_FEATURE_COMBO,
        WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d {
        public static d j(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
            return new C6213d(i10, z10, i11, z11, z12, z13, z14, z15, range, z16);
        }

        public abstract int a();

        public abstract int b();

        public abstract Range c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean k();
    }

    public T1(Context context, String str, y.t tVar, InterfaceC6216e interfaceC6216e, H.a aVar) throws C0821x {
        this.f46806p = false;
        this.f46807q = false;
        this.f46810t = false;
        this.f46811u = false;
        String str2 = (String) X0.h.g(str);
        this.f46801k = str2;
        this.f46802l = (InterfaceC6216e) X0.h.g(interfaceC6216e);
        this.f46804n = new B.f();
        this.f46815y = C6236k1.c(context);
        try {
            C6378n c6378nC = tVar.c(str2);
            this.f46803m = c6378nC;
            Integer num = (Integer) c6378nC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f46805o = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c6378nC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f46806p = true;
                    } else if (i10 == 6) {
                        this.f46807q = true;
                    } else if (i10 == 16) {
                        this.f46810t = true;
                    } else if (i10 == 1) {
                        this.f46811u = true;
                    }
                }
            }
            C6239l1 c6239l1 = new C6239l1(this.f46803m);
            this.f46788B = c6239l1;
            this.f46789C = new G1(this.f46803m);
            q();
            if (this.f46810t) {
                t();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f46808r = zHasSystemFeature;
            if (zHasSystemFeature) {
                l();
            }
            if (c6239l1.d()) {
                k();
            }
            boolean zH = Q1.h(this.f46803m);
            this.f46809s = zH;
            if (zH) {
                p();
            }
            boolean zA = l2.a(this.f46803m);
            this.f46812v = zA;
            if (zA) {
                o();
            }
            r();
            d();
            this.f46790D = aVar;
        } catch (C6369e e10) {
            throw W0.a(e10);
        }
    }

    public static Size[] D(StreamConfigurationMap streamConfigurationMap, int i10, Rational rational) {
        Size[] outputSizes;
        try {
            outputSizes = i10 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i10);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        if (rational == null) {
            return outputSizes;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            if (M.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public static int E(Range range, Range range2) {
        X0.h.j((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int F(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static int J(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((E.J) it.next()).a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    public static List R(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iX = ((L.s1) it.next()).x(0);
            if (!arrayList2.contains(Integer.valueOf(iX))) {
                arrayList2.add(Integer.valueOf(iX));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                L.s1 s1Var = (L.s1) it3.next();
                if (iIntValue == s1Var.x(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(s1Var)));
                }
            }
        }
        return arrayList;
    }

    public static boolean S(int i10, Range range, int i11) {
        return L.e1.f8057a.equals(range) || i11 >= i10 || i11 >= ((Integer) range.getUpper()).intValue();
    }

    public static boolean U(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC1096f) it.next()).d() == 4101) {
                return true;
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (((L.s1) it2.next()).getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    public static Range f(Range range, Range range2, Range range3) {
        double dF = F(range2.intersect(range));
        double dF2 = F(range3.intersect(range));
        double dF3 = dF2 / ((double) F(range3));
        double dF4 = dF / ((double) F(range2));
        return (dF2 <= dF ? dF2 != dF ? dF4 >= 0.5d || dF3 <= dF4 : dF3 <= dF4 && (dF3 != dF4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : dF3 < 0.5d && dF3 < dF4) ? range2 : range3;
    }

    public final Size A(StreamConfigurationMap streamConfigurationMap, int i10, boolean z10, Rational rational) {
        Size[] sizeArrA;
        Size[] sizeArrD = D(streamConfigurationMap, i10, rational);
        if (sizeArrD == null || sizeArrD.length == 0) {
            return null;
        }
        M.d dVar = new M.d();
        Size size = (Size) Collections.max(Arrays.asList(sizeArrD), dVar);
        Size size2 = T.d.f15878a;
        if (z10 && (sizeArrA = a.a(streamConfigurationMap, i10)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    public final int B(List list, boolean z10) {
        Iterator it = list.iterator();
        int iO = Integer.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC1096f abstractC1096f = (AbstractC1096f) it.next();
            iO = O(iO, abstractC1096f.d(), abstractC1096f.g(), z10);
        }
        return iO;
    }

    public List C(d dVar, List list, Map map, Map map2) {
        if (!Q1.n(dVar)) {
            return null;
        }
        Iterator it = this.f46800j.iterator();
        while (it.hasNext()) {
            final List listD = ((L.g1) it.next()).d(list);
            if (listD != null) {
                boolean zA = Q1.a(map, map2, listD);
                C4016I c4016i = new C4016I(new InterfaceC6082a() { // from class: x.R1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return Boolean.valueOf(Q1.c(this.f46708a.f46803m, listD));
                    }
                });
                if (zA && ((Boolean) c4016i.getValue()).booleanValue()) {
                    return listD;
                }
            }
        }
        return null;
    }

    public final Size G() {
        try {
            Size sizeH = H(Integer.parseInt(this.f46801k));
            if (sizeH != null) {
                return sizeH;
            }
        } catch (NumberFormatException unused) {
        }
        Size sizeI = I();
        return sizeI != null ? sizeI : T.d.f15881d;
    }

    public final Size H(int i10) {
        CamcorderProfile camcorderProfileA;
        int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (this.f46802l.b(i10, i12) && (camcorderProfileA = this.f46802l.a(i10, i12)) != null) {
                return new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
            }
        }
        return null;
    }

    public final Size I() {
        Size[] outputSizes;
        try {
            outputSizes = this.f46803m.e().g().getOutputSizes(MediaRecorder.class);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null) {
            return null;
        }
        Arrays.sort(outputSizes, new M.d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = T.d.f15883f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return null;
    }

    public L.j1 K(int i10, List list, Map map, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean zT;
        Range rangeN;
        X();
        boolean zL = G1.l(list, map.keySet());
        Map mapD = zL ? this.f46789C.d(map) : map;
        ArrayList arrayList = new ArrayList(mapD.keySet());
        List listR = R(arrayList);
        Map mapG = this.f46788B.g(list, arrayList, listR);
        AbstractC0807p0.a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + mapG);
        boolean zU = U(list, mapD);
        if (z13) {
            rangeN = L.e1.f8057a;
            zT = false;
        } else {
            zT = T(list, arrayList);
            rangeN = N(list, arrayList, listR, zT);
        }
        Range range = rangeN;
        boolean z14 = zT;
        if (z10 && !this.f46812v && z12) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        return Y(w(mapG.values(), range, z10, zU, z12), h(i10, z11, mapG, z10, zU, zL, z12, false, range, z14), list, mapD, arrayList, listR, mapG, z13);
    }

    public final List L(d dVar) {
        if (this.f46797g.containsKey(dVar)) {
            return (List) this.f46797g.get(dVar);
        }
        List arrayList = new ArrayList();
        if (dVar.k()) {
            if (this.f46796f.isEmpty()) {
                m();
            }
            arrayList.addAll(this.f46796f);
        } else if (dVar.i()) {
            if (this.f46799i.isEmpty()) {
                s();
            }
            if (dVar.a() == 0) {
                arrayList.addAll(this.f46799i);
            }
        } else if (dVar.f()) {
            if (this.f46795e.isEmpty()) {
                n();
            }
            arrayList.addAll(this.f46795e);
        } else if (dVar.b() == 8) {
            int iA = dVar.a();
            if (iA == 1) {
                arrayList = this.f46793c;
            } else if (iA != 2) {
                arrayList.addAll(dVar.g() ? this.f46794d : this.f46791a);
            } else {
                arrayList.addAll(this.f46792b);
                arrayList.addAll(this.f46791a);
            }
        } else if (dVar.b() == 10 && dVar.a() == 0) {
            arrayList.addAll(this.f46798h);
        }
        this.f46797g.put(dVar, arrayList);
        return arrayList;
    }

    public final Pair M(d dVar, List list, List list2, List list3, List list4, int i10, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1096f abstractC1096f = (AbstractC1096f) it.next();
            arrayList.add(abstractC1096f.h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC1096f);
            }
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            Size size = (Size) list2.get(i11);
            L.s1 s1Var = (L.s1) list3.get(((Integer) list4.get(i11)).intValue());
            int inputFormat = s1Var.getInputFormat();
            arrayList.add(L.h1.l(inputFormat, size, P(inputFormat), dVar.a(), dVar.k() ? h1.c.FEATURE_COMBINATION_TABLE : h1.c.CAPTURE_SESSION_TABLES, s1Var.R()));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), s1Var);
            }
            i10 = O(i10, s1Var.getInputFormat(), size, dVar.f());
        }
        return new Pair(arrayList, Integer.valueOf(i10));
    }

    public final Range N(List list, List list2, List list3, boolean z10) {
        Range rangeQ = L.e1.f8057a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rangeQ = Q(((AbstractC1096f) it.next()).i(), rangeQ, z10);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Range rangeV = ((L.s1) list2.get(((Integer) it2.next()).intValue())).v(L.e1.f8057a);
            Objects.requireNonNull(rangeV);
            rangeQ = Q(rangeV, rangeQ, z10);
        }
        return rangeQ;
    }

    public final int O(int i10, int i11, Size size, boolean z10) {
        return Math.min(i10, y(i11, size, z10));
    }

    public L.i1 P(int i10) {
        if (!this.f46814x.contains(Integer.valueOf(i10))) {
            c0(this.f46813w.n(), T.d.f15882e, i10);
            c0(this.f46813w.l(), T.d.f15884g, i10);
            b0(this.f46813w.h(), i10, null);
            b0(this.f46813w.f(), i10, M.a.f8804a);
            b0(this.f46813w.d(), i10, M.a.f8806c);
            d0(this.f46813w.p(), i10);
            this.f46814x.add(Integer.valueOf(i10));
        }
        return this.f46813w;
    }

    public final Range Q(Range range, Range range2, boolean z10) {
        Range range3 = L.e1.f8057a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z10) {
            X0.h.j(range == range2, "All targetFrameRate should be the same if strict fps is required");
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean T(List list, List list2) {
        Iterator it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolValueOf = Boolean.valueOf(v(((AbstractC1096f) it.next()).j(), boolValueOf));
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            boolValueOf = Boolean.valueOf(v(((L.s1) it2.next()).A(), boolValueOf));
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean V(d dVar, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1096f) it.next()).h());
        }
        M.d dVar2 = new M.d();
        for (L.s1 s1Var : map.keySet()) {
            List list2 = (List) map.get(s1Var);
            X0.h.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + s1Var + ".");
            Size size = (Size) Collections.min(list2, dVar2);
            int inputFormat = s1Var.getInputFormat();
            arrayList.add(L.h1.l(inputFormat, size, P(inputFormat), dVar.a(), h1.c.CAPTURE_SESSION_TABLES, s1Var.R()));
        }
        Map map2 = Collections.EMPTY_MAP;
        List list3 = Collections.EMPTY_LIST;
        return e(dVar, arrayList, map2, list3, list3);
    }

    public final void W(d dVar, Range range, Size size, int i10, L.f1 f1Var, boolean z10, Map map, List list) {
        h1.b bVarE = L.h1.l(i10, size, P(i10), dVar.a(), dVar.k() ? h1.c.FEATURE_COMBINATION_TABLE : h1.c.CAPTURE_SESSION_TABLES, f1Var).e();
        Range range2 = L.e1.f8057a;
        int iY = (!range2.equals(range) || z10) ? y(i10, size, dVar.f()) : Integer.MAX_VALUE;
        if (dVar.e()) {
            if (bVarE == h1.b.NOT_SUPPORT) {
                return;
            }
            if (!range2.equals(range) && iY < ((Integer) range.getUpper()).intValue()) {
                return;
            }
        }
        Set hashSet = (Set) map.get(bVarE);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(bVarE, hashSet);
        }
        if (hashSet.contains(Integer.valueOf(iY))) {
            return;
        }
        list.add(size);
        hashSet.add(Integer.valueOf(iY));
    }

    public final void X() {
        this.f46815y.g();
        if (this.f46813w == null) {
            r();
        } else {
            this.f46813w = L.i1.a(this.f46813w.b(), this.f46813w.n(), this.f46815y.f(), this.f46813w.l(), this.f46813w.j(), this.f46813w.h(), this.f46813w.f(), this.f46813w.d(), this.f46813w.p());
        }
    }

    public final L.j1 Y(c cVar, d dVar, List list, Map map, List list2, List list3, Map map2, boolean z10) {
        AbstractC0807p0.a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + cVar);
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 1) {
            return Z(h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
        if (iOrdinal != 2) {
            return Z(dVar, list, map, list2, list3, map2, z10);
        }
        try {
            return Z(dVar, list, map, list2, list3, map2, z10);
        } catch (IllegalArgumentException e10) {
            AbstractC0807p0.b("SupportedSurfaceCombination", "Failed to find a supported combination without feature combo, trying again with feature combo", e10);
            return this.Z(this.h(dVar.a(), dVar.d(), map2, dVar.g(), dVar.i(), dVar.f(), dVar.e(), true, dVar.c(), dVar.h()), list, map, list2, list3, map2, z10);
        }
    }

    public final L.j1 Z(d dVar, List list, Map map, List list2, List list3, Map map2, boolean z10) {
        HashMap map3;
        HashMap map4;
        int i10;
        int i11;
        List list4 = list;
        List list5 = list2;
        AbstractC0807p0.a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + dVar);
        if (!dVar.k() && !V(dVar, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f46801k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list4 + ". New configs: " + list5 + ". GroupableFeature settings: " + dVar);
        }
        Map mapI = i(map, dVar, z10);
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            L.s1 s1Var = (L.s1) list5.get(((Integer) it.next()).intValue());
            List list6 = (List) mapI.get(s1Var);
            if (list6 == null) {
                list6 = Collections.EMPTY_LIST;
            }
            arrayList.add(c(list6, s1Var.getInputFormat()));
        }
        List listJ = dVar.f() ? this.f46789C.j(arrayList) : u(arrayList);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        boolean zD = Q1.d(list4, list5);
        int iB = B(list4, dVar.f());
        List listC = null;
        if (!this.f46809s || zD) {
            map3 = map7;
            map4 = map8;
            i10 = iB;
        } else {
            Iterator it2 = listJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map7;
                    map4 = map8;
                    i10 = iB;
                    break;
                }
                Pair pairM = M(dVar, list4, (List) it2.next(), list5, list3, iB, map7, map8);
                map3 = map7;
                map4 = map8;
                i10 = iB;
                listC = C(dVar, (List) pairM.first, map3, map4);
                if (listC != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                list5 = list2;
                map7 = map3;
                iB = i10;
                list4 = list;
                map8 = map4;
            }
            AbstractC0807p0.a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + listC);
        }
        List list7 = listC;
        HashMap map9 = map3;
        HashMap map10 = map4;
        b bVarJ = j(dVar, list, list2, list3, listJ, list7, map2, i10, z10);
        AbstractC0807p0.a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + bVarJ);
        List listA = bVarJ.a();
        int iD = bVarJ.d();
        List listB = bVarJ.b();
        int iE = bVarJ.e();
        int iC = bVarJ.c();
        if (listA == null) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f46801k + " and Hardware level: " + this.f46805o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        Range rangeX = L.e1.f8057a;
        if (rangeX.equals(dVar.c())) {
            i11 = iC;
            if (dVar.f()) {
                rangeX = x(G1.f46622f, iD, this.f46789C.f(listA));
            }
        } else {
            Range[] rangeArrF = dVar.f() ? this.f46789C.f(listA) : (Range[]) this.f46803m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range rangeX2 = x(dVar.c(), iD, rangeArrF);
            if (dVar.e() || dVar.h()) {
                boolean zEquals = rangeX2.equals(dVar.c());
                Range[] rangeArr = rangeArrF;
                StringBuilder sb2 = new StringBuilder();
                i11 = iC;
                sb2.append("Target FPS range ");
                sb2.append(dVar.c());
                sb2.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb2.append(iD);
                sb2.append(". Calculated best FPS range for device: ");
                sb2.append(rangeX2);
                sb2.append(". Device supported FPS ranges: ");
                sb2.append(Arrays.toString(rangeArr));
                X0.h.b(zEquals, sb2.toString());
            } else {
                i11 = iC;
            }
            rangeX = rangeX2;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            L.s1 s1Var2 = (L.s1) it3.next();
            Iterator it4 = it3;
            e1.a aVarH = L.e1.a((Size) listA.get(list3.indexOf(Integer.valueOf(list2.indexOf(s1Var2))))).g(dVar.f() ? 1 : 0).b((E.J) X0.h.g((E.J) map2.get(s1Var2))).d(Q1.e(s1Var2)).h(dVar.d());
            if (!L.e1.f8057a.equals(rangeX)) {
                aVarH.c(rangeX);
            }
            map6.put(s1Var2, aVarH.a());
            it3 = it4;
        }
        if (list7 != null && iD == iE && listA.size() == listB.size()) {
            int i12 = 0;
            while (true) {
                if (i12 < listA.size()) {
                    if (!((Size) listA.get(i12)).equals(listB.get(i12))) {
                        break;
                    }
                    i12++;
                } else if (!Q1.k(this.f46803m, list, map6, map5)) {
                    Q1.l(map6, map5, map9, map10, list7);
                }
            }
        }
        return new L.j1(map6, map5, i11);
    }

    public L.h1 a0(int i10, int i11, Size size, L.f1 f1Var) {
        return L.h1.l(i11, size, P(i11), i10, h1.c.CAPTURE_SESSION_TABLES, f1Var);
    }

    public final void b0(Map map, int i10, Rational rational) {
        Size sizeA = A(this.f46803m.e().g(), i10, true, rational);
        if (sizeA != null) {
            map.put(Integer.valueOf(i10), sizeA);
        }
    }

    public List c(List list, int i10) {
        Rational rational;
        int iA = this.f46816z.a(this.f46801k, this.f46803m);
        if (iA == 0) {
            rational = M.a.f8804a;
        } else if (iA != 1) {
            rational = null;
            if (iA == 2) {
                Size sizeG = P(256).g(256);
                if (sizeG != null) {
                    rational = new Rational(sizeG.getWidth(), sizeG.getHeight());
                }
            } else if (iA != 3) {
                throw new AssertionError("Undefined targetAspectRatio: " + iA);
            }
        } else {
            rational = M.a.f8806c;
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (M.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f46787A.a(L.h1.f(i10), list);
    }

    public final void c0(Map map, Size size, int i10) {
        if (this.f46808r) {
            Size sizeA = A(this.f46803m.e().g(), i10, false, null);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeA != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeA), new M.d());
            }
            map.put(numValueOf, size);
        }
    }

    public final void d0(Map map, int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (this.f46810t && (streamConfigurationMap = (StreamConfigurationMap) this.f46803m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
            map.put(Integer.valueOf(i10), A(streamConfigurationMap, i10, true, null));
        }
    }

    public boolean e(d dVar, List list, Map map, List list2, List list3) {
        Iterator it = L(dVar).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = ((L.g1) it.next()).d(list) != null;
            if (z10) {
                break;
            }
        }
        if (!z10 || !dVar.k()) {
            return z10;
        }
        L.a1 a1VarG = g(dVar, list, map, list2, list3);
        boolean zB = this.f46790D.b(a1VarG);
        Iterator it2 = a1VarG.o().iterator();
        while (it2.hasNext()) {
            ((AbstractC1109l0) it2.next()).d();
        }
        return zB;
    }

    public final L.a1 g(d dVar, List list, Map map, List list2, List list3) {
        Range rangeC = dVar.c();
        a1.h hVar = new a1.h();
        for (int i10 = 0; i10 < list.size(); i10++) {
            L.h1 h1Var = (L.h1) list.get(i10);
            Size sizeH = h1Var.h(P(h1Var.g()));
            L.s1 s1Var = (L.s1) list2.get(((Integer) list3.get(i10)).intValue());
            E.J j10 = (E.J) map.get(h1Var);
            Objects.requireNonNull(j10);
            a1.b bVarA = H.a.a(s1Var, sizeH, j10);
            bVarA.s(L.e1.f8057a.equals(rangeC) ? I.c.f5382k : rangeC);
            if (dVar.g()) {
                bVarA.w(2);
            }
            hVar.b(bVarA.p());
            X0.h.j(hVar.f(), "Cannot create a combined SessionConfig for feature combo after adding " + s1Var + " with " + h1Var + " due to [" + hVar.d() + "]; surfaceConfigList = " + list + ", featureSettings = " + dVar + ", newUseCaseConfigs = " + list2);
        }
        return hVar.c();
    }

    public final d h(int i10, boolean z10, Map map, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        int iJ = J(map);
        if (i10 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f46801k, L.K.a(i10)));
        }
        if (i10 != 0 && iJ == 10) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f46801k, L.K.a(i10)));
        }
        if (i10 != 0 && z14) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Feature combination query is not currently supported in %s camera mode.", this.f46801k, L.K.a(i10)));
        }
        if (z13 && z14) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z13 && !this.f46789C.m()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z14 && range == L.e1.f8057a && z15) {
            range = I.c.f5382k;
        }
        return d.j(i10, z10, iJ, z11, z12, z13, z14, z15, range, z16);
    }

    public Map i(Map map, d dVar, boolean z10) {
        HashMap map2 = new HashMap();
        for (L.s1 s1Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            List list = (List) map.get(s1Var);
            Objects.requireNonNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W(dVar, dVar.c(), (Size) it.next(), s1Var.getInputFormat(), s1Var.R(), z10, map3, arrayList);
            }
            map2.put(s1Var, arrayList);
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110 A[PHI: r6 r7 r10
      0x0110: PHI (r6v2 boolean) = (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v3 boolean) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v5 int), (r7v6 int) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r10v3 java.util.List) = (r10v1 java.util.List), (r10v1 java.util.List), (r10v5 java.util.List), (r10v6 java.util.List) binds: [B:27:0x00e7, B:29:0x00f3, B:35:0x0100, B:39:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x.T1.b j(final x.T1.d r30, java.util.List r31, final java.util.List r32, final java.util.List r33, java.util.List r34, java.util.List r35, java.util.Map r36, int r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.T1.j(x.T1$d, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, int, boolean):x.T1$b");
    }

    public final void k() {
        this.f46798h.addAll(C1.e());
    }

    public final void l() {
        this.f46793c.addAll(C1.g());
    }

    public final void m() {
        this.f46796f.addAll(C1.c());
    }

    public final void n() {
        if (this.f46789C.m()) {
            this.f46795e.clear();
            Size sizeI = this.f46789C.i();
            if (sizeI != null) {
                this.f46795e.addAll(C1.b(sizeI, P(34)));
            }
        }
    }

    public final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f46794d.addAll(C1.l());
        }
    }

    public final void p() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f46800j.addAll(C1.n());
        }
    }

    public final void q() {
        this.f46791a.addAll(C1.d(this.f46805o, this.f46806p, this.f46807q));
        this.f46791a.addAll(this.f46804n.a(this.f46801k));
    }

    public final void r() {
        this.f46813w = L.i1.a(T.d.f15880c, new HashMap(), this.f46815y.f(), new HashMap(), G(), new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final void s() {
        this.f46799i.addAll(C1.o());
    }

    public final void t() {
        this.f46792b.addAll(C1.p());
    }

    public final List u(List list) {
        Iterator it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= ((List) it.next()).size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / ((List) list.get(0)).size();
        int i11 = size;
        for (int i12 = 0; i12 < list.size(); i12++) {
            List list2 = (List) list.get(i12);
            for (int i13 = 0; i13 < size; i13++) {
                ((List) arrayList.get(i13)).add((Size) list2.get((i13 % i11) / size2));
            }
            if (i12 < list.size() - 1) {
                i11 = size2;
                size2 /= ((List) list.get(i12 + 1)).size();
            }
        }
        return arrayList;
    }

    public final boolean v(boolean z10, Boolean bool) {
        if (bool == null || bool.booleanValue() == z10) {
            return z10;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public final c w(Collection collection, Range range, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return c.WITHOUT_FEATURE_COMBO;
        }
        ?? Contains = collection.contains(E.J.f2796f);
        int i10 = Contains;
        if (range != null) {
            i10 = Contains;
            if (((Integer) range.getUpper()).intValue() == 60) {
                i10 = Contains + 1;
            }
        }
        if (z10) {
            i10++;
        }
        if (z11) {
            i10++;
        }
        return i10 > 1 ? c.WITH_FEATURE_COMBO : i10 == 1 ? c.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT : c.WITHOUT_FEATURE_COMBO;
    }

    public final Range x(Range range, int i10, Range[] rangeArr) {
        Range rangeF = L.e1.f8057a;
        if (rangeF.equals(range) || rangeArr == null) {
            return rangeF;
        }
        Range range2 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i10)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i10)));
        int iF = 0;
        for (Range range3 : rangeArr) {
            Objects.requireNonNull(range3);
            if (i10 >= ((Integer) range3.getLower()).intValue()) {
                if (rangeF.equals(L.e1.f8057a)) {
                    rangeF = range3;
                }
                if (range3.equals(range2)) {
                    return range3;
                }
                try {
                    int iF2 = F(range3.intersect(range2));
                    if (iF == 0) {
                        iF = iF2;
                    } else {
                        if (iF2 >= iF) {
                            rangeF = f(range2, rangeF, range3);
                            iF = F(range2.intersect(rangeF));
                        }
                        range3 = rangeF;
                    }
                } catch (IllegalArgumentException unused) {
                    if (iF != 0 || (E(range3, range2) >= E(rangeF, range2) && (E(range3, range2) != E(rangeF, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeF.getUpper()).intValue() && F(range3) >= F(rangeF))))) {
                    }
                }
                rangeF = range3;
            }
        }
        return rangeF;
    }

    public final int y(int i10, Size size, boolean z10) {
        X0.h.i(!z10 || i10 == 34);
        return z10 ? this.f46789C.h(size) : z(this.f46803m, i10, size);
    }

    public final int z(C6378n c6378n, int i10, Size size) {
        y.y yVarE = c6378n.e();
        Objects.requireNonNull(yVarE);
        long jE = yVarE.e(i10, size);
        if (jE > 0) {
            return (int) (1.0E9d / jE);
        }
        if (!this.f46811u) {
            return Integer.MAX_VALUE;
        }
        AbstractC0807p0.l("SupportedSurfaceCombination", "minFrameDuration: " + jE + " is invalid for imageFormat = " + i10 + ", size = " + size);
        return 0;
    }

    public final void d() {
    }
}
