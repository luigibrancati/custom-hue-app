package R3;

import I3.I;
import I3.L;
import J3.AbstractC0915x;
import J3.C0910s;
import J3.InterfaceC0912u;
import J3.g0;
import Q3.InterfaceC1857b;
import Q3.J;
import androidx.work.impl.WorkDatabase;
import fc.C4015H;
import gc.C4206t;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final void f(g0 g0Var, String str) {
        WorkDatabase workDatabaseQ = g0Var.q();
        AbstractC4862t.d(workDatabaseQ, "getWorkDatabase(...)");
        o(workDatabaseQ, str);
        C0910s c0910sN = g0Var.n();
        AbstractC4862t.d(c0910sN, "getProcessor(...)");
        c0910sN.p(str, 1);
        Iterator it = g0Var.o().iterator();
        while (it.hasNext()) {
            ((InterfaceC0912u) it.next()).a(str);
        }
    }

    public static final I3.y g(final UUID id2, final g0 workManagerImpl) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(workManagerImpl, "workManagerImpl");
        I iN = workManagerImpl.j().n();
        S3.a aVarC = workManagerImpl.r().c();
        AbstractC4862t.d(aVarC, "getSerialTaskExecutor(...)");
        return I3.C.c(iN, "CancelWorkById", aVarC, new InterfaceC6082a() { // from class: R3.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return g.h(workManagerImpl, id2);
            }
        });
    }

    public static final C4015H h(final g0 g0Var, final UUID uuid) {
        WorkDatabase workDatabaseQ = g0Var.q();
        AbstractC4862t.d(workDatabaseQ, "getWorkDatabase(...)");
        workDatabaseQ.O(new Runnable() { // from class: R3.d
            @Override // java.lang.Runnable
            public final void run() {
                g.i(g0Var, uuid);
            }
        });
        p(g0Var);
        return C4015H.f34254a;
    }

    public static final void i(g0 g0Var, UUID uuid) {
        String string = uuid.toString();
        AbstractC4862t.d(string, "toString(...)");
        f(g0Var, string);
    }

    public static final void j(final String name, final g0 workManagerImpl) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseQ = workManagerImpl.q();
        AbstractC4862t.d(workDatabaseQ, "getWorkDatabase(...)");
        workDatabaseQ.O(new Runnable() { // from class: R3.c
            @Override // java.lang.Runnable
            public final void run() {
                g.k(workDatabaseQ, name, workManagerImpl);
            }
        });
    }

    public static final void k(WorkDatabase workDatabase, String str, g0 g0Var) {
        Iterator it = workDatabase.W().g(str).iterator();
        while (it.hasNext()) {
            f(g0Var, (String) it.next());
        }
    }

    public static final I3.y l(final String tag, final g0 workManagerImpl) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(workManagerImpl, "workManagerImpl");
        I iN = workManagerImpl.j().n();
        String str = "CancelWorkByTag_" + tag;
        S3.a aVarC = workManagerImpl.r().c();
        AbstractC4862t.d(aVarC, "getSerialTaskExecutor(...)");
        return I3.C.c(iN, str, aVarC, new InterfaceC6082a() { // from class: R3.e
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return g.m(workManagerImpl, tag);
            }
        });
    }

    public static final C4015H m(final g0 g0Var, final String str) {
        final WorkDatabase workDatabaseQ = g0Var.q();
        AbstractC4862t.d(workDatabaseQ, "getWorkDatabase(...)");
        workDatabaseQ.O(new Runnable() { // from class: R3.f
            @Override // java.lang.Runnable
            public final void run() {
                g.n(workDatabaseQ, str, g0Var);
            }
        });
        p(g0Var);
        return C4015H.f34254a;
    }

    public static final void n(WorkDatabase workDatabase, String str, g0 g0Var) {
        Iterator it = workDatabase.W().k(str).iterator();
        while (it.hasNext()) {
            f(g0Var, (String) it.next());
        }
    }

    public static final void o(WorkDatabase workDatabase, String str) {
        J jW = workDatabase.W();
        InterfaceC1857b interfaceC1857bR = workDatabase.R();
        List listQ = C4206t.q(str);
        while (!listQ.isEmpty()) {
            String str2 = (String) gc.y.K(listQ);
            L.c cVarH = jW.h(str2);
            if (cVarH != L.c.SUCCEEDED && cVarH != L.c.FAILED) {
                jW.j(str2);
            }
            listQ.addAll(interfaceC1857bR.a(str2));
        }
    }

    public static final void p(g0 g0Var) {
        AbstractC0915x.f(g0Var.j(), g0Var.q(), g0Var.o());
    }
}
