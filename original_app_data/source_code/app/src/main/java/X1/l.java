package X1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import android.util.Log;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f18071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18072c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18073d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18074e = -1;

    public l(W1.g gVar) {
        this.f18070a = gVar;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18072c = j10;
        this.f18073d = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 1);
        this.f18071b = oF;
        oF.e(this.f18070a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        int iB;
        AbstractC0853a.e(this.f18071b);
        int i11 = this.f18074e;
        if (i11 != -1 && i10 != (iB = W1.d.b(i11))) {
            Log.w("RtpPcmReader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i10)));
        }
        long jA = m.a(this.f18073d, j10, this.f18072c, this.f18070a.f17733b);
        int iA = c10.a();
        this.f18071b.b(c10, iA);
        this.f18071b.d(jA, 1, iA, 0, null);
        this.f18074e = i10;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        this.f18072c = j10;
    }
}
