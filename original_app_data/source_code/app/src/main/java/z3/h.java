package z3;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48727a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                jVar = c.f48710a.a();
            }
            if ((i10 & 4) != 0) {
                gVar = C6501a.f48703a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String tag, j verificationMode, g logger) {
            AbstractC4862t.e(obj, "<this>");
            AbstractC4862t.e(tag, "tag");
            AbstractC4862t.e(verificationMode, "verificationMode");
            AbstractC4862t.e(logger, "logger");
            return new i(obj, tag, verificationMode, logger);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object value, String message) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(message, "message");
        return message + " value: " + value;
    }

    public abstract h c(String str, vc.l lVar);
}
