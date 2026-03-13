package Cd;

import Cd.Z;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {
    public static final a0 a(a0 a0Var, Mc.g newAnnotations) {
        a0 a0VarP;
        AbstractC4862t.e(a0Var, "<this>");
        AbstractC4862t.e(newAnnotations, "newAnnotations");
        if (AbstractC0727j.a(a0Var) == newAnnotations) {
            return a0Var;
        }
        C0726i c0726iB = AbstractC0727j.b(a0Var);
        if (c0726iB != null && (a0VarP = a0Var.p(c0726iB)) != null) {
            a0Var = a0VarP;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? a0Var.n(new C0726i(newAnnotations)) : a0Var;
    }

    public static final a0 b(Mc.g gVar) {
        AbstractC4862t.e(gVar, "<this>");
        return Z.a.a(C0731n.f1384a, gVar, null, null, 6, null);
    }
}
