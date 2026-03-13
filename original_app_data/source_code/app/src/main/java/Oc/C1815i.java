package Oc;

import Lc.O;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Oc.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1815i implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12268b;

    public C1815i(List providers, String debugName) {
        AbstractC4862t.e(providers, "providers");
        AbstractC4862t.e(debugName, "debugName");
        this.f12267a = providers;
        this.f12268b = debugName;
        providers.size();
        C4179C.Z0(providers).size();
    }

    @Override // Lc.L
    public List a(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12267a.iterator();
        while (it.hasNext()) {
            Lc.N.a((Lc.L) it.next(), fqName, arrayList);
        }
        return C4179C.V0(arrayList);
    }

    @Override // Lc.O
    public void b(kd.c fqName, Collection packageFragments) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(packageFragments, "packageFragments");
        Iterator it = this.f12267a.iterator();
        while (it.hasNext()) {
            Lc.N.a((Lc.L) it.next(), fqName, packageFragments);
        }
    }

    @Override // Lc.O
    public boolean c(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        List list = this.f12267a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!Lc.N.b((Lc.L) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Lc.L
    public Collection t(kd.c fqName, vc.l nameFilter) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f12267a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((Lc.L) it.next()).t(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f12268b;
    }
}
