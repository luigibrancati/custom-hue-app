package com.google.protobuf;

import com.google.protobuf.Q0;
import com.google.protobuf.R0;
import com.google.protobuf.Z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3730n implements R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3728m f32323a;

    /* JADX INFO: renamed from: com.google.protobuf.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32324a;

        static {
            int[] iArr = new int[Q0.b.values().length];
            f32324a = iArr;
            try {
                iArr[Q0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32324a[Q0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32324a[Q0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32324a[Q0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32324a[Q0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32324a[Q0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32324a[Q0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32324a[Q0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32324a[Q0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32324a[Q0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32324a[Q0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32324a[Q0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C3730n(AbstractC3728m abstractC3728m) {
        AbstractC3728m abstractC3728m2 = (AbstractC3728m) N.b(abstractC3728m, "output");
        this.f32323a = abstractC3728m2;
        abstractC3728m2.f32312a = this;
    }

    public static C3730n P(AbstractC3728m abstractC3728m) {
        C3730n c3730n = abstractC3728m.f32312a;
        return c3730n != null ? c3730n : new C3730n(abstractC3728m);
    }

    @Override // com.google.protobuf.R0
    public void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.j0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += AbstractC3728m.f(((Boolean) list.get(i12)).booleanValue());
        }
        this.f32323a.X0(iF);
        while (i11 < list.size()) {
            this.f32323a.k0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void B(int i10, float f10) {
        this.f32323a.x0(i10, f10);
    }

    @Override // com.google.protobuf.R0
    public void C(int i10) {
        this.f32323a.V0(i10, 4);
    }

    @Override // com.google.protobuf.R0
    public void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.P0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += AbstractC3728m.P(((Integer) list.get(i12)).intValue());
        }
        this.f32323a.X0(iP);
        while (i11 < list.size()) {
            this.f32323a.Q0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void E(int i10, int i11) {
        this.f32323a.r0(i10, i11);
    }

    @Override // com.google.protobuf.R0
    public void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.F0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += AbstractC3728m.z(((Long) list.get(i12)).longValue());
        }
        this.f32323a.X0(iZ);
        while (i11 < list.size()) {
            this.f32323a.G0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.p0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC3728m.k(((Double) list.get(i12)).doubleValue());
        }
        this.f32323a.X0(iK);
        while (i11 < list.size()) {
            this.f32323a.q0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void H(int i10, int i11) {
        this.f32323a.P0(i10, i11);
    }

    @Override // com.google.protobuf.R0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f32323a.n0(i10, (AbstractC3722j) list.get(i11));
        }
    }

    @Override // com.google.protobuf.R0
    public void J(int i10, List list, A0 a02) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), a02);
        }
    }

    @Override // com.google.protobuf.R0
    public void K(int i10, Object obj, A0 a02) {
        this.f32323a.A0(i10, (InterfaceC3717g0) obj, a02);
    }

    @Override // com.google.protobuf.R0
    public void L(int i10, AbstractC3722j abstractC3722j) {
        this.f32323a.n0(i10, abstractC3722j);
    }

    @Override // com.google.protobuf.R0
    public void M(int i10, List list, A0 a02) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), a02);
        }
    }

    @Override // com.google.protobuf.R0
    public void N(int i10, Object obj, A0 a02) {
        this.f32323a.H0(i10, (InterfaceC3717g0) obj, a02);
    }

    @Override // com.google.protobuf.R0
    public void O(int i10, Z.a aVar, Map map) {
        if (this.f32323a.d0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f32323a.V0(i10, 2);
            this.f32323a.X0(Z.b(aVar, entry.getKey(), entry.getValue()));
            Z.e(this.f32323a, aVar, entry.getKey(), entry.getValue());
        }
    }

    public final void Q(int i10, boolean z10, Object obj, Z.a aVar) {
        this.f32323a.V0(i10, 2);
        this.f32323a.X0(Z.b(aVar, Boolean.valueOf(z10), obj));
        Z.e(this.f32323a, aVar, Boolean.valueOf(z10), obj);
    }

    public final void R(int i10, Z.a aVar, Map map) {
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
            this.f32323a.V0(i10, 2);
            this.f32323a.X0(Z.b(aVar, Integer.valueOf(i13), obj));
            Z.e(this.f32323a, aVar, Integer.valueOf(i13), obj);
        }
    }

    public final void S(int i10, Z.a aVar, Map map) {
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
            this.f32323a.V0(i10, 2);
            this.f32323a.X0(Z.b(aVar, Long.valueOf(j10), obj));
            Z.e(this.f32323a, aVar, Long.valueOf(j10), obj);
        }
    }

    public final void T(int i10, Z.a aVar, Map map) {
        switch (a.f32324a[aVar.f32211a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f32211a);
        }
    }

    public final void U(int i10, Z.a aVar, Map map) {
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
            this.f32323a.V0(i10, 2);
            this.f32323a.X0(Z.b(aVar, str, obj));
            Z.e(this.f32323a, aVar, str, obj);
        }
    }

    public final void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f32323a.T0(i10, (String) obj);
        } else {
            this.f32323a.n0(i10, (AbstractC3722j) obj);
        }
    }

    @Override // com.google.protobuf.R0
    public void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.x0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += AbstractC3728m.s(((Float) list.get(i12)).floatValue());
        }
        this.f32323a.X0(iS);
        while (i11 < list.size()) {
            this.f32323a.y0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public final void b(int i10, Object obj) {
        if (obj instanceof AbstractC3722j) {
            this.f32323a.K0(i10, (AbstractC3722j) obj);
        } else {
            this.f32323a.J0(i10, (InterfaceC3717g0) obj);
        }
    }

    @Override // com.google.protobuf.R0
    public void c(int i10, int i11) {
        this.f32323a.t0(i10, i11);
    }

    @Override // com.google.protobuf.R0
    public void d(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof V)) {
            while (i11 < list.size()) {
                this.f32323a.T0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            V v10 = (V) list;
            while (i11 < list.size()) {
                V(i10, v10.W0(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.R0
    public void e(int i10, String str) {
        this.f32323a.T0(i10, str);
    }

    @Override // com.google.protobuf.R0
    public void f(int i10, long j10) {
        this.f32323a.Y0(i10, j10);
    }

    @Override // com.google.protobuf.R0
    public void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.D0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += AbstractC3728m.x(((Integer) list.get(i12)).intValue());
        }
        this.f32323a.X0(iX);
        while (i11 < list.size()) {
            this.f32323a.E0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void h(int i10, int i11) {
        this.f32323a.D0(i10, i11);
    }

    @Override // com.google.protobuf.R0
    public void i(int i10, long j10) {
        this.f32323a.N0(i10, j10);
    }

    @Override // com.google.protobuf.R0
    public void j(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.t0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += AbstractC3728m.o(((Integer) list.get(i12)).intValue());
        }
        this.f32323a.X0(iO);
        while (i11 < list.size()) {
            this.f32323a.u0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.W0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += AbstractC3728m.W(((Integer) list.get(i12)).intValue());
        }
        this.f32323a.X0(iW);
        while (i11 < list.size()) {
            this.f32323a.X0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.R0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += AbstractC3728m.R(((Long) list.get(i12)).longValue());
        }
        this.f32323a.X0(iR);
        while (i11 < list.size()) {
            this.f32323a.S0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void m(int i10, long j10) {
        this.f32323a.R0(i10, j10);
    }

    @Override // com.google.protobuf.R0
    public void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.r0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += AbstractC3728m.m(((Integer) list.get(i12)).intValue());
        }
        this.f32323a.X0(iM);
        while (i11 < list.size()) {
            this.f32323a.s0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void o(int i10, int i11) {
        this.f32323a.W0(i10, i11);
    }

    @Override // com.google.protobuf.R0
    public void p(int i10, double d10) {
        this.f32323a.p0(i10, d10);
    }

    @Override // com.google.protobuf.R0
    public void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.N0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += AbstractC3728m.N(((Long) list.get(i12)).longValue());
        }
        this.f32323a.X0(iN);
        while (i11 < list.size()) {
            this.f32323a.O0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.Y0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += AbstractC3728m.Y(((Long) list.get(i12)).longValue());
        }
        this.f32323a.X0(iY);
        while (i11 < list.size()) {
            this.f32323a.Z0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void s(int i10, long j10) {
        this.f32323a.v0(i10, j10);
    }

    @Override // com.google.protobuf.R0
    public R0.a t() {
        return R0.a.ASCENDING;
    }

    @Override // com.google.protobuf.R0
    public void u(int i10, long j10) {
        this.f32323a.F0(i10, j10);
    }

    @Override // com.google.protobuf.R0
    public void v(int i10, boolean z10) {
        this.f32323a.j0(i10, z10);
    }

    @Override // com.google.protobuf.R0
    public void w(int i10, int i11) {
        this.f32323a.L0(i10, i11);
    }

    @Override // com.google.protobuf.R0
    public void x(int i10) {
        this.f32323a.V0(i10, 3);
    }

    @Override // com.google.protobuf.R0
    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.v0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC3728m.q(((Long) list.get(i12)).longValue());
        }
        this.f32323a.X0(iQ);
        while (i11 < list.size()) {
            this.f32323a.w0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.R0
    public void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f32323a.L0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f32323a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC3728m.L(((Integer) list.get(i12)).intValue());
        }
        this.f32323a.X0(iL);
        while (i11 < list.size()) {
            this.f32323a.M0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}
