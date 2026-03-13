package yd;

import Lc.G;
import Lc.K;
import Lc.O;
import gc.C4206t;
import gc.U;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: yd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6468a implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bd.n f48542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f48543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f48544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C6478k f48545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.h f48546e;

    /* JADX INFO: renamed from: yd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0673a extends kotlin.jvm.internal.v implements vc.l {
        public C0673a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(kd.c fqName) {
            AbstractC4862t.e(fqName, "fqName");
            p pVarD = AbstractC6468a.this.d(fqName);
            if (pVarD == null) {
                return null;
            }
            pVarD.L0(AbstractC6468a.this.e());
            return pVarD;
        }
    }

    public AbstractC6468a(Bd.n storageManager, u finder, G moduleDescriptor) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(finder, "finder");
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        this.f48542a = storageManager;
        this.f48543b = finder;
        this.f48544c = moduleDescriptor;
        this.f48546e = storageManager.b(new C0673a());
    }

    @Override // Lc.L
    public List a(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return C4206t.o(this.f48546e.invoke(fqName));
    }

    @Override // Lc.O
    public void b(kd.c fqName, Collection packageFragments) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(packageFragments, "packageFragments");
        Md.a.a(packageFragments, this.f48546e.invoke(fqName));
    }

    @Override // Lc.O
    public boolean c(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return (this.f48546e.o(fqName) ? (K) this.f48546e.invoke(fqName) : d(fqName)) == null;
    }

    public abstract p d(kd.c cVar);

    public final C6478k e() {
        C6478k c6478k = this.f48545d;
        if (c6478k != null) {
            return c6478k;
        }
        AbstractC4862t.p("components");
        return null;
    }

    public final u f() {
        return this.f48543b;
    }

    public final G g() {
        return this.f48544c;
    }

    public final Bd.n h() {
        return this.f48542a;
    }

    public final void i(C6478k c6478k) {
        AbstractC4862t.e(c6478k, "<set-?>");
        this.f48545d = c6478k;
    }

    @Override // Lc.L
    public Collection t(kd.c fqName, vc.l nameFilter) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return U.d();
    }
}
