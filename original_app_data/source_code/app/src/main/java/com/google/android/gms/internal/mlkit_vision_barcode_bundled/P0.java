package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0 f29786a;

    public P0(O0 o02) {
        Charset charset = AbstractC3446p1.f29896a;
        this.f29786a = o02;
        o02.f29785a = this;
    }

    public static P0 L(O0 o02) {
        P0 p02 = o02.f29785a;
        return p02 != null ? p02 : new P0(o02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3411i1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29786a.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += O0.b(((Integer) list.get(i12)).intValue());
            }
            this.f29786a.w(iB);
            while (i11 < list.size()) {
                this.f29786a.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        if (!z10) {
            while (i11 < c3411i1.size()) {
                this.f29786a.n(i10, c3411i1.d(i11));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < c3411i1.size(); i13++) {
            iB2 += O0.b(c3411i1.d(i13));
        }
        this.f29786a.w(iB2);
        while (i11 < c3411i1.size()) {
            this.f29786a.o(c3411i1.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void B(int i10, float f10) {
        this.f29786a.j(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29786a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += O0.b(((Long) list.get(i12)).longValue());
        }
        this.f29786a.w(iB);
        while (i11 < list.size()) {
            this.f29786a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void D(int i10, Object obj) {
        boolean z10 = obj instanceof G0;
        O0 o02 = this.f29786a;
        if (z10) {
            o02.s(i10, (G0) obj);
        } else {
            o02.r(i10, (J1) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29786a.l(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f29786a.w(i12);
        while (i11 < list.size()) {
            this.f29786a.m(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void F(int i10, long j10) {
        this.f29786a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void G(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f29786a.t(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void H(int i10, long j10) {
        this.f29786a.x(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void I(int i10, Object obj, InterfaceC3382c2 interfaceC3382c2) {
        this.f29786a.q(i10, (J1) obj, interfaceC3382c2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void J(int i10, G0 g02) {
        this.f29786a.i(i10, g02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void K(int i10, Object obj, InterfaceC3382c2 interfaceC3382c2) {
        O0 o02 = this.f29786a;
        o02.u(i10, 3);
        interfaceC3382c2.h((J1) obj, o02.f29785a);
        o02.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29786a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f29786a.w(i12);
        while (i11 < list.size()) {
            this.f29786a.m(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void b(int i10, double d10) {
        this.f29786a.l(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29786a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += O0.b(((Long) list.get(i12)).longValue());
        }
        this.f29786a.w(iB);
        while (i11 < list.size()) {
            this.f29786a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3411i1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29786a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f29786a.w(i12);
            while (i11 < list.size()) {
                this.f29786a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        if (!z10) {
            while (i11 < c3411i1.size()) {
                this.f29786a.j(i10, c3411i1.d(i11));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3411i1.size(); i15++) {
            c3411i1.d(i15);
            i14 += 4;
        }
        this.f29786a.w(i14);
        while (i11 < c3411i1.size()) {
            this.f29786a.k(c3411i1.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void e(int i10, int i11) {
        this.f29786a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3411i1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29786a.v(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += O0.a(((Integer) list.get(i12)).intValue());
            }
            this.f29786a.w(iA);
            while (i11 < list.size()) {
                this.f29786a.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        if (!z10) {
            while (i11 < c3411i1.size()) {
                this.f29786a.v(i10, c3411i1.d(i11));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3411i1.size(); i13++) {
            iA2 += O0.a(c3411i1.d(i13));
        }
        this.f29786a.w(iA2);
        while (i11 < c3411i1.size()) {
            this.f29786a.w(c3411i1.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void g(int i10, int i11) {
        this.f29786a.n(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void h(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3411i1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    O0 o02 = this.f29786a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    o02.v(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iA += O0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f29786a.w(iA);
            while (i11 < list.size()) {
                O0 o03 = this.f29786a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                o03.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        if (!z10) {
            while (i11 < c3411i1.size()) {
                O0 o04 = this.f29786a;
                int iD = c3411i1.d(i11);
                o04.v(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c3411i1.size(); i13++) {
            int iD2 = c3411i1.d(i13);
            iA2 += O0.a((iD2 >> 31) ^ (iD2 + iD2));
        }
        this.f29786a.w(iA2);
        while (i11 < c3411i1.size()) {
            O0 o05 = this.f29786a;
            int iD3 = c3411i1.d(i11);
            o05.w((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                O0 o02 = this.f29786a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                o02.x(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iB += O0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f29786a.w(iB);
        while (i11 < list.size()) {
            O0 o03 = this.f29786a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            o03.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void j(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f29786a.i(i10, (G0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void k(int i10, String str) {
        this.f29786a.t(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void l(int i10, boolean z10) {
        this.f29786a.h(i10, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void m(int i10, long j10) {
        this.f29786a.x(i10, j10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29786a.h(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f29786a.w(i12);
        while (i11 < list.size()) {
            this.f29786a.g(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3411i1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29786a.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += O0.b(((Integer) list.get(i12)).intValue());
            }
            this.f29786a.w(iB);
            while (i11 < list.size()) {
                this.f29786a.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        if (!z10) {
            while (i11 < c3411i1.size()) {
                this.f29786a.n(i10, c3411i1.d(i11));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < c3411i1.size(); i13++) {
            iB2 += O0.b(c3411i1.d(i13));
        }
        this.f29786a.w(iB2);
        while (i11 < c3411i1.size()) {
            this.f29786a.o(c3411i1.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void p(int i10, int i11) {
        this.f29786a.n(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void q(int i10, long j10) {
        O0 o02 = this.f29786a;
        o02.x(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f29786a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f29786a.w(i12);
        while (i11 < list.size()) {
            this.f29786a.m(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void s(int i10, int i11) {
        this.f29786a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof Z0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29786a.j(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f29786a.w(i12);
            while (i11 < list.size()) {
                this.f29786a.k(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        Z0 z02 = (Z0) list;
        if (!z10) {
            while (i11 < z02.size()) {
                this.f29786a.j(i10, Float.floatToRawIntBits(z02.d(i11)));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < z02.size(); i15++) {
            z02.d(i15);
            i14 += 4;
        }
        this.f29786a.w(i14);
        while (i11 < z02.size()) {
            this.f29786a.k(Float.floatToRawIntBits(z02.d(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void u(int i10, int i11) {
        O0 o02 = this.f29786a;
        o02.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void v(int i10) {
        this.f29786a.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void w(int i10) {
        this.f29786a.u(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void x(int i10, int i11) {
        this.f29786a.v(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C3411i1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f29786a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f29786a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f29786a.w(i12);
            while (i11 < list.size()) {
                this.f29786a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C3411i1 c3411i1 = (C3411i1) list;
        if (!z10) {
            while (i11 < c3411i1.size()) {
                this.f29786a.j(i10, c3411i1.d(i11));
                i11++;
            }
            return;
        }
        this.f29786a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c3411i1.size(); i15++) {
            c3411i1.d(i15);
            i14 += 4;
        }
        this.f29786a.w(i14);
        while (i11 < c3411i1.size()) {
            this.f29786a.k(c3411i1.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F2
    public final void z(int i10, long j10) {
        this.f29786a.l(i10, j10);
    }
}
