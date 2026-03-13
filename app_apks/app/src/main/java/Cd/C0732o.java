package Cd;

import Lc.InterfaceC1180h;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0732o extends AbstractC0734q implements InterfaceC0730m, Gd.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1388d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f1389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1390c;

    /* JADX INFO: renamed from: Cd.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean a(t0 t0Var) {
            t0Var.N0();
            return (t0Var.N0().q() instanceof Lc.f0) || (t0Var instanceof Dd.i);
        }

        public final C0732o b(t0 type, boolean z10) {
            AbstractC4862t.e(type, "type");
            if (type instanceof C0732o) {
                return (C0732o) type;
            }
            AbstractC4854k abstractC4854k = null;
            if (!c(type, z10)) {
                return null;
            }
            if (type instanceof AbstractC0741y) {
                AbstractC0741y abstractC0741y = (AbstractC0741y) type;
                AbstractC4862t.a(abstractC0741y.V0().N0(), abstractC0741y.W0().N0());
            }
            return new C0732o(B.c(type).R0(false), z10, abstractC4854k);
        }

        public final boolean c(t0 t0Var, boolean z10) {
            if (!a(t0Var)) {
                return false;
            }
            InterfaceC1180h interfaceC1180hQ = t0Var.N0().q();
            Oc.K k10 = interfaceC1180hQ instanceof Oc.K ? (Oc.K) interfaceC1180hQ : null;
            if (k10 == null || k10.T0()) {
                return (z10 && (t0Var.N0().q() instanceof Lc.f0)) ? q0.l(t0Var) : !Dd.n.f2690a.a(t0Var);
            }
            return true;
        }

        public a() {
        }
    }

    public /* synthetic */ C0732o(M m10, boolean z10, AbstractC4854k abstractC4854k) {
        this(m10, z10);
    }

    @Override // Cd.InterfaceC0730m
    public E D0(E replacement) {
        AbstractC4862t.e(replacement, "replacement");
        return Q.e(replacement.Q0(), this.f1390c);
    }

    @Override // Cd.InterfaceC0730m
    public boolean E0() {
        W0().N0();
        return W0().N0().q() instanceof Lc.f0;
    }

    @Override // Cd.AbstractC0734q, Cd.E
    public boolean O0() {
        return false;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: U0 */
    public M R0(boolean z10) {
        return z10 ? W0().R0(z10) : this;
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: V0 */
    public M T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return new C0732o(W0().T0(newAttributes), this.f1390c);
    }

    @Override // Cd.AbstractC0734q
    public M W0() {
        return this.f1389b;
    }

    public final M Z0() {
        return this.f1389b;
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C0732o Y0(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        return new C0732o(delegate, this.f1390c);
    }

    @Override // Cd.M
    public String toString() {
        return W0() + " & Any";
    }

    public C0732o(M m10, boolean z10) {
        this.f1389b = m10;
        this.f1390c = z10;
    }
}
