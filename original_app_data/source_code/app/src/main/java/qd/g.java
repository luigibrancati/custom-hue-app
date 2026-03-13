package qd;

import Cd.E;
import Lc.G;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43438a;

    public g(Object obj) {
        this.f43438a = obj;
    }

    public abstract E a(G g10);

    public Object b() {
        return this.f43438a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return AbstractC4862t.a(objB, gVar != null ? gVar.b() : null);
    }

    public int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
