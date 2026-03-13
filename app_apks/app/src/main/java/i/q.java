package i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static q f36756d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f36758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36759c;

    public static q b() {
        if (f36756d == null) {
            f36756d = new q();
        }
        return f36756d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(dAsin))) / (Math.cos(d13) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f36759c = 1;
            this.f36757a = -1L;
            this.f36758b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f36759c = 0;
                this.f36757a = -1L;
                this.f36758b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f36757a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f36758b = jRound;
            if (jRound >= j10 || this.f36757a <= j10) {
                this.f36759c = 1;
            } else {
                this.f36759c = 0;
            }
        }
    }
}
