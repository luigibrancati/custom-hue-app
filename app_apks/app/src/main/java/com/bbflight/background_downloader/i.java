package com.bbflight.background_downloader;

import Q4.I;
import Q4.J;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bbflight.background_downloader.a;
import gc.C4206t;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27255a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: com.bbflight.background_downloader.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final /* synthetic */ class C0351a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27256a;

            static {
                int[] iArr = new int[J.values().length];
                try {
                    iArr[J.notifications.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[J.androidSharedStorage.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27256a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final I a(Context context, J permissionType) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(permissionType, "permissionType");
            int i10 = C0351a.f27256a[permissionType.ordinal()];
            return i10 != 1 ? i10 != 2 ? I.granted : I.granted : Build.VERSION.SDK_INT >= 33 ? L0.a.a(context, "android.permission.POST_NOTIFICATIONS") == 0 ? I.granted : I.denied : I.granted;
        }

        public final boolean b(com.bbflight.background_downloader.a plugin, int i10, int[] grantResults) {
            AbstractC4862t.e(plugin, "plugin");
            AbstractC4862t.e(grantResults, "grantResults");
            boolean z10 = !(grantResults.length == 0) && grantResults[0] == 0;
            if (i10 != J.notifications.ordinal() + 373900 && i10 != J.androidSharedStorage.ordinal() + 373900) {
                return false;
            }
            d(plugin, z10);
            return true;
        }

        public final boolean c(com.bbflight.background_downloader.a plugin, J permissionType) {
            AbstractC4862t.e(plugin, "plugin");
            AbstractC4862t.e(permissionType, "permissionType");
            int iOrdinal = permissionType.ordinal() + 373900;
            if (C0351a.f27256a[permissionType.ordinal()] != 1 || Build.VERSION.SDK_INT < 33 || plugin.getActivity() == null) {
                return false;
            }
            Activity activity = plugin.getActivity();
            AbstractC4862t.b(activity);
            androidx.core.app.a.v(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, iOrdinal);
            return true;
        }

        public final void d(com.bbflight.background_downloader.a aVar, boolean z10) {
            MethodChannel methodChannelB = a.Companion.b(com.bbflight.background_downloader.a.INSTANCE, aVar, null, 2, null);
            if (methodChannelB != null) {
                methodChannelB.invokeMethod("permissionRequestResult", C4206t.n("", Integer.valueOf((z10 ? I.granted : I.denied).ordinal())));
            }
        }

        public final boolean e(com.bbflight.background_downloader.a plugin, J permissionType) {
            AbstractC4862t.e(plugin, "plugin");
            AbstractC4862t.e(permissionType, "permissionType");
            Activity activity = plugin.getActivity();
            if (activity != null) {
                int i10 = C0351a.f27256a[permissionType.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    return androidx.core.app.a.y(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    return androidx.core.app.a.y(activity, "android.permission.POST_NOTIFICATIONS");
                }
            }
            return false;
        }

        public a() {
        }
    }
}
