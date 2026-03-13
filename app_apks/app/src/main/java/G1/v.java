package G1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f4345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4346e;

    public v() {
        this(16);
    }

    public void a(long j10) {
        if (this.f4344c == this.f4345d.length) {
            c();
        }
        int i10 = (this.f4343b + 1) & this.f4346e;
        this.f4343b = i10;
        this.f4345d[i10] = j10;
        this.f4344c++;
    }

    public void b() {
        this.f4342a = 0;
        this.f4343b = -1;
        this.f4344c = 0;
    }

    public final void c() {
        long[] jArr = this.f4345d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f4342a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f4345d, 0, jArr2, i11, i10);
        this.f4342a = 0;
        this.f4343b = this.f4344c - 1;
        this.f4345d = jArr2;
        this.f4346e = jArr2.length - 1;
    }

    public long d() {
        if (this.f4344c != 0) {
            return this.f4345d[this.f4342a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f4344c == 0;
    }

    public long f() {
        int i10 = this.f4344c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f4345d;
        int i11 = this.f4342a;
        long j10 = jArr[i11];
        this.f4342a = this.f4346e & (i11 + 1);
        this.f4344c = i10 - 1;
        return j10;
    }

    public v(int i10) {
        AbstractC0853a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f4342a = 0;
        this.f4343b = -1;
        this.f4344c = 0;
        long[] jArr = new long[i10];
        this.f4345d = jArr;
        this.f4346e = jArr.length - 1;
    }
}
