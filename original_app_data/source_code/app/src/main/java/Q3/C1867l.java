package Q3;

import b3.AbstractC2807f;
import fc.C4015H;
import gc.C4206t;
import h3.AbstractC4270a;
import java.util.List;
import k3.InterfaceC4792b;
import k3.InterfaceC4794d;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q3.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1867l implements InterfaceC1864i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13706c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.t f13707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2807f f13708b;

    /* JADX INFO: renamed from: Q3.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2807f {
        @Override // b3.AbstractC2807f
        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // b3.AbstractC2807f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC4794d statement, C1863h entity) {
            AbstractC4862t.e(statement, "statement");
            AbstractC4862t.e(entity, "entity");
            statement.N(1, entity.a());
            Long lB = entity.b();
            if (lB == null) {
                statement.t(2);
            } else {
                statement.r(2, lB.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: Q3.l$b */
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

    public C1867l(b3.t __db) {
        AbstractC4862t.e(__db, "__db");
        this.f13707a = __db;
        this.f13708b = new a();
    }

    public static final Long e(String str, String str2, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.N(1, str2);
            Long lValueOf = null;
            if (interfaceC4794dA1.X0() && !interfaceC4794dA1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC4794dA1.getLong(0));
            }
            return lValueOf;
        } finally {
            interfaceC4794dA1.close();
        }
    }

    public static final C4015H f(C1867l c1867l, C1863h c1863h, InterfaceC4792b _connection) throws Exception {
        AbstractC4862t.e(_connection, "_connection");
        c1867l.f13708b.c(_connection, c1863h);
        return C4015H.f34254a;
    }

    @Override // Q3.InterfaceC1864i
    public Long a(final String key) {
        AbstractC4862t.e(key, "key");
        final String str = "SELECT long_value FROM Preference where `key`=?";
        return (Long) AbstractC4270a.c(this.f13707a, true, false, new vc.l() { // from class: Q3.k
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1867l.e(str, key, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.InterfaceC1864i
    public void b(final C1863h preference) {
        AbstractC4862t.e(preference, "preference");
        AbstractC4270a.c(this.f13707a, false, true, new vc.l() { // from class: Q3.j
            @Override // vc.l
            public final Object invoke(Object obj) {
                return C1867l.f(this.f13699a, preference, (InterfaceC4792b) obj);
            }
        });
    }
}
