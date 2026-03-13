package vd;

import Lc.EnumC1178f;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.U;
import Lc.Z;
import gc.C4179C;
import gc.C4206t;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import od.AbstractC5282d;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: vd.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6103l extends AbstractC6100i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f46016e = {M.g(new E(M.b(C6103l.class), "functions", "getFunctions()Ljava/util/List;")), M.g(new E(M.b(C6103l.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1177e f46017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f46018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f46019d;

    /* JADX INFO: renamed from: vd.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C4206t.n(AbstractC5282d.g(C6103l.this.f46017b), AbstractC5282d.h(C6103l.this.f46017b));
        }
    }

    /* JADX INFO: renamed from: vd.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C4206t.o(AbstractC5282d.f(C6103l.this.f46017b));
        }
    }

    public C6103l(Bd.n storageManager, InterfaceC1177e containingClass) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(containingClass, "containingClass");
        this.f46017b = containingClass;
        containingClass.f();
        EnumC1178f enumC1178f = EnumC1178f.CLASS;
        this.f46018c = storageManager.f(new a());
        this.f46019d = storageManager.f(new b());
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        List listM = m();
        Md.e eVar = new Md.e();
        for (Object obj : listM) {
            if (AbstractC4862t.a(((U) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public /* bridge */ /* synthetic */ InterfaceC1180h e(kd.f fVar, Tc.b bVar) {
        return (InterfaceC1180h) i(fVar, bVar);
    }

    public Void i(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return null;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public List f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return C4179C.C0(l(), m());
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Md.e a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        List listL = l();
        Md.e eVar = new Md.e();
        for (Object obj : listL) {
            if (AbstractC4862t.a(((Z) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    public final List l() {
        return (List) Bd.m.a(this.f46018c, this, f46016e[0]);
    }

    public final List m() {
        return (List) Bd.m.a(this.f46019d, this, f46016e[1]);
    }
}
