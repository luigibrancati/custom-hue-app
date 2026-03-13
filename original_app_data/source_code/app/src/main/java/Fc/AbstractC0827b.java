package Fc;

import fc.AbstractC4036s;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0827b {
    static {
        Object objB;
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        if (C4035r.h(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = C4035r.b(objB);
        Boolean bool = Boolean.FALSE;
        if (C4035r.g(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final AbstractC0826a a(vc.l compute) {
        AbstractC4862t.e(compute, "compute");
        return new C0829d(compute);
    }
}
