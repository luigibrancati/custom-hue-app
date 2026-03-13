package N6;

import H8.d;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebOptionsEvent;

/* JADX INFO: renamed from: N6.a5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1246a5 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1246a5 f10170a = new C1246a5();

    static {
        d.b bVarA = H8.d.a("status");
        M1 m12 = new M1();
        m12.a(1);
        bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a(RRWebOptionsEvent.EVENT_TAG);
        M1 m13 = new M1();
        m13.a(2);
        bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a(Device.JsonKeys.MODEL);
        M1 m14 = new M1();
        m14.a(3);
        bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a("language");
        M1 m15 = new M1();
        m15.a(4);
        bVarA4.b(m15.b()).a();
        d.b bVarA5 = H8.d.a("segmentationRequest");
        M1 m16 = new M1();
        m16.a(5);
        bVarA5.b(m16.b()).a();
        d.b bVarA6 = H8.d.a("segmentationResult");
        M1 m17 = new M1();
        m17.a(6);
        bVarA6.b(m17.b()).a();
        d.b bVarA7 = H8.d.a("aggregatedSegmentations");
        M1 m18 = new M1();
        m18.a(7);
        bVarA7.b(m18.b()).a();
        d.b bVarA8 = H8.d.a("durationMs");
        M1 m19 = new M1();
        m19.a(8);
        bVarA8.b(m19.b()).a();
        d.b bVarA9 = H8.d.a("nativeSegmentationException");
        M1 m110 = new M1();
        m110.a(9);
        bVarA9.b(m110.b()).a();
        d.b bVarA10 = H8.d.a("downloadErrorCodes");
        M1 m111 = new M1();
        m111.a(10);
        bVarA10.b(m111.b()).a();
        d.b bVarA11 = H8.d.a("domain");
        M1 m112 = new M1();
        m112.a(11);
        bVarA11.b(m112.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.a.a(obj);
        throw null;
    }
}
