package Yc;

import Lc.InterfaceC1177e;
import Lc.a0;
import Oc.z;
import bd.InterfaceC2915g;
import bd.u;
import dd.AbstractC3912q;
import dd.C3914s;
import dd.InterfaceC3913r;
import dd.x;
import ed.C3979a;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import td.C5881d;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f19957n = {M.g(new E(M.b(h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), M.g(new E(M.b(h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f19958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Xc.g f19959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bd.i f19960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f19961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bd.i f19962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Mc.g f19963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bd.i f19964m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            x xVarO = h.this.f19959h.a().o();
            String strB = h.this.e().b();
            AbstractC4862t.d(strB, "fqName.asString()");
            List<String> listA = xVarO.a(strB);
            h hVar = h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : listA) {
                kd.b bVarM = kd.b.m(C5881d.d(str).e());
                AbstractC4862t.d(bVarM, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                InterfaceC3913r interfaceC3913rB = AbstractC3912q.b(hVar.f19959h.a().j(), bVarM);
                C4034q c4034qA = interfaceC3913rB != null ? AbstractC4040w.a(str, interfaceC3913rB) : null;
                if (c4034qA != null) {
                    arrayList.add(c4034qA);
                }
            }
            return Q.s(arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19967a;

            static {
                int[] iArr = new int[C3979a.EnumC0429a.values().length];
                try {
                    iArr[C3979a.EnumC0429a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C3979a.EnumC0429a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f19967a = iArr;
            }
        }

        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap invoke() {
            HashMap map = new HashMap();
            for (Map.Entry entry : h.this.M0().entrySet()) {
                String str = (String) entry.getKey();
                InterfaceC3913r interfaceC3913r = (InterfaceC3913r) entry.getValue();
                C5881d c5881dD = C5881d.d(str);
                AbstractC4862t.d(c5881dD, "byInternalName(partInternalName)");
                C3979a c3979aE = interfaceC3913r.e();
                int i10 = a.f19967a[c3979aE.c().ordinal()];
                if (i10 == 1) {
                    String strE = c3979aE.e();
                    if (strE != null) {
                        C5881d c5881dD2 = C5881d.d(strE);
                        AbstractC4862t.d(c5881dD2, "byInternalName(header.mu…: continue@kotlinClasses)");
                        map.put(c5881dD, c5881dD2);
                    }
                } else if (i10 == 2) {
                    map.put(c5881dD, c5881dD);
                }
            }
            return map;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Collection collectionU = h.this.f19958g.u();
            ArrayList arrayList = new ArrayList(C4207u.v(collectionU, 10));
            Iterator it = collectionU.iterator();
            while (it.hasNext()) {
                arrayList.add(((u) it.next()).e());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Xc.g outerContext, u jPackage) {
        super(outerContext.d(), jPackage.e());
        AbstractC4862t.e(outerContext, "outerContext");
        AbstractC4862t.e(jPackage, "jPackage");
        this.f19958g = jPackage;
        Xc.g gVarD = Xc.a.d(outerContext, this, null, 0, 6, null);
        this.f19959h = gVarD;
        this.f19960i = gVarD.e().f(new a());
        this.f19961j = new d(gVarD, jPackage, this);
        this.f19962k = gVarD.e().c(new c(), C4206t.k());
        this.f19963l = gVarD.a().i().b() ? Mc.g.f9435K.b() : Xc.e.a(gVarD, jPackage);
        this.f19964m = gVarD.e().f(new b());
    }

    public final InterfaceC1177e L0(InterfaceC2915g jClass) {
        AbstractC4862t.e(jClass, "jClass");
        return this.f19961j.j().O(jClass);
    }

    public final Map M0() {
        return (Map) Bd.m.a(this.f19960i, this, f19957n[0]);
    }

    @Override // Lc.K
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public d o() {
        return this.f19961j;
    }

    public final List O0() {
        return (List) this.f19962k.invoke();
    }

    @Override // Mc.b, Mc.a
    public Mc.g getAnnotations() {
        return this.f19963l;
    }

    @Override // Oc.z, Oc.AbstractC1817k, Lc.InterfaceC1188p
    public a0 j() {
        return new C3914s(this);
    }

    @Override // Oc.z, Oc.AbstractC1816j
    public String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f19959h.a().m();
    }
}
