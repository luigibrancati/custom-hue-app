package Oc;

import Cd.n0;
import Cd.u0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1187o;
import Lc.Q;
import Lc.X;
import Lc.a0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import wd.C6197i;

/* JADX INFO: renamed from: Oc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1809c extends AbstractC1816j implements X {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1809c(Mc.g gVar) {
        super(gVar, kd.h.f39574i);
        if (gVar == null) {
            g0(0);
        }
    }

    private static /* synthetic */ void g0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Lc.InterfaceC1173a
    public X J() {
        return null;
    }

    @Override // Lc.InterfaceC1173a
    public X M() {
        return null;
    }

    @Override // Lc.InterfaceC1173a
    public Collection d() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            g0(6);
        }
        return set;
    }

    @Override // Lc.InterfaceC1173a
    public boolean f0() {
        return false;
    }

    @Override // Lc.InterfaceC1173a
    public Cd.E getReturnType() {
        return getType();
    }

    @Override // Lc.i0
    public Cd.E getType() {
        Cd.E type = getValue().getType();
        if (type == null) {
            g0(4);
        }
        return type;
    }

    @Override // Lc.InterfaceC1173a
    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            g0(3);
        }
        return list;
    }

    @Override // Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = AbstractC1191t.f8776f;
        if (abstractC1192u == null) {
            g0(7);
        }
        return abstractC1192u;
    }

    @Override // Lc.InterfaceC1173a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            g0(5);
        }
        return list;
    }

    @Override // Lc.InterfaceC1188p
    public a0 j() {
        a0 a0Var = a0.f8746a;
        if (a0Var == null) {
            g0(9);
        }
        return a0Var;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.h(this, obj);
    }

    @Override // Lc.c0
    public X c(n0 n0Var) {
        if (n0Var == null) {
            g0(1);
        }
        if (!n0Var.k()) {
            Cd.E eP = b() instanceof InterfaceC1177e ? n0Var.p(getType(), u0.OUT_VARIANCE) : n0Var.p(getType(), u0.INVARIANT);
            if (eP == null) {
                return null;
            }
            if (eP != getType()) {
                return new F(b(), new C6197i(eP), getAnnotations());
            }
        }
        return this;
    }

    @Override // Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public Q a() {
        return this;
    }
}
