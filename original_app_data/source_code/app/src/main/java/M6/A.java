package M6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9304c;

    public /* synthetic */ A(String str, boolean z10, int i10, AbstractC1234z abstractC1234z) {
        this.f9302a = str;
        this.f9303b = z10;
        this.f9304c = i10;
    }

    @Override // M6.E
    public final int a() {
        return this.f9304c;
    }

    @Override // M6.E
    public final String b() {
        return this.f9302a;
    }

    @Override // M6.E
    public final boolean c() {
        return this.f9303b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            if (this.f9302a.equals(e10.b()) && this.f9303b == e10.c() && this.f9304c == e10.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9302a.hashCode() ^ 1000003;
        return this.f9304c ^ (((iHashCode * 1000003) ^ (true != this.f9303b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f9302a + ", enableFirelog=" + this.f9303b + ", firelogEventType=" + this.f9304c + "}";
    }
}
