package g3;

import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4878d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements InterfaceC4878d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4878d.c f35423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4132b f35424b;

    public l(InterfaceC4878d.c delegate, C4132b autoCloser) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(autoCloser, "autoCloser");
        this.f35423a = delegate;
        this.f35424b = autoCloser;
    }

    @Override // l3.InterfaceC4878d.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4138h a(InterfaceC4878d.b configuration) {
        AbstractC4862t.e(configuration, "configuration");
        return new C4138h(this.f35423a.a(configuration), this.f35424b);
    }
}
