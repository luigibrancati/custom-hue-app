package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class K extends r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M delegate) {
        super(delegate);
        AbstractC4862t.e(delegate, "delegate");
    }

    @Override // Cd.AbstractC0734q, Cd.E
    public boolean O0() {
        return true;
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public K Y0(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        return new K(delegate);
    }
}
