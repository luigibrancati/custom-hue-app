package androidx.work.impl.workers;

import I3.AbstractC0890u;
import J3.g0;
import Q3.InterfaceC1871p;
import Q3.InterfaceC1879y;
import Q3.J;
import Q3.s0;
import T3.a;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import io.flutter.plugins.firebase.analytics.Constants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", Constants.PARAMETERS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "L", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a L() {
        g0 g0VarL = g0.l(z());
        AbstractC4862t.d(g0VarL, "getInstance(...)");
        WorkDatabase workDatabaseQ = g0VarL.q();
        AbstractC4862t.d(workDatabaseQ, "getWorkDatabase(...)");
        J jW = workDatabaseQ.W();
        InterfaceC1879y interfaceC1879yU = workDatabaseQ.U();
        s0 s0VarX = workDatabaseQ.X();
        InterfaceC1871p interfaceC1871pT = workDatabaseQ.T();
        List listD = jW.d(g0VarL.j().a().a() - TimeUnit.DAYS.toMillis(1L));
        List listU = jW.u();
        List listM = jW.m(200);
        if (!listD.isEmpty()) {
            AbstractC0890u.e().f(a.f16188a, "Recently completed work:\n\n");
            AbstractC0890u.e().f(a.f16188a, a.d(interfaceC1879yU, s0VarX, interfaceC1871pT, listD));
        }
        if (!listU.isEmpty()) {
            AbstractC0890u.e().f(a.f16188a, "Running work:\n\n");
            AbstractC0890u.e().f(a.f16188a, a.d(interfaceC1879yU, s0VarX, interfaceC1871pT, listU));
        }
        if (!listM.isEmpty()) {
            AbstractC0890u.e().f(a.f16188a, "Enqueued work:\n\n");
            AbstractC0890u.e().f(a.f16188a, a.d(interfaceC1879yU, s0VarX, interfaceC1871pT, listM));
        }
        c.a aVarB = c.a.b();
        AbstractC4862t.d(aVarB, "success(...)");
        return aVarB;
    }
}
