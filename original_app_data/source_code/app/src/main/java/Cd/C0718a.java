package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0718a extends AbstractC0734q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f1309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f1310c;

    public C0718a(M delegate, M abbreviation) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(abbreviation, "abbreviation");
        this.f1309b = delegate;
        this.f1310c = abbreviation;
    }

    public final M F() {
        return W0();
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return new C0718a(W0().T0(newAttributes), this.f1310c);
    }

    @Override // Cd.AbstractC0734q
    public M W0() {
        return this.f1309b;
    }

    public final M Z0() {
        return this.f1310c;
    }

    @Override // Cd.M
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C0718a R0(boolean z10) {
        return new C0718a(W0().R0(z10), this.f1310c.R0(z10));
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0718a X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        E eA = kotlinTypeRefiner.a(W0());
        AbstractC4862t.c(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        E eA2 = kotlinTypeRefiner.a(this.f1310c);
        AbstractC4862t.c(eA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C0718a((M) eA, (M) eA2);
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C0718a Y0(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        return new C0718a(delegate, this.f1310c);
    }
}
