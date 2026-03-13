package y2;

import G1.C;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6384a extends AbstractC6385b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f48343c;

    public C6384a(long j10, byte[] bArr, long j11) {
        this.f48341a = j11;
        this.f48342b = j10;
        this.f48343c = bArr;
    }

    public static C6384a d(C c10, int i10, long j10) {
        long jN = c10.N();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        c10.q(bArr, 0, i11);
        return new C6384a(jN, bArr, j10);
    }

    @Override // y2.AbstractC6385b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f48341a + ", identifier= " + this.f48342b + " }";
    }
}
