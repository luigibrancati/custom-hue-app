package Kc;

import Bd.m;
import Bd.n;
import Cd.H;
import Cd.n0;
import Kc.f;
import Lc.AbstractC1190s;
import Lc.AbstractC1191t;
import Lc.AbstractC1195x;
import Lc.D;
import Lc.EnumC1178f;
import Lc.G;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.J;
import Lc.Z;
import Lc.a0;
import Lc.j0;
import Md.b;
import Md.f;
import Oc.C1814h;
import Oc.z;
import dd.AbstractC3917v;
import dd.w;
import dd.y;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import od.C5289k;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;
import yd.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Nc.a, Nc.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f7838h = {M.g(new E(M.b(i.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), M.g(new E(M.b(i.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), M.g(new E(M.b(i.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f7839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kc.d f7840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f7841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cd.E f7842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.i f7843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bd.a f7844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bd.i f7845g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7846a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7846a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f7848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar) {
            super(0);
            this.f7848b = nVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.M invoke() {
            return AbstractC1195x.c(i.this.u().a(), Kc.e.f7813d.a(), new J(this.f7848b, i.this.u().a())).p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends z {
        public d(G g10, kd.c cVar) {
            super(g10, cVar);
        }

        @Override // Lc.K
        /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
        public InterfaceC6099h.b o() {
            return InterfaceC6099h.b.f46015b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements InterfaceC6082a {
        public e() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.E invoke() {
            Cd.M mI = i.this.f7839a.n().i();
            AbstractC4862t.d(mI, "moduleDescriptor.builtIns.anyType");
            return mI;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Yc.f f7850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1177e f7851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Yc.f fVar, InterfaceC1177e interfaceC1177e) {
            super(0);
            this.f7850a = fVar;
            this.f7851b = interfaceC1177e;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1177e invoke() {
            Yc.f fVar = this.f7850a;
            Vc.g EMPTY = Vc.g.f17494a;
            AbstractC4862t.d(EMPTY, "EMPTY");
            return fVar.N0(EMPTY, this.f7851b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kd.f f7852a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kd.f fVar) {
            super(1);
            this.f7852a = fVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(InterfaceC6099h it) {
            AbstractC4862t.e(it, "it");
            return it.a(this.f7852a, Tc.d.FROM_BUILTINS);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends b.AbstractC0144b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ L f7854b;

        public h(String str, L l10) {
            this.f7853a = str;
            this.f7854b = l10;
        }

        @Override // Md.b.AbstractC0144b, Md.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1177e javaClassDescriptor) {
            AbstractC4862t.e(javaClassDescriptor, "javaClassDescriptor");
            String strA = AbstractC3917v.a(y.f33464a, javaClassDescriptor, this.f7853a);
            k kVar = k.f7858a;
            if (kVar.e().contains(strA)) {
                this.f7854b.f39776a = a.HIDDEN;
            } else if (kVar.h().contains(strA)) {
                this.f7854b.f39776a = a.VISIBLE;
            } else if (kVar.c().contains(strA)) {
                this.f7854b.f39776a = a.DROP;
            }
            return this.f7854b.f39776a == null;
        }

        @Override // Md.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = (a) this.f7854b.f39776a;
            return aVar == null ? a.NOT_CONSIDERED : aVar;
        }
    }

    /* JADX INFO: renamed from: Kc.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0124i extends v implements vc.l {
        public C0124i() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(Lc.InterfaceC1174b r3) {
            /*
                r2 = this;
                Lc.b$a r0 = r3.f()
                Lc.b$a r1 = Lc.InterfaceC1174b.a.DECLARATION
                if (r0 != r1) goto L21
                Kc.i r2 = Kc.i.this
                Kc.d r2 = Kc.i.f(r2)
                Lc.m r3 = r3.b()
                java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
                kotlin.jvm.internal.AbstractC4862t.c(r3, r0)
                Lc.e r3 = (Lc.InterfaceC1177e) r3
                boolean r2 = r2.c(r3)
                if (r2 == 0) goto L21
                r2 = 1
                goto L22
            L21:
                r2 = 0
            L22:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Kc.i.C0124i.invoke(Lc.b):java.lang.Boolean");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends v implements InterfaceC6082a {
        public j() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mc.g invoke() {
            return Mc.g.f9435K.a(C4205s.d(Mc.f.b(i.this.f7839a.n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
        }
    }

    public i(G moduleDescriptor, n storageManager, InterfaceC6082a settingsComputation) {
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(settingsComputation, "settingsComputation");
        this.f7839a = moduleDescriptor;
        this.f7840b = Kc.d.f7812a;
        this.f7841c = storageManager.f(settingsComputation);
        this.f7842d = l(storageManager);
        this.f7843e = storageManager.f(new c(storageManager));
        this.f7844f = storageManager.a();
        this.f7845g = storageManager.f(new j());
    }

    public static final boolean o(InterfaceC1184l interfaceC1184l, n0 n0Var, InterfaceC1184l interfaceC1184l2) {
        return C5289k.x(interfaceC1184l, interfaceC1184l2.c(n0Var)) == C5289k.i.a.OVERRIDABLE;
    }

    public static final Iterable s(i this$0, InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(this$0, "this$0");
        Collection collectionO = interfaceC1177e.k().o();
        AbstractC4862t.d(collectionO, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionO.iterator();
        while (it.hasNext()) {
            InterfaceC1180h interfaceC1180hQ = ((Cd.E) it.next()).N0().q();
            InterfaceC1180h interfaceC1180hA = interfaceC1180hQ != null ? interfaceC1180hQ.a() : null;
            InterfaceC1177e interfaceC1177e2 = interfaceC1180hA instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hA : null;
            Yc.f fVarQ = interfaceC1177e2 != null ? this$0.q(interfaceC1177e2) : null;
            if (fVarQ != null) {
                arrayList.add(fVarQ);
            }
        }
        return arrayList;
    }

    public static final Iterable w(InterfaceC1174b interfaceC1174b) {
        return interfaceC1174b.a().d();
    }

    @Override // Nc.c
    public boolean a(InterfaceC1177e classDescriptor, Z functionDescriptor) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        AbstractC4862t.e(functionDescriptor, "functionDescriptor");
        Yc.f fVarQ = q(classDescriptor);
        if (fVarQ == null || !functionDescriptor.getAnnotations().K(Nc.d.a())) {
            return true;
        }
        if (!u().b()) {
            return false;
        }
        String strC = w.c(functionDescriptor, false, false, 3, null);
        Yc.g gVarU = fVarQ.U();
        kd.f name = functionDescriptor.getName();
        AbstractC4862t.d(name, "functionDescriptor.name");
        Collection collectionA = gVarU.a(name, Tc.d.FROM_BUILTINS);
        if (collectionA != null && collectionA.isEmpty()) {
            return false;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(w.c((Z) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // Nc.a
    public Collection b(kd.f name, InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        if (AbstractC4862t.a(name, Kc.a.f7788e.a()) && (classDescriptor instanceof Ad.d) && Ic.g.e0(classDescriptor)) {
            Ad.d dVar = (Ad.d) classDescriptor;
            List listD0 = dVar.b1().D0();
            AbstractC4862t.d(listD0, "classDescriptor.classProto.functionList");
            if (listD0 == null || !listD0.isEmpty()) {
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    if (AbstractC4862t.a(x.b(dVar.a1().g(), ((fd.i) it.next()).Y()), Kc.a.f7788e.a())) {
                        return C4206t.k();
                    }
                }
            }
            return C4205s.d(k(dVar, (Z) C4179C.E0(n().o().a(name, Tc.d.FROM_BUILTINS))));
        }
        if (!u().b()) {
            return C4206t.k();
        }
        Collection<Z> collectionM = m(classDescriptor, new g(name));
        ArrayList arrayList = new ArrayList();
        for (Z z10 : collectionM) {
            InterfaceC1185m interfaceC1185mB = z10.b();
            AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC1196y interfaceC1196yC = z10.c(l.a((InterfaceC1177e) interfaceC1185mB, classDescriptor).c());
            AbstractC4862t.c(interfaceC1196yC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC1196y.a aVarU = ((Z) interfaceC1196yC).u();
            aVarU.l(classDescriptor);
            aVarU.d(classDescriptor.J0());
            aVarU.o();
            int i10 = b.f7846a[r(z10).ordinal()];
            Z z11 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    aVarU.s(t());
                } else if (i10 != 3) {
                }
                InterfaceC1196y interfaceC1196yBuild = aVarU.build();
                AbstractC4862t.b(interfaceC1196yBuild);
                z11 = (Z) interfaceC1196yBuild;
            } else if (!Lc.E.a(classDescriptor)) {
                aVarU.f();
                InterfaceC1196y interfaceC1196yBuild2 = aVarU.build();
                AbstractC4862t.b(interfaceC1196yBuild2);
                z11 = (Z) interfaceC1196yBuild2;
            }
            if (z11 != null) {
                arrayList.add(z11);
            }
        }
        return arrayList;
    }

    @Override // Nc.a
    public Collection c(InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        kd.d dVarM = AbstractC5823c.m(classDescriptor);
        k kVar = k.f7858a;
        if (!kVar.i(dVarM)) {
            return kVar.j(dVarM) ? C4205s.d(this.f7842d) : C4206t.k();
        }
        Cd.M cloneableType = n();
        AbstractC4862t.d(cloneableType, "cloneableType");
        return C4206t.n(cloneableType, this.f7842d);
    }

    @Override // Nc.a
    public Collection d(InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        if (classDescriptor.f() != EnumC1178f.CLASS || !u().b()) {
            return C4206t.k();
        }
        Yc.f fVarQ = q(classDescriptor);
        if (fVarQ == null) {
            return C4206t.k();
        }
        InterfaceC1177e interfaceC1177eF = Kc.d.f(this.f7840b, AbstractC5823c.l(fVarQ), Kc.b.f7790h.a(), null, 4, null);
        if (interfaceC1177eF == null) {
            return C4206t.k();
        }
        n0 n0VarC = l.a(interfaceC1177eF, fVarQ).c();
        List listL = fVarQ.l();
        ArrayList<InterfaceC1176d> arrayList = new ArrayList();
        for (Object obj : listL) {
            InterfaceC1176d interfaceC1176d = (InterfaceC1176d) obj;
            if (interfaceC1176d.getVisibility().d()) {
                Collection<InterfaceC1176d> collectionL = interfaceC1177eF.l();
                AbstractC4862t.d(collectionL, "defaultKotlinVersion.constructors");
                if (collectionL == null || !collectionL.isEmpty()) {
                    for (InterfaceC1176d it : collectionL) {
                        AbstractC4862t.d(it, "it");
                        if (o(it, n0VarC, interfaceC1176d)) {
                            break;
                        }
                    }
                }
                if (!x(interfaceC1176d, classDescriptor) && !Ic.g.j0(interfaceC1176d) && !k.f7858a.d().contains(AbstractC3917v.a(y.f33464a, fVarQ, w.c(interfaceC1176d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        for (InterfaceC1176d interfaceC1176d2 : arrayList) {
            InterfaceC1196y.a aVarU = interfaceC1176d2.u();
            aVarU.l(classDescriptor);
            aVarU.h(classDescriptor.p());
            aVarU.o();
            aVarU.e(n0VarC.j());
            if (!k.f7858a.g().contains(AbstractC3917v.a(y.f33464a, fVarQ, w.c(interfaceC1176d2, false, false, 3, null)))) {
                aVarU.s(t());
            }
            InterfaceC1196y interfaceC1196yBuild = aVarU.build();
            AbstractC4862t.c(interfaceC1196yBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC1176d) interfaceC1196yBuild);
        }
        return arrayList2;
    }

    public final Z k(Ad.d dVar, Z z10) {
        InterfaceC1196y.a aVarU = z10.u();
        aVarU.l(dVar);
        aVarU.m(AbstractC1191t.f8775e);
        aVarU.h(dVar.p());
        aVarU.d(dVar.J0());
        InterfaceC1196y interfaceC1196yBuild = aVarU.build();
        AbstractC4862t.b(interfaceC1196yBuild);
        return (Z) interfaceC1196yBuild;
    }

    public final Cd.E l(n nVar) {
        C1814h c1814h = new C1814h(new d(this.f7839a, new kd.c("java.io")), kd.f.s("Serializable"), D.ABSTRACT, EnumC1178f.INTERFACE, C4205s.d(new H(nVar, new e())), a0.f8746a, false, nVar);
        c1814h.K0(InterfaceC6099h.b.f46015b, U.d(), null);
        Cd.M mP = c1814h.p();
        AbstractC4862t.d(mP, "mockSerializableClass.defaultType");
        return mP;
    }

    public final Collection m(InterfaceC1177e interfaceC1177e, vc.l lVar) {
        Yc.f fVarQ = q(interfaceC1177e);
        if (fVarQ == null) {
            return C4206t.k();
        }
        Collection collectionG = this.f7840b.g(AbstractC5823c.l(fVarQ), Kc.b.f7790h.a());
        InterfaceC1177e interfaceC1177e2 = (InterfaceC1177e) C4179C.t0(collectionG);
        if (interfaceC1177e2 == null) {
            return C4206t.k();
        }
        f.b bVar = Md.f.f9471c;
        ArrayList arrayList = new ArrayList(C4207u.v(collectionG, 10));
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5823c.l((InterfaceC1177e) it.next()));
        }
        Md.f fVarB = bVar.b(arrayList);
        boolean zC = this.f7840b.c(interfaceC1177e);
        InterfaceC6099h interfaceC6099hU = ((InterfaceC1177e) this.f7844f.a(AbstractC5823c.l(fVarQ), new f(fVarQ, interfaceC1177e2))).U();
        AbstractC4862t.d(interfaceC6099hU, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        Iterable iterable = (Iterable) lVar.invoke(interfaceC6099hU);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            Z z10 = (Z) obj;
            if (z10.f() == InterfaceC1174b.a.DECLARATION && z10.getVisibility().d() && !Ic.g.j0(z10)) {
                Collection collectionD = z10.d();
                AbstractC4862t.d(collectionD, "analogueMember.overriddenDescriptors");
                if (collectionD == null || !collectionD.isEmpty()) {
                    Iterator it2 = collectionD.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1185m interfaceC1185mB = ((InterfaceC1196y) it2.next()).b();
                        AbstractC4862t.d(interfaceC1185mB, "it.containingDeclaration");
                        if (fVarB.contains(AbstractC5823c.l(interfaceC1185mB))) {
                            break;
                        }
                    }
                }
                if (!v(z10, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public final Cd.M n() {
        return (Cd.M) m.a(this.f7843e, this, f7838h[1]);
    }

    @Override // Nc.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Set e(InterfaceC1177e classDescriptor) {
        Yc.g gVarU;
        Set setB;
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        if (!u().b()) {
            return U.d();
        }
        Yc.f fVarQ = q(classDescriptor);
        return (fVarQ == null || (gVarU = fVarQ.U()) == null || (setB = gVarU.b()) == null) ? U.d() : setB;
    }

    public final Yc.f q(InterfaceC1177e interfaceC1177e) {
        kd.b bVarN;
        kd.c cVarB;
        if (Ic.g.a0(interfaceC1177e) || !Ic.g.A0(interfaceC1177e)) {
            return null;
        }
        kd.d dVarM = AbstractC5823c.m(interfaceC1177e);
        if (dVarM.f() && (bVarN = Kc.c.f7792a.n(dVarM)) != null && (cVarB = bVarN.b()) != null) {
            InterfaceC1177e interfaceC1177eC = AbstractC1190s.c(u().a(), cVarB, Tc.d.FROM_BUILTINS);
            if (interfaceC1177eC instanceof Yc.f) {
                return (Yc.f) interfaceC1177eC;
            }
        }
        return null;
    }

    public final a r(InterfaceC1196y interfaceC1196y) {
        InterfaceC1185m interfaceC1185mB = interfaceC1196y.b();
        AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = Md.b.b(C4205s.d((InterfaceC1177e) interfaceC1185mB), new Kc.h(this), new h(w.c(interfaceC1196y, false, false, 3, null), new L()));
        AbstractC4862t.d(objB, "jvmDescriptor = computeJ…CONSIDERED\n            })");
        return (a) objB;
    }

    public final Mc.g t() {
        return (Mc.g) m.a(this.f7845g, this, f7838h[2]);
    }

    public final f.b u() {
        return (f.b) m.a(this.f7841c, this, f7838h[0]);
    }

    public final boolean v(Z z10, boolean z11) {
        InterfaceC1185m interfaceC1185mB = z10.b();
        AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = w.c(z10, false, false, 3, null);
        if (z11 ^ k.f7858a.f().contains(AbstractC3917v.a(y.f33464a, (InterfaceC1177e) interfaceC1185mB, strC))) {
            return true;
        }
        Boolean boolE = Md.b.e(C4205s.d(z10), Kc.g.f7836a, new C0124i());
        AbstractC4862t.d(boolE, "private fun SimpleFuncti…scriptor)\n        }\n    }");
        return boolE.booleanValue();
    }

    public final boolean x(InterfaceC1184l interfaceC1184l, InterfaceC1177e interfaceC1177e) {
        if (interfaceC1184l.i().size() != 1) {
            return false;
        }
        List valueParameters = interfaceC1184l.i();
        AbstractC4862t.d(valueParameters, "valueParameters");
        InterfaceC1180h interfaceC1180hQ = ((j0) C4179C.F0(valueParameters)).getType().N0().q();
        return AbstractC4862t.a(interfaceC1180hQ != null ? AbstractC5823c.m(interfaceC1180hQ) : null, AbstractC5823c.m(interfaceC1177e));
    }
}
