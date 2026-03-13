package Qc;

import Od.C;
import Rc.w;
import Uc.p;
import bd.InterfaceC2915g;
import bd.u;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f14264a;

    public d(ClassLoader classLoader) {
        AbstractC4862t.e(classLoader, "classLoader");
        this.f14264a = classLoader;
    }

    @Override // Uc.p
    public u a(kd.c fqName, boolean z10) {
        AbstractC4862t.e(fqName, "fqName");
        return new w(fqName);
    }

    @Override // Uc.p
    public Set b(kd.c packageFqName) {
        AbstractC4862t.e(packageFqName, "packageFqName");
        return null;
    }

    @Override // Uc.p
    public InterfaceC2915g c(p.a request) {
        AbstractC4862t.e(request, "request");
        kd.b bVarA = request.a();
        kd.c cVarH = bVarA.h();
        AbstractC4862t.d(cVarH, "classId.packageFqName");
        String strB = bVarA.i().b();
        AbstractC4862t.d(strB, "classId.relativeClassName.asString()");
        String strK = C.K(strB, '.', '$', false, 4, null);
        if (!cVarH.d()) {
            strK = cVarH.b() + '.' + strK;
        }
        Class clsA = e.a(this.f14264a, strK);
        if (clsA != null) {
            return new Rc.l(clsA);
        }
        return null;
    }
}
