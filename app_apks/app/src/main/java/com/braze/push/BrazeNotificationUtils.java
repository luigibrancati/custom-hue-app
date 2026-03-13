package com.braze.push;

import Od.C;
import Od.F;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.app.m;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import fc.C4032o;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001jB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\n*\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ5\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b)\u0010(J)\u0010,\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b,\u0010\u001eJ\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b5\u00103J)\u00106\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b6\u00107J)\u00108\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b8\u00107J\u001f\u0010:\u001a\u00020\"2\u0006\u00109\u001a\u00020*2\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b<\u00103J\u001f\u0010=\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b?\u00103J\u001f\u0010@\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b@\u00103J\u001f\u0010A\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bB\u00103J\u001f\u0010C\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bC\u00103J\u001f\u0010D\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bE\u00103J\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020\"H\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bI\u0010\u0013J\u001f\u0010J\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bN\u00103J\u001f\u0010O\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bO\u0010\u0013J\u0017\u0010P\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bP\u0010/J\u001f\u0010Q\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bQ\u0010\u0013J#\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010S\u001a\u00020R2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\u00020X2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bY\u0010ZJ5\u0010]\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020[2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b]\u0010^J)\u0010]\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b]\u0010`R\u0014\u0010a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0011\u0010f\u001a\u00020c8G¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0015\u0010i\u001a\u0006\u0012\u0002\b\u00030 8G¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "", "deepLink", "", "useWebView", "Lfc/H;", "routeUserWithNotificationOpenedIntent$android_sdk_ui_release", "(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;Z)V", "routeUserWithNotificationOpenedIntent", "Landroid/content/Intent;", "intent", "handleNotificationOpened", "(Landroid/content/Context;Landroid/content/Intent;)V", "handleNotificationDeleted", "isBrazePushMessage", "(Landroid/content/Intent;)Z", "isNotificationMessage", "notificationExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "sendPushMessageReceivedBroadcast", "(Landroid/content/Context;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "refreshFeatureFlagsIfAppropriate", "(Lcom/braze/models/push/BrazeNotificationPayload;)Z", "refreshBannersIfAppropriate", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "setNotificationDurationAlarm", "(Landroid/content/Context;Ljava/lang/Class;II)V", "getNotificationId", "(Lcom/braze/models/push/BrazeNotificationPayload;)I", "getNotificationPriority", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "wakeScreenIfAppropriate", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;Landroid/os/Bundle;)Z", "prefetchBitmapsIfNewlyReceivedStoryPush", "(Lcom/braze/models/push/BrazeNotificationPayload;)V", "Landroidx/core/app/m$e;", "notificationBuilder", "setTitleIfPresent", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)V", "setContentIfPresent", "setTickerIfPresent", "setContentIntentIfPresent", "(Landroid/content/Context;Landroidx/core/app/m$e;Landroid/os/Bundle;)V", "setDeleteIntent", "appConfigurationProvider", "setSmallIcon", "(Lcom/braze/configuration/BrazeConfigurationProvider;Landroidx/core/app/m$e;)I", "setSetShowWhen", "setLargeIconIfPresentAndSupported", "(Landroidx/core/app/m$e;Lcom/braze/models/push/BrazeNotificationPayload;)Z", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setPriorityIfPresentAndSupported", "setAccentColorIfPresentAndSupported", "setCategoryIfPresentAndSupported", "setVisibilityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", ViewHierarchyNode.JsonKeys.VISIBILITY, "isValidNotificationVisibility", "(I)Z", "handleCancelNotificationAction", "cancelNotification", "(Landroid/content/Context;I)V", "getOrCreateNotificationChannelId", "(Lcom/braze/models/push/BrazeNotificationPayload;)Ljava/lang/String;", "setNotificationBadgeNumberIfPresent", "handlePushStoryPageClicked", "handleContentCardsSerializedCardIfPresent", "sendNotificationOpenedBroadcast", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "getValidNotificationChannel", "(Landroid/app/NotificationManager;Landroid/os/Bundle;)Landroid/app/NotificationChannel;", "action", "Landroid/app/PendingIntent;", "getPushActionPendingIntent", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "broadcastType", "sendPushActionIntent", "(Landroid/content/Context;Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;Landroid/os/Bundle;Lcom/braze/models/push/BrazeNotificationPayload;)V", "pushIntent", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "activeNotificationFactory", "getNotificationReceiverClass", "()Ljava/lang/Class;", "notificationReceiverClass", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeNotificationUtils {
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "<init>", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BrazeNotificationBroadcastType {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ BrazeNotificationBroadcastType[] $VALUES;
        private final BrazePushEventType brazePushEventType;
        public static final BrazeNotificationBroadcastType OPENED = new BrazeNotificationBroadcastType("OPENED", 0, BrazePushEventType.NOTIFICATION_OPENED);
        public static final BrazeNotificationBroadcastType RECEIVED = new BrazeNotificationBroadcastType("RECEIVED", 1, BrazePushEventType.NOTIFICATION_RECEIVED);
        public static final BrazeNotificationBroadcastType DELETED = new BrazeNotificationBroadcastType("DELETED", 2, BrazePushEventType.NOTIFICATION_DELETED);

        private static final /* synthetic */ BrazeNotificationBroadcastType[] $values() {
            return new BrazeNotificationBroadcastType[]{OPENED, RECEIVED, DELETED};
        }

        static {
            BrazeNotificationBroadcastType[] brazeNotificationBroadcastTypeArr$values = $values();
            $VALUES = brazeNotificationBroadcastTypeArr$values;
            $ENTRIES = AbstractC5277b.a(brazeNotificationBroadcastTypeArr$values);
        }

        private BrazeNotificationBroadcastType(String str, int i10, BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public static BrazeNotificationBroadcastType valueOf(String str) {
            return (BrazeNotificationBroadcastType) Enum.valueOf(BrazeNotificationBroadcastType.class, str);
        }

        public static BrazeNotificationBroadcastType[] values() {
            return (BrazeNotificationBroadcastType[]) $VALUES.clone();
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BrazeNotificationUtils() {
    }

    public static final void cancelNotification(Context context, final int notificationId) {
        AbstractC4862t.e(context, "context");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.Z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.cancelNotification$lambda$63(notificationId);
                }
            }, 7, (Object) null);
            Intent intent = new Intent("com.braze.action.CANCEL_NOTIFICATION").setClass(context, getNotificationReceiverClass());
            AbstractC4862t.d(intent, "setClass(...)");
            intent.setPackage(context.getPackageName());
            intent.putExtra("nid", notificationId);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.a0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.cancelNotification$lambda$64();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$63(int i10) {
        return "Cancelling notification action with id: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$64() {
        return "Exception occurred attempting to cancel notification.";
    }

    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.INSTANCE.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.INSTANCE.getInstance() : customBrazeNotificationFactory;
    }

    public static final int getNotificationId(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        final Integer customNotificationId = payload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.P
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.getNotificationId$lambda$16(customNotificationId);
                }
            }, 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = payload.getTitleText();
        String str = "";
        if (titleText != null) {
            str = ((Object) "") + titleText;
        }
        String contentText = payload.getContentText();
        if (contentText != null) {
            str = ((Object) str) + contentText;
        }
        final int iHashCode = str != null ? str.hashCode() : 0;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.Q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.getNotificationId$lambda$19(iHashCode);
            }
        }, 7, (Object) null);
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$16(Integer num) {
        return "Using notification id provided in the message's extras bundle: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$19(int i10) {
        return "Message without notification id provided in the extras bundle received. Using a hash of the message: " + i10;
    }

    public static final int getNotificationPriority(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        final Integer notificationPriorityInt = payload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = payload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int iIntValue = notificationPriorityInt2.intValue();
        if (-2 <= iIntValue && iIntValue < 3) {
            return iIntValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.l0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.getNotificationPriority$lambda$21$lambda$20(notificationPriorityInt);
            }
        }, 6, (Object) null);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationPriority$lambda$21$lambda$20(Integer num) {
        return "Received invalid notification priority " + num;
    }

    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        final String notificationChannelId = payload.getNotificationChannelId();
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        Object systemService = context != null ? context.getSystemService("notification") : null;
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.R0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$66(notificationChannelId);
                    }
                }, 7, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.S0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$67(notificationChannelId);
                }
            }, 7, (Object) null);
        }
        if (notificationManager.getNotificationChannel("com_appboy_default_notification_channel") == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.T0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$68();
                }
            }, 7, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel("com_appboy_default_notification_channel", configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return "com_appboy_default_notification_channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$66(String str) {
        return "Found notification channel in extras with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$67(String str) {
        return "Notification channel from extras is invalid. No channel found with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$68() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String action, Bundle notificationExtras) {
        Intent intent = new Intent(action).setClass(context, NotificationTrampolineActivity.class);
        AbstractC4862t.d(intent, "setClass(...)");
        if (notificationExtras != null) {
            intent.putExtras(notificationExtras);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        AbstractC4862t.d(activity, "getActivity(...)");
        return activity;
    }

    @TargetApi(26)
    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle notificationExtras) {
        AbstractC4862t.e(notificationManager, "notificationManager");
        if (notificationExtras == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.h0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.getValidNotificationChannel$lambda$74();
                }
            }, 7, (Object) null);
            return null;
        }
        final String string = notificationExtras.getString("ab_nc", null);
        if (string != null && !F.k0(string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.i0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.getValidNotificationChannel$lambda$75(string);
                    }
                }, 7, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.j0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.getValidNotificationChannel$lambda$76(string);
                }
            }, 7, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.k0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$77();
            }
        }, 7, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$74() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$75(String str) {
        return "Found notification channel in extras with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$76(String str) {
        return "Notification channel from extras is invalid, no channel found with id: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$77() {
        return "Braze default notification channel does not exist on device.";
    }

    public static final void handleCancelNotificationAction(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        try {
            if (intent.hasExtra("nid")) {
                final int intExtra = intent.getIntExtra("nid", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.U0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.handleCancelNotificationAction$lambda$61(intExtra);
                    }
                }, 7, (Object) null);
                Object systemService = context.getSystemService("notification");
                AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.V0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.handleCancelNotificationAction$lambda$62();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$61(int i10) {
        return "Cancelling notification action with id: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$62() {
        return "Exception occurred handling cancel notification intent.";
    }

    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        final String contentCardSyncData = payload.getContentCardSyncData();
        final String contentCardSyncUserId = payload.getContentCardSyncUserId();
        Context context = payload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.c0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent$lambda$72(contentCardSyncUserId, contentCardSyncData);
            }
        }, 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleContentCardsSerializedCardIfPresent$lambda$72(String str, String str2) {
        return "Push contains associated Content Cards card. User id: " + str + " Card data: " + str2;
    }

    public static final void handleNotificationDeleted(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.g0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.handleNotificationDeleted$lambda$2();
                }
            }, 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            } else {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.r0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.handleNotificationDeleted$lambda$3();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$2() {
        return "Sending notification deleted broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$3() {
        return "Exception occurred attempting to handle notification delete intent.";
    }

    public static final void handleNotificationOpened(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.C0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.handleNotificationOpened$lambda$0();
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.N0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.handleNotificationOpened$lambda$1();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$0() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$1() {
        return "Exception occurred attempting to handle notification opened intent.";
    }

    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        try {
            Braze.INSTANCE.getInstance(context).logPushStoryPageClicked(intent.getStringExtra("braze_campaign_id"), intent.getStringExtra("braze_story_page_id"));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra("nid", 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            final String stringExtra = intent.getStringExtra("braze_action_uri");
            if (stringExtra == null || F.k0(stringExtra)) {
                intent.removeExtra("uri");
            } else {
                intent.putExtra("uri", intent.getStringExtra("braze_action_uri"));
                String stringExtra2 = intent.getStringExtra("braze_action_use_webview");
                if (stringExtra2 != null && !F.k0(stringExtra2)) {
                    intent.putExtra("ab_use_webview", stringExtra2);
                }
            }
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.K
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.handlePushStoryPageClicked$lambda$70(stringExtra);
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.V
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.handlePushStoryPageClicked$lambda$71();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$70(String str) {
        return "Not handling deep links automatically, skipping deep link handling for '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$71() {
        return "Caught exception while handling story click.";
    }

    public static final boolean isBrazePushMessage(Intent intent) {
        AbstractC4862t.e(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return C.E("true", extras.getString("_ab"), true);
    }

    public static final boolean isNotificationMessage(Intent intent) {
        AbstractC4862t.e(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey("t") && extras.containsKey("a");
    }

    public static final boolean isValidNotificationVisibility(int visibility) {
        return visibility == -1 || visibility == 0 || visibility == 1;
    }

    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        Context context = payload.getContext();
        if (context != null && payload.getIsPushStory() && payload.getIsNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (final String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.x0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush$lambda$29$lambda$28(str);
                    }
                }, 6, (Object) null);
                Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            payload.setNewlyReceivedPushStory(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$29$lambda$28(String str) {
        return "Pre-fetching bitmap at URL: " + str;
    }

    public static final boolean refreshBannersIfAppropriate(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshBanners() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.X
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$14();
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.W
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$13();
            }
        }, 7, (Object) null);
        BrazeInternal.refreshBanners(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$13() {
        return "Banners refresh key was true. Refreshing Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$14() {
        return "Banners refresh key not included in push payload or false. Not refreshing banners.";
    }

    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload payload) {
        AbstractC4862t.e(payload, "payload");
        Context context = payload.getContext();
        if (!payload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.T
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$12();
                }
            }, 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.S
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$11();
            }
        }, 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$11() {
        return "Feature flag refresh key was true. Refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$12() {
        return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.b0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$4();
            }
        }, 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra(SentryBaseEvent.JsonKeys.EXTRA);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString("source", "Appboy");
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, bundleExtra, intent.getStringExtra("uri"), C.E("true", intent.getStringExtra("ab_use_webview"), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$4() {
        return "routeUserWithNotificationOpenedIntent called with Intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$6(String str) {
        return "Delayed initialization is enabled. Deep link:" + str + " will not be handled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$7(Intent intent) {
        return "Push notification had no deep link. Opening main activity:" + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$8(String str, boolean z10) {
        return "Found a deep link:" + str + ". Use webview set to:" + z10;
    }

    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.O
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.sendNotificationOpenedBroadcast$lambda$73();
            }
        }, 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        } else {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendNotificationOpenedBroadcast$lambda$73() {
        return "Sending notification opened broadcast";
    }

    private final void sendPushActionIntent(Context context, final BrazeNotificationBroadcastType broadcastType, Bundle notificationExtras, BrazeNotificationPayload payload) {
        Intent intent;
        int i10 = WhenMappings.$EnumSwitchMapping$0[broadcastType.ordinal()];
        if (i10 == 1) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_OPENED").setPackage(context.getPackageName());
            AbstractC4862t.b(intent);
        } else if (i10 == 2) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_RECEIVED").setPackage(context.getPackageName());
            AbstractC4862t.b(intent);
        } else {
            if (i10 != 3) {
                throw new C4032o();
            }
            intent = new Intent("com.braze.push.intent.NOTIFICATION_DELETED").setPackage(context.getPackageName());
            AbstractC4862t.b(intent);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: com.braze.push.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.sendPushActionIntent$lambda$78(broadcastType);
            }
        }, 6, (Object) null);
        sendPushActionIntent(context, intent, notificationExtras);
        if (payload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, broadcastType.getBrazePushEventType(), payload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$78(BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$79(Intent intent) {
        return "Sending push action intent: " + intent;
    }

    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle notificationExtras, BrazeNotificationPayload payload) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(notificationExtras, "notificationExtras");
        AbstractC4862t.e(payload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.Y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.sendPushMessageReceivedBroadcast$lambda$10();
            }
        }, 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, notificationExtras, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushMessageReceivedBroadcast$lambda$10() {
        return "Sending push message received broadcast";
    }

    public static final void setAccentColorIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        Integer accentColor = payload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.G0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$50();
                }
            }, 7, (Object) null);
            notificationBuilder.k(accentColor.intValue());
            return;
        }
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.H0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$52$lambda$51();
                }
            }, 7, (Object) null);
            notificationBuilder.k(configurationProvider.getDefaultNotificationAccentColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$50() {
        return "Using accent color for notification from extras bundle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$52$lambda$51() {
        return "Using default accent color for notification";
    }

    public static final void setCategoryIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        String notificationCategory = payload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.z0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$54();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.y0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$53();
                }
            }, 7, (Object) null);
            AbstractC4862t.b(notificationBuilder.h(notificationCategory));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$53() {
        return "Setting category for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$54() {
        return "Category not present in notification extras. Not setting category for notification.";
    }

    public static final void setContentIfPresent(m.e notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.o0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setContentIfPresent$lambda$31();
            }
        }, 7, (Object) null);
        String contentText = payload.getContentText();
        if (contentText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.n(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIfPresent$lambda$31() {
        return "Setting content for notification";
    }

    public static final void setContentIntentIfPresent(Context context, m.e notificationBuilder, Bundle notificationExtras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        try {
            notificationBuilder.m(INSTANCE.getPushActionPendingIntent(context, "com.braze.action.BRAZE_PUSH_CLICKED", notificationExtras));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.I0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setContentIntentIfPresent$lambda$33();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIntentIfPresent$lambda$33() {
        return "Error setting content intent.";
    }

    public static final void setDeleteIntent(Context context, m.e notificationBuilder, Bundle notificationExtras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        try {
            Intent intent = new Intent("com.braze.action.BRAZE_PUSH_DELETED").setClass(context, getNotificationReceiverClass());
            AbstractC4862t.d(intent, "setClass(...)");
            if (notificationExtras != null) {
                intent.putExtras(notificationExtras);
            }
            notificationBuilder.t(PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.n0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setDeleteIntent$lambda$34();
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDeleteIntent$lambda$34() {
        return "Error setting delete intent.";
    }

    public static final boolean setLargeIconIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeLogger brazeLogger;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.K0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$38();
                }
            }, 7, (Object) null);
            return false;
        }
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.L0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$39();
                }
            }, 7, (Object) null);
            largeIcon = payload.getLargeIcon();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.P0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$43();
                }
            }, 4, (Object) null);
        }
        if (largeIcon != null) {
            notificationBuilder.z(Braze.INSTANCE.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.M0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$41();
            }
        }, 7, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId != 0) {
            notificationBuilder.z(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.O0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$42();
            }
        }, 7, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.Q0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$44();
            }
        }, 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$38() {
        return "Large icon not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$39() {
        return "Setting large icon for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$41() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$42() {
        return "Large icon resource id not present for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$43() {
        return "Error setting large notification icon";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$44() {
        return "Large icon not set for notification";
    }

    public static final void setNotificationBadgeNumberIfPresent(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            notificationBuilder.C(notificationBadgeNumber.intValue());
        }
    }

    public static final void setNotificationDurationAlarm(Context context, Class<?> thisClass, int notificationId, final int durationInMillis) {
        AbstractC4862t.e(context, "context");
        Intent intent = new Intent(context, thisClass);
        intent.setAction("com.braze.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (durationInMillis >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.U
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setNotificationDurationAlarm$lambda$15(durationInMillis);
                }
            }, 7, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) durationInMillis), broadcast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationDurationAlarm$lambda$15(int i10) {
        return "Setting Notification duration alarm for " + i10 + " ms";
    }

    public static final void setPriorityIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.w0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setPriorityIfPresentAndSupported$lambda$49();
            }
        }, 7, (Object) null);
        notificationBuilder.F(getNotificationPriority(payload));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPriorityIfPresentAndSupported$lambda$49() {
        return "Setting priority for notification";
    }

    public static final void setPublicVersionIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        Context context = payload.getContext();
        BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
        if (context == null || payload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(payload);
        Bundle jsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(payload.getPublicNotificationExtras());
        if (jsonObjectIntoBundle.isEmpty()) {
            return;
        }
        final BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(jsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        m.e eVar = new m.e(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.v0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setPublicVersionIfPresentAndSupported$lambda$57(brazeNotificationPayload);
            }
        }, 7, (Object) null);
        setContentIfPresent(eVar, brazeNotificationPayload);
        setTitleIfPresent(eVar, brazeNotificationPayload);
        setSummaryTextIfPresentAndSupported(eVar, brazeNotificationPayload);
        setSmallIcon(configurationProvider, eVar);
        setAccentColorIfPresentAndSupported(eVar, brazeNotificationPayload);
        notificationBuilder.H(eVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPublicVersionIfPresentAndSupported$lambda$57(BrazeNotificationPayload brazeNotificationPayload) {
        return "Setting public version of notification with payload: " + brazeNotificationPayload;
    }

    public static final void setSetShowWhen(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        if (payload.getIsPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.s0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSetShowWhen$lambda$37();
                }
            }, 7, (Object) null);
            notificationBuilder.J(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSetShowWhen$lambda$37() {
        return "Set show when not supported in story push.";
    }

    public static final int setSmallIcon(BrazeConfigurationProvider appConfigurationProvider, m.e notificationBuilder) {
        AbstractC4862t.e(appConfigurationProvider, "appConfigurationProvider");
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        int smallNotificationIconResourceId = appConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.p0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSmallIcon$lambda$35();
                }
            }, 7, (Object) null);
            smallNotificationIconResourceId = appConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.q0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSmallIcon$lambda$36();
                }
            }, 7, (Object) null);
        }
        notificationBuilder.L(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$35() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$36() {
        return "Setting small icon for notification via resource id";
    }

    public static final void setSoundIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        String notificationSound = payload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (AbstractC4862t.a(notificationSound, "d")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.t0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$45();
                }
            }, 7, (Object) null);
            notificationBuilder.s(1);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.u0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$46();
                }
            }, 7, (Object) null);
            notificationBuilder.M(Uri.parse(notificationSound));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$45() {
        return "Setting default sound for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$46() {
        return "Setting sound for notification via uri.";
    }

    public static final void setSummaryTextIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        String summaryText = payload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.F0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$48();
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.E0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$47();
                }
            }, 7, (Object) null);
            AbstractC4862t.b(notificationBuilder.O(summaryText));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$47() {
        return "Setting summary text for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$48() {
        return "Summary text not present. Not setting summary text for notification.";
    }

    public static final void setTickerIfPresent(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.D0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setTickerIfPresent$lambda$32();
            }
        }, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null) {
            return;
        }
        notificationBuilder.P(titleText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTickerIfPresent$lambda$32() {
        return "Setting ticker for notification";
    }

    public static final void setTitleIfPresent(m.e notificationBuilder, BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.J0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.setTitleIfPresent$lambda$30();
            }
        }, 7, (Object) null);
        String titleText = payload.getTitleText();
        if (titleText == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return;
        }
        notificationBuilder.o(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTitleIfPresent$lambda$30() {
        return "Setting title for notification";
    }

    public static final void setVisibilityIfPresentAndSupported(m.e notificationBuilder, BrazeNotificationPayload payload) {
        AbstractC4862t.e(notificationBuilder, "notificationBuilder");
        AbstractC4862t.e(payload, "payload");
        final Integer notificationVisibility = payload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.B0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$56(notificationVisibility);
                    }
                }, 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.A0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$55();
                    }
                }, 7, (Object) null);
                AbstractC4862t.b(notificationBuilder.T(notificationVisibility.intValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$55() {
        return "Setting visibility for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$56(Integer num) {
        return "Received invalid notification visibility " + num;
    }

    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider configurationProvider, Bundle notificationExtras) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(notificationExtras, null, context, configurationProvider, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$22() {
        return "Not waking this TV UI mode device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$23() {
        return "Failed to check for TV status during screen wake. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$24() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$25(NotificationChannel notificationChannel) {
        return "Not acquiring wake-lock for Android O+ notification with importance: " + notificationChannel.getImportance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$26() {
        return "Waking screen for notification";
    }

    public final void routeUserWithNotificationOpenedIntent$android_sdk_ui_release(Context context, Bundle extras, final String deepLink, final boolean useWebView) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(extras, "extras");
        Braze.Companion companion = Braze.INSTANCE;
        if (companion.isDelayedInitializationEnabled() || deepLink == null || F.k0(deepLink)) {
            final Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
            context.startActivity(mainActivityIntent);
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.d0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$6(deepLink);
                    }
                }, 7, (Object) null);
                return;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.e0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$7(mainActivityIntent);
                    }
                }, 7, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.f0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$8(deepLink, useWebView);
            }
        }, 7, (Object) null);
        extras.putString("uri", deepLink);
        extras.putBoolean("ab_use_webview", useWebView);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.INSTANCE;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(deepLink, extras, useWebView, Channel.PUSH);
        if (uriActionCreateUriActionFromUrlString != null) {
            companion2.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload payload) {
        BrazeConfigurationProvider configurationProvider;
        AbstractC4862t.e(payload, "payload");
        Context context = payload.getContext();
        if (context == null || (configurationProvider = payload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = payload.getNotificationExtras();
        if (!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("uimode");
            AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.W0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$22();
                    }
                }, 7, (Object) null);
                return false;
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: l5.X0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$23();
                }
            }, 4, (Object) null);
        }
        Object systemService2 = context.getSystemService("notification");
        AbstractC4862t.c(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        final NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
        if (validNotificationChannel == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.L
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$24();
                }
            }, 7, (Object) null);
            return false;
        }
        if (validNotificationChannel.getImportance() == 1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.M
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$25(validNotificationChannel);
                }
            }, 7, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.N
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$26();
            }
        }, 7, (Object) null);
        Object systemService3 = context.getSystemService("power");
        AbstractC4862t.c(systemService3, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
        wakeLockNewWakeLock.acquire();
        wakeLockNewWakeLock.release();
        return true;
    }

    private final void sendPushActionIntent(Context context, final Intent pushIntent, Bundle notificationExtras) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: l5.m0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeNotificationUtils.sendPushActionIntent$lambda$79(pushIntent);
            }
        }, 6, (Object) null);
        if (notificationExtras != null) {
            pushIntent.putExtras(notificationExtras);
        }
        IntentUtils.addComponentAndSendBroadcast(context, pushIntent);
    }
}
