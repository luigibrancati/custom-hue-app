package dd;

import Cd.u0;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3894B {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f33354k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3894B f33355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C3894B f33356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C3894B f33357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3894B f33358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C3894B f33359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C3894B f33360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C3894B f33361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C3894B f33362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C3894B f33363t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3894B f33369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3894B f33371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3894B f33372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f33373j;

    /* JADX INFO: renamed from: dd.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: dd.B$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33374a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33374a = iArr;
        }
    }

    static {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        C3894B c3894b = new C3894B(z10, z11, z12, z13, z14, null, false, null, null, z15, 1023, null);
        f33355l = c3894b;
        C3894B c3894b2 = new C3894B(false, false, z15, false, false, null, false, null, null, true, 511, null);
        f33356m = c3894b2;
        f33357n = new C3894B(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f33358o = new C3894B(z10, z11, z12, z13, z14, c3894b, false, null, null, z15, 988, null);
        f33359p = new C3894B(false, false, z15, false, false, c3894b2, false, null, null, true, 476, null);
        AbstractC4854k abstractC4854k = null;
        boolean z16 = false;
        C3894B c3894b3 = null;
        C3894B c3894b4 = null;
        f33360q = new C3894B(z10, true, z12, z13, z14, c3894b, z16, c3894b3, c3894b4, z15, 988, abstractC4854k);
        boolean z17 = false;
        boolean z18 = true;
        f33361r = new C3894B(z10, z17, z12, z18, z14, c3894b, z16, c3894b3, c3894b4, z15, 983, abstractC4854k);
        f33362s = new C3894B(z10, z17, z12, z18, z14, c3894b, z16, c3894b3, c3894b4, z15, 919, abstractC4854k);
        f33363t = new C3894B(z10, z17, true, false, z14, c3894b, z16, c3894b3, c3894b4, z15, 984, abstractC4854k);
    }

    public C3894B() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean a() {
        return this.f33370g;
    }

    public final boolean b() {
        return this.f33373j;
    }

    public final boolean c() {
        return this.f33365b;
    }

    public final boolean d() {
        return this.f33364a;
    }

    public final boolean e() {
        return this.f33366c;
    }

    public final C3894B f(u0 effectiveVariance, boolean z10) {
        AbstractC4862t.e(effectiveVariance, "effectiveVariance");
        if (!z10 || !this.f33366c) {
            int i10 = b.f33374a[effectiveVariance.ordinal()];
            if (i10 == 1) {
                C3894B c3894b = this.f33371h;
                if (c3894b != null) {
                    return c3894b;
                }
            } else if (i10 != 2) {
                C3894B c3894b2 = this.f33369f;
                if (c3894b2 != null) {
                    return c3894b2;
                }
            } else {
                C3894B c3894b3 = this.f33372i;
                if (c3894b3 != null) {
                    return c3894b3;
                }
            }
        }
        return this;
    }

    public final C3894B g() {
        return new C3894B(this.f33364a, true, this.f33366c, this.f33367d, this.f33368e, this.f33369f, this.f33370g, this.f33371h, this.f33372i, false, 512, null);
    }

    public C3894B(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C3894B c3894b, boolean z15, C3894B c3894b2, C3894B c3894b3, boolean z16) {
        this.f33364a = z10;
        this.f33365b = z11;
        this.f33366c = z12;
        this.f33367d = z13;
        this.f33368e = z14;
        this.f33369f = c3894b;
        this.f33370g = z15;
        this.f33371h = c3894b2;
        this.f33372i = c3894b3;
        this.f33373j = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3894B(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C3894B c3894b, boolean z15, C3894B c3894b2, C3894B c3894b3, boolean z16, int i10, AbstractC4854k abstractC4854k) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        c3894b = (i10 & 32) != 0 ? null : c3894b;
        this(z10, z11, z12, z13, z14, c3894b, (i10 & 64) != 0 ? true : z15, (i10 & 128) != 0 ? c3894b : c3894b2, (i10 & 256) != 0 ? c3894b : c3894b3, (i10 & 512) != 0 ? false : z16);
    }
}
