package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V f22755c = new V();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f22756d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f22758b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f22757a = new C();

    public static V a() {
        return f22755c;
    }

    public Z b(Class cls, Z z10) {
        AbstractC2714u.b(cls, "messageType");
        AbstractC2714u.b(z10, "schema");
        return (Z) this.f22758b.putIfAbsent(cls, z10);
    }

    public Z c(Class cls) {
        Z zB;
        AbstractC2714u.b(cls, "messageType");
        Z zA = (Z) this.f22758b.get(cls);
        return (zA != null || (zB = b(cls, (zA = this.f22757a.a(cls)))) == null) ? zA : zB;
    }

    public Z d(Object obj) {
        return c(obj.getClass());
    }
}
