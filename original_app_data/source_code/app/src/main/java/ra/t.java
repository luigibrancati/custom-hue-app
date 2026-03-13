package ra;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import la.C4981m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class t implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f43896d = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f43897a = new long[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f43898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.q f43899c;

    public t(r rVar, Eb.q qVar) {
        this.f43898b = rVar;
        this.f43899c = qVar;
    }

    @Override // ra.q
    public void a(boolean z10) {
        this.f43898b.a(z10);
        int iB = b();
        long j10 = this.f43897a[iB];
        long jB = this.f43899c.b(TimeUnit.MILLISECONDS);
        long j11 = jB - j10;
        long j12 = f43896d;
        if (j11 < j12) {
            throw new C4981m(2147483646, new Date(j10 + j12));
        }
        this.f43897a[iB] = jB;
    }

    public final int b() {
        long j10 = Long.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < 5; i11++) {
            long j11 = this.f43897a[i11];
            if (j11 < j10) {
                i10 = i11;
                j10 = j11;
            }
        }
        return i10;
    }
}
