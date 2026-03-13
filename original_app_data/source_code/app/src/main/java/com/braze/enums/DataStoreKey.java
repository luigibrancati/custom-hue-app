package com.braze.enums;

import Bc.k;
import com.braze.enums.DataStoreKey;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.api.Endpoint;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4207u;
import gc.P;
import io.sentry.ProfilingTraceData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0003\b±\u0001\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001¨\u0006µ\u0001"}, d2 = {"Lcom/braze/enums/DataStoreKey;", "", "", "key", "Lcom/braze/enums/DataStoreValueType;", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/braze/enums/DataStoreValueType;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lcom/braze/enums/DataStoreValueType;", "getType", "()Lcom/braze/enums/DataStoreValueType;", "Companion", "com/braze/enums/b", "GEOFENCES", "REGISTERED_GEOFENCES", "GLOBAL_LAST_REQUEST", "GLOBAL_LAST_REPORT", "INDIVIDUAL_REELIGIBILITY_MAP", "FEATURE_FLAGS", "LAST_REFRESH_IN_SECONDS", "FEATURE_FLAGS_IMPRESSIONS_MAP", "CONTENT_CARDS", "DISMISSED_CARDS", "EXPIRED_CARDS", "TEST_CARDS", "LAST_CARD_UPDATED_AT", "LAST_FULL_CARD_SYNC_AT", "LAST_CARD_STORAGE_UPDATE_TIMESTAMP", "LAST_ACCESSED_SDK_VERSION", "TRIGGERED_ACTIONS", "TRIGGERED_ACTIONS_IMPRESSION_MAP", "BANNERS", "BANNERS_IMPRESSION_MAP", "MITE_KEY", "DUST_HOST", "DUST_AUTH", "DUST_RCS", "SDK_METADATA", "PUSH_MAX_LAST_UPDATE", "PUSH_MAX_CAMPAIGNS", "PUSH_DELIVERY_EVENTS", "SDK_AUTH", "SDK_ENABLEMENT", "CONFIG_TIME", "EPHEMERAL_EVENTS_ENABLED", "GEOFENCES_ENABLED_SET", "GEOFENCES_ENABLED", "GEOFENCES_MIN_TIME_REQUEST", "GEOFENCES_MIN_TIME_REPORT", "GEOFENCES_MAX_NUM_TO_REGISTER", "MESSAGING_SESSION_TIMEOUT", "DUST_ENABLED", "DUST_SHOULD_BLOCK_CC_REFRESH", "BLOCKLISTED_EVENTS", "BLOCKLISTED_ATTRIBUTES", "BLOCKLISTED_PURCHASES", "CONTENT_CARDS_ENABLED", "FEATURE_FLAGS_ENABLED", "FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT", "PUSH_MAX_ENABLED", "PUSH_MAX_REDELIVER_BUFFER", "PUSH_MAX_REDELIVER_DEDUPE_BUFFER", "GLOBAL_REQUEST_RATE_LIMITING_ENABLED", "GLOBAL_REQUEST_RATE_LIMITING_CAPACITY", "GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE", "GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES", "DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS", "DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS", "DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR", "SDK_DEBUGGER_ENABLED", "SDK_DEBUGGER_EXPIRATION_TIME", "SDK_DEBUGGER_AUTHORIZATION_CODE", "SDK_DEBUGGER_FLUSH_INTERVAL_BYTES", "SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS", "SDK_DEBUGGER_MAX_PAYLOAD_BYTES", "BANNERS_ENABLED", "MAX_BANNER_PLACEMENTS", "PUSH_REGISTRATION_VERSION_CODE", "PUSH_REGISTRATION_PERSISTENT_DEVICE_ID", "PUSH_REGISTRATION_ID_KEY", "CURRENT_OPEN_SESSION_ID", "SESSION_STORAGE_MAP", "DELAYED_INIT_ENABLED", "DELAYED_INIT_SET_DURING_RUNTIME_FLAG", "DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG", "MESSAGING_SESSION_END_TIMESTAMP", "EVENT_STORAGE_MAP", "PUSH_ID_MAP", "SERIALIZED_USER_OBJECT", "PUSH_TOKEN", "EVENT_DUPLICATION_VALIDATION_STORAGE_MAP", "API_KEY", "SERVER_TARGET", "SDK_FLAVOR", "CUSTOM_ENDPOINT", "SMALL_NOTIFICATION_ICON", "LARGE_NOTIFICATION_ICON", "SESSION_TIMEOUT", "DEFAULT_NOTIFICATION_ACCENT_COLOR", "TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS", "ADM_MESSAGING_REGISTRATION_ENABLED", "HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY", "AUTOMATIC_LOCATION_COLLECTION", "DATA_SYNC_BAD_NETWORK_INTERVAL", "DATA_SYNC_GOOD_NETWORK_INTERVAL", "DATA_SYNC_GREAT_NETWORK_INTERVAL", "DEFAULT_NOTIFICATION_CHANNEL_NAME", "DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION", "PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED", "PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME", "SESSION_START_BASED_TIMEOUT_ENABLED", "FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED", "FIREBASE_CLOUD_MESSAGING_SENDER_ID", "CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED", "DEVICE_OBJECT_ALLOWLISTING_ENABLED", "IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED", "PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED", "PUSH_NOTIFICATION_HTML_RENDERING_ENABLED", "DOES_PUSH_STORY_DISMISS_ON_CLICK", "GEOFENCES_ENABLED_CONFIG", "IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY", "CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME", "GEOFENCES_AUTOMATIC_REQUESTS_ENABLED", "IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT", "FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN", "SDK_AUTH_ENABLED", "REQUIRE_TOUCH_MODE_FOR_HTML_IAMS", "HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET", "DEVICE_OBJECT_ALLOWLIST", "CUSTOM_LOCATION_PROVIDERS_LIST", "SDK_METADATA_CONFIG", "FALLBACK_FCM_SERVICE_ENABLED", "FALLBACK_FCM_SERVICE_CLASSPATH", "OPTIN_WHEN_PUSH_AUTHORIZED", "USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES", "PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP", "IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING", "INAPP_LISTENER_GAME_OBJECT_NAME", "INAPP_LISTENER_CALLBACK_METHOD_NAME", "INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY", "PUSH_RECEIVED_GAME_OBJECT_NAME", "PUSH_RECEIVED_CALLBACK_METHOD_NAME", "PUSH_OPENED_GAME_OBJECT_NAME", "PUSH_OPENED_CALLBACK_METHOD_NAME", "PUSH_DELETED_GAME_OBJECT_NAME", "PUSH_DELETED_CALLBACK_METHOD_NAME", "CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME", "CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME", "FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME", "FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME", "SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME", "SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME", "INAPP_AUTO_SET_MANAGER_LISTENER", "INAPP_INITIAL_DISPLAY_OPERATION", "LAST_USER_ID", "SUFFIX_CACHE_USER_ID_HASH", "SUFFIX_CACHE_USER_ID_KEY", "DEVICE_ID", "LEGACY_DEVICE_ID", "PERSISTENT_DEVICE_ID", "GOOGLE_ADVERTISING_ID", "AD_TRACKING_ENABLED", "ENDPOINT_LAST_REQUEST_MAP", "ENDPOINT_ATTEMPT_COUNT_MAP", "TEST_STRING_KEY", "TEST_STRING_KEY_2", "TEST_LONG_KEY", "TEST_LONG_KEY_2", "TEST_INT_KEY", "TEST_INT_KEY_2", "TEST_DOUBLE_KEY", "TEST_FLOAT_KEY", "TEST_BOOLEAN_KEY", "TEST_BOOLEAN_KEY_2", "TEST_MAP_KEY", "TEST_LIST_KEY", "TEST_ENUM_STRING_KEY", "TEST_STRING_SET_KEY", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreKey {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ DataStoreKey[] $VALUES;
    public static final DataStoreKey ADM_MESSAGING_REGISTRATION_ENABLED;
    public static final DataStoreKey AD_TRACKING_ENABLED;
    public static final DataStoreKey API_KEY;
    public static final DataStoreKey AUTOMATIC_LOCATION_COLLECTION;
    public static final DataStoreKey BANNERS;
    public static final DataStoreKey BANNERS_ENABLED;
    public static final DataStoreKey BANNERS_IMPRESSION_MAP;
    public static final DataStoreKey BLOCKLISTED_ATTRIBUTES;
    public static final DataStoreKey BLOCKLISTED_EVENTS;
    public static final DataStoreKey BLOCKLISTED_PURCHASES;
    public static final DataStoreKey CONFIG_TIME;
    public static final DataStoreKey CONTENT_CARDS;
    public static final DataStoreKey CONTENT_CARDS_ENABLED;
    public static final DataStoreKey CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED;
    public static final DataStoreKey CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey CURRENT_OPEN_SESSION_ID;
    public static final DataStoreKey CUSTOM_ENDPOINT;
    public static final DataStoreKey CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME;
    public static final DataStoreKey CUSTOM_LOCATION_PROVIDERS_LIST;
    public static final b Companion;
    public static final DataStoreKey DATA_SYNC_BAD_NETWORK_INTERVAL;
    public static final DataStoreKey DATA_SYNC_GOOD_NETWORK_INTERVAL;
    public static final DataStoreKey DATA_SYNC_GREAT_NETWORK_INTERVAL;
    public static final DataStoreKey DEFAULT_NOTIFICATION_ACCENT_COLOR;
    public static final DataStoreKey DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION;
    public static final DataStoreKey DEFAULT_NOTIFICATION_CHANNEL_NAME;
    public static final DataStoreKey DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
    public static final DataStoreKey DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
    public static final DataStoreKey DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR;
    public static final DataStoreKey DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG;
    public static final DataStoreKey DELAYED_INIT_ENABLED;
    public static final DataStoreKey DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
    public static final DataStoreKey DEVICE_ID;
    public static final DataStoreKey DEVICE_OBJECT_ALLOWLIST;
    public static final DataStoreKey DEVICE_OBJECT_ALLOWLISTING_ENABLED;
    public static final DataStoreKey DISMISSED_CARDS;
    public static final DataStoreKey DOES_PUSH_STORY_DISMISS_ON_CLICK;
    public static final DataStoreKey DUST_AUTH;
    public static final DataStoreKey DUST_ENABLED;
    public static final DataStoreKey DUST_HOST;
    public static final DataStoreKey DUST_RCS;
    public static final DataStoreKey DUST_SHOULD_BLOCK_CC_REFRESH;
    public static final DataStoreKey ENDPOINT_ATTEMPT_COUNT_MAP;
    public static final DataStoreKey ENDPOINT_LAST_REQUEST_MAP;
    public static final DataStoreKey EPHEMERAL_EVENTS_ENABLED;
    public static final DataStoreKey EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
    public static final DataStoreKey EVENT_STORAGE_MAP;
    public static final DataStoreKey EXPIRED_CARDS;
    public static final DataStoreKey FALLBACK_FCM_SERVICE_CLASSPATH;
    public static final DataStoreKey FALLBACK_FCM_SERVICE_ENABLED;
    public static final DataStoreKey FEATURE_FLAGS;
    public static final DataStoreKey FEATURE_FLAGS_ENABLED;
    public static final DataStoreKey FEATURE_FLAGS_IMPRESSIONS_MAP;
    public static final DataStoreKey FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT;
    public static final DataStoreKey FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED;
    public static final DataStoreKey FIREBASE_CLOUD_MESSAGING_SENDER_ID;
    public static final DataStoreKey FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN;
    public static final DataStoreKey GEOFENCES;
    public static final DataStoreKey GEOFENCES_AUTOMATIC_REQUESTS_ENABLED;
    public static final DataStoreKey GEOFENCES_ENABLED;
    public static final DataStoreKey GEOFENCES_ENABLED_CONFIG;
    public static final DataStoreKey GEOFENCES_ENABLED_SET;
    public static final DataStoreKey GEOFENCES_MAX_NUM_TO_REGISTER;
    public static final DataStoreKey GEOFENCES_MIN_TIME_REPORT;
    public static final DataStoreKey GEOFENCES_MIN_TIME_REQUEST;
    public static final DataStoreKey GLOBAL_LAST_REPORT;
    public static final DataStoreKey GLOBAL_LAST_REQUEST;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMITING_CAPACITY;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMITING_ENABLED;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES;
    public static final DataStoreKey GOOGLE_ADVERTISING_ID;
    public static final DataStoreKey HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY;
    public static final DataStoreKey HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET;
    public static final DataStoreKey INAPP_AUTO_SET_MANAGER_LISTENER;
    public static final DataStoreKey INAPP_INITIAL_DISPLAY_OPERATION;
    public static final DataStoreKey INAPP_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey INAPP_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY;
    public static final DataStoreKey INDIVIDUAL_REELIGIBILITY_MAP;
    public static final DataStoreKey IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED;
    public static final DataStoreKey IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING;
    public static final DataStoreKey IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY;
    public static final DataStoreKey IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT;
    public static final DataStoreKey LARGE_NOTIFICATION_ICON;
    public static final DataStoreKey LAST_ACCESSED_SDK_VERSION;
    public static final DataStoreKey LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
    public static final DataStoreKey LAST_CARD_UPDATED_AT;
    public static final DataStoreKey LAST_FULL_CARD_SYNC_AT;
    public static final DataStoreKey LAST_REFRESH_IN_SECONDS;
    public static final DataStoreKey LAST_USER_ID;
    public static final DataStoreKey LEGACY_DEVICE_ID;
    public static final DataStoreKey MAX_BANNER_PLACEMENTS;
    public static final DataStoreKey MESSAGING_SESSION_END_TIMESTAMP;
    public static final DataStoreKey MESSAGING_SESSION_TIMEOUT;
    public static final DataStoreKey MITE_KEY;
    public static final DataStoreKey OPTIN_WHEN_PUSH_AUTHORIZED;
    public static final DataStoreKey PERSISTENT_DEVICE_ID;
    public static final DataStoreKey PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP;
    public static final DataStoreKey PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME;
    public static final DataStoreKey PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED;
    public static final DataStoreKey PUSH_DELETED_CALLBACK_METHOD_NAME;
    public static final DataStoreKey PUSH_DELETED_GAME_OBJECT_NAME;
    public static final DataStoreKey PUSH_DELIVERY_EVENTS;
    public static final DataStoreKey PUSH_ID_MAP;
    public static final DataStoreKey PUSH_MAX_CAMPAIGNS;
    public static final DataStoreKey PUSH_MAX_ENABLED;
    public static final DataStoreKey PUSH_MAX_LAST_UPDATE;
    public static final DataStoreKey PUSH_MAX_REDELIVER_BUFFER;
    public static final DataStoreKey PUSH_MAX_REDELIVER_DEDUPE_BUFFER;
    public static final DataStoreKey PUSH_NOTIFICATION_HTML_RENDERING_ENABLED;
    public static final DataStoreKey PUSH_OPENED_CALLBACK_METHOD_NAME;
    public static final DataStoreKey PUSH_OPENED_GAME_OBJECT_NAME;
    public static final DataStoreKey PUSH_RECEIVED_CALLBACK_METHOD_NAME;
    public static final DataStoreKey PUSH_RECEIVED_GAME_OBJECT_NAME;
    public static final DataStoreKey PUSH_REGISTRATION_ID_KEY;
    public static final DataStoreKey PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
    public static final DataStoreKey PUSH_REGISTRATION_VERSION_CODE;
    public static final DataStoreKey PUSH_TOKEN;
    public static final DataStoreKey PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED;
    public static final DataStoreKey REGISTERED_GEOFENCES;
    public static final DataStoreKey REQUIRE_TOUCH_MODE_FOR_HTML_IAMS;
    public static final DataStoreKey SDK_AUTH;
    public static final DataStoreKey SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey SDK_AUTH_ENABLED;
    public static final DataStoreKey SDK_DEBUGGER_AUTHORIZATION_CODE;
    public static final DataStoreKey SDK_DEBUGGER_ENABLED;
    public static final DataStoreKey SDK_DEBUGGER_EXPIRATION_TIME;
    public static final DataStoreKey SDK_DEBUGGER_FLUSH_INTERVAL_BYTES;
    public static final DataStoreKey SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS;
    public static final DataStoreKey SDK_DEBUGGER_MAX_PAYLOAD_BYTES;
    public static final DataStoreKey SDK_ENABLEMENT;
    public static final DataStoreKey SDK_FLAVOR;
    public static final DataStoreKey SDK_METADATA;
    public static final DataStoreKey SDK_METADATA_CONFIG;
    public static final DataStoreKey SERIALIZED_USER_OBJECT;
    public static final DataStoreKey SERVER_TARGET;
    public static final DataStoreKey SESSION_START_BASED_TIMEOUT_ENABLED;
    public static final DataStoreKey SESSION_STORAGE_MAP;
    public static final DataStoreKey SESSION_TIMEOUT;
    public static final DataStoreKey SMALL_NOTIFICATION_ICON;
    public static final DataStoreKey SUFFIX_CACHE_USER_ID_HASH;
    public static final DataStoreKey SUFFIX_CACHE_USER_ID_KEY;
    public static final DataStoreKey TEST_BOOLEAN_KEY;
    public static final DataStoreKey TEST_BOOLEAN_KEY_2;
    public static final DataStoreKey TEST_CARDS;
    public static final DataStoreKey TEST_DOUBLE_KEY;
    public static final DataStoreKey TEST_ENUM_STRING_KEY;
    public static final DataStoreKey TEST_FLOAT_KEY;
    public static final DataStoreKey TEST_INT_KEY;
    public static final DataStoreKey TEST_INT_KEY_2;
    public static final DataStoreKey TEST_LIST_KEY;
    public static final DataStoreKey TEST_LONG_KEY;
    public static final DataStoreKey TEST_LONG_KEY_2;
    public static final DataStoreKey TEST_MAP_KEY;
    public static final DataStoreKey TEST_STRING_KEY;
    public static final DataStoreKey TEST_STRING_KEY_2;
    public static final DataStoreKey TEST_STRING_SET_KEY;
    public static final DataStoreKey TRIGGERED_ACTIONS;
    public static final DataStoreKey TRIGGERED_ACTIONS_IMPRESSION_MAP;
    public static final DataStoreKey TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS;
    public static final DataStoreKey USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES;
    private static final InterfaceC4028k keyMap$delegate;
    private final String key;
    private final DataStoreValueType type;

    private static final /* synthetic */ DataStoreKey[] $values() {
        return new DataStoreKey[]{GEOFENCES, REGISTERED_GEOFENCES, GLOBAL_LAST_REQUEST, GLOBAL_LAST_REPORT, INDIVIDUAL_REELIGIBILITY_MAP, FEATURE_FLAGS, LAST_REFRESH_IN_SECONDS, FEATURE_FLAGS_IMPRESSIONS_MAP, CONTENT_CARDS, DISMISSED_CARDS, EXPIRED_CARDS, TEST_CARDS, LAST_CARD_UPDATED_AT, LAST_FULL_CARD_SYNC_AT, LAST_CARD_STORAGE_UPDATE_TIMESTAMP, LAST_ACCESSED_SDK_VERSION, TRIGGERED_ACTIONS, TRIGGERED_ACTIONS_IMPRESSION_MAP, BANNERS, BANNERS_IMPRESSION_MAP, MITE_KEY, DUST_HOST, DUST_AUTH, DUST_RCS, SDK_METADATA, PUSH_MAX_LAST_UPDATE, PUSH_MAX_CAMPAIGNS, PUSH_DELIVERY_EVENTS, SDK_AUTH, SDK_ENABLEMENT, CONFIG_TIME, EPHEMERAL_EVENTS_ENABLED, GEOFENCES_ENABLED_SET, GEOFENCES_ENABLED, GEOFENCES_MIN_TIME_REQUEST, GEOFENCES_MIN_TIME_REPORT, GEOFENCES_MAX_NUM_TO_REGISTER, MESSAGING_SESSION_TIMEOUT, DUST_ENABLED, DUST_SHOULD_BLOCK_CC_REFRESH, BLOCKLISTED_EVENTS, BLOCKLISTED_ATTRIBUTES, BLOCKLISTED_PURCHASES, CONTENT_CARDS_ENABLED, FEATURE_FLAGS_ENABLED, FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, PUSH_MAX_ENABLED, PUSH_MAX_REDELIVER_BUFFER, PUSH_MAX_REDELIVER_DEDUPE_BUFFER, GLOBAL_REQUEST_RATE_LIMITING_ENABLED, GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS, DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS, DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, SDK_DEBUGGER_ENABLED, SDK_DEBUGGER_EXPIRATION_TIME, SDK_DEBUGGER_AUTHORIZATION_CODE, SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, SDK_DEBUGGER_MAX_PAYLOAD_BYTES, BANNERS_ENABLED, MAX_BANNER_PLACEMENTS, PUSH_REGISTRATION_VERSION_CODE, PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, PUSH_REGISTRATION_ID_KEY, CURRENT_OPEN_SESSION_ID, SESSION_STORAGE_MAP, DELAYED_INIT_ENABLED, DELAYED_INIT_SET_DURING_RUNTIME_FLAG, DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, MESSAGING_SESSION_END_TIMESTAMP, EVENT_STORAGE_MAP, PUSH_ID_MAP, SERIALIZED_USER_OBJECT, PUSH_TOKEN, EVENT_DUPLICATION_VALIDATION_STORAGE_MAP, API_KEY, SERVER_TARGET, SDK_FLAVOR, CUSTOM_ENDPOINT, SMALL_NOTIFICATION_ICON, LARGE_NOTIFICATION_ICON, SESSION_TIMEOUT, DEFAULT_NOTIFICATION_ACCENT_COLOR, TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS, ADM_MESSAGING_REGISTRATION_ENABLED, HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, AUTOMATIC_LOCATION_COLLECTION, DATA_SYNC_BAD_NETWORK_INTERVAL, DATA_SYNC_GOOD_NETWORK_INTERVAL, DATA_SYNC_GREAT_NETWORK_INTERVAL, DEFAULT_NOTIFICATION_CHANNEL_NAME, DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED, PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME, SESSION_START_BASED_TIMEOUT_ENABLED, FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED, FIREBASE_CLOUD_MESSAGING_SENDER_ID, CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, DEVICE_OBJECT_ALLOWLISTING_ENABLED, IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, DOES_PUSH_STORY_DISMISS_ON_CLICK, GEOFENCES_ENABLED_CONFIG, IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME, GEOFENCES_AUTOMATIC_REQUESTS_ENABLED, IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT, FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN, SDK_AUTH_ENABLED, REQUIRE_TOUCH_MODE_FOR_HTML_IAMS, HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET, DEVICE_OBJECT_ALLOWLIST, CUSTOM_LOCATION_PROVIDERS_LIST, SDK_METADATA_CONFIG, FALLBACK_FCM_SERVICE_ENABLED, FALLBACK_FCM_SERVICE_CLASSPATH, OPTIN_WHEN_PUSH_AUTHORIZED, USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES, PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP, IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING, INAPP_LISTENER_GAME_OBJECT_NAME, INAPP_LISTENER_CALLBACK_METHOD_NAME, INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY, PUSH_RECEIVED_GAME_OBJECT_NAME, PUSH_RECEIVED_CALLBACK_METHOD_NAME, PUSH_OPENED_GAME_OBJECT_NAME, PUSH_OPENED_CALLBACK_METHOD_NAME, PUSH_DELETED_GAME_OBJECT_NAME, PUSH_DELETED_CALLBACK_METHOD_NAME, CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME, CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME, FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME, FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME, SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME, SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME, INAPP_AUTO_SET_MANAGER_LISTENER, INAPP_INITIAL_DISPLAY_OPERATION, LAST_USER_ID, SUFFIX_CACHE_USER_ID_HASH, SUFFIX_CACHE_USER_ID_KEY, DEVICE_ID, LEGACY_DEVICE_ID, PERSISTENT_DEVICE_ID, GOOGLE_ADVERTISING_ID, AD_TRACKING_ENABLED, ENDPOINT_LAST_REQUEST_MAP, ENDPOINT_ATTEMPT_COUNT_MAP, TEST_STRING_KEY, TEST_STRING_KEY_2, TEST_LONG_KEY, TEST_LONG_KEY_2, TEST_INT_KEY, TEST_INT_KEY_2, TEST_DOUBLE_KEY, TEST_FLOAT_KEY, TEST_BOOLEAN_KEY, TEST_BOOLEAN_KEY_2, TEST_MAP_KEY, TEST_LIST_KEY, TEST_ENUM_STRING_KEY, TEST_STRING_SET_KEY};
    }

    static {
        DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
        GEOFENCES = new DataStoreKey("GEOFENCES", 0, "geofences", dataStoreValueType);
        REGISTERED_GEOFENCES = new DataStoreKey("REGISTERED_GEOFENCES", 1, "registered_geofences", dataStoreValueType);
        DataStoreValueType dataStoreValueType2 = DataStoreValueType.LONG;
        GLOBAL_LAST_REQUEST = new DataStoreKey("GLOBAL_LAST_REQUEST", 2, "last_request_global", dataStoreValueType2);
        GLOBAL_LAST_REPORT = new DataStoreKey("GLOBAL_LAST_REPORT", 3, "last_report_global", dataStoreValueType2);
        DataStoreValueType dataStoreValueType3 = DataStoreValueType.MAP;
        INDIVIDUAL_REELIGIBILITY_MAP = new DataStoreKey("INDIVIDUAL_REELIGIBILITY_MAP", 4, "individual_reeligibility_map", dataStoreValueType3);
        FEATURE_FLAGS = new DataStoreKey("FEATURE_FLAGS", 5, "feature_flags", dataStoreValueType);
        LAST_REFRESH_IN_SECONDS = new DataStoreKey("LAST_REFRESH_IN_SECONDS", 6, "last_refresh", dataStoreValueType2);
        FEATURE_FLAGS_IMPRESSIONS_MAP = new DataStoreKey("FEATURE_FLAGS_IMPRESSIONS_MAP", 7, "ff_impressions_map", dataStoreValueType3);
        CONTENT_CARDS = new DataStoreKey("CONTENT_CARDS", 8, "content_cards", dataStoreValueType);
        DISMISSED_CARDS = new DataStoreKey("DISMISSED_CARDS", 9, "dismissed", dataStoreValueType);
        EXPIRED_CARDS = new DataStoreKey("EXPIRED_CARDS", 10, "expired", dataStoreValueType);
        TEST_CARDS = new DataStoreKey("TEST_CARDS", 11, "test", dataStoreValueType);
        LAST_CARD_UPDATED_AT = new DataStoreKey("LAST_CARD_UPDATED_AT", 12, "last_card_updated_at", dataStoreValueType2);
        LAST_FULL_CARD_SYNC_AT = new DataStoreKey("LAST_FULL_CARD_SYNC_AT", 13, "last_full_sync_at", dataStoreValueType2);
        LAST_CARD_STORAGE_UPDATE_TIMESTAMP = new DataStoreKey("LAST_CARD_STORAGE_UPDATE_TIMESTAMP", 14, "last_storage_update_timestamp", dataStoreValueType2);
        DataStoreValueType dataStoreValueType4 = DataStoreValueType.STRING;
        LAST_ACCESSED_SDK_VERSION = new DataStoreKey("LAST_ACCESSED_SDK_VERSION", 15, "last_accessed_sdk_version", dataStoreValueType4);
        TRIGGERED_ACTIONS = new DataStoreKey("TRIGGERED_ACTIONS", 16, "triggers", dataStoreValueType);
        TRIGGERED_ACTIONS_IMPRESSION_MAP = new DataStoreKey("TRIGGERED_ACTIONS_IMPRESSION_MAP", 17, "triggers_impression_map", dataStoreValueType3);
        BANNERS = new DataStoreKey("BANNERS", 18, "banners", dataStoreValueType);
        BANNERS_IMPRESSION_MAP = new DataStoreKey("BANNERS_IMPRESSION_MAP", 19, "banners_impression_map", dataStoreValueType3);
        MITE_KEY = new DataStoreKey("MITE_KEY", 20, "mite", dataStoreValueType4);
        DUST_HOST = new DataStoreKey("DUST_HOST", 21, "dust_host", dataStoreValueType4);
        DUST_AUTH = new DataStoreKey("DUST_AUTH", 22, "dust_auth", dataStoreValueType4);
        DUST_RCS = new DataStoreKey("DUST_RCS", 23, "dust_rcs", dataStoreValueType4);
        SDK_METADATA = new DataStoreKey("SDK_METADATA", 24, "tags", dataStoreValueType);
        PUSH_MAX_LAST_UPDATE = new DataStoreKey("PUSH_MAX_LAST_UPDATE", 25, "lastUpdateTime", dataStoreValueType2);
        PUSH_MAX_CAMPAIGNS = new DataStoreKey("PUSH_MAX_CAMPAIGNS", 26, "push_max_campaigns", dataStoreValueType3);
        PUSH_DELIVERY_EVENTS = new DataStoreKey("PUSH_DELIVERY_EVENTS", 27, "push_delivery_events", dataStoreValueType3);
        SDK_AUTH = new DataStoreKey("SDK_AUTH", 28, "auth_signature", dataStoreValueType4);
        DataStoreValueType dataStoreValueType5 = DataStoreValueType.BOOLEAN;
        SDK_ENABLEMENT = new DataStoreKey("SDK_ENABLEMENT", 29, "appboy_sdk_disabled", dataStoreValueType5);
        CONFIG_TIME = new DataStoreKey("CONFIG_TIME", 30, "config_time", dataStoreValueType2);
        EPHEMERAL_EVENTS_ENABLED = new DataStoreKey("EPHEMERAL_EVENTS_ENABLED", 31, "ephemeral_events_enabled", dataStoreValueType5);
        GEOFENCES_ENABLED_SET = new DataStoreKey("GEOFENCES_ENABLED_SET", 32, "geofences_enabled_set", dataStoreValueType5);
        GEOFENCES_ENABLED = new DataStoreKey("GEOFENCES_ENABLED", 33, "geofences_enabled", dataStoreValueType5);
        DataStoreValueType dataStoreValueType6 = DataStoreValueType.INT;
        GEOFENCES_MIN_TIME_REQUEST = new DataStoreKey("GEOFENCES_MIN_TIME_REQUEST", 34, "geofences_min_time_since_last_request", dataStoreValueType6);
        GEOFENCES_MIN_TIME_REPORT = new DataStoreKey("GEOFENCES_MIN_TIME_REPORT", 35, "geofences_min_time_since_last_report", dataStoreValueType6);
        GEOFENCES_MAX_NUM_TO_REGISTER = new DataStoreKey("GEOFENCES_MAX_NUM_TO_REGISTER", 36, "geofences_max_num_to_register", dataStoreValueType6);
        MESSAGING_SESSION_TIMEOUT = new DataStoreKey("MESSAGING_SESSION_TIMEOUT", 37, "messaging_session_timeout", dataStoreValueType2);
        DUST_ENABLED = new DataStoreKey("DUST_ENABLED", 38, "dust_enabled", dataStoreValueType5);
        DUST_SHOULD_BLOCK_CC_REFRESH = new DataStoreKey("DUST_SHOULD_BLOCK_CC_REFRESH", 39, "dust_should_block_cc_refresh", dataStoreValueType5);
        BLOCKLISTED_EVENTS = new DataStoreKey("BLOCKLISTED_EVENTS", 40, "blacklisted_events", dataStoreValueType);
        BLOCKLISTED_ATTRIBUTES = new DataStoreKey("BLOCKLISTED_ATTRIBUTES", 41, "blacklisted_attributes", dataStoreValueType);
        BLOCKLISTED_PURCHASES = new DataStoreKey("BLOCKLISTED_PURCHASES", 42, "blacklisted_purchases", dataStoreValueType);
        CONTENT_CARDS_ENABLED = new DataStoreKey("CONTENT_CARDS_ENABLED", 43, "content_cards_enabled", dataStoreValueType5);
        FEATURE_FLAGS_ENABLED = new DataStoreKey("FEATURE_FLAGS_ENABLED", 44, "feature_flags_enabled", dataStoreValueType5);
        FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT = new DataStoreKey("FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT", 45, "feature_flags_refresh_rate_limit", dataStoreValueType6);
        PUSH_MAX_ENABLED = new DataStoreKey("PUSH_MAX_ENABLED", 46, "push_max_enabled", dataStoreValueType5);
        PUSH_MAX_REDELIVER_BUFFER = new DataStoreKey("PUSH_MAX_REDELIVER_BUFFER", 47, "push_max_redeliver_buffer", dataStoreValueType2);
        PUSH_MAX_REDELIVER_DEDUPE_BUFFER = new DataStoreKey("PUSH_MAX_REDELIVER_DEDUPE_BUFFER", 48, "push_max_redeliver_dedupe_buffer", dataStoreValueType2);
        GLOBAL_REQUEST_RATE_LIMITING_ENABLED = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMITING_ENABLED", 49, "global_req_rate_limit_enabled", dataStoreValueType5);
        GLOBAL_REQUEST_RATE_LIMITING_CAPACITY = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMITING_CAPACITY", 50, "global_req_rate_capacity", dataStoreValueType6);
        GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE", 51, "global_req_rate_refill_rate", dataStoreValueType6);
        GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES", 52, "global_req_rate_limit_endpoint_overrides", dataStoreValueType4);
        DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS = new DataStoreKey("DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS", 53, "default_backoff_min_sleep_duration__ms", dataStoreValueType6);
        DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS = new DataStoreKey("DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS", 54, "default_backoff_max_sleep_duration_ms", dataStoreValueType6);
        DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR = new DataStoreKey("DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR", 55, "default_backoff_scale_factor", dataStoreValueType6);
        SDK_DEBUGGER_ENABLED = new DataStoreKey("SDK_DEBUGGER_ENABLED", 56, "sdk_debugger_enabled", dataStoreValueType5);
        SDK_DEBUGGER_EXPIRATION_TIME = new DataStoreKey("SDK_DEBUGGER_EXPIRATION_TIME", 57, "sdk_debugger_expiration_time", dataStoreValueType2);
        SDK_DEBUGGER_AUTHORIZATION_CODE = new DataStoreKey("SDK_DEBUGGER_AUTHORIZATION_CODE", 58, "sdk_debugger_authorization_code", dataStoreValueType4);
        SDK_DEBUGGER_FLUSH_INTERVAL_BYTES = new DataStoreKey("SDK_DEBUGGER_FLUSH_INTERVAL_BYTES", 59, "sdk_debugger_flush_interval_bytes", dataStoreValueType2);
        SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS = new DataStoreKey("SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS", 60, "sdk_debugger_flush_interval_seconds", dataStoreValueType2);
        SDK_DEBUGGER_MAX_PAYLOAD_BYTES = new DataStoreKey("SDK_DEBUGGER_MAX_PAYLOAD_BYTES", 61, "sdk_debugger_max_payload_bytes", dataStoreValueType2);
        BANNERS_ENABLED = new DataStoreKey("BANNERS_ENABLED", 62, "banners_enabled", dataStoreValueType5);
        MAX_BANNER_PLACEMENTS = new DataStoreKey("MAX_BANNER_PLACEMENTS", 63, "max_banner_placements", dataStoreValueType6);
        PUSH_REGISTRATION_VERSION_CODE = new DataStoreKey("PUSH_REGISTRATION_VERSION_CODE", 64, ProfilingTraceData.JsonKeys.VERSION_CODE, dataStoreValueType6);
        PUSH_REGISTRATION_PERSISTENT_DEVICE_ID = new DataStoreKey("PUSH_REGISTRATION_PERSISTENT_DEVICE_ID", 65, "device_identifier", dataStoreValueType4);
        PUSH_REGISTRATION_ID_KEY = new DataStoreKey("PUSH_REGISTRATION_ID_KEY", 66, "registration_id", dataStoreValueType4);
        CURRENT_OPEN_SESSION_ID = new DataStoreKey("CURRENT_OPEN_SESSION_ID", 67, "current_open_session", dataStoreValueType4);
        SESSION_STORAGE_MAP = new DataStoreKey("SESSION_STORAGE_MAP", 68, "session_storage_map", dataStoreValueType3);
        DELAYED_INIT_ENABLED = new DataStoreKey("DELAYED_INIT_ENABLED", 69, "delayed_initialization_enabled", dataStoreValueType5);
        DELAYED_INIT_SET_DURING_RUNTIME_FLAG = new DataStoreKey("DELAYED_INIT_SET_DURING_RUNTIME_FLAG", 70, "was_set_during_runtime", dataStoreValueType5);
        DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG = new DataStoreKey("DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG", 71, "analytics_behavior", dataStoreValueType4);
        MESSAGING_SESSION_END_TIMESTAMP = new DataStoreKey("MESSAGING_SESSION_END_TIMESTAMP", 72, "messaging_session_timestamp", dataStoreValueType2);
        EVENT_STORAGE_MAP = new DataStoreKey("EVENT_STORAGE_MAP", 73, "events", dataStoreValueType3);
        PUSH_ID_MAP = new DataStoreKey("PUSH_ID_MAP", 74, "push_id_map", dataStoreValueType3);
        SERIALIZED_USER_OBJECT = new DataStoreKey("SERIALIZED_USER_OBJECT", 75, "user_cache_attributes_object", dataStoreValueType4);
        PUSH_TOKEN = new DataStoreKey("PUSH_TOKEN", 76, "push_token", dataStoreValueType4);
        EVENT_DUPLICATION_VALIDATION_STORAGE_MAP = new DataStoreKey("EVENT_DUPLICATION_VALIDATION_STORAGE_MAP", 77, "event_duplication_validation_storage_map", dataStoreValueType3);
        API_KEY = new DataStoreKey("API_KEY", 78, "com_braze_api_key", dataStoreValueType4);
        SERVER_TARGET = new DataStoreKey("SERVER_TARGET", 79, "com_braze_server_target", dataStoreValueType4);
        SDK_FLAVOR = new DataStoreKey("SDK_FLAVOR", 80, "com_braze_sdk_flavor", dataStoreValueType4);
        CUSTOM_ENDPOINT = new DataStoreKey("CUSTOM_ENDPOINT", 81, "com_braze_custom_endpoint", dataStoreValueType4);
        SMALL_NOTIFICATION_ICON = new DataStoreKey("SMALL_NOTIFICATION_ICON", 82, "com_braze_push_small_notification_icon", dataStoreValueType4);
        LARGE_NOTIFICATION_ICON = new DataStoreKey("LARGE_NOTIFICATION_ICON", 83, "com_braze_push_large_notification_icon", dataStoreValueType4);
        SESSION_TIMEOUT = new DataStoreKey("SESSION_TIMEOUT", 84, "com_braze_session_timeout", dataStoreValueType6);
        DEFAULT_NOTIFICATION_ACCENT_COLOR = new DataStoreKey("DEFAULT_NOTIFICATION_ACCENT_COLOR", 85, "com_braze_default_notification_accent_color", dataStoreValueType6);
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS = new DataStoreKey("TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS", 86, "com_braze_trigger_action_minimum_time_interval_seconds", dataStoreValueType6);
        ADM_MESSAGING_REGISTRATION_ENABLED = new DataStoreKey("ADM_MESSAGING_REGISTRATION_ENABLED", 87, "com_braze_push_adm_messaging_registration_enabled", dataStoreValueType5);
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY = new DataStoreKey("HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY", 88, "com_braze_handle_push_deep_links_automatically", dataStoreValueType5);
        AUTOMATIC_LOCATION_COLLECTION = new DataStoreKey("AUTOMATIC_LOCATION_COLLECTION", 89, "com_braze_enable_location_collection", dataStoreValueType5);
        DATA_SYNC_BAD_NETWORK_INTERVAL = new DataStoreKey("DATA_SYNC_BAD_NETWORK_INTERVAL", 90, "com_braze_data_flush_interval_bad_network", dataStoreValueType6);
        DATA_SYNC_GOOD_NETWORK_INTERVAL = new DataStoreKey("DATA_SYNC_GOOD_NETWORK_INTERVAL", 91, "com_braze_data_flush_interval_good_network", dataStoreValueType6);
        DATA_SYNC_GREAT_NETWORK_INTERVAL = new DataStoreKey("DATA_SYNC_GREAT_NETWORK_INTERVAL", 92, "com_braze_data_flush_interval_great_network", dataStoreValueType6);
        DEFAULT_NOTIFICATION_CHANNEL_NAME = new DataStoreKey("DEFAULT_NOTIFICATION_CHANNEL_NAME", 93, "com_braze_default_notification_channel_name", dataStoreValueType4);
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION = new DataStoreKey("DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION", 94, "com_braze_default_notification_channel_description", dataStoreValueType4);
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED = new DataStoreKey("PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED", 95, "com_braze_push_deep_link_back_stack_activity_enabled", dataStoreValueType5);
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME = new DataStoreKey("PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME", 96, "com_braze_push_deep_link_back_stack_activity_class_name", dataStoreValueType4);
        SESSION_START_BASED_TIMEOUT_ENABLED = new DataStoreKey("SESSION_START_BASED_TIMEOUT_ENABLED", 97, "com_braze_session_start_based_timeout_enabled", dataStoreValueType5);
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED = new DataStoreKey("FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED", 98, "com_braze_firebase_cloud_messaging_registration_enabled", dataStoreValueType5);
        FIREBASE_CLOUD_MESSAGING_SENDER_ID = new DataStoreKey("FIREBASE_CLOUD_MESSAGING_SENDER_ID", 99, "com_braze_firebase_cloud_messaging_sender_id", dataStoreValueType4);
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED = new DataStoreKey("CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED", 100, "com_braze_content_cards_unread_visual_indicator_enabled", dataStoreValueType5);
        DEVICE_OBJECT_ALLOWLISTING_ENABLED = new DataStoreKey("DEVICE_OBJECT_ALLOWLISTING_ENABLED", Endpoint.TARGET_FIELD_NUMBER, "com_braze_device_object_whitelisting_enabled", dataStoreValueType5);
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED = new DataStoreKey("IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED", 102, "com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", dataStoreValueType5);
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED = new DataStoreKey("PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED", 103, "com_braze_push_wake_screen_for_notification_enabled", dataStoreValueType5);
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED = new DataStoreKey("PUSH_NOTIFICATION_HTML_RENDERING_ENABLED", 104, "com_braze_push_notification_html_rendering_enabled", dataStoreValueType5);
        DOES_PUSH_STORY_DISMISS_ON_CLICK = new DataStoreKey("DOES_PUSH_STORY_DISMISS_ON_CLICK", 105, "com_braze_does_push_story_dismiss_on_click", dataStoreValueType5);
        GEOFENCES_ENABLED_CONFIG = new DataStoreKey("GEOFENCES_ENABLED_CONFIG", 106, "com_braze_geofences_enabled", dataStoreValueType5);
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY = new DataStoreKey("IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY", 107, "com_braze_in_app_message_push_test_eager_display_enabled", dataStoreValueType5);
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME = new DataStoreKey("CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME", 108, "com_braze_custom_html_webview_activity_class_name", dataStoreValueType4);
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED = new DataStoreKey("GEOFENCES_AUTOMATIC_REQUESTS_ENABLED", 109, "com_braze_automatic_geofence_requests_enabled", dataStoreValueType5);
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT = new DataStoreKey("IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT", 110, "com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", dataStoreValueType6);
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN = new DataStoreKey("FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN", 111, "com_braze_firebase_messaging_service_automatically_register_on_new_token", dataStoreValueType5);
        SDK_AUTH_ENABLED = new DataStoreKey("SDK_AUTH_ENABLED", 112, "com_braze_sdk_authentication_enabled", dataStoreValueType5);
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS = new DataStoreKey("REQUIRE_TOUCH_MODE_FOR_HTML_IAMS", 113, "com_braze_require_touch_mode_for_html_in_app_messages", dataStoreValueType5);
        HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET = new DataStoreKey("HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET", 114, "com_braze_html_in_app_message_enable_html_link_target", dataStoreValueType5);
        DEVICE_OBJECT_ALLOWLIST = new DataStoreKey("DEVICE_OBJECT_ALLOWLIST", 115, "com_braze_device_object_whitelist", dataStoreValueType);
        CUSTOM_LOCATION_PROVIDERS_LIST = new DataStoreKey("CUSTOM_LOCATION_PROVIDERS_LIST", 116, "com_braze_custom_location_providers_list", dataStoreValueType);
        SDK_METADATA_CONFIG = new DataStoreKey("SDK_METADATA_CONFIG", 117, "com_braze_sdk_metadata", dataStoreValueType);
        FALLBACK_FCM_SERVICE_ENABLED = new DataStoreKey("FALLBACK_FCM_SERVICE_ENABLED", 118, "com_braze_fallback_firebase_cloud_messaging_service_enabled", dataStoreValueType5);
        FALLBACK_FCM_SERVICE_CLASSPATH = new DataStoreKey("FALLBACK_FCM_SERVICE_CLASSPATH", 119, "com_braze_fallback_firebase_cloud_messaging_service_classpath", dataStoreValueType4);
        OPTIN_WHEN_PUSH_AUTHORIZED = new DataStoreKey("OPTIN_WHEN_PUSH_AUTHORIZED", 120, "com_braze_optin_when_push_authorized", dataStoreValueType5);
        USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES = new DataStoreKey("USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES", 121, "com_braze_use_activity_window_flag_secure", dataStoreValueType5);
        PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP = new DataStoreKey("PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP", 122, "com_braze_persist_webview_when_backgrounding_app", dataStoreValueType5);
        IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING = new DataStoreKey("IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING", 123, "com_braze_in_app_message_add_status_bar_padding", dataStoreValueType5);
        INAPP_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("INAPP_LISTENER_GAME_OBJECT_NAME", 124, "com_braze_inapp_listener_game_object_name", dataStoreValueType4);
        INAPP_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("INAPP_LISTENER_CALLBACK_METHOD_NAME", 125, "com_braze_inapp_listener_callback_method_name", dataStoreValueType4);
        INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY = new DataStoreKey("INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY", 126, "com_braze_inapp_show_inapp_messages_automatically", dataStoreValueType5);
        PUSH_RECEIVED_GAME_OBJECT_NAME = new DataStoreKey("PUSH_RECEIVED_GAME_OBJECT_NAME", 127, "com_braze_push_received_game_object_name", dataStoreValueType4);
        PUSH_RECEIVED_CALLBACK_METHOD_NAME = new DataStoreKey("PUSH_RECEIVED_CALLBACK_METHOD_NAME", 128, "com_braze_push_received_callback_method_name", dataStoreValueType4);
        PUSH_OPENED_GAME_OBJECT_NAME = new DataStoreKey("PUSH_OPENED_GAME_OBJECT_NAME", 129, "com_braze_push_opened_game_object_name", dataStoreValueType4);
        PUSH_OPENED_CALLBACK_METHOD_NAME = new DataStoreKey("PUSH_OPENED_CALLBACK_METHOD_NAME", 130, "com_braze_push_opened_callback_method_name", dataStoreValueType4);
        PUSH_DELETED_GAME_OBJECT_NAME = new DataStoreKey("PUSH_DELETED_GAME_OBJECT_NAME", 131, "com_braze_push_deleted_game_object_name", dataStoreValueType4);
        PUSH_DELETED_CALLBACK_METHOD_NAME = new DataStoreKey("PUSH_DELETED_CALLBACK_METHOD_NAME", 132, "com_braze_push_deleted_callback_method_name", dataStoreValueType4);
        CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME", 133, "com_braze_content_cards_updated_listener_game_object_name", dataStoreValueType4);
        CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME", 134, "com_braze_content_cards_updated_listener_callback_method_name", dataStoreValueType4);
        FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME", 135, "com_braze_feature_flags_updated_listener_game_object_name", dataStoreValueType4);
        FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME", 136, "com_braze_feature_flags_updated_listener_callback_method_name", dataStoreValueType4);
        SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME", 137, "com_braze_sdk_authentication_failure_listener_game_object_name", dataStoreValueType4);
        SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME", 138, "com_braze_sdk_authentication_failure_listener_callback_method_name", dataStoreValueType4);
        INAPP_AUTO_SET_MANAGER_LISTENER = new DataStoreKey("INAPP_AUTO_SET_MANAGER_LISTENER", 139, "com_braze_inapp_auto_set_manager_listener_key", dataStoreValueType5);
        INAPP_INITIAL_DISPLAY_OPERATION = new DataStoreKey("INAPP_INITIAL_DISPLAY_OPERATION", 140, "com_braze_inapp_initial_display_operation_key", dataStoreValueType4);
        LAST_USER_ID = new DataStoreKey("LAST_USER_ID", 141, "last_user", dataStoreValueType4);
        SUFFIX_CACHE_USER_ID_HASH = new DataStoreKey("SUFFIX_CACHE_USER_ID_HASH", 142, "user_id_hash_value", dataStoreValueType4);
        SUFFIX_CACHE_USER_ID_KEY = new DataStoreKey("SUFFIX_CACHE_USER_ID_KEY", 143, "user_id_key", dataStoreValueType4);
        DEVICE_ID = new DataStoreKey("DEVICE_ID", 144, "device_id", dataStoreValueType4);
        LEGACY_DEVICE_ID = new DataStoreKey("LEGACY_DEVICE_ID", 145, "legacy_device_id", dataStoreValueType4);
        PERSISTENT_DEVICE_ID = new DataStoreKey("PERSISTENT_DEVICE_ID", 146, "persistent_device_id", dataStoreValueType4);
        GOOGLE_ADVERTISING_ID = new DataStoreKey("GOOGLE_ADVERTISING_ID", 147, "google_ad_id", dataStoreValueType4);
        AD_TRACKING_ENABLED = new DataStoreKey("AD_TRACKING_ENABLED", 148, "ad_tracking_enabled", dataStoreValueType5);
        ENDPOINT_LAST_REQUEST_MAP = new DataStoreKey("ENDPOINT_LAST_REQUEST_MAP", 149, "endpoint_last_request_map", dataStoreValueType3);
        ENDPOINT_ATTEMPT_COUNT_MAP = new DataStoreKey("ENDPOINT_ATTEMPT_COUNT_MAP", 150, "endpoint_attempt_count_map", dataStoreValueType3);
        TEST_STRING_KEY = new DataStoreKey("TEST_STRING_KEY", 151, "string_key", dataStoreValueType4);
        TEST_STRING_KEY_2 = new DataStoreKey("TEST_STRING_KEY_2", 152, "string_key_2", dataStoreValueType4);
        TEST_LONG_KEY = new DataStoreKey("TEST_LONG_KEY", 153, "long_key", dataStoreValueType2);
        TEST_LONG_KEY_2 = new DataStoreKey("TEST_LONG_KEY_2", 154, "long_key_2", dataStoreValueType2);
        TEST_INT_KEY = new DataStoreKey("TEST_INT_KEY", ModuleDescriptor.MODULE_VERSION, "int_key", dataStoreValueType6);
        TEST_INT_KEY_2 = new DataStoreKey("TEST_INT_KEY_2", 156, "int_key_2", dataStoreValueType6);
        TEST_DOUBLE_KEY = new DataStoreKey("TEST_DOUBLE_KEY", 157, "double_key", DataStoreValueType.DOUBLE);
        TEST_FLOAT_KEY = new DataStoreKey("TEST_FLOAT_KEY", 158, "float_key", DataStoreValueType.FLOAT);
        TEST_BOOLEAN_KEY = new DataStoreKey("TEST_BOOLEAN_KEY", 159, "boolean_key", dataStoreValueType5);
        TEST_BOOLEAN_KEY_2 = new DataStoreKey("TEST_BOOLEAN_KEY_2", 160, "boolean_key_2", dataStoreValueType5);
        TEST_MAP_KEY = new DataStoreKey("TEST_MAP_KEY", 161, "map_key", dataStoreValueType3);
        TEST_LIST_KEY = new DataStoreKey("TEST_LIST_KEY", 162, "list_key", dataStoreValueType);
        TEST_ENUM_STRING_KEY = new DataStoreKey("TEST_ENUM_STRING_KEY", 163, "cached_configuration_provider_test_enum_string", dataStoreValueType4);
        TEST_STRING_SET_KEY = new DataStoreKey("TEST_STRING_SET_KEY", 164, "cached_configuration_provider_test_string_set", dataStoreValueType);
        DataStoreKey[] dataStoreKeyArr$values = $values();
        $VALUES = dataStoreKeyArr$values;
        $ENTRIES = AbstractC5277b.a(dataStoreKeyArr$values);
        Companion = new b();
        keyMap$delegate = C4029l.b(new InterfaceC6082a() { // from class: Y4.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return DataStoreKey.keyMap_delegate$lambda$1();
            }
        });
    }

    private DataStoreKey(String str, int i10, String str2, DataStoreValueType dataStoreValueType) {
        this.key = str2;
        this.type = dataStoreValueType;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map keyMap_delegate$lambda$1() {
        InterfaceC5276a entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.e(P.e(C4207u.v(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((DataStoreKey) obj).key, obj);
        }
        return linkedHashMap;
    }

    public static DataStoreKey valueOf(String str) {
        return (DataStoreKey) Enum.valueOf(DataStoreKey.class, str);
    }

    public static DataStoreKey[] values() {
        return (DataStoreKey[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public final DataStoreValueType getType() {
        return this.type;
    }
}
