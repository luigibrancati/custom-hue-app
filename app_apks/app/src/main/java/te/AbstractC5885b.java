package te;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;

/* JADX INFO: renamed from: te.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5885b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        S s10 = S.f39781a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC4862t.d(str2, "format(...)");
        return str2;
    }

    public static final void c(Logger logger, AbstractC5884a abstractC5884a, c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        S s10 = S.f39781a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC4862t.d(str2, "format(...)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(abstractC5884a.b());
        logger.fine(sb2.toString());
    }
}
