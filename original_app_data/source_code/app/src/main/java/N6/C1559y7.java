package N6;

/* JADX INFO: renamed from: N6.y7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1559y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f10554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f10555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f10556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f10557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f10558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f10559f;

    public final C1559y7 a(Long l10) {
        this.f10556c = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1559y7 b(Long l10) {
        this.f10557d = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1559y7 c(Long l10) {
        this.f10554a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1559y7 d(Long l10) {
        this.f10558e = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1559y7 e(Long l10) {
        this.f10555b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1559y7 f(Long l10) {
        this.f10559f = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final A7 g() {
        return new A7(this, null);
    }
}
