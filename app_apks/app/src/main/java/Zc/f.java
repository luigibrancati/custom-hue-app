package Zc;

import Cd.AbstractC0739w;
import Cd.C0738v;
import Cd.E;
import Cd.h0;
import Cd.i0;
import Cd.k0;
import Cd.q0;
import Cd.u0;
import Lc.f0;
import fc.C4032o;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends C0738v {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20446a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20446a = iArr;
        }
    }

    @Override // Cd.C0738v
    public i0 a(f0 parameter, AbstractC0739w typeAttr, h0 typeParameterUpperBoundEraser, E erasedUpperBound) {
        i0 k0Var;
        AbstractC4862t.e(parameter, "parameter");
        AbstractC4862t.e(typeAttr, "typeAttr");
        AbstractC4862t.e(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC4862t.e(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof Zc.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        Zc.a aVarL = (Zc.a) typeAttr;
        if (!aVarL.i()) {
            aVarL = aVarL.l(c.INFLEXIBLE);
        }
        int i10 = a.f20446a[aVarL.g().ordinal()];
        if (i10 == 1) {
            return new k0(u0.INVARIANT, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new C4032o();
        }
        if (parameter.m().b()) {
            List parameters = erasedUpperBound.N0().getParameters();
            AbstractC4862t.d(parameters, "erasedUpperBound.constructor.parameters");
            k0Var = !parameters.isEmpty() ? new k0(u0.OUT_VARIANCE, erasedUpperBound) : q0.t(parameter, aVarL);
        } else {
            k0Var = new k0(u0.INVARIANT, AbstractC5823c.j(parameter).H());
        }
        AbstractC4862t.d(k0Var, "{\n                if (!p…          }\n            }");
        return k0Var;
    }
}
