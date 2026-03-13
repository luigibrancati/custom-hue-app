package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/app/Activity;", "Lfc/H;", "requestPushPermissionPrompt", "(Landroid/app/Activity;)V", "wouldPushPermissionPromptDisplay", "(Landroid/app/Activity;)Z", "context", "", "getPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)I", "incrementPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PermissionUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final int getPermissionRequestCount(Context context, String permission) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(permission, "permission");
        return context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0).getInt(permission, 0);
    }

    public static final boolean hasPermission(Context context, final String permission) {
        AbstractC4862t.e(permission, "permission");
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission(permission) == 0) {
                    return true;
                }
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, th, false, new InterfaceC6082a() { // from class: s5.h0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return PermissionUtils.hasPermission$lambda$0(permission);
                    }
                }, 8, (Object) null);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasPermission$lambda$0(String str) {
        return "Failure checking permission " + str;
    }

    public static final void incrementPermissionRequestCount(Context context, String permission) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(permission, "permission");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0);
        final int i10 = sharedPreferences.getInt(permission, 0) + 1;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.b0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return PermissionUtils.incrementPermissionRequestCount$lambda$11(i10);
            }
        }, 14, (Object) null);
        sharedPreferences.edit().putInt(permission, i10).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementPermissionRequestCount$lambda$11(int i10) {
        return "Incrementing permission request counter to " + i10 + ".";
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28627V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.i0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return PermissionUtils.requestPushPermissionPrompt$lambda$1();
            }
        }, 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.j0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.requestPushPermissionPrompt$lambda$2();
                }
            }, 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.a0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.requestPushPermissionPrompt$lambda$3();
                }
            }, 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.k0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return PermissionUtils.requestPushPermissionPrompt$lambda$4();
            }
        }, 12, (Object) null);
        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, IntentUtils.getRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$1() {
        return "Attempting to execute requestPushPermissionPrompt()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$2() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$3() {
        return "Permission prompt would not display, not attempting to request push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$4() {
        return "Requesting push permission from system.";
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.Z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$5();
                }
            }, 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.c0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$6();
                }
            }, 12, (Object) null);
            return false;
        }
        final int i10 = activity.getApplicationInfo().targetSdkVersion;
        if (i10 < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.d0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$7(i10);
                }
            }, 12, (Object) null);
            return false;
        }
        if (hasPermission(activity, "android.permission.POST_NOTIFICATIONS")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.e0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$8();
                }
            }, 12, (Object) null);
            return false;
        }
        final int permissionRequestCount = getPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.f0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$9(permissionRequestCount);
                }
            }, 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.g0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$10();
            }
        }, 12, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$10() {
        return "Push Prompt can be shown on this device, within a reasonable confidence.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$5() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$6() {
        return "Device API version of " + Build.VERSION.SDK_INT + " is too low to display push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$7(int i10) {
        return "App Target API version of " + i10 + " is too low to display push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$8() {
        return "Notification permission already granted, doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$9(int i10) {
        return "Notification permission request count is " + i10 + ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'";
    }
}
