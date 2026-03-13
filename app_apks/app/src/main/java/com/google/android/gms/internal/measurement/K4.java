package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K4 implements InterfaceC3248l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J4 f29252a;

    public K4(J4 j42) {
        Charset charset = AbstractC3211h5.f29486a;
        this.f29252a = j42;
        j42.f29245a = this;
    }

    public static K4 M(J4 j42) {
        K4 k42 = j42.f29245a;
        return k42 != null ? k42 : new K4(j42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void A(int i10, long j10) {
        this.f29252a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3157b5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += J4.G(((Integer) list.get(i12)).intValue());
            }
            j42.z(iG);
            while (i11 < list.size()) {
                j42.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        if (!z10) {
            while (i11 < c3157b5.size()) {
                this.f29252a.k(i10, c3157b5.e(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c3157b5.size(); i13++) {
            iG2 += J4.G(c3157b5.e(i13));
        }
        j43.z(iG2);
        while (i11 < c3157b5.size()) {
            j43.z(c3157b5.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void C(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f29252a.q(i10, (E4) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29252a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        J4 j42 = this.f29252a;
        j42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        j42.z(i12);
        while (i11 < list.size()) {
            j42.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void E(int i10, int i11) {
        this.f29252a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void F(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f29252a.p(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void G(int i10, int i11) {
        J4 j42 = this.f29252a;
        j42.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3157b5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            j42.z(i12);
            while (i11 < list.size()) {
                j42.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        if (!z10) {
            while (i11 < c3157b5.size()) {
                this.f29252a.l(i10, c3157b5.e(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3157b5.size(); i15++) {
            c3157b5.e(i15);
            i14 += 4;
        }
        j43.z(i14);
        while (i11 < c3157b5.size()) {
            j43.A(c3157b5.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void I(int i10, Object obj) {
        boolean z10 = obj instanceof E4;
        J4 j42 = this.f29252a;
        if (z10) {
            j42.v(i10, (E4) obj);
        } else {
            j42.u(i10, (C5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void J(int i10, boolean z10) {
        this.f29252a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3157b5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += J4.a(((Integer) list.get(i12)).intValue());
            }
            j42.z(iA);
            while (i11 < list.size()) {
                j42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        if (!z10) {
            while (i11 < c3157b5.size()) {
                this.f29252a.j(i10, c3157b5.e(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3157b5.size(); i13++) {
            iA2 += J4.a(c3157b5.e(i13));
        }
        j43.z(iA2);
        while (i11 < c3157b5.size()) {
            j43.y(c3157b5.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void L(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3157b5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += J4.a(((Integer) list.get(i12)).intValue());
            }
            j42.z(iA);
            while (i11 < list.size()) {
                j42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        if (!z10) {
            while (i11 < c3157b5.size()) {
                this.f29252a.j(i10, c3157b5.e(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3157b5.size(); i13++) {
            iA2 += J4.a(c3157b5.e(i13));
        }
        j43.z(iA2);
        while (i11 < c3157b5.size()) {
            j43.y(c3157b5.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3292q5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            j42.z(i12);
            while (i11 < list.size()) {
                j42.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        if (!z10) {
            while (i11 < c3292q5.size()) {
                this.f29252a.n(i10, c3292q5.S(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3292q5.size(); i15++) {
            c3292q5.S(i15);
            i14 += 8;
        }
        j43.z(i14);
        while (i11 < c3292q5.size()) {
            j43.C(c3292q5.S(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void b(int i10, double d10) {
        this.f29252a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3292q5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    J4 j42 = this.f29252a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    j42.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            J4 j43 = this.f29252a;
            j43.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += J4.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            j43.z(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                j43.B((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        if (!z10) {
            while (i11 < c3292q5.size()) {
                J4 j44 = this.f29252a;
                long jS = c3292q5.S(i11);
                j44.m(i10, (jS >> 63) ^ (jS + jS));
                i11++;
            }
            return;
        }
        J4 j45 = this.f29252a;
        j45.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3292q5.size(); i13++) {
            long jS2 = c3292q5.S(i13);
            iA2 += J4.a((jS2 >> 63) ^ (jS2 + jS2));
        }
        j45.z(iA2);
        while (i11 < c3292q5.size()) {
            long jS3 = c3292q5.S(i11);
            j45.B((jS3 >> 63) ^ (jS3 + jS3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3292q5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += J4.a(((Long) list.get(i12)).longValue());
            }
            j42.z(iA);
            while (i11 < list.size()) {
                j42.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        if (!z10) {
            while (i11 < c3292q5.size()) {
                this.f29252a.m(i10, c3292q5.S(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3292q5.size(); i13++) {
            iA2 += J4.a(c3292q5.S(i13));
        }
        j43.z(iA2);
        while (i11 < c3292q5.size()) {
            j43.B(c3292q5.S(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void e(int i10, int i11) {
        this.f29252a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3292q5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            j42.z(i12);
            while (i11 < list.size()) {
                j42.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        if (!z10) {
            while (i11 < c3292q5.size()) {
                this.f29252a.n(i10, c3292q5.S(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3292q5.size(); i15++) {
            c3292q5.S(i15);
            i14 += 8;
        }
        j43.z(i14);
        while (i11 < c3292q5.size()) {
            j43.C(c3292q5.S(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void g(int i10, int i11) {
        this.f29252a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void h(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29252a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        J4 j42 = this.f29252a;
        j42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        j42.z(i12);
        while (i11 < list.size()) {
            j42.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29252a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        J4 j42 = this.f29252a;
        j42.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        j42.z(i12);
        while (i11 < list.size()) {
            j42.x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void j(int i10, int i11) {
        this.f29252a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void k(int i10, C3327u5 c3327u5, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            j42.z(C3335v5.c(c3327u5, entry.getKey(), entry.getValue()));
            C3335v5.b(j42, c3327u5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void l(int i10, Object obj, N5 n52) {
        this.f29252a.t(i10, (C5) obj, n52);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void m(int i10, long j10) {
        this.f29252a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void n(int i10, long j10) {
        J4 j42 = this.f29252a;
        j42.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void o(int i10) {
        this.f29252a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void p(int i10, String str) {
        this.f29252a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3157b5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    J4 j42 = this.f29252a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    j42.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            J4 j43 = this.f29252a;
            j43.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iG += J4.G((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            j43.z(iG);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                j43.z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        if (!z10) {
            while (i11 < c3157b5.size()) {
                J4 j44 = this.f29252a;
                int iE = c3157b5.e(i11);
                j44.k(i10, (iE >> 31) ^ (iE + iE));
                i11++;
            }
            return;
        }
        J4 j45 = this.f29252a;
        j45.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c3157b5.size(); i13++) {
            int iE2 = c3157b5.e(i13);
            iG2 += J4.G((iE2 >> 31) ^ (iE2 + iE2));
        }
        j45.z(iG2);
        while (i11 < c3157b5.size()) {
            int iE3 = c3157b5.e(i11);
            j45.z((iE3 >> 31) ^ (iE3 + iE3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void r(int i10, int i11) {
        this.f29252a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void s(int i10) {
        this.f29252a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void t(int i10, Object obj, N5 n52) {
        J4 j42 = this.f29252a;
        j42.i(i10, 3);
        n52.g((C5) obj, j42.f29245a);
        j42.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void u(int i10, long j10) {
        this.f29252a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void v(int i10, float f10) {
        this.f29252a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void w(int i10, E4 e42) {
        this.f29252a.q(i10, e42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void x(int i10, long j10) {
        this.f29252a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3292q5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += J4.a(((Long) list.get(i12)).longValue());
            }
            j42.z(iA);
            while (i11 < list.size()) {
                j42.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C3292q5 c3292q5 = (C3292q5) list;
        if (!z10) {
            while (i11 < c3292q5.size()) {
                this.f29252a.m(i10, c3292q5.S(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3292q5.size(); i13++) {
            iA2 += J4.a(c3292q5.S(i13));
        }
        j43.z(iA2);
        while (i11 < c3292q5.size()) {
            j43.B(c3292q5.S(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3248l6
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3157b5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29252a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            J4 j42 = this.f29252a;
            j42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            j42.z(i12);
            while (i11 < list.size()) {
                j42.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3157b5 c3157b5 = (C3157b5) list;
        if (!z10) {
            while (i11 < c3157b5.size()) {
                this.f29252a.l(i10, c3157b5.e(i11));
                i11++;
            }
            return;
        }
        J4 j43 = this.f29252a;
        j43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3157b5.size(); i15++) {
            c3157b5.e(i15);
            i14 += 4;
        }
        j43.z(i14);
        while (i11 < c3157b5.size()) {
            j43.A(c3157b5.e(i11));
            i11++;
        }
    }
}
