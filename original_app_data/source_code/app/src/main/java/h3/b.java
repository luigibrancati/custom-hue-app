package h3;

import Od.C;
import fc.C4015H;
import gc.C4205s;
import java.util.List;
import k3.AbstractC4791a;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static final void a(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        List listC = C4205s.c();
        InterfaceC4794d interfaceC4794dA1 = connection.a1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC4794dA1.X0()) {
            try {
                listC.add(interfaceC4794dA1.K0(0));
            } finally {
            }
        }
        C4015H c4015h = C4015H.f34254a;
        AbstractC5877a.a(interfaceC4794dA1, null);
        for (String str : C4205s.a(listC)) {
            if (C.P(str, "room_fts_content_sync_", false, 2, null)) {
                AbstractC4791a.a(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
