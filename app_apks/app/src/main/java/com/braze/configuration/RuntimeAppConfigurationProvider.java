package com.braze.configuration;

import Od.F;
import android.content.Context;
import com.braze.BrazeInternal;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.storage.r2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.i;
import com.braze.support.k;
import gc.C4179C;
import gc.C4206t;
import ge.C4231e;
import ge.w0;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u00020\f\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¢\u0006\u0004\b%\u0010&J5\u0010(\u001a\u00020\f\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R \u0010,\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0014\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "T", "Ljava/util/EnumSet;", "enumSet", "Lcom/braze/enums/DataStoreKey;", "key", "Lfc/H;", "putEnumSet", "(Ljava/util/EnumSet;Lcom/braze/enums/DataStoreKey;)V", "Lcom/braze/configuration/BrazeConfig;", "config", "setConfiguration", "(Lcom/braze/configuration/BrazeConfig;)V", "clearAllConfigurationValues", "()V", "", "defaultValue", "getStringValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getIntValue", "(Ljava/lang/String;I)I", "", "getBooleanValue", "(Ljava/lang/String;Z)Z", "", "getStringSetValue", "(Ljava/lang/String;)Ljava/util/Set;", "containsKey", "(Ljava/lang/String;)Z", "value", "putEnumAsString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Enum;)V", "updateValue", "updateEnumSetData", "(Lcom/braze/enums/DataStoreKey;Ljava/util/EnumSet;)V", "Landroid/content/Context;", "Lcom/braze/storage/r2;", "configDataStoreProvider", "Lcom/braze/storage/r2;", "getConfigDataStoreProvider$android_sdk_base_release", "()Lcom/braze/storage/r2;", "getConfigDataStoreProvider$android_sdk_base_release$annotations", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RuntimeAppConfigurationProvider {
    private final r2 configDataStoreProvider;
    private final Context context;

    public RuntimeAppConfigurationProvider(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
        this.configDataStoreProvider = new r2(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clearAllConfigurationValues$lambda$44() {
        return "Clearing Braze Override configuration cache";
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, DataStoreKey key) {
        String strB;
        if (enumSet == null) {
            return;
        }
        Set setA = k.a(enumSet);
        r2 r2Var = this.configDataStoreProvider;
        List listV0 = C4179C.V0(setA);
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(key), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                aVar.d();
                strB = aVar.b(new C4231e(w0.f35762a), listV0);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            r2Var.writeData(key, strB);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new p0(key), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setConfiguration$lambda$0(BrazeConfig brazeConfig) {
        return "Setting Braze Override configuration with config: " + brazeConfig;
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.x
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return RuntimeAppConfigurationProvider.clearAllConfigurationValues$lambda$44();
            }
        }, 7, (Object) null);
        this.configDataStoreProvider.clearAllData();
    }

    public final boolean containsKey(String key) {
        AbstractC4862t.e(key, "key");
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(key);
        if (dataStoreKeyA != null) {
            return this.configDataStoreProvider.contains(dataStoreKeyA);
        }
        return false;
    }

    public final boolean getBooleanValue(String key, boolean defaultValue) {
        Boolean bool;
        AbstractC4862t.e(key, "key");
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(key);
        return (dataStoreKeyA == null || (bool = this.configDataStoreProvider.readBoolean(dataStoreKeyA, Boolean.valueOf(defaultValue))) == null) ? defaultValue : bool.booleanValue();
    }

    public final int getIntValue(String key, int defaultValue) {
        Integer num;
        AbstractC4862t.e(key, "key");
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(key);
        return (dataStoreKeyA == null || (num = this.configDataStoreProvider.readInt(dataStoreKeyA, Integer.valueOf(defaultValue))) == null) ? defaultValue : num.intValue();
    }

    public final Set<String> getStringSetValue(String key) {
        Iterable arrayList;
        List listK;
        AbstractC4862t.e(key, "key");
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(key);
        if (dataStoreKeyA != null) {
            r2 r2Var = this.configDataStoreProvider;
            if (dataStoreKeyA.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(dataStoreKeyA), 12, (Object) null);
                arrayList = new ArrayList();
            } else {
                try {
                    Object data = r2Var.readData(dataStoreKeyA, "");
                    AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) data;
                    if (F.k0(str)) {
                        arrayList = new ArrayList();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                            listK = C4206t.k();
                        } else {
                            try {
                                AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                                aVar.d();
                                listK = (List) aVar.a(new C4231e(w0.f35762a), str);
                            } catch (Exception e10) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                                listK = C4206t.k();
                            }
                        }
                        arrayList = C4179C.X0(listK);
                    }
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(dataStoreKeyA), 8, (Object) null);
                    arrayList = new ArrayList();
                }
            }
            if (arrayList != null) {
                return C4179C.Y0(arrayList);
            }
        }
        return null;
    }

    public final String getStringValue(String key, String defaultValue) {
        AbstractC4862t.e(key, "key");
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(key);
        if (dataStoreKeyA != null) {
            return this.configDataStoreProvider.readString(dataStoreKeyA, defaultValue);
        }
        return null;
    }

    public final void putEnumAsString(DataStoreKey key, Enum<?> value) {
        AbstractC4862t.e(key, "key");
        if (value != null) {
            this.configDataStoreProvider.writeData(key, value.toString());
        }
    }

    public final void setConfiguration(final BrazeConfig config) {
        AbstractC4862t.e(config, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.w
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return RuntimeAppConfigurationProvider.setConfiguration$lambda$0(config);
            }
        }, 6, (Object) null);
        String str = config.apiKey;
        if (str != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.API_KEY, str);
        }
        String str2 = config.serverTarget;
        if (str2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SERVER_TARGET, str2);
        }
        putEnumAsString(DataStoreKey.SDK_FLAVOR, config.sdkFlavor);
        String str3 = config.customEndpoint;
        if (str3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CUSTOM_ENDPOINT, str3);
        }
        String str4 = config.smallNotificationIcon;
        if (str4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SMALL_NOTIFICATION_ICON, str4);
        }
        String str5 = config.largeNotificationIcon;
        if (str5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.LARGE_NOTIFICATION_ICON, str5);
        }
        Integer num = config.sessionTimeout;
        if (num != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SESSION_TIMEOUT, Integer.valueOf(num.intValue()));
        }
        Integer num2 = config.defaultNotificationAccentColor;
        if (num2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_ACCENT_COLOR, Integer.valueOf(num2.intValue()));
        }
        Integer num3 = config.triggerActionMinimumTimeIntervalSeconds;
        if (num3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS, Integer.valueOf(num3.intValue()));
        }
        Boolean bool = config.isAdmMessagingRegistrationEnabled;
        if (bool != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.ADM_MESSAGING_REGISTRATION_ENABLED, bool);
        }
        Boolean bool2 = config.willHandlePushDeepLinksAutomatically;
        if (bool2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, bool2);
        }
        Boolean bool3 = config.isAutomaticLocationCollectionEnabled;
        if (bool3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.AUTOMATIC_LOCATION_COLLECTION, bool3);
        }
        Integer num4 = config.badNetworkInterval;
        if (num4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_BAD_NETWORK_INTERVAL, Integer.valueOf(num4.intValue()));
        }
        Integer num5 = config.goodNetworkInterval;
        if (num5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_GOOD_NETWORK_INTERVAL, Integer.valueOf(num5.intValue()));
        }
        Integer num6 = config.greatNetworkInterval;
        if (num6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_GREAT_NETWORK_INTERVAL, Integer.valueOf(num6.intValue()));
        }
        String str6 = config.defaultNotificationChannelName;
        if (str6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_CHANNEL_NAME, str6);
        }
        String str7 = config.defaultNotificationChannelDescription;
        if (str7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, str7);
        }
        Boolean bool4 = config.isPushDeepLinkBackStackActivityEnabled;
        if (bool4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED, bool4);
        }
        String str8 = config.pushDeepLinkBackStackActivityClassName;
        if (str8 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME, str8);
        }
        Boolean bool5 = config.isSessionStartBasedTimeoutEnabled;
        if (bool5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SESSION_START_BASED_TIMEOUT_ENABLED, bool5);
        }
        Boolean bool6 = config.isFirebaseCloudMessagingRegistrationEnabled;
        if (bool6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED, bool6);
        }
        String str9 = config.firebaseCloudMessagingSenderIdKey;
        if (str9 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_CLOUD_MESSAGING_SENDER_ID, str9);
        }
        Boolean bool7 = config.isContentCardsUnreadVisualIndicatorEnabled;
        if (bool7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, bool7);
        }
        Boolean bool8 = config.isDeviceObjectAllowlistEnabled;
        if (bool8 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEVICE_OBJECT_ALLOWLISTING_ENABLED, bool8);
        }
        Boolean bool9 = config.isInAppMessageAccessibilityExclusiveModeEnabled;
        if (bool9 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, bool9);
        }
        Boolean bool10 = config.isPushWakeScreenForNotificationEnabled;
        if (bool10 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, bool10);
        }
        Boolean bool11 = config.isPushHtmlRenderingEnabled;
        if (bool11 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, bool11);
        }
        Boolean bool12 = config.doesPushStoryDismissOnClick;
        if (bool12 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DOES_PUSH_STORY_DISMISS_ON_CLICK, bool12);
        }
        Boolean bool13 = config.areGeofencesEnabled;
        if (bool13 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.GEOFENCES_ENABLED_CONFIG, bool13);
        }
        Boolean bool14 = config.isInAppMessageTestPushEagerDisplayEnabled;
        if (bool14 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, bool14);
        }
        String str10 = config.customHtmlWebViewActivityClassName;
        if (str10 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME, str10);
        }
        Boolean bool15 = config.areAutomaticGeofenceRequestsEnabled;
        if (bool15 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED, bool15);
        }
        Integer num7 = config.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        if (num7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT, Integer.valueOf(num7.intValue()));
        }
        Boolean bool16 = config.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        if (bool16 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN, bool16);
        }
        Boolean bool17 = config.isSdkAuthEnabled;
        if (bool17 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SDK_AUTH_ENABLED, bool17);
        }
        Boolean bool18 = config.isTouchModeRequiredForHtmlInAppMessages;
        if (bool18 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS, bool18);
        }
        Boolean bool19 = config.isHtmlInAppMessageHtmlLinkTargetEnabled;
        if (bool19 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET, bool19);
        }
        putEnumSet(config.deviceObjectAllowlist, DataStoreKey.DEVICE_OBJECT_ALLOWLIST);
        putEnumSet(config.customLocationProviderNames, DataStoreKey.CUSTOM_LOCATION_PROVIDERS_LIST);
        EnumSet<BrazeSdkMetadata> enumSet = config.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData(DataStoreKey.SDK_METADATA_CONFIG, enumSet);
        }
        Boolean bool20 = config.isFallbackFirebaseMessagingServiceEnabled;
        if (bool20 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FALLBACK_FCM_SERVICE_ENABLED, bool20);
        }
        String str11 = config.fallbackFirebaseMessagingServiceClasspath;
        if (str11 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FALLBACK_FCM_SERVICE_CLASSPATH, str11);
        }
        Boolean bool21 = config.shouldOptInWhenPushAuthorized;
        if (bool21 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.OPTIN_WHEN_PUSH_AUTHORIZED, bool21);
        }
        Boolean bool22 = config.shouldUseWindowFlagSecureInActivities;
        if (bool22 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES, bool22);
        }
        Boolean bool23 = config.shouldPersistWebViewWhenBackgroundingApp;
        if (bool23 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP, bool23);
        }
        Boolean bool24 = config.shouldAddStatusBarPaddingToInAppMessages;
        if (bool24 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING, bool24);
        }
        BrazeInternal.INSTANCE.getConfigurationProvider(this.context).resetCache$android_sdk_base_release();
    }

    public final <T extends Enum<T>> void updateEnumSetData(DataStoreKey key, EnumSet<T> updateValue) {
        Iterable arrayList;
        List listK;
        String strB;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(updateValue, "updateValue");
        r2 r2Var = this.configDataStoreProvider;
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new h0(key), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = r2Var.readData(key, "");
                AbstractC4862t.c(data, "null cannot be cast to non-null type kotlin.String");
                String str = (String) data;
                if (F.k0(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (F.k0(str) || AbstractC4862t.a(F.e1(str).toString(), "null")) {
                        listK = C4206t.k();
                    } else {
                        try {
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            listK = (List) aVar.a(new C4231e(w0.f35762a), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f28625E, (Throwable) e10, false, (InterfaceC6082a) new com.braze.support.e(str), 4, (Object) null);
                            listK = C4206t.k();
                        }
                    }
                    arrayList = C4179C.X0(listK);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e11, false, (InterfaceC6082a) new i0(key), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        Set setY0 = C4179C.Y0(arrayList);
        setY0.addAll(k.a(updateValue));
        r2 r2Var2 = this.configDataStoreProvider;
        List listV0 = C4179C.V0(setY0);
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, (InterfaceC6082a) new o0(key), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
                aVar2.d();
                strB = aVar2.b(new C4231e(w0.f35762a), listV0);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.f28625E, (Throwable) e12, false, (InterfaceC6082a) i.f28638a, 4, (Object) null);
                strB = ((listV0 instanceof Map) || listV0 == null) ? "{}" : "[]";
            }
            r2Var2.writeData(key, strB);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) e13, false, (InterfaceC6082a) new p0(key), 8, (Object) null);
        }
    }
}
