package com.braze.configuration;

import Od.F;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001?B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010>\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010%\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010(\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010)\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010*\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010+\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010-\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0018\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0018\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00107\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u00108\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0012\u00109\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010;\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010<\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0014\u0010=\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006@"}, d2 = {"Lcom/braze/configuration/BrazeConfig;", "", "builder", "Lcom/braze/configuration/BrazeConfig$Builder;", "<init>", "(Lcom/braze/configuration/BrazeConfig$Builder;)V", "apiKey", "", "serverTarget", "smallNotificationIcon", "largeNotificationIcon", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "sessionTimeout", "", "Ljava/lang/Integer;", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "isAdmMessagingRegistrationEnabled", "", "Ljava/lang/Boolean;", "willHandlePushDeepLinksAutomatically", "isAutomaticLocationCollectionEnabled", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "areGeofencesEnabled", "isInAppMessageTestPushEagerDisplayEnabled", "areAutomaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthEnabled", "isTouchModeRequiredForHtmlInAppMessages", "deviceObjectAllowlist", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "isDeviceObjectAllowlistEnabled", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "brazeSdkMetadata", "Lcom/braze/enums/BrazeSdkMetadata;", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "isFallbackFirebaseMessagingServiceEnabled", "fallbackFirebaseMessagingServiceClasspath", "shouldOptInWhenPushAuthorized", "shouldUseWindowFlagSecureInActivities", "shouldPersistWebViewWhenBackgroundingApp", "shouldAddStatusBarPaddingToInAppMessages", "toString", "Builder", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isAutomaticLocationCollectionEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final Boolean shouldAddStatusBarPaddingToInAppMessages;
    public final Boolean shouldOptInWhenPushAuthorized;
    public final Boolean shouldPersistWebViewWhenBackgroundingApp;
    public final Boolean shouldUseWindowFlagSecureInActivities;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    public /* synthetic */ BrazeConfig(Builder builder, AbstractC4854k abstractC4854k) {
        this(builder);
    }

    public String toString() {
        return this.builder.toString();
    }

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey();
        this.serverTarget = builder.getServerTarget();
        this.smallNotificationIcon = builder.getSmallNotificationIconName();
        this.largeNotificationIcon = builder.getLargeNotificationIconName();
        this.customEndpoint = builder.getCustomEndpoint();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName();
        this.sdkFlavor = builder.getSdkFlavor();
        this.sessionTimeout = builder.getSessionTimeout();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds();
        this.badNetworkInterval = builder.getBadNetworkInterval();
        this.goodNetworkInterval = builder.getGoodNetworkInterval();
        this.greatNetworkInterval = builder.getGreatNetworkInterval();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically();
        this.isAutomaticLocationCollectionEnabled = builder.getIsAutomaticLocationCollectionEnabled();
        this.isPushDeepLinkBackStackActivityEnabled = builder.getIsPushDeepLinkBackStackActivityEnabled();
        this.isSessionStartBasedTimeoutEnabled = builder.getIsSessionStartBasedTimeoutEnabled();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.getIsFirebaseCloudMessagingRegistrationEnabled();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.getIsContentCardsUnreadVisualIndicatorEnabled();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.getIsInAppMessageAccessibilityExclusiveModeEnabled();
        this.isPushWakeScreenForNotificationEnabled = builder.getIsPushWakeScreenForNotificationEnabled();
        this.isPushHtmlRenderingEnabled = builder.getIsPushHtmlRenderingEnabled();
        this.areGeofencesEnabled = builder.getIsGeofencesEnabled();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled();
        this.isSdkAuthEnabled = builder.getIsSdkAuthEnabled();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.getIsTouchModeRequiredForHtmlInAppMessages();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.getIsDeviceObjectAllowlistEnabled();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.getIsHtmlInAppMessageHtmlLinkTargetEnabled();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.getIsFallbackFirebaseMessagingServiceEnabled();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath();
        this.shouldOptInWhenPushAuthorized = builder.getShouldOptInWhenPushAuthorized();
        this.shouldUseWindowFlagSecureInActivities = builder.getShouldUseWindowFlagSecureInActivities();
        this.shouldPersistWebViewWhenBackgroundingApp = builder.getShouldPersistWebViewWhenBackgroundingApp();
        this.shouldAddStatusBarPaddingToInAppMessages = builder.getShouldAddStatusBarPaddingToInAppMessages();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\br\b\u0007\u0018\u00002\u00020\u0001BÃ\u0004\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010(\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b8\u00109B\t\b\u0016¢\u0006\u0004\b8\u0010:J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010BR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010B\"\u0004\bE\u0010FR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010C\u001a\u0004\bG\u0010B\"\u0004\bH\u0010FR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010C\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010FR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010C\u001a\u0004\bK\u0010B\"\u0004\bL\u0010FR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010C\u001a\u0004\bM\u0010B\"\u0004\bN\u0010FR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010C\u001a\u0004\bO\u0010B\"\u0004\bP\u0010FR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010C\u001a\u0004\bQ\u0010B\"\u0004\bR\u0010FR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010C\u001a\u0004\bS\u0010B\"\u0004\bT\u0010FR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010C\u001a\u0004\bU\u0010B\"\u0004\bV\u0010FR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010C\u001a\u0004\bW\u0010B\"\u0004\bX\u0010FR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010bR$\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010^\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010^\u001a\u0004\bg\u0010`\"\u0004\bh\u0010bR$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010^\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010^\u001a\u0004\bk\u0010`\"\u0004\bl\u0010bR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010^\u001a\u0004\bm\u0010`\"\u0004\bn\u0010bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010o\u001a\u0004\bt\u0010q\"\u0004\bu\u0010sR$\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010o\u001a\u0004\bv\u0010q\"\u0004\bw\u0010sR$\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010o\u001a\u0004\bx\u0010q\"\u0004\by\u0010sR$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010o\u001a\u0004\bz\u0010q\"\u0004\b{\u0010sR$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010o\u001a\u0004\b|\u0010q\"\u0004\b}\u0010sR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010o\u001a\u0004\b~\u0010q\"\u0004\b\u007f\u0010sR&\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u001f\u0010o\u001a\u0005\b\u0080\u0001\u0010q\"\u0005\b\u0081\u0001\u0010sR&\u0010 \u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b \u0010o\u001a\u0005\b\u0082\u0001\u0010q\"\u0005\b\u0083\u0001\u0010sR&\u0010!\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b!\u0010o\u001a\u0005\b\u0084\u0001\u0010q\"\u0005\b\u0085\u0001\u0010sR&\u0010\"\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\"\u0010o\u001a\u0005\b\u0086\u0001\u0010q\"\u0005\b\u0087\u0001\u0010sR&\u0010#\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b#\u0010o\u001a\u0005\b\u0088\u0001\u0010q\"\u0005\b\u0089\u0001\u0010sR&\u0010$\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b$\u0010o\u001a\u0005\b\u008a\u0001\u0010q\"\u0005\b\u008b\u0001\u0010sR&\u0010%\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b%\u0010o\u001a\u0005\b\u008c\u0001\u0010q\"\u0005\b\u008d\u0001\u0010sR&\u0010&\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b&\u0010o\u001a\u0005\b\u008e\u0001\u0010q\"\u0005\b\u008f\u0001\u0010sR&\u0010'\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b'\u0010o\u001a\u0005\b\u0090\u0001\u0010q\"\u0005\b\u0091\u0001\u0010sR/\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010+\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b+\u0010o\u001a\u0005\b\u0097\u0001\u0010q\"\u0005\b\u0098\u0001\u0010sR/\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b-\u0010\u0092\u0001\u001a\u0006\b\u0099\u0001\u0010\u0094\u0001\"\u0006\b\u009a\u0001\u0010\u0096\u0001R/\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b/\u0010\u0092\u0001\u001a\u0006\b\u009b\u0001\u0010\u0094\u0001\"\u0006\b\u009c\u0001\u0010\u0096\u0001R&\u00100\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b0\u0010o\u001a\u0005\b\u009d\u0001\u0010q\"\u0005\b\u009e\u0001\u0010sR&\u00101\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b1\u0010o\u001a\u0005\b\u009f\u0001\u0010q\"\u0005\b \u0001\u0010sR&\u00102\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b2\u0010o\u001a\u0005\b¡\u0001\u0010q\"\u0005\b¢\u0001\u0010sR&\u00103\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b3\u0010C\u001a\u0005\b£\u0001\u0010B\"\u0005\b¤\u0001\u0010FR&\u00104\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b4\u0010o\u001a\u0005\b¥\u0001\u0010q\"\u0005\b¦\u0001\u0010sR&\u00105\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b5\u0010o\u001a\u0005\b§\u0001\u0010q\"\u0005\b¨\u0001\u0010sR&\u00106\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b6\u0010o\u001a\u0005\b©\u0001\u0010q\"\u0005\bª\u0001\u0010sR&\u00107\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b7\u0010o\u001a\u0005\b«\u0001\u0010q\"\u0005\b¬\u0001\u0010s¨\u0006\u00ad\u0001"}, d2 = {"Lcom/braze/configuration/BrazeConfig$Builder;", "", "", "apiKey", "serverTarget", "smallNotificationIconName", "largeNotificationIconName", "customEndpoint", "defaultNotificationChannelName", "defaultNotificationChannelDescription", "pushDeepLinkBackStackActivityClassName", "firebaseCloudMessagingSenderIdKey", "customHtmlWebViewActivityClassName", "Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "", "sessionTimeout", "defaultNotificationAccentColor", "triggerActionMinimumTimeIntervalSeconds", "badNetworkInterval", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "", "admMessagingRegistrationEnabled", "handlePushDeepLinksAutomatically", "isAutomaticLocationCollectionEnabled", "isPushDeepLinkBackStackActivityEnabled", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushHtmlRenderingEnabled", "isGeofencesEnabled", "inAppMessageTestPushEagerDisplayEnabled", "automaticGeofenceRequestsEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isSdkAuthEnabled", "Ljava/util/EnumSet;", "Lcom/braze/enums/DeviceKey;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "brazeSdkMetadata", "Lcom/braze/enums/LocationProviderName;", "customLocationProviderNames", "isHtmlInAppMessageHtmlLinkTargetEnabled", "doesPushStoryDismissOnClick", "isFallbackFirebaseMessagingServiceEnabled", "fallbackFirebaseMessagingServiceClasspath", "shouldOptInWhenPushAuthorized", "shouldUseWindowFlagSecureInActivities", "shouldPersistWebViewWhenBackgroundingApp", "shouldAddStatusBarPaddingToInAppMessages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()V", "Lcom/braze/configuration/BrazeConfig;", "build", "()Lcom/braze/configuration/BrazeConfig;", "setApiKey", "(Ljava/lang/String;)Lcom/braze/configuration/BrazeConfig$Builder;", "setCustomEndpoint", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getApiKey$android_sdk_base_release", "setApiKey$android_sdk_base_release", "(Ljava/lang/String;)V", "getServerTarget$android_sdk_base_release", "setServerTarget$android_sdk_base_release", "getSmallNotificationIconName$android_sdk_base_release", "setSmallNotificationIconName$android_sdk_base_release", "getLargeNotificationIconName$android_sdk_base_release", "setLargeNotificationIconName$android_sdk_base_release", "getCustomEndpoint$android_sdk_base_release", "setCustomEndpoint$android_sdk_base_release", "getDefaultNotificationChannelName$android_sdk_base_release", "setDefaultNotificationChannelName$android_sdk_base_release", "getDefaultNotificationChannelDescription$android_sdk_base_release", "setDefaultNotificationChannelDescription$android_sdk_base_release", "getPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "setPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "getCustomHtmlWebViewActivityClassName$android_sdk_base_release", "setCustomHtmlWebViewActivityClassName$android_sdk_base_release", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor$android_sdk_base_release", "()Lcom/braze/enums/SdkFlavor;", "setSdkFlavor$android_sdk_base_release", "(Lcom/braze/enums/SdkFlavor;)V", "Ljava/lang/Integer;", "getSessionTimeout$android_sdk_base_release", "()Ljava/lang/Integer;", "setSessionTimeout$android_sdk_base_release", "(Ljava/lang/Integer;)V", "getDefaultNotificationAccentColor$android_sdk_base_release", "setDefaultNotificationAccentColor$android_sdk_base_release", "getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "getBadNetworkInterval$android_sdk_base_release", "setBadNetworkInterval$android_sdk_base_release", "getGoodNetworkInterval$android_sdk_base_release", "setGoodNetworkInterval$android_sdk_base_release", "getGreatNetworkInterval$android_sdk_base_release", "setGreatNetworkInterval$android_sdk_base_release", "getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "Ljava/lang/Boolean;", "getAdmMessagingRegistrationEnabled$android_sdk_base_release", "()Ljava/lang/Boolean;", "setAdmMessagingRegistrationEnabled$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "getHandlePushDeepLinksAutomatically$android_sdk_base_release", "setHandlePushDeepLinksAutomatically$android_sdk_base_release", "isAutomaticLocationCollectionEnabled$android_sdk_base_release", "setAutomaticLocationCollectionEnabled$android_sdk_base_release", "isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "isSessionStartBasedTimeoutEnabled$android_sdk_base_release", "setSessionStartBasedTimeoutEnabled$android_sdk_base_release", "isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "isPushWakeScreenForNotificationEnabled$android_sdk_base_release", "setPushWakeScreenForNotificationEnabled$android_sdk_base_release", "isPushHtmlRenderingEnabled$android_sdk_base_release", "setPushHtmlRenderingEnabled$android_sdk_base_release", "isGeofencesEnabled$android_sdk_base_release", "setGeofencesEnabled$android_sdk_base_release", "getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "getAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "setAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "isSdkAuthEnabled$android_sdk_base_release", "setSdkAuthEnabled$android_sdk_base_release", "Ljava/util/EnumSet;", "getDeviceObjectAllowlist$android_sdk_base_release", "()Ljava/util/EnumSet;", "setDeviceObjectAllowlist$android_sdk_base_release", "(Ljava/util/EnumSet;)V", "isDeviceObjectAllowlistEnabled$android_sdk_base_release", "setDeviceObjectAllowlistEnabled$android_sdk_base_release", "getBrazeSdkMetadata$android_sdk_base_release", "setBrazeSdkMetadata$android_sdk_base_release", "getCustomLocationProviderNames$android_sdk_base_release", "setCustomLocationProviderNames$android_sdk_base_release", "isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "getDoesPushStoryDismissOnClick$android_sdk_base_release", "setDoesPushStoryDismissOnClick$android_sdk_base_release", "isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "getShouldOptInWhenPushAuthorized$android_sdk_base_release", "setShouldOptInWhenPushAuthorized$android_sdk_base_release", "getShouldUseWindowFlagSecureInActivities$android_sdk_base_release", "setShouldUseWindowFlagSecureInActivities$android_sdk_base_release", "getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release", "setShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release", "getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release", "setShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isAutomaticLocationCollectionEnabled;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private Boolean shouldAddStatusBarPaddingToInAppMessages;
        private Boolean shouldOptInWhenPushAuthorized;
        private Boolean shouldPersistWebViewWhenBackgroundingApp;
        private Boolean shouldUseWindowFlagSecureInActivities;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet<DeviceKey> enumSet, Boolean bool17, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, String str11, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isAutomaticLocationCollectionEnabled = bool3;
            this.isPushDeepLinkBackStackActivityEnabled = bool4;
            this.isSessionStartBasedTimeoutEnabled = bool5;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool6;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool7;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool8;
            this.isPushWakeScreenForNotificationEnabled = bool9;
            this.isPushHtmlRenderingEnabled = bool10;
            this.isGeofencesEnabled = bool11;
            this.inAppMessageTestPushEagerDisplayEnabled = bool12;
            this.automaticGeofenceRequestsEnabled = bool13;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool14;
            this.isTouchModeRequiredForHtmlInAppMessages = bool15;
            this.isSdkAuthEnabled = bool16;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool17;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool18;
            this.doesPushStoryDismissOnClick = bool19;
            this.isFallbackFirebaseMessagingServiceEnabled = bool20;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
            this.shouldOptInWhenPushAuthorized = bool21;
            this.shouldUseWindowFlagSecureInActivities = bool22;
            this.shouldPersistWebViewWhenBackgroundingApp = bool23;
            this.shouldAddStatusBarPaddingToInAppMessages = bool24;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setApiKey$lambda$0() {
            return "Cannot set Braze API key to blank string. API key field not set";
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        /* JADX INFO: renamed from: getAdmMessagingRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getAdmMessagingRegistrationEnabled() {
            return this.admMessagingRegistrationEnabled;
        }

        /* JADX INFO: renamed from: getApiKey$android_sdk_base_release, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: getAutomaticGeofenceRequestsEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getAutomaticGeofenceRequestsEnabled() {
            return this.automaticGeofenceRequestsEnabled;
        }

        /* JADX INFO: renamed from: getBadNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getBadNetworkInterval() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        /* JADX INFO: renamed from: getCustomEndpoint$android_sdk_base_release, reason: from getter */
        public final String getCustomEndpoint() {
            return this.customEndpoint;
        }

        /* JADX INFO: renamed from: getCustomHtmlWebViewActivityClassName$android_sdk_base_release, reason: from getter */
        public final String getCustomHtmlWebViewActivityClassName() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        /* JADX INFO: renamed from: getDefaultNotificationAccentColor$android_sdk_base_release, reason: from getter */
        public final Integer getDefaultNotificationAccentColor() {
            return this.defaultNotificationAccentColor;
        }

        /* JADX INFO: renamed from: getDefaultNotificationChannelDescription$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelDescription() {
            return this.defaultNotificationChannelDescription;
        }

        /* JADX INFO: renamed from: getDefaultNotificationChannelName$android_sdk_base_release, reason: from getter */
        public final String getDefaultNotificationChannelName() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        /* JADX INFO: renamed from: getDoesPushStoryDismissOnClick$android_sdk_base_release, reason: from getter */
        public final Boolean getDoesPushStoryDismissOnClick() {
            return this.doesPushStoryDismissOnClick;
        }

        /* JADX INFO: renamed from: getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release, reason: from getter */
        public final String getFallbackFirebaseMessagingServiceClasspath() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        /* JADX INFO: renamed from: getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release, reason: from getter */
        public final String getFirebaseCloudMessagingSenderIdKey() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        /* JADX INFO: renamed from: getGoodNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getGoodNetworkInterval() {
            return this.goodNetworkInterval;
        }

        /* JADX INFO: renamed from: getGreatNetworkInterval$android_sdk_base_release, reason: from getter */
        public final Integer getGreatNetworkInterval() {
            return this.greatNetworkInterval;
        }

        /* JADX INFO: renamed from: getHandlePushDeepLinksAutomatically$android_sdk_base_release, reason: from getter */
        public final Boolean getHandlePushDeepLinksAutomatically() {
            return this.handlePushDeepLinksAutomatically;
        }

        /* JADX INFO: renamed from: getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getInAppMessageTestPushEagerDisplayEnabled() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        /* JADX INFO: renamed from: getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release, reason: from getter */
        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        /* JADX INFO: renamed from: getLargeNotificationIconName$android_sdk_base_release, reason: from getter */
        public final String getLargeNotificationIconName() {
            return this.largeNotificationIconName;
        }

        /* JADX INFO: renamed from: getPushDeepLinkBackStackActivityClassName$android_sdk_base_release, reason: from getter */
        public final String getPushDeepLinkBackStackActivityClassName() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        /* JADX INFO: renamed from: getSdkFlavor$android_sdk_base_release, reason: from getter */
        public final SdkFlavor getSdkFlavor() {
            return this.sdkFlavor;
        }

        /* JADX INFO: renamed from: getServerTarget$android_sdk_base_release, reason: from getter */
        public final String getServerTarget() {
            return this.serverTarget;
        }

        /* JADX INFO: renamed from: getSessionTimeout$android_sdk_base_release, reason: from getter */
        public final Integer getSessionTimeout() {
            return this.sessionTimeout;
        }

        /* JADX INFO: renamed from: getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldAddStatusBarPaddingToInAppMessages() {
            return this.shouldAddStatusBarPaddingToInAppMessages;
        }

        /* JADX INFO: renamed from: getShouldOptInWhenPushAuthorized$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldOptInWhenPushAuthorized() {
            return this.shouldOptInWhenPushAuthorized;
        }

        /* JADX INFO: renamed from: getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldPersistWebViewWhenBackgroundingApp() {
            return this.shouldPersistWebViewWhenBackgroundingApp;
        }

        /* JADX INFO: renamed from: getShouldUseWindowFlagSecureInActivities$android_sdk_base_release, reason: from getter */
        public final Boolean getShouldUseWindowFlagSecureInActivities() {
            return this.shouldUseWindowFlagSecureInActivities;
        }

        /* JADX INFO: renamed from: getSmallNotificationIconName$android_sdk_base_release, reason: from getter */
        public final String getSmallNotificationIconName() {
            return this.smallNotificationIconName;
        }

        /* JADX INFO: renamed from: getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release, reason: from getter */
        public final Integer getTriggerActionMinimumTimeIntervalSeconds() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        /* JADX INFO: renamed from: isAutomaticLocationCollectionEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsAutomaticLocationCollectionEnabled() {
            return this.isAutomaticLocationCollectionEnabled;
        }

        /* JADX INFO: renamed from: isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsContentCardsUnreadVisualIndicatorEnabled() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        /* JADX INFO: renamed from: isDeviceObjectAllowlistEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsDeviceObjectAllowlistEnabled() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        /* JADX INFO: renamed from: isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFallbackFirebaseMessagingServiceEnabled() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        /* JADX INFO: renamed from: isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseCloudMessagingRegistrationEnabled() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        /* JADX INFO: renamed from: isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        /* JADX INFO: renamed from: isGeofencesEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsGeofencesEnabled() {
            return this.isGeofencesEnabled;
        }

        /* JADX INFO: renamed from: isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsHtmlInAppMessageHtmlLinkTargetEnabled() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        /* JADX INFO: renamed from: isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsInAppMessageAccessibilityExclusiveModeEnabled() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        /* JADX INFO: renamed from: isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushDeepLinkBackStackActivityEnabled() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        /* JADX INFO: renamed from: isPushHtmlRenderingEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushHtmlRenderingEnabled() {
            return this.isPushHtmlRenderingEnabled;
        }

        /* JADX INFO: renamed from: isPushWakeScreenForNotificationEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsPushWakeScreenForNotificationEnabled() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        /* JADX INFO: renamed from: isSdkAuthEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSdkAuthEnabled() {
            return this.isSdkAuthEnabled;
        }

        /* JADX INFO: renamed from: isSessionStartBasedTimeoutEnabled$android_sdk_base_release, reason: from getter */
        public final Boolean getIsSessionStartBasedTimeoutEnabled() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        /* JADX INFO: renamed from: isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release, reason: from getter */
        public final Boolean getIsTouchModeRequiredForHtmlInAppMessages() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setApiKey(String apiKey) {
            AbstractC4862t.e(apiKey, "apiKey");
            if (F.k0(apiKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: V4.a
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazeConfig.Builder.setApiKey$lambda$0();
                    }
                }, 6, (Object) null);
                return this;
            }
            this.apiKey = apiKey;
            return this;
        }

        public final Builder setCustomEndpoint(String customEndpoint) {
            AbstractC4862t.e(customEndpoint, "customEndpoint");
            this.customEndpoint = customEndpoint;
            return this;
        }

        public String toString() {
            return "Builder(apiKey=" + this.apiKey + ", serverTarget=" + this.serverTarget + ", smallNotificationIconName=" + this.smallNotificationIconName + ", largeNotificationIconName=" + this.largeNotificationIconName + ", customEndpoint=" + this.customEndpoint + ", defaultNotificationChannelName=" + this.defaultNotificationChannelName + ", defaultNotificationChannelDescription=" + this.defaultNotificationChannelDescription + ", pushDeepLinkBackStackActivityClassName=" + this.pushDeepLinkBackStackActivityClassName + ", firebaseCloudMessagingSenderIdKey=" + this.firebaseCloudMessagingSenderIdKey + ", customHtmlWebViewActivityClassName=" + this.customHtmlWebViewActivityClassName + ", sdkFlavor=" + this.sdkFlavor + ", sessionTimeout=" + this.sessionTimeout + ", defaultNotificationAccentColor=" + this.defaultNotificationAccentColor + ", triggerActionMinimumTimeIntervalSeconds=" + this.triggerActionMinimumTimeIntervalSeconds + ", badNetworkInterval=" + this.badNetworkInterval + ", goodNetworkInterval=" + this.goodNetworkInterval + ", greatNetworkInterval=" + this.greatNetworkInterval + ", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=" + this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs + ", admMessagingRegistrationEnabled=" + this.admMessagingRegistrationEnabled + ", handlePushDeepLinksAutomatically=" + this.handlePushDeepLinksAutomatically + ", isAutomaticLocationCollectionEnabled=" + this.isAutomaticLocationCollectionEnabled + ", isPushDeepLinkBackStackActivityEnabled=" + this.isPushDeepLinkBackStackActivityEnabled + ", isSessionStartBasedTimeoutEnabled=" + this.isSessionStartBasedTimeoutEnabled + ", isFirebaseCloudMessagingRegistrationEnabled=" + this.isFirebaseCloudMessagingRegistrationEnabled + ", isContentCardsUnreadVisualIndicatorEnabled=" + this.isContentCardsUnreadVisualIndicatorEnabled + ", isInAppMessageAccessibilityExclusiveModeEnabled=" + this.isInAppMessageAccessibilityExclusiveModeEnabled + ", isPushWakeScreenForNotificationEnabled=" + this.isPushWakeScreenForNotificationEnabled + ", isPushHtmlRenderingEnabled=" + this.isPushHtmlRenderingEnabled + ", isGeofencesEnabled=" + this.isGeofencesEnabled + ", inAppMessageTestPushEagerDisplayEnabled=" + this.inAppMessageTestPushEagerDisplayEnabled + ", automaticGeofenceRequestsEnabled=" + this.automaticGeofenceRequestsEnabled + ", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=" + this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled + ", isTouchModeRequiredForHtmlInAppMessages=" + this.isTouchModeRequiredForHtmlInAppMessages + ", isSdkAuthEnabled=" + this.isSdkAuthEnabled + ", deviceObjectAllowlist=" + this.deviceObjectAllowlist + ", isDeviceObjectAllowlistEnabled=" + this.isDeviceObjectAllowlistEnabled + ", brazeSdkMetadata=" + this.brazeSdkMetadata + ", customLocationProviderNames=" + this.customLocationProviderNames + ", isHtmlInAppMessageHtmlLinkTargetEnabled=" + this.isHtmlInAppMessageHtmlLinkTargetEnabled + ", doesPushStoryDismissOnClick=" + this.doesPushStoryDismissOnClick + ", isFallbackFirebaseMessagingServiceEnabled=" + this.isFallbackFirebaseMessagingServiceEnabled + ", fallbackFirebaseMessagingServiceClasspath=" + this.fallbackFirebaseMessagingServiceClasspath + ", shouldOptInWhenPushAuthorized=" + this.shouldOptInWhenPushAuthorized + ", shouldUseWindowFlagSecureInActivities=" + this.shouldUseWindowFlagSecureInActivities + ", shouldAddStatusBarPaddingToInAppMessages=" + this.shouldAddStatusBarPaddingToInAppMessages + "))";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet enumSet, Boolean bool17, EnumSet enumSet2, EnumSet enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, String str11, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, int i10, int i11, AbstractC4854k abstractC4854k) {
            String str12 = (i10 & 1) != 0 ? null : str;
            this(str12, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & RecognitionOptions.UPC_E) != 0 ? null : sdkFlavor, (i10 & RecognitionOptions.PDF417) != 0 ? null : num, (i10 & RecognitionOptions.AZTEC) != 0 ? null : num2, (i10 & 8192) != 0 ? null : num3, (i10 & 16384) != 0 ? null : num4, (i10 & 32768) != 0 ? null : num5, (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? null : num6, (i10 & 131072) != 0 ? null : num7, (i10 & 262144) != 0 ? null : bool, (i10 & ImageMetadata.LENS_APERTURE) != 0 ? null : bool2, (i10 & ImageMetadata.SHADING_MODE) != 0 ? null : bool3, (i10 & 2097152) != 0 ? null : bool4, (i10 & 4194304) != 0 ? null : bool5, (i10 & 8388608) != 0 ? null : bool6, (i10 & 16777216) != 0 ? null : bool7, (i10 & 33554432) != 0 ? null : bool8, (i10 & 67108864) != 0 ? null : bool9, (i10 & 134217728) != 0 ? null : bool10, (i10 & 268435456) != 0 ? null : bool11, (i10 & 536870912) != 0 ? null : bool12, (i10 & 1073741824) != 0 ? null : bool13, (i10 & Integer.MIN_VALUE) != 0 ? null : bool14, (i11 & 1) != 0 ? null : bool15, (i11 & 2) != 0 ? null : bool16, (i11 & 4) != 0 ? null : enumSet, (i11 & 8) != 0 ? null : bool17, (i11 & 16) != 0 ? null : enumSet2, (i11 & 32) != 0 ? null : enumSet3, (i11 & 64) != 0 ? null : bool18, (i11 & 128) != 0 ? null : bool19, (i11 & 256) != 0 ? null : bool20, (i11 & 512) != 0 ? null : str11, (i11 & RecognitionOptions.UPC_E) != 0 ? null : bool21, (i11 & RecognitionOptions.PDF417) != 0 ? null : bool22, (i11 & RecognitionOptions.AZTEC) != 0 ? null : bool23, (i11 & 8192) != 0 ? null : bool24);
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 16383, null);
        }
    }
}
