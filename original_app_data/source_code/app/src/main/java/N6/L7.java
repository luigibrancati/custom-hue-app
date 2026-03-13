package N6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f9809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z7 f9810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f9811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f9812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f9813e;

    public final L7 a(Boolean bool) {
        this.f9812d = bool;
        return this;
    }

    public final L7 b(Boolean bool) {
        this.f9813e = bool;
        return this;
    }

    public final L7 c(Long l10) {
        this.f9809a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final L7 d(Z7 z72) {
        this.f9810b = z72;
        return this;
    }

    public final L7 e(Boolean bool) {
        this.f9811c = bool;
        return this;
    }

    public final N7 f() {
        return new N7(this, null);
    }
}
