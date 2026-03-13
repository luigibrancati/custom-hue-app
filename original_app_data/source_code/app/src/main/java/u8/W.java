package u8;

import android.app.ApplicationExitInfo;
import android.content.Context;
import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import w8.C6166c;
import w8.C6169f;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f45304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.e f45305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B8.b f45306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6169f f45307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w8.p f45308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f45309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v8.i f45310g;

    public W(D d10, A8.e eVar, B8.b bVar, C6169f c6169f, w8.p pVar, M m10, v8.i iVar) {
        this.f45304a = d10;
        this.f45305b = eVar;
        this.f45306c = bVar;
        this.f45307d = c6169f;
        this.f45308e = pVar;
        this.f45309f = m10;
        this.f45310g = iVar;
    }

    public static /* synthetic */ void a(W w10, F.e.d dVar, C6166c c6166c, boolean z10) {
        w10.getClass();
        r8.g.f().b("disk worker: log non-fatal event to persistence");
        w10.f45305b.w(dVar, c6166c.b(), z10);
    }

    public static F.a h(ApplicationExitInfo applicationExitInfo) {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e10) {
            r8.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public static String i(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
                bufferedInputStream.close();
                throw th;
            }
        } finally {
        }
    }

    public static W j(Context context, M m10, A8.g gVar, C5984a c5984a, C6169f c6169f, w8.p pVar, D8.d dVar, C8.j jVar, S s10, C5996m c5996m, v8.i iVar) {
        return new W(new D(context, m10, c5984a, dVar, jVar), new A8.e(gVar, jVar, c5996m), B8.b.b(context, jVar, s10), c6169f, pVar, m10, iVar);
    }

    public static List o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: u8.U
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((F.c) obj).b().compareTo(((F.c) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    public final F.e.d d(F.e.d dVar, C6169f c6169f, w8.p pVar) {
        return e(dVar, c6169f, pVar, Collections.EMPTY_MAP);
    }

    public final F.e.d e(F.e.d dVar, C6169f c6169f, w8.p pVar, Map map) {
        F.e.d.b bVarH = dVar.h();
        String strC = c6169f.c();
        if (strC != null) {
            bVarH.d(F.e.d.AbstractC0661d.a().b(strC).a());
        } else {
            r8.g.f().i("No log data to include with this event.");
        }
        List listO = o(pVar.g(map));
        List listO2 = o(pVar.h());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    public final F.e.d f(F.e.d dVar, Map map) {
        return g(e(dVar, this.f45307d, this.f45308e, map), this.f45308e);
    }

    public final F.e.d g(F.e.d dVar, w8.p pVar) {
        List listI = pVar.i();
        if (listI.isEmpty()) {
            return dVar;
        }
        F.e.d.b bVarH = dVar.h();
        bVarH.e(F.e.d.f.a().b(listI).a());
        return bVarH.a();
    }

    public final E k(E e10) {
        if (e10.b().h() != null && e10.b().g() != null) {
            return e10;
        }
        L lD = this.f45309f.d(true);
        return E.a(e10.b().t(lD.b()).s(lD.a()), e10.d(), e10.c());
    }

    public void l(String str, List list, F.a aVar) {
        r8.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.d.b bVarA = ((P) it.next()).a();
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        this.f45305b.l(str, F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j10, String str) {
        this.f45305b.k(str, j10);
    }

    public final ApplicationExitInfo n(String str, List list) {
        long jQ = this.f45305b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it.next();
            if (applicationExitInfo.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public boolean p() {
        return this.f45305b.r();
    }

    public SortedSet q() {
        return this.f45305b.p();
    }

    public void r(String str, long j10) {
        this.f45305b.x(this.f45304a.e(str, j10));
    }

    public final boolean s(Task task) {
        if (!task.q()) {
            r8.g.f().l("Crashlytics report could not be enqueued to DataTransport", task.l());
            return false;
        }
        E e10 = (E) task.m();
        r8.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + e10.d());
        File fileC = e10.c();
        if (fileC.delete()) {
            r8.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        r8.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    public final void t(Throwable th, Thread thread, String str, final C6166c c6166c, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final F.e.d dVarF = f(this.f45304a.d(th, thread, str, c6166c.c(), 4, 8, z10), c6166c.a());
        if (z10) {
            this.f45305b.w(dVarF, c6166c.b(), zEquals);
        } else {
            this.f45310g.f45902b.e(new Runnable() { // from class: u8.T
                @Override // java.lang.Runnable
                public final void run() {
                    W.a(this.f45299a, dVarF, c6166c, zEquals);
                }
            });
        }
    }

    public void u(Throwable th, Thread thread, String str, long j10) {
        r8.g.f().i("Persisting fatal event for session " + str);
        t(th, thread, "crash", new C6166c(str, j10), true);
    }

    public void v(Throwable th, Thread thread, C6166c c6166c) {
        r8.g.f().i("Persisting non-fatal event for session " + c6166c.b());
        t(th, thread, "error", c6166c, false);
    }

    public void w(String str, List list, C6169f c6169f, w8.p pVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            r8.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d dVarC = this.f45304a.c(h(applicationExitInfoN));
        r8.g.f().b("Persisting anr for session " + str);
        this.f45305b.w(g(d(dVarC, c6169f, pVar), pVar), str, true);
    }

    public void x() {
        this.f45305b.i();
    }

    public Task y(Executor executor) {
        return z(executor, null);
    }

    public Task z(Executor executor, String str) {
        List<E> listU = this.f45305b.u();
        ArrayList arrayList = new ArrayList();
        for (E e10 : listU) {
            if (str == null || str.equals(e10.d())) {
                arrayList.add(this.f45306c.c(k(e10), str != null).j(executor, new InterfaceC2869c() { // from class: u8.V
                    @Override // b7.InterfaceC2869c
                    public final Object a(Task task) {
                        return Boolean.valueOf(this.f45303a.s(task));
                    }
                }));
            }
        }
        return Tasks.f(arrayList);
    }
}
