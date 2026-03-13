package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3665l implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3664k f31518a;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31519a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f31519a = iArr;
            try {
                iArr[r0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31519a[r0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31519a[r0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31519a[r0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31519a[r0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31519a[r0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31519a[r0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31519a[r0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31519a[r0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31519a[r0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31519a[r0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31519a[r0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C3665l(AbstractC3664k abstractC3664k) {
        AbstractC3664k abstractC3664k2 = (AbstractC3664k) AbstractC3678z.b(abstractC3664k, "output");
        this.f31518a = abstractC3664k2;
        abstractC3664k2.f31511a = this;
    }

    public static C3665l P(AbstractC3664k abstractC3664k) {
        C3665l c3665l = abstractC3664k.f31511a;
        return c3665l != null ? c3665l : new C3665l(abstractC3664k);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void A(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3659f) {
            Q(i10, (AbstractC3659f) list, z10);
        } else {
            R(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void B(int i10, float f10) {
        this.f31518a.l0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void C(int i10) {
        this.f31518a.E0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void D(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3677y) {
            l0(i10, (AbstractC3677y) list, z10);
        } else {
            m0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void E(int i10, int i11) {
        this.f31518a.f0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void F(int i10, List list, boolean z10) {
        if (list instanceof H) {
            f0(i10, (H) list, z10);
        } else {
            g0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void G(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3666m) {
            T(i10, (AbstractC3666m) list, z10);
        } else {
            U(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void H(int i10, int i11) {
        this.f31518a.z0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f31518a.c0(i10, (AbstractC3661h) list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void J(int i10, J.a aVar, Map map) {
        if (this.f31518a.V()) {
            S(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f31518a.E0(i10, 2);
            this.f31518a.G0(J.a(aVar, entry.getKey(), entry.getValue()));
            J.b(this.f31518a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void K(int i10, Object obj, f0 f0Var) {
        this.f31518a.n0(i10, (Q) obj, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void L(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void M(int i10, AbstractC3661h abstractC3661h) {
        this.f31518a.c0(i10, abstractC3661h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void N(int i10, Object obj, f0 f0Var) {
        AbstractC3654a abstractC3654a = (AbstractC3654a) obj;
        this.f31518a.E0(i10, 2);
        this.f31518a.G0(abstractC3654a.c(f0Var));
        f0Var.i(abstractC3654a, this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void O(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), f0Var);
        }
    }

    public final void Q(int i10, AbstractC3659f abstractC3659f, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3659f.size()) {
                this.f31518a.a0(i10, abstractC3659f.e(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < abstractC3659f.size(); i12++) {
            iE += AbstractC3664k.e(abstractC3659f.e(i12));
        }
        this.f31518a.G0(iE);
        while (i11 < abstractC3659f.size()) {
            this.f31518a.b0(abstractC3659f.e(i11));
            i11++;
        }
    }

    public final void R(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += AbstractC3664k.e(((Boolean) list.get(i12)).booleanValue());
        }
        this.f31518a.G0(iE);
        while (i11 < list.size()) {
            this.f31518a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void S(int i10, J.a aVar, Map map) {
        int[] iArr = a.f31519a;
        throw null;
    }

    public final void T(int i10, AbstractC3666m abstractC3666m, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3666m.size()) {
                this.f31518a.d0(i10, abstractC3666m.getDouble(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < abstractC3666m.size(); i12++) {
            iJ += AbstractC3664k.j(abstractC3666m.getDouble(i12));
        }
        this.f31518a.G0(iJ);
        while (i11 < abstractC3666m.size()) {
            this.f31518a.e0(abstractC3666m.getDouble(i11));
            i11++;
        }
    }

    public final void U(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.d0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += AbstractC3664k.j(((Double) list.get(i12)).doubleValue());
        }
        this.f31518a.G0(iJ);
        while (i11 < list.size()) {
            this.f31518a.e0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public final void V(int i10, AbstractC3677y abstractC3677y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3677y.size()) {
                this.f31518a.f0(i10, abstractC3677y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < abstractC3677y.size(); i12++) {
            iL += AbstractC3664k.l(abstractC3677y.getInt(i12));
        }
        this.f31518a.G0(iL);
        while (i11 < abstractC3677y.size()) {
            this.f31518a.g0(abstractC3677y.getInt(i11));
            i11++;
        }
    }

    public final void W(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC3664k.l(((Integer) list.get(i12)).intValue());
        }
        this.f31518a.G0(iL);
        while (i11 < list.size()) {
            this.f31518a.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void X(int i10, AbstractC3677y abstractC3677y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3677y.size()) {
                this.f31518a.h0(i10, abstractC3677y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < abstractC3677y.size(); i12++) {
            iN += AbstractC3664k.n(abstractC3677y.getInt(i12));
        }
        this.f31518a.G0(iN);
        while (i11 < abstractC3677y.size()) {
            this.f31518a.i0(abstractC3677y.getInt(i11));
            i11++;
        }
    }

    public final void Y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.h0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += AbstractC3664k.n(((Integer) list.get(i12)).intValue());
        }
        this.f31518a.G0(iN);
        while (i11 < list.size()) {
            this.f31518a.i0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void Z(int i10, H h10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f31518a.j0(i10, h10.getLong(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iP += AbstractC3664k.p(h10.getLong(i12));
        }
        this.f31518a.G0(iP);
        while (i11 < h10.size()) {
            this.f31518a.k0(h10.getLong(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void a(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3674v) {
            b0(i10, (AbstractC3674v) list, z10);
        } else {
            c0(i10, list, z10);
        }
    }

    public final void a0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.j0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += AbstractC3664k.p(((Long) list.get(i12)).longValue());
        }
        this.f31518a.G0(iP);
        while (i11 < list.size()) {
            this.f31518a.k0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final void b(int i10, Object obj) {
        if (obj instanceof AbstractC3661h) {
            this.f31518a.u0(i10, (AbstractC3661h) obj);
        } else {
            this.f31518a.t0(i10, (Q) obj);
        }
    }

    public final void b0(int i10, AbstractC3674v abstractC3674v, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3674v.size()) {
                this.f31518a.l0(i10, abstractC3674v.f(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < abstractC3674v.size(); i12++) {
            iR += AbstractC3664k.r(abstractC3674v.f(i12));
        }
        this.f31518a.G0(iR);
        while (i11 < abstractC3674v.size()) {
            this.f31518a.m0(abstractC3674v.f(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void c(int i10, int i11) {
        this.f31518a.h0(i10, i11);
    }

    public final void c0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.l0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += AbstractC3664k.r(((Float) list.get(i12)).floatValue());
        }
        this.f31518a.G0(iR);
        while (i11 < list.size()) {
            this.f31518a.m0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f31518a.D0(i10, (String) list.get(i11));
        }
    }

    public final void d0(int i10, AbstractC3677y abstractC3677y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3677y.size()) {
                this.f31518a.p0(i10, abstractC3677y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < abstractC3677y.size(); i12++) {
            iV += AbstractC3664k.v(abstractC3677y.getInt(i12));
        }
        this.f31518a.G0(iV);
        while (i11 < abstractC3677y.size()) {
            this.f31518a.q0(abstractC3677y.getInt(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void e(int i10, String str) {
        this.f31518a.D0(i10, str);
    }

    public final void e0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC3664k.v(((Integer) list.get(i12)).intValue());
        }
        this.f31518a.G0(iV);
        while (i11 < list.size()) {
            this.f31518a.q0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void f(int i10, long j10) {
        this.f31518a.H0(i10, j10);
    }

    public final void f0(int i10, H h10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f31518a.r0(i10, h10.getLong(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iX += AbstractC3664k.x(h10.getLong(i12));
        }
        this.f31518a.G0(iX);
        while (i11 < h10.size()) {
            this.f31518a.s0(h10.getLong(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void g(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3677y) {
            d0(i10, (AbstractC3677y) list, z10);
        } else {
            e0(i10, list, z10);
        }
    }

    public final void g0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += AbstractC3664k.x(((Long) list.get(i12)).longValue());
        }
        this.f31518a.G0(iX);
        while (i11 < list.size()) {
            this.f31518a.s0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void h(int i10, int i11) {
        this.f31518a.p0(i10, i11);
    }

    public final void h0(int i10, AbstractC3677y abstractC3677y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3677y.size()) {
                this.f31518a.v0(i10, abstractC3677y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < abstractC3677y.size(); i12++) {
            iE += AbstractC3664k.E(abstractC3677y.getInt(i12));
        }
        this.f31518a.G0(iE);
        while (i11 < abstractC3677y.size()) {
            this.f31518a.w0(abstractC3677y.getInt(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void i(int i10, long j10) {
        this.f31518a.x0(i10, j10);
    }

    public final void i0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.v0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += AbstractC3664k.E(((Integer) list.get(i12)).intValue());
        }
        this.f31518a.G0(iE);
        while (i11 < list.size()) {
            this.f31518a.w0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void j(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3677y) {
            X(i10, (AbstractC3677y) list, z10);
        } else {
            Y(i10, list, z10);
        }
    }

    public final void j0(int i10, H h10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f31518a.x0(i10, h10.getLong(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iG = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iG += AbstractC3664k.G(h10.getLong(i12));
        }
        this.f31518a.G0(iG);
        while (i11 < h10.size()) {
            this.f31518a.y0(h10.getLong(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void k(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3677y) {
            p0(i10, (AbstractC3677y) list, z10);
        } else {
            q0(i10, list, z10);
        }
    }

    public final void k0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.x0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iG = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iG += AbstractC3664k.G(((Long) list.get(i12)).longValue());
        }
        this.f31518a.G0(iG);
        while (i11 < list.size()) {
            this.f31518a.y0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void l(int i10, List list, boolean z10) {
        if (list instanceof H) {
            n0(i10, (H) list, z10);
        } else {
            o0(i10, list, z10);
        }
    }

    public final void l0(int i10, AbstractC3677y abstractC3677y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3677y.size()) {
                this.f31518a.z0(i10, abstractC3677y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int I10 = 0;
        for (int i12 = 0; i12 < abstractC3677y.size(); i12++) {
            I10 += AbstractC3664k.I(abstractC3677y.getInt(i12));
        }
        this.f31518a.G0(I10);
        while (i11 < abstractC3677y.size()) {
            this.f31518a.A0(abstractC3677y.getInt(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void m(int i10, long j10) {
        this.f31518a.B0(i10, j10);
    }

    public void m0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.z0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int I10 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            I10 += AbstractC3664k.I(((Integer) list.get(i12)).intValue());
        }
        this.f31518a.G0(I10);
        while (i11 < list.size()) {
            this.f31518a.A0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void n(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3677y) {
            V(i10, (AbstractC3677y) list, z10);
        } else {
            W(i10, list, z10);
        }
    }

    public final void n0(int i10, H h10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f31518a.B0(i10, h10.getLong(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iK += AbstractC3664k.K(h10.getLong(i12));
        }
        this.f31518a.G0(iK);
        while (i11 < h10.size()) {
            this.f31518a.C0(h10.getLong(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void o(int i10, int i11) {
        this.f31518a.F0(i10, i11);
    }

    public final void o0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.B0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC3664k.K(((Long) list.get(i12)).longValue());
        }
        this.f31518a.G0(iK);
        while (i11 < list.size()) {
            this.f31518a.C0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void p(int i10, double d10) {
        this.f31518a.d0(i10, d10);
    }

    public final void p0(int i10, AbstractC3677y abstractC3677y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < abstractC3677y.size()) {
                this.f31518a.F0(i10, abstractC3677y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < abstractC3677y.size(); i12++) {
            iP += AbstractC3664k.P(abstractC3677y.getInt(i12));
        }
        this.f31518a.G0(iP);
        while (i11 < abstractC3677y.size()) {
            this.f31518a.G0(abstractC3677y.getInt(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void q(int i10, List list, boolean z10) {
        if (list instanceof H) {
            j0(i10, (H) list, z10);
        } else {
            k0(i10, list, z10);
        }
    }

    public void q0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.F0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += AbstractC3664k.P(((Integer) list.get(i12)).intValue());
        }
        this.f31518a.G0(iP);
        while (i11 < list.size()) {
            this.f31518a.G0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void r(int i10, List list, boolean z10) {
        if (list instanceof H) {
            r0(i10, (H) list, z10);
        } else {
            s0(i10, list, z10);
        }
    }

    public final void r0(int i10, H h10, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f31518a.H0(i10, h10.getLong(i11));
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iR += AbstractC3664k.R(h10.getLong(i12));
        }
        this.f31518a.G0(iR);
        while (i11 < h10.size()) {
            this.f31518a.I0(h10.getLong(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void s(int i10, long j10) {
        this.f31518a.j0(i10, j10);
    }

    public final void s0(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f31518a.H0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f31518a.E0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += AbstractC3664k.R(((Long) list.get(i12)).longValue());
        }
        this.f31518a.G0(iR);
        while (i11 < list.size()) {
            this.f31518a.I0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public s0.a t() {
        return s0.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void u(int i10, long j10) {
        this.f31518a.r0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void v(int i10, boolean z10) {
        this.f31518a.a0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void w(int i10, int i11) {
        this.f31518a.v0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void x(int i10) {
        this.f31518a.E0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void y(int i10, List list, boolean z10) {
        if (list instanceof H) {
            Z(i10, (H) list, z10);
        } else {
            a0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void z(int i10, List list, boolean z10) {
        if (list instanceof AbstractC3677y) {
            h0(i10, (AbstractC3677y) list, z10);
        } else {
            i0(i10, list, z10);
        }
    }
}
