package androidx.media3.exoplayer.dash;

import D1.E;
import D1.o;
import G1.M;
import I1.x;
import K1.F0;
import K1.k1;
import K7.AbstractC1081v;
import K7.D;
import K7.F;
import L1.B0;
import N1.j;
import O1.f;
import O1.g;
import P1.t;
import P1.u;
import a2.C2632s;
import a2.InterfaceC2610C;
import a2.InterfaceC2624j;
import a2.L;
import a2.c0;
import a2.d0;
import a2.n0;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import b2.C2798h;
import d2.r;
import e2.e;
import e2.k;
import e2.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC2610C, d0.a, C2798h.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pattern f23585A = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Pattern f23586B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0299a f23588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f23589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f23590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f23591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N1.b f23592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f23594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2.b f23595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f23596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f23597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC2624j f23598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f23599m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final L.a f23601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t.a f23602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B0 f23603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC2610C.a f23604r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d0 f23607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public O1.c f23608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f23610x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f23612z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f23611y = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2798h[] f23605s = I(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j[] f23606t = new j[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f23600n = new IdentityHashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f23613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f23617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f23619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractC1081v f23620h;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, AbstractC1081v abstractC1081v) {
            this.f23614b = i10;
            this.f23613a = iArr;
            this.f23615c = i11;
            this.f23617e = i12;
            this.f23618f = i13;
            this.f23619g = i14;
            this.f23616d = i15;
            this.f23620h = abstractC1081v;
        }

        public static a a(int[] iArr, int i10, AbstractC1081v abstractC1081v) {
            return new a(3, 1, iArr, i10, -1, -1, -1, abstractC1081v);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1, AbstractC1081v.z());
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10, AbstractC1081v.z());
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1, AbstractC1081v.z());
        }
    }

    public b(int i10, O1.c cVar, N1.b bVar, int i11, a.InterfaceC0299a interfaceC0299a, x xVar, e eVar, u uVar, t.a aVar, k kVar, L.a aVar2, long j10, n nVar, e2.b bVar2, InterfaceC2624j interfaceC2624j, d.b bVar3, B0 b02) {
        this.f23587a = i10;
        this.f23608v = cVar;
        this.f23592f = bVar;
        this.f23609w = i11;
        this.f23588b = interfaceC0299a;
        this.f23589c = xVar;
        this.f23590d = uVar;
        this.f23602p = aVar;
        this.f23591e = kVar;
        this.f23601o = aVar2;
        this.f23593g = j10;
        this.f23594h = nVar;
        this.f23595i = bVar2;
        this.f23598l = interfaceC2624j;
        this.f23603q = b02;
        this.f23599m = new d(cVar, bVar3, bVar2);
        this.f23607u = interfaceC2624j.empty();
        g gVarD = cVar.d(i11);
        List list = gVarD.f10805d;
        this.f23610x = list;
        Pair pairW = w(uVar, interfaceC0299a, gVarD.f10804c, list);
        this.f23596j = (n0) pairW.first;
        this.f23597k = (a[]) pairW.second;
    }

    public static O1.e A(List list) {
        return z(list, "http://dashif.org/guidelines/trickmode");
    }

    public static o[] B(List list, int[] iArr) {
        for (int i10 : iArr) {
            O1.a aVar = (O1.a) list.get(i10);
            List list2 = ((O1.a) list.get(i10)).f10759d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                O1.e eVar = (O1.e) list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f10794a)) {
                    return K(eVar, f23585A, new o.b().y0("application/cea-608").j0(aVar.f10756a + ":cea608").P());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f10794a)) {
                    return K(eVar, f23586B, new o.b().y0("application/cea-708").j0(aVar.f10756a + ":cea708").P());
                }
            }
        }
        return new o[0];
    }

    public static int[][] C(List list) {
        O1.e eVarY;
        Integer num;
        int size = list.size();
        HashMap mapF = F.f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            mapF.put(Long.valueOf(((O1.a) list.get(i10)).f10756a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            O1.a aVar = (O1.a) list.get(i11);
            O1.e eVarA = A(aVar.f10760e);
            if (eVarA == null) {
                eVarA = A(aVar.f10761f);
            }
            int iIntValue = (eVarA == null || (num = (Integer) mapF.get(Long.valueOf(Long.parseLong(eVarA.f10795b)))) == null || !x(aVar, (O1.a) list.get(num.intValue()))) ? i11 : num.intValue();
            if (iIntValue == i11 && (eVarY = y(aVar.f10761f)) != null) {
                for (String str : M.h1(eVarY.f10795b, ",")) {
                    Integer num2 = (Integer) mapF.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null && x(aVar, (O1.a) list.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iIntValue);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrO = N7.g.o((Collection) arrayList.get(i12));
            iArr[i12] = iArrO;
            Arrays.sort(iArrO);
        }
        return iArr;
    }

    public static boolean F(List list, int[] iArr) {
        for (int i10 : iArr) {
            List list2 = ((O1.a) list.get(i10)).f10758c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!((O1.j) list2.get(i11)).f10820e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int G(int i10, List list, int[][] iArr, boolean[] zArr, o[][] oVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (F(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            o[] oVarArrB = B(list, iArr[i12]);
            oVarArr[i12] = oVarArrB;
            if (oVarArrB.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    public static void H(a.InterfaceC0299a interfaceC0299a, o[] oVarArr) {
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            oVarArr[i10] = interfaceC0299a.d(oVarArr[i10]);
        }
    }

    public static C2798h[] I(int i10) {
        return new C2798h[i10];
    }

    public static o[] K(O1.e eVar, Pattern pattern, o oVar) {
        String str = eVar.f10795b;
        if (str == null) {
            return new o[]{oVar};
        }
        String[] strArrH1 = M.h1(str, ";");
        o[] oVarArr = new o[strArrH1.length];
        for (int i10 = 0; i10 < strArrH1.length; i10++) {
            Matcher matcher = pattern.matcher(strArrH1[i10]);
            if (!matcher.matches()) {
                return new o[]{oVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            oVarArr[i10] = oVar.b().j0(oVar.f1791a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i11).Q(i11).n0(matcher.group(2)).P();
        }
        return oVarArr;
    }

    public static void s(List list, E[] eArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            f fVar = (f) list.get(i11);
            eArr[i10] = new E(fVar.a() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + i11, new o.b().j0(fVar.a()).y0("application/x-emsg").P());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    public static int t(u uVar, a.InterfaceC0299a interfaceC0299a, List list, int[][] iArr, int i10, boolean[] zArr, o[][] oVarArr, E[] eArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(((O1.a) list.get(i15)).f10758c);
            }
            int size = arrayList.size();
            o[] oVarArr2 = new o[size];
            for (int i16 = 0; i16 < size; i16++) {
                o oVar = ((O1.j) arrayList.get(i16)).f10817b;
                oVarArr2[i16] = oVar.b().X(uVar.b(oVar)).P();
            }
            O1.a aVar = (O1.a) list.get(iArr2[0]);
            long j10 = aVar.f10756a;
            String string = j10 != -1 ? Long.toString(j10) : "unset:" + i13;
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i14 + 2;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (oVarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            H(interfaceC0299a, oVarArr2);
            eArr[i14] = new E(string, oVarArr2);
            aVarArr[i14] = a.d(aVar.f10757b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                String str = string + ":emsg";
                eArr[i17] = new E(str, new o.b().j0(str).y0("application/x-emsg").P());
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                aVarArr[i11] = a.a(iArr2, i14, AbstractC1081v.w(oVarArr[i13]));
                H(interfaceC0299a, oVarArr[i13]);
                eArr[i11] = new E(string + ":cc", oVarArr[i13]);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    public static Pair w(u uVar, a.InterfaceC0299a interfaceC0299a, List list, List list2) {
        int[][] iArrC = C(list);
        int length = iArrC.length;
        boolean[] zArr = new boolean[length];
        o[][] oVarArr = new o[length][];
        int iG = G(length, list, iArrC, zArr, oVarArr) + length + list2.size();
        E[] eArr = new E[iG];
        a[] aVarArr = new a[iG];
        s(list2, eArr, aVarArr, t(uVar, interfaceC0299a, list, iArrC, length, zArr, oVarArr, eArr, aVarArr));
        return Pair.create(new n0(eArr), aVarArr);
    }

    public static boolean x(O1.a aVar, O1.a aVar2) {
        if (aVar.f10757b != aVar2.f10757b) {
            return false;
        }
        if (aVar.f10758c.isEmpty() || aVar2.f10758c.isEmpty()) {
            return true;
        }
        o oVar = ((O1.j) aVar.f10758c.get(0)).f10817b;
        o oVar2 = ((O1.j) aVar2.f10758c.get(0)).f10817b;
        return Objects.equals(oVar.f1794d, oVar2.f1794d) && (oVar.f1796f & (-16385)) == (oVar2.f1796f & (-16385));
    }

    public static O1.e y(List list) {
        return z(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static O1.e z(List list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            O1.e eVar = (O1.e) list.get(i10);
            if (str.equals(eVar.f10794a)) {
                return eVar;
            }
        }
        return null;
    }

    public final int D(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f23597k[i11].f23617e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f23597k[i14].f23615c == 0) {
                return i13;
            }
        }
        return -1;
    }

    public final int[] E(r[] rVarArr) {
        int[] iArr = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                iArr[i10] = this.f23596j.d(rVar.n());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void f(C2798h c2798h) {
        this.f23604r.f(this);
    }

    public void L() {
        this.f23599m.o();
        for (C2798h c2798h : this.f23605s) {
            c2798h.T(this);
        }
        this.f23604r = null;
    }

    public final void M(r[] rVarArr, boolean[] zArr, c0[] c0VarArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10] == null || !zArr[i10]) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var instanceof C2798h) {
                    ((C2798h) c0Var).T(this);
                } else if (c0Var instanceof C2798h.a) {
                    ((C2798h.a) c0Var).c();
                }
                c0VarArr[i10] = null;
            }
        }
    }

    public final void N(r[] rVarArr, c0[] c0VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if ((c0Var instanceof C2632s) || (c0Var instanceof C2798h.a)) {
                int iD = D(i10, iArr);
                if (iD == -1) {
                    z10 = c0VarArr[i10] instanceof C2632s;
                } else {
                    c0 c0Var2 = c0VarArr[i10];
                    z10 = (c0Var2 instanceof C2798h.a) && ((C2798h.a) c0Var2).f25030a == c0VarArr[iD];
                }
                if (!z10) {
                    c0 c0Var3 = c0VarArr[i10];
                    if (c0Var3 instanceof C2798h.a) {
                        ((C2798h.a) c0Var3).c();
                    }
                    c0VarArr[i10] = null;
                }
            }
        }
    }

    public final void O(r[] rVarArr, c0[] c0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f23597k[iArr[i10]];
                    int i11 = aVar.f23615c;
                    if (i11 == 0) {
                        c0VarArr[i10] = v(aVar, rVar, j10);
                    } else if (i11 == 2) {
                        c0VarArr[i10] = new j((f) this.f23610x.get(aVar.f23616d), rVar.n().a(0), this.f23608v.f10769d);
                    }
                } else if (c0Var instanceof C2798h) {
                    ((androidx.media3.exoplayer.dash.a) ((C2798h) c0Var).G()).b(rVar);
                }
            }
        }
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (c0VarArr[i12] == null && rVarArr[i12] != null) {
                a aVar2 = this.f23597k[iArr[i12]];
                if (aVar2.f23615c == 1) {
                    int iD = D(i12, iArr);
                    if (iD == -1) {
                        c0VarArr[i12] = new C2632s();
                    } else {
                        c0VarArr[i12] = ((C2798h) c0VarArr[iD]).W(j10, aVar2.f23614b);
                    }
                }
            }
        }
    }

    public void P(O1.c cVar, int i10) {
        this.f23608v = cVar;
        this.f23609w = i10;
        this.f23599m.q(cVar);
        C2798h[] c2798hArr = this.f23605s;
        if (c2798hArr != null) {
            for (C2798h c2798h : c2798hArr) {
                ((androidx.media3.exoplayer.dash.a) c2798h.G()).j(cVar, i10);
            }
            this.f23604r.f(this);
        }
        this.f23610x = cVar.d(i10).f10805d;
        for (j jVar : this.f23606t) {
            Iterator it = this.f23610x.iterator();
            while (true) {
                if (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.a().equals(jVar.b())) {
                        jVar.d(fVar, cVar.f10769d && i10 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // b2.C2798h.b
    public synchronized void a(C2798h c2798h) {
        d.c cVar = (d.c) this.f23600n.remove(c2798h);
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return this.f23607u.b();
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        for (C2798h c2798h : this.f23605s) {
            if (c2798h.f25005a == 2) {
                return c2798h.c(j10, k1Var);
            }
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f23607u.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        return this.f23607u.e(f02);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return this.f23607u.g();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        for (C2798h c2798h : this.f23605s) {
            if (!c2798h.d()) {
                c2798h.F(this.f23608v.g(this.f23609w));
            }
        }
        this.f23607u.h(j10);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) throws Throwable {
        for (C2798h c2798h : this.f23605s) {
            c2798h.V(j10);
        }
        for (j jVar : this.f23606t) {
            jVar.c(j10);
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        for (C2798h c2798h : this.f23605s) {
            if (c2798h.B()) {
                return this.f23612z;
            }
        }
        return -9223372036854775807L;
    }

    @Override // a2.InterfaceC2610C
    public long l(r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArrE = E(rVarArr);
        M(rVarArr, zArr, c0VarArr);
        N(rVarArr, c0VarArr, iArrE);
        O(rVarArr, c0VarArr, zArr2, j10, iArrE);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c0 c0Var : c0VarArr) {
            if (c0Var instanceof C2798h) {
                arrayList.add((C2798h) c0Var);
            } else if (c0Var instanceof j) {
                arrayList2.add((j) c0Var);
            }
        }
        C2798h[] c2798hArrI = I(arrayList.size());
        this.f23605s = c2798hArrI;
        arrayList.toArray(c2798hArrI);
        j[] jVarArr = new j[arrayList2.size()];
        this.f23606t = jVarArr;
        arrayList2.toArray(jVarArr);
        this.f23607u = this.f23598l.a(arrayList, D.k(arrayList, new J7.f() { // from class: N1.d
            @Override // J7.f
            public final Object apply(Object obj) {
                return AbstractC1081v.A(Integer.valueOf(((C2798h) obj).f25005a));
            }
        }));
        if (this.f23611y) {
            this.f23611y = false;
            this.f23612z = j10;
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public void m() {
        this.f23594h.a();
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f23604r = aVar;
        aVar.n(this);
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return this.f23596j;
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        for (C2798h c2798h : this.f23605s) {
            c2798h.u(j10, z10);
        }
    }

    public final C2798h v(a aVar, r rVar, long j10) {
        int i10;
        E eB;
        int i11;
        int i12 = aVar.f23618f;
        boolean z10 = i12 != -1;
        d.c cVarK = null;
        if (z10) {
            eB = this.f23596j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            eB = null;
        }
        int i13 = aVar.f23619g;
        AbstractC1081v abstractC1081vZ = i13 != -1 ? this.f23597k[i13].f23620h : AbstractC1081v.z();
        int size = i10 + abstractC1081vZ.size();
        o[] oVarArr = new o[size];
        int[] iArr = new int[size];
        if (z10) {
            oVarArr[0] = eB.a(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < abstractC1081vZ.size(); i14++) {
            o oVar = (o) abstractC1081vZ.get(i14);
            oVarArr[i11] = oVar;
            iArr[i11] = 3;
            arrayList.add(oVar);
            i11++;
        }
        if (this.f23608v.f10769d && z10) {
            cVarK = this.f23599m.k();
        }
        d.c cVar = cVarK;
        C2798h c2798h = new C2798h(aVar.f23614b, iArr, oVarArr, this.f23588b.e(this.f23594h, this.f23608v, this.f23592f, this.f23609w, aVar.f23613a, rVar, aVar.f23614b, this.f23593g, z10, arrayList, cVar, this.f23589c, this.f23603q, null), this, this.f23595i, j10, this.f23590d, this.f23602p, this.f23591e, this.f23601o, this.f23611y, null);
        synchronized (this) {
            this.f23600n.put(c2798h, cVar);
        }
        return c2798h;
    }
}
