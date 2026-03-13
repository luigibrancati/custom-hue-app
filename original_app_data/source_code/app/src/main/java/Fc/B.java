package Fc;

import Cd.u0;
import Fc.F;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.f0;
import dd.C3907l;
import dd.InterfaceC3913r;
import fc.C4015H;
import fc.C4032o;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.U;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements Cc.q, InterfaceC0837l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f3831d = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(B.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f3834c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3835a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3835a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List upperBounds = B.this.getDescriptor().getUpperBounds();
            AbstractC4862t.d(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(C4207u.v(upperBounds, 10));
            Iterator it = upperBounds.iterator();
            while (it.hasNext()) {
                arrayList.add(new A((Cd.E) it.next(), null, 2, null));
            }
            return arrayList;
        }
    }

    public B(C c10, f0 descriptor) {
        C0836k c0836kC;
        Object objJ0;
        AbstractC4862t.e(descriptor, "descriptor");
        this.f3832a = descriptor;
        this.f3833b = F.d(new b());
        if (c10 == null) {
            InterfaceC1185m interfaceC1185mB = getDescriptor().b();
            AbstractC4862t.d(interfaceC1185mB, "descriptor.containingDeclaration");
            if (interfaceC1185mB instanceof InterfaceC1177e) {
                objJ0 = c((InterfaceC1177e) interfaceC1185mB);
            } else {
                if (!(interfaceC1185mB instanceof InterfaceC1174b)) {
                    throw new D("Unknown type parameter container: " + interfaceC1185mB);
                }
                InterfaceC1185m interfaceC1185mB2 = ((InterfaceC1174b) interfaceC1185mB).b();
                AbstractC4862t.d(interfaceC1185mB2, "declaration.containingDeclaration");
                if (interfaceC1185mB2 instanceof InterfaceC1177e) {
                    c0836kC = c((InterfaceC1177e) interfaceC1185mB2);
                } else {
                    Ad.g gVar = interfaceC1185mB instanceof Ad.g ? (Ad.g) interfaceC1185mB : null;
                    if (gVar == null) {
                        throw new D("Non-class callable descriptor must be deserialized: " + interfaceC1185mB);
                    }
                    Cc.d dVarE = AbstractC6017a.e(a(gVar));
                    AbstractC4862t.c(dVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c0836kC = (C0836k) dVarE;
                }
                objJ0 = interfaceC1185mB.j0(new C0830e(c0836kC), C4015H.f34254a);
            }
            AbstractC4862t.d(objJ0, "when (val declaration = … $declaration\")\n        }");
            c10 = (C) objJ0;
        }
        this.f3834c = c10;
    }

    public final Class a(Ad.g gVar) {
        Class clsF;
        Ad.f fVarI = gVar.I();
        if (!(fVarI instanceof C3907l)) {
            fVarI = null;
        }
        C3907l c3907l = (C3907l) fVarI;
        InterfaceC3913r interfaceC3913rG = c3907l != null ? c3907l.g() : null;
        Qc.f fVar = (Qc.f) (interfaceC3913rG instanceof Qc.f ? interfaceC3913rG : null);
        if (fVar != null && (clsF = fVar.f()) != null) {
            return clsF;
        }
        throw new D("Container of deserialized member is not resolved: " + gVar);
    }

    @Override // Fc.InterfaceC0837l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 getDescriptor() {
        return this.f3832a;
    }

    public final C0836k c(InterfaceC1177e interfaceC1177e) {
        Class clsP = L.p(interfaceC1177e);
        C0836k c0836k = (C0836k) (clsP != null ? AbstractC6017a.e(clsP) : null);
        if (c0836k != null) {
            return c0836k;
        }
        throw new D("Type parameter container is not resolved: " + interfaceC1177e.b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return AbstractC4862t.a(this.f3834c, b10.f3834c) && AbstractC4862t.a(getName(), b10.getName());
    }

    @Override // Cc.q
    public String getName() {
        String strB = getDescriptor().getName().b();
        AbstractC4862t.d(strB, "descriptor.name.asString()");
        return strB;
    }

    @Override // Cc.q
    public List getUpperBounds() {
        Object objB = this.f3833b.b(this, f3831d[0]);
        AbstractC4862t.d(objB, "<get-upperBounds>(...)");
        return (List) objB;
    }

    public int hashCode() {
        return (this.f3834c.hashCode() * 31) + getName().hashCode();
    }

    @Override // Cc.q
    public Cc.s m() {
        int i10 = a.f3835a[getDescriptor().m().ordinal()];
        if (i10 == 1) {
            return Cc.s.INVARIANT;
        }
        if (i10 == 2) {
            return Cc.s.IN;
        }
        if (i10 == 3) {
            return Cc.s.OUT;
        }
        throw new C4032o();
    }

    public String toString() {
        return U.f39782a.a(this);
    }
}
