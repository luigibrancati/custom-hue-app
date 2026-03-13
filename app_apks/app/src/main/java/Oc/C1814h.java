package Oc;

import Cd.C0728k;
import Cd.e0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.EnumC1178f;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.a0;
import Lc.h0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Oc.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C1814h extends AbstractC1813g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lc.D f12261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EnumC1178f f12262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0 f12263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC6099h f12264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Set f12265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC1176d f12266n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814h(InterfaceC1185m interfaceC1185m, kd.f fVar, Lc.D d10, EnumC1178f enumC1178f, Collection collection, a0 a0Var, boolean z10, Bd.n nVar) {
        super(nVar, interfaceC1185m, fVar, a0Var, z10);
        if (interfaceC1185m == null) {
            E0(0);
        }
        if (fVar == null) {
            E0(1);
        }
        if (d10 == null) {
            E0(2);
        }
        if (enumC1178f == null) {
            E0(3);
        }
        if (collection == null) {
            E0(4);
        }
        if (a0Var == null) {
            E0(5);
        }
        if (nVar == null) {
            E0(6);
        }
        this.f12261i = d10;
        this.f12262j = enumC1178f;
        this.f12263k = new C0728k(this, Collections.EMPTY_LIST, collection, nVar);
    }

    private static /* synthetic */ void E0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1176d C() {
        return this.f12266n;
    }

    @Override // Oc.t
    public InterfaceC6099h D0(Dd.g gVar) {
        if (gVar == null) {
            E0(12);
        }
        InterfaceC6099h interfaceC6099h = this.f12264l;
        if (interfaceC6099h == null) {
            E0(13);
        }
        return interfaceC6099h;
    }

    @Override // Lc.InterfaceC1177e
    public boolean I0() {
        return false;
    }

    public final void K0(InterfaceC6099h interfaceC6099h, Set set, InterfaceC1176d interfaceC1176d) {
        if (interfaceC6099h == null) {
            E0(7);
        }
        if (set == null) {
            E0(8);
        }
        this.f12264l = interfaceC6099h;
        this.f12265m = set;
        this.f12266n = interfaceC1176d;
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
        EnumC1178f enumC1178f = this.f12262j;
        if (enumC1178f == null) {
            E0(15);
        }
        return enumC1178f;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        Mc.g gVarB = Mc.g.f9435K.b();
        if (gVarB == null) {
            E0(9);
        }
        return gVarB;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = AbstractC1191t.f8775e;
        if (abstractC1192u == null) {
            E0(17);
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
        e0 e0Var = this.f12263k;
        if (e0Var == null) {
            E0(10);
        }
        return e0Var;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public Collection l() {
        Set set = this.f12265m;
        if (set == null) {
            E0(11);
        }
        return set;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h l0() {
        InterfaceC6099h.b bVar = InterfaceC6099h.b.f46015b;
        if (bVar == null) {
            E0(14);
        }
        return bVar;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1177e m0() {
        return null;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
    public List q() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(18);
        }
        return list;
    }

    @Override // Lc.InterfaceC1177e, Lc.C
    public Lc.D r() {
        Lc.D d10 = this.f12261i;
        if (d10 == null) {
            E0(16);
        }
        return d10;
    }

    public String toString() {
        return "class " + getName();
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
        return false;
    }
}
