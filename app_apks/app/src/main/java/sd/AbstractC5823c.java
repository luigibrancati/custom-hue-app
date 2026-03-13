package sd;

import Cc.g;
import Cd.E;
import Dd.g;
import Dd.h;
import Lc.C1197z;
import Lc.G;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.T;
import Lc.U;
import Lc.h0;
import Lc.j0;
import Md.b;
import Nd.q;
import Nd.t;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kd.d;
import kd.f;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import od.AbstractC5283e;
import vc.l;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: sd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5823c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f44465a;

    /* JADX INFO: renamed from: sd.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4859p implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44466a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final g getOwner() {
            return M.b(j0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j0 p02) {
            AbstractC4862t.e(p02, "p0");
            return Boolean.valueOf(p02.x0());
        }
    }

    /* JADX INFO: renamed from: sd.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends b.AbstractC0144b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f44467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f44468b;

        public b(L l10, l lVar) {
            this.f44467a = l10;
            this.f44468b = lVar;
        }

        @Override // Md.b.AbstractC0144b, Md.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1174b current) {
            AbstractC4862t.e(current, "current");
            if (this.f44467a.f39776a == null && ((Boolean) this.f44468b.invoke(current)).booleanValue()) {
                this.f44467a.f39776a = current;
            }
        }

        @Override // Md.b.AbstractC0144b, Md.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1174b current) {
            AbstractC4862t.e(current, "current");
            return this.f44467a.f39776a == null;
        }

        @Override // Md.b.d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC1174b a() {
            return (InterfaceC1174b) this.f44467a.f39776a;
        }
    }

    /* JADX INFO: renamed from: sd.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0599c extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0599c f44469a = new C0599c();

        public C0599c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1185m invoke(InterfaceC1185m it) {
            AbstractC4862t.e(it, "it");
            return it.b();
        }
    }

    static {
        f fVarS = f.s("value");
        AbstractC4862t.d(fVarS, "identifier(\"value\")");
        f44465a = fVarS;
    }

    public static final boolean c(j0 j0Var) {
        AbstractC4862t.e(j0Var, "<this>");
        Boolean boolE = Md.b.e(C4205s.d(j0Var), C5821a.f44463a, a.f44466a);
        AbstractC4862t.d(boolE, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolE.booleanValue();
    }

    public static final Iterable d(j0 j0Var) {
        Collection collectionD = j0Var.d();
        ArrayList arrayList = new ArrayList(C4207u.v(collectionD, 10));
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(((j0) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC1174b e(InterfaceC1174b interfaceC1174b, boolean z10, l predicate) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return (InterfaceC1174b) Md.b.b(C4205s.d(interfaceC1174b), new C5822b(z10), new b(new L(), predicate));
    }

    public static /* synthetic */ InterfaceC1174b f(InterfaceC1174b interfaceC1174b, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(interfaceC1174b, z10, lVar);
    }

    public static final Iterable g(boolean z10, InterfaceC1174b interfaceC1174b) {
        if (z10) {
            interfaceC1174b = interfaceC1174b != null ? interfaceC1174b.a() : null;
        }
        Collection collectionD = interfaceC1174b != null ? interfaceC1174b.d() : null;
        return collectionD == null ? C4206t.k() : collectionD;
    }

    public static final kd.c h(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        d dVarM = m(interfaceC1185m);
        if (!dVarM.f()) {
            dVarM = null;
        }
        if (dVarM != null) {
            return dVarM.l();
        }
        return null;
    }

    public static final InterfaceC1177e i(Mc.c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        InterfaceC1180h interfaceC1180hQ = cVar.getType().N0().q();
        if (interfaceC1180hQ instanceof InterfaceC1177e) {
            return (InterfaceC1177e) interfaceC1180hQ;
        }
        return null;
    }

    public static final Ic.g j(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        return p(interfaceC1185m).n();
    }

    public static final kd.b k(InterfaceC1180h interfaceC1180h) {
        InterfaceC1185m interfaceC1185mB;
        kd.b bVarK;
        if (interfaceC1180h != null && (interfaceC1185mB = interfaceC1180h.b()) != null) {
            if (interfaceC1185mB instanceof K) {
                return new kd.b(((K) interfaceC1185mB).e(), interfaceC1180h.getName());
            }
            if ((interfaceC1185mB instanceof InterfaceC1181i) && (bVarK = k((InterfaceC1180h) interfaceC1185mB)) != null) {
                return bVarK.d(interfaceC1180h.getName());
            }
        }
        return null;
    }

    public static final kd.c l(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        kd.c cVarN = AbstractC5283e.n(interfaceC1185m);
        AbstractC4862t.d(cVarN, "getFqNameSafe(this)");
        return cVarN;
    }

    public static final d m(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        d dVarM = AbstractC5283e.m(interfaceC1185m);
        AbstractC4862t.d(dVarM, "getFqName(this)");
        return dVarM;
    }

    public static final C1197z n(InterfaceC1177e interfaceC1177e) {
        h0 h0VarS = interfaceC1177e != null ? interfaceC1177e.S() : null;
        if (h0VarS instanceof C1197z) {
            return (C1197z) h0VarS;
        }
        return null;
    }

    public static final Dd.g o(G g10) {
        AbstractC4862t.e(g10, "<this>");
        android.support.v4.media.session.a.a(g10.Y(h.a()));
        return g.a.f2666a;
    }

    public static final G p(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        G g10 = AbstractC5283e.g(interfaceC1185m);
        AbstractC4862t.d(g10, "getContainingModule(this)");
        return g10;
    }

    public static final Nd.h q(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        return t.x(r(interfaceC1185m), 1);
    }

    public static final Nd.h r(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        return q.n(interfaceC1185m, C0599c.f44469a);
    }

    public static final InterfaceC1174b s(InterfaceC1174b interfaceC1174b) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        if (!(interfaceC1174b instanceof T)) {
            return interfaceC1174b;
        }
        U correspondingProperty = ((T) interfaceC1174b).T();
        AbstractC4862t.d(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    public static final InterfaceC1177e t(InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(interfaceC1177e, "<this>");
        for (E e10 : interfaceC1177e.p().N0().o()) {
            if (!Ic.g.b0(e10)) {
                InterfaceC1180h interfaceC1180hQ = e10.N0().q();
                if (AbstractC5283e.w(interfaceC1180hQ)) {
                    AbstractC4862t.c(interfaceC1180hQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (InterfaceC1177e) interfaceC1180hQ;
                }
            }
        }
        return null;
    }

    public static final boolean u(G g10) {
        AbstractC4862t.e(g10, "<this>");
        android.support.v4.media.session.a.a(g10.Y(h.a()));
        return false;
    }

    public static final InterfaceC1177e v(G g10, kd.c topLevelClassFqName, Tc.b location) {
        AbstractC4862t.e(g10, "<this>");
        AbstractC4862t.e(topLevelClassFqName, "topLevelClassFqName");
        AbstractC4862t.e(location, "location");
        topLevelClassFqName.d();
        kd.c cVarE = topLevelClassFqName.e();
        AbstractC4862t.d(cVarE, "topLevelClassFqName.parent()");
        InterfaceC6099h interfaceC6099hO = g10.z0(cVarE).o();
        f fVarG = topLevelClassFqName.g();
        AbstractC4862t.d(fVarG, "topLevelClassFqName.shortName()");
        InterfaceC1180h interfaceC1180hE = interfaceC6099hO.e(fVarG, location);
        if (interfaceC1180hE instanceof InterfaceC1177e) {
            return (InterfaceC1177e) interfaceC1180hE;
        }
        return null;
    }
}
