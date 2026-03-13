package N6;

import H8.d;
import io.sentry.rrweb.RRWebOptionsEvent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z2 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z2 f10150a = new Z2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f10151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f10152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f10153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f10154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H8.d f10155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H8.d f10156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H8.d f10157h;

    static {
        d.b bVarA = H8.d.a("errorCode");
        M1 m12 = new M1();
        m12.a(1);
        f10151b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("hasResult");
        M1 m13 = new M1();
        m13.a(2);
        f10152c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("isColdCall");
        M1 m14 = new M1();
        m14.a(3);
        f10153d = bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("imageInfo");
        M1 m15 = new M1();
        m15.a(4);
        f10154e = bVarA4.b(m15.b()).a();
        d.b bVarA5 = H8.d.a(RRWebOptionsEvent.EVENT_TAG);
        M1 m16 = new M1();
        m16.a(5);
        f10155f = bVarA5.b(m16.b()).a();
        d.b bVarA6 = H8.d.a("detectedBarcodeFormats");
        M1 m17 = new M1();
        m17.a(6);
        f10156g = bVarA6.b(m17.b()).a();
        d.b bVarA7 = H8.d.a("detectedBarcodeValueTypes");
        M1 m18 = new M1();
        m18.a(7);
        f10157h = bVarA7.b(m18.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1308f2 c1308f2 = (C1308f2) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f10151b, c1308f2.c());
        fVar.e(f10152c, null);
        fVar.e(f10153d, c1308f2.e());
        fVar.e(f10154e, null);
        fVar.e(f10155f, c1308f2.d());
        fVar.e(f10156g, c1308f2.a());
        fVar.e(f10157h, c1308f2.b());
    }
}
