package io.sentry.flutter;

import Od.C1823c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import fc.AbstractC4040w;
import gc.C4207u;
import gc.Q;
import gc.y;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.DateUtils;
import io.sentry.Integration;
import io.sentry.ScopesAdapter;
import io.sentry.SentryDate;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.core.InternalSentrySdk;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.replay.Recorder;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.flutter.SentryFlutterPlugin;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.FeatureFlag;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/sentry/flutter/SentryFlutterPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "Lfc/H;", "closeNativeSdk", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Companion", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SentryFlutterPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long NATIVE_CRASH_WAIT_TIME = 500;

    @SuppressLint({"StaticFieldLeak"})
    private static WeakReference<Activity> activity;

    @SuppressLint({"StaticFieldLeak"})
    private static Context applicationContext;
    private static Long pluginRegistrationTime;

    @SuppressLint({"StaticFieldLeak"})
    private static ReplayIntegration replay;
    private MethodChannel channel;
    private Context context;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u000f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0018\u00010\f*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0003J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010\u0003J\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b)\u0010%J\u001f\u0010,\u001a\u0004\u0018\u00010#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070*H\u0007¢\u0006\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lio/sentry/flutter/SentryFlutterPlugin$Companion;", "", "<init>", "()V", "Lio/sentry/android/core/performance/TimeSpan;", "span", "", "", "map", "Lfc/H;", "addTimeSpanToMap", "(Lio/sentry/android/core/performance/TimeSpan;Ljava/util/Map;)V", "", "Lio/sentry/protocol/DebugImage;", "", "serialize", "(Ljava/util/List;)Ljava/util/List;", "(Lio/sentry/protocol/DebugImage;)Ljava/util/Map;", "", "adjustReplaySizeToBlockSize", "(D)D", "tearDownReplayIntegration", "Lio/sentry/android/replay/ReplayIntegration;", "privateSentryGetReplayIntegration", "()Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/android/core/SentryAndroidOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/flutter/ReplayRecorderCallbacks;", "replayCallbacks", "setupReplay", "(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/flutter/ReplayRecorderCallbacks;)V", "crash", "", "getDisplayRefreshRate", "()Ljava/lang/Integer;", "", "fetchNativeAppStartAsBytes", "()[B", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "loadContextsAsBytes", "", "addresses", "loadDebugImagesAsBytes", "(Ljava/util/Set;)[B", "replay", "Lio/sentry/android/replay/ReplayIntegration;", "applicationContext", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Ljava/lang/ref/WeakReference;", "", "pluginRegistrationTime", "Ljava/lang/Long;", "NATIVE_CRASH_WAIT_TIME", "J", "sentry_flutter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private final void addTimeSpanToMap(TimeSpan span, Map<String, Object> map) {
            String description;
            if (span.getStartTimestamp() == null || (description = span.getDescription()) == null) {
                return;
            }
            map.put(description, Q.l(AbstractC4040w.a("startTimestampMsSinceEpoch", Long.valueOf(span.getStartTimestampMs())), AbstractC4040w.a("stopTimestampMsSinceEpoch", Long.valueOf(span.getProjectedStopTimestampMs()))));
        }

        private final double adjustReplaySizeToBlockSize(double d10) {
            double d11 = 16;
            double d12 = d10 % d11;
            return d12 <= 8.0d ? d10 - d12 : d10 + (d11 - d12);
        }

        private final Map<String, Object> serialize(DebugImage debugImage) {
            return Q.l(AbstractC4040w.a("image_addr", debugImage.getImageAddr()), AbstractC4040w.a(DebugImage.JsonKeys.IMAGE_SIZE, debugImage.getImageSize()), AbstractC4040w.a(DebugImage.JsonKeys.CODE_FILE, debugImage.getCodeFile()), AbstractC4040w.a("type", debugImage.getType()), AbstractC4040w.a(DebugImage.JsonKeys.DEBUG_ID, debugImage.getDebugId()), AbstractC4040w.a(DebugImage.JsonKeys.CODE_ID, debugImage.getCodeId()), AbstractC4040w.a(DebugImage.JsonKeys.DEBUG_FILE, debugImage.getDebugFile()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean setupReplay$lambda$0(Integration integration) {
            return integration instanceof ReplayIntegration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recorder setupReplay$lambda$1(SafeReplayRecorderCallbacks safeReplayRecorderCallbacks) {
            ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
            AbstractC4862t.b(replayIntegration);
            return new SentryFlutterReplayRecorder(safeReplayRecorderCallbacks, replayIntegration);
        }

        public final void crash() throws InterruptedException {
            RuntimeException runtimeException = new RuntimeException("FlutterSentry Native Integration: Sample RuntimeException");
            Thread thread = Looper.getMainLooper().getThread();
            AbstractC4862t.d(thread, "getThread(...)");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, runtimeException);
            }
            thread.join(SentryFlutterPlugin.NATIVE_CRASH_WAIT_TIME);
        }

        public final byte[] fetchNativeAppStartAsBytes() {
            AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
            AbstractC4862t.d(appStartMetrics, "getInstance(...)");
            if (!appStartMetrics.isAppLaunchedInForeground() || appStartMetrics.getAppStartTimeSpan().getDurationMs() > 60000) {
                Log.w("Sentry", "Invalid app start data: app not launched in foreground or app start took too long (>60s)");
                return null;
            }
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            AbstractC4862t.d(appStartTimeSpan, "getAppStartTimeSpan(...)");
            SentryDate startTimestamp = appStartTimeSpan.getStartTimestamp();
            boolean z10 = appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD;
            if (startTimestamp == null) {
                Log.w("Sentry", "App start won't be sent due to missing appStartTime");
                return null;
            }
            Map mapM = Q.m(AbstractC4040w.a("pluginRegistrationTime", SentryFlutterPlugin.pluginRegistrationTime), AbstractC4040w.a("appStartTime", Double.valueOf(DateUtils.nanosToMillis(startTimestamp.nanoTimestamp()))), AbstractC4040w.a("isColdStart", Boolean.valueOf(z10)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TimeSpan timeSpan = new TimeSpan();
            timeSpan.setDescription("Process Initialization");
            timeSpan.setStartUnixTimeMs(appStartTimeSpan.getStartTimestampMs());
            timeSpan.setStartedAt(appStartTimeSpan.getStartUptimeMs());
            timeSpan.setStoppedAt(appStartMetrics.getClassLoadedUptimeMs());
            addTimeSpanToMap(timeSpan, linkedHashMap);
            TimeSpan applicationOnCreateTimeSpan = appStartMetrics.getApplicationOnCreateTimeSpan();
            AbstractC4862t.d(applicationOnCreateTimeSpan, "getApplicationOnCreateTimeSpan(...)");
            addTimeSpanToMap(applicationOnCreateTimeSpan, linkedHashMap);
            List<TimeSpan> contentProviderOnCreateTimeSpans = appStartMetrics.getContentProviderOnCreateTimeSpans();
            AbstractC4862t.d(contentProviderOnCreateTimeSpans, "getContentProviderOnCreateTimeSpans(...)");
            for (TimeSpan timeSpan2 : contentProviderOnCreateTimeSpans) {
                Companion companion = SentryFlutterPlugin.INSTANCE;
                AbstractC4862t.b(timeSpan2);
                companion.addTimeSpanToMap(timeSpan2, linkedHashMap);
            }
            List<ActivityLifecycleTimeSpan> activityLifecycleTimeSpans = appStartMetrics.getActivityLifecycleTimeSpans();
            AbstractC4862t.d(activityLifecycleTimeSpans, "getActivityLifecycleTimeSpans(...)");
            for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : activityLifecycleTimeSpans) {
                Companion companion2 = SentryFlutterPlugin.INSTANCE;
                TimeSpan onCreate = activityLifecycleTimeSpan.getOnCreate();
                AbstractC4862t.d(onCreate, "getOnCreate(...)");
                companion2.addTimeSpanToMap(onCreate, linkedHashMap);
                TimeSpan onStart = activityLifecycleTimeSpan.getOnStart();
                AbstractC4862t.d(onStart, "getOnStart(...)");
                companion2.addTimeSpanToMap(onStart, linkedHashMap);
            }
            mapM.put("nativeSpanTimes", linkedHashMap);
            String string = new JSONObject(mapM).toString();
            AbstractC4862t.d(string, "toString(...)");
            byte[] bytes = string.getBytes(C1823c.f12394b);
            AbstractC4862t.d(bytes, "getBytes(...)");
            return bytes;
        }

        public final Context getApplicationContext() {
            return SentryFlutterPlugin.applicationContext;
        }

        public final Integer getDisplayRefreshRate() {
            Activity activity;
            WeakReference weakReference = SentryFlutterPlugin.activity;
            Display display = (weakReference == null || (activity = (Activity) weakReference.get()) == null) ? null : activity.getDisplay();
            if (display != null) {
                return Integer.valueOf((int) display.getRefreshRate());
            }
            return null;
        }

        public final byte[] loadContextsAsBytes() {
            SentryOptions options = ScopesAdapter.getInstance().getOptions();
            AbstractC4862t.d(options, "getOptions(...)");
            Context applicationContext = getApplicationContext();
            if ((options instanceof SentryAndroidOptions) && applicationContext != null) {
                Map<String, Object> mapSerializeScope = InternalSentrySdk.serializeScope(applicationContext, (SentryAndroidOptions) options, InternalSentrySdk.getCurrentScope());
                AbstractC4862t.d(mapSerializeScope, "serializeScope(...)");
                try {
                    String string = new JSONObject(mapSerializeScope).toString();
                    AbstractC4862t.d(string, "toString(...)");
                    byte[] bytes = string.getBytes(C1823c.f12394b);
                    AbstractC4862t.d(bytes, "getBytes(...)");
                    return bytes;
                } catch (Exception e10) {
                    Log.e("Sentry", "Failed to serialize scope", e10);
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] loadDebugImagesAsBytes(java.util.Set<java.lang.String> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "addresses"
                kotlin.jvm.internal.AbstractC4862t.e(r4, r0)
                io.sentry.ScopesAdapter r0 = io.sentry.ScopesAdapter.getInstance()
                io.sentry.SentryOptions r0 = r0.getOptions()
                java.lang.String r1 = "null cannot be cast to non-null type io.sentry.android.core.SentryAndroidOptions"
                kotlin.jvm.internal.AbstractC4862t.c(r0, r1)
                io.sentry.android.core.SentryAndroidOptions r0 = (io.sentry.android.core.SentryAndroidOptions) r0
                boolean r1 = r4.isEmpty()
                r2 = 0
                if (r1 == 0) goto L30
                io.sentry.android.core.IDebugImagesLoader r4 = r0.getDebugImagesLoader()
                java.util.List r4 = r4.loadDebugImages()
                if (r4 == 0) goto L2a
                java.util.List r4 = gc.C4179C.V0(r4)
                goto L2b
            L2a:
                r4 = r2
            L2b:
                java.util.List r3 = r3.serialize(r4)
                goto L54
            L30:
                io.sentry.android.core.IDebugImagesLoader r1 = r0.getDebugImagesLoader()
                java.util.Set r4 = r1.loadDebugImagesForAddresses(r4)
                if (r4 == 0) goto L4f
                boolean r1 = r4.isEmpty()
                if (r1 == 0) goto L48
                io.sentry.android.core.IDebugImagesLoader r4 = r0.getDebugImagesLoader()
                java.util.List r4 = r4.loadDebugImages()
            L48:
                if (r4 == 0) goto L4f
                java.util.List r4 = gc.C4179C.V0(r4)
                goto L50
            L4f:
                r4 = r2
            L50:
                java.util.List r3 = r3.serialize(r4)
            L54:
                org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L6e
                r4.<init>(r3)     // Catch: java.lang.Exception -> L6e
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L6e
                java.lang.String r4 = "toString(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r3, r4)     // Catch: java.lang.Exception -> L6e
                java.nio.charset.Charset r4 = Od.C1823c.f12394b     // Catch: java.lang.Exception -> L6e
                byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Exception -> L6e
                java.lang.String r4 = "getBytes(...)"
                kotlin.jvm.internal.AbstractC4862t.d(r3, r4)     // Catch: java.lang.Exception -> L6e
                return r3
            L6e:
                r3 = move-exception
                java.lang.String r4 = "Sentry"
                java.lang.String r0 = "Failed to serialize debug images"
                android.util.Log.e(r4, r0, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.flutter.SentryFlutterPlugin.Companion.loadDebugImagesAsBytes(java.util.Set):byte[]");
        }

        public final ReplayIntegration privateSentryGetReplayIntegration() {
            return SentryFlutterPlugin.replay;
        }

        public final void setupReplay(SentryAndroidOptions options, ReplayRecorderCallbacks replayCallbacks) {
            AbstractC4862t.e(options, "options");
            tearDownReplayIntegration();
            List<Integration> integrations = options.getIntegrations();
            AbstractC4862t.d(integrations, "getIntegrations(...)");
            y.I(integrations, new l() { // from class: io.sentry.flutter.a
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SentryFlutterPlugin.Companion.setupReplay$lambda$0((Integration) obj));
                }
            });
            SentryReplayOptions sessionReplay = options.getSessionReplay();
            AbstractC4862t.d(sessionReplay, "getSessionReplay(...)");
            if ((!sessionReplay.isSessionReplayEnabled() && !sessionReplay.isSessionReplayForErrorsEnabled()) || replayCallbacks == null) {
                options.setReplayController(null);
                return;
            }
            Context context = SentryFlutterPlugin.applicationContext;
            if (context == null) {
                Log.w("Sentry", "setupReplay called before applicationContext initialized");
                return;
            }
            final SafeReplayRecorderCallbacks safeReplayRecorderCallbacks = new SafeReplayRecorderCallbacks(replayCallbacks);
            Context applicationContext = context.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            ICurrentDateProvider currentDateProvider = CurrentDateProvider.getInstance();
            AbstractC4862t.d(currentDateProvider, "getInstance(...)");
            SentryFlutterPlugin.replay = new ReplayIntegration(applicationContext, currentDateProvider, new InterfaceC6082a() { // from class: io.sentry.flutter.b
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return SentryFlutterPlugin.Companion.setupReplay$lambda$1(safeReplayRecorderCallbacks);
                }
            }, null);
            ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
            AbstractC4862t.b(replayIntegration);
            replayIntegration.setBreadcrumbConverter(new SentryFlutterReplayBreadcrumbConverter());
            ReplayIntegration replayIntegration2 = SentryFlutterPlugin.replay;
            AbstractC4862t.b(replayIntegration2);
            options.addIntegration(replayIntegration2);
            options.setReplayController(SentryFlutterPlugin.replay);
        }

        public final void tearDownReplayIntegration() {
            SafeReplayRecorderCallbacks.INSTANCE.bumpGeneration();
            try {
                ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
                if (replayIntegration != null) {
                    replayIntegration.close();
                }
            } catch (Exception e10) {
                Log.w("Sentry", "Failed to close existing ReplayIntegration", e10);
            } finally {
                SentryFlutterPlugin.replay = null;
            }
        }

        private Companion() {
        }

        private final List<Map<String, Object>> serialize(List<DebugImage> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SentryFlutterPlugin.INSTANCE.serialize((DebugImage) it.next()));
            }
            return arrayList;
        }
    }

    private final void closeNativeSdk(MethodChannel.Result result) {
        ScopesAdapter.getInstance().close();
        result.success("");
    }

    public static final void crash() throws InterruptedException {
        INSTANCE.crash();
    }

    public static final byte[] fetchNativeAppStartAsBytes() {
        return INSTANCE.fetchNativeAppStartAsBytes();
    }

    public static final Context getApplicationContext() {
        return INSTANCE.getApplicationContext();
    }

    public static final Integer getDisplayRefreshRate() {
        return INSTANCE.getDisplayRefreshRate();
    }

    public static final byte[] loadContextsAsBytes() {
        return INSTANCE.loadContextsAsBytes();
    }

    public static final byte[] loadDebugImagesAsBytes(Set<String> set) {
        return INSTANCE.loadDebugImagesAsBytes(set);
    }

    public static final ReplayIntegration privateSentryGetReplayIntegration() {
        return INSTANCE.privateSentryGetReplayIntegration();
    }

    public static final void setupReplay(SentryAndroidOptions sentryAndroidOptions, ReplayRecorderCallbacks replayRecorderCallbacks) {
        INSTANCE.setupReplay(sentryAndroidOptions, replayRecorderCallbacks);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        activity = new WeakReference<>(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        pluginRegistrationTime = Long.valueOf(System.currentTimeMillis());
        Context applicationContext2 = flutterPluginBinding.getApplicationContext();
        AbstractC4862t.d(applicationContext2, "getApplicationContext(...)");
        this.context = applicationContext2;
        if (applicationContext2 == null) {
            AbstractC4862t.p("context");
            applicationContext2 = null;
        }
        applicationContext = applicationContext2;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "sentry_flutter");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        if (this.channel == null) {
            return;
        }
        INSTANCE.tearDownReplayIntegration();
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        applicationContext = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        if (AbstractC4862t.a(call.method, "closeNativeSdk")) {
            closeNativeSdk(result);
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }
}
