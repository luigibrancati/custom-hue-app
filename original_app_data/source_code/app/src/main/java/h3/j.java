package h3;

import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final int a(InterfaceC4792b connection) throws Exception {
        AbstractC4862t.e(connection, "connection");
        InterfaceC4794d interfaceC4794dA1 = connection.a1("SELECT changes()");
        try {
            interfaceC4794dA1.X0();
            int i10 = (int) interfaceC4794dA1.getLong(0);
            AbstractC5877a.a(interfaceC4794dA1, null);
            return i10;
        } finally {
        }
    }
}
