package Lc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends AbstractC1192u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f8770a;

    public r(n0 delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f8770a = delegate;
    }

    @Override // Lc.AbstractC1192u
    public n0 b() {
        return this.f8770a;
    }

    @Override // Lc.AbstractC1192u
    public String c() {
        return b().b();
    }

    @Override // Lc.AbstractC1192u
    public AbstractC1192u f() {
        AbstractC1192u abstractC1192uJ = AbstractC1191t.j(b().d());
        AbstractC4862t.d(abstractC1192uJ, "toDescriptorVisibility(delegate.normalize())");
        return abstractC1192uJ;
    }
}
