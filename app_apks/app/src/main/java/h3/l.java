package h3;

import gc.C4179C;
import java.util.ArrayList;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static final int a(InterfaceC4794d interfaceC4794d, String name) {
        AbstractC4862t.e(interfaceC4794d, "<this>");
        AbstractC4862t.e(name, "name");
        int columnCount = interfaceC4794d.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (AbstractC4862t.a(name, interfaceC4794d.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static final int b(InterfaceC4794d stmt, String name) {
        AbstractC4862t.e(stmt, "stmt");
        AbstractC4862t.e(name, "name");
        return k.a(stmt, name);
    }

    public static final int c(InterfaceC4794d stmt, String name) {
        AbstractC4862t.e(stmt, "stmt");
        AbstractC4862t.e(name, "name");
        int iA = k.a(stmt, name);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + C4179C.q0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }
}
