package Td;

import java.util.concurrent.CancellationException;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface x {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static /* synthetic */ void a(x xVar, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            xVar.a(cancellationException);
        }
    }

    void a(CancellationException cancellationException);

    i iterator();

    Object r(InterfaceC4988e interfaceC4988e);

    Object t();

    Object x(InterfaceC4988e interfaceC4988e);
}
