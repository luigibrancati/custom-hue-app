package N6;

import H8.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A6 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A6 f9636a = new A6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f9637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f9638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f9639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f9640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H8.d f9641f;

    static {
        d.b bVarA = H8.d.a("xMin");
        M1 m12 = new M1();
        m12.a(1);
        f9637b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("yMin");
        M1 m13 = new M1();
        m13.a(2);
        f9638c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("xMax");
        M1 m14 = new M1();
        m14.a(3);
        f9639d = bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("yMax");
        M1 m15 = new M1();
        m15.a(4);
        f9640e = bVarA4.b(m15.b()).a();
        d.b bVarA5 = H8.d.a("confidenceScore");
        M1 m16 = new M1();
        m16.a(5);
        f9641f = bVarA5.b(m16.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        S9 s92 = (S9) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f9637b, s92.c());
        fVar.e(f9638c, s92.e());
        fVar.e(f9639d, s92.b());
        fVar.e(f9640e, s92.d());
        fVar.e(f9641f, s92.a());
    }
}
