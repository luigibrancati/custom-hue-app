package g3;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4878d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC4878d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f35435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f35436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4878d.c f35437d;

    public n(String str, File file, Callable callable, InterfaceC4878d.c delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f35434a = str;
        this.f35435b = file;
        this.f35436c = callable;
        this.f35437d = delegate;
    }

    @Override // l3.InterfaceC4878d.c
    public InterfaceC4878d a(InterfaceC4878d.b configuration) {
        AbstractC4862t.e(configuration, "configuration");
        return new m(configuration.f39843a, this.f35434a, this.f35435b, this.f35436c, configuration.f39845c.f39841a, this.f35437d.a(configuration));
    }
}
