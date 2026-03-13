package X6;

import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f18228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f18229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f18230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f18231k;

    public E(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        AbstractC6056k.f(str);
        AbstractC6056k.f(str2);
        AbstractC6056k.a(j10 >= 0);
        AbstractC6056k.a(j11 >= 0);
        AbstractC6056k.a(j12 >= 0);
        AbstractC6056k.a(j14 >= 0);
        this.f18221a = str;
        this.f18222b = str2;
        this.f18223c = j10;
        this.f18224d = j11;
        this.f18225e = j12;
        this.f18226f = j13;
        this.f18227g = j14;
        this.f18228h = l10;
        this.f18229i = l11;
        this.f18230j = l12;
        this.f18231k = bool;
    }

    public final E a(long j10) {
        return new E(this.f18221a, this.f18222b, this.f18223c, this.f18224d, this.f18225e, j10, this.f18227g, this.f18228h, this.f18229i, this.f18230j, this.f18231k);
    }

    public final E b(long j10, long j11) {
        return new E(this.f18221a, this.f18222b, this.f18223c, this.f18224d, this.f18225e, this.f18226f, j10, Long.valueOf(j11), this.f18229i, this.f18230j, this.f18231k);
    }

    public final E c(Long l10, Long l11, Boolean bool) {
        return new E(this.f18221a, this.f18222b, this.f18223c, this.f18224d, this.f18225e, this.f18226f, this.f18227g, this.f18228h, l10, l11, bool);
    }
}
