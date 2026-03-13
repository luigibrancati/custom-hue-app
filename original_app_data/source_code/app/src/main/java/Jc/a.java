package Jc;

import Bd.n;
import Jc.c;
import Lc.G;
import Lc.InterfaceC1177e;
import Od.C;
import Od.F;
import gc.C4179C;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Nc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f6377b;

    public a(n storageManager, G module) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(module, "module");
        this.f6376a = storageManager;
        this.f6377b = module;
    }

    @Override // Nc.b
    public boolean a(kd.c packageFqName, f name) {
        AbstractC4862t.e(packageFqName, "packageFqName");
        AbstractC4862t.e(name, "name");
        String strB = name.b();
        AbstractC4862t.d(strB, "name.asString()");
        return (C.P(strB, "Function", false, 2, null) || C.P(strB, "KFunction", false, 2, null) || C.P(strB, "SuspendFunction", false, 2, null) || C.P(strB, "KSuspendFunction", false, 2, null)) && c.Companion.c(strB, packageFqName) != null;
    }

    @Override // Nc.b
    public Collection b(kd.c packageFqName) {
        AbstractC4862t.e(packageFqName, "packageFqName");
        return U.d();
    }

    @Override // Nc.b
    public InterfaceC1177e c(kd.b classId) {
        AbstractC4862t.e(classId, "classId");
        if (classId.k() || classId.l()) {
            return null;
        }
        String strB = classId.i().b();
        AbstractC4862t.d(strB, "classId.relativeClassName.asString()");
        if (!F.V(strB, "Function", false, 2, null)) {
            return null;
        }
        kd.c cVarH = classId.h();
        AbstractC4862t.d(cVarH, "classId.packageFqName");
        c.a.C0109a c0109aC = c.Companion.c(strB, cVarH);
        if (c0109aC == null) {
            return null;
        }
        c cVarA = c0109aC.a();
        int iB = c0109aC.b();
        List listH0 = this.f6377b.z0(cVarH).h0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH0) {
            if (obj instanceof Ic.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        android.support.v4.media.session.a.a(C4179C.j0(arrayList2));
        return new b(this.f6376a, (Ic.b) C4179C.h0(arrayList), cVarA, iB);
    }
}
