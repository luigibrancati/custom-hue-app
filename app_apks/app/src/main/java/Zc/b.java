package Zc;

import Cd.p0;
import Lc.f0;
import gc.T;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final a a(p0 p0Var, boolean z10, boolean z11, f0 f0Var) {
        AbstractC4862t.e(p0Var, "<this>");
        return new a(p0Var, null, z11, z10, f0Var != null ? T.c(f0Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(p0 p0Var, boolean z10, boolean z11, f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            f0Var = null;
        }
        return a(p0Var, z10, z11, f0Var);
    }
}
