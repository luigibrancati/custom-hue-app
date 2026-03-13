package Oc;

import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1187o;
import Lc.U;
import Lc.V;
import Lc.a0;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class D extends B implements V {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Cd.E f12197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V f12198n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(U u10, Mc.g gVar, Lc.D d10, AbstractC1192u abstractC1192u, boolean z10, boolean z11, boolean z12, InterfaceC1174b.a aVar, V v10, a0 a0Var) {
        super(d10, abstractC1192u, u10, gVar, kd.f.w("<get-" + u10.getName() + ">"), z10, z11, z12, aVar, a0Var);
        if (u10 == null) {
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
        if (aVar == null) {
            g0(4);
        }
        if (a0Var == null) {
            g0(5);
        }
        this.f12198n = v10 != null ? v10 : this;
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public V a() {
        V v10 = this.f12198n;
        if (v10 == null) {
            g0(8);
        }
        return v10;
    }

    public void P0(Cd.E e10) {
        if (e10 == null) {
            e10 = T().getType();
        }
        this.f12197m = e10;
    }

    @Override // Lc.InterfaceC1196y, Lc.InterfaceC1174b, Lc.InterfaceC1173a
    public Collection d() {
        Collection collectionK0 = super.K0(true);
        if (collectionK0 == null) {
            g0(6);
        }
        return collectionK0;
    }

    @Override // Lc.InterfaceC1173a
    public Cd.E getReturnType() {
        return this.f12197m;
    }

    @Override // Lc.InterfaceC1173a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            g0(7);
        }
        return list;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.g(this, obj);
    }
}
