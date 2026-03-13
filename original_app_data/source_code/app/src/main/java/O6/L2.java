package O6;

import H8.d;
import io.sentry.protocol.FeatureFlag;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L2 implements H8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L2 f11371a = new L2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H8.d f11372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H8.d f11373c;

    static {
        d.b bVarA = H8.d.a(FeatureFlag.JsonKeys.RESULT);
        C1663f c1663f = new C1663f();
        c1663f.a(1);
        f11372b = bVarA.b(c1663f.b()).a();
        d.b bVarA2 = H8.d.a("ok");
        C1663f c1663f2 = new C1663f();
        c1663f2.a(2);
        f11373c = bVarA2.b(c1663f2.b()).a();
    }

    @Override // H8.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        android.support.v4.media.session.a.a(obj);
        throw null;
    }
}
