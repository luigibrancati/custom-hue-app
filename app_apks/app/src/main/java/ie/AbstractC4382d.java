package ie;

import fc.AbstractC4036s;
import fc.C4035r;

/* JADX INFO: renamed from: ie.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4382d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37526a;

    static {
        Object objB;
        try {
            C4035r.a aVar = C4035r.f34274b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objB = C4035r.b(property != null ? Od.B.u(property) : null);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        Integer num = (Integer) (C4035r.g(objB) ? null : objB);
        f37526a = num != null ? num.intValue() : 2097152;
    }
}
