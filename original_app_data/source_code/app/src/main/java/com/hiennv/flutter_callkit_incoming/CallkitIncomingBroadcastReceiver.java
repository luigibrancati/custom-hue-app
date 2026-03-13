package com.hiennv.flutter_callkit_incoming;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.hiennv.flutter_callkit_incoming.CallkitEventCallback;
import fc.AbstractC4040w;
import gc.Q;
import io.sentry.ProfileChunk;
import io.sentry.SentryBaseEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "getCallkitNotificationManager", "()Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "", "event", "Landroid/os/Bundle;", "data", "Lfc/H;", "sendEventFlutter", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallkitIncomingBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CallkitIncomingReceiver";
    private static boolean silenceEvents;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitIncomingBroadcastReceiver$Companion;", "", "<init>", "()V", "TAG", "", "silenceEvents", "", "getSilenceEvents", "()Z", "setSilenceEvents", "(Z)V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "data", "Landroid/os/Bundle;", "getIntentIncoming", "getIntentStart", "getIntentAccept", "getIntentDecline", "getIntentEnded", "getIntentTimeout", "getIntentCallback", "getIntentHeldByCell", "getIntentUnHeldByCell", "getIntentConnected", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Intent getIntent(Context context, String action, Bundle data) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(action, "action");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + '.' + action);
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentAccept(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_ACCEPT");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentCallback(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_CALLBACK");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentConnected(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_CONNECTED");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentDecline(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_DECLINE");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentEnded(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_ENDED");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentHeldByCell(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_HELD");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentIncoming(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_INCOMING");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentStart(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_START");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentTimeout(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_TIMEOUT");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final Intent getIntentUnHeldByCell(Context context, Bundle data) {
            AbstractC4862t.e(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallkitIncomingBroadcastReceiver.class);
            intent.setAction(context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_UNHELD");
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            return intent;
        }

        public final boolean getSilenceEvents() {
            return CallkitIncomingBroadcastReceiver.silenceEvents;
        }

        public final void setSilenceEvents(boolean z10) {
            CallkitIncomingBroadcastReceiver.silenceEvents = z10;
        }

        private Companion() {
        }
    }

    private final CallkitNotificationManager getCallkitNotificationManager() {
        FlutterCallkitIncomingPlugin companion = FlutterCallkitIncomingPlugin.INSTANCE.getInstance();
        if (companion != null) {
            return companion.getCallkitNotificationManager();
        }
        return null;
    }

    private final void sendEventFlutter(String event, Bundle data) {
        if (silenceEvents) {
            return;
        }
        Map mapL = Q.l(AbstractC4040w.a("isCustomNotification", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_NOTIFICATION, false))), AbstractC4040w.a("isCustomSmallExNotification", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_SMALL_EX_NOTIFICATION, false))), AbstractC4040w.a("ringtonePath", data.getString(CallkitConstants.EXTRA_CALLKIT_RINGTONE_PATH, "")), AbstractC4040w.a("backgroundColor", data.getString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_COLOR, "")), AbstractC4040w.a("backgroundUrl", data.getString(CallkitConstants.EXTRA_CALLKIT_BACKGROUND_URL, "")), AbstractC4040w.a("actionColor", data.getString(CallkitConstants.EXTRA_CALLKIT_ACTION_COLOR, "")), AbstractC4040w.a("textColor", data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_COLOR, "")), AbstractC4040w.a("incomingCallNotificationChannelName", data.getString(CallkitConstants.EXTRA_CALLKIT_INCOMING_CALL_NOTIFICATION_CHANNEL_NAME, "")), AbstractC4040w.a("missedCallNotificationChannelName", data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_NOTIFICATION_CHANNEL_NAME, "")), AbstractC4040w.a("isImportant", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_IMPORTANT, true))), AbstractC4040w.a("isBot", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_BOT, false))));
        FlutterCallkitIncomingPlugin.INSTANCE.sendEvent(event, Q.l(AbstractC4040w.a("id", data.getString(CallkitConstants.EXTRA_CALLKIT_ID, "")), AbstractC4040w.a("nameCaller", data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, "")), AbstractC4040w.a("avatar", data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "")), AbstractC4040w.a("number", data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, "")), AbstractC4040w.a("type", Integer.valueOf(data.getInt(CallkitConstants.EXTRA_CALLKIT_TYPE, 0))), AbstractC4040w.a("duration", Long.valueOf(data.getLong(CallkitConstants.EXTRA_CALLKIT_DURATION, 0L))), AbstractC4040w.a("textAccept", data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_ACCEPT, "")), AbstractC4040w.a("textDecline", data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_DECLINE, "")), AbstractC4040w.a(SentryBaseEvent.JsonKeys.EXTRA, data.getSerializable(CallkitConstants.EXTRA_CALLKIT_EXTRA)), AbstractC4040w.a("missedCallNotification", Q.l(AbstractC4040w.a("id", Integer.valueOf(data.getInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_ID))), AbstractC4040w.a("showNotification", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SHOW))), AbstractC4040w.a("count", Integer.valueOf(data.getInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_COUNT))), AbstractC4040w.a("subtitle", data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SUBTITLE)), AbstractC4040w.a("callbackText", data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_TEXT)), AbstractC4040w.a("isShowCallback", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_SHOW))))), AbstractC4040w.a("callingNotification", Q.l(AbstractC4040w.a("id", data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_ID)), AbstractC4040w.a("showNotification", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW))), AbstractC4040w.a("subtitle", data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_SUBTITLE)), AbstractC4040w.a("callbackText", data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_TEXT)), AbstractC4040w.a("isShowCallback", Boolean.valueOf(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_SHOW))))), AbstractC4040w.a(ProfileChunk.PLATFORM_ANDROID, mapL)));
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"MissingPermission"})
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        Bundle bundle;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        String action = intent.getAction();
        if (action == null || (extras = intent.getExtras()) == null || (bundle = extras.getBundle(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA)) == null) {
            return;
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_INCOMING")) {
            try {
                CallkitNotificationManager callkitNotificationManager = getCallkitNotificationManager();
                if (callkitNotificationManager != null) {
                    callkitNotificationManager.showIncomingNotification(bundle);
                }
                sendEventFlutter(CallkitConstants.ACTION_CALL_INCOMING, bundle);
                SharedPreferencesUtilsKt.addCall$default(context, Data.INSTANCE.fromBundle(bundle), false, 4, null);
                return;
            } catch (Exception e10) {
                Log.e(TAG, null, e10);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_START")) {
            try {
                CallkitNotificationService.INSTANCE.startServiceWithAction(context, CallkitConstants.ACTION_CALL_START, bundle);
                sendEventFlutter(CallkitConstants.ACTION_CALL_START, bundle);
                SharedPreferencesUtilsKt.addCall(context, Data.INSTANCE.fromBundle(bundle), true);
                return;
            } catch (Exception e11) {
                Log.e(TAG, null, e11);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_ACCEPT")) {
            try {
                FlutterCallkitIncomingPlugin.INSTANCE.notifyEventCallbacks$flutter_callkit_incoming_release(CallkitEventCallback.CallEvent.ACCEPT, bundle);
                CallkitNotificationService.INSTANCE.startServiceWithAction(context, CallkitConstants.ACTION_CALL_ACCEPT, bundle);
                sendEventFlutter(CallkitConstants.ACTION_CALL_ACCEPT, bundle);
                SharedPreferencesUtilsKt.addCall(context, Data.INSTANCE.fromBundle(bundle), true);
                return;
            } catch (Exception e12) {
                Log.e(TAG, null, e12);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_DECLINE")) {
            try {
                FlutterCallkitIncomingPlugin.INSTANCE.notifyEventCallbacks$flutter_callkit_incoming_release(CallkitEventCallback.CallEvent.DECLINE, bundle);
                CallkitNotificationManager callkitNotificationManager2 = getCallkitNotificationManager();
                if (callkitNotificationManager2 != null) {
                    callkitNotificationManager2.clearIncomingNotification(bundle, false);
                }
                sendEventFlutter(CallkitConstants.ACTION_CALL_DECLINE, bundle);
                SharedPreferencesUtilsKt.removeCall(context, Data.INSTANCE.fromBundle(bundle));
                return;
            } catch (Exception e13) {
                Log.e(TAG, null, e13);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_ENDED")) {
            try {
                CallkitNotificationManager callkitNotificationManager3 = getCallkitNotificationManager();
                if (callkitNotificationManager3 != null) {
                    callkitNotificationManager3.clearIncomingNotification(bundle, false);
                }
                CallkitNotificationService.INSTANCE.stopService(context);
                sendEventFlutter(CallkitConstants.ACTION_CALL_ENDED, bundle);
                SharedPreferencesUtilsKt.removeCall(context, Data.INSTANCE.fromBundle(bundle));
                return;
            } catch (Exception e14) {
                Log.e(TAG, null, e14);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_TIMEOUT")) {
            try {
                CallkitNotificationManager callkitNotificationManager4 = getCallkitNotificationManager();
                if (callkitNotificationManager4 != null) {
                    callkitNotificationManager4.clearIncomingNotification(bundle, false);
                }
                if (callkitNotificationManager4 != null) {
                    callkitNotificationManager4.showMissCallNotification(bundle);
                }
                sendEventFlutter(CallkitConstants.ACTION_CALL_TIMEOUT, bundle);
                SharedPreferencesUtilsKt.removeCall(context, Data.INSTANCE.fromBundle(bundle));
                return;
            } catch (Exception e15) {
                Log.e(TAG, null, e15);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_CONNECTED")) {
            try {
                CallkitNotificationManager callkitNotificationManager5 = getCallkitNotificationManager();
                if (callkitNotificationManager5 != null) {
                    callkitNotificationManager5.showOngoingCallNotification(bundle, Boolean.TRUE);
                }
                sendEventFlutter(CallkitConstants.ACTION_CALL_CONNECTED, bundle);
                return;
            } catch (Exception e16) {
                Log.e(TAG, null, e16);
                return;
            }
        }
        if (AbstractC4862t.a(action, context.getPackageName() + ".com.hiennv.flutter_callkit_incoming.ACTION_CALL_CALLBACK")) {
            try {
                CallkitNotificationManager callkitNotificationManager6 = getCallkitNotificationManager();
                if (callkitNotificationManager6 != null) {
                    callkitNotificationManager6.clearMissCallNotification(bundle);
                }
                sendEventFlutter(CallkitConstants.ACTION_CALL_CALLBACK, bundle);
            } catch (Exception e17) {
                Log.e(TAG, null, e17);
            }
        }
    }
}
