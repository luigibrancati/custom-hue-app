package hd;

import fd.q;
import fd.t;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36570a;

    public g(t typeTable) {
        AbstractC4862t.e(typeTable, "typeTable");
        List listU = typeTable.u();
        if (typeTable.v()) {
            int iR = typeTable.r();
            List listU2 = typeTable.u();
            AbstractC4862t.d(listU2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C4207u.v(listU2, 10));
            int i10 = 0;
            for (Object obj : listU2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C4206t.u();
                }
                q qVarT = (q) obj;
                if (i10 >= iR) {
                    qVarT = qVarT.toBuilder().J(true).build();
                }
                arrayList.add(qVarT);
                i10 = i11;
            }
            listU = arrayList;
        }
        AbstractC4862t.d(listU, "run {\n        val origin… else originalTypes\n    }");
        this.f36570a = listU;
    }

    public final q a(int i10) {
        return (q) this.f36570a.get(i10);
    }
}
