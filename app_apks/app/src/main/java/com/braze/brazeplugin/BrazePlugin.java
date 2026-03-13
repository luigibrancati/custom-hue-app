package com.braze.brazeplugin;

import Bc.k;
import Od.F;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.brazeplugin.BrazePlugin;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SimpleValueCallback;
import com.braze.models.Banner;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.ui.activities.ContentCardsActivity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import fc.AbstractC4040w;
import fc.C4015H;
import gc.C4207u;
import gc.P;
import gc.Q;
import gc.T;
import gc.U;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.ProfileChunk;
import io.sentry.SentryLogEvent;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.FeatureFlag;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020\b*\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J#\u00106\u001a\u0002052\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0002\b\u0003\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/braze/brazeplugin/BrazePlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "onDetachedFromActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onReattachedToActivityForConfigChanges", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Landroid/content/Context;", "context", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "initPlugin", "(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V", "Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "errorEvent", "handleSdkAuthenticationError", "(Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;)V", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "block", "runOnUser", "(Lcom/braze/Braze;Lvc/l;)V", "", "type", "Lcom/braze/enums/NotificationSubscriptionType;", "getSubscriptionType", "(Ljava/lang/String;)Lcom/braze/enums/NotificationSubscriptionType;", "", "value", "Lcom/braze/enums/Month;", "getMonth", "(I)Lcom/braze/enums/Month;", "", "arguments", "Lcom/braze/models/outgoing/BrazeProperties;", "convertToBrazeProperties", "(Ljava/util/Map;)Lcom/braze/models/outgoing/BrazeProperties;", "Landroid/content/Context;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "Lcom/braze/brazeplugin/FlutterConfiguration;", "flutterConfiguration", "Lcom/braze/brazeplugin/FlutterConfiguration;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Companion", "braze_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrazePlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {
    private static boolean isBrazePluginIsReady;
    private static Braze mockBrazeInstance;
    private Activity activity;
    private MethodChannel channel;
    private Context context;
    private FlutterConfiguration flutterConfiguration;
    private FlutterPlugin.FlutterPluginBinding flutterPluginBinding;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static List<BrazePlugin> activePlugins = new ArrayList();
    private static List<BrazePushEvent> pendingPushEvents = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0 H\u0007¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\u000eJ\u001d\u0010+\u001a\u00020\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0 H\u0007¢\u0006\u0004\b+\u0010$R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010$R(\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u00100\"\u0004\b4\u0010$R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/braze/brazeplugin/BrazePlugin$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/braze/Braze;", "getBrazeInstance", "(Landroid/content/Context;)Lcom/braze/Braze;", "Lfc/H;", "reprocessPendingPushEvents", "Lcom/braze/events/BrazePushEvent;", "event", "handlePushEvent", "(Lcom/braze/events/BrazePushEvent;)V", "Lkotlin/Function1;", "Lcom/braze/brazeplugin/BrazePlugin;", "block", "executeOnAllPlugins", "(Lvc/l;)V", "Landroid/os/Bundle;", "bundle", "", "", "filteringKeys", "Lorg/json/JSONObject;", "convertToMap", "(Landroid/os/Bundle;Ljava/util/Set;)Lorg/json/JSONObject;", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "processInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "Lcom/braze/models/cards/Card;", "contentCardList", "processContentCards", "(Ljava/util/List;)V", "Lcom/braze/models/Banner;", "bannerList", "processBanners", "processPushNotificationEvent", "Lcom/braze/models/FeatureFlag;", "featureFlagList", "processFeatureFlags", "", "activePlugins", "Ljava/util/List;", "getActivePlugins", "()Ljava/util/List;", "setActivePlugins", "pendingPushEvents", "getPendingPushEvents", "setPendingPushEvents", "", "isBrazePluginIsReady", "Z", "mockBrazeInstance", "Lcom/braze/Braze;", "braze_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BrazePushEventType.values().length];
                try {
                    iArr[BrazePushEventType.NOTIFICATION_RECEIVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BrazePushEventType.NOTIFICATION_OPENED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private final JSONObject convertToMap(Bundle bundle, Set<String> filteringKeys) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Set<String> setKeySet = bundle.keySet();
            AbstractC4862t.d(setKeySet, "keySet(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (!filteringKeys.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k.e(P.e(C4207u.v(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(obj2, bundle.get((String) obj2));
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JSONObject convertToMap$default(Companion companion, Bundle bundle, Set set, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                set = U.d();
            }
            return companion.convertToMap(bundle, set);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void executeOnAllPlugins(final l block) {
            for (final BrazePlugin brazePlugin : getActivePlugins()) {
                Activity activity = brazePlugin.activity;
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: S4.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            block.invoke(brazePlugin);
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Braze getBrazeInstance(Context context) {
            Braze braze = BrazePlugin.mockBrazeInstance;
            return braze == null ? Braze.INSTANCE.getInstance(context) : braze;
        }

        private final void handlePushEvent(BrazePushEvent event) throws JSONException {
            String str;
            int i10 = WhenMappings.$EnumSwitchMapping$0[event.getEventType().ordinal()];
            boolean z10 = true;
            if (i10 == 1) {
                str = "push_received";
            } else if (i10 != 2) {
                return;
            } else {
                str = "push_opened";
            }
            BrazeNotificationPayload notificationPayload = event.getNotificationPayload();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("payload_type", str);
            jSONObject.put("url", notificationPayload.getDeeplink());
            jSONObject.put("title", notificationPayload.getTitleText());
            jSONObject.put(SentryLogEvent.JsonKeys.BODY, notificationPayload.getContentText());
            jSONObject.put("summary_text", notificationPayload.getSummaryText());
            Integer notificationBadgeNumber = notificationPayload.getNotificationBadgeNumber();
            if (notificationBadgeNumber != null) {
                jSONObject.put("badge_count", notificationBadgeNumber.intValue());
            }
            Long lValueOf = Long.valueOf(notificationPayload.getNotificationExtras().getLong("braze_push_received_timestamp"));
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jSONObject.put("timestamp", lValueOf.longValue());
            }
            jSONObject.put("use_webview", AbstractC4862t.a(notificationPayload.getNotificationExtras().getString("ab_use_webview"), "true"));
            jSONObject.put("is_silent", notificationPayload.getTitleText() == null && notificationPayload.getContentText() == null);
            if (!notificationPayload.getIsUninstallTrackingPush() && !notificationPayload.getShouldRefreshFeatureFlags()) {
                z10 = false;
            }
            jSONObject.put("is_braze_internal", z10);
            jSONObject.put("image_url", notificationPayload.getBigImageUrl());
            jSONObject.put(ProfileChunk.PLATFORM_ANDROID, convertToMap$default(BrazePlugin.INSTANCE, notificationPayload.getNotificationExtras(), null, 2, null));
            jSONObject.put("braze_properties", convertToMap(notificationPayload.getBrazeExtras(), T.c("appboy_image_url")));
            final HashMap mapK = Q.k(AbstractC4040w.a("pushEvent", jSONObject.toString()));
            executeOnAllPlugins(new l() { // from class: S4.o0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return BrazePlugin.Companion.handlePushEvent$lambda$12(mapK, (BrazePlugin) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H handlePushEvent$lambda$12(HashMap map, BrazePlugin it) {
            AbstractC4862t.e(it, "it");
            MethodChannel methodChannel = it.channel;
            if (methodChannel == null) {
                AbstractC4862t.p("channel");
                methodChannel = null;
            }
            methodChannel.invokeMethod("handleBrazePushNotificationEvent", map);
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processBanners$lambda$4() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeBanners'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H processBanners$lambda$5(HashMap map, BrazePlugin it) {
            AbstractC4862t.e(it, "it");
            MethodChannel methodChannel = it.channel;
            if (methodChannel == null) {
                AbstractC4862t.p("channel");
                methodChannel = null;
            }
            methodChannel.invokeMethod("handleBrazeBanners", map);
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processContentCards$lambda$2() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeContentCards'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H processContentCards$lambda$3(HashMap map, BrazePlugin it) {
            AbstractC4862t.e(it, "it");
            MethodChannel methodChannel = it.channel;
            if (methodChannel == null) {
                AbstractC4862t.p("channel");
                methodChannel = null;
            }
            methodChannel.invokeMethod("handleBrazeContentCards", map);
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processFeatureFlags$lambda$13() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeFeatureFlags'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H processFeatureFlags$lambda$15(HashMap map, BrazePlugin it) {
            AbstractC4862t.e(it, "it");
            MethodChannel methodChannel = it.channel;
            if (methodChannel == null) {
                AbstractC4862t.p("channel");
                methodChannel = null;
            }
            methodChannel.invokeMethod("handleBrazeFeatureFlags", map);
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processInAppMessage$lambda$0() {
            return "There are no active Braze Plugins. Not calling 'handleBrazeInAppMessage'.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4015H processInAppMessage$lambda$1(HashMap map, BrazePlugin it) {
            AbstractC4862t.e(it, "it");
            MethodChannel methodChannel = it.channel;
            if (methodChannel == null) {
                AbstractC4862t.p("channel");
                methodChannel = null;
            }
            methodChannel.invokeMethod("handleBrazeInAppMessage", map);
            return C4015H.f34254a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String processPushNotificationEvent$lambda$6() {
            return "There are no active Braze Plugins. Not calling 'handleBrazePushNotificationEvent'. Storing the event for later processing.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void reprocessPendingPushEvents() throws JSONException {
            if (getPendingPushEvents().isEmpty() || getActivePlugins().isEmpty() || !BrazePlugin.isBrazePluginIsReady) {
                return;
            }
            Iterator<T> it = getPendingPushEvents().iterator();
            while (it.hasNext()) {
                BrazePlugin.INSTANCE.handlePushEvent((BrazePushEvent) it.next());
            }
            getPendingPushEvents().clear();
        }

        public final List<BrazePlugin> getActivePlugins() {
            return BrazePlugin.activePlugins;
        }

        public final List<BrazePushEvent> getPendingPushEvents() {
            return BrazePlugin.pendingPushEvents;
        }

        public final void processBanners(List<Banner> bannerList) {
            AbstractC4862t.e(bannerList, "bannerList");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.y0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePlugin.Companion.processBanners$lambda$4();
                    }
                }, 6, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Banner> it = bannerList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey().get("banner").toString());
            }
            final HashMap mapK = Q.k(AbstractC4040w.a("banners", arrayList));
            executeOnAllPlugins(new l() { // from class: S4.p0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return BrazePlugin.Companion.processBanners$lambda$5(mapK, (BrazePlugin) obj);
                }
            });
        }

        public final void processContentCards(List<? extends Card> contentCardList) {
            AbstractC4862t.e(contentCardList, "contentCardList");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.v0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePlugin.Companion.processContentCards$lambda$2();
                    }
                }, 6, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Card> it = contentCardList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey().toString());
            }
            final HashMap mapK = Q.k(AbstractC4040w.a("contentCards", arrayList));
            executeOnAllPlugins(new l() { // from class: S4.w0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return BrazePlugin.Companion.processContentCards$lambda$3(mapK, (BrazePlugin) obj);
                }
            });
        }

        public final void processFeatureFlags(List<com.braze.models.FeatureFlag> featureFlagList) {
            AbstractC4862t.e(featureFlagList, "featureFlagList");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.t0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePlugin.Companion.processFeatureFlags$lambda$13();
                    }
                }, 6, (Object) null);
                return;
            }
            ArrayList arrayList = new ArrayList(C4207u.v(featureFlagList, 10));
            Iterator<T> it = featureFlagList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.braze.models.FeatureFlag) it.next()).getKey().toString());
            }
            final HashMap mapK = Q.k(AbstractC4040w.a("featureFlags", arrayList));
            executeOnAllPlugins(new l() { // from class: S4.u0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return BrazePlugin.Companion.processFeatureFlags$lambda$15(mapK, (BrazePlugin) obj);
                }
            });
        }

        public final void processInAppMessage(IInAppMessage inAppMessage) {
            AbstractC4862t.e(inAppMessage, "inAppMessage");
            if (getActivePlugins().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.r0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePlugin.Companion.processInAppMessage$lambda$0();
                    }
                }, 6, (Object) null);
            } else {
                final HashMap mapK = Q.k(AbstractC4040w.a("inAppMessage", inAppMessage.getKey().toString()));
                executeOnAllPlugins(new l() { // from class: S4.s0
                    @Override // vc.l
                    public final Object invoke(Object obj) {
                        return BrazePlugin.Companion.processInAppMessage$lambda$1(mapK, (BrazePlugin) obj);
                    }
                });
            }
        }

        public final void processPushNotificationEvent(BrazePushEvent event) throws JSONException {
            AbstractC4862t.e(event, "event");
            if (!getActivePlugins().isEmpty() && BrazePlugin.isBrazePluginIsReady) {
                handlePushEvent(event);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.x0
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return BrazePlugin.Companion.processPushNotificationEvent$lambda$6();
                    }
                }, 6, (Object) null);
                getPendingPushEvents().add(event);
            }
        }

        private Companion() {
        }
    }

    private final BrazeProperties convertToBrazeProperties(Map<String, ?> arguments) {
        return arguments == null ? new BrazeProperties() : new BrazeProperties(new JSONObject(arguments));
    }

    private final Month getMonth(int value) {
        Month month = Month.INSTANCE.getMonth(value - 1);
        if (month != null) {
            return month;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.g0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazePlugin.getMonth$lambda$66();
            }
        }, 6, (Object) null);
        return Month.JANUARY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMonth$lambda$66() {
        return "Invalid `null` month. Defaulting to January.";
    }

    private final NotificationSubscriptionType getSubscriptionType(String type) {
        String string = F.e1(type).toString();
        int iHashCode = string.hashCode();
        if (iHashCode == -938807766) {
            if (string.equals("SubscriptionType.unsubscribed")) {
                return NotificationSubscriptionType.UNSUBSCRIBED;
            }
            return null;
        }
        if (iHashCode == 655408273) {
            if (string.equals("SubscriptionType.subscribed")) {
                return NotificationSubscriptionType.SUBSCRIBED;
            }
            return null;
        }
        if (iHashCode == 1559119849 && string.equals("SubscriptionType.opted_in")) {
            return NotificationSubscriptionType.OPTED_IN;
        }
        return null;
    }

    private final void handleSdkAuthenticationError(BrazeSdkAuthenticationErrorEvent errorEvent) {
        if (activePlugins.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.h0
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazePlugin.handleSdkAuthenticationError$lambda$64();
                }
            }, 6, (Object) null);
        } else {
            final HashMap mapK = Q.k(AbstractC4040w.a("sdkAuthenticationError", new JSONObject(Q.k(AbstractC4040w.a("code", String.valueOf(errorEvent.getErrorCode())), AbstractC4040w.a("reason", errorEvent.getErrorReason()), AbstractC4040w.a(Constants.USER_ID, errorEvent.getUserId())).toString()).toString()));
            INSTANCE.executeOnAllPlugins(new l() { // from class: S4.j0
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return BrazePlugin.handleSdkAuthenticationError$lambda$65(mapK, (BrazePlugin) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleSdkAuthenticationError$lambda$64() {
        return "There are no active Braze Plugins. Not calling 'handleSdkAuthenticationError'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H handleSdkAuthenticationError$lambda$65(HashMap map, BrazePlugin it) {
        AbstractC4862t.e(it, "it");
        MethodChannel methodChannel = it.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("handleSdkAuthenticationError", map);
        return C4015H.f34254a;
    }

    private final void initPlugin(Context context, BinaryMessenger messenger) {
        this.flutterConfiguration = new FlutterConfiguration(context);
        MethodChannel methodChannel = new MethodChannel(messenger, "braze_plugin");
        methodChannel.setMethodCallHandler(this);
        this.context = context;
        this.channel = methodChannel;
        activePlugins.add(this);
        INSTANCE.getBrazeInstance(context).subscribeToSdkAuthenticationFailures(new IEventSubscriber() { // from class: S4.f0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazePlugin.initPlugin$lambda$0(this.f15355a, (BrazeSdkAuthenticationErrorEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPlugin$lambda$0(BrazePlugin brazePlugin, BrazeSdkAuthenticationErrorEvent message) {
        AbstractC4862t.e(message, "message");
        brazePlugin.handleSdkAuthenticationError(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onAttachedToActivity$lambda$1() {
        return "Running Flutter BrazePlugin automatic initialization";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$10() {
        return "Unexpected null parameter(s) in `addAlias`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$11(String str, String str2, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.addAlias(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$12() {
        return "Unexpected null parameter(s) in `addToCustomAttributeArray`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$13(String str, String str2, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.addToCustomAttributeArray(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$14() {
        return "Unexpected null parameter(s) in `removeFromCustomAttributeArray`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$15(String str, String str2, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.removeFromCustomAttributeArray(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$17() {
        return "Unexpected null parameter(s) in `setNestedCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$18(String str, JSONObject jSONObject, boolean z10, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomUserAttribute(str, jSONObject, z10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$19() {
        return "Unexpected null parameter(s) in `setCustomUserAttributeArrayOfStrings`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$20(String str, String[] strArr, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomAttributeArray(str, strArr);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$22() {
        return "Unexpected null parameter(s) in `setCustomUserAttributeArrayOfObjects`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$23(String str, JSONArray jSONArray, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        BrazeUser.setCustomAttribute$default(user, str, jSONArray, false, 4, null);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$24() {
        return "Unexpected null parameter(s) in `setStringCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$25(String str, String str2, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomUserAttribute(str, str2);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$26() {
        return "Unexpected null key in `setDoubleCustomUserAttribute`";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$27(String str, double d10, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomUserAttribute(str, d10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$28() {
        return "Unexpected null key in `setDateCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$29(String str, long j10, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomUserAttributeToSecondsFromEpoch(str, j10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$30() {
        return "Unexpected null key in `setIntCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$31(String str, int i10, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomUserAttribute(str, i10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$32() {
        return "Unexpected null key in `incrementCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$33(String str, int i10, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.incrementCustomUserAttribute(str, i10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$34() {
        return "Unexpected null key in `setBoolCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$35(String str, boolean z10, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCustomUserAttribute(str, z10);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$36() {
        return "Unexpected null key in `unsetCustomUserAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$37(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.unsetCustomUserAttribute(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$38() {
        return "Unexpected null type in `setPushNotificationSubscriptionType`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$39(NotificationSubscriptionType notificationSubscriptionType, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$4(MethodChannel.Result result, BrazeUser it) {
        AbstractC4862t.e(it, "it");
        if (F.k0(it.getUserId())) {
            result.success(null);
        } else {
            result.success(it.getUserId());
        }
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$40() {
        return "Unexpected null type in `setEmailNotificationSubscriptionType`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$41(NotificationSubscriptionType notificationSubscriptionType, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$42() {
        return "Unexpected null groupId in `addToSubscriptionGroup`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$43(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.addToSubscriptionGroup(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$44() {
        return "Unexpected null groupId in `removeFromSubscriptionGroup`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$45(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.removeFromSubscriptionGroup(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$46() {
        return "Unexpected null key in `setLocationCustomAttribute`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$47(String str, double d10, double d11, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setLocationCustomAttribute(str, d10, d11);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$48(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setFirstName(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$49(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setLastName(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$50(int i10, Month month, int i11, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setDateOfBirth(i10, month, i11);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$51(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setEmail(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$52(Gender gender, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setGender(gender);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$53(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setLanguage(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$54(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setCountry(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$55(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setHomeCity(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$56(String str, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setPhoneNumber(str);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$57() {
        return "Unexpected null parameter(s) in `setAttributionData`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$58(AttributionData attributionData, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        user.setAttributionData(attributionData);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$59() {
        return "Unexpected null parameter(s) in `setLastKnownLocation`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$6() {
        return "Unexpected null placementId in `getBanner`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$60(Double d10, Double d11, Double d12, Double d13, BrazeUser user) {
        AbstractC4862t.e(user, "user");
        BrazeUser.setLastKnownLocation$default(user, d10.doubleValue(), d11.doubleValue(), d12, d13, null, 16, null);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$61() {
        return "Unexpected null id in `getFeatureFlagByID`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$63() {
        return "Unexpected null id in `logFeatureFlagImpression`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$7() {
        return "Unexpected null ids in `requestBannersRefresh`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$8() {
        return "Unexpected null placementId in `logBannerClicked`.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onMethodCall$lambda$9() {
        return "Unexpected null placementId in `logBannerImpression`.";
    }

    private final void runOnUser(Braze braze, final l lVar) {
        braze.getCurrentUser(new SimpleValueCallback<BrazeUser>() { // from class: com.braze.brazeplugin.BrazePlugin.runOnUser.1
            @Override // com.braze.events.SimpleValueCallback, com.braze.events.IValueCallback
            public void onSuccess(BrazeUser value) {
                AbstractC4862t.e(value, "value");
                super.onSuccess(value);
                lVar.invoke(value);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding r13) throws org.json.JSONException {
        /*
            r12 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.AbstractC4862t.e(r13, r0)
            android.app.Activity r0 = r13.getActivity()
            r12.activity = r0
            com.braze.brazeplugin.IntegrationInitializer r0 = com.braze.brazeplugin.IntegrationInitializer.INSTANCE
            boolean r1 = r0.isUninitialized()
            if (r1 == 0) goto L4c
            com.braze.brazeplugin.FlutterConfiguration r1 = r12.flutterConfiguration
            r2 = 0
            java.lang.String r3 = "flutterConfiguration"
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.AbstractC4862t.p(r3)
            r1 = r2
        L1e:
            boolean r1 = r1.isAutomaticInitializationEnabled()
            if (r1 == 0) goto L4c
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.f28626I
            S4.e r9 = new S4.e
            r9.<init>()
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)
            android.app.Activity r12 = r5.activity
            if (r12 == 0) goto L4d
            android.app.Application r12 = r12.getApplication()
            if (r12 == 0) goto L4d
            com.braze.brazeplugin.FlutterConfiguration r1 = r5.flutterConfiguration
            if (r1 != 0) goto L47
            kotlin.jvm.internal.AbstractC4862t.p(r3)
            goto L48
        L47:
            r2 = r1
        L48:
            r0.initializePlugin$braze_plugin_release(r12, r2)
            goto L4d
        L4c:
            r5 = r12
        L4d:
            io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding r12 = r5.flutterPluginBinding
            if (r12 == 0) goto L76
            com.braze.brazeplugin.BrazeUIHandler r0 = new com.braze.brazeplugin.BrazeUIHandler
            io.flutter.plugin.common.BinaryMessenger r1 = r12.getBinaryMessenger()
            java.lang.String r2 = "getBinaryMessenger(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r1, r2)
            r0.<init>(r1)
            io.flutter.plugin.platform.PlatformViewRegistry r12 = r12.getPlatformViewRegistry()
            com.braze.brazeplugin.BrazeBannerViewFactory r1 = new com.braze.brazeplugin.BrazeBannerViewFactory
            android.app.Activity r13 = r13.getActivity()
            java.lang.String r2 = "getActivity(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r13, r2)
            r1.<init>(r0, r13)
            java.lang.String r13 = "BrazeBannerView"
            r12.registerViewFactory(r13, r1)
        L76:
            com.braze.brazeplugin.BrazePlugin$Companion r12 = com.braze.brazeplugin.BrazePlugin.INSTANCE
            com.braze.brazeplugin.BrazePlugin.Companion.access$reprocessPendingPushEvents(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.brazeplugin.BrazePlugin.onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding):void");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        initPlugin(applicationContext, binaryMessenger);
        this.flutterPluginBinding = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        activePlugins.remove(this);
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, final MethodChannel.Result result) {
        Boolean bool;
        ArrayList arrayList;
        JSONObject key;
        Object obj;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        try {
            String str = call.method;
            if (str != null) {
                Context context = null;
                Context context2 = null;
                Context context3 = null;
                Context context4 = null;
                Context context5 = null;
                Context context6 = null;
                Context context7 = null;
                Context context8 = null;
                Context context9 = null;
                Context context10 = null;
                Context context11 = null;
                Context context12 = null;
                Context context13 = null;
                Context context14 = null;
                Context context15 = null;
                Context context16 = null;
                Context context17 = null;
                Context context18 = null;
                Context context19 = null;
                Context context20 = null;
                Context context21 = null;
                Context context22 = null;
                Context context23 = null;
                Context context24 = null;
                Context context25 = null;
                string = null;
                string = null;
                Object string = null;
                Context context26 = null;
                Context context27 = null;
                Context context28 = null;
                Context context29 = null;
                Context context30 = null;
                Context context31 = null;
                Context context32 = null;
                Context context33 = null;
                Context context34 = null;
                Context context35 = null;
                Context context36 = null;
                Context context37 = null;
                Context context38 = null;
                Context context39 = null;
                Context context40 = null;
                Context context41 = null;
                Context context42 = null;
                Context context43 = null;
                Context context44 = null;
                Context context45 = null;
                Context context46 = null;
                Context context47 = null;
                Context context48 = null;
                Context context49 = null;
                Context context50 = null;
                Context context51 = null;
                Context context52 = null;
                Context context53 = null;
                Context context54 = null;
                Context context55 = null;
                Context context56 = null;
                Context context57 = null;
                Context context58 = null;
                Context context59 = null;
                switch (str.hashCode()) {
                    case -2131879013:
                        if (str.equals("changeUser")) {
                            String str2 = (String) call.argument(Constants.USER_ID);
                            String str3 = (String) call.argument("sdkAuthSignature");
                            if (str3 == null) {
                                Companion companion = INSTANCE;
                                Context context60 = this.context;
                                if (context60 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context59 = context60;
                                }
                                companion.getBrazeInstance(context59).changeUser(str2);
                            } else {
                                Companion companion2 = INSTANCE;
                                Context context61 = this.context;
                                if (context61 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context = context61;
                                }
                                companion2.getBrazeInstance(context).changeUser(str2, str3);
                            }
                            C4015H c4015h = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1981695516:
                        if (str.equals("setGoogleAdvertisingId")) {
                            String str4 = (String) call.argument("id");
                            if (str4 == null || (bool = (Boolean) call.argument("adTrackingEnabled")) == null) {
                                return;
                            }
                            boolean zBooleanValue = bool.booleanValue();
                            Companion companion3 = INSTANCE;
                            Context context62 = this.context;
                            if (context62 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context58 = context62;
                            }
                            companion3.getBrazeInstance(context58).setGoogleAdvertisingId(str4, zBooleanValue);
                            C4015H c4015h2 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1618914254:
                        if (str.equals("disableSDK")) {
                            Braze.Companion companion4 = Braze.INSTANCE;
                            Context context63 = this.context;
                            if (context63 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context57 = context63;
                            }
                            companion4.disableSdk(context57);
                            C4015H c4015h3 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1448662595:
                        if (str.equals("launchContentCards")) {
                            if (this.activity != null) {
                                Intent intent = new Intent(this.activity, (Class<?>) ContentCardsActivity.class);
                                intent.setFlags(872415232);
                                Context context64 = this.context;
                                if (context64 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context56 = context64;
                                }
                                context56.startActivity(intent);
                            }
                            C4015H c4015h4 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1396998068:
                        if (str.equals("setBrazePluginIsReady")) {
                            isBrazePluginIsReady = true;
                            INSTANCE.reprocessPendingPushEvents();
                            C4015H c4015h5 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1315145097:
                        if (str.equals("logBannerClicked")) {
                            String str5 = (String) call.argument("placementId");
                            if (str5 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.F
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$8();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            String str6 = (String) call.argument("buttonId");
                            Companion companion5 = INSTANCE;
                            Context context65 = this.context;
                            if (context65 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context55 = context65;
                            }
                            companion5.getBrazeInstance(context55).logBannerClick(str5, str6);
                            C4015H c4015h6 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1284111084:
                        if (str.equals("setBoolCustomUserAttribute")) {
                            final String str7 = (String) call.argument("key");
                            Boolean bool2 = (Boolean) call.argument("value");
                            final boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                            if (str7 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.q
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$34();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion6 = INSTANCE;
                            Context context66 = this.context;
                            if (context66 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context54 = context66;
                            }
                            runOnUser(companion6.getBrazeInstance(context54), new l() { // from class: S4.r
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$35(str7, zBooleanValue2, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h7 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1263769041:
                        if (str.equals("addAlias")) {
                            final String str8 = (String) call.argument("aliasName");
                            final String str9 = (String) call.argument("aliasLabel");
                            if (str8 != null && str9 != null) {
                                Companion companion7 = INSTANCE;
                                Context context67 = this.context;
                                if (context67 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context53 = context67;
                                }
                                runOnUser(companion7.getBrazeInstance(context53), new l() { // from class: S4.b0
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$11(str8, str9, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h8 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.a0
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$10();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case -1227761272:
                        if (str.equals("setSdkAuthenticationSignature")) {
                            String str10 = (String) call.argument("sdkAuthSignature");
                            if (str10 != null) {
                                Companion companion8 = INSTANCE;
                                Context context68 = this.context;
                                if (context68 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context52 = context68;
                                }
                                companion8.getBrazeInstance(context52).setSdkAuthenticationSignature(str10);
                            }
                            C4015H c4015h9 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1146185036:
                        if (str.equals("removeFromSubscriptionGroup")) {
                            final String str11 = (String) call.argument("groupId");
                            if (str11 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.C
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$44();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion9 = INSTANCE;
                            Context context69 = this.context;
                            if (context69 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context51 = context69;
                            }
                            runOnUser(companion9.getBrazeInstance(context51), new l() { // from class: S4.D
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$45(str11, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h10 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1107875961:
                        if (str.equals("getDeviceId")) {
                            Companion companion10 = INSTANCE;
                            Context context70 = this.context;
                            if (context70 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context50 = context70;
                            }
                            result.success(companion10.getBrazeInstance(context50).getDeviceId());
                            C4015H c4015h11 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1058498415:
                        if (str.equals("wipeData")) {
                            Braze.Companion companion11 = Braze.INSTANCE;
                            Context context71 = this.context;
                            if (context71 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context49 = context71;
                            }
                            companion11.wipeData(context49);
                            C4015H c4015h12 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1056030027:
                        if (str.equals("setSdkAuthenticationDelegate")) {
                            C4015H c4015h13 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -1043223038:
                        if (str.equals("requestContentCardsRefresh")) {
                            Companion companion12 = INSTANCE;
                            Context context72 = this.context;
                            if (context72 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context48 = context72;
                            }
                            companion12.getBrazeInstance(context48).requestContentCardsRefresh();
                            C4015H c4015h14 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -991721531:
                        if (str.equals("logCustomEvent")) {
                            String str12 = (String) call.argument(Constants.EVENT_NAME);
                            BrazeProperties brazePropertiesConvertToBrazeProperties = convertToBrazeProperties((Map) call.argument("properties"));
                            Companion companion13 = INSTANCE;
                            Context context73 = this.context;
                            if (context73 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context47 = context73;
                            }
                            companion13.getBrazeInstance(context47).logCustomEvent(str12, brazePropertiesConvertToBrazeProperties);
                            C4015H c4015h15 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -869195440:
                        if (str.equals("setCustomUserAttributeArrayOfStrings")) {
                            final String str13 = (String) call.argument("key");
                            List list = (List) call.argument("value");
                            final String[] strArr = list != null ? (String[]) list.toArray(new String[0]) : null;
                            if (str13 != null && strArr != null) {
                                Companion companion14 = INSTANCE;
                                Context context74 = this.context;
                                if (context74 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context46 = context74;
                                }
                                runOnUser(companion14.getBrazeInstance(context46), new l() { // from class: S4.k0
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$20(str13, strArr, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h16 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.i0
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$19();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case -811628443:
                        if (str.equals("logPurchase")) {
                            String str14 = (String) call.argument("productId");
                            String str15 = (String) call.argument("currencyCode");
                            Double d10 = (Double) call.argument("price");
                            double dDoubleValue = d10 != null ? d10.doubleValue() : 0.0d;
                            Integer num = (Integer) call.argument(DiscardedEvent.JsonKeys.QUANTITY);
                            int iIntValue = num != null ? num.intValue() : 1;
                            BrazeProperties brazePropertiesConvertToBrazeProperties2 = convertToBrazeProperties((Map) call.argument("properties"));
                            Companion companion15 = INSTANCE;
                            Context context75 = this.context;
                            if (context75 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context45 = context75;
                            }
                            companion15.getBrazeInstance(context45).logPurchase(str14, str15, new BigDecimal(dDoubleValue), iIntValue, brazePropertiesConvertToBrazeProperties2);
                            C4015H c4015h17 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -792744658:
                        if (str.equals("logContentCardImpression")) {
                            String str16 = (String) call.argument("contentCardString");
                            if (str16 != null) {
                                Companion companion16 = INSTANCE;
                                Context context76 = this.context;
                                if (context76 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context44 = context76;
                                }
                                Card cardDeserializeContentCard = companion16.getBrazeInstance(context44).deserializeContentCard(str16);
                                if (cardDeserializeContentCard != null) {
                                    cardDeserializeContentCard.logImpression();
                                }
                            }
                            C4015H c4015h18 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -760422984:
                        if (str.equals("requestImmediateDataFlush")) {
                            Companion companion17 = INSTANCE;
                            Context context77 = this.context;
                            if (context77 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context43 = context77;
                            }
                            companion17.getBrazeInstance(context43).requestImmediateDataFlush();
                            C4015H c4015h19 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -721841540:
                        if (str.equals("setEmailNotificationSubscriptionType")) {
                            String str17 = (String) call.argument("type");
                            final NotificationSubscriptionType subscriptionType = getSubscriptionType(str17 == null ? "" : str17);
                            if (subscriptionType == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.x
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$40();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion18 = INSTANCE;
                            Context context78 = this.context;
                            if (context78 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context42 = context78;
                            }
                            runOnUser(companion18.getBrazeInstance(context42), new l() { // from class: S4.y
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$41(subscriptionType, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h20 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -703008304:
                        if (str.equals("setDateCustomUserAttribute")) {
                            final String str18 = (String) call.argument("key");
                            Integer num2 = (Integer) call.argument("value");
                            final long jIntValue = num2 != null ? num2.intValue() : 0;
                            if (str18 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.j
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$28();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion19 = INSTANCE;
                            Context context79 = this.context;
                            if (context79 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context41 = context79;
                            }
                            runOnUser(companion19.getBrazeInstance(context41), new l() { // from class: S4.k
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$29(str18, jIntValue, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h21 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -670372238:
                        if (str.equals("updateTrackingPropertyAllowList")) {
                            C4015H c4015h22 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -647085086:
                        if (str.equals("setCustomUserAttributeArrayOfObjects")) {
                            final String str19 = (String) call.argument("key");
                            List list2 = (List) call.argument("value");
                            if (list2 != null) {
                                arrayList = new ArrayList(C4207u.v(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new JSONObject((Map) it.next()));
                                }
                            } else {
                                arrayList = null;
                            }
                            final JSONArray jSONArray = new JSONArray((Collection) arrayList);
                            if (str19 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.l0
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$22();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion20 = INSTANCE;
                            Context context80 = this.context;
                            if (context80 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context40 = context80;
                            }
                            runOnUser(companion20.getBrazeInstance(context40), new l() { // from class: S4.m0
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$23(str19, jSONArray, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h23 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -638032980:
                        if (str.equals("refreshFeatureFlags")) {
                            Companion companion21 = INSTANCE;
                            Context context81 = this.context;
                            if (context81 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context39 = context81;
                            }
                            companion21.getBrazeInstance(context39).refreshFeatureFlags();
                            C4015H c4015h24 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -631666761:
                        if (str.equals("enableSDK")) {
                            Braze.Companion companion22 = Braze.INSTANCE;
                            Context context82 = this.context;
                            if (context82 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context38 = context82;
                            }
                            companion22.enableSdk(context38);
                            C4015H c4015h25 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -614455072:
                        if (str.equals("setLastKnownLocation")) {
                            final Double d11 = (Double) call.argument("latitude");
                            final Double d12 = (Double) call.argument("longitude");
                            final Double d13 = (Double) call.argument("accuracy");
                            final Double d14 = (Double) call.argument("altitude");
                            if (d11 != null && d12 != null) {
                                Companion companion23 = INSTANCE;
                                Context context83 = this.context;
                                if (context83 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context37 = context83;
                                }
                                runOnUser(companion23.getBrazeInstance(context37), new l() { // from class: S4.W
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$60(d11, d12, d14, d13, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h26 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.V
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$59();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case -510261241:
                        if (str.equals("setAttributionData")) {
                            String str20 = (String) call.argument("network");
                            String str21 = (String) call.argument("campaign");
                            String str22 = (String) call.argument("adGroup");
                            String str23 = (String) call.argument("creative");
                            if (str20 != null && str21 != null && str22 != null && str23 != null) {
                                final AttributionData attributionData = new AttributionData(str20, str21, str22, str23);
                                Companion companion24 = INSTANCE;
                                Context context84 = this.context;
                                if (context84 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context36 = context84;
                                }
                                runOnUser(companion24.getBrazeInstance(context36), new l() { // from class: S4.U
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$58(attributionData, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h27 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.T
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$57();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case -433325406:
                        if (str.equals("getCachedContentCards")) {
                            Companion companion25 = INSTANCE;
                            Context context85 = this.context;
                            if (context85 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context35 = context85;
                            }
                            List<Card> cachedContentCards = companion25.getBrazeInstance(context35).getCachedContentCards();
                            if (cachedContentCards != null) {
                                ArrayList arrayList2 = new ArrayList(C4207u.v(cachedContentCards, 10));
                                Iterator<T> it2 = cachedContentCards.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((Card) it2.next()).getKey().toString());
                                }
                                result.success(arrayList2);
                            }
                            C4015H c4015h28 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -424143289:
                        if (str.equals("logFeatureFlagImpression")) {
                            String str24 = (String) call.argument("id");
                            if (str24 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.Z
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$63();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion26 = INSTANCE;
                            Context context86 = this.context;
                            if (context86 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context34 = context86;
                            }
                            companion26.getBrazeInstance(context34).logFeatureFlagImpression(str24);
                            C4015H c4015h29 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -363470636:
                        if (str.equals("setCountry")) {
                            final String str25 = (String) call.argument("country");
                            Companion companion27 = INSTANCE;
                            Context context87 = this.context;
                            if (context87 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context33 = context87;
                            }
                            runOnUser(companion27.getBrazeInstance(context33), new l() { // from class: S4.O
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$54(str25, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h30 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case -208022518:
                        if (str.equals("addToCustomAttributeArray")) {
                            final String str26 = (String) call.argument("key");
                            final String str27 = (String) call.argument("value");
                            if (str26 != null && str27 != null) {
                                Companion companion28 = INSTANCE;
                                Context context88 = this.context;
                                if (context88 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context32 = context88;
                                }
                                runOnUser(companion28.getBrazeInstance(context32), new l() { // from class: S4.d0
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$13(str26, str27, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h31 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.c0
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$12();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case -187323801:
                        if (str.equals("setNestedCustomUserAttribute")) {
                            final String str28 = (String) call.argument("key");
                            Map map = (Map) call.argument("value");
                            final JSONObject jSONObject = map != null ? new JSONObject(map) : null;
                            Boolean bool3 = (Boolean) call.argument("merge");
                            final boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                            if (str28 != null && jSONObject != null) {
                                Companion companion29 = INSTANCE;
                                Context context89 = this.context;
                                if (context89 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context31 = context89;
                                }
                                runOnUser(companion29.getBrazeInstance(context31), new l() { // from class: S4.X
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$18(str28, jSONObject, zBooleanValue3, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h32 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.L
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$17();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case 30334285:
                        if (str.equals("setDoubleCustomUserAttribute")) {
                            final String str29 = (String) call.argument("key");
                            Double d15 = (Double) call.argument("value");
                            final double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
                            if (str29 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.g
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$26();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion30 = INSTANCE;
                            Context context90 = this.context;
                            if (context90 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context30 = context90;
                            }
                            runOnUser(companion30.getBrazeInstance(context30), new l() { // from class: S4.i
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$27(str29, dDoubleValue2, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h33 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 96650681:
                        if (str.equals("logBannerImpression")) {
                            String str30 = (String) call.argument("placementId");
                            if (str30 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.S
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$9();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion31 = INSTANCE;
                            Context context91 = this.context;
                            if (context91 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context29 = context91;
                            }
                            companion31.getBrazeInstance(context29).logBannerImpression(str30);
                            return;
                        }
                        break;
                    case 130003172:
                        if (str.equals("logContentCardDismissed")) {
                            String str31 = (String) call.argument("contentCardString");
                            if (str31 != null) {
                                Companion companion32 = INSTANCE;
                                Context context92 = this.context;
                                if (context92 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context28 = context92;
                                }
                                Card cardDeserializeContentCard2 = companion32.getBrazeInstance(context28).deserializeContentCard(str31);
                                if (cardDeserializeContentCard2 != null) {
                                    cardDeserializeContentCard2.setDismissed(true);
                                    C4015H c4015h34 = C4015H.f34254a;
                                }
                            }
                            C4015H c4015h35 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 195984819:
                        if (str.equals("setIntCustomUserAttribute")) {
                            final String str32 = (String) call.argument("key");
                            Integer num3 = (Integer) call.argument("value");
                            final int iIntValue2 = num3 != null ? num3.intValue() : 0;
                            if (str32 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.l
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$30();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion33 = INSTANCE;
                            Context context93 = this.context;
                            if (context93 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context27 = context93;
                            }
                            runOnUser(companion33.getBrazeInstance(context27), new l() { // from class: S4.m
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$31(str32, iIntValue2, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h36 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 231885251:
                        if (str.equals("setGender")) {
                            final Gender gender = Gender.INSTANCE.getGender((String) call.argument("gender"));
                            Companion companion34 = INSTANCE;
                            Context context94 = this.context;
                            if (context94 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context26 = context94;
                            }
                            runOnUser(companion34.getBrazeInstance(context26), new l() { // from class: S4.M
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$52(gender, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h37 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 299672098:
                        if (str.equals("getBanner")) {
                            String str33 = (String) call.argument("placementId");
                            if (str33 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.h
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$6();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion35 = INSTANCE;
                            Context context95 = this.context;
                            if (context95 == null) {
                                AbstractC4862t.p("context");
                                context95 = null;
                            }
                            Banner banner = companion35.getBrazeInstance(context95).getBanner(str33);
                            if (banner != null && (key = banner.getKey()) != null && (obj = key.get("banner")) != null) {
                                string = obj.toString();
                            }
                            result.success(string);
                            C4015H c4015h38 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 365067907:
                        if (str.equals("requestBannersRefresh")) {
                            List<String> list3 = (List) call.argument("placementIds");
                            if (list3 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.t
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$7();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion36 = INSTANCE;
                            Context context96 = this.context;
                            if (context96 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context25 = context96;
                            }
                            companion36.getBrazeInstance(context25).requestBannersRefresh(list3);
                            result.success("`requestBannersRefresh` called.");
                            C4015H c4015h39 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 375730650:
                        if (str.equals("setLanguage")) {
                            final String str34 = (String) call.argument("language");
                            Companion companion37 = INSTANCE;
                            Context context97 = this.context;
                            if (context97 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context24 = context97;
                            }
                            runOnUser(companion37.getBrazeInstance(context24), new l() { // from class: S4.N
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$53(str34, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h40 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 529720515:
                        if (str.equals("setLastName")) {
                            final String str35 = (String) call.argument("lastName");
                            Companion companion38 = INSTANCE;
                            Context context98 = this.context;
                            if (context98 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context23 = context98;
                            }
                            runOnUser(companion38.getBrazeInstance(context23), new l() { // from class: S4.I
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$49(str35, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h41 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 584576454:
                        if (str.equals("logInAppMessageButtonClicked")) {
                            Companion companion39 = INSTANCE;
                            Context context99 = this.context;
                            if (context99 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context22 = context99;
                            }
                            IInAppMessage iInAppMessageDeserializeInAppMessageString = companion39.getBrazeInstance(context22).deserializeInAppMessageString((String) call.argument("inAppMessageString"));
                            if (iInAppMessageDeserializeInAppMessageString instanceof IInAppMessageImmersive) {
                                Integer num4 = (Integer) call.argument("buttonId");
                                int iIntValue3 = num4 != null ? num4.intValue() : 0;
                                Iterator<MessageButton> it3 = ((IInAppMessageImmersive) iInAppMessageDeserializeInAppMessageString).getMessageButtons().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        MessageButton next = it3.next();
                                        if (next.getId() == iIntValue3) {
                                            ((IInAppMessageImmersive) iInAppMessageDeserializeInAppMessageString).logButtonClick(next);
                                        }
                                    }
                                }
                            }
                            C4015H c4015h42 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 650064796:
                        if (str.equals("registerPushToken")) {
                            String str36 = (String) call.argument("pushToken");
                            Companion companion40 = INSTANCE;
                            Context context100 = this.context;
                            if (context100 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context21 = context100;
                            }
                            companion40.getBrazeInstance(context21).setRegisteredPushToken(str36);
                            C4015H c4015h43 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 689992853:
                        if (str.equals("setPhoneNumber")) {
                            final String str37 = (String) call.argument("phoneNumber");
                            Companion companion41 = INSTANCE;
                            Context context101 = this.context;
                            if (context101 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context20 = context101;
                            }
                            runOnUser(companion41.getBrazeInstance(context20), new l() { // from class: S4.Q
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$56(str37, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h44 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 701965116:
                        if (str.equals("getAllFeatureFlags")) {
                            Companion companion42 = INSTANCE;
                            Context context102 = this.context;
                            if (context102 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context19 = context102;
                            }
                            List<com.braze.models.FeatureFlag> allFeatureFlags = companion42.getBrazeInstance(context19).getAllFeatureFlags();
                            ArrayList arrayList3 = new ArrayList(C4207u.v(allFeatureFlags, 10));
                            Iterator<T> it4 = allFeatureFlags.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((com.braze.models.FeatureFlag) it4.next()).getKey().toString());
                            }
                            result.success(arrayList3);
                            C4015H c4015h45 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 716673560:
                        if (str.equals("logInAppMessageClicked")) {
                            Companion companion43 = INSTANCE;
                            Context context103 = this.context;
                            if (context103 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context18 = context103;
                            }
                            IInAppMessage iInAppMessageDeserializeInAppMessageString2 = companion43.getBrazeInstance(context18).deserializeInAppMessageString((String) call.argument("inAppMessageString"));
                            if (iInAppMessageDeserializeInAppMessageString2 != null) {
                                iInAppMessageDeserializeInAppMessageString2.logClick();
                                return;
                            }
                            return;
                        }
                        break;
                    case 859984188:
                        if (str.equals("getUserId")) {
                            Companion companion44 = INSTANCE;
                            Context context104 = this.context;
                            if (context104 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context17 = context104;
                            }
                            runOnUser(companion44.getBrazeInstance(context17), new l() { // from class: S4.p
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$4(result, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h46 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 943484325:
                        if (str.equals("setAdTrackingEnabled")) {
                            Boolean bool4 = (Boolean) call.argument("adTrackingEnabled");
                            if (bool4 != null) {
                                boolean zBooleanValue4 = bool4.booleanValue();
                                String str38 = (String) call.argument("id");
                                if (str38 == null) {
                                    return;
                                }
                                Companion companion45 = INSTANCE;
                                Context context105 = this.context;
                                if (context105 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context16 = context105;
                                }
                                companion45.getBrazeInstance(context16).setGoogleAdvertisingId(str38, zBooleanValue4);
                                C4015H c4015h47 = C4015H.f34254a;
                                return;
                            }
                            return;
                        }
                        break;
                    case 1032158840:
                        if (str.equals("logInAppMessageImpression")) {
                            Companion companion46 = INSTANCE;
                            Context context106 = this.context;
                            if (context106 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context15 = context106;
                            }
                            IInAppMessage iInAppMessageDeserializeInAppMessageString3 = companion46.getBrazeInstance(context15).deserializeInAppMessageString((String) call.argument("inAppMessageString"));
                            if (iInAppMessageDeserializeInAppMessageString3 != null) {
                                iInAppMessageDeserializeInAppMessageString3.logImpression();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1075477796:
                        if (str.equals("requestLocationInitialization")) {
                            Companion companion47 = INSTANCE;
                            Context context107 = this.context;
                            if (context107 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context14 = context107;
                            }
                            companion47.getBrazeInstance(context14).requestLocationInitialization();
                            C4015H c4015h48 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1206161350:
                        if (str.equals("addToSubscriptionGroup")) {
                            final String str39 = (String) call.argument("groupId");
                            if (str39 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.z
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$42();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion48 = INSTANCE;
                            Context context108 = this.context;
                            if (context108 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context13 = context108;
                            }
                            runOnUser(companion48.getBrazeInstance(context13), new l() { // from class: S4.B
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$43(str39, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h49 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1287516916:
                        if (str.equals("setLocationCustomAttribute")) {
                            final String str40 = (String) call.argument("key");
                            Double d16 = (Double) call.argument("lat");
                            final double dDoubleValue3 = d16 != null ? d16.doubleValue() : 0.0d;
                            Double d17 = (Double) call.argument("long");
                            final double dDoubleValue4 = d17 != null ? d17.doubleValue() : 0.0d;
                            if (str40 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.E
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$46();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion49 = INSTANCE;
                            Context context109 = this.context;
                            if (context109 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context12 = context109;
                            }
                            runOnUser(companion49.getBrazeInstance(context12), new l() { // from class: S4.G
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$47(str40, dDoubleValue3, dDoubleValue4, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h50 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1299921207:
                        if (str.equals("unsetCustomUserAttribute")) {
                            final String str41 = (String) call.argument("key");
                            if (str41 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.s
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$36();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion50 = INSTANCE;
                            Context context110 = this.context;
                            if (context110 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context11 = context110;
                            }
                            runOnUser(companion50.getBrazeInstance(context11), new l() { // from class: S4.u
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$37(str41, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h51 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1391332442:
                        if (str.equals("setEmail")) {
                            final String str42 = (String) call.argument("email");
                            Companion companion51 = INSTANCE;
                            Context context111 = this.context;
                            if (context111 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context10 = context111;
                            }
                            runOnUser(companion51.getBrazeInstance(context10), new l() { // from class: S4.K
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$51(str42, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h52 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1415563057:
                        if (str.equals("incrementCustomUserAttribute")) {
                            final String str43 = (String) call.argument("key");
                            Integer num5 = (Integer) call.argument("value");
                            final int iIntValue4 = num5 != null ? num5.intValue() : 0;
                            if (str43 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.n
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$32();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion52 = INSTANCE;
                            Context context112 = this.context;
                            if (context112 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context9 = context112;
                            }
                            runOnUser(companion52.getBrazeInstance(context9), new l() { // from class: S4.o
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$33(str43, iIntValue4, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h53 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1482968510:
                        if (str.equals("setPushNotificationSubscriptionType")) {
                            String str44 = (String) call.argument("type");
                            final NotificationSubscriptionType subscriptionType2 = getSubscriptionType(str44 == null ? "" : str44);
                            if (subscriptionType2 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.v
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$38();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion53 = INSTANCE;
                            Context context113 = this.context;
                            if (context113 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context8 = context113;
                            }
                            runOnUser(companion53.getBrazeInstance(context8), new l() { // from class: S4.w
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$39(subscriptionType2, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h54 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1496090584:
                        if (str.equals("setDateOfBirth")) {
                            Integer num6 = (Integer) call.argument("year");
                            final int iIntValue5 = num6 != null ? num6.intValue() : 0;
                            Integer num7 = (Integer) call.argument("month");
                            final Month month = getMonth(num7 != null ? num7.intValue() : 0);
                            Integer num8 = (Integer) call.argument(MetricsUnit.Duration.DAY);
                            final int iIntValue6 = num8 != null ? num8.intValue() : 0;
                            Companion companion54 = INSTANCE;
                            Context context114 = this.context;
                            if (context114 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context7 = context114;
                            }
                            runOnUser(companion54.getBrazeInstance(context7), new l() { // from class: S4.J
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$50(iIntValue5, month, iIntValue6, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h55 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1502615916:
                        if (str.equals("setHomeCity")) {
                            final String str45 = (String) call.argument("homeCity");
                            Companion companion55 = INSTANCE;
                            Context context115 = this.context;
                            if (context115 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context6 = context115;
                            }
                            runOnUser(companion55.getBrazeInstance(context6), new l() { // from class: S4.P
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$55(str45, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h56 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1541265698:
                        if (str.equals("hideCurrentInAppMessage")) {
                            BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
                            C4015H c4015h57 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1562169122:
                        if (str.equals("logContentCardClicked")) {
                            String str46 = (String) call.argument("contentCardString");
                            if (str46 != null) {
                                Companion companion56 = INSTANCE;
                                Context context116 = this.context;
                                if (context116 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context5 = context116;
                                }
                                Card cardDeserializeContentCard3 = companion56.getBrazeInstance(context5).deserializeContentCard(str46);
                                if (cardDeserializeContentCard3 != null) {
                                    cardDeserializeContentCard3.logClick();
                                }
                            }
                            C4015H c4015h58 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1655804958:
                        if (str.equals("getFeatureFlagByID")) {
                            String str47 = (String) call.argument("id");
                            if (str47 == null) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.Y
                                    @Override // vc.InterfaceC6082a
                                    public final Object invoke() {
                                        return BrazePlugin.onMethodCall$lambda$61();
                                    }
                                }, 6, (Object) null);
                                return;
                            }
                            Companion companion57 = INSTANCE;
                            Context context117 = this.context;
                            if (context117 == null) {
                                AbstractC4862t.p("context");
                                context117 = null;
                            }
                            com.braze.models.FeatureFlag featureFlag = companion57.getBrazeInstance(context117).getFeatureFlag(str47);
                            if (featureFlag == null) {
                                result.success(null);
                            } else {
                                result.success(featureFlag.getKey().toString());
                            }
                            C4015H c4015h59 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1672223513:
                        if (str.equals("setFirstName")) {
                            final String str48 = (String) call.argument("firstName");
                            Companion companion58 = INSTANCE;
                            Context context118 = this.context;
                            if (context118 == null) {
                                AbstractC4862t.p("context");
                            } else {
                                context4 = context118;
                            }
                            runOnUser(companion58.getBrazeInstance(context4), new l() { // from class: S4.H
                                @Override // vc.l
                                public final Object invoke(Object obj2) {
                                    return BrazePlugin.onMethodCall$lambda$48(str48, (BrazeUser) obj2);
                                }
                            });
                            C4015H c4015h60 = C4015H.f34254a;
                            return;
                        }
                        break;
                    case 1681133837:
                        if (str.equals("setStringCustomUserAttribute")) {
                            final String str49 = (String) call.argument("key");
                            final String str50 = (String) call.argument("value");
                            if (str49 != null && str50 != null) {
                                Companion companion59 = INSTANCE;
                                Context context119 = this.context;
                                if (context119 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context3 = context119;
                                }
                                runOnUser(companion59.getBrazeInstance(context3), new l() { // from class: S4.f
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$25(str49, str50, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h61 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.n0
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$24();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                    case 2022160988:
                        if (str.equals("removeFromCustomAttributeArray")) {
                            final String str51 = (String) call.argument("key");
                            final String str52 = (String) call.argument("value");
                            if (str51 != null && str52 != null) {
                                Companion companion60 = INSTANCE;
                                Context context120 = this.context;
                                if (context120 == null) {
                                    AbstractC4862t.p("context");
                                } else {
                                    context2 = context120;
                                }
                                runOnUser(companion60.getBrazeInstance(context2), new l() { // from class: S4.A
                                    @Override // vc.l
                                    public final Object invoke(Object obj2) {
                                        return BrazePlugin.onMethodCall$lambda$15(str51, str52, (BrazeUser) obj2);
                                    }
                                });
                                C4015H c4015h62 = C4015H.f34254a;
                                return;
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: S4.e0
                                @Override // vc.InterfaceC6082a
                                public final Object invoke() {
                                    return BrazePlugin.onMethodCall$lambda$14();
                                }
                            }, 6, (Object) null);
                            return;
                        }
                        break;
                }
            }
            result.notImplemented();
            C4015H c4015h63 = C4015H.f34254a;
        } catch (Exception e10) {
            result.error("Exception encountered", call.method, e10);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) throws JSONException {
        AbstractC4862t.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
