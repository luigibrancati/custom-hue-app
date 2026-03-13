package yd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x {
    public static final kd.b a(hd.c cVar, int i10) {
        AbstractC4862t.e(cVar, "<this>");
        kd.b bVarF = kd.b.f(cVar.b(i10), cVar.a(i10));
        AbstractC4862t.d(bVarF, "fromString(getQualifiedC… isLocalClassName(index))");
        return bVarF;
    }

    public static final kd.f b(hd.c cVar, int i10) {
        AbstractC4862t.e(cVar, "<this>");
        kd.f fVarQ = kd.f.q(cVar.getString(i10));
        AbstractC4862t.d(fVarQ, "guessByFirstCharacter(getString(index))");
        return fVarQ;
    }
}
