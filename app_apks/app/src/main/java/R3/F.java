package R3;

import I3.AbstractC0890u;
import I3.P;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final void a(X0.a aVar, P info, String tag) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(info, "info");
        AbstractC4862t.e(tag, "tag");
        try {
            aVar.accept(info);
        } catch (Throwable th) {
            AbstractC0890u.e().d(tag, "Exception handler threw an exception", th);
        }
    }
}
