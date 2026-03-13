package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class O extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f1291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(M delegate, a0 attributes) {
        super(delegate);
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(attributes, "attributes");
        this.f1291c = attributes;
    }

    @Override // Cd.AbstractC0734q, Cd.E
    public a0 M0() {
        return this.f1291c;
    }

    @Override // Cd.AbstractC0734q
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public O Y0(M delegate) {
        AbstractC4862t.e(delegate, "delegate");
        return new O(delegate, M0());
    }
}
