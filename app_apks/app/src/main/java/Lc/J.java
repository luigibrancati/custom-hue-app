package Lc;

import Cd.C0728k;
import Cd.u0;
import Oc.AbstractC1813g;
import Oc.C1819m;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bd.n f8720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f8721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.g f8722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.g f8723d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kd.b f8724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f8725b;

        public a(kd.b classId, List typeParametersCount) {
            AbstractC4862t.e(classId, "classId");
            AbstractC4862t.e(typeParametersCount, "typeParametersCount");
            this.f8724a = classId;
            this.f8725b = typeParametersCount;
        }

        public final kd.b a() {
            return this.f8724a;
        }

        public final List b() {
            return this.f8725b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f8724a, aVar.f8724a) && AbstractC4862t.a(this.f8725b, aVar.f8725b);
        }

        public int hashCode() {
            return (this.f8724a.hashCode() * 31) + this.f8725b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f8724a + ", typeParametersCount=" + this.f8725b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC1813g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f8726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f8727j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C0728k f8728k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bd.n storageManager, InterfaceC1185m container, kd.f name, boolean z10, int i10) {
            super(storageManager, container, name, a0.f8746a, false);
            AbstractC4862t.e(storageManager, "storageManager");
            AbstractC4862t.e(container, "container");
            AbstractC4862t.e(name, "name");
            this.f8726i = z10;
            Bc.f fVarP = Bc.k.p(0, i10);
            ArrayList arrayList = new ArrayList(C4207u.v(fVarP, 10));
            Iterator it = fVarP.iterator();
            while (it.hasNext()) {
                int iNextInt = ((gc.M) it).nextInt();
                Mc.g gVarB = Mc.g.f9435K.b();
                u0 u0Var = u0.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(Oc.K.R0(this, gVarB, false, u0Var, kd.f.s(sb2.toString()), iNextInt, storageManager));
            }
            this.f8727j = arrayList;
            this.f8728k = new C0728k(this, g0.d(this), gc.T.c(AbstractC5823c.p(this).n().i()), storageManager);
        }

        @Override // Lc.InterfaceC1177e
        public InterfaceC1176d C() {
            return null;
        }

        @Override // Lc.InterfaceC1177e
        public boolean I0() {
            return false;
        }

        @Override // Lc.InterfaceC1177e
        /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
        public InterfaceC6099h.b l0() {
            return InterfaceC6099h.b.f46015b;
        }

        @Override // Lc.InterfaceC1180h
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public C0728k k() {
            return this.f8728k;
        }

        @Override // Oc.t
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public InterfaceC6099h.b D0(Dd.g kotlinTypeRefiner) {
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            return InterfaceC6099h.b.f46015b;
        }

        @Override // Lc.InterfaceC1177e
        public h0 S() {
            return null;
        }

        @Override // Lc.C
        public boolean V() {
            return false;
        }

        @Override // Lc.InterfaceC1177e
        public boolean Z() {
            return false;
        }

        @Override // Lc.InterfaceC1177e
        public boolean d0() {
            return false;
        }

        @Override // Lc.InterfaceC1177e
        public EnumC1178f f() {
            return EnumC1178f.CLASS;
        }

        @Override // Mc.a
        public Mc.g getAnnotations() {
            return Mc.g.f9435K.b();
        }

        @Override // Lc.InterfaceC1177e, Lc.InterfaceC1189q, Lc.C
        public AbstractC1192u getVisibility() {
            AbstractC1192u PUBLIC = AbstractC1191t.f8775e;
            AbstractC4862t.d(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // Lc.InterfaceC1177e
        public boolean i0() {
            return false;
        }

        @Override // Oc.AbstractC1813g, Lc.C
        public boolean isExternal() {
            return false;
        }

        @Override // Lc.InterfaceC1177e
        public boolean isInline() {
            return false;
        }

        @Override // Lc.C
        public boolean k0() {
            return false;
        }

        @Override // Lc.InterfaceC1177e
        public Collection l() {
            return gc.U.d();
        }

        @Override // Lc.InterfaceC1177e
        public InterfaceC1177e m0() {
            return null;
        }

        @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
        public List q() {
            return this.f8727j;
        }

        @Override // Lc.InterfaceC1177e, Lc.C
        public D r() {
            return D.FINAL;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // Lc.InterfaceC1177e
        public Collection x() {
            return C4206t.k();
        }

        @Override // Lc.InterfaceC1181i
        public boolean z() {
            return this.f8726i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {
        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1177e invoke(a aVar) {
            InterfaceC1185m interfaceC1185mD;
            AbstractC4862t.e(aVar, "<name for destructuring parameter 0>");
            kd.b bVarA = aVar.a();
            List listB = aVar.b();
            if (bVarA.k()) {
                throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
            }
            kd.b bVarG = bVarA.g();
            if (bVarG == null || (interfaceC1185mD = J.this.d(bVarG, C4179C.b0(listB, 1))) == null) {
                Bd.g gVar = J.this.f8722c;
                kd.c cVarH = bVarA.h();
                AbstractC4862t.d(cVarH, "classId.packageFqName");
                interfaceC1185mD = (InterfaceC1179g) gVar.invoke(cVarH);
            }
            InterfaceC1185m interfaceC1185m = interfaceC1185mD;
            boolean zL = bVarA.l();
            Bd.n nVar = J.this.f8720a;
            kd.f fVarJ = bVarA.j();
            AbstractC4862t.d(fVarJ, "classId.shortClassName");
            Integer num = (Integer) C4179C.j0(listB);
            return new b(nVar, interfaceC1185m, fVarJ, zL, num != null ? num.intValue() : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {
        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(kd.c fqName) {
            AbstractC4862t.e(fqName, "fqName");
            return new C1819m(J.this.f8721b, fqName);
        }
    }

    public J(Bd.n storageManager, G module) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(module, "module");
        this.f8720a = storageManager;
        this.f8721b = module;
        this.f8722c = storageManager.g(new d());
        this.f8723d = storageManager.g(new c());
    }

    public final InterfaceC1177e d(kd.b classId, List typeParametersCount) {
        AbstractC4862t.e(classId, "classId");
        AbstractC4862t.e(typeParametersCount, "typeParametersCount");
        return (InterfaceC1177e) this.f8723d.invoke(new a(classId, typeParametersCount));
    }
}
