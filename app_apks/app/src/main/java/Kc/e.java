package Kc;

import Bd.m;
import Bd.n;
import Ic.j;
import Lc.D;
import Lc.EnumC1178f;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.a0;
import Oc.C1814h;
import gc.C4179C;
import gc.C4205s;
import gc.T;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Nc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kd.f f7816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kd.b f7817h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f7818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f7819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f7820c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f7814e = {M.g(new E(M.b(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7813d = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kd.c f7815f = Ic.j.f5739u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7821a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ic.b invoke(G module) {
            AbstractC4862t.e(module, "module");
            List listH0 = module.z0(e.f7815f).h0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH0) {
                if (obj instanceof Ic.b) {
                    arrayList.add(obj);
                }
            }
            return (Ic.b) C4179C.h0(arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final kd.b a() {
            return e.f7817h;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f7823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar) {
            super(0);
            this.f7823b = nVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1814h invoke() {
            C1814h c1814h = new C1814h((InterfaceC1185m) e.this.f7819b.invoke(e.this.f7818a), e.f7816g, D.ABSTRACT, EnumC1178f.INTERFACE, C4205s.d(e.this.f7818a.n().i()), a0.f8746a, false, this.f7823b);
            c1814h.K0(new Kc.a(this.f7823b, c1814h), U.d(), null);
            return c1814h;
        }
    }

    static {
        kd.d dVar = j.a.f5787d;
        kd.f fVarI = dVar.i();
        AbstractC4862t.d(fVarI, "cloneable.shortName()");
        f7816g = fVarI;
        kd.b bVarM = kd.b.m(dVar.l());
        AbstractC4862t.d(bVarM, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f7817h = bVarM;
    }

    public e(n storageManager, G moduleDescriptor, vc.l computeContainingDeclaration) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        AbstractC4862t.e(computeContainingDeclaration, "computeContainingDeclaration");
        this.f7818a = moduleDescriptor;
        this.f7819b = computeContainingDeclaration;
        this.f7820c = storageManager.f(new c(storageManager));
    }

    @Override // Nc.b
    public boolean a(kd.c packageFqName, kd.f name) {
        AbstractC4862t.e(packageFqName, "packageFqName");
        AbstractC4862t.e(name, "name");
        return AbstractC4862t.a(name, f7816g) && AbstractC4862t.a(packageFqName, f7815f);
    }

    @Override // Nc.b
    public Collection b(kd.c packageFqName) {
        AbstractC4862t.e(packageFqName, "packageFqName");
        return AbstractC4862t.a(packageFqName, f7815f) ? T.c(i()) : U.d();
    }

    @Override // Nc.b
    public InterfaceC1177e c(kd.b classId) {
        AbstractC4862t.e(classId, "classId");
        if (AbstractC4862t.a(classId, f7817h)) {
            return i();
        }
        return null;
    }

    public final C1814h i() {
        return (C1814h) m.a(this.f7820c, this, f7814e[0]);
    }

    public /* synthetic */ e(n nVar, G g10, vc.l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(nVar, g10, (i10 & 4) != 0 ? a.f7821a : lVar);
    }
}
