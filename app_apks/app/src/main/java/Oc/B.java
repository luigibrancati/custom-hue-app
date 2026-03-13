package Oc;

import Cd.n0;
import Lc.AbstractC1192u;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.T;
import Lc.U;
import Lc.X;
import Lc.a0;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B extends AbstractC1817k implements T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lc.D f12158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U f12159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1174b.a f12161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC1192u f12162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC1196y f12163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Lc.D d10, AbstractC1192u abstractC1192u, U u10, Mc.g gVar, kd.f fVar, boolean z10, boolean z11, boolean z12, InterfaceC1174b.a aVar, a0 a0Var) {
        super(u10.b(), gVar, fVar, a0Var);
        if (d10 == null) {
            g0(0);
        }
        if (abstractC1192u == null) {
            g0(1);
        }
        if (u10 == null) {
            g0(2);
        }
        if (gVar == null) {
            g0(3);
        }
        if (fVar == null) {
            g0(4);
        }
        if (a0Var == null) {
            g0(5);
        }
        this.f12163l = null;
        this.f12158g = d10;
        this.f12162k = abstractC1192u;
        this.f12159h = u10;
        this.f12156e = z10;
        this.f12157f = z11;
        this.f12160i = z12;
        this.f12161j = aVar;
    }

    private static /* synthetic */ void g0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Lc.InterfaceC1196y
    public boolean B() {
        return false;
    }

    @Override // Lc.InterfaceC1196y
    public boolean B0() {
        return false;
    }

    @Override // Lc.InterfaceC1174b
    public void C0(Collection collection) {
        if (collection == null) {
            g0(16);
        }
    }

    @Override // Lc.T
    public boolean E() {
        return this.f12156e;
    }

    @Override // Lc.InterfaceC1196y
    public boolean F0() {
        return false;
    }

    @Override // Lc.InterfaceC1174b
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public T H0(InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // Lc.InterfaceC1173a
    public X J() {
        return T().J();
    }

    public Collection K0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (U u10 : T().d()) {
            InterfaceC1196y interfaceC1196yG = z10 ? u10.g() : u10.h();
            if (interfaceC1196yG != null) {
                arrayList.add(interfaceC1196yG);
            }
        }
        return arrayList;
    }

    public void L0(boolean z10) {
        this.f12156e = z10;
    }

    @Override // Lc.InterfaceC1173a
    public X M() {
        return T().M();
    }

    public void M0(InterfaceC1196y interfaceC1196y) {
        this.f12163l = interfaceC1196y;
    }

    public void N0(AbstractC1192u abstractC1192u) {
        this.f12162k = abstractC1192u;
    }

    @Override // Lc.T
    public U T() {
        U u10 = this.f12159h;
        if (u10 == null) {
            g0(13);
        }
        return u10;
    }

    @Override // Lc.C
    public boolean V() {
        return false;
    }

    @Override // Lc.c0
    public InterfaceC1196y c(n0 n0Var) {
        if (n0Var == null) {
            g0(7);
        }
        return this;
    }

    @Override // Lc.InterfaceC1174b
    public InterfaceC1174b.a f() {
        InterfaceC1174b.a aVar = this.f12161j;
        if (aVar == null) {
            g0(6);
        }
        return aVar;
    }

    @Override // Lc.InterfaceC1173a
    public boolean f0() {
        return false;
    }

    @Override // Lc.InterfaceC1173a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            g0(9);
        }
        return list;
    }

    @Override // Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = this.f12162k;
        if (abstractC1192u == null) {
            g0(11);
        }
        return abstractC1192u;
    }

    @Override // Lc.C
    public boolean isExternal() {
        return this.f12157f;
    }

    @Override // Lc.InterfaceC1196y
    public boolean isInfix() {
        return false;
    }

    @Override // Lc.InterfaceC1196y
    public boolean isInline() {
        return this.f12160i;
    }

    @Override // Lc.InterfaceC1196y
    public boolean isOperator() {
        return false;
    }

    @Override // Lc.InterfaceC1196y
    public boolean isSuspend() {
        return false;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1196y
    public InterfaceC1196y q0() {
        return this.f12163l;
    }

    @Override // Lc.C
    public Lc.D r() {
        Lc.D d10 = this.f12158g;
        if (d10 == null) {
            g0(10);
        }
        return d10;
    }

    @Override // Lc.InterfaceC1173a
    public List u0() {
        List listU0 = T().u0();
        if (listU0 == null) {
            g0(14);
        }
        return listU0;
    }

    @Override // Lc.InterfaceC1173a
    public Object y0(InterfaceC1173a.InterfaceC0132a interfaceC0132a) {
        return null;
    }
}
