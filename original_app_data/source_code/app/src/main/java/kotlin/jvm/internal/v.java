package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements InterfaceC4858o, Serializable {
    private final int arity;

    public v(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC4858o
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strJ = M.j(this);
        AbstractC4862t.d(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
