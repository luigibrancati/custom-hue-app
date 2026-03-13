package Xc;

import Lc.O;
import Uc.o;
import Xc.k;
import bd.u;
import fc.C4030m;
import gc.C4206t;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f19489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bd.a f19490b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f19492b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(0);
            this.f19492b = uVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yc.h invoke() {
            return new Yc.h(f.this.f19489a, this.f19492b);
        }
    }

    public f(b components) {
        AbstractC4862t.e(components, "components");
        g gVar = new g(components, k.a.f19505a, C4030m.c(null));
        this.f19489a = gVar;
        this.f19490b = gVar.e().a();
    }

    @Override // Lc.L
    public List a(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return C4206t.o(e(fqName));
    }

    @Override // Lc.O
    public void b(kd.c fqName, Collection packageFragments) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(packageFragments, "packageFragments");
        Md.a.a(packageFragments, e(fqName));
    }

    @Override // Lc.O
    public boolean c(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return o.a(this.f19489a.a().d(), fqName, false, 2, null) == null;
    }

    public final Yc.h e(kd.c cVar) {
        u uVarA = o.a(this.f19489a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return (Yc.h) this.f19490b.a(cVar, new a(uVarA));
    }

    @Override // Lc.L
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List t(kd.c fqName, l nameFilter) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(nameFilter, "nameFilter");
        Yc.h hVarE = e(fqName);
        List listO0 = hVarE != null ? hVarE.O0() : null;
        return listO0 == null ? C4206t.k() : listO0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f19489a.a().m();
    }
}
