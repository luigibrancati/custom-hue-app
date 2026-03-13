package kd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f39566a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f39567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f39568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f39569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f39570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f39571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f39572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f39573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f39574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f39575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f39576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f39577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f39578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f39579n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f39580o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f39581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f39582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f39583r;

    static {
        f fVarW = f.w("<no name provided>");
        AbstractC4862t.d(fVarW, "special(\"<no name provided>\")");
        f39567b = fVarW;
        f fVarW2 = f.w("<root package>");
        AbstractC4862t.d(fVarW2, "special(\"<root package>\")");
        f39568c = fVarW2;
        f fVarS = f.s("Companion");
        AbstractC4862t.d(fVarS, "identifier(\"Companion\")");
        f39569d = fVarS;
        f fVarS2 = f.s("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        AbstractC4862t.d(fVarS2, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f39570e = fVarS2;
        f fVarW3 = f.w("<anonymous>");
        AbstractC4862t.d(fVarW3, "special(ANONYMOUS_STRING)");
        f39571f = fVarW3;
        f fVarW4 = f.w("<unary>");
        AbstractC4862t.d(fVarW4, "special(\"<unary>\")");
        f39572g = fVarW4;
        f fVarW5 = f.w("<unary-result>");
        AbstractC4862t.d(fVarW5, "special(\"<unary-result>\")");
        f39573h = fVarW5;
        f fVarW6 = f.w("<this>");
        AbstractC4862t.d(fVarW6, "special(\"<this>\")");
        f39574i = fVarW6;
        f fVarW7 = f.w("<init>");
        AbstractC4862t.d(fVarW7, "special(\"<init>\")");
        f39575j = fVarW7;
        f fVarW8 = f.w("<iterator>");
        AbstractC4862t.d(fVarW8, "special(\"<iterator>\")");
        f39576k = fVarW8;
        f fVarW9 = f.w("<destruct>");
        AbstractC4862t.d(fVarW9, "special(\"<destruct>\")");
        f39577l = fVarW9;
        f fVarW10 = f.w("<local>");
        AbstractC4862t.d(fVarW10, "special(\"<local>\")");
        f39578m = fVarW10;
        f fVarW11 = f.w("<unused var>");
        AbstractC4862t.d(fVarW11, "special(\"<unused var>\")");
        f39579n = fVarW11;
        f fVarW12 = f.w("<set-?>");
        AbstractC4862t.d(fVarW12, "special(\"<set-?>\")");
        f39580o = fVarW12;
        f fVarW13 = f.w("<array>");
        AbstractC4862t.d(fVarW13, "special(\"<array>\")");
        f39581p = fVarW13;
        f fVarW14 = f.w("<receiver>");
        AbstractC4862t.d(fVarW14, "special(\"<receiver>\")");
        f39582q = fVarW14;
        f fVarW15 = f.w("<get-entries>");
        AbstractC4862t.d(fVarW15, "special(\"<get-entries>\")");
        f39583r = fVarW15;
    }

    public static final f b(f fVar) {
        return (fVar == null || fVar.u()) ? f39570e : fVar;
    }

    public final boolean a(f name) {
        AbstractC4862t.e(name, "name");
        String strB = name.b();
        AbstractC4862t.d(strB, "name.asString()");
        return strB.length() > 0 && !name.u();
    }
}
