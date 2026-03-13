package dd;

import Lc.InterfaceC1177e;
import Lc.K;
import ed.C3979a;
import fc.C4034q;
import gc.C4206t;
import gc.T;
import gc.U;
import java.util.Collection;
import java.util.Set;
import jd.C4764e;
import jd.C4765f;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;
import yd.C6474g;
import yd.C6478k;

/* JADX INFO: renamed from: dd.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3903h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33422b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f33423c = T.c(C3979a.EnumC0429a.CLASS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f33424d = U.h(C3979a.EnumC0429a.FILE_FACADE, C3979a.EnumC0429a.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C4764e f33425e = new C4764e(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C4764e f33426f = new C4764e(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4764e f33427g = new C4764e(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C6478k f33428a;

    /* JADX INFO: renamed from: dd.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C4764e a() {
            return C3903h.f33427g;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: dd.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33429a = new b();

        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return C4206t.k();
        }
    }

    public final InterfaceC6099h b(K descriptor, InterfaceC3913r kotlinClass) {
        C4034q c4034qM;
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(kotlinClass, "kotlinClass");
        String[] strArrJ = j(kotlinClass, f33424d);
        if (strArrJ == null) {
            return null;
        }
        String[] strArrG = kotlinClass.e().g();
        try {
            if (strArrG == null) {
                return null;
            }
            try {
                c4034qM = C4768i.m(strArrJ, strArrG);
            } catch (md.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
            }
        } catch (Throwable th) {
            if (f() || kotlinClass.e().d().h()) {
                throw th;
            }
            c4034qM = null;
        }
        if (c4034qM == null) {
            return null;
        }
        C4765f c4765f = (C4765f) c4034qM.a();
        fd.l lVar = (fd.l) c4034qM.b();
        C3907l c3907l = new C3907l(kotlinClass, lVar, c4765f, e(kotlinClass), h(kotlinClass), c(kotlinClass));
        return new Ad.i(descriptor, lVar, c4765f, kotlinClass.e().d(), c3907l, d(), "scope for " + c3907l + " in " + descriptor, b.f33429a);
    }

    public final Ad.e c(InterfaceC3913r interfaceC3913r) {
        return d().g().d() ? Ad.e.STABLE : interfaceC3913r.e().j() ? Ad.e.FIR_UNSTABLE : interfaceC3913r.e().k() ? Ad.e.IR_UNSTABLE : Ad.e.STABLE;
    }

    public final C6478k d() {
        C6478k c6478k = this.f33428a;
        if (c6478k != null) {
            return c6478k;
        }
        AbstractC4862t.p("components");
        return null;
    }

    public final yd.t e(InterfaceC3913r interfaceC3913r) {
        if (f() || interfaceC3913r.e().d().h()) {
            return null;
        }
        return new yd.t(interfaceC3913r.e().d(), C4764e.f39166i, interfaceC3913r.a(), interfaceC3913r.c());
    }

    public final boolean f() {
        return d().g().e();
    }

    public final boolean g(InterfaceC3913r interfaceC3913r) {
        return !d().g().b() && interfaceC3913r.e().i() && AbstractC4862t.a(interfaceC3913r.e().d(), f33426f);
    }

    public final boolean h(InterfaceC3913r interfaceC3913r) {
        return (d().g().f() && (interfaceC3913r.e().i() || AbstractC4862t.a(interfaceC3913r.e().d(), f33425e))) || g(interfaceC3913r);
    }

    public final C6474g i(InterfaceC3913r kotlinClass) {
        String[] strArrG;
        C4034q c4034qI;
        AbstractC4862t.e(kotlinClass, "kotlinClass");
        String[] strArrJ = j(kotlinClass, f33423c);
        if (strArrJ == null || (strArrG = kotlinClass.e().g()) == null) {
            return null;
        }
        try {
            try {
                c4034qI = C4768i.i(strArrJ, strArrG);
            } catch (md.k e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
            }
        } catch (Throwable th) {
            if (f() || kotlinClass.e().d().h()) {
                throw th;
            }
            c4034qI = null;
        }
        if (c4034qI == null) {
            return null;
        }
        return new C6474g((C4765f) c4034qI.a(), (fd.c) c4034qI.b(), kotlinClass.e().d(), new C3915t(kotlinClass, e(kotlinClass), h(kotlinClass), c(kotlinClass)));
    }

    public final String[] j(InterfaceC3913r interfaceC3913r, Set set) {
        C3979a c3979aE = interfaceC3913r.e();
        String[] strArrA = c3979aE.a();
        if (strArrA == null) {
            strArrA = c3979aE.b();
        }
        if (strArrA == null || !set.contains(c3979aE.c())) {
            return null;
        }
        return strArrA;
    }

    public final InterfaceC1177e k(InterfaceC3913r kotlinClass) {
        AbstractC4862t.e(kotlinClass, "kotlinClass");
        C6474g c6474gI = i(kotlinClass);
        if (c6474gI == null) {
            return null;
        }
        return d().f().d(kotlinClass.c(), c6474gI);
    }

    public final void l(C3901f components) {
        AbstractC4862t.e(components, "components");
        m(components.a());
    }

    public final void m(C6478k c6478k) {
        AbstractC4862t.e(c6478k, "<set-?>");
        this.f33428a = c6478k;
    }
}
