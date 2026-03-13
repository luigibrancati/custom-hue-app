package nc;

import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4858o;
import kotlin.jvm.internal.M;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends AbstractC5160d implements InterfaceC4858o {
    private final int arity;

    public m(int i10, InterfaceC4988e interfaceC4988e) {
        super(interfaceC4988e);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC4858o
    public int getArity() {
        return this.arity;
    }

    @Override // nc.AbstractC5157a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strI = M.i(this);
        AbstractC4862t.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
