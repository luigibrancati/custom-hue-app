package pe;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import qe.AbstractC5520c;

/* JADX INFO: renamed from: pe.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5468d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f42647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5468d f42648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5468d f42649p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f42658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f42659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f42660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f42661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f42662m;

    /* JADX INFO: renamed from: pe.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f42663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f42664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f42665c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f42666d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f42667e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f42668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f42669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f42670h;

        public final C5468d a() {
            return AbstractC5520c.a(this);
        }

        public final boolean b() {
            return this.f42670h;
        }

        public final int c() {
            return this.f42665c;
        }

        public final int d() {
            return this.f42666d;
        }

        public final int e() {
            return this.f42667e;
        }

        public final boolean f() {
            return this.f42663a;
        }

        public final boolean g() {
            return this.f42664b;
        }

        public final boolean h() {
            return this.f42669g;
        }

        public final boolean i() {
            return this.f42668f;
        }

        public final a j(long j10) {
            long jD = Pd.a.D(j10);
            if (jD >= 0) {
                this.f42666d = AbstractC5520c.b(jD);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jD).toString());
        }

        public final a k() {
            return AbstractC5520c.e(this);
        }

        public final a l() {
            return AbstractC5520c.f(this);
        }

        public final a m() {
            return AbstractC5520c.g(this);
        }

        public final void n(boolean z10) {
            this.f42663a = z10;
        }

        public final void o(boolean z10) {
            this.f42664b = z10;
        }

        public final void p(boolean z10) {
            this.f42668f = z10;
        }
    }

    /* JADX INFO: renamed from: pe.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C5468d a(u headers) {
            AbstractC4862t.e(headers, "headers");
            return AbstractC5520c.h(this, headers);
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f42647n = bVar;
        f42648o = AbstractC5520c.d(bVar);
        f42649p = AbstractC5520c.c(bVar);
    }

    public C5468d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f42650a = z10;
        this.f42651b = z11;
        this.f42652c = i10;
        this.f42653d = i11;
        this.f42654e = z12;
        this.f42655f = z13;
        this.f42656g = z14;
        this.f42657h = i12;
        this.f42658i = i13;
        this.f42659j = z15;
        this.f42660k = z16;
        this.f42661l = z17;
        this.f42662m = str;
    }

    public final String a() {
        return this.f42662m;
    }

    public final boolean b() {
        return this.f42661l;
    }

    public final boolean c() {
        return this.f42654e;
    }

    public final boolean d() {
        return this.f42655f;
    }

    public final int e() {
        return this.f42652c;
    }

    public final int f() {
        return this.f42657h;
    }

    public final int g() {
        return this.f42658i;
    }

    public final boolean h() {
        return this.f42656g;
    }

    public final boolean i() {
        return this.f42650a;
    }

    public final boolean j() {
        return this.f42651b;
    }

    public final boolean k() {
        return this.f42660k;
    }

    public final boolean l() {
        return this.f42659j;
    }

    public final int m() {
        return this.f42653d;
    }

    public final void n(String str) {
        this.f42662m = str;
    }

    public String toString() {
        return AbstractC5520c.i(this);
    }
}
