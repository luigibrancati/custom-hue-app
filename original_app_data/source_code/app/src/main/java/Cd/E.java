package Cd;

import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class E implements Mc.a, Gd.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1266a;

    public /* synthetic */ E(AbstractC4854k abstractC4854k) {
        this();
    }

    public final int K0() {
        return G.a(this) ? super.hashCode() : (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract a0 M0();

    public abstract e0 N0();

    public abstract boolean O0();

    public abstract E P0(Dd.g gVar);

    public abstract t0 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return O0() == e10.O0() && Dd.p.f2692a.a(Q0(), e10.Q0());
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        return AbstractC0727j.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f1266a;
        if (i10 != 0) {
            return i10;
        }
        int iK0 = K0();
        this.f1266a = iK0;
        return iK0;
    }

    public abstract InterfaceC6099h o();

    public E() {
    }
}
