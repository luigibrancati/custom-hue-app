package T3;

import I3.AbstractC0890u;
import Q3.C1870o;
import Q3.I;
import Q3.InterfaceC1871p;
import Q3.InterfaceC1879y;
import Q3.q0;
import Q3.s0;
import gc.C4179C;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16188a;

    static {
        String strI = AbstractC0890u.i("DiagnosticsWrkr");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f16188a = strI;
    }

    public static final String c(I i10, String str, Integer num, String str2) {
        return '\n' + i10.f13588a + "\t " + i10.f13590c + "\t " + num + "\t " + i10.f13589b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(InterfaceC1879y interfaceC1879y, s0 s0Var, InterfaceC1871p interfaceC1871p, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I i10 = (I) it.next();
            C1870o c1870oB = interfaceC1871p.b(q0.a(i10));
            sb2.append(c(i10, C4179C.q0(interfaceC1879y.a(i10.f13588a), ",", null, null, 0, null, null, 62, null), c1870oB != null ? Integer.valueOf(c1870oB.f13717c) : null, C4179C.q0(s0Var.b(i10.f13588a), ",", null, null, 0, null, null, 62, null)));
        }
        return sb2.toString();
    }
}
