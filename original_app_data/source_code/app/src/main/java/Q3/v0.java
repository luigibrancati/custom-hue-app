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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13741c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.t f13742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2807f f13743b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2807f {
        @Override // b3.AbstractC2807f
        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // b3.AbstractC2807f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC4794d statement, r0 entity) {
            AbstractC4862t.e(statement, "statement");
            AbstractC4862t.e(entity, "entity");
            statement.N(1, entity.a());
            statement.N(2, entity.b());
        }
    }

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

    public v0(b3.t __db) {
        AbstractC4862t.e(__db, "__db");
        this.f13742a = __db;
        this.f13743b = new a();
    }

    public static final List f(String str, String str2, InterfaceC4792b _connection) {
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

    public static final C4015H g(v0 v0Var, r0 r0Var, InterfaceC4792b _connection) throws Exception {
        AbstractC4862t.e(_connection, "_connection");
        v0Var.f13743b.c(_connection, r0Var);
        return C4015H.f34254a;
    }

    @Override // Q3.s0
    public void a(final r0 workTag) {
        AbstractC4862t.e(workTag, "workTag");
        AbstractC4270a.c(this.f13742a, false, true, new vc.l() { // from class: Q3.t0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return v0.g(this.f13734a, workTag, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.s0
    public List b(final String id2) {
        AbstractC4862t.e(id2, "id");
        final String str = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        return (List) AbstractC4270a.c(this.f13742a, true, false, new vc.l() { // from class: Q3.u0
            @Override // vc.l
            public final Object invoke(Object obj) {
                return v0.f(str, id2, (InterfaceC4792b) obj);
            }
        });
    }
}
