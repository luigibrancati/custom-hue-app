package Cd;

import fc.C4032o;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import nd.AbstractC5164c;
import nd.InterfaceC5167f;

/* JADX INFO: renamed from: Cd.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0742z extends AbstractC0741y implements InterfaceC0730m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1406e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1407f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1408d;

    /* JADX INFO: renamed from: Cd.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0742z(M lowerBound, M upperBound) {
        super(lowerBound, upperBound);
        AbstractC4862t.e(lowerBound, "lowerBound");
        AbstractC4862t.e(upperBound, "upperBound");
    }

    @Override // Cd.InterfaceC0730m
    public E D0(E replacement) {
        t0 t0VarD;
        AbstractC4862t.e(replacement, "replacement");
        t0 t0VarQ0 = replacement.Q0();
        if (t0VarQ0 instanceof AbstractC0741y) {
            t0VarD = t0VarQ0;
        } else {
            if (!(t0VarQ0 instanceof M)) {
                throw new C4032o();
            }
            M m10 = (M) t0VarQ0;
            t0VarD = F.d(m10, m10.R0(true));
        }
        return s0.b(t0VarD, t0VarQ0);
    }

    @Override // Cd.InterfaceC0730m
    public boolean E0() {
        return (V0().N0().q() instanceof Lc.f0) && AbstractC4862t.a(V0().N0(), W0().N0());
    }

    @Override // Cd.t0
    public t0 R0(boolean z10) {
        return F.d(V0().R0(z10), W0().R0(z10));
    }

    @Override // Cd.t0
    public t0 T0(a0 newAttributes) {
        AbstractC4862t.e(newAttributes, "newAttributes");
        return F.d(V0().T0(newAttributes), W0().T0(newAttributes));
    }

    @Override // Cd.AbstractC0741y
    public M U0() {
        Z0();
        return V0();
    }

    @Override // Cd.AbstractC0741y
    public String X0(AbstractC5164c renderer, InterfaceC5167f options) {
        AbstractC4862t.e(renderer, "renderer");
        AbstractC4862t.e(options, "options");
        if (!options.h()) {
            return renderer.t(renderer.w(V0()), renderer.w(W0()), Hd.a.i(this));
        }
        return '(' + renderer.w(V0()) + ".." + renderer.w(W0()) + ')';
    }

    @Override // Cd.t0
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public AbstractC0741y X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        E eA = kotlinTypeRefiner.a(V0());
        AbstractC4862t.c(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        E eA2 = kotlinTypeRefiner.a(W0());
        AbstractC4862t.c(eA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C0742z((M) eA, (M) eA2);
    }

    public final void Z0() {
        if (!f1407f || this.f1408d) {
            return;
        }
        this.f1408d = true;
        B.b(V0());
        B.b(W0());
        AbstractC4862t.a(V0(), W0());
        Dd.e.f2664a.b(V0(), W0());
    }

    @Override // Cd.AbstractC0741y
    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }
}
