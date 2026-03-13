package M3;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9246d;

    public f(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f9243a = z10;
        this.f9244b = z11;
        this.f9245c = z12;
        this.f9246d = z13;
    }

    public final boolean a() {
        return this.f9243a;
    }

    public final boolean b() {
        return this.f9245c;
    }

    public final boolean c() {
        return this.f9246d;
    }

    public final boolean d() {
        return this.f9244b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9243a == fVar.f9243a && this.f9244b == fVar.f9244b && this.f9245c == fVar.f9245c && this.f9246d == fVar.f9246d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f9243a) * 31) + Boolean.hashCode(this.f9244b)) * 31) + Boolean.hashCode(this.f9245c)) * 31) + Boolean.hashCode(this.f9246d);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f9243a + ", isValidated=" + this.f9244b + ", isMetered=" + this.f9245c + ", isNotRoaming=" + this.f9246d + ')';
    }
}
