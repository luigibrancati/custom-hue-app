package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C0738v {
    public static /* synthetic */ i0 b(C0738v c0738v, Lc.f0 f0Var, AbstractC0739w abstractC0739w, h0 h0Var, E e10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            e10 = h0Var.c(f0Var, abstractC0739w);
        }
        return c0738v.a(f0Var, abstractC0739w, h0Var, e10);
    }

    public i0 a(Lc.f0 parameter, AbstractC0739w typeAttr, h0 typeParameterUpperBoundEraser, E erasedUpperBound) {
        AbstractC4862t.e(parameter, "parameter");
        AbstractC4862t.e(typeAttr, "typeAttr");
        AbstractC4862t.e(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC4862t.e(erasedUpperBound, "erasedUpperBound");
        return new k0(u0.OUT_VARIANCE, erasedUpperBound);
    }
}
