package L;

import E.AbstractC0807p0;
import L.U0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import s.InterfaceC5702a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class W0 implements InterfaceC5702a {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends Service {
    }

    public static U0 b(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC0807p0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        AbstractC0807p0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        AbstractC0807p0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        AbstractC0807p0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new U0.b().d(z10).c(e(strArrC)).b(e(strArrC2)).a();
    }

    public static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            AbstractC0807p0.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            AbstractC0807p0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }

    public static Class d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (T0.class.isAssignableFrom(cls)) {
                return cls;
            }
            AbstractC0807p0.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e10) {
            AbstractC0807p0.m("QuirkSettingsLoader", "Class not found: " + str, e10);
            return null;
        }
    }

    public static Set e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override // s.InterfaceC5702a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U0 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            AbstractC0807p0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC0807p0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
