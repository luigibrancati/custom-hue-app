package d2;

import D1.E;
import G1.AbstractC0853a;
import G1.M;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: d2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3809c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f32816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f32818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D1.o[] f32820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f32821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32823h;

    public AbstractC3809c(E e10, int... iArr) {
        this(e10, iArr, 0);
    }

    public static /* synthetic */ int v(D1.o oVar, D1.o oVar2) {
        return oVar2.f1800j - oVar.f1800j;
    }

    @Override // d2.r
    public boolean a(int i10, long j10) {
        return this.f32821f[i10] > j10;
    }

    @Override // d2.v
    public final int d(D1.o oVar) {
        for (int i10 = 0; i10 < this.f32817b; i10++) {
            if (this.f32820e[i10] == oVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // d2.v
    public final D1.o e(int i10) {
        return this.f32820e[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC3809c abstractC3809c = (AbstractC3809c) obj;
            if (this.f32816a.equals(abstractC3809c.f32816a) && Arrays.equals(this.f32818c, abstractC3809c.f32818c)) {
                return true;
            }
        }
        return false;
    }

    @Override // d2.v
    public final int f(int i10) {
        return this.f32818c[i10];
    }

    @Override // d2.r
    public boolean h(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f32817b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f32821f;
        jArr[i10] = Math.max(jArr[i10], M.c(jElapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.f32822g == 0) {
            this.f32822g = (System.identityHashCode(this.f32816a) * 31) + Arrays.hashCode(this.f32818c);
        }
        return this.f32822g;
    }

    @Override // d2.v
    public final int l(int i10) {
        for (int i11 = 0; i11 < this.f32817b; i11++) {
            if (this.f32818c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // d2.v
    public final int length() {
        return this.f32818c.length;
    }

    @Override // d2.v
    public final E n() {
        return this.f32816a;
    }

    @Override // d2.r
    public void o(boolean z10) {
        this.f32823h = z10;
    }

    @Override // d2.r
    public int q(long j10, List list) {
        return list.size();
    }

    @Override // d2.r
    public final int r() {
        return this.f32818c[b()];
    }

    @Override // d2.r
    public final D1.o s() {
        return this.f32820e[b()];
    }

    public AbstractC3809c(E e10, int[] iArr, int i10) {
        AbstractC0853a.g(iArr.length > 0);
        this.f32819d = i10;
        this.f32816a = (E) AbstractC0853a.e(e10);
        int length = iArr.length;
        this.f32817b = length;
        this.f32820e = new D1.o[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f32820e[i11] = e10.a(iArr[i11]);
        }
        Arrays.sort(this.f32820e, new Comparator() { // from class: d2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC3809c.v((D1.o) obj, (D1.o) obj2);
            }
        });
        this.f32818c = new int[this.f32817b];
        int i12 = 0;
        while (true) {
            int i13 = this.f32817b;
            if (i12 >= i13) {
                this.f32821f = new long[i13];
                this.f32823h = false;
                return;
            } else {
                this.f32818c[i12] = e10.b(this.f32820e[i12]);
                i12++;
            }
        }
    }

    @Override // d2.r
    public void c() {
    }

    @Override // d2.r
    public void p() {
    }

    @Override // d2.r
    public void i(float f10) {
    }
}
