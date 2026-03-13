package Yc;

import Cd.E;
import Lc.X;
import Yc.j;
import bd.r;
import gc.C4206t;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Xc.g c10) {
        super(c10, null, 2, 0 == true ? 1 : 0);
        AbstractC4862t.e(c10, "c");
    }

    @Override // Yc.j
    public j.a H(r method, List methodTypeParameters, E returnType, List valueParameters) {
        AbstractC4862t.e(method, "method");
        AbstractC4862t.e(methodTypeParameters, "methodTypeParameters");
        AbstractC4862t.e(returnType, "returnType");
        AbstractC4862t.e(valueParameters, "valueParameters");
        return new j.a(returnType, null, valueParameters, methodTypeParameters, false, C4206t.k());
    }

    @Override // Yc.j
    public void s(kd.f name, Collection result) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(result, "result");
    }

    @Override // Yc.j
    public X z() {
        return null;
    }
}
