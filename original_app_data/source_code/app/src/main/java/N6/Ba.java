package N6;

import v6.AbstractC6055j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1487t0 f9681a;

    public /* synthetic */ Ba(C1575za c1575za, Aa aa2) {
        this.f9681a = c1575za.f10575a;
    }

    public final AbstractC1487t0 a() {
        return this.f9681a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ba) {
            return AbstractC6055j.a(this.f9681a, ((Ba) obj).f9681a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6055j.b(this.f9681a);
    }
}
