package Oc;

import Lc.InterfaceC1187o;
import Lc.P;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vd.C6093b;
import vd.C6098g;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r extends AbstractC1816j implements P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f12344h = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(r.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(r.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f12345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kd.c f12346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.i f12347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bd.i f12348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC6099h f12349g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public final Boolean invoke() {
            return Boolean.valueOf(Lc.N.b(r.this.A0().Q0(), r.this.e()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return Lc.N.c(r.this.A0().Q0(), r.this.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6099h invoke() {
            if (r.this.isEmpty()) {
                return InterfaceC6099h.b.f46015b;
            }
            List listH0 = r.this.h0();
            ArrayList arrayList = new ArrayList(C4207u.v(listH0, 10));
            Iterator it = listH0.iterator();
            while (it.hasNext()) {
                arrayList.add(((Lc.K) it.next()).o());
            }
            List listD0 = C4179C.D0(arrayList, new H(r.this.A0(), r.this.e()));
            return C6093b.f45968d.a("package view scope for " + r.this.e() + " in " + r.this.A0().getName(), listD0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x module, kd.c fqName, Bd.n storageManager) {
        super(Mc.g.f9435K.b(), fqName.h());
        AbstractC4862t.e(module, "module");
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(storageManager, "storageManager");
        this.f12345c = module;
        this.f12346d = fqName;
        this.f12347e = storageManager.f(new b());
        this.f12348f = storageManager.f(new a());
        this.f12349g = new C6098g(storageManager, new c());
    }

    @Override // Lc.InterfaceC1185m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public P b() {
        if (e().d()) {
            return null;
        }
        x xVarA0 = A0();
        kd.c cVarE = e().e();
        AbstractC4862t.d(cVarE, "fqName.parent()");
        return xVarA0.z0(cVarE);
    }

    public final boolean G0() {
        return ((Boolean) Bd.m.a(this.f12348f, this, f12344h[1])).booleanValue();
    }

    @Override // Lc.P
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public x A0() {
        return this.f12345c;
    }

    @Override // Lc.P
    public kd.c e() {
        return this.f12346d;
    }

    public boolean equals(Object obj) {
        P p10 = obj instanceof P ? (P) obj : null;
        return p10 != null && AbstractC4862t.a(e(), p10.e()) && AbstractC4862t.a(A0(), p10.A0());
    }

    @Override // Lc.P
    public List h0() {
        return (List) Bd.m.a(this.f12347e, this, f12344h[0]);
    }

    public int hashCode() {
        return (A0().hashCode() * 31) + e().hashCode();
    }

    @Override // Lc.P
    public boolean isEmpty() {
        return G0();
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o visitor, Object obj) {
        AbstractC4862t.e(visitor, "visitor");
        return visitor.f(this, obj);
    }

    @Override // Lc.P
    public InterfaceC6099h o() {
        return this.f12349g;
    }
}
