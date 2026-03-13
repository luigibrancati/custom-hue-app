package C2;

import G1.C;
import i2.InterfaceC4337q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1077f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1083l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f1085n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1089r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f1078g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1079h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1080i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f1081j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f1082k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f1084m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C f1086o = new C();

    public void a(C c10) {
        c10.q(this.f1086o.f(), 0, this.f1086o.j());
        this.f1086o.a0(0);
        this.f1087p = false;
    }

    public void b(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.readFully(this.f1086o.f(), 0, this.f1086o.j());
        this.f1086o.a0(0);
        this.f1087p = false;
    }

    public long c(int i10) {
        return this.f1081j[i10];
    }

    public void d(int i10) {
        this.f1086o.W(i10);
        this.f1083l = true;
        this.f1087p = true;
    }

    public void e(int i10, int i11) {
        this.f1076e = i10;
        this.f1077f = i11;
        if (this.f1079h.length < i10) {
            this.f1078g = new long[i10];
            this.f1079h = new int[i10];
        }
        if (this.f1080i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f1080i = new int[i12];
            this.f1081j = new long[i12];
            this.f1082k = new boolean[i12];
            this.f1084m = new boolean[i12];
        }
    }

    public void f() {
        this.f1076e = 0;
        this.f1088q = 0L;
        this.f1089r = false;
        this.f1083l = false;
        this.f1087p = false;
        this.f1085n = null;
    }

    public boolean g(int i10) {
        return this.f1083l && this.f1084m[i10];
    }
}
