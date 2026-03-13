package xc;

/* JADX INFO: renamed from: xc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6358a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6358a f48101a = new C6358a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f48102b = Math.log(2.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f48103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f48104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f48105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f48106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double f48107g;

    static {
        double dUlp = Math.ulp(1.0d);
        f48103c = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        f48104d = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f48105e = dSqrt2;
        double d10 = 1;
        f48106f = d10 / dSqrt;
        f48107g = d10 / dSqrt2;
    }
}
