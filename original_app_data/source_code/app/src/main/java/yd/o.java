package yd;

import Lc.K;
import Lc.L;
import Lc.N;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements InterfaceC6475h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f48601a;

    public o(L packageFragmentProvider) {
        AbstractC4862t.e(packageFragmentProvider, "packageFragmentProvider");
        this.f48601a = packageFragmentProvider;
    }

    @Override // yd.InterfaceC6475h
    public C6474g a(kd.b classId) {
        C6474g c6474gA;
        AbstractC4862t.e(classId, "classId");
        L l10 = this.f48601a;
        kd.c cVarH = classId.h();
        AbstractC4862t.d(cVarH, "classId.packageFqName");
        for (K k10 : N.c(l10, cVarH)) {
            if ((k10 instanceof p) && (c6474gA = ((p) k10).G0().a(classId)) != null) {
                return c6474gA;
            }
        }
        return null;
    }
}
