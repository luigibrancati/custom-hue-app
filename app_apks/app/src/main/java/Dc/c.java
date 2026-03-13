package Dc;

import Cc.f;
import Cc.p;
import Cc.r;
import Cc.s;
import Cd.E;
import Cd.F;
import Cd.M;
import Cd.T;
import Cd.a0;
import Cd.e0;
import Cd.i0;
import Cd.k0;
import Cd.u0;
import Fc.A;
import Fc.D;
import Fc.InterfaceC0837l;
import Lc.InterfaceC1180h;
import Lc.f0;
import fc.C4032o;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2661a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2661a = iArr;
        }
    }

    public static final M a(a0 a0Var, e0 e0Var, List list, boolean z10) {
        i0 t10;
        List parameters = e0Var.getParameters();
        AbstractC4862t.d(parameters, "typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            r rVar = (r) obj;
            A a10 = (A) rVar.c();
            E eM = a10 != null ? a10.m() : null;
            s sVarD = rVar.d();
            int i12 = sVarD == null ? -1 : a.f2661a[sVarD.ordinal()];
            if (i12 == -1) {
                Object obj2 = parameters.get(i10);
                AbstractC4862t.d(obj2, "parameters[index]");
                t10 = new T((f0) obj2);
            } else if (i12 == 1) {
                u0 u0Var = u0.INVARIANT;
                AbstractC4862t.b(eM);
                t10 = new k0(u0Var, eM);
            } else if (i12 == 2) {
                u0 u0Var2 = u0.IN_VARIANCE;
                AbstractC4862t.b(eM);
                t10 = new k0(u0Var2, eM);
            } else {
                if (i12 != 3) {
                    throw new C4032o();
                }
                u0 u0Var3 = u0.OUT_VARIANCE;
                AbstractC4862t.b(eM);
                t10 = new k0(u0Var3, eM);
            }
            arrayList.add(t10);
            i10 = i11;
        }
        return F.j(a0Var, e0Var, arrayList, z10, null, 16, null);
    }

    public static final p b(f fVar, List arguments, boolean z10, List annotations) {
        InterfaceC1180h descriptor;
        AbstractC4862t.e(fVar, "<this>");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(annotations, "annotations");
        InterfaceC0837l interfaceC0837l = fVar instanceof InterfaceC0837l ? (InterfaceC0837l) fVar : null;
        if (interfaceC0837l == null || (descriptor = interfaceC0837l.getDescriptor()) == null) {
            throw new D("Cannot create type for an unsupported classifier: " + fVar + " (" + fVar.getClass() + ')');
        }
        e0 e0VarK = descriptor.k();
        AbstractC4862t.d(e0VarK, "descriptor.typeConstructor");
        List parameters = e0VarK.getParameters();
        AbstractC4862t.d(parameters, "typeConstructor.parameters");
        if (parameters.size() == arguments.size()) {
            return new A(a(annotations.isEmpty() ? a0.f1311b.h() : a0.f1311b.h(), e0VarK, arguments, z10), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
