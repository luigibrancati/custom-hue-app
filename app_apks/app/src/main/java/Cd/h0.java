package Cd;

import Cd.f0;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import fc.AbstractC4040w;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f1362f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0738v f1363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f1364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.f f1365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f1366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.g f1367e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Cd.E a(Cd.E r17, Cd.n0 r18, java.util.Set r19, boolean r20) {
            /*
                Method dump skipped, instruction units count: 513
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Cd.h0.a.a(Cd.E, Cd.n0, java.util.Set, boolean):Cd.E");
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lc.f0 f1368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC0739w f1369b;

        public b(Lc.f0 typeParameter, AbstractC0739w typeAttr) {
            AbstractC4862t.e(typeParameter, "typeParameter");
            AbstractC4862t.e(typeAttr, "typeAttr");
            this.f1368a = typeParameter;
            this.f1369b = typeAttr;
        }

        public final AbstractC0739w a() {
            return this.f1369b;
        }

        public final Lc.f0 b() {
            return this.f1368a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC4862t.a(bVar.f1368a, this.f1368a) && AbstractC4862t.a(bVar.f1369b, this.f1369b);
        }

        public int hashCode() {
            int iHashCode = this.f1368a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f1369b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f1368a + ", typeAttr=" + this.f1369b + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ed.h invoke() {
            return Ed.k.d(Ed.j.CANNOT_COMPUTE_ERASED_BOUND, h0.this.toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {
        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(b bVar) {
            return h0.this.d(bVar.b(), bVar.a());
        }
    }

    public h0(C0738v projectionComputer, g0 options) {
        AbstractC4862t.e(projectionComputer, "projectionComputer");
        AbstractC4862t.e(options, "options");
        this.f1363a = projectionComputer;
        this.f1364b = options;
        Bd.f fVar = new Bd.f("Type parameter upper bound erasure results");
        this.f1365c = fVar;
        this.f1366d = C4029l.b(new c());
        Bd.g gVarG = fVar.g(new d());
        AbstractC4862t.d(gVarG, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.f1367e = gVarG;
    }

    public final E b(AbstractC0739w abstractC0739w) {
        E eW;
        M mA = abstractC0739w.a();
        return (mA == null || (eW = Hd.a.w(mA)) == null) ? e() : eW;
    }

    public final E c(Lc.f0 typeParameter, AbstractC0739w typeAttr) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        AbstractC4862t.e(typeAttr, "typeAttr");
        Object objInvoke = this.f1367e.invoke(new b(typeParameter, typeAttr));
        AbstractC4862t.d(objInvoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return (E) objInvoke;
    }

    public final E d(Lc.f0 f0Var, AbstractC0739w abstractC0739w) {
        i0 i0VarA;
        Set setC = abstractC0739w.c();
        if (setC != null && setC.contains(f0Var.a())) {
            return b(abstractC0739w);
        }
        M mP = f0Var.p();
        AbstractC4862t.d(mP, "typeParameter.defaultType");
        Set<Lc.f0> setG = Hd.a.g(mP, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(gc.P.e(C4207u.v(setG, 10)), 16));
        for (Lc.f0 f0Var2 : setG) {
            if (setC == null || !setC.contains(f0Var2)) {
                i0VarA = this.f1363a.a(f0Var2, abstractC0739w, this, c(f0Var2, abstractC0739w.d(f0Var)));
            } else {
                i0VarA = q0.t(f0Var2, abstractC0739w);
                AbstractC4862t.d(i0VarA, "makeStarProjection(it, typeAttr)");
            }
            C4034q c4034qA = AbstractC4040w.a(f0Var2.k(), i0VarA);
            linkedHashMap.put(c4034qA.e(), c4034qA.f());
        }
        n0 n0VarG = n0.g(f0.a.e(f0.f1357c, linkedHashMap, false, 2, null));
        AbstractC4862t.d(n0VarG, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List upperBounds = f0Var.getUpperBounds();
        AbstractC4862t.d(upperBounds, "typeParameter.upperBounds");
        Set setF = f(n0VarG, upperBounds, abstractC0739w);
        if (setF.isEmpty()) {
            return b(abstractC0739w);
        }
        if (!this.f1364b.a()) {
            if (setF.size() == 1) {
                return (E) C4179C.E0(setF);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listV0 = C4179C.V0(setF);
        ArrayList arrayList = new ArrayList(C4207u.v(listV0, 10));
        Iterator it = listV0.iterator();
        while (it.hasNext()) {
            arrayList.add(((E) it.next()).Q0());
        }
        return Dd.d.a(arrayList);
    }

    public final Ed.h e() {
        return (Ed.h) this.f1366d.getValue();
    }

    public final Set f(n0 n0Var, List list, AbstractC0739w abstractC0739w) {
        Set setB = gc.T.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E e10 = (E) it.next();
            InterfaceC1180h interfaceC1180hQ = e10.N0().q();
            if (interfaceC1180hQ instanceof InterfaceC1177e) {
                setB.add(f1362f.a(e10, n0Var, abstractC0739w.c(), this.f1364b.b()));
            } else if (interfaceC1180hQ instanceof Lc.f0) {
                Set setC = abstractC0739w.c();
                if (setC == null || !setC.contains(interfaceC1180hQ)) {
                    List upperBounds = ((Lc.f0) interfaceC1180hQ).getUpperBounds();
                    AbstractC4862t.d(upperBounds, "declaration.upperBounds");
                    setB.addAll(f(n0Var, upperBounds, abstractC0739w));
                } else {
                    setB.add(b(abstractC0739w));
                }
            }
            if (!this.f1364b.a()) {
                break;
            }
        }
        return gc.T.a(setB);
    }

    public /* synthetic */ h0(C0738v c0738v, g0 g0Var, int i10, AbstractC4854k abstractC4854k) {
        this(c0738v, (i10 & 2) != 0 ? new g0(false, false) : g0Var);
    }
}
