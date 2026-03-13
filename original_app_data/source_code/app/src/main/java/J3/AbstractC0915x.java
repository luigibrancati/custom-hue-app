package J3;

import I3.AbstractC0890u;
import I3.InterfaceC0872b;
import Q3.C1877w;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: J3.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0915x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f6098a = AbstractC0890u.i("Schedulers");

    public static /* synthetic */ void b(List list, C1877w c1877w, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0912u) it.next()).a(c1877w.b());
        }
        f(aVar, workDatabase, list);
    }

    public static InterfaceC0912u c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        L3.f fVar = new L3.f(context, workDatabase, aVar);
        R3.r.c(context, SystemJobService.class, true);
        AbstractC0890u.e().a(f6098a, "Created SystemJobScheduler and enabled SystemJobService");
        return fVar;
    }

    public static void d(Q3.J j10, InterfaceC0872b interfaceC0872b, List list) {
        if (list.size() > 0) {
            long jA = interfaceC0872b.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j10.o(((Q3.I) it.next()).f13588a, jA);
            }
        }
    }

    public static void e(final List list, C0910s c0910s, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        c0910s.e(new InterfaceC0897e() { // from class: J3.v
            @Override // J3.InterfaceC0897e
            public final void c(C1877w c1877w, boolean z10) {
                executor.execute(new Runnable() { // from class: J3.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0915x.b(list, c1877w, aVar, workDatabase);
                    }
                });
            }
        });
    }

    public static void f(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Q3.J jW = workDatabase.W();
        workDatabase.h();
        try {
            List listV = jW.v();
            d(jW, aVar.a(), listV);
            List listR = jW.r(aVar.h());
            d(jW, aVar.a(), listR);
            if (listV != null) {
                listR.addAll(listV);
            }
            List listM = jW.m(200);
            workDatabase.P();
            workDatabase.p();
            if (listR.size() > 0) {
                Q3.I[] iArr = (Q3.I[]) listR.toArray(new Q3.I[listR.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC0912u interfaceC0912u = (InterfaceC0912u) it.next();
                    if (interfaceC0912u.d()) {
                        interfaceC0912u.e(iArr);
                    }
                }
            }
            if (listM.size() > 0) {
                Q3.I[] iArr2 = (Q3.I[]) listM.toArray(new Q3.I[listM.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC0912u interfaceC0912u2 = (InterfaceC0912u) it2.next();
                    if (!interfaceC0912u2.d()) {
                        interfaceC0912u2.e(iArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.p();
            throw th;
        }
    }
}
