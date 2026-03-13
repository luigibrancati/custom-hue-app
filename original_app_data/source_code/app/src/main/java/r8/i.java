package r8;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f43833a = new i();

    public static /* synthetic */ F.e.d.a.c c(i iVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return iVar.b(str, i10, i11, z10);
    }

    public final F.e.d.a.c a(String processName, int i10, int i11) {
        AbstractC4862t.e(processName, "processName");
        return c(this, processName, i10, i11, false, 8, null);
    }

    public final F.e.d.a.c b(String processName, int i10, int i11, boolean z10) {
        AbstractC4862t.e(processName, "processName");
        F.e.d.a.c cVarA = F.e.d.a.c.a().e(processName).d(i10).c(i11).b(z10).a();
        AbstractC4862t.d(cVarA, "build(...)");
        return cVarA;
    }

    public final List d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listK;
        AbstractC4862t.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listK = activityManager.getRunningAppProcesses()) == null) {
            listK = C4206t.k();
        }
        List listE0 = C4179C.e0(listK);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listE0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(AbstractC4862t.a(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final F.e.d.a.c e(Context context) {
        Object next;
        AbstractC4862t.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((F.e.d.a.c) next).c() == iMyPid) {
                break;
            }
        }
        F.e.d.a.c cVar = (F.e.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }

    public final String f() {
        if (Build.VERSION.SDK_INT <= 33) {
            String processName = Application.getProcessName();
            return processName == null ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        AbstractC4862t.b(strMyProcessName);
        return strMyProcessName;
    }
}
