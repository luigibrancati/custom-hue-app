package B2;

import i2.C4329i;
import i2.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends C4329i implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f571l;

    public a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f36869f, aVar.f36866c, z10);
    }

    @Override // B2.g
    public long b(long j10) {
        return c(j10);
    }

    @Override // B2.g
    public long d() {
        return this.f567h;
    }

    @Override // B2.g
    public long g() {
        return this.f571l;
    }

    public a i(long j10) {
        return new a(j10, this.f567h, this.f568i, this.f569j, this.f570k);
    }

    @Override // B2.g
    public int l() {
        return this.f568i;
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        this.f567h = j11;
        this.f568i = i10;
        this.f569j = i11;
        this.f570k = z10;
        this.f571l = j10 == -1 ? -1L : j10;
    }
}
