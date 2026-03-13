package N6;

import java.util.Set;

/* JADX INFO: renamed from: N6.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1526w0 extends AbstractC1423o0 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1487t0 f10515b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return R0.b(this, obj);
    }

    public final AbstractC1487t0 h() {
        AbstractC1487t0 abstractC1487t0 = this.f10515b;
        if (abstractC1487t0 != null) {
            return abstractC1487t0;
        }
        AbstractC1487t0 abstractC1487t0K = k();
        this.f10515b = abstractC1487t0K;
        return abstractC1487t0K;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return R0.a(this);
    }

    public AbstractC1487t0 k() {
        Object[] array = toArray();
        U0 u02 = AbstractC1487t0.f10471b;
        return AbstractC1487t0.k(array, array.length);
    }
}
