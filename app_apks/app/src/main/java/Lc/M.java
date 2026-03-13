package Lc;

import gc.C4179C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f8731a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8732a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd.c invoke(K it) {
            AbstractC4862t.e(it, "it");
            return it.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kd.c f8733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kd.c cVar) {
            super(1);
            this.f8733a = cVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kd.c it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(!it.d() && AbstractC4862t.a(it.e(), this.f8733a));
        }
    }

    public M(Collection packageFragments) {
        AbstractC4862t.e(packageFragments, "packageFragments");
        this.f8731a = packageFragments;
    }

    @Override // Lc.L
    public List a(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        Collection collection = this.f8731a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC4862t.a(((K) obj).e(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Lc.O
    public void b(kd.c fqName, Collection packageFragments) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(packageFragments, "packageFragments");
        for (Object obj : this.f8731a) {
            if (AbstractC4862t.a(((K) obj).e(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // Lc.O
    public boolean c(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        Collection collection = this.f8731a;
        if (collection != null && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(((K) it.next()).e(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Lc.L
    public Collection t(kd.c fqName, vc.l nameFilter) {
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return Nd.t.O(Nd.t.y(Nd.t.I(C4179C.X(this.f8731a), a.f8732a), new b(fqName)));
    }
}
