package com.hiennv.flutter_callkit_incoming;

import Od.C;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import androidx.appcompat.app.a;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import androidx.core.app.u;
import fc.C4015H;
import io.sentry.protocol.SentryStackFrame;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 p2\u00020\u0001:\u0002pqB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\fJ!\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0014\u0010\u0010J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010$J\u001f\u0010'\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010$J\u001f\u0010(\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010$J\u001f\u0010)\u001a\u00020\"2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010$J\u001f\u0010*\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010$J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J1\u00106\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u001c2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b;\u0010<J%\u0010>\u001a\u0004\u0018\u0001082\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\r¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bC\u0010<J\u0015\u0010D\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\bE\u0010<J!\u0010F\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010=\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bF\u0010GJ+\u0010J\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u0001002\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010H¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\r¢\u0006\u0004\bN\u0010 J'\u0010R\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u0001002\u0006\u0010O\u001a\u00020\b2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0019¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010VR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010WR\"\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010[\u001a\b\u0018\u00010ZR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0018\u0010g\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010aR\u0018\u0010h\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010aR\u0018\u0010i\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010j¨\u0006r"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "", "Landroid/content/Context;", "context", "Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;", "callkitSoundPlayerManager", "<init>", "(Landroid/content/Context;Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;)V", "", "notificationId", "Lcom/hiennv/flutter_callkit_incoming/SafeTarget;", "createInComingAvatarTargetDefault", "(I)Lcom/hiennv/flutter_callkit_incoming/SafeTarget;", "", "isCallStyle", "createInComingAvatarTargetCustom", "(IZ)Lcom/hiennv/flutter_callkit_incoming/SafeTarget;", "createMissingAvatarTargetDefault", "createMissingAvatarTargetCustom", "createOnGoingAvatarTargetDefault", "createOnGoingAvatarTargetCustom", "Landroid/widget/RemoteViews;", "remoteViews", "Landroid/os/Bundle;", "data", "Lfc/H;", "initInComingNotificationViews", "(ILandroid/widget/RemoteViews;Landroid/os/Bundle;)V", "", "getSystemFormattedTime", "(Landroid/content/Context;)Ljava/lang/String;", "incomingChannelEnabled", "()Z", "id", "Landroid/app/PendingIntent;", "getAcceptPendingIntent", "(ILandroid/os/Bundle;)Landroid/app/PendingIntent;", "getDeclinePendingIntent", "getTimeOutPendingIntent", "getCallbackPendingIntent", "getActivityPendingIntent", "getAppPendingIntent", "getHangupPendingIntent", "getFlagPendingIntent", "()I", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManager", "()Landroidx/core/app/NotificationManagerCompat;", "Landroid/app/Activity;", "activity", "title", "message", "Landroid/content/DialogInterface$OnClickListener;", "okListener", "showDialogMessage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotification;", "getIncomingNotification", "(Landroid/os/Bundle;)Lcom/hiennv/flutter_callkit_incoming/CallkitNotification;", "showMissCallNotification", "(Landroid/os/Bundle;)V", "isConnected", "getOnGoingCallNotification", "(Landroid/os/Bundle;Ljava/lang/Boolean;)Lcom/hiennv/flutter_callkit_incoming/CallkitNotification;", "isAccepted", "clearIncomingNotification", "(Landroid/os/Bundle;Z)V", "clearMissCallNotification", "createNotificationChanel", "showIncomingNotification", "showOngoingCallNotification", "(Landroid/os/Bundle;Ljava/lang/Boolean;)V", "", "map", "requestNotificationPermission", "(Landroid/app/Activity;Ljava/util/Map;)V", "requestFullIntentPermission", "(Landroid/app/Activity;)V", "canUseFullScreenIntent", "requestCode", "", "grantResults", "onRequestPermissionsResult", "(Landroid/app/Activity;I[I)V", "destroy", "()V", "Landroid/content/Context;", "Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;", "dataNotificationPermission", "Ljava/util/Map;", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager$VolumeKeyBroadcastReceiver;", "volumeKeyReceiver", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager$VolumeKeyBroadcastReceiver;", "Landroidx/core/app/m$e;", "notificationBuilder", "Landroidx/core/app/m$e;", "notificationViews", "Landroid/widget/RemoteViews;", "notificationSmallViews", "notificationMissingBuilder", "notificationMissingViews", "notificationMissingSmallViews", "notificationOngoingBuilder", "notificationOngoingViews", "notificationOngoingSmallViews", "targetInComingAvatarDefault", "Lcom/hiennv/flutter_callkit_incoming/SafeTarget;", "targetInComingAvatarCustom", "targetMissingAvatarDefault", "targetMissingAvatarCustom", "targetOnGoingAvatarDefault", "targetOnGoingAvatarCustom", "Companion", "VolumeKeyBroadcastReceiver", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallkitNotificationManager {
    public static final String EXTRA_TIME_START_CALL = "EXTRA_TIME_START_CALL";
    public static final String NOTIFICATION_CHANNEL_ID_INCOMING = "callkit_incoming_channel_id";
    public static final String NOTIFICATION_CHANNEL_ID_MISSED = "callkit_missed_channel_id";
    public static final String NOTIFICATION_CHANNEL_ID_ONGOING = "callkit_ongoing_channel_id";
    public static final int PERMISSION_NOTIFICATION_REQUEST_CODE = 6969;
    private final CallkitSoundPlayerManager callkitSoundPlayerManager;
    private final Context context;
    private Map<String, ? extends Object> dataNotificationPermission;
    private m.e notificationBuilder;
    private m.e notificationMissingBuilder;
    private RemoteViews notificationMissingSmallViews;
    private RemoteViews notificationMissingViews;
    private m.e notificationOngoingBuilder;
    private RemoteViews notificationOngoingSmallViews;
    private RemoteViews notificationOngoingViews;
    private RemoteViews notificationSmallViews;
    private RemoteViews notificationViews;
    private SafeTarget targetInComingAvatarCustom;
    private SafeTarget targetInComingAvatarDefault;
    private SafeTarget targetMissingAvatarCustom;
    private SafeTarget targetMissingAvatarDefault;
    private SafeTarget targetOnGoingAvatarCustom;
    private SafeTarget targetOnGoingAvatarDefault;
    private VolumeKeyBroadcastReceiver volumeKeyReceiver;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager$VolumeKeyBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class VolumeKeyBroadcastReceiver extends BroadcastReceiver {
        public VolumeKeyBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CallkitSoundPlayerManager callkitSoundPlayerManager;
            if (AbstractC4862t.a(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION") && (callkitSoundPlayerManager = CallkitNotificationManager.this.callkitSoundPlayerManager) != null && callkitSoundPlayerManager.getIsPlaying()) {
                CallkitNotificationManager.this.callkitSoundPlayerManager.stop();
            }
        }
    }

    public CallkitNotificationManager(Context context, CallkitSoundPlayerManager callkitSoundPlayerManager) {
        AbstractC4862t.e(context, "context");
        this.context = context;
        this.callkitSoundPlayerManager = callkitSoundPlayerManager;
        this.dataNotificationPermission = new HashMap();
    }

    @SuppressLint({"MissingPermission"})
    private final SafeTarget createInComingAvatarTargetCustom(final int notificationId, final boolean isCallStyle) {
        return new SafeTarget(notificationId, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.m
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CallkitNotificationManager.createInComingAvatarTargetCustom$lambda$3(this.f32392a, isCallStyle, notificationId, (Bitmap) obj);
            }
        }) { // from class: com.hiennv.flutter_callkit_incoming.CallkitNotificationManager.createInComingAvatarTargetCustom.1
        };
    }

    public static /* synthetic */ SafeTarget createInComingAvatarTargetCustom$default(CallkitNotificationManager callkitNotificationManager, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return callkitNotificationManager.createInComingAvatarTargetCustom(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H createInComingAvatarTargetCustom$lambda$3(CallkitNotificationManager callkitNotificationManager, boolean z10, int i10, Bitmap bitmap) {
        m.e eVar;
        AbstractC4862t.e(bitmap, "bitmap");
        RemoteViews remoteViews = callkitNotificationManager.notificationViews;
        if (remoteViews != null) {
            remoteViews.setImageViewBitmap(R.id.ivAvatar, bitmap);
        }
        RemoteViews remoteViews2 = callkitNotificationManager.notificationViews;
        if (remoteViews2 != null) {
            remoteViews2.setViewVisibility(R.id.ivAvatar, 0);
        }
        RemoteViews remoteViews3 = callkitNotificationManager.notificationSmallViews;
        if (remoteViews3 != null) {
            remoteViews3.setImageViewBitmap(R.id.ivAvatar, bitmap);
        }
        RemoteViews remoteViews4 = callkitNotificationManager.notificationSmallViews;
        if (remoteViews4 != null) {
            remoteViews4.setViewVisibility(R.id.ivAvatar, 0);
        }
        if (z10 && (eVar = callkitNotificationManager.notificationBuilder) != null) {
            eVar.z(bitmap);
        }
        m.e eVar2 = callkitNotificationManager.notificationBuilder;
        if (eVar2 != null) {
            callkitNotificationManager.getNotificationManager().notify(i10, eVar2.d());
        }
        return C4015H.f34254a;
    }

    @SuppressLint({"MissingPermission"})
    private final SafeTarget createInComingAvatarTargetDefault(final int notificationId) {
        return new SafeTarget(notificationId, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.e
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CallkitNotificationManager.createInComingAvatarTargetDefault$lambda$1(this.f32377a, notificationId, (Bitmap) obj);
            }
        }) { // from class: com.hiennv.flutter_callkit_incoming.CallkitNotificationManager.createInComingAvatarTargetDefault.1
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H createInComingAvatarTargetDefault$lambda$1(CallkitNotificationManager callkitNotificationManager, int i10, Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        m.e eVar = callkitNotificationManager.notificationBuilder;
        if (eVar != null) {
            eVar.z(bitmap);
        }
        m.e eVar2 = callkitNotificationManager.notificationBuilder;
        if (eVar2 != null) {
            callkitNotificationManager.getNotificationManager().notify(i10, eVar2.d());
        }
        return C4015H.f34254a;
    }

    @SuppressLint({"MissingPermission"})
    private final SafeTarget createMissingAvatarTargetCustom(final int notificationId) {
        return new SafeTarget(notificationId, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.l
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CallkitNotificationManager.createMissingAvatarTargetCustom$lambda$7(this.f32390a, notificationId, (Bitmap) obj);
            }
        }) { // from class: com.hiennv.flutter_callkit_incoming.CallkitNotificationManager.createMissingAvatarTargetCustom.1
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H createMissingAvatarTargetCustom$lambda$7(CallkitNotificationManager callkitNotificationManager, int i10, Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        RemoteViews remoteViews = callkitNotificationManager.notificationMissingViews;
        if (remoteViews != null) {
            remoteViews.setImageViewBitmap(R.id.ivAvatar, bitmap);
        }
        RemoteViews remoteViews2 = callkitNotificationManager.notificationMissingViews;
        if (remoteViews2 != null) {
            remoteViews2.setViewVisibility(R.id.ivAvatar, 0);
        }
        RemoteViews remoteViews3 = callkitNotificationManager.notificationMissingSmallViews;
        if (remoteViews3 != null) {
            remoteViews3.setImageViewBitmap(R.id.ivAvatar, bitmap);
        }
        RemoteViews remoteViews4 = callkitNotificationManager.notificationMissingSmallViews;
        if (remoteViews4 != null) {
            remoteViews4.setViewVisibility(R.id.ivAvatar, 0);
        }
        m.e eVar = callkitNotificationManager.notificationMissingBuilder;
        if (eVar != null) {
            eVar.F(2);
        }
        m.e eVar2 = callkitNotificationManager.notificationMissingBuilder;
        if (eVar2 != null) {
            callkitNotificationManager.getNotificationManager().notify(i10, eVar2.d());
        }
        return C4015H.f34254a;
    }

    @SuppressLint({"MissingPermission"})
    private final SafeTarget createMissingAvatarTargetDefault(final int notificationId) {
        return new SafeTarget(notificationId, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.k
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CallkitNotificationManager.createMissingAvatarTargetDefault$lambda$5(this.f32388a, notificationId, (Bitmap) obj);
            }
        }) { // from class: com.hiennv.flutter_callkit_incoming.CallkitNotificationManager.createMissingAvatarTargetDefault.1
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H createMissingAvatarTargetDefault$lambda$5(CallkitNotificationManager callkitNotificationManager, int i10, Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        m.e eVar = callkitNotificationManager.notificationMissingBuilder;
        if (eVar != null) {
            eVar.z(bitmap);
        }
        m.e eVar2 = callkitNotificationManager.notificationMissingBuilder;
        if (eVar2 != null) {
            eVar2.F(2);
        }
        m.e eVar3 = callkitNotificationManager.notificationMissingBuilder;
        if (eVar3 != null) {
            callkitNotificationManager.getNotificationManager().notify(i10, eVar3.d());
        }
        return C4015H.f34254a;
    }

    @SuppressLint({"MissingPermission"})
    private final SafeTarget createOnGoingAvatarTargetCustom(final int notificationId, final boolean isCallStyle) {
        return new SafeTarget(notificationId, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.g
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CallkitNotificationManager.createOnGoingAvatarTargetCustom$lambda$11(this.f32381a, isCallStyle, notificationId, (Bitmap) obj);
            }
        }) { // from class: com.hiennv.flutter_callkit_incoming.CallkitNotificationManager.createOnGoingAvatarTargetCustom.1
        };
    }

    public static /* synthetic */ SafeTarget createOnGoingAvatarTargetCustom$default(CallkitNotificationManager callkitNotificationManager, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return callkitNotificationManager.createOnGoingAvatarTargetCustom(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H createOnGoingAvatarTargetCustom$lambda$11(CallkitNotificationManager callkitNotificationManager, boolean z10, int i10, Bitmap bitmap) {
        m.e eVar;
        AbstractC4862t.e(bitmap, "bitmap");
        RemoteViews remoteViews = callkitNotificationManager.notificationOngoingViews;
        if (remoteViews != null) {
            remoteViews.setImageViewBitmap(R.id.ivAvatar, bitmap);
        }
        RemoteViews remoteViews2 = callkitNotificationManager.notificationOngoingViews;
        if (remoteViews2 != null) {
            remoteViews2.setViewVisibility(R.id.ivAvatar, 0);
        }
        RemoteViews remoteViews3 = callkitNotificationManager.notificationOngoingSmallViews;
        if (remoteViews3 != null) {
            remoteViews3.setImageViewBitmap(R.id.ivAvatar, bitmap);
        }
        RemoteViews remoteViews4 = callkitNotificationManager.notificationOngoingSmallViews;
        if (remoteViews4 != null) {
            remoteViews4.setViewVisibility(R.id.ivAvatar, 0);
        }
        if (z10 && (eVar = callkitNotificationManager.notificationOngoingBuilder) != null) {
            eVar.z(bitmap);
        }
        m.e eVar2 = callkitNotificationManager.notificationOngoingBuilder;
        if (eVar2 != null) {
            callkitNotificationManager.getNotificationManager().notify(i10, eVar2.d());
        }
        return C4015H.f34254a;
    }

    @SuppressLint({"MissingPermission"})
    private final SafeTarget createOnGoingAvatarTargetDefault(final int notificationId) {
        return new SafeTarget(notificationId, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.f
            @Override // vc.l
            public final Object invoke(Object obj) {
                return CallkitNotificationManager.createOnGoingAvatarTargetDefault$lambda$9(this.f32379a, notificationId, (Bitmap) obj);
            }
        }) { // from class: com.hiennv.flutter_callkit_incoming.CallkitNotificationManager.createOnGoingAvatarTargetDefault.1
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H createOnGoingAvatarTargetDefault$lambda$9(CallkitNotificationManager callkitNotificationManager, int i10, Bitmap bitmap) {
        AbstractC4862t.e(bitmap, "bitmap");
        m.e eVar = callkitNotificationManager.notificationOngoingBuilder;
        if (eVar != null) {
            eVar.z(bitmap);
        }
        m.e eVar2 = callkitNotificationManager.notificationOngoingBuilder;
        if (eVar2 != null) {
            callkitNotificationManager.getNotificationManager().notify(i10, eVar2.d());
        }
        return C4015H.f34254a;
    }

    private final PendingIntent getAcceptPendingIntent(int id2, Bundle data) {
        PendingIntent activity = PendingIntent.getActivity(this.context, id2, TransparentActivity.INSTANCE.getIntent(this.context, CallkitConstants.ACTION_CALL_ACCEPT, data), getFlagPendingIntent());
        AbstractC4862t.d(activity, "getActivity(...)");
        return activity;
    }

    private final PendingIntent getActivityPendingIntent(int id2, Bundle data) {
        PendingIntent activity = PendingIntent.getActivity(this.context, id2, CallkitIncomingActivity.INSTANCE.getIntent(this.context, data), getFlagPendingIntent());
        AbstractC4862t.d(activity, "getActivity(...)");
        return activity;
    }

    private final PendingIntent getAppPendingIntent(int id2, Bundle data) {
        PendingIntent activity = PendingIntent.getActivity(this.context, id2, AppUtils.getAppIntent$default(AppUtils.INSTANCE, this.context, null, data, 2, null), getFlagPendingIntent());
        AbstractC4862t.d(activity, "getActivity(...)");
        return activity;
    }

    private final PendingIntent getCallbackPendingIntent(int id2, Bundle data) {
        PendingIntent activity = PendingIntent.getActivity(this.context, id2, TransparentActivity.INSTANCE.getIntent(this.context, CallkitConstants.ACTION_CALL_CALLBACK, data), getFlagPendingIntent());
        AbstractC4862t.d(activity, "getActivity(...)");
        return activity;
    }

    private final PendingIntent getDeclinePendingIntent(int id2, Bundle data) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, id2, CallkitIncomingBroadcastReceiver.INSTANCE.getIntentDecline(this.context, data), getFlagPendingIntent());
        AbstractC4862t.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final int getFlagPendingIntent() {
        return 201326592;
    }

    private final PendingIntent getHangupPendingIntent(int notificationId, Bundle data) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, notificationId, CallkitIncomingBroadcastReceiver.INSTANCE.getIntentEnded(this.context, data), getFlagPendingIntent());
        AbstractC4862t.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final NotificationManagerCompat getNotificationManager() {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this.context);
        AbstractC4862t.d(notificationManagerCompatFrom, "from(...)");
        return notificationManagerCompatFrom;
    }

    public static /* synthetic */ CallkitNotification getOnGoingCallNotification$default(CallkitNotificationManager callkitNotificationManager, Bundle bundle, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return callkitNotificationManager.getOnGoingCallNotification(bundle, bool);
    }

    private final String getSystemFormattedTime(Context context) {
        String str = DateFormat.getTimeFormat(context).format(new Date(System.currentTimeMillis()));
        AbstractC4862t.d(str, "format(...)");
        return str;
    }

    private final PendingIntent getTimeOutPendingIntent(int id2, Bundle data) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, id2, CallkitIncomingBroadcastReceiver.INSTANCE.getIntentTimeout(this.context, data), getFlagPendingIntent());
        AbstractC4862t.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private final boolean incomingChannelEnabled() {
        NotificationManagerCompat notificationManager = getNotificationManager();
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NOTIFICATION_CHANNEL_ID_INCOMING);
        return notificationManager.areNotificationsEnabled() && notificationChannel != null && notificationChannel.getImportance() > 0;
    }

    private final void initInComingNotificationViews(int notificationId, RemoteViews remoteViews, Bundle data) {
        remoteViews.setTextViewText(R.id.tvNameCaller, data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
        if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false)) {
            remoteViews.setTextViewText(R.id.tvNumber, data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
        }
        remoteViews.setOnClickPendingIntent(R.id.llDecline, getDeclinePendingIntent(notificationId, data));
        String string = data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_DECLINE, "");
        int i10 = R.id.tvDecline;
        if (TextUtils.isEmpty(string)) {
            string = this.context.getString(R.string.text_decline);
        }
        remoteViews.setTextViewText(i10, string);
        remoteViews.setOnClickPendingIntent(R.id.llAccept, getAcceptPendingIntent(notificationId, data));
        String string2 = data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_ACCEPT, "");
        int i11 = R.id.tvAccept;
        if (TextUtils.isEmpty(string2)) {
            string2 = this.context.getString(R.string.text_accept);
        }
        remoteViews.setTextViewText(i11, string2);
        String string3 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
        if (string3 == null || string3.length() == 0) {
            return;
        }
        if (!C.N(string3, "http://", true) && !C.N(string3, "https://", true)) {
            S s10 = S.f39781a;
            string3 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string3}, 1));
            AbstractC4862t.d(string3, "format(...)");
        }
        Serializable serializable = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
        AbstractC4862t.c(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
        HashMap<String, Object> map = (HashMap) serializable;
        if (this.targetInComingAvatarCustom == null) {
            this.targetInComingAvatarCustom = createInComingAvatarTargetCustom(notificationId, false);
        }
        ImageLoaderProvider.INSTANCE.loadImage(this.context, string3, map, this.targetInComingAvatarCustom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestPermissionsResult$lambda$32$lambda$29(CallkitNotificationManager callkitNotificationManager, Activity activity, DialogInterface dialogInterface, int i10) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        callkitNotificationManager.requestNotificationPermission(activity, callkitNotificationManager.dataNotificationPermission);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestPermissionsResult$lambda$32$lambda$30(Activity activity, DialogInterface dialogInterface, int i10) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity.getPackageName(), null));
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRequestPermissionsResult$lambda$32$lambda$31(Activity activity, DialogInterface dialogInterface, int i10) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity.getPackageName(), null));
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    private final void showDialogMessage(Activity activity, String title, String message, DialogInterface.OnClickListener okListener) {
        if (activity != null) {
            new a.C0270a(activity, R.style.DialogTheme).k(title).f(message).i(android.R.string.ok, okListener).g(android.R.string.cancel, null).a().show();
        }
    }

    public final boolean canUseFullScreenIntent() {
        boolean zCanUseFullScreenIntent = getNotificationManager().canUseFullScreenIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            return zCanUseFullScreenIntent;
        }
        return true;
    }

    public final void clearIncomingNotification(Bundle data, boolean isAccepted) {
        AbstractC4862t.e(data, "data");
        VolumeKeyBroadcastReceiver volumeKeyBroadcastReceiver = this.volumeKeyReceiver;
        if (volumeKeyBroadcastReceiver != null) {
            try {
                this.context.unregisterReceiver(volumeKeyBroadcastReceiver);
            } catch (Exception unused) {
            }
            this.volumeKeyReceiver = null;
        }
        CallkitSoundPlayerManager callkitSoundPlayerManager = this.callkitSoundPlayerManager;
        if (callkitSoundPlayerManager != null) {
            callkitSoundPlayerManager.stop();
        }
        Context context = this.context;
        context.sendBroadcast(CallkitIncomingActivity.INSTANCE.getIntentEnded(context, isAccepted));
        getNotificationManager().cancel(data.getString(CallkitConstants.EXTRA_CALLKIT_ID, "callkit_incoming").hashCode());
        SafeTarget safeTarget = this.targetInComingAvatarDefault;
        if (safeTarget != null) {
            if (safeTarget != null) {
                safeTarget.setCancelled(true);
            }
            this.targetInComingAvatarDefault = null;
        }
        SafeTarget safeTarget2 = this.targetInComingAvatarCustom;
        if (safeTarget2 != null) {
            if (safeTarget2 != null) {
                safeTarget2.setCancelled(true);
            }
            this.targetInComingAvatarCustom = null;
        }
        SafeTarget safeTarget3 = this.targetOnGoingAvatarDefault;
        if (safeTarget3 != null) {
            if (safeTarget3 != null) {
                safeTarget3.setCancelled(true);
            }
            this.targetOnGoingAvatarDefault = null;
        }
        SafeTarget safeTarget4 = this.targetOnGoingAvatarCustom;
        if (safeTarget4 != null) {
            if (safeTarget4 != null) {
                safeTarget4.setCancelled(true);
            }
            this.targetOnGoingAvatarCustom = null;
        }
    }

    public final void clearMissCallNotification(Bundle data) {
        AbstractC4862t.e(data, "data");
        getNotificationManager().cancel(("missing_" + data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_ID, data.getString(CallkitConstants.EXTRA_CALLKIT_ID, "callkit_incoming"))).hashCode());
        SafeTarget safeTarget = this.targetMissingAvatarDefault;
        if (safeTarget != null) {
            if (safeTarget != null) {
                safeTarget.setCancelled(true);
            }
            this.targetMissingAvatarDefault = null;
        }
        SafeTarget safeTarget2 = this.targetMissingAvatarCustom;
        if (safeTarget2 != null) {
            if (safeTarget2 != null) {
                safeTarget2.setCancelled(true);
            }
            this.targetMissingAvatarCustom = null;
        }
    }

    public final void createNotificationChanel(Bundle data) {
        AbstractC4862t.e(data, "data");
        String string = data.getString(CallkitConstants.EXTRA_CALLKIT_INCOMING_CALL_NOTIFICATION_CHANNEL_NAME, "Incoming Call");
        String string2 = data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_NOTIFICATION_CHANNEL_NAME, "Missed Call");
        String string3 = data.getString(CallkitConstants.EXTRA_CALLKIT_ONGOING_CALL_NOTIFICATION_CHANNEL_NAME, "Ongoing Call");
        NotificationManagerCompat notificationManager = getNotificationManager();
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NOTIFICATION_CHANNEL_ID_INCOMING);
        if (notificationChannel != null) {
            notificationChannel.setSound(null, null);
        } else {
            notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID_INCOMING, string, 4);
            notificationChannel.setDescription("");
            notificationChannel.setVibrationPattern(new long[]{0, 1000, 500, 1000, 500});
            notificationChannel.setLightColor(-65536);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setSound(null, null);
        }
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setImportance(4);
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel(NOTIFICATION_CHANNEL_ID_MISSED, string2, 3);
        notificationChannel2.setDescription("");
        notificationChannel2.setVibrationPattern(new long[]{0, 1000});
        notificationChannel2.setLightColor(-65536);
        notificationChannel2.enableLights(true);
        notificationChannel2.enableVibration(true);
        notificationChannel2.setImportance(4);
        notificationManager.createNotificationChannel(notificationChannel2);
        notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_CHANNEL_ID_ONGOING, string3, 2));
    }

    public final void destroy() {
        CallkitSoundPlayerManager callkitSoundPlayerManager = this.callkitSoundPlayerManager;
        if (callkitSoundPlayerManager != null) {
            callkitSoundPlayerManager.destroy();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final CallkitNotification getIncomingNotification(Bundle data) {
        m.e eVar;
        AbstractC4862t.e(data, "data");
        data.putLong(EXTRA_TIME_START_CALL, System.currentTimeMillis());
        int iHashCode = data.getString(CallkitConstants.EXTRA_CALLKIT_ID, "callkit_incoming").hashCode();
        createNotificationChanel(data);
        m.e eVar2 = new m.e(this.context, NOTIFICATION_CHANNEL_ID_INCOMING);
        this.notificationBuilder = eVar2;
        eVar2.i(NOTIFICATION_CHANNEL_ID_INCOMING);
        m.e eVar3 = this.notificationBuilder;
        if (eVar3 != null) {
            eVar3.s(2);
        }
        m.e eVar4 = this.notificationBuilder;
        if (eVar4 != null) {
            eVar4.h("call");
        }
        m.e eVar5 = this.notificationBuilder;
        if (eVar5 != null) {
            eVar5.F(2);
        }
        m.e eVar6 = this.notificationBuilder;
        if (eVar6 != null) {
            eVar6.T(1);
        }
        m.e eVar7 = this.notificationBuilder;
        if (eVar7 != null) {
            eVar7.D(true);
        }
        m.e eVar8 = this.notificationBuilder;
        if (eVar8 != null) {
            eVar8.g(false);
        }
        m.e eVar9 = this.notificationBuilder;
        if (eVar9 != null) {
            eVar9.U(System.currentTimeMillis());
        }
        m.e eVar10 = this.notificationBuilder;
        if (eVar10 != null) {
            eVar10.Q(data.getLong(CallkitConstants.EXTRA_CALLKIT_DURATION, 0L));
        }
        m.e eVar11 = this.notificationBuilder;
        if (eVar11 != null) {
            eVar11.E(true);
        }
        m.e eVar12 = this.notificationBuilder;
        if (eVar12 != null) {
            eVar12.M(null);
        }
        m.e eVar13 = this.notificationBuilder;
        if (eVar13 != null) {
            eVar13.v(getActivityPendingIntent(iHashCode, data), true);
        }
        m.e eVar14 = this.notificationBuilder;
        if (eVar14 != null) {
            eVar14.m(getActivityPendingIntent(iHashCode, data));
        }
        m.e eVar15 = this.notificationBuilder;
        if (eVar15 != null) {
            eVar15.t(getTimeOutPendingIntent(iHashCode, data));
        }
        int i10 = data.getInt(CallkitConstants.EXTRA_CALLKIT_TYPE, -1);
        int i11 = this.context.getApplicationInfo().icon;
        if (i10 > 0) {
            i11 = R.drawable.ic_video;
        } else if (i11 >= 0) {
            i11 = R.drawable.ic_accept;
        }
        m.e eVar16 = this.notificationBuilder;
        if (eVar16 != null) {
            eVar16.L(i11);
        }
        String string = data.getString(CallkitConstants.EXTRA_CALLKIT_ACTION_COLOR, "#4CAF50");
        try {
            m.e eVar17 = this.notificationBuilder;
            if (eVar17 != null) {
                eVar17.k(Color.parseColor(string));
            }
        } catch (Exception unused) {
        }
        m.e eVar18 = this.notificationBuilder;
        if (eVar18 != null) {
            eVar18.i(NOTIFICATION_CHANNEL_ID_INCOMING);
        }
        m.e eVar19 = this.notificationBuilder;
        if (eVar19 != null) {
            eVar19.F(2);
        }
        boolean z10 = data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_NOTIFICATION, false);
        boolean z11 = data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_SMALL_EX_NOTIFICATION, false);
        if (!z10) {
            m.e eVar20 = this.notificationBuilder;
            if (eVar20 != null) {
                eVar20.n(data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
            }
            String string2 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
            if (string2 != null && string2.length() != 0) {
                if (!C.N(string2, "http://", true) && !C.N(string2, "https://", true)) {
                    S s10 = S.f39781a;
                    string2 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string2}, 1));
                    AbstractC4862t.d(string2, "format(...)");
                }
                Serializable serializable = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                AbstractC4862t.c(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                HashMap<String, Object> map = (HashMap) serializable;
                if (this.targetInComingAvatarDefault == null) {
                    this.targetInComingAvatarDefault = createInComingAvatarTargetDefault(iHashCode);
                }
                ImageLoaderProvider.INSTANCE.loadImage(this.context, string2, map, this.targetInComingAvatarDefault);
            }
            String string3 = data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, "");
            if (Build.VERSION.SDK_INT >= 34) {
                u uVarA = new u.b().f(string3).d(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_IMPORTANT, true)).b(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_BOT, false)).a();
                AbstractC4862t.d(uVarA, "build(...)");
                m.e eVar21 = this.notificationBuilder;
                if (eVar21 != null) {
                    eVar21.N(m.f.b(uVarA, getDeclinePendingIntent(iHashCode, data), getAcceptPendingIntent(iHashCode, data)).i(i10 > 0));
                }
            } else {
                m.e eVar22 = this.notificationBuilder;
                if (eVar22 != null) {
                    eVar22.o(string3);
                }
                String string4 = data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_DECLINE, "");
                m.a aVarC = new m.a.C0283a(R.drawable.ic_decline, TextUtils.isEmpty(string4) ? this.context.getString(R.string.text_decline) : string4, getDeclinePendingIntent(iHashCode, data)).c();
                AbstractC4862t.d(aVarC, "build(...)");
                m.e eVar23 = this.notificationBuilder;
                if (eVar23 != null) {
                    eVar23.b(aVarC);
                }
                String string5 = data.getString(CallkitConstants.EXTRA_CALLKIT_TEXT_ACCEPT, "");
                int i12 = R.drawable.ic_accept;
                if (TextUtils.isEmpty(string4)) {
                    string5 = this.context.getString(R.string.text_accept);
                }
                m.a aVarC2 = new m.a.C0283a(i12, string5, getAcceptPendingIntent(iHashCode, data)).c();
                AbstractC4862t.d(aVarC2, "build(...)");
                m.e eVar24 = this.notificationBuilder;
                if (eVar24 != null) {
                    eVar24.b(aVarC2);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 34) {
            u uVarA2 = new u.b().f(data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, "")).d(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_IMPORTANT, true)).b(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_BOT, false)).a();
            AbstractC4862t.d(uVarA2, "build(...)");
            m.e eVar25 = this.notificationBuilder;
            if (eVar25 != null) {
                eVar25.N(m.f.b(uVarA2, getDeclinePendingIntent(iHashCode, data), getAcceptPendingIntent(iHashCode, data)).i(i10 > 0));
            }
            if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false) && (eVar = this.notificationBuilder) != null) {
                eVar.n(data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
            }
            String string6 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
            if (string6 != null && string6.length() != 0) {
                if (!C.N(string6, "http://", true) && !C.N(string6, "https://", true)) {
                    S s11 = S.f39781a;
                    string6 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string6}, 1));
                    AbstractC4862t.d(string6, "format(...)");
                }
                Serializable serializable2 = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                AbstractC4862t.c(serializable2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                HashMap<String, Object> map2 = (HashMap) serializable2;
                if (this.targetInComingAvatarCustom == null) {
                    this.targetInComingAvatarCustom = createInComingAvatarTargetCustom(iHashCode, true);
                }
                ImageLoaderProvider.INSTANCE.loadImage(this.context, string6, map2, this.targetInComingAvatarCustom);
            }
        } else {
            RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_notification);
            this.notificationViews = remoteViews;
            AbstractC4862t.b(remoteViews);
            initInComingNotificationViews(iHashCode, remoteViews, data);
            if (C.E(Build.MANUFACTURER, "Samsung", true) || z11) {
                RemoteViews remoteViews2 = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_small_ex_notification);
                this.notificationSmallViews = remoteViews2;
                AbstractC4862t.b(remoteViews2);
                initInComingNotificationViews(iHashCode, remoteViews2, data);
            } else {
                RemoteViews remoteViews3 = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_small_notification);
                this.notificationSmallViews = remoteViews3;
                AbstractC4862t.b(remoteViews3);
                initInComingNotificationViews(iHashCode, remoteViews3, data);
            }
            m.e eVar26 = this.notificationBuilder;
            if (eVar26 != null) {
                eVar26.N(new m.g());
            }
            m.e eVar27 = this.notificationBuilder;
            if (eVar27 != null) {
                eVar27.q(this.notificationSmallViews);
            }
            m.e eVar28 = this.notificationBuilder;
            if (eVar28 != null) {
                eVar28.p(this.notificationViews);
            }
            m.e eVar29 = this.notificationBuilder;
            if (eVar29 != null) {
                eVar29.r(this.notificationSmallViews);
            }
        }
        m.e eVar30 = this.notificationBuilder;
        if (eVar30 != null) {
            eVar30.D(true);
        }
        m.e eVar31 = this.notificationBuilder;
        Notification notificationD = eVar31 != null ? eVar31.d() : null;
        if (notificationD != null) {
            return new CallkitNotification(iHashCode, notificationD);
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public final CallkitNotification getOnGoingCallNotification(Bundle data, Boolean isConnected) {
        m.e eVar;
        AbstractC4862t.e(data, "data");
        if (!data.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_SHOW, true)) {
            return null;
        }
        int iHashCode = ("ongoing_" + data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_ID, data.getString(CallkitConstants.EXTRA_CALLKIT_ID, "callkit_incoming"))).hashCode();
        m.e eVar2 = new m.e(this.context, NOTIFICATION_CHANNEL_ID_ONGOING);
        this.notificationOngoingBuilder = eVar2;
        eVar2.i(NOTIFICATION_CHANNEL_ID_ONGOING);
        int i10 = Build.VERSION.SDK_INT;
        m.e eVar3 = this.notificationOngoingBuilder;
        if (eVar3 != null) {
            eVar3.h("call");
        }
        String string = data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_SUBTITLE, "");
        m.e eVar4 = this.notificationOngoingBuilder;
        if (eVar4 != null) {
            eVar4.O(TextUtils.isEmpty(string) ? this.context.getString(R.string.text_calling) : string);
        }
        m.e eVar5 = this.notificationOngoingBuilder;
        if (eVar5 != null) {
            eVar5.D(true);
        }
        m.e eVar6 = this.notificationOngoingBuilder;
        if (eVar6 != null) {
            eVar6.g(false);
        }
        m.e eVar7 = this.notificationOngoingBuilder;
        if (eVar7 != null) {
            eVar7.M(null);
        }
        int i11 = data.getInt(CallkitConstants.EXTRA_CALLKIT_TYPE, -1);
        int i12 = this.context.getApplicationInfo().icon;
        if (i11 > 0) {
            i12 = R.drawable.ic_video;
        } else if (i12 >= 0) {
            i12 = R.drawable.ic_accept;
        }
        m.e eVar8 = this.notificationOngoingBuilder;
        if (eVar8 != null) {
            eVar8.L(i12);
        }
        if (!data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_NOTIFICATION, false)) {
            m.e eVar9 = this.notificationOngoingBuilder;
            if (eVar9 != null) {
                eVar9.o(data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
            }
            m.e eVar10 = this.notificationOngoingBuilder;
            if (eVar10 != null) {
                eVar10.n(data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
            }
            String string2 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
            if (string2 != null && string2.length() != 0) {
                if (!C.N(string2, "http://", true) && !C.N(string2, "https://", true)) {
                    S s10 = S.f39781a;
                    string2 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string2}, 1));
                    AbstractC4862t.d(string2, "format(...)");
                }
                Serializable serializable = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                AbstractC4862t.c(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                HashMap<String, Object> map = (HashMap) serializable;
                if (this.targetOnGoingAvatarDefault == null) {
                    this.targetOnGoingAvatarDefault = createOnGoingAvatarTargetDefault(iHashCode);
                }
                ImageLoaderProvider.INSTANCE.loadImage(this.context, string2, map, this.targetOnGoingAvatarDefault);
            }
            if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_SHOW, true)) {
                String string3 = data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_TEXT, "");
                int i13 = R.drawable.transparent;
                if (TextUtils.isEmpty(string3)) {
                    string3 = this.context.getString(R.string.text_hang_up);
                }
                m.a aVarC = new m.a.C0283a(i13, string3, getHangupPendingIntent(iHashCode, data)).c();
                AbstractC4862t.d(aVarC, "build(...)");
                m.e eVar11 = this.notificationOngoingBuilder;
                if (eVar11 != null) {
                    eVar11.b(aVarC);
                }
            }
        } else if (i10 >= 34) {
            u uVarA = new u.b().f(data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, "")).d(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_IMPORTANT, true)).b(data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_BOT, false)).a();
            AbstractC4862t.d(uVarA, "build(...)");
            m.f fVarC = m.f.c(uVarA, getHangupPendingIntent(iHashCode, data));
            AbstractC4862t.d(fVarC, "forOngoingCall(...)");
            fVarC.j(TextUtils.isEmpty(string) ? this.context.getString(R.string.text_calling) : string);
            m.e eVar12 = this.notificationOngoingBuilder;
            if (eVar12 != null) {
                eVar12.N(fVarC);
            }
            if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false) && (eVar = this.notificationOngoingBuilder) != null) {
                eVar.n(data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
            }
            String string4 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
            if (string4 != null && string4.length() != 0) {
                if (!C.N(string4, "http://", true) && !C.N(string4, "https://", true)) {
                    S s11 = S.f39781a;
                    string4 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string4}, 1));
                    AbstractC4862t.d(string4, "format(...)");
                }
                Serializable serializable2 = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                AbstractC4862t.c(serializable2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                HashMap<String, Object> map2 = (HashMap) serializable2;
                if (this.targetOnGoingAvatarCustom == null) {
                    this.targetOnGoingAvatarCustom = createOnGoingAvatarTargetCustom(iHashCode, true);
                }
                ImageLoaderProvider.INSTANCE.loadImage(this.context, string4, map2, this.targetOnGoingAvatarCustom);
            }
        } else {
            this.notificationOngoingViews = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_ongoing_notification);
            this.notificationOngoingSmallViews = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_small_ongoing_notification);
            RemoteViews remoteViews = this.notificationOngoingViews;
            if (remoteViews != null) {
                remoteViews.setTextViewText(R.id.tvNameCaller, data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
            }
            RemoteViews remoteViews2 = this.notificationOngoingSmallViews;
            if (remoteViews2 != null) {
                remoteViews2.setTextViewText(R.id.tvNameCaller, data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
            }
            if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false)) {
                RemoteViews remoteViews3 = this.notificationOngoingViews;
                if (remoteViews3 != null) {
                    remoteViews3.setTextViewText(R.id.tvNumber, data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
                }
                RemoteViews remoteViews4 = this.notificationOngoingSmallViews;
                if (remoteViews4 != null) {
                    remoteViews4.setTextViewText(R.id.tvNumber, data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
                }
            }
            RemoteViews remoteViews5 = this.notificationOngoingViews;
            if (remoteViews5 != null) {
                remoteViews5.setOnClickPendingIntent(R.id.llHangup, getHangupPendingIntent(iHashCode, data));
            }
            boolean z10 = data.getBoolean(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_SHOW, true);
            RemoteViews remoteViews6 = this.notificationOngoingViews;
            if (remoteViews6 != null) {
                remoteViews6.setViewVisibility(R.id.llHangup, z10 ? 0 : 8);
            }
            String string5 = data.getString(CallkitConstants.EXTRA_CALLKIT_CALLING_HANG_UP_TEXT, "");
            RemoteViews remoteViews7 = this.notificationOngoingViews;
            if (remoteViews7 != null) {
                int i14 = R.id.tvHangUp;
                if (TextUtils.isEmpty(string5)) {
                    string5 = this.context.getString(R.string.text_hang_up);
                }
                remoteViews7.setTextViewText(i14, string5);
            }
            String string6 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
            if (string6 != null && string6.length() != 0) {
                if (!C.N(string6, "http://", true) && !C.N(string6, "https://", true)) {
                    S s12 = S.f39781a;
                    string6 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string6}, 1));
                    AbstractC4862t.d(string6, "format(...)");
                }
                Serializable serializable3 = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                AbstractC4862t.c(serializable3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                HashMap<String, Object> map3 = (HashMap) serializable3;
                if (this.targetOnGoingAvatarCustom == null) {
                    this.targetOnGoingAvatarCustom = createOnGoingAvatarTargetCustom(iHashCode, false);
                }
                ImageLoaderProvider.INSTANCE.loadImage(this.context, string6, map3, this.targetOnGoingAvatarCustom);
            }
            m.e eVar13 = this.notificationOngoingBuilder;
            if (eVar13 != null) {
                eVar13.N(new m.g());
            }
            m.e eVar14 = this.notificationOngoingBuilder;
            if (eVar14 != null) {
                eVar14.q(this.notificationOngoingSmallViews);
            }
            m.e eVar15 = this.notificationOngoingBuilder;
            if (eVar15 != null) {
                eVar15.p(this.notificationOngoingViews);
            }
        }
        m.e eVar16 = this.notificationOngoingBuilder;
        if (eVar16 != null) {
            eVar16.F(4);
        }
        if (AbstractC4862t.a(isConnected, Boolean.TRUE)) {
            m.e eVar17 = this.notificationOngoingBuilder;
            if (eVar17 != null) {
                eVar17.U(System.currentTimeMillis());
            }
            m.e eVar18 = this.notificationOngoingBuilder;
            if (eVar18 != null) {
                eVar18.R(true);
            }
        } else {
            m.e eVar19 = this.notificationOngoingBuilder;
            if (eVar19 != null) {
                eVar19.R(false);
            }
        }
        m.e eVar20 = this.notificationOngoingBuilder;
        if (eVar20 != null) {
            eVar20.M(null);
        }
        m.e eVar21 = this.notificationOngoingBuilder;
        if (eVar21 != null) {
            eVar21.m(getAppPendingIntent(iHashCode, data));
        }
        String string7 = data.getString(CallkitConstants.EXTRA_CALLKIT_ACTION_COLOR, "#4CAF50");
        try {
            m.e eVar22 = this.notificationOngoingBuilder;
            if (eVar22 != null) {
                eVar22.k(Color.parseColor(string7));
            }
        } catch (Exception unused) {
        }
        m.e eVar23 = this.notificationOngoingBuilder;
        if (eVar23 != null) {
            eVar23.D(true);
        }
        m.e eVar24 = this.notificationOngoingBuilder;
        Notification notificationD = eVar24 != null ? eVar24.d() : null;
        if (notificationD != null) {
            return new CallkitNotification(iHashCode, notificationD);
        }
        return null;
    }

    public final void onRequestPermissionsResult(final Activity activity, int requestCode, int[] grantResults) {
        AbstractC4862t.e(grantResults, "grantResults");
        if (requestCode == 6969) {
            if (((grantResults.length == 0) || grantResults[0] != 0) && activity != null) {
                if (androidx.core.app.a.y(activity, "android.permission.POST_NOTIFICATIONS")) {
                    if (this.dataNotificationPermission.get("title") == null || this.dataNotificationPermission.get("rationaleMessagePermission") == null) {
                        requestNotificationPermission(activity, this.dataNotificationPermission);
                        return;
                    }
                    Object obj = this.dataNotificationPermission.get("title");
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = this.dataNotificationPermission.get("rationaleMessagePermission");
                    AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    showDialogMessage(activity, (String) obj, (String) obj2, new DialogInterface.OnClickListener() { // from class: com.hiennv.flutter_callkit_incoming.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CallkitNotificationManager.onRequestPermissionsResult$lambda$32$lambda$29(this.f32384a, activity, dialogInterface, i10);
                        }
                    });
                    return;
                }
                if (this.dataNotificationPermission.get("title") == null || this.dataNotificationPermission.get("postNotificationMessageRequired") == null) {
                    String string = activity.getResources().getString(R.string.text_title_post_notification);
                    AbstractC4862t.d(string, "getString(...)");
                    String string2 = activity.getResources().getString(R.string.text_post_notification_message_required);
                    AbstractC4862t.d(string2, "getString(...)");
                    showDialogMessage(activity, string, string2, new DialogInterface.OnClickListener() { // from class: com.hiennv.flutter_callkit_incoming.j
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            CallkitNotificationManager.onRequestPermissionsResult$lambda$32$lambda$31(activity, dialogInterface, i10);
                        }
                    });
                    return;
                }
                Object obj3 = this.dataNotificationPermission.get("title");
                AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = this.dataNotificationPermission.get("postNotificationMessageRequired");
                AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.String");
                showDialogMessage(activity, (String) obj3, (String) obj4, new DialogInterface.OnClickListener() { // from class: com.hiennv.flutter_callkit_incoming.i
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        CallkitNotificationManager.onRequestPermissionsResult$lambda$32$lambda$30(activity, dialogInterface, i10);
                    }
                });
            }
        }
    }

    public final void requestFullIntentPermission(Activity activity) {
        if (getNotificationManager().canUseFullScreenIntent() || Build.VERSION.SDK_INT < 34) {
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity != null ? activity.getPackageName() : null, null));
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    public final void requestNotificationPermission(Activity activity, Map<String, ? extends Object> map) {
        AbstractC4862t.e(map, "map");
        this.dataNotificationPermission = map;
        if (Build.VERSION.SDK_INT < 33 || activity == null || L0.a.a(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
            return;
        }
        androidx.core.app.a.v(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, PERMISSION_NOTIFICATION_REQUEST_CODE);
    }

    @SuppressLint({"MissingPermission"})
    public final void showIncomingNotification(Bundle data) {
        AbstractC4862t.e(data, "data");
        CallkitNotification incomingNotification = getIncomingNotification(data);
        if (incomingChannelEnabled()) {
            CallkitSoundPlayerManager callkitSoundPlayerManager = this.callkitSoundPlayerManager;
            if (callkitSoundPlayerManager != null) {
                callkitSoundPlayerManager.play(data);
            }
            VolumeKeyBroadcastReceiver volumeKeyBroadcastReceiver = new VolumeKeyBroadcastReceiver();
            this.volumeKeyReceiver = volumeKeyBroadcastReceiver;
            this.context.registerReceiver(volumeKeyBroadcastReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        }
        if (incomingNotification != null) {
            getNotificationManager().notify(incomingNotification.getId(), incomingNotification.getNotification());
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void showMissCallNotification(Bundle data) {
        Uri uri;
        m.e eVar;
        AbstractC4862t.e(data, "data");
        if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SHOW, true)) {
            int iHashCode = ("missing_" + data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_ID, data.getString(CallkitConstants.EXTRA_CALLKIT_ID, "callkit_incoming"))).hashCode();
            createNotificationChanel(data);
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            AbstractC4862t.d(defaultUri, "getDefaultUri(...)");
            int i10 = data.getInt(CallkitConstants.EXTRA_CALLKIT_TYPE, -1);
            int i11 = this.context.getApplicationInfo().icon;
            if (i10 > 0) {
                i11 = R.drawable.ic_video_missed;
            } else if (i11 >= 0) {
                i11 = R.drawable.ic_call_missed;
            }
            m.e eVar2 = new m.e(this.context, NOTIFICATION_CHANNEL_ID_MISSED);
            this.notificationMissingBuilder = eVar2;
            eVar2.i(NOTIFICATION_CHANNEL_ID_MISSED);
            m.e eVar3 = this.notificationMissingBuilder;
            if (eVar3 != null) {
                eVar3.h("missed_call");
            }
            m.e eVar4 = this.notificationMissingBuilder;
            if (eVar4 != null) {
                eVar4.U(System.currentTimeMillis());
            }
            String string = data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_SUBTITLE, "");
            m.e eVar5 = this.notificationMissingBuilder;
            if (eVar5 != null) {
                if (TextUtils.isEmpty(string)) {
                    string = this.context.getString(R.string.text_missed_call);
                }
                eVar5.O(string);
            }
            m.e eVar6 = this.notificationMissingBuilder;
            if (eVar6 != null) {
                eVar6.L(i11);
            }
            m.e eVar7 = this.notificationMissingBuilder;
            if (eVar7 != null) {
                eVar7.E(true);
            }
            boolean z10 = data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_CUSTOM_NOTIFICATION, false);
            int i12 = data.getInt(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_COUNT, 1);
            if (i12 > 1 && (eVar = this.notificationMissingBuilder) != null) {
                eVar.C(i12);
            }
            if (z10) {
                uri = defaultUri;
                this.notificationMissingViews = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_miss_notification);
                this.notificationMissingSmallViews = new RemoteViews(this.context.getPackageName(), R.layout.layout_custom_miss_small_notification);
                RemoteViews remoteViews = this.notificationMissingViews;
                if (remoteViews != null) {
                    remoteViews.setTextViewText(R.id.tvNameCaller, data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
                }
                RemoteViews remoteViews2 = this.notificationMissingSmallViews;
                if (remoteViews2 != null) {
                    remoteViews2.setTextViewText(R.id.tvNameCaller, data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
                }
                RemoteViews remoteViews3 = this.notificationMissingSmallViews;
                if (remoteViews3 != null) {
                    remoteViews3.setTextViewText(R.id.tvTime, getSystemFormattedTime(this.context));
                }
                if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_IS_SHOW_CALL_ID, false)) {
                    RemoteViews remoteViews4 = this.notificationMissingViews;
                    if (remoteViews4 != null) {
                        remoteViews4.setTextViewText(R.id.tvNumber, data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
                    }
                    RemoteViews remoteViews5 = this.notificationMissingSmallViews;
                    if (remoteViews5 != null) {
                        remoteViews5.setTextViewText(R.id.tvNumber, data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
                    }
                }
                RemoteViews remoteViews6 = this.notificationMissingViews;
                if (remoteViews6 != null) {
                    remoteViews6.setOnClickPendingIntent(R.id.llCallback, getCallbackPendingIntent(iHashCode, data));
                }
                boolean z11 = data.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_SHOW, true);
                RemoteViews remoteViews7 = this.notificationMissingViews;
                if (remoteViews7 != null) {
                    remoteViews7.setViewVisibility(R.id.llCallback, z11 ? 0 : 8);
                }
                String string2 = data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_TEXT, "");
                RemoteViews remoteViews8 = this.notificationMissingViews;
                if (remoteViews8 != null) {
                    int i13 = R.id.tvCallback;
                    if (TextUtils.isEmpty(string2)) {
                        string2 = this.context.getString(R.string.text_call_back);
                    }
                    remoteViews8.setTextViewText(i13, string2);
                }
                String string3 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
                if (string3 != null && string3.length() != 0) {
                    if (!C.N(string3, "http://", true) && !C.N(string3, "https://", true)) {
                        S s10 = S.f39781a;
                        string3 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string3}, 1));
                        AbstractC4862t.d(string3, "format(...)");
                    }
                    Serializable serializable = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                    AbstractC4862t.c(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                    HashMap<String, Object> map = (HashMap) serializable;
                    if (this.targetMissingAvatarCustom == null) {
                        this.targetMissingAvatarCustom = createMissingAvatarTargetCustom(iHashCode);
                    }
                    ImageLoaderProvider.INSTANCE.loadImage(this.context, string3, map, this.targetMissingAvatarCustom);
                }
                m.e eVar8 = this.notificationMissingBuilder;
                if (eVar8 != null) {
                    eVar8.N(new m.g());
                }
                m.e eVar9 = this.notificationMissingBuilder;
                if (eVar9 != null) {
                    eVar9.q(this.notificationMissingSmallViews);
                }
                m.e eVar10 = this.notificationMissingBuilder;
                if (eVar10 != null) {
                    eVar10.p(this.notificationMissingViews);
                }
            } else {
                uri = defaultUri;
                m.e eVar11 = this.notificationMissingBuilder;
                if (eVar11 != null) {
                    eVar11.o(data.getString(CallkitConstants.EXTRA_CALLKIT_NAME_CALLER, ""));
                }
                m.e eVar12 = this.notificationMissingBuilder;
                if (eVar12 != null) {
                    eVar12.n(data.getString(CallkitConstants.EXTRA_CALLKIT_HANDLE, ""));
                }
                String string4 = data.getString(CallkitConstants.EXTRA_CALLKIT_AVATAR, "");
                if (string4 != null && string4.length() != 0) {
                    if (!C.N(string4, "http://", true) && !C.N(string4, "https://", true)) {
                        S s11 = S.f39781a;
                        string4 = String.format("file:///android_asset/flutter_assets/%s", Arrays.copyOf(new Object[]{string4}, 1));
                        AbstractC4862t.d(string4, "format(...)");
                    }
                    Serializable serializable2 = data.getSerializable(CallkitConstants.EXTRA_CALLKIT_HEADERS);
                    AbstractC4862t.c(serializable2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any?>");
                    HashMap<String, Object> map2 = (HashMap) serializable2;
                    if (this.targetMissingAvatarDefault == null) {
                        this.targetMissingAvatarDefault = createMissingAvatarTargetDefault(iHashCode);
                    }
                    ImageLoaderProvider.INSTANCE.loadImage(this.context, string4, map2, this.targetMissingAvatarDefault);
                }
                if (data.getBoolean(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_SHOW, true)) {
                    String string5 = data.getString(CallkitConstants.EXTRA_CALLKIT_MISSED_CALL_CALLBACK_TEXT, "");
                    int i14 = R.drawable.ic_accept;
                    if (TextUtils.isEmpty(string5)) {
                        string5 = this.context.getString(R.string.text_call_back);
                    }
                    m.a aVarC = new m.a.C0283a(i14, string5, getCallbackPendingIntent(iHashCode, data)).c();
                    AbstractC4862t.d(aVarC, "build(...)");
                    m.e eVar13 = this.notificationMissingBuilder;
                    if (eVar13 != null) {
                        eVar13.b(aVarC);
                    }
                }
            }
            m.e eVar14 = this.notificationMissingBuilder;
            if (eVar14 != null) {
                eVar14.F(4);
            }
            m.e eVar15 = this.notificationMissingBuilder;
            if (eVar15 != null) {
                eVar15.M(uri);
            }
            m.e eVar16 = this.notificationMissingBuilder;
            if (eVar16 != null) {
                eVar16.m(getAppPendingIntent(iHashCode, data));
            }
            String string6 = data.getString(CallkitConstants.EXTRA_CALLKIT_ACTION_COLOR, "#4CAF50");
            try {
                m.e eVar17 = this.notificationMissingBuilder;
                if (eVar17 != null) {
                    eVar17.k(Color.parseColor(string6));
                }
            } catch (Exception unused) {
            }
            m.e eVar18 = this.notificationMissingBuilder;
            Notification notificationD = eVar18 != null ? eVar18.d() : null;
            if (notificationD != null) {
                getNotificationManager().notify(iHashCode, notificationD);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void showOngoingCallNotification(Bundle data, Boolean isConnected) {
        AbstractC4862t.e(data, "data");
        CallkitNotification onGoingCallNotification = getOnGoingCallNotification(data, isConnected);
        if (onGoingCallNotification != null) {
            getNotificationManager().notify(onGoingCallNotification.getId(), onGoingCallNotification.getNotification());
        }
    }
}
