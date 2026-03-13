package Mc;

import Nd.t;
import gc.C4179C;
import gc.C4204q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9444a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kd.c f9445a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kd.c cVar) {
            super(1);
            this.f9445a = cVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(g it) {
            AbstractC4862t.e(it, "it");
            return it.j(this.f9445a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9446a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Nd.h invoke(g it) {
            AbstractC4862t.e(it, "it");
            return C4179C.X(it);
        }
    }

    public k(List delegates) {
        AbstractC4862t.e(delegates, "delegates");
        this.f9444a = delegates;
    }

    @Override // Mc.g
    public boolean K(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        Iterator it = C4179C.X(this.f9444a).iterator();
        while (it.hasNext()) {
            if (((g) it.next()).K(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // Mc.g
    public boolean isEmpty() {
        List list = this.f9444a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return t.D(C4179C.X(this.f9444a), b.f9446a).iterator();
    }

    @Override // Mc.g
    public c j(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return (c) t.C(t.J(C4179C.X(this.f9444a), new a(fqName)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(g... delegates) {
        this(C4204q.O0(delegates));
        AbstractC4862t.e(delegates, "delegates");
    }
}
