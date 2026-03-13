package Cd;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0 extends E {
    public v0() {
        super(null);
    }

    @Override // Cd.E
    public List L0() {
        return R0().L0();
    }

    @Override // Cd.E
    public a0 M0() {
        return R0().M0();
    }

    @Override // Cd.E
    public e0 N0() {
        return R0().N0();
    }

    @Override // Cd.E
    public boolean O0() {
        return R0().O0();
    }

    @Override // Cd.E
    public final t0 Q0() {
        E eR0 = R0();
        while (eR0 instanceof v0) {
            eR0 = ((v0) eR0).R0();
        }
        AbstractC4862t.c(eR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (t0) eR0;
    }

    public abstract E R0();

    public boolean S0() {
        return true;
    }

    @Override // Cd.E
    public InterfaceC6099h o() {
        return R0().o();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}
