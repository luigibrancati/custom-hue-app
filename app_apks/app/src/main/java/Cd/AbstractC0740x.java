package Cd;

import java.util.HashSet;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0740x {
    public static final Gd.i a(o0 o0Var, Gd.i inlineClassType) {
        AbstractC4862t.e(o0Var, "<this>");
        AbstractC4862t.e(inlineClassType, "inlineClassType");
        return b(o0Var, inlineClassType, new HashSet());
    }

    public static final Gd.i b(o0 o0Var, Gd.i iVar, HashSet hashSet) {
        Gd.i iVarB;
        Gd.n nVarA0 = o0Var.a0(iVar);
        if (!hashSet.add(nVarA0)) {
            return null;
        }
        Gd.o oVarV = o0Var.V(nVarA0);
        if (oVarV != null) {
            Gd.i iVarL = o0Var.l(oVarV);
            Gd.i iVarB2 = b(o0Var, iVarL, hashSet);
            if (iVarB2 != null) {
                return ((iVarB2 instanceof Gd.k) && o0Var.i0((Gd.k) iVarB2) && o0Var.p0(iVar) && (o0Var.x0(o0Var.a0(iVarL)) || ((iVarL instanceof Gd.k) && o0Var.i0((Gd.k) iVarL)))) ? o0Var.y(iVarL) : (o0Var.p0(iVarB2) || !o0Var.Y(iVar)) ? iVarB2 : o0Var.y(iVarB2);
            }
            return null;
        }
        if (o0Var.x0(nVarA0)) {
            Gd.i iVarM = o0Var.M(iVar);
            if (iVarM == null || (iVarB = b(o0Var, iVarM, hashSet)) == null) {
                return null;
            }
            if (!o0Var.p0(iVar)) {
                return iVarB;
            }
            if (!o0Var.p0(iVarB) && (!(iVarB instanceof Gd.k) || !o0Var.i0((Gd.k) iVarB))) {
                return o0Var.y(iVarB);
            }
        }
        return iVar;
    }
}
