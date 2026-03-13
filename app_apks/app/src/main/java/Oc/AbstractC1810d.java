package Oc;

import Cd.q0;
import Lc.AbstractC1192u;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.InterfaceC1188p;
import Lc.a0;
import Lc.e0;
import Oc.J;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Oc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1810d extends AbstractC1817k implements e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1192u f12237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f12238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f12239g;

    /* JADX INFO: renamed from: Oc.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {
        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.M invoke(Dd.g gVar) {
            InterfaceC1180h interfaceC1180hF = gVar.f(AbstractC1810d.this);
            if (interfaceC1180hF != null) {
                return interfaceC1180hF.p();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Oc.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {
        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(Cd.t0 r2) {
            /*
                r1 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.AbstractC4862t.d(r2, r0)
                boolean r0 = Cd.G.a(r2)
                if (r0 != 0) goto L27
                Oc.d r1 = Oc.AbstractC1810d.this
                Cd.e0 r2 = r2.N0()
                Lc.h r2 = r2.q()
                boolean r0 = r2 instanceof Lc.f0
                if (r0 == 0) goto L27
                Lc.f0 r2 = (Lc.f0) r2
                Lc.m r2 = r2.b()
                boolean r1 = kotlin.jvm.internal.AbstractC4862t.a(r2, r1)
                if (r1 != 0) goto L27
                r1 = 1
                goto L28
            L27:
                r1 = 0
            L28:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Oc.AbstractC1810d.b.invoke(Cd.t0):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: Oc.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Cd.e0 {
        public c() {
        }

        @Override // Cd.e0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 q() {
            return AbstractC1810d.this;
        }

        @Override // Cd.e0
        public List getParameters() {
            return AbstractC1810d.this.M0();
        }

        @Override // Cd.e0
        public Ic.g n() {
            return AbstractC5823c.j(q());
        }

        @Override // Cd.e0
        public Collection o() {
            Collection collectionO = q().r0().N0().o();
            AbstractC4862t.d(collectionO, "declarationDescriptor.un…pe.constructor.supertypes");
            return collectionO;
        }

        @Override // Cd.e0
        public Cd.e0 p(Dd.g kotlinTypeRefiner) {
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this;
        }

        @Override // Cd.e0
        public boolean r() {
            return true;
        }

        public String toString() {
            return "[typealias " + q().getName().b() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1810d(InterfaceC1185m containingDeclaration, Mc.g annotations, kd.f name, a0 sourceElement, AbstractC1192u visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(sourceElement, "sourceElement");
        AbstractC4862t.e(visibilityImpl, "visibilityImpl");
        this.f12237e = visibilityImpl;
        this.f12239g = new c();
    }

    public final Cd.M G0() {
        InterfaceC6099h interfaceC6099hU;
        InterfaceC1177e interfaceC1177eS = s();
        if (interfaceC1177eS == null || (interfaceC6099hU = interfaceC1177eS.U()) == null) {
            interfaceC6099hU = InterfaceC6099h.b.f46015b;
        }
        Cd.M mV = q0.v(this, interfaceC6099hU, new a());
        AbstractC4862t.d(mV, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return mV;
    }

    public abstract Bd.n K();

    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public e0 a() {
        InterfaceC1188p interfaceC1188pA = super.a();
        AbstractC4862t.c(interfaceC1188pA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (e0) interfaceC1188pA;
    }

    public final Collection L0() {
        InterfaceC1177e interfaceC1177eS = s();
        if (interfaceC1177eS == null) {
            return C4206t.k();
        }
        Collection<InterfaceC1176d> collectionL = interfaceC1177eS.l();
        AbstractC4862t.d(collectionL, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1176d it : collectionL) {
            J.a aVar = J.f12205I;
            Bd.n nVarK = K();
            AbstractC4862t.d(it, "it");
            I iB = aVar.b(nVarK, this, it);
            if (iB != null) {
                arrayList.add(iB);
            }
        }
        return arrayList;
    }

    public abstract List M0();

    public final void N0(List declaredTypeParameters) {
        AbstractC4862t.e(declaredTypeParameters, "declaredTypeParameters");
        this.f12238f = declaredTypeParameters;
    }

    @Override // Lc.C
    public boolean V() {
        return false;
    }

    @Override // Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        return this.f12237e;
    }

    @Override // Lc.C
    public boolean isExternal() {
        return false;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o visitor, Object obj) {
        AbstractC4862t.e(visitor, "visitor");
        return visitor.d(this, obj);
    }

    @Override // Lc.InterfaceC1180h
    public Cd.e0 k() {
        return this.f12239g;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1181i
    public List q() {
        List list = this.f12238f;
        if (list != null) {
            return list;
        }
        AbstractC4862t.p("declaredTypeParametersImpl");
        return null;
    }

    @Override // Oc.AbstractC1816j
    public String toString() {
        return "typealias " + getName().b();
    }

    @Override // Lc.InterfaceC1181i
    public boolean z() {
        return q0.c(r0(), new b());
    }
}
