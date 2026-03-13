package Ed;

import Lc.InterfaceC1180h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vd.C6095d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(formatParams, "formatParams");
    }

    @Override // Ed.f, vd.InterfaceC6099h
    public Set b() {
        throw new IllegalStateException();
    }

    @Override // Ed.f, vd.InterfaceC6099h
    public Set d() {
        throw new IllegalStateException();
    }

    @Override // Ed.f, vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Ed.f, vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // Ed.f, vd.InterfaceC6099h
    public Set g() {
        throw new IllegalStateException();
    }

    @Override // Ed.f, vd.InterfaceC6099h
    /* JADX INFO: renamed from: h */
    public Set a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Ed.f, vd.InterfaceC6099h
    /* JADX INFO: renamed from: i */
    public Set c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Ed.f
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
