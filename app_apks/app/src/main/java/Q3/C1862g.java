package Q3;

import b3.AbstractC2807f;
import fc.C4015H;
import gc.C4206t;
import h3.AbstractC4270a;
import java.util.ArrayList;
import java.util.List;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1862g implements InterfaceC1857b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13688c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.t f13689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2807f f13690b;

    /* JADX INFO: renamed from: Q3.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2807f {
        @Override // b3.AbstractC2807f
        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // b3.AbstractC2807f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC4794d statement, C1856a entity) {
            AbstractC4862t.e(statement, "statement");
            AbstractC4862t.e(entity, "entity");
            statement.N(1, entity.b());
            statement.N(2, entity.a());
        }
    }

    /* JADX INFO: renamed from: Q3.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final List a() {
            return C4206t.k();
        }

        public b() {
        }
    }

    public C1862g(b3.t __db) {
        AbstractC4862t.e(__db, "__db");
        this.f13689a = __db;
        this.f13690b = new a();
    }

    public static final List i(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                arrayList.add(interfaceC4794dA1.K0(0));
            }
            return arrayList;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final boolean j(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            boolean z10 = false;
            if (interfaceC4794dA1.X0()) {
                z10 = ((int) interfaceC4794dA1.getLong(0)) != 0;
            }
            return z10;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final boolean k(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            boolean z10 = false;
            if (interfaceC4794dA1.X0()) {
                z10 = ((int) interfaceC4794dA1.getLong(0)) != 0;
            }
            return z10;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H l(C1862g c1862g, C1856a c1856a, InterfaceC4792b _connection) throws Exception {
        AbstractC4862t.e(_connection, "_connection");
        c1862g.f13690b.c(_connection, c1856a);
        return C4015H.f34254a;
    }

    @Override // Q3.InterfaceC1857b
    public List a(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) AbstractC4270a.c(this.f13689a, true, false, new vc.l() { // from class: Q3.e
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1862g.i(str, id2, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.InterfaceC1857b
    public boolean b(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) AbstractC4270a.c(this.f13689a, true, false, new vc.l() { // from class: Q3.f
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C1862g.j(str, id2, (InterfaceC4792b) obj));
            }
        })).booleanValue();
    }

    @Override // Q3.InterfaceC1857b
    public void c(final C1856a dependency) {
        AbstractC4862t.e(dependency, "dependency");
        AbstractC4270a.c(this.f13689a, false, true, new vc.l() { // from class: Q3.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1862g.l(this.f13672a, dependency, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.InterfaceC1857b
    public boolean d(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) AbstractC4270a.c(this.f13689a, true, false, new vc.l() { // from class: Q3.d
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C1862g.k(str, id2, (InterfaceC4792b) obj));
            }
        })).booleanValue();
    }
}
