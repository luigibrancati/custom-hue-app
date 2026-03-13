package Td;

import Rd.AbstractC2145o0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p {
    public static final void a(x xVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC2145o0.a("Channel was consumed, consumer had failed", th);
            }
        }
        xVar.a(cancellationExceptionA);
    }
}
