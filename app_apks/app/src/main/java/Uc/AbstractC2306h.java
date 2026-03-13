package Uc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Uc.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2306h {
    public static final kd.c c(kd.c cVar, String str) {
        kd.c cVarC = cVar.c(kd.f.s(str));
        AbstractC4862t.d(cVarC, "child(Name.identifier(name))");
        return cVarC;
    }

    public static final kd.c d(kd.d dVar, String str) {
        kd.c cVarL = dVar.c(kd.f.s(str)).l();
        AbstractC4862t.d(cVarL, "child(Name.identifier(name)).toSafe()");
        return cVarL;
    }
}
