package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3644y2 implements V3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3638x2 f30270a;

    public C3644y2(AbstractC3638x2 abstractC3638x2) {
        Charset charset = T2.f30091a;
        this.f30270a = abstractC3638x2;
        abstractC3638x2.f30266a = this;
    }

    public static C3644y2 L(AbstractC3638x2 abstractC3638x2) {
        C3644y2 c3644y2 = abstractC3638x2.f30266a;
        return c3644y2 != null ? c3644y2 : new C3644y2(abstractC3638x2);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof P2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f30270a.m(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f30270a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += AbstractC3638x2.a(((Integer) list.get(i12)).intValue());
            }
            this.f30270a.v(iA);
            while (i11 < list.size()) {
                this.f30270a.n(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        P2 p22 = (P2) list;
        if (!z10) {
            while (i11 < p22.size()) {
                this.f30270a.m(i10, p22.d(i11));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < p22.size(); i13++) {
            iA2 += AbstractC3638x2.a(p22.d(i13));
        }
        this.f30270a.v(iA2);
        while (i11 < p22.size()) {
            this.f30270a.n(p22.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void B(int i10, float f10) {
        this.f30270a.i(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.w(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += AbstractC3638x2.a(((Long) list.get(i12)).longValue());
        }
        this.f30270a.v(iA);
        while (i11 < list.size()) {
            this.f30270a.x(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void D(int i10, Object obj) {
        boolean z10 = obj instanceof AbstractC3597q2;
        AbstractC3638x2 abstractC3638x2 = this.f30270a;
        if (z10) {
            abstractC3638x2.r(i10, (AbstractC3597q2) obj);
        } else {
            abstractC3638x2.q(i10, (InterfaceC3568l3) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.k(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f30270a.v(i12);
        while (i11 < list.size()) {
            this.f30270a.l(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void F(int i10, long j10) {
        this.f30270a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void G(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f30270a.s(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void H(int i10, long j10) {
        this.f30270a.w(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void I(int i10, Object obj, InterfaceC3633w3 interfaceC3633w3) {
        this.f30270a.p(i10, (InterfaceC3568l3) obj, interfaceC3633w3);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void J(int i10, Object obj, InterfaceC3633w3 interfaceC3633w3) {
        AbstractC3638x2 abstractC3638x2 = this.f30270a;
        abstractC3638x2.t(i10, 3);
        interfaceC3633w3.h((InterfaceC3568l3) obj, abstractC3638x2.f30266a);
        abstractC3638x2.t(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void K(int i10, AbstractC3597q2 abstractC3597q2) {
        this.f30270a.h(i10, abstractC3597q2);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f30270a.v(i12);
        while (i11 < list.size()) {
            this.f30270a.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void b(int i10, double d10) {
        this.f30270a.k(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.w(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += AbstractC3638x2.a(((Long) list.get(i12)).longValue());
        }
        this.f30270a.v(iA);
        while (i11 < list.size()) {
            this.f30270a.x(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void d(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof P2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f30270a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f30270a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f30270a.v(i12);
            while (i11 < list.size()) {
                this.f30270a.j(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        P2 p22 = (P2) list;
        if (!z10) {
            while (i11 < p22.size()) {
                this.f30270a.i(i10, p22.d(i11));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < p22.size(); i15++) {
            p22.d(i15);
            i14 += 4;
        }
        this.f30270a.v(i14);
        while (i11 < p22.size()) {
            this.f30270a.j(p22.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void e(int i10, int i11) {
        this.f30270a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof P2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f30270a.u(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f30270a.t(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += AbstractC3638x2.B(((Integer) list.get(i12)).intValue());
            }
            this.f30270a.v(iB);
            while (i11 < list.size()) {
                this.f30270a.v(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        P2 p22 = (P2) list;
        if (!z10) {
            while (i11 < p22.size()) {
                this.f30270a.u(i10, p22.d(i11));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < p22.size(); i13++) {
            iB2 += AbstractC3638x2.B(p22.d(i13));
        }
        this.f30270a.v(iB2);
        while (i11 < p22.size()) {
            this.f30270a.v(p22.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void g(int i10, int i11) {
        this.f30270a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void h(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof P2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC3638x2 abstractC3638x2 = this.f30270a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC3638x2.u(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f30270a.t(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iB += AbstractC3638x2.B((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f30270a.v(iB);
            while (i11 < list.size()) {
                AbstractC3638x2 abstractC3638x22 = this.f30270a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC3638x22.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        P2 p22 = (P2) list;
        if (!z10) {
            while (i11 < p22.size()) {
                AbstractC3638x2 abstractC3638x23 = this.f30270a;
                int iD = p22.d(i11);
                abstractC3638x23.u(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < p22.size(); i13++) {
            int iD2 = p22.d(i13);
            iB2 += AbstractC3638x2.B((iD2 >> 31) ^ (iD2 + iD2));
        }
        this.f30270a.v(iB2);
        while (i11 < p22.size()) {
            AbstractC3638x2 abstractC3638x24 = this.f30270a;
            int iD3 = p22.d(i11);
            abstractC3638x24.v((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC3638x2 abstractC3638x2 = this.f30270a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC3638x2.w(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iA += AbstractC3638x2.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f30270a.v(iA);
        while (i11 < list.size()) {
            AbstractC3638x2 abstractC3638x22 = this.f30270a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC3638x22.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void j(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f30270a.h(i10, (AbstractC3597q2) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void k(int i10, String str) {
        this.f30270a.s(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void l(int i10, boolean z10) {
        this.f30270a.g(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void m(int i10, long j10) {
        this.f30270a.w(i10, j10);
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
    @Override // com.google.android.gms.internal.play_billing.V3
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.g(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f30270a.v(i12);
        while (i11 < list.size()) {
            this.f30270a.f(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof P2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f30270a.m(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f30270a.t(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += AbstractC3638x2.a(((Integer) list.get(i12)).intValue());
            }
            this.f30270a.v(iA);
            while (i11 < list.size()) {
                this.f30270a.n(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        P2 p22 = (P2) list;
        if (!z10) {
            while (i11 < p22.size()) {
                this.f30270a.m(i10, p22.d(i11));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < p22.size(); i13++) {
            iA2 += AbstractC3638x2.a(p22.d(i13));
        }
        this.f30270a.v(iA2);
        while (i11 < p22.size()) {
            this.f30270a.n(p22.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void p(int i10, int i11) {
        this.f30270a.m(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void q(int i10, long j10) {
        AbstractC3638x2 abstractC3638x2 = this.f30270a;
        abstractC3638x2.w(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.k(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f30270a.v(i12);
        while (i11 < list.size()) {
            this.f30270a.l(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void s(int i10, int i11) {
        this.f30270a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f30270a.i(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f30270a.v(i12);
        while (i11 < list.size()) {
            this.f30270a.j(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void u(int i10, int i11) {
        AbstractC3638x2 abstractC3638x2 = this.f30270a;
        abstractC3638x2.u(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void v(int i10) {
        this.f30270a.t(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void w(int i10) {
        this.f30270a.t(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void x(int i10, int i11) {
        this.f30270a.u(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof P2)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f30270a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f30270a.t(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f30270a.v(i12);
            while (i11 < list.size()) {
                this.f30270a.j(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        P2 p22 = (P2) list;
        if (!z10) {
            while (i11 < p22.size()) {
                this.f30270a.i(i10, p22.d(i11));
                i11++;
            }
            return;
        }
        this.f30270a.t(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < p22.size(); i15++) {
            p22.d(i15);
            i14 += 4;
        }
        this.f30270a.v(i14);
        while (i11 < p22.size()) {
            this.f30270a.j(p22.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V3
    public final void z(int i10, long j10) {
        this.f30270a.k(i10, j10);
    }
}
