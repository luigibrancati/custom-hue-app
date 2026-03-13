package pd;

import Bd.f;
import Bd.n;
import Cd.AbstractC0733p;
import Cd.C;
import Cd.E;
import Cd.H;
import Cd.i0;
import Cd.k0;
import Cd.l0;
import Cd.u0;
import Lc.InterfaceC1180h;
import Lc.f0;
import fc.C4034q;
import gc.C4204q;
import gc.C4207u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: pd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5463d {

    /* JADX INFO: renamed from: pd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i0 f42547a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i0 i0Var) {
            super(0);
            this.f42547a = i0Var;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            E type = this.f42547a.getType();
            AbstractC4862t.d(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* JADX INFO: renamed from: pd.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC0733p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f42548d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, boolean z10) {
            super(l0Var);
            this.f42548d = z10;
        }

        @Override // Cd.l0
        public boolean b() {
            return this.f42548d;
        }

        @Override // Cd.AbstractC0733p, Cd.l0
        public i0 e(E key) {
            AbstractC4862t.e(key, "key");
            i0 i0VarE = super.e(key);
            if (i0VarE == null) {
                return null;
            }
            InterfaceC1180h interfaceC1180hQ = key.N0().q();
            return AbstractC5463d.b(i0VarE, interfaceC1180hQ instanceof f0 ? (f0) interfaceC1180hQ : null);
        }
    }

    public static final i0 b(i0 i0Var, f0 f0Var) {
        if (f0Var == null || i0Var.b() == u0.INVARIANT) {
            return i0Var;
        }
        if (f0Var.m() != i0Var.b()) {
            return new k0(c(i0Var));
        }
        if (!i0Var.a()) {
            return new k0(i0Var.getType());
        }
        n NO_LOCKS = f.f816e;
        AbstractC4862t.d(NO_LOCKS, "NO_LOCKS");
        return new k0(new H(NO_LOCKS, new a(i0Var)));
    }

    public static final E c(i0 typeProjection) {
        AbstractC4862t.e(typeProjection, "typeProjection");
        return new C5460a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean d(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return e10.N0() instanceof InterfaceC5461b;
    }

    public static final l0 e(l0 l0Var, boolean z10) {
        AbstractC4862t.e(l0Var, "<this>");
        if (!(l0Var instanceof C)) {
            return new b(l0Var, z10);
        }
        C c10 = (C) l0Var;
        f0[] f0VarArrJ = c10.j();
        List<C4034q> listE1 = C4204q.e1(c10.i(), c10.j());
        ArrayList arrayList = new ArrayList(C4207u.v(listE1, 10));
        for (C4034q c4034q : listE1) {
            arrayList.add(b((i0) c4034q.e(), (f0) c4034q.f()));
        }
        return new C(f0VarArrJ, (i0[]) arrayList.toArray(new i0[0]), z10);
    }

    public static /* synthetic */ l0 f(l0 l0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return e(l0Var, z10);
    }
}
