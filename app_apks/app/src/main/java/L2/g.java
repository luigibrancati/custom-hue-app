package L2;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8525e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f8532l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f8535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f8536p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f8538r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f8540t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f8541u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8526f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8527g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8528h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8529i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8530j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8533m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8534n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8537q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f8539s = Float.MAX_VALUE;

    public g A(String str) {
        this.f8521a = str;
        return this;
    }

    public g B(float f10) {
        this.f8531k = f10;
        return this;
    }

    public g C(int i10) {
        this.f8530j = i10;
        return this;
    }

    public g D(String str) {
        this.f8532l = str;
        return this;
    }

    public g E(boolean z10) {
        this.f8529i = z10 ? 1 : 0;
        return this;
    }

    public g F(boolean z10) {
        this.f8526f = z10 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f8536p = alignment;
        return this;
    }

    public g H(String str) {
        this.f8540t = str;
        return this;
    }

    public g I(int i10) {
        this.f8534n = i10;
        return this;
    }

    public g J(int i10) {
        this.f8533m = i10;
        return this;
    }

    public g K(float f10) {
        this.f8539s = f10;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f8535o = alignment;
        return this;
    }

    public g M(boolean z10) {
        this.f8537q = z10 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f8538r = bVar;
        return this;
    }

    public g O(boolean z10) {
        this.f8527g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f8525e) {
            return this.f8524d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f8541u;
    }

    public int d() {
        if (this.f8523c) {
            return this.f8522b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f8521a;
    }

    public float f() {
        return this.f8531k;
    }

    public int g() {
        return this.f8530j;
    }

    public String h() {
        return this.f8532l;
    }

    public Layout.Alignment i() {
        return this.f8536p;
    }

    public String j() {
        return this.f8540t;
    }

    public int k() {
        return this.f8534n;
    }

    public int l() {
        return this.f8533m;
    }

    public float m() {
        return this.f8539s;
    }

    public int n() {
        int i10 = this.f8528h;
        if (i10 == -1 && this.f8529i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f8529i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f8535o;
    }

    public boolean p() {
        return this.f8537q == 1;
    }

    public b q() {
        return this.f8538r;
    }

    public boolean r() {
        return this.f8525e;
    }

    public boolean s() {
        return this.f8523c;
    }

    public final g t(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f8523c && gVar.f8523c) {
                z(gVar.f8522b);
            }
            if (this.f8528h == -1) {
                this.f8528h = gVar.f8528h;
            }
            if (this.f8529i == -1) {
                this.f8529i = gVar.f8529i;
            }
            if (this.f8521a == null && (str = gVar.f8521a) != null) {
                this.f8521a = str;
            }
            if (this.f8526f == -1) {
                this.f8526f = gVar.f8526f;
            }
            if (this.f8527g == -1) {
                this.f8527g = gVar.f8527g;
            }
            if (this.f8534n == -1) {
                this.f8534n = gVar.f8534n;
            }
            if (this.f8535o == null && (alignment2 = gVar.f8535o) != null) {
                this.f8535o = alignment2;
            }
            if (this.f8536p == null && (alignment = gVar.f8536p) != null) {
                this.f8536p = alignment;
            }
            if (this.f8537q == -1) {
                this.f8537q = gVar.f8537q;
            }
            if (this.f8530j == -1) {
                this.f8530j = gVar.f8530j;
                this.f8531k = gVar.f8531k;
            }
            if (this.f8538r == null) {
                this.f8538r = gVar.f8538r;
            }
            if (this.f8539s == Float.MAX_VALUE) {
                this.f8539s = gVar.f8539s;
            }
            if (this.f8540t == null) {
                this.f8540t = gVar.f8540t;
            }
            if (this.f8541u == null) {
                this.f8541u = gVar.f8541u;
            }
            if (z10 && !this.f8525e && gVar.f8525e) {
                w(gVar.f8524d);
            }
            if (z10 && this.f8533m == -1 && (i10 = gVar.f8533m) != -1) {
                this.f8533m = i10;
            }
        }
        return this;
    }

    public boolean u() {
        return this.f8526f == 1;
    }

    public boolean v() {
        return this.f8527g == 1;
    }

    public g w(int i10) {
        this.f8524d = i10;
        this.f8525e = true;
        return this;
    }

    public g x(boolean z10) {
        this.f8528h = z10 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f8541u = str;
        return this;
    }

    public g z(int i10) {
        this.f8522b = i10;
        this.f8523c = true;
        return this;
    }
}
