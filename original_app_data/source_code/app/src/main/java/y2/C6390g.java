package y2;

import G1.C;
import G1.H;

/* JADX INFO: renamed from: y2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6390g extends AbstractC6385b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48378b;

    public C6390g(long j10, long j11) {
        this.f48377a = j10;
        this.f48378b = j11;
    }

    public static C6390g d(C c10, long j10, H h10) {
        long jE = e(c10, j10);
        return new C6390g(jE, h10.b(jE));
    }

    public static long e(C c10, long j10) {
        long jL = c10.L();
        if ((128 & jL) != 0) {
            return 8589934591L & ((((jL & 1) << 32) | c10.N()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // y2.AbstractC6385b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f48377a + ", playbackPositionUs= " + this.f48378b + " }";
    }
}
