package J4;

import fc.C4022e;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final void a(Exception exc, A4.a logger, String message) {
        AbstractC4862t.e(exc, "<this>");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(message, "message");
        String message2 = exc.getMessage();
        if (message2 != null) {
            logger.d(message + ": " + message2);
        }
        if (exc.getStackTrace() != null) {
            logger.d("Stack trace: " + C4022e.b(exc));
        }
    }
}
