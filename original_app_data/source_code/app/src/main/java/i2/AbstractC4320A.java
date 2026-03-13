package i2;

import i2.J;

/* JADX INFO: renamed from: i2.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4320A implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f36832a;

    public AbstractC4320A(J j10) {
        this.f36832a = j10;
    }

    @Override // i2.J
    public J.a e(long j10) {
        return this.f36832a.e(j10);
    }

    @Override // i2.J
    public boolean h() {
        return this.f36832a.h();
    }

    @Override // i2.J
    public long m() {
        return this.f36832a.m();
    }
}
