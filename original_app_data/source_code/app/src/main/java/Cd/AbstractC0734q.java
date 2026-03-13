package Cd;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Cd.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0734q extends M {
    @Override // Cd.E
    public List L0() {
        return W0().L0();
    }

    @Override // Cd.E
    public a0 M0() {
        return W0().M0();
    }

    @Override // Cd.E
    public e0 N0() {
        return W0().N0();
    }

    @Override // Cd.E
    public boolean O0() {
        return W0().O0();
    }

    public abstract M W0();

    @Override // Cd.t0
    public M X0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        E eA = kotlinTypeRefiner.a(W0());
        AbstractC4862t.c(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((M) eA);
    }

    public abstract AbstractC0734q Y0(M m10);

    @Override // Cd.E
    public InterfaceC6099h o() {
        return W0().o();
    }
}
