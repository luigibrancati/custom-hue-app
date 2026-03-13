package Mc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.l f9449c;

    public l(g delegate, boolean z10, vc.l fqNameFilter) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(fqNameFilter, "fqNameFilter");
        this.f9447a = delegate;
        this.f9448b = z10;
        this.f9449c = fqNameFilter;
    }

    @Override // Mc.g
    public boolean K(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        if (((Boolean) this.f9449c.invoke(fqName)).booleanValue()) {
            return this.f9447a.K(fqName);
        }
        return false;
    }

    public final boolean c(c cVar) {
        kd.c cVarE = cVar.e();
        return cVarE != null && ((Boolean) this.f9449c.invoke(cVarE)).booleanValue();
    }

    @Override // Mc.g
    public boolean isEmpty() {
        boolean z10;
        g gVar = this.f9447a;
        if ((gVar instanceof Collection) && ((Collection) gVar).isEmpty()) {
            z10 = false;
        } else {
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                if (c((c) it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f9448b ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        g gVar = this.f9447a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : gVar) {
            if (c((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // Mc.g
    public c j(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        if (((Boolean) this.f9449c.invoke(fqName)).booleanValue()) {
            return this.f9447a.j(fqName);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(g delegate, vc.l fqNameFilter) {
        this(delegate, false, fqNameFilter);
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(fqNameFilter, "fqNameFilter");
    }
}
