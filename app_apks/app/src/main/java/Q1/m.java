package Q1;

import D1.C0753k;
import D1.E;
import D1.o;
import G1.AbstractC0853a;
import G1.M;
import I1.x;
import K1.F0;
import K1.k1;
import K7.AbstractC1081v;
import L1.B0;
import P1.t;
import Q1.s;
import R1.h;
import R1.l;
import a2.InterfaceC2610C;
import a2.InterfaceC2624j;
import a2.L;
import a2.d0;
import a2.n0;
import android.net.Uri;
import android.text.TextUtils;
import e2.k;
import io.sentry.protocol.SentryThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC2610C, l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R1.l f13413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f13414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f13415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P1.u f13416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t.a f13417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2.k f13418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L.a f13419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2.b f13420i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC2624j f13423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f13424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f13425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B0 f13427p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC2610C.a f13430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n0 f13432u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d0 f13437z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s.b f13428q = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentityHashMap f13421j = new IdentityHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v f13422k = new v();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s[] f13433v = new s[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s[] f13434w = new s[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[][] f13435x = new int[0][];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements s.b {
        public b() {
        }

        @Override // a2.d0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(s sVar) {
            m.this.f13430s.f(m.this);
        }

        @Override // Q1.s.b
        public void j() {
            if (m.n(m.this) > 0) {
                return;
            }
            int i10 = 0;
            for (s sVar : m.this.f13433v) {
                i10 += sVar.q().f20863a;
            }
            E[] eArr = new E[i10];
            int i11 = 0;
            for (s sVar2 : m.this.f13433v) {
                int i12 = sVar2.q().f20863a;
                int i13 = 0;
                while (i13 < i12) {
                    eArr[i11] = sVar2.q().b(i13);
                    i13++;
                    i11++;
                }
            }
            m.this.f13432u = new n0(eArr);
            m.this.f13430s.n(m.this);
        }

        @Override // Q1.s.b
        public void o(Uri uri) {
            m.this.f13413b.e(uri);
        }
    }

    public m(h hVar, R1.l lVar, g gVar, x xVar, e2.e eVar, P1.u uVar, t.a aVar, e2.k kVar, L.a aVar2, e2.b bVar, InterfaceC2624j interfaceC2624j, boolean z10, int i10, boolean z11, B0 b02, long j10) {
        this.f13412a = hVar;
        this.f13413b = lVar;
        this.f13414c = gVar;
        this.f13415d = xVar;
        this.f13416e = uVar;
        this.f13417f = aVar;
        this.f13418g = kVar;
        this.f13419h = aVar2;
        this.f13420i = bVar;
        this.f13423l = interfaceC2624j;
        this.f13424m = z10;
        this.f13425n = i10;
        this.f13426o = z11;
        this.f13427p = b02;
        this.f13429r = j10;
        this.f13437z = interfaceC2624j.empty();
    }

    public static D1.o A(D1.o oVar, D1.o oVar2, boolean z10) {
        D1.u uVar;
        int i10;
        String str;
        String str2;
        List list;
        int i11;
        int i12;
        String str3;
        AbstractC1081v abstractC1081vZ = AbstractC1081v.z();
        if (oVar2 != null) {
            str2 = oVar2.f1801k;
            uVar = oVar2.f1802l;
            i11 = oVar2.f1780G;
            i10 = oVar2.f1795e;
            i12 = oVar2.f1796f;
            str = oVar2.f1794d;
            str3 = oVar2.f1792b;
            list = oVar2.f1793c;
        } else {
            String strT = M.T(oVar.f1801k, 1);
            uVar = oVar.f1802l;
            if (z10) {
                i11 = oVar.f1780G;
                i10 = oVar.f1795e;
                i12 = oVar.f1796f;
                str = oVar.f1794d;
                str3 = oVar.f1792b;
                str2 = strT;
                list = oVar.f1793c;
            } else {
                i10 = 0;
                str = null;
                str2 = strT;
                list = abstractC1081vZ;
                i11 = -1;
                i12 = 0;
                str3 = null;
            }
        }
        return new o.b().j0(oVar.f1791a).l0(str3).m0(list).W(oVar.f1804n).y0(D1.v.g(str2)).U(str2).r0(uVar).S(z10 ? oVar.f1798h : -1).t0(z10 ? oVar.f1799i : -1).T(i11).A0(i10).w0(i12).n0(str).P();
    }

    public static Map B(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C0753k c0753kF = (C0753k) list.get(i10);
            String str = c0753kF.f1726c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                C0753k c0753k = (C0753k) arrayList.get(i11);
                if (TextUtils.equals(c0753k.f1726c, str)) {
                    c0753kF = c0753kF.f(c0753k);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, c0753kF);
        }
        return map;
    }

    public static D1.o C(D1.o oVar) {
        String strT = M.T(oVar.f1801k, 2);
        return new o.b().j0(oVar.f1791a).l0(oVar.f1792b).m0(oVar.f1793c).W(oVar.f1804n).y0(D1.v.g(strT)).U(strT).r0(oVar.f1802l).S(oVar.f1798h).t0(oVar.f1799i).F0(oVar.f1812v).h0(oVar.f1813w).f0(oVar.f1816z).A0(oVar.f1795e).w0(oVar.f1796f).P();
    }

    public static /* synthetic */ int n(m mVar) {
        int i10 = mVar.f13431t - 1;
        mVar.f13431t = i10;
        return i10;
    }

    public void D() {
        this.f13413b.f(this);
        for (s sVar : this.f13433v) {
            sVar.j0();
        }
        this.f13430s = null;
    }

    @Override // R1.l.b
    public boolean a(Uri uri, k.c cVar, boolean z10) {
        boolean zE0 = true;
        for (s sVar : this.f13433v) {
            zE0 &= sVar.e0(uri, cVar, z10);
        }
        this.f13430s.f(this);
        return zE0;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return this.f13437z.b();
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        for (s sVar : this.f13434w) {
            if (sVar.T()) {
                return sVar.c(j10, k1Var);
            }
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f13437z.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        if (this.f13432u != null) {
            return this.f13437z.e(f02);
        }
        for (s sVar : this.f13433v) {
            sVar.D();
        }
        return false;
    }

    @Override // R1.l.b
    public void f() {
        for (s sVar : this.f13433v) {
            sVar.f0();
        }
        this.f13430s.f(this);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return this.f13437z.g();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        this.f13437z.h(j10);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        s[] sVarArr = this.f13434w;
        if (sVarArr.length > 0) {
            boolean zM0 = sVarArr[0].m0(j10, false);
            int i10 = 1;
            while (true) {
                s[] sVarArr2 = this.f13434w;
                if (i10 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i10].m0(j10, zM0);
                i10++;
            }
            if (zM0) {
                this.f13422k.b();
            }
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // a2.InterfaceC2610C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long l(d2.r[] r21, boolean[] r22, a2.c0[] r23, boolean[] r24, long r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.m.l(d2.r[], boolean[], a2.c0[], boolean[], long):long");
    }

    @Override // a2.InterfaceC2610C
    public void m() throws IOException {
        for (s sVar : this.f13433v) {
            sVar.m();
        }
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f13430s = aVar;
        this.f13413b.j(this);
        x(j10);
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return (n0) AbstractC0853a.e(this.f13432u);
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        for (s sVar : this.f13434w) {
            sVar.u(j10, z10);
        }
    }

    public final void v(long j10, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = ((h.a) list.get(i10)).f14413d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (Objects.equals(str, ((h.a) list.get(i11)).f14413d)) {
                        h.a aVar = (h.a) list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f14410a);
                        arrayList2.add(aVar.f14411b);
                        z10 &= M.S(aVar.f14411b.f1801k, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                s sVarZ = z(str2, 1, (Uri[]) arrayList.toArray((Uri[]) M.j(new Uri[0])), (D1.o[]) arrayList2.toArray(new D1.o[0]), null, Collections.EMPTY_LIST, map, j10);
                list3.add(N7.g.o(arrayList3));
                list2.add(sVarZ);
                if (this.f13424m && z10) {
                    sVarZ.h0(new E[]{new E(str2, (D1.o[]) arrayList2.toArray(new D1.o[0]))}, 0, new int[0]);
                }
            }
        }
    }

    public final void w(R1.h hVar, long j10, List list, List list2, Map map) {
        int i10;
        boolean z10;
        boolean z11;
        int size = hVar.f14401e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < hVar.f14401e.size(); i13++) {
            D1.o oVar = ((h.b) hVar.f14401e.get(i13)).f14415b;
            if (oVar.f1813w > 0 || M.T(oVar.f1801k, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (M.T(oVar.f1801k, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            i10 = i11;
            z11 = false;
            z10 = true;
        } else if (i12 < size) {
            i10 = size - i12;
            z10 = false;
            z11 = true;
        } else {
            i10 = size;
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[i10];
        D1.o[] oVarArr = new D1.o[i10];
        int[] iArr2 = new int[i10];
        int i14 = 0;
        for (int i15 = 0; i15 < hVar.f14401e.size(); i15++) {
            if ((!z10 || iArr[i15] == 2) && (!z11 || iArr[i15] != 1)) {
                h.b bVar = (h.b) hVar.f14401e.get(i15);
                uriArr[i14] = bVar.f14414a;
                oVarArr[i14] = bVar.f14415b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = oVarArr[0].f1801k;
        int iS = M.S(str, 2);
        int iS2 = M.S(str, 1);
        boolean z12 = (iS2 == 1 || (iS2 == 0 && hVar.f14403g.isEmpty())) && iS <= 1 && iS2 + iS > 0;
        s sVarZ = z(SentryThread.JsonKeys.MAIN, (z10 || iS2 <= 0) ? 0 : 1, uriArr, oVarArr, hVar.f14406j, hVar.f14407k, map, j10);
        list.add(sVarZ);
        list2.add(iArr2);
        if (this.f13424m && z12) {
            ArrayList arrayList = new ArrayList();
            if (iS > 0) {
                D1.o[] oVarArr2 = new D1.o[i10];
                for (int i16 = 0; i16 < i10; i16++) {
                    oVarArr2[i16] = C(oVarArr[i16]);
                }
                arrayList.add(new E(SentryThread.JsonKeys.MAIN, oVarArr2));
                if (iS2 > 0 && (hVar.f14406j != null || hVar.f14403g.isEmpty())) {
                    arrayList.add(new E(SentryThread.JsonKeys.MAIN + ":audio", A(oVarArr[0], hVar.f14406j, false)));
                }
                List list3 = hVar.f14407k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new E(SentryThread.JsonKeys.MAIN + ":cc:" + i17, this.f13412a.d((D1.o) list3.get(i17))));
                    }
                }
            } else {
                D1.o[] oVarArr3 = new D1.o[i10];
                for (int i18 = 0; i18 < i10; i18++) {
                    oVarArr3[i18] = A(oVarArr[i18], hVar.f14406j, true);
                }
                arrayList.add(new E(SentryThread.JsonKeys.MAIN, oVarArr3));
            }
            E e10 = new E(SentryThread.JsonKeys.MAIN + ":id3", new o.b().j0("ID3").y0("application/id3").P());
            arrayList.add(e10);
            sVarZ.h0((E[]) arrayList.toArray(new E[0]), 0, arrayList.indexOf(e10));
        }
    }

    public final void x(long j10) {
        ArrayList arrayList;
        List list;
        m mVar;
        long j11;
        R1.h hVar = (R1.h) AbstractC0853a.e(this.f13413b.d());
        Map mapB = this.f13426o ? B(hVar.f14409m) : Collections.EMPTY_MAP;
        boolean zIsEmpty = hVar.f14401e.isEmpty();
        List list2 = hVar.f14403g;
        List list3 = hVar.f14404h;
        this.f13431t = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (zIsEmpty) {
            arrayList = arrayList3;
            list = list2;
            mVar = this;
            j11 = j10;
        } else {
            w(hVar, j10, arrayList2, arrayList3, mapB);
            arrayList2 = arrayList2;
            j11 = j10;
            arrayList = arrayList3;
            list = list2;
            mVar = this;
        }
        mVar.v(j11, list, arrayList2, arrayList, mapB);
        mVar.f13436y = arrayList2.size();
        mVar.y(j11, list3, arrayList2, arrayList, mapB);
        mVar.f13433v = (s[]) arrayList2.toArray(new s[0]);
        mVar.f13435x = (int[][]) arrayList.toArray(new int[0][]);
        mVar.f13431t = mVar.f13433v.length;
        for (int i10 = 0; i10 < mVar.f13436y; i10++) {
            mVar.f13433v[i10].q0(true);
        }
        for (s sVar : mVar.f13433v) {
            sVar.D();
        }
        mVar.f13434w = mVar.f13433v;
    }

    public final void y(long j10, List list, List list2, List list3, Map map) {
        List list4 = list;
        ArrayList arrayList = new ArrayList(list4.size());
        ArrayList arrayList2 = new ArrayList(list4.size());
        ArrayList arrayList3 = new ArrayList(list4.size());
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = 0;
        while (i11 < list4.size()) {
            String str = ((h.a) list4.get(i11)).f14413d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i12 = i10; i12 < list4.size(); i12++) {
                    if (Objects.equals(str, ((h.a) list4.get(i12)).f14413d)) {
                        h.a aVar = (h.a) list4.get(i12);
                        arrayList3.add(Integer.valueOf(i12));
                        arrayList.add(aVar.f14410a);
                        arrayList2.add(aVar.f14411b);
                    }
                }
                String str2 = "subtitle:" + str;
                D1.o[] oVarArr = (D1.o[]) arrayList2.toArray(new D1.o[i10]);
                s sVarZ = z(str2, 3, (Uri[]) arrayList.toArray((Uri[]) M.j(new Uri[i10])), oVarArr, null, AbstractC1081v.z(), map, j10);
                list3.add(N7.g.o(arrayList3));
                list2.add(sVarZ);
                int length = oVarArr.length;
                D1.o[] oVarArr2 = new D1.o[length];
                for (int i13 = i10; i13 < length; i13++) {
                    oVarArr2[i13] = this.f13412a.d(oVarArr[i13]);
                }
                i10 = 0;
                sVarZ.h0(new E[]{new E(str2, oVarArr2)}, 0, new int[0]);
            }
            i11++;
            list4 = list;
        }
    }

    public final s z(String str, int i10, Uri[] uriArr, D1.o[] oVarArr, D1.o oVar, List list, Map map, long j10) {
        return new s(str, i10, this.f13428q, new f(this.f13412a, this.f13413b, uriArr, oVarArr, this.f13414c, this.f13415d, this.f13422k, this.f13429r, list, this.f13427p, null), map, this.f13420i, j10, oVar, this.f13416e, this.f13417f, this.f13418g, this.f13419h, this.f13425n);
    }
}
