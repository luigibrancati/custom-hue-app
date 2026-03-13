package k3;

import android.database.SQLException;
import kotlin.jvm.internal.AbstractC4862t;
import tc.AbstractC5877a;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4791a {
    public static final void a(InterfaceC4792b interfaceC4792b, String sql) throws Exception {
        AbstractC4862t.e(interfaceC4792b, "<this>");
        AbstractC4862t.e(sql, "sql");
        InterfaceC4794d interfaceC4794dA1 = interfaceC4792b.a1(sql);
        try {
            interfaceC4794dA1.X0();
            AbstractC5877a.a(interfaceC4794dA1, null);
        } finally {
        }
    }

    public static final Void b(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
