package I9;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5672b;

    public b(double d10, double d11) {
        this.f5671a = d10;
        this.f5672b = d11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC4862t.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4862t.c(obj, "null cannot be cast to non-null type com.google.maps.android.geometry.Point");
        b bVar = (b) obj;
        return this.f5671a == bVar.f5671a && this.f5672b == bVar.f5672b;
    }

    public int hashCode() {
        return (Double.hashCode(this.f5671a) * 31) + Double.hashCode(this.f5672b);
    }

    public String toString() {
        return "Point(x=" + this.f5671a + ", y=" + this.f5672b + ")";
    }
}
