package w8;

/* JADX INFO: renamed from: w8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6165b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46334f;

    public C6165b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f46330b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f46331c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f46332d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f46333e = str4;
        this.f46334f = j10;
    }

    @Override // w8.j
    public String c() {
        return this.f46331c;
    }

    @Override // w8.j
    public String d() {
        return this.f46332d;
    }

    @Override // w8.j
    public String e() {
        return this.f46330b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f46330b.equals(jVar.e()) && this.f46331c.equals(jVar.c()) && this.f46332d.equals(jVar.d()) && this.f46333e.equals(jVar.g()) && this.f46334f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // w8.j
    public long f() {
        return this.f46334f;
    }

    @Override // w8.j
    public String g() {
        return this.f46333e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f46330b.hashCode() ^ 1000003) * 1000003) ^ this.f46331c.hashCode()) * 1000003) ^ this.f46332d.hashCode()) * 1000003) ^ this.f46333e.hashCode()) * 1000003;
        long j10 = this.f46334f;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f46330b + ", parameterKey=" + this.f46331c + ", parameterValue=" + this.f46332d + ", variantId=" + this.f46333e + ", templateVersion=" + this.f46334f + "}";
    }
}
