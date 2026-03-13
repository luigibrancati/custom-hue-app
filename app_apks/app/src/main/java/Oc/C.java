package Oc;

import Cd.AbstractC0735s;
import Cd.l0;
import Cd.n0;
import Cd.u0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.InterfaceC1194w;
import Lc.InterfaceC1196y;
import Lc.T;
import Lc.U;
import Lc.V;
import Lc.W;
import Lc.X;
import Lc.a0;
import Lc.j0;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import wd.C6191c;
import wd.C6192d;
import wd.InterfaceC6194f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C extends N implements U {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC1194w f12164A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC1194w f12165B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lc.D f12166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC1192u f12167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Collection f12168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final U f12169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1174b.a f12170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f12171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f12173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f12174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f12175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f12177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X f12178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public X f12179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f12180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D f12181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public W f12182y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12183z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1185m f12184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Lc.D f12185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC1192u f12186c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC1174b.a f12189f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public X f12192i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public kd.f f12194k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Cd.E f12195l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f12187d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12188e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public l0 f12190g = l0.f1382b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f12191h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public List f12193j = null;

        public a() {
            this.f12184a = C.this.b();
            this.f12185b = C.this.r();
            this.f12186c = C.this.getVisibility();
            this.f12189f = C.this.f();
            this.f12192i = C.this.f12178u;
            this.f12194k = C.this.getName();
            this.f12195l = C.this.getType();
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public U n() {
            return C.this.Q0(this);
        }

        public V o() {
            U u10 = this.f12187d;
            if (u10 == null) {
                return null;
            }
            return u10.g();
        }

        public W p() {
            U u10 = this.f12187d;
            if (u10 == null) {
                return null;
            }
            return u10.h();
        }

        public a q(boolean z10) {
            this.f12191h = z10;
            return this;
        }

        public a r(InterfaceC1174b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f12189f = aVar;
            return this;
        }

        public a s(Lc.D d10) {
            if (d10 == null) {
                a(6);
            }
            this.f12185b = d10;
            return this;
        }

        public a t(InterfaceC1174b interfaceC1174b) {
            this.f12187d = (U) interfaceC1174b;
            return this;
        }

        public a u(InterfaceC1185m interfaceC1185m) {
            if (interfaceC1185m == null) {
                a(0);
            }
            this.f12184a = interfaceC1185m;
            return this;
        }

        public a v(l0 l0Var) {
            if (l0Var == null) {
                a(15);
            }
            this.f12190g = l0Var;
            return this;
        }

        public a w(AbstractC1192u abstractC1192u) {
            if (abstractC1192u == null) {
                a(8);
            }
            this.f12186c = abstractC1192u;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC1185m interfaceC1185m, U u10, Mc.g gVar, Lc.D d10, AbstractC1192u abstractC1192u, boolean z10, kd.f fVar, InterfaceC1174b.a aVar, a0 a0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(interfaceC1185m, gVar, fVar, null, z10, a0Var);
        if (interfaceC1185m == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (d10 == null) {
            g0(2);
        }
        if (abstractC1192u == null) {
            g0(3);
        }
        if (fVar == null) {
            g0(4);
        }
        if (aVar == null) {
            g0(5);
        }
        if (a0Var == null) {
            g0(6);
        }
        this.f12168k = null;
        this.f12177t = Collections.EMPTY_LIST;
        this.f12166i = d10;
        this.f12167j = abstractC1192u;
        this.f12169l = u10 == null ? this : u10;
        this.f12170m = aVar;
        this.f12171n = z11;
        this.f12172o = z12;
        this.f12173p = z13;
        this.f12174q = z14;
        this.f12175r = z15;
        this.f12176s = z16;
    }

    public static C O0(InterfaceC1185m interfaceC1185m, Mc.g gVar, Lc.D d10, AbstractC1192u abstractC1192u, boolean z10, kd.f fVar, InterfaceC1174b.a aVar, a0 a0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (interfaceC1185m == null) {
            g0(7);
        }
        if (gVar == null) {
            g0(8);
        }
        if (d10 == null) {
            g0(9);
        }
        if (abstractC1192u == null) {
            g0(10);
        }
        if (fVar == null) {
            g0(11);
        }
        if (aVar == null) {
            g0(12);
        }
        if (a0Var == null) {
            g0(13);
        }
        return new C(interfaceC1185m, null, gVar, d10, abstractC1192u, z10, fVar, aVar, a0Var, z11, z12, z13, z14, z15, z16);
    }

    public static InterfaceC1196y T0(n0 n0Var, T t10) {
        if (n0Var == null) {
            g0(30);
        }
        if (t10 == null) {
            g0(31);
        }
        if (t10.q0() != null) {
            return t10.q0().c(n0Var);
        }
        return null;
    }

    public static AbstractC1192u Y0(AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar) {
        return (aVar == InterfaceC1174b.a.FAKE_OVERRIDE && AbstractC1191t.g(abstractC1192u.f())) ? AbstractC1191t.f8778h : abstractC1192u;
    }

    public static X d1(n0 n0Var, U u10, X x10) {
        Cd.E eP = n0Var.p(x10.getType(), u0.IN_VARIANCE);
        if (eP == null) {
            return null;
        }
        return new F(u10, new C6191c(u10, eP, ((InterfaceC6194f) x10.getValue()).a(), x10.getValue()), x10.getAnnotations());
    }

    public static X e1(n0 n0Var, U u10, X x10) {
        Cd.E eP = n0Var.p(x10.getType(), u0.IN_VARIANCE);
        if (eP == null) {
            return null;
        }
        return new F(u10, new C6192d(u10, eP, x10.getValue()), x10.getAnnotations());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void g0(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.C.g0(int):void");
    }

    @Override // Lc.l0
    public boolean A() {
        return this.f12176s;
    }

    @Override // Lc.InterfaceC1174b
    public void C0(Collection collection) {
        if (collection == null) {
            g0(40);
        }
        this.f12168k = collection;
    }

    @Override // Oc.M, Lc.InterfaceC1173a
    public X J() {
        return this.f12178u;
    }

    @Override // Oc.M, Lc.InterfaceC1173a
    public X M() {
        return this.f12179v;
    }

    @Override // Lc.U
    public InterfaceC1194w N() {
        return this.f12165B;
    }

    @Override // Lc.InterfaceC1174b
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public U H0(InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar, boolean z10) {
        U uN = X0().u(interfaceC1185m).t(null).s(d10).w(abstractC1192u).r(aVar).q(z10).n();
        if (uN == null) {
            g0(42);
        }
        return uN;
    }

    public C P0(InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, U u10, InterfaceC1174b.a aVar, kd.f fVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(32);
        }
        if (d10 == null) {
            g0(33);
        }
        if (abstractC1192u == null) {
            g0(34);
        }
        if (aVar == null) {
            g0(35);
        }
        if (fVar == null) {
            g0(36);
        }
        if (a0Var == null) {
            g0(37);
        }
        return new C(interfaceC1185m, u10, getAnnotations(), d10, abstractC1192u, L(), fVar, aVar, a0Var, v0(), a0(), k0(), V(), isExternal(), A());
    }

    public U Q0(a aVar) {
        X x10;
        InterfaceC6082a interfaceC6082a;
        if (aVar == null) {
            g0(29);
        }
        C cP0 = P0(aVar.f12184a, aVar.f12185b, aVar.f12186c, aVar.f12187d, aVar.f12189f, aVar.f12194k, S0(aVar.f12188e, aVar.f12187d));
        List typeParameters = aVar.f12193j == null ? getTypeParameters() : aVar.f12193j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        n0 n0VarB = AbstractC0735s.b(typeParameters, aVar.f12190g, cP0, arrayList);
        Cd.E e10 = aVar.f12195l;
        Cd.E eP = n0VarB.p(e10, u0.OUT_VARIANCE);
        if (eP == null) {
            return null;
        }
        Cd.E eP2 = n0VarB.p(e10, u0.IN_VARIANCE);
        if (eP2 != null) {
            cP0.Z0(eP2);
        }
        X x11 = aVar.f12192i;
        if (x11 != null) {
            X xC = x11.c(n0VarB);
            if (xC == null) {
                return null;
            }
            x10 = xC;
        } else {
            x10 = null;
        }
        X x12 = this.f12179v;
        X xE1 = x12 != null ? e1(n0VarB, cP0, x12) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f12177t.iterator();
        while (it.hasNext()) {
            X xD1 = d1(n0VarB, cP0, (X) it.next());
            if (xD1 != null) {
                arrayList2.add(xD1);
            }
        }
        cP0.b1(eP, arrayList, x10, xE1, arrayList2);
        D d10 = this.f12181x == null ? null : new D(cP0, this.f12181x.getAnnotations(), aVar.f12185b, Y0(this.f12181x.getVisibility(), aVar.f12189f), this.f12181x.E(), this.f12181x.isExternal(), this.f12181x.isInline(), aVar.f12189f, aVar.o(), a0.f8746a);
        if (d10 != null) {
            Cd.E returnType = this.f12181x.getReturnType();
            d10.M0(T0(n0VarB, this.f12181x));
            d10.P0(returnType != null ? n0VarB.p(returnType, u0.OUT_VARIANCE) : null);
        }
        E e11 = this.f12182y == null ? null : new E(cP0, this.f12182y.getAnnotations(), aVar.f12185b, Y0(this.f12182y.getVisibility(), aVar.f12189f), this.f12182y.E(), this.f12182y.isExternal(), this.f12182y.isInline(), aVar.f12189f, aVar.p(), a0.f8746a);
        if (e11 != null) {
            List listP0 = p.P0(e11, this.f12182y.i(), n0VarB, false, false, null);
            if (listP0 == null) {
                cP0.a1(true);
                listP0 = Collections.singletonList(E.O0(e11, AbstractC5823c.j(aVar.f12184a).H(), ((j0) this.f12182y.i().get(0)).getAnnotations()));
            }
            if (listP0.size() != 1) {
                throw new IllegalStateException();
            }
            e11.M0(T0(n0VarB, this.f12182y));
            e11.Q0((j0) listP0.get(0));
        }
        InterfaceC1194w interfaceC1194w = this.f12164A;
        o oVar = interfaceC1194w == null ? null : new o(interfaceC1194w.getAnnotations(), cP0);
        InterfaceC1194w interfaceC1194w2 = this.f12165B;
        cP0.V0(d10, e11, oVar, interfaceC1194w2 == null ? null : new o(interfaceC1194w2.getAnnotations(), cP0));
        if (aVar.f12191h) {
            Md.f fVarC = Md.f.c();
            Iterator it2 = d().iterator();
            while (it2.hasNext()) {
                fVarC.add(((U) it2.next()).c(n0VarB));
            }
            cP0.C0(fVarC);
        }
        if (a0() && (interfaceC6082a = this.f12228h) != null) {
            cP0.K0(this.f12227g, interfaceC6082a);
        }
        return cP0;
    }

    @Override // Lc.U
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public D g() {
        return this.f12181x;
    }

    public final a0 S0(boolean z10, U u10) {
        a0 a0VarJ;
        if (z10) {
            if (u10 == null) {
                u10 = a();
            }
            a0VarJ = u10.j();
        } else {
            a0VarJ = a0.f8746a;
        }
        if (a0VarJ == null) {
            g0(28);
        }
        return a0VarJ;
    }

    public void U0(D d10, W w10) {
        V0(d10, w10, null, null);
    }

    @Override // Lc.C
    public boolean V() {
        return this.f12174q;
    }

    public void V0(D d10, W w10, InterfaceC1194w interfaceC1194w, InterfaceC1194w interfaceC1194w2) {
        this.f12181x = d10;
        this.f12182y = w10;
        this.f12164A = interfaceC1194w;
        this.f12165B = interfaceC1194w2;
    }

    public boolean W0() {
        return this.f12183z;
    }

    public a X0() {
        return new a();
    }

    public void Z0(Cd.E e10) {
        if (e10 == null) {
            g0(14);
        }
    }

    @Override // Lc.k0
    public boolean a0() {
        return this.f12172o;
    }

    public void a1(boolean z10) {
        this.f12183z = z10;
    }

    public void b1(Cd.E e10, List list, X x10, X x11, List list2) {
        if (e10 == null) {
            g0(17);
        }
        if (list == null) {
            g0(18);
        }
        if (list2 == null) {
            g0(19);
        }
        G0(e10);
        this.f12180w = new ArrayList(list);
        this.f12179v = x11;
        this.f12178u = x10;
        this.f12177t = list2;
    }

    public void c1(AbstractC1192u abstractC1192u) {
        if (abstractC1192u == null) {
            g0(20);
        }
        this.f12167j = abstractC1192u;
    }

    @Override // Lc.InterfaceC1173a
    public Collection d() {
        Collection collection = this.f12168k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            g0(41);
        }
        return collection;
    }

    @Override // Lc.InterfaceC1174b
    public InterfaceC1174b.a f() {
        InterfaceC1174b.a aVar = this.f12170m;
        if (aVar == null) {
            g0(39);
        }
        return aVar;
    }

    @Override // Oc.M, Lc.InterfaceC1173a
    public Cd.E getReturnType() {
        Cd.E type = getType();
        if (type == null) {
            g0(23);
        }
        return type;
    }

    @Override // Oc.M, Lc.InterfaceC1173a
    public List getTypeParameters() {
        List list = this.f12180w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    @Override // Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = this.f12167j;
        if (abstractC1192u == null) {
            g0(25);
        }
        return abstractC1192u;
    }

    @Override // Lc.U
    public W h() {
        return this.f12182y;
    }

    public boolean isExternal() {
        return this.f12175r;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.c(this, obj);
    }

    @Override // Lc.C
    public boolean k0() {
        return this.f12173p;
    }

    @Override // Lc.C
    public Lc.D r() {
        Lc.D d10 = this.f12166i;
        if (d10 == null) {
            g0(24);
        }
        return d10;
    }

    @Override // Lc.U
    public InterfaceC1194w t0() {
        return this.f12164A;
    }

    @Override // Lc.InterfaceC1173a
    public List u0() {
        List list = this.f12177t;
        if (list == null) {
            g0(22);
        }
        return list;
    }

    @Override // Lc.U
    public List v() {
        ArrayList arrayList = new ArrayList(2);
        D d10 = this.f12181x;
        if (d10 != null) {
            arrayList.add(d10);
        }
        W w10 = this.f12182y;
        if (w10 != null) {
            arrayList.add(w10);
        }
        return arrayList;
    }

    @Override // Lc.k0
    public boolean v0() {
        return this.f12171n;
    }

    @Override // Lc.InterfaceC1173a
    public Object y0(InterfaceC1173a.InterfaceC0132a interfaceC0132a) {
        return null;
    }

    @Override // Lc.c0
    public U c(n0 n0Var) {
        if (n0Var == null) {
            g0(27);
        }
        return n0Var.k() ? this : X0().v(n0Var.j()).t(a()).n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Lc.U] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    public U a() {
        U u10 = this.f12169l;
        ?? A10 = this;
        if (u10 != this) {
            A10 = u10.a();
        }
        if (A10 == 0) {
            g0(38);
        }
        return A10;
    }
}
