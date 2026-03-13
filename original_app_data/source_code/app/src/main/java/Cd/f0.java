package Cd;

import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1357c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: Cd.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0033a extends f0 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Map f1358d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f1359e;

            public C0033a(Map map, boolean z10) {
                this.f1358d = map;
                this.f1359e = z10;
            }

            @Override // Cd.l0
            public boolean a() {
                return this.f1359e;
            }

            @Override // Cd.l0
            public boolean f() {
                return this.f1358d.isEmpty();
            }

            @Override // Cd.f0
            public i0 k(e0 key) {
                AbstractC4862t.e(key, "key");
                return (i0) this.f1358d.get(key);
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ f0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final l0 a(E kotlinType) {
            AbstractC4862t.e(kotlinType, "kotlinType");
            return b(kotlinType.N0(), kotlinType.L0());
        }

        public final l0 b(e0 typeConstructor, List arguments) {
            AbstractC4862t.e(typeConstructor, "typeConstructor");
            AbstractC4862t.e(arguments, "arguments");
            List parameters = typeConstructor.getParameters();
            AbstractC4862t.d(parameters, "typeConstructor.parameters");
            Lc.f0 f0Var = (Lc.f0) C4179C.u0(parameters);
            if (f0Var == null || !f0Var.O()) {
                return new C(parameters, arguments);
            }
            List parameters2 = typeConstructor.getParameters();
            AbstractC4862t.d(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C4207u.v(parameters2, 10));
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Lc.f0) it.next()).k());
            }
            return e(this, gc.Q.s(C4179C.d1(arrayList, arguments)), false, 2, null);
        }

        public final f0 c(Map map) {
            AbstractC4862t.e(map, "map");
            return e(this, map, false, 2, null);
        }

        public final f0 d(Map map, boolean z10) {
            AbstractC4862t.e(map, "map");
            return new C0033a(map, z10);
        }

        public a() {
        }
    }

    public static final l0 i(e0 e0Var, List list) {
        return f1357c.b(e0Var, list);
    }

    public static final f0 j(Map map) {
        return f1357c.c(map);
    }

    @Override // Cd.l0
    public i0 e(E key) {
        AbstractC4862t.e(key, "key");
        return k(key.N0());
    }

    public abstract i0 k(e0 e0Var);
}
