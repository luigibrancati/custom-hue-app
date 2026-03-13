package cd;

import Cd.AbstractC0734q;
import Cd.AbstractC0741y;
import Cd.E;
import Cd.F;
import Cd.J;
import Cd.M;
import Cd.a0;
import Cd.q0;
import Cd.s0;
import Cd.t0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3103g extends AbstractC0734q implements J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f26514b;

    public C3103g(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f26514b = delegate;
    }

    @Override // Cd.InterfaceC0730m
    public E D0(E replacement) {
        AbstractC4862t.e(replacement, "replacement");
        t0 t0VarQ0 = replacement.Q0();
        if (!Hd.a.r(t0VarQ0) && !q0.l(t0VarQ0)) {
            return t0VarQ0;
        }
        if (t0VarQ0 instanceof M) {
            return Z0((M) t0VarQ0);
        }
        if (t0VarQ0 instanceof AbstractC0741y) {
            AbstractC0741y abstractC0741y = (AbstractC0741y) t0VarQ0;
            return s0.d(F.d(Z0(abstractC0741y.V0()), Z0(abstractC0741y.W0())), s0.a(t0VarQ0));
        }
        throw new IllegalStateException(("Incorrect type: " + t0VarQ0).toString());
    }

    @Override // Cd.InterfaceC0730m
    public boolean E0() {
        return true;
    }

    @Override // Cd.AbstractC0734q, Cd.E
    public boolean O0() {
        return false;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: U0 */
    public M R0(boolean z10) {
        return z10 ? W0().R0(true) : this;
    }

    @Override // Cd.AbstractC0734q
    public M W0() {
        return this.f26514b;
    }

    public final M Z0(M m10) {
        M mR0 = m10.R0(false);
        return !Hd.a.r(m10) ? mR0 : new C3103g(mR0);
    }

    @Override // Cd.M
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C3103g T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return new C3103g(W0().T0(newAttributes));
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C3103g Y0(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        return new C3103g(delegate);
    }
}
