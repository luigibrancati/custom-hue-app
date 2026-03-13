package nc;

import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4858o;
import kotlin.jvm.internal.M;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends j implements InterfaceC4858o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f40773j;

    public k(int i10, InterfaceC4988e interfaceC4988e) {
        super(interfaceC4988e);
        this.f40773j = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC4858o
    public int getArity() {
        return this.f40773j;
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
