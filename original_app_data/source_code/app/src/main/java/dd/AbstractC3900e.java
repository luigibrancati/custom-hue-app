package dd;

import Cd.AbstractC0740x;
import Cd.D;
import Cd.E;
import Cd.e0;
import Cd.i0;
import Cd.q0;
import Cd.u0;
import Lc.EnumC1178f;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.V;
import Lc.f0;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5285g;

/* JADX INFO: renamed from: dd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3900e {
    public static final String a(InterfaceC1177e klass, z typeMappingConfiguration) {
        AbstractC4862t.e(klass, "klass");
        AbstractC4862t.e(typeMappingConfiguration, "typeMappingConfiguration");
        String strC = typeMappingConfiguration.c(klass);
        if (strC != null) {
            return strC;
        }
        InterfaceC1185m interfaceC1185mB = klass.b();
        AbstractC4862t.d(interfaceC1185mB, "klass.containingDeclaration");
        String strP = kd.h.b(klass.getName()).p();
        AbstractC4862t.d(strP, "safeIdentifier(klass.name).identifier");
        if (interfaceC1185mB instanceof K) {
            kd.c cVarE = ((K) interfaceC1185mB).e();
            if (cVarE.d()) {
                return strP;
            }
            StringBuilder sb2 = new StringBuilder();
            String strB = cVarE.b();
            AbstractC4862t.d(strB, "fqName.asString()");
            sb2.append(Od.C.K(strB, '.', JsonPointer.SEPARATOR, false, 4, null));
            sb2.append(JsonPointer.SEPARATOR);
            sb2.append(strP);
            return sb2.toString();
        }
        InterfaceC1177e interfaceC1177e = interfaceC1185mB instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1185mB : null;
        if (interfaceC1177e == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC1185mB + " for " + klass);
        }
        String strD = typeMappingConfiguration.d(interfaceC1177e);
        if (strD == null) {
            strD = a(interfaceC1177e, typeMappingConfiguration);
        }
        return strD + '$' + strP;
    }

    public static /* synthetic */ String b(InterfaceC1177e interfaceC1177e, z zVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            zVar = C3893A.f33353a;
        }
        return a(interfaceC1177e, zVar);
    }

    public static final boolean c(InterfaceC1173a descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC1184l) {
            return true;
        }
        E returnType = descriptor.getReturnType();
        AbstractC4862t.b(returnType);
        if (!Ic.g.B0(returnType)) {
            return false;
        }
        E returnType2 = descriptor.getReturnType();
        AbstractC4862t.b(returnType2);
        return (q0.l(returnType2) || (descriptor instanceof V)) ? false : true;
    }

    public static final Object d(E kotlinType, InterfaceC3909n factory, C3894B mode, z typeMappingConfiguration, AbstractC3906k abstractC3906k, vc.q writeGenericType) {
        Object objB;
        E e10;
        Object objD;
        AbstractC4862t.e(kotlinType, "kotlinType");
        AbstractC4862t.e(factory, "factory");
        AbstractC4862t.e(mode, "mode");
        AbstractC4862t.e(typeMappingConfiguration, "typeMappingConfiguration");
        AbstractC4862t.e(writeGenericType, "writeGenericType");
        E eF = typeMappingConfiguration.f(kotlinType);
        if (eF != null) {
            return d(eF, factory, mode, typeMappingConfiguration, abstractC3906k, writeGenericType);
        }
        if (Ic.f.q(kotlinType)) {
            return d(Ic.k.a(kotlinType), factory, mode, typeMappingConfiguration, abstractC3906k, writeGenericType);
        }
        Dd.o oVar = Dd.o.f2691a;
        Object objB2 = AbstractC3895C.b(oVar, kotlinType, factory, mode);
        if (objB2 != null) {
            Object objA = AbstractC3895C.a(factory, objB2, mode.d());
            writeGenericType.invoke(kotlinType, objA, mode);
            return objA;
        }
        e0 e0VarN0 = kotlinType.N0();
        if (e0VarN0 instanceof D) {
            D d10 = (D) e0VarN0;
            E eC = d10.c();
            if (eC == null) {
                eC = typeMappingConfiguration.e(d10.o());
            }
            return d(Hd.a.w(eC), factory, mode, typeMappingConfiguration, abstractC3906k, writeGenericType);
        }
        InterfaceC1180h interfaceC1180hQ = e0VarN0.q();
        if (interfaceC1180hQ == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (Ed.k.m(interfaceC1180hQ)) {
            Object objE = factory.e("error/NonExistentClass");
            typeMappingConfiguration.a(kotlinType, (InterfaceC1177e) interfaceC1180hQ);
            return objE;
        }
        boolean z10 = interfaceC1180hQ instanceof InterfaceC1177e;
        if (z10 && Ic.g.c0(kotlinType)) {
            if (kotlinType.L0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            i0 i0Var = (i0) kotlinType.L0().get(0);
            E type = i0Var.getType();
            AbstractC4862t.d(type, "memberProjection.type");
            if (i0Var.b() == u0.IN_VARIANCE) {
                objD = factory.e("java/lang/Object");
            } else {
                u0 u0VarB = i0Var.b();
                AbstractC4862t.d(u0VarB, "memberProjection.projectionKind");
                objD = d(type, factory, mode.f(u0VarB, true), typeMappingConfiguration, abstractC3906k, writeGenericType);
            }
            return factory.a('[' + factory.d(objD));
        }
        if (!z10) {
            if (interfaceC1180hQ instanceof f0) {
                E eJ = Hd.a.j((f0) interfaceC1180hQ);
                if (kotlinType.O0()) {
                    eJ = Hd.a.u(eJ);
                }
                return d(eJ, factory, mode, typeMappingConfiguration, null, Md.d.b());
            }
            if ((interfaceC1180hQ instanceof Lc.e0) && mode.b()) {
                return d(((Lc.e0) interfaceC1180hQ).F(), factory, mode, typeMappingConfiguration, abstractC3906k, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (AbstractC5285g.b(interfaceC1180hQ) && !mode.c() && (e10 = (E) AbstractC0740x.a(oVar, kotlinType)) != null) {
            return d(e10, factory, mode.g(), typeMappingConfiguration, abstractC3906k, writeGenericType);
        }
        if (mode.e() && Ic.g.k0((InterfaceC1177e) interfaceC1180hQ)) {
            objB = factory.f();
        } else {
            InterfaceC1177e interfaceC1177e = (InterfaceC1177e) interfaceC1180hQ;
            InterfaceC1177e interfaceC1177eA = interfaceC1177e.a();
            AbstractC4862t.d(interfaceC1177eA, "descriptor.original");
            objB = typeMappingConfiguration.b(interfaceC1177eA);
            if (objB == null) {
                if (interfaceC1177e.f() == EnumC1178f.ENUM_ENTRY) {
                    InterfaceC1185m interfaceC1185mB = interfaceC1177e.b();
                    AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC1177e = (InterfaceC1177e) interfaceC1185mB;
                }
                InterfaceC1177e interfaceC1177eA2 = interfaceC1177e.a();
                AbstractC4862t.d(interfaceC1177eA2, "enumClassIfEnumEntry.original");
                objB = factory.e(a(interfaceC1177eA2, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, objB, mode);
        return objB;
    }

    public static /* synthetic */ Object e(E e10, InterfaceC3909n interfaceC3909n, C3894B c3894b, z zVar, AbstractC3906k abstractC3906k, vc.q qVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            qVar = Md.d.b();
        }
        return d(e10, interfaceC3909n, c3894b, zVar, abstractC3906k, qVar);
    }
}
