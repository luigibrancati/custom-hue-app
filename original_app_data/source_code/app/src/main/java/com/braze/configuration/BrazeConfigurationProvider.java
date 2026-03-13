package com.braze.configuration;

import Od.F;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.braze.support.j;
import com.braze.support.k;
import gc.C4179C;
import gc.U;
import io.sentry.ProfilingTraceData;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 y2\u00020\u0001:\u0002\nzB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00148BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b&\u0010\u001bR\u0011\u0010'\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b3\u0010+R\u0017\u00107\u001a\u00020)8F¢\u0006\f\u0012\u0004\b6\u0010\u0013\u001a\u0004\b5\u0010+R\u0013\u00109\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R\u0011\u0010;\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b:\u0010\u001bR\u0011\u0010=\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b<\u0010\u0016R\u0011\u0010?\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0011\u0010A\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b@\u0010+R\u0017\u0010D\u001a\u00020)8G¢\u0006\f\u0012\u0004\bC\u0010\u0013\u001a\u0004\bB\u0010+R\u0013\u0010H\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010I\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bI\u0010\u001bR\u0013\u0010K\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0016R\u0011\u0010L\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bL\u0010\u001bR\u0011\u0010M\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bM\u0010\u001bR\u0011\u0010N\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u0010\u001bR\u0013\u0010P\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bO\u0010\u0016R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0\f8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010U\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bU\u0010\u001bR\u0011\u0010V\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bV\u0010\u001bR\u0011\u0010W\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bW\u0010\u001bR\u0011\u0010X\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bX\u0010\u001bR\u0011\u0010Z\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bY\u0010\u001bR\u0011\u0010[\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b[\u0010\u001bR\u0011\u0010\\\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\\\u0010\u001bR\u0011\u0010^\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b]\u0010+R\u0013\u0010`\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b_\u0010\u0016R\u0011\u0010b\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\ba\u0010+R\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020c0\f8F¢\u0006\u0006\u001a\u0004\bd\u0010SR\u0011\u0010f\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bf\u0010\u001bR\u0011\u0010g\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bg\u0010\u001bR\u0011\u0010h\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bh\u0010\u001bR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020i0\f8F¢\u0006\u0006\u001a\u0004\bj\u0010SR\u0011\u0010m\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bl\u0010\u001bR\u0011\u0010o\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bn\u0010\u001bR\u0011\u0010p\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bp\u0010\u001bR\u0011\u0010t\u001a\u00020q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010v\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bu\u0010\u001bR\u0011\u0010x\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bw\u0010\u001b¨\u0006{"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/configuration/CachedConfigurationProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "E", "Ljava/lang/Class;", "targetEnumClass", "Lcom/braze/configuration/b;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "(Ljava/lang/Class;Lcom/braze/configuration/b;)Ljava/util/EnumSet;", "Landroid/content/Context;", "getContext$android_sdk_base_release", "()Landroid/content/Context;", "getContext$android_sdk_base_release$annotations", "()V", "", "getServerTarget", "()Ljava/lang/String;", "getServerTarget$annotations", "serverTarget", "", "isEphemeralEventsEnabled", "()Z", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "baseUrlForRequests", "Lcom/braze/models/outgoing/b;", "getBrazeApiKey", "()Lcom/braze/models/outgoing/b;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isAutomaticLocationCollectionEnabled", "isGeofencesEnabled", "", "getSmallNotificationIconResourceId", "()I", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getVersionCode", "getVersionCode$annotations", "versionCode", "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/braze/enums/DeviceKey;", "getDeviceObjectAllowlist", "()Ljava/util/EnumSet;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "getDoesPushStoryDismissOnClick", "doesPushStoryDismissOnClick", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/braze/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isHtmlInAppMessageHtmlLinkTargetEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "getSdkMetadata", "sdkMetadata", "getShouldOptInWhenPushAuthorized", "shouldOptInWhenPushAuthorized", "getShouldUseWindowFlagSecureInActivities", "shouldUseWindowFlagSecureInActivities", "isDelayedInitializationEnabled", "Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "getDelayedInitializationAnalyticsBehavior", "()Lcom/braze/enums/DelayedInitializationAnalyticsBehavior;", "delayedInitializationAnalyticsBehavior", "getShouldPersistWebViewWhenBackgroundingApp", "shouldPersistWebViewWhenBackgroundingApp", "getShouldAddStatusBarPaddingToInAppMessages", "shouldAddStatusBarPaddingToInAppMessages", "Companion", "com/braze/configuration/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final a Companion = new a();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        AbstractC4862t.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_applicationIconResourceId_$lambda$12(String str) {
        return "Couldn't find application icon for package: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$1() {
        return "Found an override api key. Using it to configure the Braze SDK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$10() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$2() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$3() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$4() {
        return "**                 !! WARNING !!                  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$5() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$6() {
        return "**     No API key set in res/values/braze.xml     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$7() {
        return "** No cached API Key found from Braze.configure   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$8() {
        return "**          Braze functionality disabled          **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$9() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_defaultNotificationAccentColor_$lambda$13() {
        return "Using default notification accent color found in resources";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_ephemeralEventKeys_$lambda$0() {
        return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_sdkFlavor_$lambda$14() {
        return "Exception while parsing stored SDK flavor. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_versionCode_$lambda$11() {
        return "Unable to read the version code.";
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> targetEnumClass, b configField) {
        String str = configField.f27570a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(configField.f27570a, new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> enumSetA = k.a(targetEnumClass, stringSetValue);
        getConfigurationCache().put(str, enumSetA);
        return enumSetA;
    }

    private final String getServerTarget() {
        b bVar = b.f27567b;
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final int getApplicationIconResourceId() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        final String packageName = this.context.getPackageName();
        int i10 = 0;
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L)) : this.context.getPackageManager().getApplicationInfo(packageName, 0);
            AbstractC4862t.b(applicationInfo);
            i10 = applicationInfo.icon;
            brazeConfigurationProvider = this;
        } catch (Exception e10) {
            brazeConfigurationProvider = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeConfigurationProvider, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: V4.e
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeConfigurationProvider._get_applicationIconResourceId_$lambda$12(packageName);
                }
            }, 4, (Object) null);
        }
        brazeConfigurationProvider.getConfigurationCache().put("application_icon", Integer.valueOf(i10));
        return i10;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale US = Locale.US;
        AbstractC4862t.d(US, "US");
        String upperCase = serverTarget.toUpperCase(US);
        AbstractC4862t.d(upperCase, "toUpperCase(...)");
        return AbstractC4862t.a("STAGING", upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final com.braze.models.outgoing.b getBrazeApiKey() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        b bVar = b.f27567b;
        String stringValue = (String) getConfigurationCache().get("com_braze_api_key");
        if (stringValue == null) {
            stringValue = getRuntimeAppConfigurationProvider().getStringValue("com_braze_api_key", null);
            if (stringValue != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.h
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeConfigurationProvider._get_brazeApiKey_$lambda$1();
                    }
                }, 6, (Object) null);
                brazeConfigurationProvider = this;
            } else {
                brazeConfigurationProvider = this;
                stringValue = brazeConfigurationProvider.getStringValue("com_braze_api_key", null);
            }
            if (stringValue != null) {
                brazeConfigurationProvider.getConfigurationCache().put("com_braze_api_key", stringValue);
            }
        } else {
            brazeConfigurationProvider = this;
        }
        if (stringValue != null) {
            return new com.braze.models.outgoing.b(stringValue);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f28628W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeConfigurationProvider, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$2();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$3();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$4();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.l
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$5();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$6();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.n
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$7();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.o
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$8();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.p
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$9();
            }
        }, 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$10();
            }
        }, 6, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final String getCustomEndpoint() {
        b bVar = b.f27567b;
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        b bVar = b.f27567b;
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, b.f27568c);
    }

    public final int getDefaultNotificationAccentColor() {
        b bVar = b.f27567b;
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeConfigurationProvider._get_defaultNotificationAccentColor_$lambda$13();
            }
        }, 7, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        b bVar = b.f27567b;
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        b bVar = b.f27567b;
        String stringValue = getStringValue("com_braze_default_notification_channel_name", "General");
        return stringValue == null ? "General" : stringValue;
    }

    public final DelayedInitializationAnalyticsBehavior getDelayedInitializationAnalyticsBehavior() {
        DelayedInitializationAnalyticsBehavior.Companion companion = DelayedInitializationAnalyticsBehavior.INSTANCE;
        b bVar = b.f27567b;
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
        String stringValue = getStringValue("com_braze_delayed_initialization_analytics_behavior", delayedInitializationAnalyticsBehavior.getValue());
        if (stringValue == null) {
            stringValue = delayedInitializationAnalyticsBehavior.getValue();
        }
        return companion.fromString(stringValue);
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, b.f27567b);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final Set<String> getEphemeralEventKeys() {
        b bVar = b.f27567b;
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", U.d());
        if (stringSetValue == null) {
            stringSetValue = U.d();
        }
        if (stringSetValue.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.d
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeConfigurationProvider._get_ephemeralEventKeys_$lambda$0();
                }
            }, 6, (Object) null);
        }
        return C4179C.Z0(C4179C.M0(stringSetValue, 12));
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        b bVar = b.f27567b;
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        b bVar = b.f27567b;
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        b bVar = b.f27567b;
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        b bVar = b.f27567b;
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        b bVar = b.f27567b;
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final SdkFlavor getSdkFlavor() {
        b bVar = b.f27567b;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue != null && !F.k0(stringValue)) {
            try {
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                String upperCase = stringValue.toUpperCase(US);
                AbstractC4862t.d(upperCase, "toUpperCase(...)");
                return SdkFlavor.valueOf(upperCase);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: V4.g
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeConfigurationProvider._get_sdkFlavor_$lambda$14();
                    }
                }, 4, (Object) null);
            }
        }
        return null;
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        int i10;
        b bVar = b.f27567b;
        d dVar = d.f27576g;
        Object resourceConfigurationValue = getResourceConfigurationValue(dVar, "com_braze_internal_sdk_metadata", new HashSet());
        AbstractC4862t.c(resourceConfigurationValue, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        Set<String> setE = T.e(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(dVar, "com_braze_sdk_metadata", new HashSet());
        AbstractC4862t.c(resourceConfigurationValue2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(dVar, "com_braze_sdk_metadata", new HashSet());
        AbstractC4862t.c(runtimeConfigurationValue, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        setE.addAll((Set) resourceConfigurationValue2);
        setE.addAll((Set) runtimeConfigurationValue);
        EnumSet<BrazeSdkMetadata> enumSetNoneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : setE) {
            try {
                Locale US = Locale.US;
                AbstractC4862t.d(US, "US");
                upperCase = str.toUpperCase(US);
                AbstractC4862t.d(upperCase, "toUpperCase(...)");
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k.f28640a, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new j(str), 4, (Object) null);
            }
            for (BrazeSdkMetadata brazeSdkMetadata : BrazeSdkMetadata.values()) {
                if (AbstractC4862t.a(brazeSdkMetadata.name(), upperCase)) {
                    enumSetNoneOf.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        AbstractC4862t.b(enumSetNoneOf);
        return enumSetNoneOf;
    }

    public final int getSessionTimeoutSeconds() {
        b bVar = b.f27567b;
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final boolean getShouldAddStatusBarPaddingToInAppMessages() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_in_app_message_add_status_bar_padding", false);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldPersistWebViewWhenBackgroundingApp() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_persist_webview_when_backgrounding_app", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        b bVar = b.f27567b;
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        b bVar = b.f27567b;
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() {
        BrazeConfigurationProvider brazeConfigurationProvider;
        int i10;
        if (getConfigurationCache().containsKey(ProfilingTraceData.JsonKeys.VERSION_CODE)) {
            Object obj = getConfigurationCache().get(ProfilingTraceData.JsonKeys.VERSION_CODE);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        try {
            i10 = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
            brazeConfigurationProvider = this;
        } catch (Exception e10) {
            brazeConfigurationProvider = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeConfigurationProvider, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: V4.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeConfigurationProvider._get_versionCode_$lambda$11();
                }
            }, 4, (Object) null);
            i10 = -1;
        }
        brazeConfigurationProvider.getConfigurationCache().put(ProfilingTraceData.JsonKeys.VERSION_CODE, Integer.valueOf(i10));
        return i10;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isAutomaticLocationCollectionEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDelayedInitializationEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_enable_delayed_initialization", false);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    public final boolean isEphemeralEventsEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isGeofencesEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_geofences_enabled", isAutomaticLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        b bVar = b.f27567b;
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }
}
