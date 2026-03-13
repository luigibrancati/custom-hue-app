package vd;

import Lc.InterfaceC1180h;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6092a implements InterfaceC6099h {
    @Override // vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return i().a(name, location);
    }

    @Override // vd.InterfaceC6099h
    public Set b() {
        return i().b();
    }

    @Override // vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return i().c(name, location);
    }

    @Override // vd.InterfaceC6099h
    public Set d() {
        return i().d();
    }

    @Override // vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return i().e(name, location);
    }

    @Override // vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return i().f(kindFilter, nameFilter);
    }

    @Override // vd.InterfaceC6099h
    public Set g() {
        return i().g();
    }

    public final InterfaceC6099h h() {
        if (!(i() instanceof AbstractC6092a)) {
            return i();
        }
        InterfaceC6099h interfaceC6099hI = i();
        AbstractC4862t.c(interfaceC6099hI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC6092a) interfaceC6099hI).h();
    }

    public abstract InterfaceC6099h i();
}
