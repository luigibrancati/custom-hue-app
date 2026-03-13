package Td;

import Td.k;
import Wd.T;
import fc.C4015H;
import fc.C4022e;
import kotlin.jvm.internal.M;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class s extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f16420n;

    public s(int i10, a aVar, vc.l lVar) {
        super(i10, lVar);
        this.f16419m = i10;
        this.f16420n = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + M.b(e.class).l() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ Object o1(s sVar, Object obj, InterfaceC4988e interfaceC4988e) throws Throwable {
        T tC;
        Object objQ1 = sVar.q1(obj, true);
        if (!(objQ1 instanceof k.a)) {
            return C4015H.f34254a;
        }
        k.e(objQ1);
        vc.l lVar = sVar.f16370b;
        if (lVar == null || (tC = Wd.x.c(lVar, obj, null, 2, null)) == null) {
            throw sVar.j0();
        }
        C4022e.a(tC, sVar.j0());
        throw tC;
    }

    @Override // Td.e, Td.y
    public Object n(Object obj) {
        return q1(obj, false);
    }

    @Override // Td.e, Td.y
    public Object p(Object obj, InterfaceC4988e interfaceC4988e) {
        return o1(this, obj, interfaceC4988e);
    }

    public final Object p1(Object obj, boolean z10) {
        vc.l lVar;
        T tC;
        Object objN = super.n(obj);
        if (k.j(objN) || k.h(objN)) {
            return objN;
        }
        if (!z10 || (lVar = this.f16370b) == null || (tC = Wd.x.c(lVar, obj, null, 2, null)) == null) {
            return k.f16409b.c(C4015H.f34254a);
        }
        throw tC;
    }

    public final Object q1(Object obj, boolean z10) {
        return this.f16420n == a.DROP_LATEST ? p1(obj, z10) : e1(obj);
    }

    @Override // Td.e
    public boolean x0() {
        return this.f16420n == a.DROP_OLDEST;
    }
}
