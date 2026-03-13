package N6;

import H8.d;
import io.sentry.protocol.Message;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A3 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A3 f9633a = new A3();

    static {
        d.b bVarA = H8.d.a("errorCode");
        M1 m12 = new M1();
        m12.a(1);
        bVarA.b(m12.b()).a();
        d.b bVarA2 = H8.d.a("imageInfo");
        M1 m13 = new M1();
        m13.a(2);
        bVarA2.b(m13.b()).a();
        d.b bVarA3 = H8.d.a("isColdCall");
        M1 m14 = new M1();
        m14.a(3);
        bVarA3.b(m14.b()).a();
        d.b bVarA4 = H8.d.a(Message.JsonKeys.PARAMS);
        M1 m15 = new M1();
        m15.a(4);
        bVarA4.b(m15.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.a.a(obj);
        throw null;
    }
}
