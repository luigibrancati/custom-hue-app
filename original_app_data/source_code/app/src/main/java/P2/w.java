package P2;

import G1.AbstractC0853a;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f13082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13083e;

    public w(int i10, int i11) {
        this.f13079a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f13082d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f13080b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f13082d;
            int length = bArr2.length;
            int i13 = this.f13083e;
            if (length < i13 + i12) {
                this.f13082d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f13082d, this.f13083e, i12);
            this.f13083e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f13080b) {
            return false;
        }
        this.f13083e -= i10;
        this.f13080b = false;
        this.f13081c = true;
        return true;
    }

    public boolean c() {
        return this.f13081c;
    }

    public void d() {
        this.f13080b = false;
        this.f13081c = false;
    }

    public void e(int i10) {
        AbstractC0853a.g(!this.f13080b);
        boolean z10 = i10 == this.f13079a;
        this.f13080b = z10;
        if (z10) {
            this.f13083e = 3;
            this.f13081c = false;
        }
    }
}
