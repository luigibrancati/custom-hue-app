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

/* JADX INFO: renamed from: Q3.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1875u implements InterfaceC1871p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13736c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.t f13737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2807f f13738b;

    /* JADX INFO: renamed from: Q3.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2807f {
        @Override // b3.AbstractC2807f
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // b3.AbstractC2807f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC4794d statement, C1870o entity) {
            AbstractC4862t.e(statement, "statement");
            AbstractC4862t.e(entity, "entity");
            statement.N(1, entity.f13715a);
            statement.r(2, entity.a());
            statement.r(3, entity.f13717c);
        }
    }

    /* JADX INFO: renamed from: Q3.u$b */
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

    public C1875u(b3.t __db) {
        AbstractC4862t.e(__db, "__db");
        this.f13737a = __db;
        this.f13738b = new a();
    }

    public static final C1870o j(String str, String str2, int i10, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.r(2, i10);
            return interfaceC4794dA1.X0() ? new C1870o(interfaceC4794dA1.K0(h3.k.d(interfaceC4794dA1, "work_spec_id")), (int) interfaceC4794dA1.getLong(h3.k.d(interfaceC4794dA1, "generation")), (int) interfaceC4794dA1.getLong(h3.k.d(interfaceC4794dA1, "system_id"))) : null;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final List k(String str, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (interfaceC4794dA1.X0()) {
                arrayList.add(interfaceC4794dA1.K0(0));
            }
            return arrayList;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H l(C1875u c1875u, C1870o c1870o, InterfaceC4792b _connection) throws Exception {
        AbstractC4862t.e(_connection, "_connection");
        c1875u.f13738b.c(_connection, c1870o);
        return C4015H.f34254a;
    }

    public static final C4015H m(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    @Override // Q3.InterfaceC1871p
    public void a(final C1870o systemIdInfo) {
        AbstractC4862t.e(systemIdInfo, "systemIdInfo");
        AbstractC4270a.c(this.f13737a, false, true, new vc.l() { // from class: Q3.q
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1875u.l(this.f13724a, systemIdInfo, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.InterfaceC1871p
    public C1870o c(final String workSpecId, final int i10) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        final String str = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (C1870o) AbstractC4270a.c(this.f13737a, true, false, new vc.l() { // from class: Q3.s
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1875u.j(str, workSpecId, i10, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.InterfaceC1871p
    public List d() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) AbstractC4270a.c(this.f13737a, true, false, new vc.l() { // from class: Q3.r
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1875u.k(str, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.InterfaceC1871p
    public void e(final String workSpecId) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        final String str = "DELETE FROM SystemIdInfo where work_spec_id=?";
        AbstractC4270a.c(this.f13737a, false, true, new vc.l() { // from class: Q3.t
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1875u.m(str, workSpecId, (InterfaceC4792b) obj);
            }
        });
    }
}
