package Oc;

import Cd.C0728k;
import Cd.e0;
import Lc.AbstractC1192u;
import Lc.EnumC1178f;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.a0;
import Lc.h0;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class y extends AbstractC1813g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EnumC1178f f12378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f12379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Lc.D f12380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC1192u f12381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e0 f12382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f12383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Collection f12384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bd.n f12385p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(InterfaceC1185m interfaceC1185m, EnumC1178f enumC1178f, boolean z10, boolean z11, kd.f fVar, a0 a0Var, Bd.n nVar) {
        super(nVar, interfaceC1185m, fVar, a0Var, z11);
        if (interfaceC1185m == null) {
            E0(0);
        }
        if (enumC1178f == null) {
            E0(1);
        }
        if (fVar == null) {
            E0(2);
        }
        if (a0Var == null) {
            E0(3);
        }
        if (nVar == null) {
            E0(4);
        }
        this.f12384o = new ArrayList();
        this.f12385p = nVar;
        this.f12378i = enumC1178f;
        this.f12379j = z10;
    }

    private static /* synthetic */ void E0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1176d C() {
        return null;
    }

    @Override // Oc.t
    public InterfaceC6099h D0(Dd.g gVar) {
        if (gVar == null) {
            E0(16);
        }
        InterfaceC6099h.b bVar = InterfaceC6099h.b.f46015b;
        if (bVar == null) {
            E0(17);
        }
        return bVar;
    }

    @Override // Lc.InterfaceC1177e
    public boolean I0() {
        return false;
    }

    public void K0() {
        this.f12382m = new C0728k(this, this.f12383n, this.f12384o, this.f12385p);
        Iterator it = l().iterator();
        while (it.hasNext()) {
            ((C1812f) ((InterfaceC1196y) it.next())).g1(p());
        }
    }

    @Override // Lc.InterfaceC1177e
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Set l() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            E0(13);
        }
        return set;
    }

    public void M0(Lc.D d10) {
        if (d10 == null) {
            E0(6);
        }
        this.f12380k = d10;
    }

    public void N0(List list) {
        if (list == null) {
            E0(14);
        }
        if (this.f12383n == null) {
            this.f12383n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void O0(AbstractC1192u abstractC1192u) {
        if (abstractC1192u == null) {
            E0(9);
        }
        this.f12381l = abstractC1192u;
    }

    @Override // Lc.InterfaceC1177e
    public h0 S() {
        return null;
    }

    @Override // Lc.C
    public boolean V() {
        return false;
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
        EnumC1178f enumC1178f = this.f12378i;
        if (enumC1178f == null) {
            E0(8);
        }
        return enumC1178f;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        Mc.g gVarB = Mc.g.f9435K.b();
        if (gVarB == null) {
            E0(5);
        }
        return gVarB;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = this.f12381l;
        if (abstractC1192u == null) {
            E0(10);
        }
        return abstractC1192u;
    }

    @Override // Lc.InterfaceC1177e
    public boolean i0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean isInline() {
        return false;
    }

    @Override // Lc.InterfaceC1180h
    public e0 k() {
        e0 e0Var = this.f12382m;
        if (e0Var == null) {
            E0(11);
        }
        return e0Var;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h l0() {
        InterfaceC6099h.b bVar = InterfaceC6099h.b.f46015b;
        if (bVar == null) {
            E0(18);
        }
        return bVar;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1177e m0() {
        return null;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
    public List q() {
        List list = this.f12383n;
        if (list == null) {
            E0(15);
        }
        return list;
    }

    @Override // Lc.InterfaceC1177e, Lc.C
    public Lc.D r() {
        Lc.D d10 = this.f12380k;
        if (d10 == null) {
            E0(7);
        }
        return d10;
    }

    public String toString() {
        return AbstractC1816j.D0(this);
    }

    @Override // Lc.InterfaceC1177e
    public Collection x() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(19);
        }
        return list;
    }

    @Override // Lc.InterfaceC1181i
    public boolean z() {
        return this.f12379j;
    }
}
