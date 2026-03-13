package N6;

import H8.d;
import io.sentry.rrweb.RRWebOptionsEvent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X4 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X4 f10121a = new X4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f10122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f10123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H8.d f10124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H8.d f10125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H8.d f10126f;

    static {
        d.b bVarA = H8.d.a("inferenceCommonLogEvent");
        M1 m12 = new M1();
        m12.a(1);
        f10122b = bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a(RRWebOptionsEvent.EVENT_TAG);
        M1 m13 = new M1();
        m13.a(2);
        f10123c = bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("detectedBarcodeFormats");
        M1 m14 = new M1();
        m14.a(3);
        f10124d = bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("detectedBarcodeValueTypes");
        M1 m15 = new M1();
        m15.a(4);
        f10125e = bVarA4.b(m15.b()).a();
        d.b bVarA5 = H8.d.a("imageInfo");
        M1 m16 = new M1();
        m16.a(5);
        f10126f = bVarA5.b(m16.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1444p8 c1444p8 = (C1444p8) obj;
        H8.f fVar = (H8.f) obj2;
        fVar.e(f10122b, c1444p8.d());
        fVar.e(f10123c, c1444p8.e());
        fVar.e(f10124d, c1444p8.a());
        fVar.e(f10125e, c1444p8.b());
        fVar.e(f10126f, c1444p8.c());
    }
}
