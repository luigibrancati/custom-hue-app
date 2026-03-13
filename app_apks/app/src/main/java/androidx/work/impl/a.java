package androidx.work.impl;

import I3.F;
import J3.AbstractC0915x;
import J3.C0910s;
import J3.InterfaceC0912u;
import J3.e0;
import J3.g0;
import O3.n;
import Rd.I;
import Rd.M;
import Rd.N;
import S3.b;
import S3.c;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import vc.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class C0322a extends AbstractC4860q implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0322a f24788a = new C0322a();

        public C0322a() {
            super(6, a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // vc.t
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final List d(Context p02, androidx.work.a p12, b p22, WorkDatabase p32, n p42, C0910s p52) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            AbstractC4862t.e(p22, "p2");
            AbstractC4862t.e(p32, "p3");
            AbstractC4862t.e(p42, "p4");
            AbstractC4862t.e(p52, "p5");
            return a.b(p02, p12, p22, p32, p42, p52);
        }
    }

    public static final List b(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, C0910s c0910s) {
        InterfaceC0912u interfaceC0912uC = AbstractC0915x.c(context, workDatabase, aVar);
        AbstractC4862t.d(interfaceC0912uC, "createBestAvailableBackgroundScheduler(...)");
        return C4206t.n(interfaceC0912uC, new K3.b(context, aVar, nVar, c0910s, new e0(c0910s, bVar), bVar));
    }

    public static final g0 c(Context context, androidx.work.a configuration) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    public static final g0 d(Context context, androidx.work.a configuration, b workTaskExecutor, WorkDatabase workDatabase, n trackers, C0910s processor, t schedulersCreator) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(workTaskExecutor, "workTaskExecutor");
        AbstractC4862t.e(workDatabase, "workDatabase");
        AbstractC4862t.e(trackers, "trackers");
        AbstractC4862t.e(processor, "processor");
        AbstractC4862t.e(schedulersCreator, "schedulersCreator");
        return new g0(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.d(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ g0 e(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, C0910s c0910s, t tVar, int i10, Object obj) {
        n nVar2;
        if ((i10 & 4) != 0) {
            bVar = new c(aVar.m());
        }
        b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            S3.a aVarC = bVar2.c();
            AbstractC4862t.d(aVarC, "getSerialTaskExecutor(...)");
            workDatabase = companion.b(applicationContext, aVarC, aVar.a(), context.getResources().getBoolean(F.f5555a));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            AbstractC4862t.d(applicationContext2, "getApplicationContext(...)");
            nVar2 = new n(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, bVar2, workDatabase, nVar2, (i10 & 32) != 0 ? new C0910s(context.getApplicationContext(), aVar, bVar2, workDatabase) : c0910s, (i10 & 64) != 0 ? C0322a.f24788a : tVar);
    }

    public static final M f(b taskExecutor) {
        AbstractC4862t.e(taskExecutor, "taskExecutor");
        I iB = taskExecutor.b();
        AbstractC4862t.d(iB, "getTaskCoroutineDispatcher(...)");
        return N.a(iB);
    }
}
