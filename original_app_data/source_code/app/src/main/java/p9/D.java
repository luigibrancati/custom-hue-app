package p9;

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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f42315a = new D();

    public final List a(Context context) {
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
            String processName = runningAppProcessInfo.processName;
            AbstractC4862t.d(processName, "processName");
            arrayList2.add(new C(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC4862t.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final C b(Context context) {
        Object next;
        AbstractC4862t.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C) next).b() == iMyPid) {
                break;
            }
        }
        C c10 = (C) next;
        return c10 == null ? new C(c(), iMyPid, 0, false) : c10;
    }

    public final String c() {
        if (Build.VERSION.SDK_INT > 33) {
            String strMyProcessName = Process.myProcessName();
            AbstractC4862t.d(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        String processName = Application.getProcessName();
        if (processName != null) {
            return processName;
        }
        String strA = B6.m.a();
        return strA != null ? strA : "";
    }
}
