package Cd;

import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f1298d;

        public a(List list) {
            this.f1298d = list;
        }

        @Override // Cd.f0
        public i0 k(e0 key) {
            AbstractC4862t.e(key, "key");
            if (!this.f1298d.contains(key)) {
                return null;
            }
            InterfaceC1180h interfaceC1180hQ = key.q();
            AbstractC4862t.c(interfaceC1180hQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return q0.s((Lc.f0) interfaceC1180hQ);
        }
    }

    public static final E a(List list, List list2, Ic.g gVar) {
        E eP = n0.g(new a(list)).p((E) C4179C.h0(list2), u0.OUT_VARIANCE);
        if (eP == null) {
            eP = gVar.y();
        }
        AbstractC4862t.d(eP, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return eP;
    }

    public static final E b(Lc.f0 f0Var) {
        AbstractC4862t.e(f0Var, "<this>");
        InterfaceC1185m interfaceC1185mB = f0Var.b();
        AbstractC4862t.d(interfaceC1185mB, "this.containingDeclaration");
        if (interfaceC1185mB instanceof InterfaceC1181i) {
            List parameters = ((InterfaceC1181i) interfaceC1185mB).k().getParameters();
            AbstractC4862t.d(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C4207u.v(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                e0 e0VarK = ((Lc.f0) it.next()).k();
                AbstractC4862t.d(e0VarK, "it.typeConstructor");
                arrayList.add(e0VarK);
            }
            List upperBounds = f0Var.getUpperBounds();
            AbstractC4862t.d(upperBounds, "upperBounds");
            return a(arrayList, upperBounds, AbstractC5823c.j(f0Var));
        }
        if (!(interfaceC1185mB instanceof InterfaceC1196y)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC1196y) interfaceC1185mB).getTypeParameters();
        AbstractC4862t.d(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(C4207u.v(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            e0 e0VarK2 = ((Lc.f0) it2.next()).k();
            AbstractC4862t.d(e0VarK2, "it.typeConstructor");
            arrayList2.add(e0VarK2);
        }
        List upperBounds2 = f0Var.getUpperBounds();
        AbstractC4862t.d(upperBounds2, "upperBounds");
        return a(arrayList2, upperBounds2, AbstractC5823c.j(f0Var));
    }
}
