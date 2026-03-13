package Lc;

import kotlin.jvm.internal.AbstractC4862t;
import wd.InterfaceC6195g;

/* JADX INFO: renamed from: Lc.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1192u {
    public final Integer a(AbstractC1192u visibility) {
        AbstractC4862t.e(visibility, "visibility");
        return b().a(visibility.b());
    }

    public abstract n0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10);

    public abstract AbstractC1192u f();

    public final String toString() {
        return b().toString();
    }
}
