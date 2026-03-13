package Cd;

import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;

/* JADX INFO: renamed from: Cd.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0729l implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1380a;

    public final boolean a(InterfaceC1180h first, InterfaceC1180h second) {
        AbstractC4862t.e(first, "first");
        AbstractC4862t.e(second, "second");
        if (!AbstractC4862t.a(first.getName(), second.getName())) {
            return false;
        }
        InterfaceC1185m interfaceC1185mB = first.b();
        for (InterfaceC1185m interfaceC1185mB2 = second.b(); interfaceC1185mB != null && interfaceC1185mB2 != null; interfaceC1185mB2 = interfaceC1185mB2.b()) {
            if (interfaceC1185mB instanceof Lc.G) {
                return interfaceC1185mB2 instanceof Lc.G;
            }
            if (interfaceC1185mB2 instanceof Lc.G) {
                return false;
            }
            if (interfaceC1185mB instanceof Lc.K) {
                return (interfaceC1185mB2 instanceof Lc.K) && AbstractC4862t.a(((Lc.K) interfaceC1185mB).e(), ((Lc.K) interfaceC1185mB2).e());
            }
            if ((interfaceC1185mB2 instanceof Lc.K) || !AbstractC4862t.a(interfaceC1185mB.getName(), interfaceC1185mB2.getName())) {
                return false;
            }
            interfaceC1185mB = interfaceC1185mB.b();
        }
        return true;
    }

    public final boolean b(InterfaceC1180h interfaceC1180h) {
        return (Ed.k.m(interfaceC1180h) || AbstractC5283e.E(interfaceC1180h)) ? false : true;
    }

    public abstract boolean c(InterfaceC1180h interfaceC1180h);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0) || obj.hashCode() != hashCode()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC1180h interfaceC1180hQ = q();
        InterfaceC1180h interfaceC1180hQ2 = e0Var.q();
        if (interfaceC1180hQ2 != null && b(interfaceC1180hQ) && b(interfaceC1180hQ2)) {
            return c(interfaceC1180hQ2);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f1380a;
        if (i10 != 0) {
            return i10;
        }
        InterfaceC1180h interfaceC1180hQ = q();
        int iHashCode = b(interfaceC1180hQ) ? AbstractC5283e.m(interfaceC1180hQ).hashCode() : System.identityHashCode(this);
        this.f1380a = iHashCode;
        return iHashCode;
    }

    @Override // Cd.e0
    public abstract InterfaceC1180h q();
}
