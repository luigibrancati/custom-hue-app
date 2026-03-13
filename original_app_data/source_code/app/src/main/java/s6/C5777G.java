package s6;

/* JADX INFO: renamed from: s6.G, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5777G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44131a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f44132b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f44133c = null;

    public /* synthetic */ C5777G(byte[] bArr) {
    }

    public final C5777G a(String str) {
        this.f44131a = str;
        return this;
    }

    public final C5777G b(boolean z10) {
        this.f44132b = Boolean.valueOf(z10);
        return this;
    }

    public final C5777G c(boolean z10) {
        this.f44133c = Boolean.valueOf(z10);
        return this;
    }

    public final C5778H d() {
        Boolean bool = this.f44132b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f44133c != null) {
            return new C5778H(this.f44131a, bool.booleanValue(), false, false, this.f44133c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
