package za;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f48855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f48856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f48857d;

    public k(String regionId, double d10, double d11, double d12) {
        AbstractC4862t.e(regionId, "regionId");
        this.f48854a = regionId;
        this.f48855b = d10;
        this.f48856c = d11;
        this.f48857d = d12;
    }

    public final double a() {
        return this.f48855b;
    }

    public final double b() {
        return this.f48856c;
    }

    public final double c() {
        return this.f48857d;
    }

    public final String d() {
        return this.f48854a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC4862t.a(this.f48854a, kVar.f48854a) && Double.compare(this.f48855b, kVar.f48855b) == 0 && Double.compare(this.f48856c, kVar.f48856c) == 0 && Double.compare(this.f48857d, kVar.f48857d) == 0;
    }

    public int hashCode() {
        return (((((this.f48854a.hashCode() * 31) + Double.hashCode(this.f48855b)) * 31) + Double.hashCode(this.f48856c)) * 31) + Double.hashCode(this.f48857d);
    }

    public String toString() {
        return "GeofenceParams(regionId=" + this.f48854a + ", latitude=" + this.f48855b + ", longitude=" + this.f48856c + ", radius=" + this.f48857d + ')';
    }
}
