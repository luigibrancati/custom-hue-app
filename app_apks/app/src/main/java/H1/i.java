package H1;

import G1.AbstractC0853a;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5240d;

    public i(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f5239c;
        AbstractC0853a.g(i11 >= 0 && (i11 < (i10 = this.f5238b) || (i11 == i10 && this.f5240d == 0)));
    }

    public void b() {
        int i10 = this.f5240d;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f5239c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f5240d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f5238b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f5238b;
        return i13 < i15 || (i13 == i15 && i14 == 0);
    }

    public boolean d() {
        int i10 = this.f5239c;
        int i11 = this.f5240d;
        int i12 = 0;
        while (this.f5239c < this.f5238b && !e()) {
            i12++;
        }
        boolean z10 = this.f5239c == this.f5238b;
        this.f5239c = i10;
        this.f5240d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f5237a[this.f5239c] & (128 >> this.f5240d)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f5240d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f5240d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f5240d = i13;
            byte[] bArr = this.f5237a;
            int i14 = this.f5239c;
            i12 |= (bArr[i14] & ForkServer.ERROR) << i13;
            if (!k(i14 + 1)) {
                i = 1;
            }
            this.f5239c = i14 + i;
        }
        byte[] bArr2 = this.f5237a;
        int i15 = this.f5239c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & ForkServer.ERROR) >> (8 - i11)));
        if (i11 == 8) {
            this.f5240d = 0;
            this.f5239c = i15 + (k(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f5237a = bArr;
        this.f5239c = i10;
        this.f5238b = i11;
        this.f5240d = 0;
        a();
    }

    public final boolean k(int i10) {
        if (2 > i10 || i10 >= this.f5238b) {
            return false;
        }
        byte[] bArr = this.f5237a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void l() {
        int i10 = this.f5240d + 1;
        this.f5240d = i10;
        if (i10 == 8) {
            this.f5240d = 0;
            int i11 = this.f5239c;
            this.f5239c = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f5239c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f5239c = i13;
        int i14 = this.f5240d + (i10 - (i12 * 8));
        this.f5240d = i14;
        if (i14 > 7) {
            this.f5239c = i13 + 1;
            this.f5240d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f5239c) {
                a();
                return;
            } else if (k(i11)) {
                this.f5239c++;
                i11 += 2;
            }
        }
    }
}
