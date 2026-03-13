package fc;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.AbstractC4862t;
import pc.AbstractC5458b;

/* JADX INFO: renamed from: fc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4022e {
    public static void a(Throwable th, Throwable exception) {
        AbstractC4862t.e(th, "<this>");
        AbstractC4862t.e(exception, "exception");
        if (th != exception) {
            AbstractC5458b.f42540a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        AbstractC4862t.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
