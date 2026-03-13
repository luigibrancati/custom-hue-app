package Jc;

import Cd.E;
import Cd.M;
import Cd.n0;
import Cd.u0;
import Jd.q;
import Lc.AbstractC1191t;
import Lc.D;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.a0;
import Lc.f0;
import Lc.j0;
import Mc.g;
import Oc.G;
import Oc.L;
import Oc.p;
import fc.C4034q;
import gc.C4179C;
import gc.C4186J;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd.f;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends G {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f6393E = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final e a(b functionClass, boolean z10) {
            AbstractC4862t.e(functionClass, "functionClass");
            List listQ = functionClass.q();
            e eVar = new e(functionClass, null, InterfaceC1174b.a.DECLARATION, z10, null);
            X xJ0 = functionClass.J0();
            List listK = C4206t.k();
            List listK2 = C4206t.k();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                if (((f0) obj).m() != u0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<C4186J> iterableB1 = C4179C.b1(arrayList);
            ArrayList arrayList2 = new ArrayList(C4207u.v(iterableB1, 10));
            for (C4186J c4186j : iterableB1) {
                arrayList2.add(e.f6393E.b(eVar, c4186j.c(), (f0) c4186j.d()));
            }
            eVar.R0(null, xJ0, listK, listK2, arrayList2, ((f0) C4179C.s0(listQ)).p(), D.ABSTRACT, AbstractC1191t.f8775e);
            eVar.Z0(true);
            return eVar;
        }

        public final j0 b(e eVar, int i10, f0 f0Var) {
            String lowerCase;
            String strB = f0Var.getName().b();
            AbstractC4862t.d(strB, "typeParameter.name.asString()");
            if (AbstractC4862t.a(strB, "T")) {
                lowerCase = "instance";
            } else if (AbstractC4862t.a(strB, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                AbstractC4862t.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            g gVarB = g.f9435K.b();
            f fVarS = f.s(lowerCase);
            AbstractC4862t.d(fVarS, "identifier(name)");
            M mP = f0Var.p();
            AbstractC4862t.d(mP, "typeParameter.defaultType");
            a0 NO_SOURCE = a0.f8746a;
            AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
            return new L(eVar, null, i10, gVarB, fVarS, mP, false, false, false, null, NO_SOURCE);
        }

        public a() {
        }
    }

    public /* synthetic */ e(InterfaceC1185m interfaceC1185m, e eVar, InterfaceC1174b.a aVar, boolean z10, AbstractC4854k abstractC4854k) {
        this(interfaceC1185m, eVar, aVar, z10);
    }

    @Override // Oc.p, Lc.InterfaceC1196y
    public boolean B() {
        return false;
    }

    @Override // Oc.G, Oc.p
    public p L0(InterfaceC1185m newOwner, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a kind, f fVar, g annotations, a0 source) {
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(source, "source");
        return new e(newOwner, (e) interfaceC1196y, kind, isSuspend());
    }

    @Override // Oc.p
    public InterfaceC1196y M0(p.c configuration) {
        AbstractC4862t.e(configuration, "configuration");
        e eVar = (e) super.M0(configuration);
        if (eVar == null) {
            return null;
        }
        List listI = eVar.i();
        AbstractC4862t.d(listI, "substituted.valueParameters");
        if (listI != null && listI.isEmpty()) {
            return eVar;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            E type = ((j0) it.next()).getType();
            AbstractC4862t.d(type, "it.type");
            if (Ic.f.d(type) != null) {
                List listI2 = eVar.i();
                AbstractC4862t.d(listI2, "substituted.valueParameters");
                ArrayList arrayList = new ArrayList(C4207u.v(listI2, 10));
                Iterator it2 = listI2.iterator();
                while (it2.hasNext()) {
                    E type2 = ((j0) it2.next()).getType();
                    AbstractC4862t.d(type2, "it.type");
                    arrayList.add(Ic.f.d(type2));
                }
                return eVar.p1(arrayList);
            }
        }
        return eVar;
    }

    @Override // Oc.p, Lc.C
    public boolean isExternal() {
        return false;
    }

    @Override // Oc.p, Lc.InterfaceC1196y
    public boolean isInline() {
        return false;
    }

    public final InterfaceC1196y p1(List list) {
        f fVar;
        int size = i().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List valueParameters = i();
            AbstractC4862t.d(valueParameters, "valueParameters");
            List<C4034q> listD1 = C4179C.d1(list, valueParameters);
            if (listD1 != null && listD1.isEmpty()) {
                return this;
            }
            for (C4034q c4034q : listD1) {
                if (!AbstractC4862t.a((f) c4034q.a(), ((j0) c4034q.b()).getName())) {
                }
            }
            return this;
        }
        List<j0> valueParameters2 = i();
        AbstractC4862t.d(valueParameters2, "valueParameters");
        ArrayList arrayList = new ArrayList(C4207u.v(valueParameters2, 10));
        for (j0 j0Var : valueParameters2) {
            f name = j0Var.getName();
            AbstractC4862t.d(name, "it.name");
            int index = j0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(j0Var.Q(this, name, index));
        }
        p.c cVarS0 = S0(n0.f1385b);
        if (list.isEmpty()) {
            z10 = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((f) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        p.c cVarK = cVarS0.G(z10).c(arrayList).k(a());
        AbstractC4862t.d(cVarK, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        InterfaceC1196y interfaceC1196yM0 = super.M0(cVarK);
        AbstractC4862t.b(interfaceC1196yM0);
        return interfaceC1196yM0;
    }

    public e(InterfaceC1185m interfaceC1185m, e eVar, InterfaceC1174b.a aVar, boolean z10) {
        super(interfaceC1185m, eVar, g.f9435K.b(), q.f6461i, aVar, a0.f8746a);
        f1(true);
        h1(z10);
        Y0(false);
    }
}
