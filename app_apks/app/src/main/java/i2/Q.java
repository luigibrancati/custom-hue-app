package i2;

import G1.AbstractC0853a;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36902d;

    public Q(byte[] bArr) {
        this.f36899a = bArr;
        this.f36900b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f36901c;
        AbstractC0853a.g(i11 >= 0 && (i11 < (i10 = this.f36900b) || (i11 == i10 && this.f36902d == 0)));
    }

    public int b() {
        return (this.f36901c * 8) + this.f36902d;
    }

    public boolean c() {
        boolean z10 = (((this.f36899a[this.f36901c] & ForkServer.ERROR) >> this.f36902d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f36901c;
        int iMin = Math.min(i10, 8 - this.f36902d);
        int i12 = i11 + 1;
        int i13 = ((this.f36899a[i11] & ForkServer.ERROR) >> this.f36902d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f36899a[i12] & ForkServer.ERROR) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f36901c + i11;
        this.f36901c = i12;
        int i13 = this.f36902d + (i10 - (i11 * 8));
        this.f36902d = i13;
        if (i13 > 7) {
            this.f36901c = i12 + 1;
            this.f36902d = i13 - 8;
        }
        a();
    }
}
