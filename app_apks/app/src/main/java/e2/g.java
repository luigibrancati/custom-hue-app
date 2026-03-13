package e2;

import G1.AbstractC0853a;
import G1.M;
import e2.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f33586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3926a[] f33590g;

    public g(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // e2.b
    public synchronized C3926a a() {
        C3926a c3926a;
        try {
            this.f33588e++;
            int i10 = this.f33589f;
            if (i10 > 0) {
                C3926a[] c3926aArr = this.f33590g;
                int i11 = i10 - 1;
                this.f33589f = i11;
                c3926a = (C3926a) AbstractC0853a.e(c3926aArr[i11]);
                this.f33590g[this.f33589f] = null;
            } else {
                c3926a = new C3926a(new byte[this.f33585b], 0);
                int i12 = this.f33588e;
                C3926a[] c3926aArr2 = this.f33590g;
                if (i12 > c3926aArr2.length) {
                    this.f33590g = (C3926a[]) Arrays.copyOf(c3926aArr2, c3926aArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c3926a;
    }

    @Override // e2.b
    public synchronized void b(C3926a c3926a) {
        C3926a[] c3926aArr = this.f33590g;
        int i10 = this.f33589f;
        this.f33589f = i10 + 1;
        c3926aArr[i10] = c3926a;
        this.f33588e--;
        notifyAll();
    }

    @Override // e2.b
    public synchronized void c(b.a aVar) {
        while (aVar != null) {
            try {
                C3926a[] c3926aArr = this.f33590g;
                int i10 = this.f33589f;
                this.f33589f = i10 + 1;
                c3926aArr[i10] = aVar.a();
                this.f33588e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // e2.b
    public synchronized void d() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, M.k(this.f33587d, this.f33585b) - this.f33588e);
            int i11 = this.f33589f;
            if (iMax >= i11) {
                return;
            }
            if (this.f33586c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    C3926a c3926a = (C3926a) AbstractC0853a.e(this.f33590g[i10]);
                    if (c3926a.f33573a == this.f33586c) {
                        i10++;
                    } else {
                        C3926a c3926a2 = (C3926a) AbstractC0853a.e(this.f33590g[i12]);
                        if (c3926a2.f33573a != this.f33586c) {
                            i12--;
                        } else {
                            C3926a[] c3926aArr = this.f33590g;
                            c3926aArr[i10] = c3926a2;
                            c3926aArr[i12] = c3926a;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f33589f) {
                    return;
                }
            }
            Arrays.fill(this.f33590g, iMax, this.f33589f, (Object) null);
            this.f33589f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e2.b
    public int e() {
        return this.f33585b;
    }

    public synchronized int f() {
        return this.f33588e * this.f33585b;
    }

    public synchronized void g() {
        if (this.f33584a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f33587d;
        this.f33587d = i10;
        if (z10) {
            d();
        }
    }

    public g(boolean z10, int i10, int i11) {
        AbstractC0853a.a(i10 > 0);
        AbstractC0853a.a(i11 >= 0);
        this.f33584a = z10;
        this.f33585b = i10;
        this.f33589f = i11;
        this.f33590g = new C3926a[i11 + 100];
        if (i11 <= 0) {
            this.f33586c = null;
            return;
        }
        this.f33586c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f33590g[i12] = new C3926a(this.f33586c, i12 * i10);
        }
    }
}
