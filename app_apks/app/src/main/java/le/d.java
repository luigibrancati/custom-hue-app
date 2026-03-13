package le;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Intent f40097a = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List a(android.content.Context r9) {
        /*
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Intent r1 = le.d.f40097a
            r2 = 0
            android.content.pm.ResolveInfo r3 = r9.resolveActivity(r1, r2)
            if (r3 == 0) goto L17
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L18
        L17:
            r3 = 0
        L18:
            r4 = 131136(0x20040, float:1.8376E-40)
            java.util.List r1 = r9.queryIntentActivities(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            boolean r5 = c(r4)
            if (r5 != 0) goto L36
            goto L23
        L36:
            android.content.pm.ActivityInfo r5 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r5 = r5.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r6 = 64
            android.content.pm.PackageInfo r5 = r9.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r6 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r6 = r6.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            boolean r6 = b(r9, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r6 == 0) goto L61
            le.b r6 = new le.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r7 = 1
            r6.<init>(r5, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r8 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r8 = r8.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            boolean r8 = r8.equals(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r8 == 0) goto L5e
            r0.add(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L62
        L5e:
            r0.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
        L61:
            r7 = r2
        L62:
            le.b r6 = new le.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r6.<init>(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            boolean r4 = r4.equals(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r4 == 0) goto L75
            r0.add(r7, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L23
        L75:
            r0.add(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            goto L23
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: le.d.a(android.content.Context):java.util.List");
    }

    public static boolean b(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(str);
        return packageManager.resolveService(intent, 0) != null;
    }

    public static boolean c(ResolveInfo resolveInfo) {
        IntentFilter intentFilter = resolveInfo.filter;
        if (intentFilter == null || !intentFilter.hasAction("android.intent.action.VIEW") || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
        boolean zEquals = false;
        boolean zEquals2 = false;
        while (itSchemesIterator.hasNext()) {
            String next = itSchemesIterator.next();
            zEquals |= "http".equals(next);
            zEquals2 |= "https".equals(next);
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }

    public static C4997b d(Context context, c cVar) {
        C4997b c4997b = null;
        for (C4997b c4997b2 : a(context)) {
            if (cVar.a(c4997b2)) {
                if (c4997b2.f40096d.booleanValue()) {
                    return c4997b2;
                }
                if (c4997b == null) {
                    c4997b = c4997b2;
                }
            }
        }
        return c4997b;
    }
}
