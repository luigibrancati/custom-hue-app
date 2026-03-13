package com.braze.push;

import Bc.k;
import Rd.AbstractC2132i;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import io.sentry.SentryBaseEvent;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import zc.AbstractC6558c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazePushReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010)\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010*\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010+\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010,\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006-"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "handlePush", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "runOnThread", "handleReceivedIntent", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "handleAdmRegistrationEventIfEnabled", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/content/Context;Landroid/content/Intent;)Z", "handleAdmRegistrationIntent", "(Landroid/content/Context;Landroid/content/Intent;)Z", "handlePushNotificationPayload", "Landroid/os/Bundle;", "notificationExtras", "brazeExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "createPayload", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/os/Bundle;Landroid/os/Bundle;)Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "logNotificationMetadata$android_sdk_ui_release", "(Landroid/content/Context;Lcom/braze/models/push/BrazeNotificationPayload;)V", "logNotificationMetadata", "", "MESSAGE_TYPE_KEY", "Ljava/lang/String;", "DELETED_MESSAGES_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_INTENT_ACTION", "ADM_ERROR_KEY", "ADM_ERROR_DESCRIPTION_KEY", "ADM_REGISTRATION_ID_KEY", "ADM_UNREGISTERED_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$4(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$5() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$6() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$10() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$7(String str, String str2) {
            return "Error during ADM registration: " + str + " description: " + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$8(String str) {
            return "Registering for ADM messages with registrationId: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$9(String str) {
            return "The device was un-registered from ADM: " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, final Intent intent) {
            Context applicationContext = context.getApplicationContext();
            final String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.Y0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePush$lambda$3(action, intent);
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r8.equals("hms_push_service_routing_action") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r8.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        
            if (r8.equals("com.braze.action.STORY_TRAVERSE") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        
            if (r8.equals("firebase_messaging_service_routing_action") == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
        
            r1.handlePushNotificationPayload(r9, r10);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final void handlePush$performWork(java.lang.String r8, android.content.Context r9, final android.content.Intent r10, android.content.Context r11) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$0(Intent intent) {
            return "Received broadcast message. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$1(Intent intent) {
            return "Push action is null. Not handling intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$2() {
            return "Received a message not sent from Braze. Ignoring the message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12(int i10) {
            return "Firebase messaging 'total_deleted' reports " + i10 + " messages.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$13(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$16$lambda$15(String str) {
            return "Push with identifier '" + str + "' has already been seen. Not displaying or forwarding push.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$17() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$18() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$19() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$20() {
            return "Received the initial Push Story notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$21(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$22() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$23(NotificationManagerCompat notificationManagerCompat) {
            return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompat.areNotificationsEnabled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$24() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$26() {
            return "Received silent push notification";
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            companion.handleReceivedIntent(context, intent, z10);
        }

        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider appConfigurationProvider, Bundle notificationExtras, Bundle brazeExtras) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(appConfigurationProvider, "appConfigurationProvider");
            AbstractC4862t.e(notificationExtras, "notificationExtras");
            AbstractC4862t.e(brazeExtras, "brazeExtras");
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider appConfigurationProvider, Context context, final Intent intent) {
            AbstractC4862t.e(appConfigurationProvider, "appConfigurationProvider");
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.h1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$4(intent);
                }
            }, 6, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.k1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$6();
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.i1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$5();
                }
            }, 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            final String stringExtra = intent.getStringExtra("error");
            final String stringExtra2 = intent.getStringExtra("error_description");
            final String stringExtra3 = intent.getStringExtra("registration_id");
            final String stringExtra4 = intent.getStringExtra("unregistered");
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.l1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$7(stringExtra, stringExtra2);
                    }
                }, 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.m1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$8(stringExtra3);
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.n1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$9(stringExtra4);
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.o1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$10();
                }
            }, 6, (Object) null);
            return false;
        }

        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            Companion companion;
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.r1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11();
                    }
                }, 7, (Object) null);
                return false;
            }
            if (AbstractC4862t.a("deleted_messages", intent.getStringExtra("message_type"))) {
                final int intExtra = intent.getIntExtra("total_deleted", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.w1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$12(intExtra);
                    }
                }, 6, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f28626I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.Z0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$13(extras);
                }
            }, 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle(SentryBaseEvent.JsonKeys.EXTRA, attachedBrazeExtras);
            if (!extras.containsKey("braze_push_received_timestamp")) {
                extras.putLong("braze_push_received_timestamp", DateTimeUtils.nowInMilliseconds());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            final BrazeNotificationPayload brazeNotificationPayloadCreatePayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (brazeNotificationPayloadCreatePayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.a1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$14();
                    }
                }, 6, (Object) null);
                return false;
            }
            final String pushUniqueId = brazeNotificationPayloadCreatePayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) BrazePushReceiver.INSTANCE, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.b1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$16$lambda$15(pushUniqueId);
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(brazeNotificationPayloadCreatePayload);
            if (brazeNotificationPayloadCreatePayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.c1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$17();
                    }
                }, 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.v1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$26();
                    }
                }, 7, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.d1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$18();
                }
            }, 7, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(brazeNotificationPayloadCreatePayload);
            extras.putInt("nid", notificationId);
            if (brazeNotificationPayloadCreatePayload.getIsPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.e1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$19();
                        }
                    }, 7, (Object) null);
                    return false;
                }
                if (!extras.containsKey("braze_story_newly_received")) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.f1
                        @Override // vc.InterfaceC6082a
                        public final Object invoke() {
                            return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$20();
                        }
                    }, 7, (Object) null);
                    extras.putBoolean("braze_story_newly_received", true);
                }
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.g1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$21(brazeNotificationPayloadCreatePayload);
                }
            }, 6, (Object) null);
            Notification notificationCreateNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(brazeNotificationPayloadCreatePayload);
            if (notificationCreateNotification == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.s1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$22();
                    }
                }, 7, (Object) null);
                return false;
            }
            final NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
            AbstractC4862t.d(notificationManagerCompatFrom, "from(...)");
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.t1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$23(notificationManagerCompatFrom);
                }
            }, 7, (Object) null);
            if (L0.a.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                notificationManagerCompatFrom.notify("appboy_notification", notificationId, notificationCreateNotification);
                companion = this;
            } else {
                companion = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.u1
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$24();
                    }
                }, 7, (Object) null);
            }
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = brazeNotificationPayloadCreatePayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            companion.logNotificationMetadata$android_sdk_ui_release(context, brazeNotificationPayloadCreatePayload);
            return true;
        }

        public final void handleReceivedIntent(Context context, Intent intent, boolean runOnThread) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(intent, "intent");
            if (runOnThread) {
                AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3, null);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload payload) {
            String campaignId;
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(payload, "payload");
            if (payload.getIsPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long jF = k.f(payload.getFlushMinMinutes(), 0L);
                long jF2 = k.f(payload.getFlushMaxMinutes(), jF);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(jF);
                if (jF2 > jF) {
                    millis = AbstractC6558c.f48885a.g(millis, timeUnit.toMillis(jF2));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        Companion.handleReceivedIntent$default(INSTANCE, context, intent, false, 4, null);
    }
}
