package kotlin.jvm.internal;

import Cc.o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class F extends H implements Cc.o {
    public F() {
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.c computeReflected() {
        return M.h(this);
    }

    @Override // vc.p
    public Object invoke(Object obj, Object obj2) {
        return q(obj, obj2);
    }

    public F(Class cls, String str, String str2, int i10) {
        super(AbstractC4849f.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // Cc.l
    public o.a g() {
        return ((Cc.o) getReflected()).g();
    }
}
