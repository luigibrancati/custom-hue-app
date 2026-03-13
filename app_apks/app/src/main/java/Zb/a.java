package Zb;

import Eb.k;
import Jb.d;
import Sb.C2202c;
import Sb.L;
import Sb.M;
import Sb.O;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends k {
    public k O0(int i10) {
        return P0(i10, Lb.a.d());
    }

    public k P0(int i10, d dVar) {
        if (i10 > 0) {
            return AbstractC2904a.m(new C2202c(this, i10, dVar));
        }
        Q0(dVar);
        return AbstractC2904a.o(this);
    }

    public abstract void Q0(d dVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final a R0() {
        return this instanceof M ? AbstractC2904a.o(new L(((M) this).e())) : this;
    }

    public k S0() {
        return AbstractC2904a.m(new O(R0()));
    }
}
