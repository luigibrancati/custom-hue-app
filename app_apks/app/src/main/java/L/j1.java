package L;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8094c;

    public j1(Map useCaseStreamSpecs, Map attachedSurfaceStreamSpecs, int i10) {
        AbstractC4862t.e(useCaseStreamSpecs, "useCaseStreamSpecs");
        AbstractC4862t.e(attachedSurfaceStreamSpecs, "attachedSurfaceStreamSpecs");
        this.f8092a = useCaseStreamSpecs;
        this.f8093b = attachedSurfaceStreamSpecs;
        this.f8094c = i10;
    }

    public final Map a() {
        return this.f8092a;
    }

    public final Map b() {
        return this.f8093b;
    }

    public final int c() {
        return this.f8094c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return AbstractC4862t.a(this.f8092a, j1Var.f8092a) && AbstractC4862t.a(this.f8093b, j1Var.f8093b) && this.f8094c == j1Var.f8094c;
    }

    public int hashCode() {
        return (((this.f8092a.hashCode() * 31) + this.f8093b.hashCode()) * 31) + Integer.hashCode(this.f8094c);
    }

    public String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.f8092a + ", attachedSurfaceStreamSpecs=" + this.f8093b + ", maxSupportedFrameRate=" + this.f8094c + ')';
    }
}
