package G1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f4341b;

    public u() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f4340a;
        long[] jArr = this.f4341b;
        if (i10 == jArr.length) {
            this.f4341b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f4341b;
        int i11 = this.f4340a;
        this.f4340a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f4340a + jArr.length;
        long[] jArr2 = this.f4341b;
        if (length > jArr2.length) {
            this.f4341b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f4341b, this.f4340a, jArr.length);
        this.f4340a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f4340a) {
            return this.f4341b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f4340a);
    }

    public int d() {
        return this.f4340a;
    }

    public u(int i10) {
        this.f4341b = new long[i10];
    }
}
