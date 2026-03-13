package Jc;

import Bd.n;
import Cd.AbstractC0719b;
import Cd.F;
import Cd.a0;
import Cd.e0;
import Cd.k0;
import Cd.u0;
import Ic.j;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.AbstractC1195x;
import Lc.D;
import Lc.EnumC1178f;
import Lc.G;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.K;
import Lc.d0;
import Lc.f0;
import Lc.h0;
import Mc.g;
import Oc.AbstractC1807a;
import fc.C4015H;
import fc.C4032o;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC1807a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f6378m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final kd.b f6379n = new kd.b(j.f5739u, f.s("Function"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kd.b f6380o = new kd.b(j.f5736r, f.s("KFunction"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f6381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K f6382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f6383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0108b f6385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f6386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f6387l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: Jc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0108b extends AbstractC0719b {

        /* JADX INFO: renamed from: Jc.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6389a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Function.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.KFunction.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.SuspendFunction.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.KSuspendFunction.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f6389a = iArr;
            }
        }

        public C0108b() {
            super(b.this.f6381f);
        }

        @Override // Cd.AbstractC0723f
        public Collection f() {
            List<kd.b> listD;
            int i10 = a.f6389a[b.this.U0().ordinal()];
            if (i10 == 1) {
                listD = C4205s.d(b.f6379n);
            } else if (i10 == 2) {
                listD = C4206t.n(b.f6380o, new kd.b(j.f5739u, c.Function.p(b.this.Q0())));
            } else if (i10 == 3) {
                listD = C4205s.d(b.f6379n);
            } else {
                if (i10 != 4) {
                    throw new C4032o();
                }
                listD = C4206t.n(b.f6380o, new kd.b(j.f5731m, c.SuspendFunction.p(b.this.Q0())));
            }
            G gB = b.this.f6382g.b();
            ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
            for (kd.b bVar : listD) {
                InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(gB, bVar);
                if (interfaceC1177eA == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listN0 = C4179C.N0(getParameters(), interfaceC1177eA.k().getParameters().size());
                ArrayList arrayList2 = new ArrayList(C4207u.v(listN0, 10));
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new k0(((f0) it.next()).p()));
                }
                arrayList.add(F.g(a0.f1311b.h(), interfaceC1177eA, arrayList2));
            }
            return C4179C.V0(arrayList);
        }

        @Override // Cd.e0
        public List getParameters() {
            return b.this.f6387l;
        }

        @Override // Cd.AbstractC0723f
        public d0 j() {
            return d0.a.f8751a;
        }

        @Override // Cd.e0
        public boolean r() {
            return true;
        }

        public String toString() {
            return q().toString();
        }

        @Override // Cd.AbstractC0719b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b q() {
            return b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n storageManager, K containingDeclaration, c functionKind, int i10) {
        super(storageManager, functionKind.p(i10));
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(functionKind, "functionKind");
        this.f6381f = storageManager;
        this.f6382g = containingDeclaration;
        this.f6383h = functionKind;
        this.f6384i = i10;
        this.f6385j = new C0108b();
        this.f6386k = new d(storageManager, this);
        ArrayList arrayList = new ArrayList();
        Bc.f fVar = new Bc.f(1, i10);
        ArrayList arrayList2 = new ArrayList(C4207u.v(fVar, 10));
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((M) it).nextInt();
            u0 u0Var = u0.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            K0(arrayList, this, u0Var, sb2.toString());
            arrayList2.add(C4015H.f34254a);
        }
        K0(arrayList, this, u0.OUT_VARIANCE, "R");
        this.f6387l = C4179C.V0(arrayList);
    }

    public static final void K0(ArrayList arrayList, b bVar, u0 u0Var, String str) {
        arrayList.add(Oc.K.R0(bVar, g.f9435K.b(), false, u0Var, f.s(str), arrayList.size(), bVar.f6381f));
    }

    @Override // Lc.InterfaceC1177e
    public /* bridge */ /* synthetic */ InterfaceC1176d C() {
        return (InterfaceC1176d) Y0();
    }

    @Override // Lc.InterfaceC1177e
    public boolean I0() {
        return false;
    }

    public final int Q0() {
        return this.f6384i;
    }

    public Void R0() {
        return null;
    }

    @Override // Lc.InterfaceC1177e
    public h0 S() {
        return null;
    }

    @Override // Lc.InterfaceC1177e
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List l() {
        return C4206t.k();
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1186n, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public K b() {
        return this.f6382g;
    }

    public final c U0() {
        return this.f6383h;
    }

    @Override // Lc.C
    public boolean V() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public List x() {
        return C4206t.k();
    }

    @Override // Lc.InterfaceC1177e
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public InterfaceC6099h.b l0() {
        return InterfaceC6099h.b.f46015b;
    }

    @Override // Oc.t
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public d D0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f6386k;
    }

    public Void Y0() {
        return null;
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
        return EnumC1178f.INTERFACE;
    }

    @Override // Mc.a
    public g getAnnotations() {
        return g.f9435K.b();
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

    @Override // Lc.C
    public boolean isExternal() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean isInline() {
        return false;
    }

    @Override // Lc.InterfaceC1188p
    public Lc.a0 j() {
        Lc.a0 NO_SOURCE = Lc.a0.f8746a;
        AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // Lc.InterfaceC1180h
    public e0 k() {
        return this.f6385j;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public /* bridge */ /* synthetic */ InterfaceC1177e m0() {
        return (InterfaceC1177e) R0();
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
    public List q() {
        return this.f6387l;
    }

    @Override // Lc.InterfaceC1177e, Lc.C
    public D r() {
        return D.ABSTRACT;
    }

    public String toString() {
        String strB = getName().b();
        AbstractC4862t.d(strB, "name.asString()");
        return strB;
    }

    @Override // Lc.InterfaceC1181i
    public boolean z() {
        return false;
    }
}
