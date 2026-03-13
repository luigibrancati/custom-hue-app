package M0;

import M0.d;
import X0.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f8901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile List f8902b;

    public static List a(Context context) {
        Bundle bundle;
        String string;
        if (f8902b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((b) Class.forName(string, false, e.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f8902b == null) {
                f8902b = arrayList;
            }
        }
        return f8902b;
    }

    public static d b(Context context) {
        if (f8901a == null) {
            try {
                f8901a = (d) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, e.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f8901a == null) {
                f8901a = new d.a();
            }
        }
        return f8901a;
    }

    public static void c(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        b(context).b();
        Iterator it = a(context).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
    }

    public static List d(List list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a(i10)) {
                arrayList.remove(cVar);
            }
        }
        return arrayList;
    }

    public static void e(Context context, String str) {
        h.g(context);
        h.g(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = a(context).iterator();
        while (it.hasNext()) {
            ((b) it.next()).c(Collections.singletonList(str));
        }
    }

    public static boolean f(Context context, List list) {
        h.g(context);
        h.g(list);
        List listD = d(list, 1);
        ArrayList arrayList = new ArrayList(listD.size());
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).b());
        }
        if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
            return false;
        }
        b(context).b();
        b(context).a(listD);
        for (b bVar : a(context)) {
            bVar.a();
            bVar.b(list);
        }
        return true;
    }
}
