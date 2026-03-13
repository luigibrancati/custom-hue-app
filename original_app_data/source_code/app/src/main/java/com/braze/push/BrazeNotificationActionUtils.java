package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.m;
import com.braze.Braze;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationActionUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/braze/push/BrazeNotificationActionUtils;", "", "<init>", "()V", "Landroidx/core/app/m$e;", "notificationBuilder", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Lfc/H;", "addNotificationActions", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "handleNotificationActionClicked", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButton", "addNotificationAction", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;)V", "", "actionType", "logNotificationActionClicked", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$10(Bundle bundle) {
        return "Added action with bundle: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$7() {
        return "Cannot add notification action with null context from payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$8(String str) {
        return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$9(String str) {
        return "Adding notification action with type: " + str + " Setting intent class to trampoline activity";
    }

    public static final void addNotificationActions(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationActionUtils.addNotificationActions$lambda$0();
                }
            }, 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationActionUtils.addNotificationActions$lambda$1();
                }
            }, 7, (Object) null);
            return;
        }
        for (final BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.h
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationActionUtils.addNotificationActions$lambda$2(actionButton);
                }
            }, 6, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$0() {
        return "Context cannot be null when adding notification buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$1() {
        return "No action buttons present. Not adding notification actions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$2(BrazeNotificationPayload.ActionButton actionButton) {
        return "Adding action button: " + actionButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:18:0x0043, B:29:0x0060, B:32:0x006b, B:34:0x0071, B:36:0x0078, B:38:0x0085, B:40:0x008b, B:42:0x0098, B:44:0x00a7, B:46:0x00ab, B:41:0x0095, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:48:0x00bc, B:50:0x00cd), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:18:0x0043, B:29:0x0060, B:32:0x006b, B:34:0x0071, B:36:0x0078, B:38:0x0085, B:40:0x008b, B:42:0x0098, B:44:0x00a7, B:46:0x00ab, B:41:0x0095, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:48:0x00bc, B:50:0x00cd), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x001e, B:10:0x002c, B:18:0x0043, B:29:0x0060, B:32:0x006b, B:34:0x0071, B:36:0x0078, B:38:0x0085, B:40:0x008b, B:42:0x0098, B:44:0x00a7, B:46:0x00ab, B:41:0x0095, B:21:0x004c, B:24:0x0055, B:26:0x0059, B:48:0x00bc, B:50:0x00cd), top: B:55:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void handleNotificationActionClicked(android.content.Context r12, android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked(android.content.Context, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$3() {
        return "Notification action button type was blank or null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$4() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$5() {
        return "Unknown notification action button clicked. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$6() {
        return "Caught exception while handling notification action button click.";
    }

    public final void addNotificationAction(m.e notificationBuilder, BrazeNotificationPayload payload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        AbstractC4862t.e(actionButton, "actionButton");
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationActionUtils.addNotificationAction$lambda$7();
                }
            }, 7, (Object) null);
            return;
        }
        final Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        final String type = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if (AbstractC4862t.a("ab_none", type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.j
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationActionUtils.addNotificationAction$lambda$8(type);
                }
            }, 6, (Object) null);
            Intent intent = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.k
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationActionUtils.addNotificationAction$lambda$9(type);
                }
            }, 6, (Object) null);
            Intent intent2 = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
        }
        m.a.C0283a c0283a = new m.a.C0283a(0, actionButton.getText(), activity);
        c0283a.a(new Bundle(bundle));
        notificationBuilder.b(c0283a.c());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationActionUtils.addNotificationAction$lambda$10(bundle);
            }
        }, 6, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String actionType) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        Braze.INSTANCE.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra("cid"), intent.getStringExtra("braze_action_id"), actionType);
    }
}
