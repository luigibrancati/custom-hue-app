package N6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Ga extends Ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9746c;

    public /* synthetic */ Ga(String str, boolean z10, int i10, Fa fa2) {
        this.f9744a = str;
        this.f9745b = z10;
        this.f9746c = i10;
    }

    @Override // N6.Ka
    public final int a() {
        return this.f9746c;
    }

    @Override // N6.Ka
    public final String b() {
        return this.f9744a;
    }

    @Override // N6.Ka
    public final boolean c() {
        return this.f9745b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ka) {
            Ka ka2 = (Ka) obj;
            if (this.f9744a.equals(ka2.b()) && this.f9745b == ka2.c() && this.f9746c == ka2.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9744a.hashCode() ^ 1000003;
        return this.f9746c ^ (((iHashCode * 1000003) ^ (true != this.f9745b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f9744a + ", enableFirelog=" + this.f9745b + ", firelogEventType=" + this.f9746c + "}";
    }
}
