package G1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f4252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f4253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4255d;

    public G() {
        this(10);
    }

    public static Object[] f(int i10) {
        return new Object[i10];
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public final void b(long j10, Object obj) {
        int i10 = this.f4254c;
        int i11 = this.f4255d;
        Object[] objArr = this.f4253b;
        int length = (i10 + i11) % objArr.length;
        this.f4252a[length] = j10;
        objArr[length] = obj;
        this.f4255d = i11 + 1;
    }

    public synchronized void c() {
        this.f4254c = 0;
        this.f4255d = 0;
        Arrays.fill(this.f4253b, (Object) null);
    }

    public final void d(long j10) {
        if (this.f4255d > 0) {
            if (j10 <= this.f4252a[((this.f4254c + r0) - 1) % this.f4253b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f4253b.length;
        if (this.f4255d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArrF = f(i10);
        int i11 = this.f4254c;
        int i12 = length - i11;
        System.arraycopy(this.f4252a, i11, jArr, 0, i12);
        System.arraycopy(this.f4253b, this.f4254c, objArrF, 0, i12);
        int i13 = this.f4254c;
        if (i13 > 0) {
            System.arraycopy(this.f4252a, 0, jArr, i12, i13);
            System.arraycopy(this.f4253b, 0, objArrF, i12, this.f4254c);
        }
        this.f4252a = jArr;
        this.f4253b = objArrF;
        this.f4254c = 0;
    }

    public final Object g(long j10, boolean z10) {
        Object objJ = null;
        long j11 = Long.MAX_VALUE;
        while (this.f4255d > 0) {
            long j12 = j10 - this.f4252a[this.f4254c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objJ = j();
            j11 = j12;
        }
        return objJ;
    }

    public synchronized Object h() {
        return this.f4255d == 0 ? null : j();
    }

    public synchronized Object i(long j10) {
        return g(j10, true);
    }

    public final Object j() {
        AbstractC0853a.g(this.f4255d > 0);
        Object[] objArr = this.f4253b;
        int i10 = this.f4254c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f4254c = (i10 + 1) % objArr.length;
        this.f4255d--;
        return obj;
    }

    public synchronized int k() {
        return this.f4255d;
    }

    public G(int i10) {
        this.f4252a = new long[i10];
        this.f4253b = f(i10);
    }
}
