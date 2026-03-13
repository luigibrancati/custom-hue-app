package kotlin.jvm.internal;

import Cc.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class D extends H implements Cc.n {
    public D() {
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.c computeReflected() {
        return M.g(this);
    }

    @Override // vc.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public D(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // Cc.l
    public n.a g() {
        return ((Cc.n) getReflected()).g();
    }
}
