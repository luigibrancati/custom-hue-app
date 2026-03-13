package ee;

import Od.F;
import ee.l;
import fc.C4015H;
import gc.C4204q;
import ge.q0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final e b(String serialName, d kind) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(kind, "kind");
        if (F.k0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return q0.a(serialName, kind);
    }

    public static final e c(String serialName, e[] typeParameters, vc.l builderAction) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(typeParameters, "typeParameters");
        AbstractC4862t.e(builderAction, "builderAction");
        if (F.k0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C3981a c3981a = new C3981a(serialName);
        builderAction.invoke(c3981a);
        return new g(serialName, l.a.f33971a, c3981a.f().size(), C4204q.O0(typeParameters), c3981a);
    }

    public static final e d(String serialName, k kind, e[] typeParameters, vc.l builder) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(typeParameters, "typeParameters");
        AbstractC4862t.e(builder, "builder");
        if (F.k0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (AbstractC4862t.a(kind, l.a.f33971a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C3981a c3981a = new C3981a(serialName);
        builder.invoke(c3981a);
        return new g(serialName, kind, c3981a.f().size(), C4204q.O0(typeParameters), c3981a);
    }

    public static /* synthetic */ e e(String str, k kVar, e[] eVarArr, vc.l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new vc.l() { // from class: ee.i
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return j.f((C3981a) obj2);
                }
            };
        }
        return d(str, kVar, eVarArr, lVar);
    }

    public static final C4015H f(C3981a c3981a) {
        AbstractC4862t.e(c3981a, "<this>");
        return C4015H.f34254a;
    }
}
