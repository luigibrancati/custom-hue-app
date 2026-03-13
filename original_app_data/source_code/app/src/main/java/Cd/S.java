package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class S extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f1294a;

    public S(Ic.g kotlinBuiltIns) {
        AbstractC4862t.e(kotlinBuiltIns, "kotlinBuiltIns");
        M mI = kotlinBuiltIns.I();
        AbstractC4862t.d(mI, "kotlinBuiltIns.nullableAnyType");
        this.f1294a = mI;
    }

    @Override // Cd.i0
    public boolean a() {
        return true;
    }

    @Override // Cd.i0
    public u0 b() {
        return u0.OUT_VARIANCE;
    }

    @Override // Cd.i0
    public E getType() {
        return this.f1294a;
    }

    @Override // Cd.i0
    public i0 p(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
