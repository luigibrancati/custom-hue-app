package fc;

import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4036s {
    public static final Object a(Throwable exception) {
        AbstractC4862t.e(exception, "exception");
        return new C4035r.b(exception);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof C4035r.b) {
            throw ((C4035r.b) obj).f34276a;
        }
    }
}
