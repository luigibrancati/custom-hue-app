package P4;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f13119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f13120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f13122e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void onSuccess(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(Map map);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(boolean z10);
    }

    public n(Context context) {
        this.f13118a = context;
    }

    public final int a() {
        List listC = o.c(this.f13118a, 21);
        if (listC != null && !listC.isEmpty()) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT < 33) {
            return NotificationManagerCompat.from(this.f13118a).areNotificationsEnabled() ? 1 : 0;
        }
        if (this.f13118a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return o.b(this.f13120c, "android.permission.POST_NOTIFICATIONS");
    }

    public void c(int i10, a aVar) {
        aVar.onSuccess(d(i10));
    }

    public final int d(int i10) {
        if (i10 == 17) {
            return b();
        }
        if (i10 == 21) {
            return a();
        }
        if (i10 == 30 || i10 != 28) {
        }
        if ((i10 == 37 || i10 == 0) && !e()) {
            return 0;
        }
        List<String> listC = o.c(this.f13118a, i10);
        if (listC == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        }
        if (listC.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + listC + i10);
            return 0;
        }
        if (this.f13118a.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            for (String str : listC) {
                if (i10 == 16) {
                    String packageName = this.f13118a.getPackageName();
                    PowerManager powerManager = (PowerManager) this.f13118a.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        hashSet.add(0);
                    } else {
                        hashSet.add(1);
                    }
                } else if (i10 == 22) {
                    hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                } else if (i10 == 23) {
                    hashSet.add(Integer.valueOf(Settings.canDrawOverlays(this.f13118a) ? 1 : 0));
                } else if (i10 == 24) {
                    hashSet.add(Integer.valueOf(this.f13118a.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                } else if (i10 == 27) {
                    hashSet.add(Integer.valueOf(((NotificationManager) this.f13118a.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i10 == 34) {
                    hashSet.add(Integer.valueOf(((AlarmManager) this.f13118a.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0));
                } else if (i10 == 9 || i10 == 32) {
                    int iA = L0.a.a(this.f13118a, str);
                    if ((Build.VERSION.SDK_INT >= 34 ? L0.a.a(this.f13118a, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : iA) == 0 && iA == -1) {
                        hashSet.add(3);
                    } else if (iA == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(Integer.valueOf(o.b(this.f13120c, str)));
                    }
                } else if (L0.a.a(this.f13118a, str) != 0) {
                    hashSet.add(Integer.valueOf(o.b(this.f13120c, str)));
                }
            }
            if (!hashSet.isEmpty()) {
                return o.j(hashSet).intValue();
            }
        }
        return 1;
    }

    public final boolean e() {
        List listC = o.c(this.f13118a, 37);
        boolean z10 = listC != null && listC.contains("android.permission.WRITE_CALENDAR");
        boolean z11 = listC != null && listC.contains("android.permission.READ_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void f(String str, int i10) {
        if (this.f13120c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f13120c.getPackageName()));
        }
        this.f13120c.startActivityForResult(intent, i10);
        this.f13121d++;
    }

    public void g(List list, b bVar, P4.b bVar2) {
        if (this.f13121d > 0) {
            bVar2.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
            return;
        }
        if (this.f13120c == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar2.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        this.f13119b = bVar;
        this.f13122e = new HashMap();
        this.f13121d = 0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (d(num.intValue()) != 1) {
                List listC = o.c(this.f13120c, num.intValue());
                if (listC == null || listC.isEmpty()) {
                    if (!this.f13122e.containsKey(num)) {
                        this.f13122e.put(num, 0);
                        this.f13122e.put(num, 0);
                    }
                } else if (num.intValue() == 16) {
                    f("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                } else if (num.intValue() == 22) {
                    f("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                } else if (num.intValue() == 23) {
                    f("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                } else if (num.intValue() == 24) {
                    f("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                } else if (num.intValue() == 27) {
                    f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                } else if (num.intValue() == 34) {
                    f("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                } else if (num.intValue() != 37 && num.intValue() != 0) {
                    arrayList.addAll(listC);
                    this.f13121d += listC.size();
                } else if (e()) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    arrayList.add("android.permission.READ_CALENDAR");
                    this.f13121d += 2;
                } else {
                    this.f13122e.put(num, 0);
                }
            } else if (!this.f13122e.containsKey(num)) {
                this.f13122e.put(num, 1);
            }
        }
        if (arrayList.size() > 0) {
            androidx.core.app.a.v(this.f13120c, (String[]) arrayList.toArray(new String[0]), 24);
        }
        b bVar3 = this.f13119b;
        if (bVar3 == null || this.f13121d != 0) {
            return;
        }
        bVar3.a(this.f13122e);
    }

    public void h(Activity activity) {
        this.f13120c = activity;
    }

    public void i(int i10, c cVar, P4.b bVar) {
        Activity activity = this.f13120c;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List listC = o.c(activity, i10);
        if (listC == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.a(false);
            return;
        }
        if (!listC.isEmpty()) {
            cVar.a(androidx.core.app.a.y(this.f13120c, (String) listC.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
        cVar.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        int i12;
        int iCanScheduleExactAlarms;
        Activity activity = this.f13120c;
        boolean z10 = false;
        z10 = false;
        if (activity == null) {
            return false;
        }
        if (this.f13122e == null) {
            this.f13121d = 0;
            return false;
        }
        if (i10 == 209) {
            String packageName = this.f13118a.getPackageName();
            PowerManager powerManager = (PowerManager) this.f13118a.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                z10 = true;
            }
            i12 = 16;
            iCanScheduleExactAlarms = z10;
        } else if (i10 == 210) {
            i12 = 22;
            iCanScheduleExactAlarms = Environment.isExternalStorageManager();
        } else if (i10 == 211) {
            i12 = 23;
            iCanScheduleExactAlarms = Settings.canDrawOverlays(activity);
        } else if (i10 == 212) {
            i12 = 24;
            iCanScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
        } else if (i10 == 213) {
            i12 = 27;
            iCanScheduleExactAlarms = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i10 != 214) {
                return false;
            }
            i12 = 34;
            iCanScheduleExactAlarms = ((AlarmManager) activity.getSystemService("alarm")).canScheduleExactAlarms();
        }
        this.f13122e.put(Integer.valueOf(i12), Integer.valueOf(iCanScheduleExactAlarms));
        int i13 = this.f13121d - 1;
        this.f13121d = i13;
        b bVar = this.f13119b;
        if (bVar != null && i13 == 0) {
            bVar.a(this.f13122e);
        }
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        int iG;
        int i12 = 8;
        if (i10 != 24) {
            this.f13121d = 0;
            return false;
        }
        if (this.f13122e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            this.f13121d = 0;
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List listAsList = Arrays.asList(strArr);
        int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
        if (iIndexOf >= 0) {
            i11 = 0;
            int iK = o.k(this.f13120c, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
            this.f13122e.put(36, Integer.valueOf(iK));
            int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
            if (iIndexOf2 >= 0) {
                Integer numI = o.i(Integer.valueOf(iK), Integer.valueOf(o.k(this.f13120c, "android.permission.READ_CALENDAR", iArr[iIndexOf2])));
                numI.intValue();
                this.f13122e.put(37, numI);
                this.f13122e.put(0, numI);
            }
        } else {
            i11 = 0;
        }
        int i13 = i11;
        while (i13 < strArr.length) {
            String str = strArr[i13];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR") && (iG = o.g(str)) != 20) {
                int i14 = iArr[i13];
                if (iG == i12) {
                    this.f13122e.put(8, o.i((Integer) this.f13122e.get(8), Integer.valueOf(o.k(this.f13120c, str, i14))));
                } else if (iG == 7) {
                    if (!this.f13122e.containsKey(7)) {
                        this.f13122e.put(7, Integer.valueOf(o.k(this.f13120c, str, i14)));
                    }
                    if (!this.f13122e.containsKey(14)) {
                        this.f13122e.put(14, Integer.valueOf(o.k(this.f13120c, str, i14)));
                    }
                } else if (iG == 4) {
                    int iK2 = o.k(this.f13120c, str, i14);
                    if (!this.f13122e.containsKey(4)) {
                        this.f13122e.put(4, Integer.valueOf(iK2));
                    }
                } else if (iG == 3) {
                    int iK3 = o.k(this.f13120c, str, i14);
                    if (!this.f13122e.containsKey(5)) {
                        this.f13122e.put(5, Integer.valueOf(iK3));
                    }
                    this.f13122e.put(Integer.valueOf(iG), Integer.valueOf(iK3));
                } else if (iG == 9 || iG == 32) {
                    this.f13122e.put(Integer.valueOf(iG), Integer.valueOf(d(iG)));
                } else if (!this.f13122e.containsKey(Integer.valueOf(iG))) {
                    this.f13122e.put(Integer.valueOf(iG), Integer.valueOf(o.k(this.f13120c, str, i14)));
                }
            }
            i13++;
            i12 = 8;
        }
        int length = this.f13121d - iArr.length;
        this.f13121d = length;
        b bVar = this.f13119b;
        if (bVar == null || length != 0) {
            return true;
        }
        bVar.a(this.f13122e);
        return true;
    }
}
