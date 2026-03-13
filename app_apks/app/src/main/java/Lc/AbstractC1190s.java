package Lc;

import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Lc.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1190s {
    public static final InterfaceC1180h a(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        InterfaceC1185m interfaceC1185mB = interfaceC1185m.b();
        if (interfaceC1185mB != null && !(interfaceC1185m instanceof K)) {
            if (!b(interfaceC1185mB)) {
                return a(interfaceC1185mB);
            }
            if (interfaceC1185mB instanceof InterfaceC1180h) {
                return (InterfaceC1180h) interfaceC1185mB;
            }
        }
        return null;
    }

    public static final boolean b(InterfaceC1185m interfaceC1185m) {
        AbstractC4862t.e(interfaceC1185m, "<this>");
        return interfaceC1185m.b() instanceof K;
    }

    public static final InterfaceC1177e c(G g10, kd.c fqName, Tc.b lookupLocation) {
        InterfaceC1180h interfaceC1180hE;
        InterfaceC6099h interfaceC6099hR;
        AbstractC4862t.e(g10, "<this>");
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        kd.c cVarE = fqName.e();
        AbstractC4862t.d(cVarE, "fqName.parent()");
        InterfaceC6099h interfaceC6099hO = g10.z0(cVarE).o();
        kd.f fVarG = fqName.g();
        AbstractC4862t.d(fVarG, "fqName.shortName()");
        InterfaceC1180h interfaceC1180hE2 = interfaceC6099hO.e(fVarG, lookupLocation);
        InterfaceC1177e interfaceC1177e = interfaceC1180hE2 instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE2 : null;
        if (interfaceC1177e != null) {
            return interfaceC1177e;
        }
        kd.c cVarE2 = fqName.e();
        AbstractC4862t.d(cVarE2, "fqName.parent()");
        InterfaceC1177e interfaceC1177eC = c(g10, cVarE2, lookupLocation);
        if (interfaceC1177eC == null || (interfaceC6099hR = interfaceC1177eC.R()) == null) {
            interfaceC1180hE = null;
        } else {
            kd.f fVarG2 = fqName.g();
            AbstractC4862t.d(fVarG2, "fqName.shortName()");
            interfaceC1180hE = interfaceC6099hR.e(fVarG2, lookupLocation);
        }
        if (interfaceC1180hE instanceof InterfaceC1177e) {
            return (InterfaceC1177e) interfaceC1180hE;
        }
        return null;
    }
}
