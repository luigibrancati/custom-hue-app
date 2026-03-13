package b3;

import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: renamed from: b3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2807f {
    public abstract void a(InterfaceC4794d interfaceC4794d, Object obj);

    public abstract String b();

    public final void c(InterfaceC4792b connection, Object obj) throws Exception {
        AbstractC4862t.e(connection, "connection");
        if (obj == null) {
            return;
        }
        InterfaceC4794d interfaceC4794dA1 = connection.a1(b());
        try {
            a(interfaceC4794dA1, obj);
            interfaceC4794dA1.X0();
            AbstractC5877a.a(interfaceC4794dA1, null);
        } finally {
        }
    }
}
