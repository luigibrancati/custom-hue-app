package i2;

import i2.J;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class M implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36887b;

    public M(long j10) {
        this(j10, 0L);
    }

    @Override // i2.J
    public J.a e(long j10) {
        return new J.a(new K(j10, this.f36887b));
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // i2.J
    public long m() {
        return this.f36886a;
    }

    public M(long j10, long j11) {
        this.f36886a = j10;
        this.f36887b = j11;
    }
}
