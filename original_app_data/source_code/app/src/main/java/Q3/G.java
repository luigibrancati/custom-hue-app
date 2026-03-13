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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G implements D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f13582c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.t f13583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2807f f13584b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2807f {
        @Override // b3.AbstractC2807f
        public /* bridge */ /* synthetic */ void a(InterfaceC4794d interfaceC4794d, Object obj) {
            android.support.v4.media.session.a.a(obj);
            d(interfaceC4794d, null);
        }

        @Override // b3.AbstractC2807f
        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public void d(InterfaceC4794d statement, C entity) {
            AbstractC4862t.e(statement, "statement");
            AbstractC4862t.e(entity, "entity");
            throw null;
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

    public G(b3.t __db) {
        AbstractC4862t.e(__db, "__db");
        this.f13583a = __db;
        this.f13584b = new a();
    }

    public static final C4015H e(String str, String str2, InterfaceC4792b _connection) {
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

    public static final C4015H f(String str, InterfaceC4792b _connection) {
        AbstractC4862t.e(_connection, "_connection");
        InterfaceC4794d interfaceC4794dA1 = _connection.a1(str);
        try {
            interfaceC4794dA1.X0();
            interfaceC4794dA1.close();
            return C4015H.f34254a;
        } catch (Throwable th) {
            interfaceC4794dA1.close();
            throw th;
        }
    }

    @Override // Q3.D
    public void a(final String workSpecId) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        final String str = "DELETE from WorkProgress where work_spec_id=?";
        AbstractC4270a.c(this.f13583a, false, true, new vc.l() { // from class: Q3.F
            @Override // vc.l
            public final Object invoke(Object obj) {
                return G.e(str, workSpecId, (InterfaceC4792b) obj);
            }
        });
    }

    @Override // Q3.D
    public void b() {
        final String str = "DELETE FROM WorkProgress";
        AbstractC4270a.c(this.f13583a, false, true, new vc.l() { // from class: Q3.E
            @Override // vc.l
            public final Object invoke(Object obj) {
                return G.f(str, (InterfaceC4792b) obj);
            }
        });
    }
}
