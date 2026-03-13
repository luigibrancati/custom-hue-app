package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import androidx.core.app.u;
import androidx.core.app.w;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.RepeatInterval;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.google.ar.core.ImageMetadata;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.SentryLogEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterLocalNotificationsPlugin implements MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener, FlutterPlugin, ActivityAware {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD = "cancelAllPendingNotifications";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String HAS_NOTIFICATION_POLICY_ACCESS_METHOD = "hasNotificationPolicyAccess";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    static final int NOTIFICATION_POLICY_ACCESS_REQUEST_CODE = 4;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION_METHOD = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD = "requestNotificationPolicyAccess";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static u9.e gson;
    private Context applicationContext;
    private com.dexterous.flutterlocalnotifications.d callback;
    private MethodChannel channel;
    private Activity mainActivity;
    private h permissionRequestProgress = h.None;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends B9.a<ArrayList<NotificationDetails>> {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements com.dexterous.flutterlocalnotifications.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f28860a;

        public b(MethodChannel.Result result) {
            this.f28860a = result;
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void a(String str) {
            this.f28860a.error(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, null);
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void b(boolean z10) {
            this.f28860a.success(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements com.dexterous.flutterlocalnotifications.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f28862a;

        public c(MethodChannel.Result result) {
            this.f28862a = result;
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void a(String str) {
            this.f28862a.error(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, null);
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void b(boolean z10) {
            this.f28862a.success(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements com.dexterous.flutterlocalnotifications.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f28864a;

        public d(MethodChannel.Result result) {
            this.f28864a = result;
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void a(String str) {
            this.f28864a.error(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, null);
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void b(boolean z10) {
            this.f28864a.success(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements com.dexterous.flutterlocalnotifications.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f28866a;

        public e(MethodChannel.Result result) {
            this.f28866a = result;
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void a(String str) {
            this.f28866a.error(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, null);
        }

        @Override // com.dexterous.flutterlocalnotifications.d
        public void b(boolean z10) {
            this.f28866a.success(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f28870c;

        static {
            int[] iArr = new int[NotificationStyle.values().length];
            f28870c = iArr;
            try {
                iArr[NotificationStyle.BigPicture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28870c[NotificationStyle.BigText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28870c[NotificationStyle.Inbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28870c[NotificationStyle.Messaging.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28870c[NotificationStyle.Media.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IconSource.values().length];
            f28869b = iArr2;
            try {
                iArr2[IconSource.DrawableResource.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28869b[IconSource.BitmapFilePath.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28869b[IconSource.ContentUri.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28869b[IconSource.FlutterBitmapAsset.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28869b[IconSource.ByteArray.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[RepeatInterval.values().length];
            f28868a = iArr3;
            try {
                iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28868a[RepeatInterval.Hourly.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28868a[RepeatInterval.Daily.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28868a[RepeatInterval.Weekly.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends i {
        public g() {
            super(FlutterLocalNotificationsPlugin.EXACT_ALARMS_PERMISSION_ERROR_CODE, "Exact alarms are not permitted");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum h {
        None,
        RequestingNotificationPermission,
        RequestingNotificationPolicyAccess,
        RequestingExactAlarmsPermission,
        RequestingFullScreenIntentPermission
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends RuntimeException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28871a;

        public i(String str, String str2) {
            super(str2);
            this.f28871a = str;
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, m.e eVar) {
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            return;
        }
        eVar.w(notificationDetails.groupKey);
        if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
            eVar.y(true);
        }
        eVar.x(notificationDetails.groupAlertBehavior.intValue());
    }

    private void areNotificationsEnabled(MethodChannel.Result result) {
        result.success(Boolean.valueOf(getNotificationManager(this.applicationContext).areNotificationsEnabled()));
    }

    public static u9.e buildGson() {
        if (gson == null) {
            gson = new u9.f().d(ScheduleMode.class, new ScheduleMode.a()).e(RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class)).b();
        }
        return gson;
    }

    private static u buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        u.b bVar = new u.b();
        bVar.b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (obj != null && (iconSource = personDetails.iconBitmapSource) != null) {
            bVar.c(getIconFromSource(context, obj, iconSource));
        }
        bVar.d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            bVar.e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            bVar.f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            bVar.g(str3);
        }
        return bVar.a();
    }

    private static long calculateNextNotificationTrigger(long j10, long j11) {
        while (j10 < System.currentTimeMillis()) {
            j10 += j11;
        }
        return j10;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        if (notificationDetails.repeatIntervalMilliseconds != null) {
            return r0.intValue();
        }
        int i10 = f.f28868a[notificationDetails.repeatInterval.ordinal()];
        if (i10 == 1) {
            return 60000L;
        }
        if (i10 == 2) {
            return 3600000L;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.f28884id);
        return Boolean.valueOf((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update));
    }

    private void cancel(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        cancelNotification((Integer) map.get("id"), (String) map.get("tag"));
        result.success(null);
    }

    private void cancelAllNotifications(MethodChannel.Result result) {
        getNotificationManager(this.applicationContext).cancelAll();
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            result.success(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f28886id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        result.success(null);
    }

    private void cancelAllPendingNotifications(MethodChannel.Result result) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (arrayListLoadScheduledNotifications == null || arrayListLoadScheduledNotifications.isEmpty()) {
            result.success(null);
            return;
        }
        AlarmManager alarmManager = getAlarmManager(this.applicationContext);
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (it.hasNext()) {
            alarmManager.cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f28886id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        result.success(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        NotificationManagerCompat notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.cancel(num.intValue());
        } else {
            notificationManager.cancel(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = (byte) ((Double) arrayList.get(i10)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (!alarmManager.canScheduleExactAlarms()) {
            throw new g();
        }
    }

    private static m.i.d createMessage(Context context, MessageDetails messageDetails) {
        String str;
        m.i.d dVar = new m.i.d(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            dVar.j(str, Uri.parse(str2));
        }
        return dVar;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        int i10;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails notificationChannelDetailsFromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, notificationChannelDetailsFromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, notificationChannelDetailsFromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.f28886id);
        launchIntent.putExtra("payload", notificationDetails.payload);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.f28886id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        m.e eVarE = new m.e(context, notificationDetails.channelId).o(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title).n(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body).P(notificationDetails.ticker).g(BooleanUtils.getValue(notificationDetails.autoCancel)).m(activity).F(notificationDetails.priority.intValue()).D(BooleanUtils.getValue(notificationDetails.ongoing)).K(BooleanUtils.getValue(notificationDetails.silent)).E(BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        int i11 = 0;
        if (notificationDetails.actions != null) {
            int iIntValue = notificationDetails.f28886id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconFromSource = (TextUtils.isEmpty(notificationAction.icon) || (iconSource = notificationAction.iconSource) == null) ? null : getIconFromSource(context, notificationAction.icon, iconSource);
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails.f28886id).putExtra(NOTIFICATION_TAG, notificationDetails.tag).putExtra(ACTION_ID, notificationAction.f28879id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra("payload", notificationDetails.payload);
                List<NotificationAction.a> list = notificationAction.actionInputs;
                int i12 = (list == null || list.isEmpty()) ? 201326592 : 167772160;
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i10 = iIntValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, iIntValue, intent, i12);
                } else {
                    i10 = iIntValue + 1;
                    broadcast = PendingIntent.getActivity(context, iIntValue, intent, i12);
                }
                iIntValue = i10;
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), i11, spannableString.length(), i11);
                }
                m.a.C0283a c0283a = new m.a.C0283a(iconFromSource, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c0283a.f(bool3.booleanValue());
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c0283a.h(bool4.booleanValue());
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c0283a.e(bool5.booleanValue());
                }
                Integer num = notificationAction.semanticAction;
                if (num != null) {
                    c0283a.g(num.intValue());
                }
                List<NotificationAction.a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (NotificationAction.a aVar : list2) {
                        w.d dVarE = new w.d(INPUT_RESULT).e(aVar.f28882c);
                        Boolean bool6 = aVar.f28881b;
                        if (bool6 != null) {
                            dVarE.c(bool6.booleanValue());
                        }
                        List list3 = aVar.f28883d;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                dVarE.b((String) it.next(), true);
                            }
                        }
                        List list4 = aVar.f28880a;
                        if (list4 != null) {
                            dVarE.d((CharSequence[]) list4.toArray(new CharSequence[0]));
                        }
                        c0283a.b(dVarE.a());
                        i11 = 0;
                    }
                }
                int i13 = i11;
                if (BooleanUtils.getValue(notificationAction.invisible)) {
                    eVarE.c(c0283a.c());
                } else {
                    eVarE.b(c0283a.c());
                }
                i11 = i13;
            }
        }
        int i14 = i11;
        setSmallIcon(context, notificationDetails, eVarE);
        eVarE.z(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num2 = notificationDetails.color;
        if (num2 != null) {
            eVarE.k(num2.intValue());
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            eVarE.l(bool7.booleanValue());
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            eVarE.J(BooleanUtils.getValue(bool8));
        }
        Long l10 = notificationDetails.when;
        if (l10 != null) {
            eVarE.U(l10.longValue());
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            eVarE.R(bool9.booleanValue());
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null) {
            eVarE.j(bool10.booleanValue());
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            eVarE.v(activity, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            eVarE.I(notificationDetails.shortcutId);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            eVarE.O(notificationDetails.subText);
        }
        Integer num3 = notificationDetails.number;
        if (num3 != null) {
            eVarE.C(num3.intValue());
        }
        setVisibility(notificationDetails, eVarE);
        applyGrouping(notificationDetails, eVarE);
        setSound(context, notificationDetails, eVarE);
        setVibrationPattern(notificationDetails, eVarE);
        setLights(notificationDetails, eVarE);
        setStyle(context, notificationDetails, eVarE);
        setProgress(notificationDetails, eVarE);
        setCategory(notificationDetails, eVarE);
        setTimeoutAfter(notificationDetails, eVarE);
        Notification notificationD = eVarE.d();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            for (int i15 = i14; i15 < length; i15++) {
                notificationD.flags = iArr[i15] | notificationD.flags;
            }
        }
        return notificationD;
    }

    private void createNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) methodCall.arguments()));
        result.success(null);
    }

    private void createNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        NotificationChannelGroupDetails notificationChannelGroupDetailsFrom = NotificationChannelGroupDetails.from((Map) methodCall.arguments());
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(notificationChannelGroupDetailsFrom.f28885id, notificationChannelGroupDetailsFrom.name);
        notificationChannelGroup.setDescription(notificationChannelGroupDetailsFrom.description);
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        result.success(null);
    }

    private void deleteNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) methodCall.arguments());
        result.success(null);
    }

    private void deleteNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) methodCall.arguments());
        result.success(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String resourceEntryName;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int iN = iconCompat.n();
        if (iN == 2) {
            IconSource iconSource2 = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.l());
            iconSource = iconSource2;
        } else {
            if (iN != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.o().toString();
        }
        HashMap map = new HashMap();
        map.put("source", Integer.valueOf(iconSource.ordinal()));
        map.put("data", resourceEntryName);
        return map;
    }

    private Map<String, Object> describePerson(u uVar) {
        if (uVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("key", uVar.d());
        map.put("name", uVar.e());
        map.put("uri", uVar.f());
        map.put("bot", Boolean.valueOf(uVar.g()));
        map.put("important", Boolean.valueOf(uVar.h()));
        map.put("icon", describeIcon(uVar.c()));
        return map;
    }

    private NotificationDetails extractNotificationDetails(MethodChannel.Result result, Map<String, Object> map) {
        NotificationDetails notificationDetailsFrom = NotificationDetails.from(map);
        if (hasInvalidIcon(result, notificationDetailsFrom.icon) || hasInvalidLargeIcon(result, notificationDetailsFrom.largeIcon, notificationDetailsFrom.largeIconBitmapSource) || hasInvalidBigPictureResources(result, notificationDetailsFrom) || hasInvalidRawSoundResource(result, notificationDetailsFrom) || hasInvalidLedDetails(result, notificationDetailsFrom)) {
            return null;
        }
        return notificationDetailsFrom;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap map = new HashMap();
        map.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        map.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        map.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        map.put("payload", intent.getStringExtra("payload"));
        Bundle bundleJ = w.j(intent);
        if (bundleJ != null) {
            map.put(INPUT, bundleJ.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            map.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return map;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    private void getActiveNotificationMessagingStyle(MethodCall methodCall, MethodChannel.Result result) {
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) methodCall.arguments();
            int iIntValue = ((Integer) map.get("id")).intValue();
            String str = (String) map.get("tag");
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() != iIntValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                }
                notification = statusBarNotification.getNotification();
            }
            notification = null;
            if (notification == null) {
                result.success(null);
                return;
            }
            m.i iVarD = m.i.d(notification);
            if (iVarD == null) {
                result.success(null);
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("groupConversation", Boolean.valueOf(iVarD.h()));
            map2.put("person", describePerson(iVarD.g()));
            map2.put("conversationTitle", iVarD.e());
            ArrayList arrayList = new ArrayList();
            for (m.i.d dVar : iVarD.f()) {
                HashMap map3 = new HashMap();
                map3.put("text", dVar.h());
                map3.put("timestamp", Long.valueOf(dVar.i()));
                map3.put("person", describePerson(dVar.g()));
                if (dVar.c() != null) {
                    map3.put("dataUri", dVar.c().toString());
                }
                if (dVar.b() != null) {
                    map3.put("dataMimeType", dVar.b());
                }
                arrayList.add(map3);
            }
            map2.put("messages", arrayList);
            result.success(map2);
        } catch (Throwable th) {
            result.error(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(MethodChannel.Result result) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap map = new HashMap();
                map.put("id", Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                map.put("channelId", notification.getChannelId());
                map.put("tag", statusBarNotification.getTag());
                map.put("groupKey", notification.getGroup());
                map.put("title", notification.extras.getCharSequence("android.title"));
                map.put(SentryLogEvent.JsonKeys.BODY, notification.extras.getCharSequence("android.text"));
                map.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(map);
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(bArrCastObjectToByteArray, 0, bArrCastObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i10, Intent intent) {
        return PendingIntent.getBroadcast(context, i10, intent, 201326592);
    }

    private void getCallbackHandle(MethodChannel.Result result) {
        result.success(new R5.a(this.applicationContext).c());
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i10 = f.f28869b[iconSource.ordinal()];
        if (i10 == 1) {
            return IconCompat.j(context, getDrawableResourceId(context, (String) obj));
        }
        if (i10 == 2) {
            return IconCompat.f(BitmapFactory.decodeFile((String) obj));
        }
        if (i10 == 3) {
            return IconCompat.h((String) obj);
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return null;
            }
            byte[] bArrCastObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.i(bArrCastObjectToByteArray, 0, bArrCastObjectToByteArray.length);
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(FlutterInjector.instance().flutterLoader().getLookupKeyForAsset((String) obj));
            FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
            IconCompat iconCompatF = IconCompat.f(BitmapFactory.decodeStream(fileInputStreamCreateInputStream));
            fileInputStreamCreateInputStream.close();
            assetFileDescriptorOpenFd.close();
            return iconCompatF;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", notificationChannel.getId());
        map.put("name", notificationChannel.getName());
        map.put("description", notificationChannel.getDescription());
        map.put("groupId", notificationChannel.getGroup());
        map.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
        map.put("importance", Integer.valueOf(notificationChannel.getImportance()));
        Uri sound = notificationChannel.getSound();
        if (sound == null) {
            map.put("sound", null);
            map.put("playSound", Boolean.FALSE);
        } else {
            map.put("playSound", Boolean.TRUE);
            List listAsList = Arrays.asList(SoundSource.values());
            if (sound.getScheme().equals("android.resource")) {
                String str = sound.toString().split("/")[r1.length - 1];
                Integer numTryParseInt = tryParseInt(str);
                if (numTryParseInt == null) {
                    map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                    map.put("sound", str);
                } else {
                    try {
                        String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(numTryParseInt.intValue());
                        if (resourceEntryName != null) {
                            map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.RawResource)));
                            map.put("sound", resourceEntryName);
                        }
                    } catch (Exception unused) {
                        map.put("sound", null);
                        map.put("playSound", Boolean.FALSE);
                    }
                }
            } else {
                map.put("soundSource", Integer.valueOf(listAsList.indexOf(SoundSource.Uri)));
                map.put("sound", sound.toString());
            }
        }
        map.put("bypassDnd", Boolean.valueOf(notificationChannel.canBypassDnd()));
        map.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
        map.put("vibrationPattern", notificationChannel.getVibrationPattern());
        map.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
        map.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
        map.put("audioAttributesUsage", Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        return map;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        }
        if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId zoneIdOf = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), zoneIdOf);
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(zoneIdOf);
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(zonedDateTimeNow.getYear(), zonedDateTimeNow.getMonthValue(), zonedDateTimeNow.getDayOfMonth(), zonedDateTimeOf.getHour(), zonedDateTimeOf.getMinute(), zonedDateTimeOf.getSecond(), zonedDateTimeOf.getNano(), zoneIdOf);
        while (zonedDateTimeOf2.isBefore(zonedDateTimeNow)) {
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (zonedDateTimeOf2.getDayOfWeek() != zonedDateTimeOf.getDayOfWeek()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (zonedDateTimeOf2.getDayOfMonth() != zonedDateTimeOf.getDayOfMonth()) {
                zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
        }
        if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        }
        while (true) {
            if (zonedDateTimeOf2.getMonthValue() == zonedDateTimeOf.getMonthValue() && zonedDateTimeOf2.getDayOfMonth() == zonedDateTimeOf.getDayOfMonth()) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTimeOf2);
            }
            zonedDateTimeOf2 = zonedDateTimeOf2.plusDays(1L);
        }
    }

    private void getNotificationAppLaunchDetails(MethodChannel.Result result) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            boolean z10 = intent != null && (SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent);
            Boolean boolValueOf = Boolean.valueOf(z10);
            if (z10) {
                map.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = boolValueOf;
        }
        map.put(NOTIFICATION_LAUNCHED_APP, bool);
        result.success(map);
    }

    private void getNotificationChannels(MethodChannel.Result result) {
        try {
            List<NotificationChannel> notificationChannels = getNotificationManager(this.applicationContext).getNotificationChannels();
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(it.next()));
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static NotificationManagerCompat getNotificationManager(Context context) {
        return NotificationManagerCompat.from(context);
    }

    private boolean hasInvalidBigPictureResources(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.style == NotificationStyle.BigPicture) {
            BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
            if (hasInvalidLargeIcon(result, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
                return true;
            }
            BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
            if (bitmapSource == BitmapSource.DrawableResource) {
                String str = (String) bigPictureStyleInformation.bigPicture;
                return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, result, INVALID_BIG_PICTURE_ERROR_CODE);
            }
            if (bitmapSource == BitmapSource.FilePath) {
                return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
            }
            if (bitmapSource == BitmapSource.ByteArray) {
                byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
                return bArr == null || bArr.length == 0;
            }
        }
        return false;
    }

    private boolean hasInvalidIcon(MethodChannel.Result result, String str) {
        return (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, result, INVALID_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLargeIcon(MethodChannel.Result result, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, result, INVALID_LARGE_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLedDetails(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        result.error(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return false;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if ((soundSource != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0) {
            return false;
        }
        result.error(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, notificationDetails.sound), null);
        return true;
    }

    private void initialize(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, result, INVALID_ICON_ERROR_CODE)) {
            Long lA = S5.a.a(methodCall.argument(DISPATCHER_HANDLE));
            Long lA2 = S5.a.a(methodCall.argument(CALLBACK_HANDLE));
            if (lA != null && lA2 != null) {
                new R5.a(this.applicationContext).e(lA, lA2);
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            result.success(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, MethodChannel.Result result, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        result.error(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, str), null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & ImageMetadata.SHADING_MODE) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().j(string, new a().d()) : arrayList;
    }

    private void pendingNotificationRequests(MethodChannel.Result result) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        for (NotificationDetails notificationDetails : arrayListLoadScheduledNotifications) {
            HashMap map = new HashMap();
            map.put("id", notificationDetails.f28886id);
            map.put("title", notificationDetails.title);
            map.put(SentryLogEvent.JsonKeys.BODY, notificationDetails.body);
            map.put("payload", notificationDetails.payload);
            arrayList.add(map);
        }
        result.success(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            NotificationManagerCompat.from(this.applicationContext).cancel(((Integer) map.get(NOTIFICATION_ID)).intValue());
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = arrayListLoadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f28886id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, arrayListLoadScheduledNotifications);
    }

    private void repeat(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (notificationDetailsExtractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                result.success(null);
            } catch (i e10) {
                result.error(e10.f28871a, e10.getMessage(), null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long jCalculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long jLongValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            jLongValue = calendar.getTimeInMillis();
        }
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(jLongValue, jCalculateRepeatIntervalMilliseconds);
        String strQ = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strQ);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f28886id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, jCalculateNextNotificationTrigger, jCalculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        for (NotificationDetails notificationDetails : loadScheduledNotifications(context)) {
            try {
                if (notificationDetails.repeatInterval != null || notificationDetails.repeatIntervalMilliseconds != null) {
                    repeatNotification(context, notificationDetails, Boolean.FALSE);
                } else if (notificationDetails.timeZoneName != null) {
                    zonedScheduleNotification(context, notificationDetails, Boolean.FALSE);
                } else {
                    scheduleNotification(context, notificationDetails, Boolean.FALSE);
                }
            } catch (g e10) {
                Log.e(TAG, e10.getMessage());
                removeNotificationFromCache(context, notificationDetails.f28886id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> arrayListLoadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        for (NotificationDetails notificationDetails2 : arrayListLoadScheduledNotifications) {
            if (!notificationDetails2.f28886id.equals(notificationDetails.f28886id)) {
                arrayList.add(notificationDetails2);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().q(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
                return;
            }
            if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            }
            if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                removeNotificationFromCache(context, notificationDetails.f28886id);
                return;
            }
            scheduleNextRepeatingNotification(context, notificationDetails);
        } catch (g e10) {
            Log.e(TAG, e10.getMessage());
            removeNotificationFromCache(context, notificationDetails.f28886id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long jCalculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String strQ = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strQ);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f28886id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, jCalculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strQ = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strQ);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.f28886id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> mapExtractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, mapExtractNotificationResponseMap);
        }
        this.channel.invokeMethod("didReceiveNotificationResponse", mapExtractNotificationResponseMap);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, m.e eVar) {
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        m.b bVar = new m.b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.f(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.g(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            bVar.c(null);
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                bVar.c(getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource));
            }
        }
        bVar.d(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.N(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, m.e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        m.c cVar = new m.c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.b(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.c(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            cVar.d(bigTextStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigTextStyleInformation.summaryText) : bigTextStyleInformation.summaryText);
        }
        eVar.N(cVar);
    }

    private void setCanScheduleExactNotifications(MethodChannel.Result result) {
        result.success(Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
    }

    private static void setCategory(NotificationDetails notificationDetails, m.e eVar) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        eVar.h(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.m$h, androidx.core.app.m$k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.core.app.m$e] */
    private static void setInboxStyle(NotificationDetails notificationDetails, m.e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        ?? hVar = new m.h();
        if (inboxStyleInformation.contentTitle != null) {
            hVar.c(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            hVar.d(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            for (String strFromHtml : arrayList) {
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    strFromHtml = fromHtml(strFromHtml);
                }
                hVar.b(strFromHtml);
            }
        }
        eVar.N(hVar);
    }

    private static void setLights(NotificationDetails notificationDetails, m.e eVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        eVar.A(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
    }

    private static void setMediaStyle(m.e eVar) {
        eVar.N(new C1.c());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, m.e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        m.i iVar = new m.i(buildPerson(context, messagingStyleInformation.person));
        iVar.j(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            iVar.i(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                iVar.b(createMessage(context, it.next()));
            }
        }
        eVar.N(iVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, m.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.G(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, m.e eVar) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            eVar.L(getDrawableResourceId(context, notificationDetails.icon));
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            eVar.L(notificationDetails.iconResourceId.intValue());
        } else {
            eVar.L(getDrawableResourceId(context, string));
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, m.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            eVar.M(retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource));
        } else {
            eVar.M(null);
        }
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, m.e eVar) {
        int i10 = f.f28870c[notificationDetails.style.ordinal()];
        if (i10 == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
            return;
        }
        if (i10 == 2) {
            setBigTextStyle(notificationDetails, eVar);
            return;
        }
        if (i10 == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i10 == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else {
            if (i10 != 5) {
                return;
            }
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, m.e eVar) {
        Long l10 = notificationDetails.timeoutAfter;
        if (l10 == null) {
            return;
        }
        eVar.Q(l10.longValue());
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, m.e eVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            eVar.S(new long[]{0});
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        eVar.S(jArr);
    }

    private static void setVisibility(NotificationDetails notificationDetails, m.e eVar) {
        int i10;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            i10 = 1;
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
                i10 = -1;
            }
        } else {
            i10 = 0;
        }
        eVar.T(i10);
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j10, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.d.c(alarmManager, 0, j10, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j10, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.d.a(alarmManager, j10, pendingIntent, pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.d.d(alarmManager, 0, j10, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            androidx.core.app.d.b(alarmManager, 0, j10, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.d.a(alarmManager, j10, pendingIntent, pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.f28884id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
        notificationChannel.setDescription(notificationChannelDetails.description);
        notificationChannel.setGroup(notificationChannelDetails.groupId);
        if (notificationChannelDetails.playSound.booleanValue()) {
            Integer num2 = notificationChannelDetails.audioAttributesUsage;
            notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(num2 != null ? num2.intValue() : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        if (BooleanUtils.getValue(notificationChannelDetails.bypassDnd)) {
            if (notificationManager.isNotificationPolicyAccessGranted()) {
                notificationChannel.setBypassDnd(true);
            } else {
                Log.w(TAG, "Channel '" + notificationChannelDetails.name + "' was set to bypass Do Not Disturb but the OS prevents it.");
            }
        }
        notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
        long[] jArr = notificationChannelDetails.vibrationPattern;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
        notificationChannel.enableLights(value);
        if (value && (num = notificationChannelDetails.ledColor) != null) {
            notificationChannel.setLightColor(num.intValue());
        }
        notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void show(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (notificationDetailsExtractNotificationDetails != null) {
            showNotification(this.applicationContext, notificationDetailsExtractNotificationDetails);
            result.success(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification notificationCreateNotification = createNotification(context, notificationDetails);
        NotificationManagerCompat notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.notify(str, notificationDetails.f28886id.intValue(), notificationCreateNotification);
        } else {
            notificationManager.notify(notificationDetails.f28886id.intValue(), notificationCreateNotification);
        }
    }

    private void startForegroundService(MethodCall methodCall, MethodChannel.Result result) {
        Map<String, Object> map = (Map) methodCall.argument("notificationData");
        Integer num = (Integer) methodCall.argument("startType");
        ArrayList arrayList = (ArrayList) methodCall.argument("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            result.error("ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!", null);
            return;
        }
        if (map == null || num == null) {
            result.error("ARGUMENT_ERROR", "An argument passed to startForegroundService was null!", null);
            return;
        }
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(result, map);
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.f28886id.intValue() == 0) {
                result.error("ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!", null);
                return;
            }
            com.dexterous.flutterlocalnotifications.c cVar = new com.dexterous.flutterlocalnotifications.c(notificationDetailsExtractNotificationDetails, num.intValue(), arrayList);
            Intent intent = new Intent(this.applicationContext, (Class<?>) com.dexterous.flutterlocalnotifications.b.class);
            intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", cVar);
            L0.a.q(this.applicationContext, intent);
            result.success(null);
        }
    }

    private void stopForegroundService(MethodChannel.Result result) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) com.dexterous.flutterlocalnotifications.b.class));
        result.success(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails notificationDetailsExtractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (notificationDetailsExtractNotificationDetails != null) {
            if (notificationDetailsExtractNotificationDetails.matchDateTimeComponents != null) {
                notificationDetailsExtractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(notificationDetailsExtractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, notificationDetailsExtractNotificationDetails, Boolean.TRUE);
                result.success(null);
            } catch (i e10) {
                result.error(e10.f28871a, e10.getMessage(), null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String strQ = buildGson().q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, strQ);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.f28886id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void hasNotificationPolicyAccess(MethodChannel.Result result) {
        result.success(Boolean.valueOf(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()));
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            return false;
        }
        if (this.permissionRequestProgress == h.RequestingExactAlarmsPermission && i10 == 2) {
            this.callback.b(getAlarmManager(this.applicationContext).canScheduleExactAlarms());
            this.permissionRequestProgress = h.None;
        }
        if (this.permissionRequestProgress == h.RequestingFullScreenIntentPermission && i10 == 3 && Build.VERSION.SDK_INT >= 34) {
            this.callback.b(((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent());
            this.permissionRequestProgress = h.None;
        }
        if (this.permissionRequestProgress == h.RequestingNotificationPolicyAccess && i10 == 4) {
            this.callback.b(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted());
            this.permissionRequestProgress = h.None;
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        Intent intent = activity.getIntent();
        if (launchedActivityFromHistory(intent) || !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return;
        }
        processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), METHOD_CHANNEL);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "stopForegroundService":
                stopForegroundService(result);
                break;
            case "getNotificationChannels":
                getNotificationChannels(result);
                break;
            case "deleteNotificationChannelGroup":
                deleteNotificationChannelGroup(methodCall, result);
                break;
            case "requestNotificationsPermission":
                requestNotificationsPermission(new b(result));
                break;
            case "hasNotificationPolicyAccess":
                hasNotificationPolicyAccess(result);
                break;
            case "cancel":
                cancel(methodCall, result);
                break;
            case "requestExactAlarmsPermission":
                requestExactAlarmsPermission(new c(result));
                break;
            case "requestFullScreenIntentPermission":
                requestFullScreenIntentPermission(new d(result));
                break;
            case "pendingNotificationRequests":
                pendingNotificationRequests(result);
                break;
            case "cancelAllPendingNotifications":
                cancelAllPendingNotifications(result);
                break;
            case "getNotificationAppLaunchDetails":
                getNotificationAppLaunchDetails(result);
                break;
            case "show":
                show(methodCall, result);
                break;
            case "periodicallyShow":
                repeat(methodCall, result);
                break;
            case "getActiveNotificationMessagingStyle":
                getActiveNotificationMessagingStyle(methodCall, result);
                break;
            case "cancelAll":
                cancelAllNotifications(result);
                break;
            case "zonedSchedule":
                zonedSchedule(methodCall, result);
                break;
            case "createNotificationChannelGroup":
                createNotificationChannelGroup(methodCall, result);
                break;
            case "getCallbackHandle":
                getCallbackHandle(result);
                break;
            case "initialize":
                initialize(methodCall, result);
                break;
            case "areNotificationsEnabled":
                areNotificationsEnabled(result);
                break;
            case "canScheduleExactNotifications":
                setCanScheduleExactNotifications(result);
                break;
            case "deleteNotificationChannel":
                deleteNotificationChannel(methodCall, result);
                break;
            case "startForegroundService":
                startForegroundService(methodCall, result);
                break;
            case "getActiveNotifications":
                getActiveNotifications(result);
                break;
            case "createNotificationChannel":
                createNotificationChannel(methodCall, result);
                break;
            case "requestNotificationPolicyAccess":
                requestNotificationPolicyAccess(new e(result));
                break;
            case "periodicallyShowWithDuration":
                repeat(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean zBooleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (zBooleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return zBooleanValue;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = false;
        if (this.permissionRequestProgress == h.RequestingNotificationPermission && i10 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            this.callback.b(z10);
            this.permissionRequestProgress = h.None;
        }
        return z10;
    }

    public void requestExactAlarmsPermission(com.dexterous.flutterlocalnotifications.d dVar) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.None;
        if (hVar != hVar2) {
            dVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = dVar;
        if (getAlarmManager(this.applicationContext).canScheduleExactAlarms()) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
            return;
        }
        this.permissionRequestProgress = h.RequestingExactAlarmsPermission;
        this.mainActivity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
    }

    public void requestFullScreenIntentPermission(com.dexterous.flutterlocalnotifications.d dVar) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.None;
        if (hVar != hVar2) {
            dVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = dVar;
        if (Build.VERSION.SDK_INT < 34) {
            dVar.b(true);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        getAlarmManager(this.applicationContext);
        if (notificationManager.canUseFullScreenIntent()) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
            return;
        }
        this.permissionRequestProgress = h.RequestingFullScreenIntentPermission;
        this.mainActivity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
    }

    public void requestNotificationPolicyAccess(com.dexterous.flutterlocalnotifications.d dVar) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.None;
        if (hVar != hVar2) {
            dVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = dVar;
        if (((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
        } else {
            this.permissionRequestProgress = h.RequestingNotificationPolicyAccess;
            this.mainActivity.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 4);
        }
    }

    public void requestNotificationsPermission(com.dexterous.flutterlocalnotifications.d dVar) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.None;
        if (hVar != hVar2) {
            dVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = dVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.b(NotificationManagerCompat.from(this.mainActivity).areNotificationsEnabled());
        } else if (L0.a.a(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
        } else {
            this.permissionRequestProgress = h.RequestingNotificationPermission;
            androidx.core.app.a.v(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
