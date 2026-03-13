package R3;

import I3.AbstractC0889t;
import Q3.I;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final O7.e c(WorkDatabase workDatabase, S3.b executor, final String tag) {
        AbstractC4862t.e(workDatabase, "<this>");
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(tag, "tag");
        return e(workDatabase, executor, new vc.l() { // from class: R3.v
            @Override // vc.l
            public final Object invoke(Object obj) {
                return x.d(tag, (WorkDatabase) obj);
            }
        });
    }

    public static final List d(String str, WorkDatabase db2) {
        AbstractC4862t.e(db2, "db");
        Object objApply = I.f13586B.apply(db2.W().y(str));
        AbstractC4862t.d(objApply, "apply(...)");
        return (List) objApply;
    }

    public static final O7.e e(final WorkDatabase workDatabase, S3.b bVar, final vc.l lVar) {
        S3.a aVarC = bVar.c();
        AbstractC4862t.d(aVarC, "getSerialTaskExecutor(...)");
        return AbstractC0889t.f(aVarC, "loadStatusFuture", new InterfaceC6082a() { // from class: R3.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return x.f(lVar, workDatabase);
            }
        });
    }

    public static final Object f(vc.l lVar, WorkDatabase workDatabase) {
        return lVar.invoke(workDatabase);
    }
}
