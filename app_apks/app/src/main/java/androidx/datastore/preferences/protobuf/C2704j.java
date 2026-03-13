package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.m0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2704j implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2703i f22854a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22855a;

        static {
            int[] iArr = new int[l0.b.values().length];
            f22855a = iArr;
            try {
                iArr[l0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22855a[l0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22855a[l0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22855a[l0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22855a[l0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22855a[l0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22855a[l0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22855a[l0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22855a[l0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22855a[l0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22855a[l0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22855a[l0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C2704j(AbstractC2703i abstractC2703i) {
        AbstractC2703i abstractC2703i2 = (AbstractC2703i) AbstractC2714u.b(abstractC2703i, "output");
        this.f22854a = abstractC2703i2;
        abstractC2703i2.f22843a = this;
    }

    public static C2704j P(AbstractC2703i abstractC2703i) {
        C2704j c2704j = abstractC2703i.f22843a;
        return c2704j != null ? c2704j : new C2704j(abstractC2703i);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void A(int i10, List list, boolean z10) {
        Q(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void B(int i10, float f10) {
        this.f22854a.u0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void C(int i10) {
        this.f22854a.S0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void D(int i10, List list, boolean z10) {
        f0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void E(int i10, int i11) {
        this.f22854a.o0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void F(int i10, List list, boolean z10) {
        c0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void G(int i10, List list, boolean z10) {
        W(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void H(int i10, int i11) {
        this.f22854a.M0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f22854a.k0(i10, (AbstractC2700f) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void J(int i10, List list, Z z10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void K(int i10, AbstractC2700f abstractC2700f) {
        this.f22854a.k0(i10, abstractC2700f);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void L(int i10, Object obj, Z z10) {
        this.f22854a.E0(i10, (K) obj, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void M(int i10, D.a aVar, Map map) {
        if (this.f22854a.a0()) {
            U(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f22854a.S0(i10, 2);
            this.f22854a.U0(D.b(aVar, entry.getKey(), entry.getValue()));
            D.e(this.f22854a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void N(int i10, Object obj, Z z10) {
        this.f22854a.x0(i10, (K) obj, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void O(int i10, List list, Z z10) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), z10);
        }
    }

    public final void Q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.g0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += AbstractC2703i.e(((Boolean) list.get(i12)).booleanValue());
        }
        this.f22854a.U0(iE);
        while (i11 < list.size()) {
            this.f22854a.h0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void R(int i10, boolean z10, Object obj, D.a aVar) {
        this.f22854a.S0(i10, 2);
        this.f22854a.U0(D.b(aVar, Boolean.valueOf(z10), obj));
        D.e(this.f22854a, aVar, Boolean.valueOf(z10), obj);
    }

    public final void S(int i10, D.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f22854a.S0(i10, 2);
            this.f22854a.U0(D.b(aVar, Integer.valueOf(i13), obj));
            D.e(this.f22854a, aVar, Integer.valueOf(i13), obj);
        }
    }

    public final void T(int i10, D.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f22854a.S0(i10, 2);
            this.f22854a.U0(D.b(aVar, Long.valueOf(j10), obj));
            D.e(this.f22854a, aVar, Long.valueOf(j10), obj);
        }
    }

    public final void U(int i10, D.a aVar, Map map) {
        switch (a.f22855a[aVar.f22721a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                T(i10, aVar, map);
                return;
            case 12:
                V(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f22721a);
        }
    }

    public final void V(int i10, D.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f22854a.S0(i10, 2);
            this.f22854a.U0(D.b(aVar, str, obj));
            D.e(this.f22854a, aVar, str, obj);
        }
    }

    public final void W(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.m0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += AbstractC2703i.j(((Double) list.get(i12)).doubleValue());
        }
        this.f22854a.U0(iJ);
        while (i11 < list.size()) {
            this.f22854a.n0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public final void X(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.o0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC2703i.l(((Integer) list.get(i12)).intValue());
        }
        this.f22854a.U0(iL);
        while (i11 < list.size()) {
            this.f22854a.p0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void Y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.q0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += AbstractC2703i.n(((Integer) list.get(i12)).intValue());
        }
        this.f22854a.U0(iN);
        while (i11 < list.size()) {
            this.f22854a.r0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void Z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.s0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += AbstractC2703i.p(((Long) list.get(i12)).longValue());
        }
        this.f22854a.U0(iP);
        while (i11 < list.size()) {
            this.f22854a.t0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void a(int i10, List list, boolean z10) {
        a0(i10, list, z10);
    }

    public final void a0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.u0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += AbstractC2703i.r(((Float) list.get(i12)).floatValue());
        }
        this.f22854a.U0(iR);
        while (i11 < list.size()) {
            this.f22854a.v0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void b(int i10, Object obj) {
        if (obj instanceof AbstractC2700f) {
            this.f22854a.H0(i10, (AbstractC2700f) obj);
        } else {
            this.f22854a.G0(i10, (K) obj);
        }
    }

    public final void b0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.A0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += AbstractC2703i.w(((Integer) list.get(i12)).intValue());
        }
        this.f22854a.U0(iW);
        while (i11 < list.size()) {
            this.f22854a.B0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void c(int i10, int i11) {
        this.f22854a.q0(i10, i11);
    }

    public final void c0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.C0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += AbstractC2703i.y(((Long) list.get(i12)).longValue());
        }
        this.f22854a.U0(iY);
        while (i11 < list.size()) {
            this.f22854a.D0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f22854a.Q0(i10, (String) list.get(i11));
        }
    }

    public final void d0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.I0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int I10 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            I10 += AbstractC2703i.I(((Integer) list.get(i12)).intValue());
        }
        this.f22854a.U0(I10);
        while (i11 < list.size()) {
            this.f22854a.J0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void e(int i10, String str) {
        this.f22854a.Q0(i10, str);
    }

    public final void e0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.K0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC2703i.K(((Long) list.get(i12)).longValue());
        }
        this.f22854a.U0(iK);
        while (i11 < list.size()) {
            this.f22854a.L0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void f(int i10, long j10) {
        this.f22854a.V0(i10, j10);
    }

    public void f0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.M0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += AbstractC2703i.M(((Integer) list.get(i12)).intValue());
        }
        this.f22854a.U0(iM);
        while (i11 < list.size()) {
            this.f22854a.N0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void g(int i10, List list, boolean z10) {
        b0(i10, list, z10);
    }

    public final void g0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.O0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += AbstractC2703i.O(((Long) list.get(i12)).longValue());
        }
        this.f22854a.U0(iO);
        while (i11 < list.size()) {
            this.f22854a.P0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void h(int i10, int i11) {
        this.f22854a.A0(i10, i11);
    }

    public void h0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.T0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += AbstractC2703i.T(((Integer) list.get(i12)).intValue());
        }
        this.f22854a.U0(iT);
        while (i11 < list.size()) {
            this.f22854a.U0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void i(int i10, long j10) {
        this.f22854a.K0(i10, j10);
    }

    public final void i0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f22854a.V0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f22854a.S0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC2703i.V(((Long) list.get(i12)).longValue());
        }
        this.f22854a.U0(iV);
        while (i11 < list.size()) {
            this.f22854a.W0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void j(int i10, List list, boolean z10) {
        Y(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void k(int i10, List list, boolean z10) {
        h0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void l(int i10, List list, boolean z10) {
        g0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void m(int i10, long j10) {
        this.f22854a.O0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void n(int i10, List list, boolean z10) {
        X(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void o(int i10, int i11) {
        this.f22854a.T0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void p(int i10, double d10) {
        this.f22854a.m0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void q(int i10, List list, boolean z10) {
        e0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void r(int i10, List list, boolean z10) {
        i0(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void s(int i10, long j10) {
        this.f22854a.s0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public m0.a t() {
        return m0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void u(int i10, long j10) {
        this.f22854a.C0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void v(int i10, boolean z10) {
        this.f22854a.g0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void w(int i10, int i11) {
        this.f22854a.I0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void x(int i10) {
        this.f22854a.S0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void y(int i10, List list, boolean z10) {
        Z(i10, list, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void z(int i10, List list, boolean z10) {
        d0(i10, list, z10);
    }
}
