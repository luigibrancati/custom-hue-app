package com.hiennv.flutter_callkit_incoming;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import gc.C4179C;
import gc.C4206t;
import io.sentry.protocol.FeatureFlags;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003J)\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationService;", "Landroid/app/Service;", "<init>", "()V", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "getCallkitNotificationManager", "()Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "Landroid/os/Bundle;", "bundle", "Lfc/H;", "showOngoingCallNotification", "(Landroid/os/Bundle;)V", "onCreate", "Landroid/content/Intent;", "intent", "", FeatureFlags.TYPE, "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "p0", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "Companion", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallkitNotificationService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> ActionForeground = C4206t.n(CallkitConstants.ACTION_CALL_START, CallkitConstants.ACTION_CALL_ACCEPT);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationService$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "action", "Landroid/os/Bundle;", "data", "Lfc/H;", "startServiceWithAction", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "stopService", "(Landroid/content/Context;)V", "", "ActionForeground", "Ljava/util/List;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void startServiceWithAction(Context context, String action, Bundle data) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(action, "action");
            Intent intent = new Intent(context, (Class<?>) CallkitNotificationService.class);
            intent.setAction(action);
            intent.putExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA, data);
            if (!C4179C.Y(CallkitNotificationService.ActionForeground, intent.getAction())) {
                context.startService(intent);
            } else if (data != null) {
                if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW, true)) {
                    L0.a.q(context, intent);
                } else {
                    context.startService(intent);
                }
            }
        }

        public final void stopService(Context context) {
            AbstractC4862t.e(context, "context");
            context.stopService(new Intent(context, (Class<?>) CallkitNotificationService.class));
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

    @SuppressLint({"MissingPermission"})
    private final void showOngoingCallNotification(Bundle bundle) {
        CallkitNotificationManager callkitNotificationManager = getCallkitNotificationManager();
        CallkitNotification onGoingCallNotification = callkitNotificationManager != null ? callkitNotificationManager.getOnGoingCallNotification(bundle, Boolean.FALSE) : null;
        if (onGoingCallNotification != null) {
            startForeground(onGoingCallNotification.getId(), onGoingCallNotification.getNotification(), 4);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent p02) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Bundle bundleExtra;
        Bundle bundleExtra2;
        if ((intent != null ? intent.getAction() : null) == CallkitConstants.ACTION_CALL_START && (bundleExtra2 = intent.getBundleExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA)) != null) {
            if (bundleExtra2.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW, true)) {
                CallkitNotificationManager callkitNotificationManager = getCallkitNotificationManager();
                if (callkitNotificationManager != null) {
                    callkitNotificationManager.createNotificationChanel(bundleExtra2);
                }
                showOngoingCallNotification(bundleExtra2);
            } else {
                stopSelf();
            }
        }
        if ((intent != null ? intent.getAction() : null) == CallkitConstants.ACTION_CALL_ACCEPT && (bundleExtra = intent.getBundleExtra(CallkitConstants.EXTRA_CALLKIT_INCOMING_DATA)) != null) {
            CallkitNotificationManager callkitNotificationManager2 = getCallkitNotificationManager();
            if (callkitNotificationManager2 != null) {
                callkitNotificationManager2.clearIncomingNotification(bundleExtra, true);
            }
            if (bundleExtra.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW, true)) {
                showOngoingCallNotification(bundleExtra);
            } else {
                stopSelf();
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        stopForeground(1);
        stopSelf();
    }
}
