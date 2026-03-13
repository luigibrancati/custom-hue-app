package kotlin.jvm.internal;

import Cc.j;
import Cc.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends z implements Cc.j {
    public x() {
    }

    @Override // kotlin.jvm.internal.AbstractC4849f
    public Cc.c computeReflected() {
        return M.e(this);
    }

    @Override // vc.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // Cc.l
    public n.a g() {
        return ((Cc.j) getReflected()).g();
    }

    @Override // Cc.i
    public j.a h() {
        return ((Cc.j) getReflected()).h();
    }
}
