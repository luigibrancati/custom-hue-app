package p;

/* JADX INFO: renamed from: p.Q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5338Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41863a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41864b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41865c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41866d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41867e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41868f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41869g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41870h = false;

    public int a() {
        return this.f41869g ? this.f41863a : this.f41864b;
    }

    public int b() {
        return this.f41863a;
    }

    public int c() {
        return this.f41864b;
    }

    public int d() {
        return this.f41869g ? this.f41864b : this.f41863a;
    }

    public void e(int i10, int i11) {
        this.f41870h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f41867e = i10;
            this.f41863a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f41868f = i11;
            this.f41864b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f41869g) {
            return;
        }
        this.f41869g = z10;
        if (!this.f41870h) {
            this.f41863a = this.f41867e;
            this.f41864b = this.f41868f;
            return;
        }
        if (z10) {
            int i10 = this.f41866d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f41867e;
            }
            this.f41863a = i10;
            int i11 = this.f41865c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f41868f;
            }
            this.f41864b = i11;
            return;
        }
        int i12 = this.f41865c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f41867e;
        }
        this.f41863a = i12;
        int i13 = this.f41866d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f41868f;
        }
        this.f41864b = i13;
    }

    public void g(int i10, int i11) {
        this.f41865c = i10;
        this.f41866d = i11;
        this.f41870h = true;
        if (this.f41869g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f41863a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f41864b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f41863a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f41864b = i11;
        }
    }
}
