package f3;

import e3.C3927a;
import k3.InterfaceC4792b;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3988a {
    void a(InterfaceC4877c interfaceC4877c);

    default void b(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        if (connection instanceof C3927a) {
            a(((C3927a) connection).a());
        }
    }
}
