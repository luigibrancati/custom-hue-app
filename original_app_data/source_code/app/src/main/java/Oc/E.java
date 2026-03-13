package Oc;

import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1187o;
import Lc.U;
import Lc.W;
import Lc.a0;
import Lc.j0;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class E extends B implements W {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j0 f12199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final W f12200n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(U u10, Mc.g gVar, Lc.D d10, AbstractC1192u abstractC1192u, boolean z10, boolean z11, boolean z12, InterfaceC1174b.a aVar, W w10, a0 a0Var) {
        super(d10, abstractC1192u, u10, gVar, kd.f.w("<set-" + u10.getName() + ">"), z10, z11, z12, aVar, a0Var);
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
        this.f12200n = w10 != null ? w10 : this;
    }

    public static L O0(W w10, Cd.E e10, Mc.g gVar) {
        if (w10 == null) {
            g0(7);
        }
        if (e10 == null) {
            g0(8);
        }
        if (gVar == null) {
            g0(9);
        }
        return new L(w10, null, 0, gVar, kd.h.f39580o, e10, false, false, false, null, a0.f8746a);
    }

    private static /* synthetic */ void g0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public W a() {
        W w10 = this.f12200n;
        if (w10 == null) {
            g0(13);
        }
        return w10;
    }

    public void Q0(j0 j0Var) {
        if (j0Var == null) {
            g0(6);
        }
        this.f12199m = j0Var;
    }

    @Override // Lc.InterfaceC1196y, Lc.InterfaceC1174b, Lc.InterfaceC1173a
    public Collection d() {
        Collection collectionK0 = super.K0(false);
        if (collectionK0 == null) {
            g0(10);
        }
        return collectionK0;
    }

    @Override // Lc.InterfaceC1173a
    public Cd.E getReturnType() {
        Cd.M mZ = AbstractC5823c.j(this).Z();
        if (mZ == null) {
            g0(12);
        }
        return mZ;
    }

    @Override // Lc.InterfaceC1173a
    public List i() {
        j0 j0Var = this.f12199m;
        if (j0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(j0Var);
        if (listSingletonList == null) {
            g0(11);
        }
        return listSingletonList;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.i(this, obj);
    }
}
