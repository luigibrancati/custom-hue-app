package kotlin.jvm.internal;

import Cc.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B extends H implements Cc.m {
    public B() {
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.c computeReflected() {
        return M.f(this);
    }

    @Override // vc.InterfaceC6082a
    public Object invoke() {
        return get();
    }

    public B(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // Cc.l
    public m.a g() {
        return ((Cc.m) getReflected()).g();
    }
}
