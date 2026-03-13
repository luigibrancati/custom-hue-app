package O6;

/* JADX INFO: renamed from: O6.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1792x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f12033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC1799y3 f12034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC1757s3 f12035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f12036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f12037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f12038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f12039g;

    public final C1792x3 b(Long l10) {
        this.f12033a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1792x3 c(Integer num) {
        this.f12036d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1792x3 d(EnumC1757s3 enumC1757s3) {
        this.f12035c = enumC1757s3;
        return this;
    }

    public final C1792x3 e(Integer num) {
        this.f12038f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1792x3 f(EnumC1799y3 enumC1799y3) {
        this.f12034b = enumC1799y3;
        return this;
    }

    public final C1792x3 g(Integer num) {
        this.f12037e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final C1792x3 h(Integer num) {
        this.f12039g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final A3 j() {
        return new A3(this, null);
    }
}
