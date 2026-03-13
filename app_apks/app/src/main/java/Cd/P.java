package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class P extends AbstractC0734q implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f1292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f1293c;

    public P(M delegate, E enhancement) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(enhancement, "enhancement");
        this.f1292b = delegate;
        this.f1293c = enhancement;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: U0 */
    public M R0(boolean z10) {
        t0 t0VarD = s0.d(G0().R0(z10), g0().Q0().R0(z10));
        AbstractC4862t.c(t0VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (M) t0VarD;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        t0 t0VarD = s0.d(G0().T0(newAttributes), g0());
        AbstractC4862t.c(t0VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (M) t0VarD;
    }

    @Override // Cd.AbstractC0734q
    public M W0() {
        return this.f1292b;
    }

    @Override // Cd.r0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public M G0() {
        return W0();
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public P X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        E eA = kotlinTypeRefiner.a(W0());
        AbstractC4862t.c(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new P((M) eA, kotlinTypeRefiner.a(g0()));
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public P Y0(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        return new P(delegate, g0());
    }

    @Override // Cd.r0
    public E g0() {
        return this.f1293c;
    }

    @Override // Cd.M
    public String toString() {
        return "[@EnhancedForWarnings(" + g0() + ")] " + G0();
    }
}
