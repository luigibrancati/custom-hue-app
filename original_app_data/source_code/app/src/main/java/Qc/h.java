package Qc;

import Od.C;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final String b(kd.b bVar) {
        String strB = bVar.i().b();
        AbstractC4862t.d(strB, "relativeClassName.asString()");
        String strK = C.K(strB, '.', '$', false, 4, null);
        if (bVar.h().d()) {
            return strK;
        }
        return bVar.h() + '.' + strK;
    }
}
