package Wc;

import Cd.E;
import Lc.AbstractC1192u;
import Lc.C1182j;
import Lc.D;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.U;
import Lc.W;
import Lc.a0;
import Lc.j0;
import Oc.C;
import cd.AbstractC3116r;
import fc.C4034q;
import gc.C4206t;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import od.AbstractC5282d;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends C implements a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f17892C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C4034q f17893D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public E f17894E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC1185m interfaceC1185m, Mc.g gVar, D d10, AbstractC1192u abstractC1192u, boolean z10, kd.f fVar, a0 a0Var, U u10, InterfaceC1174b.a aVar, boolean z11, C4034q c4034q) {
        super(interfaceC1185m, u10, gVar, d10, abstractC1192u, z10, fVar, aVar, a0Var, false, false, false, false, false, false);
        if (interfaceC1185m == null) {
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
        if (fVar == null) {
            g0(4);
        }
        if (a0Var == null) {
            g0(5);
        }
        if (aVar == null) {
            g0(6);
        }
        this.f17894E = null;
        this.f17892C = z11;
        this.f17893D = c4034q;
    }

    public static f f1(InterfaceC1185m interfaceC1185m, Mc.g gVar, D d10, AbstractC1192u abstractC1192u, boolean z10, kd.f fVar, a0 a0Var, boolean z11) {
        if (interfaceC1185m == null) {
            g0(7);
        }
        if (gVar == null) {
            g0(8);
        }
        if (d10 == null) {
            g0(9);
        }
        if (abstractC1192u == null) {
            g0(10);
        }
        if (fVar == null) {
            g0(11);
        }
        if (a0Var == null) {
            g0(12);
        }
        return new f(interfaceC1185m, gVar, d10, abstractC1192u, z10, fVar, a0Var, null, InterfaceC1174b.a.DECLARATION, z11, null);
    }

    private static /* synthetic */ void g0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // Oc.C
    public C P0(InterfaceC1185m interfaceC1185m, D d10, AbstractC1192u abstractC1192u, U u10, InterfaceC1174b.a aVar, kd.f fVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(13);
        }
        if (d10 == null) {
            g0(14);
        }
        if (abstractC1192u == null) {
            g0(15);
        }
        if (aVar == null) {
            g0(16);
        }
        if (fVar == null) {
            g0(17);
        }
        if (a0Var == null) {
            g0(18);
        }
        return new f(interfaceC1185m, getAnnotations(), d10, abstractC1192u, L(), fVar, a0Var, u10, aVar, this.f17892C, this.f17893D);
    }

    @Override // Wc.a
    public a W(E e10, List list, E e11, C4034q c4034q) {
        Oc.D d10;
        Oc.E e12;
        if (list == null) {
            g0(19);
        }
        if (e11 == null) {
            g0(20);
        }
        U uA = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), r(), getVisibility(), L(), getName(), j(), uA, f(), this.f17892C, c4034q);
        Oc.D dG = g();
        if (dG != null) {
            Oc.D d11 = new Oc.D(fVar, dG.getAnnotations(), dG.r(), dG.getVisibility(), dG.E(), dG.isExternal(), dG.isInline(), f(), uA == null ? null : uA.g(), dG.j());
            d11.M0(dG.q0());
            d11.P0(e11);
            d10 = d11;
        } else {
            d10 = null;
        }
        W wH = h();
        if (wH != null) {
            e12 = new Oc.E(fVar, wH.getAnnotations(), wH.r(), wH.getVisibility(), wH.E(), wH.isExternal(), wH.isInline(), f(), uA == null ? null : uA.h(), wH.j());
            e12.M0(e12.q0());
            e12.Q0((j0) wH.i().get(0));
        } else {
            e12 = null;
        }
        fVar.V0(d10, e12, t0(), N());
        fVar.a1(W0());
        InterfaceC6082a interfaceC6082a = this.f12228h;
        if (interfaceC6082a != null) {
            fVar.K0(this.f12227g, interfaceC6082a);
        }
        fVar.C0(d());
        fVar.b1(e11, getTypeParameters(), J(), e10 != null ? AbstractC5282d.i(this, e10, Mc.g.f9435K.b()) : null, C4206t.k());
        return fVar;
    }

    @Override // Oc.C
    public void Z0(E e10) {
        if (e10 == null) {
            g0(22);
        }
        this.f17894E = e10;
    }

    @Override // Oc.C, Lc.k0
    public boolean a0() {
        E type = getType();
        if (this.f17892C && C1182j.a(type)) {
            return !AbstractC3116r.i(type) || Ic.g.u0(type);
        }
        return false;
    }

    @Override // Oc.M, Lc.InterfaceC1173a
    public boolean f0() {
        return false;
    }

    @Override // Oc.C, Lc.InterfaceC1173a
    public Object y0(InterfaceC1173a.InterfaceC0132a interfaceC0132a) {
        C4034q c4034q = this.f17893D;
        if (c4034q == null || !((InterfaceC1173a.InterfaceC0132a) c4034q.e()).equals(interfaceC0132a)) {
            return null;
        }
        return this.f17893D.f();
    }
}
