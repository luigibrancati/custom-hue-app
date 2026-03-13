package dd;

import dd.C3916u;
import id.AbstractC4376a;
import jd.AbstractC4763d;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4862t;
import md.i;

/* JADX INFO: renamed from: dd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3898c {
    public static final C3916u a(fd.n proto, hd.c nameResolver, hd.g typeTable, boolean z10, boolean z11, boolean z12) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        i.f propertySignature = AbstractC4376a.f37381d;
        AbstractC4862t.d(propertySignature, "propertySignature");
        AbstractC4376a.d dVar = (AbstractC4376a.d) hd.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            AbstractC4763d.a aVarC = C4768i.f39178a.c(proto, nameResolver, typeTable, z12);
            if (aVarC == null) {
                return null;
            }
            return C3916u.f33461b.b(aVarC);
        }
        if (!z11 || !dVar.C()) {
            return null;
        }
        C3916u.a aVar = C3916u.f33461b;
        AbstractC4376a.c cVarX = dVar.x();
        AbstractC4862t.d(cVarX, "signature.syntheticMethod");
        return aVar.c(nameResolver, cVarX);
    }

    public static /* synthetic */ C3916u b(fd.n nVar, hd.c cVar, hd.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(nVar, cVar, gVar, z10, z11, z12);
    }
}
