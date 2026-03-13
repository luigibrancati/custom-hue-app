package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends AbstractC0734q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f1397b;

    public r(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f1397b = delegate;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: U0 */
    public M R0(boolean z10) {
        return z10 == O0() ? this : W0().R0(z10).T0(M0());
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return newAttributes != M0() ? new O(this, newAttributes) : this;
    }

    @Override // Cd.AbstractC0734q
    public M W0() {
        return this.f1397b;
    }
}
