package io.flutter.plugins.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import h8.C4288f;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.sentry.ProfilingTraceData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0002¢\u0006\u0004\b&\u0010\u0010J+\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0011H\u0002¢\u0006\u0004\b'\u0010\u0017J-\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0011H\u0002¢\u0006\u0004\b)\u0010\u0017J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0002¢\u0006\u0004\b*\u0010\u0010J)\u0010-\u001a\u0004\u0018\u00010,2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0011H\u0002¢\u0006\u0004\b-\u0010.J9\u00103\u001a\u00020\n2\u000e\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r2\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0002¢\u0006\u0004\b3\u00104J?\u00106\u001a\u00020\n\"\u0004\b\u0000\u001052\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u001a\u00102\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u000001\u0012\u0004\u0012\u00020\n00H\u0002¢\u0006\u0004\b6\u00104J+\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013090\r2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0016¢\u0006\u0004\b<\u0010\u0010J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010@J?\u0010C\u001a\u00020\n2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bC\u0010DJ3\u0010E\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bE\u0010FJ;\u0010G\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\u00122\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bG\u0010HJ1\u0010I\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bI\u0010JJ)\u0010K\u001a\u00020\n2\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bK\u0010LJ1\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u000e2\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bN\u0010OJ?\u0010Q\u001a\u00020\n2\u0014\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00112\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bQ\u0010DJA\u0010R\u001a\u00020\n2\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00112\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bR\u0010DJ+\u0010S\u001a\u00020\n2\u001a\u00102\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001201\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bS\u0010LJ+\u0010T\u001a\u00020\n2\u001a\u00102\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bT\u0010LJ?\u0010U\u001a\u00020\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0018\u00102\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n01\u0012\u0004\u0012\u00020\n00H\u0016¢\u0006\u0004\bU\u0010DR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\\¨\u0006]"}, d2 = {"Lio/flutter/plugins/firebase/analytics/FlutterFirebaseAnalyticsPlugin;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/firebase/analytics/FirebaseAnalyticsHostApi;", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", "context", "Lfc/H;", "initInstance", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V", "Lcom/google/android/gms/tasks/Task;", "", "handleGetSessionId", "()Lcom/google/android/gms/tasks/Task;", "", "", "", "arguments", "Ljava/lang/Void;", "handleLogEvent", "(Ljava/util/Map;)Lcom/google/android/gms/tasks/Task;", Constants.USER_ID, "handleSetUserId", "(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "", "enabled", "handleSetAnalyticsCollectionEnabled", "(Z)Lcom/google/android/gms/tasks/Task;", Constants.MILLISECONDS, "handleSetSessionTimeoutDuration", "(J)Lcom/google/android/gms/tasks/Task;", "name", "value", "handleSetUserProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "handleResetAnalyticsData", "handleSetConsent", Constants.PARAMETERS, "handleSetDefaultEventParameters", "handleGetAppInstanceId", "map", "Landroid/os/Bundle;", "createBundleFromMap", "(Ljava/util/Map;)Landroid/os/Bundle;", "task", "Lkotlin/Function1;", "Lfc/r;", "callback", "handleVoidTaskResult", "(Lcom/google/android/gms/tasks/Task;Lvc/l;)V", "T", "handleTypedTaskResult", "Lh8/f;", "firebaseApp", "", "getPluginConstantsForFirebaseApp", "(Lh8/f;)Lcom/google/android/gms/tasks/Task;", "didReinitializeFirebaseCore", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "event", "logEvent", "(Ljava/util/Map;Lvc/l;)V", "setUserId", "(Ljava/lang/String;Lvc/l;)V", "setUserProperty", "(Ljava/lang/String;Ljava/lang/String;Lvc/l;)V", "setAnalyticsCollectionEnabled", "(ZLvc/l;)V", "resetAnalyticsData", "(Lvc/l;)V", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, "setSessionTimeoutDuration", "(JLvc/l;)V", "consent", "setConsent", "setDefaultEventParameters", "getAppInstanceId", "getSessionId", "initiateOnDeviceConversionMeasurement", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/BinaryMessenger;", "firebase_analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlutterFirebaseAnalyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, FirebaseAnalyticsHostApi {
    private FirebaseAnalytics analytics;
    private MethodChannel channel;
    private BinaryMessenger messenger;

    private final Bundle createBundleFromMap(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(key, null);
            } else if (value instanceof Iterable) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        arrayList.add(createBundleFromMap((Map) obj));
                    } else if (obj != null) {
                        throw new IllegalArgumentException("Unsupported value type: " + obj.getClass().getCanonicalName() + " in list at key " + key);
                    }
                }
                bundle.putParcelableArrayList(key, arrayList);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("Unsupported value type: " + value.getClass().getCanonicalName());
                }
                bundle.putParcelable(key, createBundleFromMap((Map) value));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void didReinitializeFirebaseCore$lambda$1(C2878l c2878l) {
        try {
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAppInstanceId$lambda$20(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleTypedTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPluginConstantsForFirebaseApp$lambda$0(C2878l c2878l) {
        try {
            c2878l.c(new HashMap());
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSessionId$lambda$21(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleTypedTaskResult(task, lVar);
    }

    private final Task<String> handleGetAppInstanceId() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.D
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleGetAppInstanceId$lambda$11(c2878l, this);
            }
        });
        Task<String> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetAppInstanceId$lambda$11(C2878l c2878l, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            c2878l.c(Tasks.await(firebaseAnalytics.a()));
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Long> handleGetSessionId() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.L
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleGetSessionId$lambda$2(c2878l, this);
            }
        });
        Task<Long> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSessionId$lambda$2(C2878l c2878l, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            c2878l.c(Tasks.await(firebaseAnalytics.b()));
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleLogEvent(final Map<String, ? extends Object> arguments) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.A
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleLogEvent$lambda$3(arguments, this, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleLogEvent$lambda$3(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, C2878l c2878l) {
        try {
            Object obj = map.get(Constants.EVENT_NAME);
            Objects.requireNonNull(obj);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle bundleCreateBundleFromMap = flutterFirebaseAnalyticsPlugin.createBundleFromMap((Map) map.get(Constants.PARAMETERS));
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.c(str, bundleCreateBundleFromMap);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleResetAnalyticsData() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.G
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleResetAnalyticsData$lambda$8(this.f37632a, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResetAnalyticsData$lambda$8(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, C2878l c2878l) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.d();
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleSetAnalyticsCollectionEnabled(final boolean enabled) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.I
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetAnalyticsCollectionEnabled$lambda$5(this.f37636a, enabled, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetAnalyticsCollectionEnabled$lambda$5(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, boolean z10, C2878l c2878l) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.e(z10);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleSetConsent(final Map<String, Boolean> arguments) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.S
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetConsent$lambda$9(arguments, this, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetConsent$lambda$9(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, C2878l c2878l) {
        try {
            Boolean bool = (Boolean) map.get(Constants.AD_STORAGE_CONSENT_GRANTED);
            Boolean bool2 = (Boolean) map.get(Constants.ANALYTICS_STORAGE_CONSENT_GRANTED);
            Boolean bool3 = (Boolean) map.get(Constants.AD_PERSONALIZATION_SIGNALS_CONSENT_GRANTED);
            Boolean bool4 = (Boolean) map.get(Constants.AD_USER_DATA_CONSENT_GRANTED);
            HashMap map2 = new HashMap();
            if (bool != null) {
                map2.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool2 != null) {
                map2.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool3 != null) {
                map2.put(FirebaseAnalytics.b.AD_PERSONALIZATION, bool3.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            if (bool4 != null) {
                map2.put(FirebaseAnalytics.b.AD_USER_DATA, bool4.booleanValue() ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            }
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.f(map2);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleSetDefaultEventParameters(final Map<String, ? extends Object> parameters) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.Q
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetDefaultEventParameters$lambda$10(this.f37656a, parameters, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetDefaultEventParameters$lambda$10(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, C2878l c2878l) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.g(flutterFirebaseAnalyticsPlugin.createBundleFromMap(map));
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleSetSessionTimeoutDuration(final long milliseconds) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.F
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetSessionTimeoutDuration$lambda$6(this.f37629a, milliseconds, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetSessionTimeoutDuration$lambda$6(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, long j10, C2878l c2878l) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.h(j10);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleSetUserId(final String userId) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.P
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetUserId$lambda$4(this.f37653a, userId, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetUserId$lambda$4(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, String str, C2878l c2878l) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.i(str);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final Task<Void> handleSetUserProperty(final String name, final String value) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.K
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.handleSetUserProperty$lambda$7(this.f37641a, name, value, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSetUserProperty$lambda$7(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, String str, String str2, C2878l c2878l) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                AbstractC4862t.p("analytics");
                firebaseAnalytics = null;
            }
            firebaseAnalytics.j(str, str2);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final <T> void handleTypedTaskResult(Task<T> task, vc.l callback) {
        String message;
        if (task.q()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(task.m())));
            return;
        }
        Exception excL = task.l();
        if (excL == null || (message = excL.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        C4035r.a aVar2 = C4035r.f34274b;
        callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new FlutterError("firebase_analytics", message, null)))));
    }

    private final void handleVoidTaskResult(Task<Void> task, vc.l callback) {
        String message;
        if (task.q()) {
            C4035r.a aVar = C4035r.f34274b;
            callback.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
            return;
        }
        Exception excL = task.l();
        if (excL == null || (message = excL.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        C4035r.a aVar2 = C4035r.f34274b;
        callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new FlutterError("firebase_analytics", message, null)))));
    }

    private final void initInstance(BinaryMessenger messenger, Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        AbstractC4862t.d(firebaseAnalytics, "getInstance(...)");
        this.analytics = firebaseAnalytics;
        this.channel = new MethodChannel(messenger, "plugins.flutter.io/firebase_analytics");
        FirebaseAnalyticsHostApi.Companion.setUp$default(FirebaseAnalyticsHostApi.INSTANCE, messenger, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.messenger = messenger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logEvent$lambda$12(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetAnalyticsData$lambda$16(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAnalyticsCollectionEnabled$lambda$15(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConsent$lambda$18(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefaultEventParameters$lambda$19(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSessionTimeoutDuration$lambda$17(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserId$lambda$13(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUserProperty$lambda$14(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, vc.l lVar, Task task) {
        AbstractC4862t.e(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, lVar);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.E
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.didReinitializeFirebaseCore$lambda$1(c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void getAppInstanceId(final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleGetAppInstanceId().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.O
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.getAppInstanceId$lambda$20(this.f37651a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C4288f firebaseApp) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.analytics.C
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseAnalyticsPlugin.getPluginConstantsForFirebaseApp$lambda$0(c2878l);
            }
        });
        Task<Map<String, Object>> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void getSessionId(final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleGetSessionId().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.x
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.getSessionId$lambda$21(this.f37686a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void initiateOnDeviceConversionMeasurement(Map<String, String> arguments, vc.l callback) {
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(callback, "callback");
        C4035r.a aVar = C4035r.f34274b;
        callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new FlutterError("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS.", null)))));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void logEvent(Map<String, ? extends Object> event, final vc.l callback) {
        AbstractC4862t.e(event, "event");
        AbstractC4862t.e(callback, "callback");
        handleLogEvent(event).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.B
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.logEvent$lambda$12(this.f37623a, callback, task);
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        initInstance(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FirebaseAnalyticsHostApi.Companion companion = FirebaseAnalyticsHostApi.INSTANCE;
        AbstractC4862t.b(binaryMessenger);
        FirebaseAnalyticsHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.channel = null;
        this.messenger = null;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void resetAnalyticsData(final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleResetAnalyticsData().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.z
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.resetAnalyticsData$lambda$16(this.f37690a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setAnalyticsCollectionEnabled(boolean enabled, final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleSetAnalyticsCollectionEnabled(enabled).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.J
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.setAnalyticsCollectionEnabled$lambda$15(this.f37639a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setConsent(Map<String, Boolean> consent, final vc.l callback) {
        AbstractC4862t.e(consent, "consent");
        AbstractC4862t.e(callback, "callback");
        handleSetConsent(consent).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.T
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.setConsent$lambda$18(this.f37662a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setDefaultEventParameters(Map<String, ? extends Object> parameters, final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleSetDefaultEventParameters(parameters).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.y
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.setDefaultEventParameters$lambda$19(this.f37688a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setSessionTimeoutDuration(long timeout, final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleSetSessionTimeoutDuration(timeout).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.N
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.setSessionTimeoutDuration$lambda$17(this.f37649a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setUserId(String userId, final vc.l callback) {
        AbstractC4862t.e(callback, "callback");
        handleSetUserId(userId).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.M
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.setUserId$lambda$13(this.f37647a, callback, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setUserProperty(String name, String value, final vc.l callback) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(callback, "callback");
        handleSetUserProperty(name, value).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.analytics.H
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseAnalyticsPlugin.setUserProperty$lambda$14(this.f37634a, callback, task);
            }
        });
    }
}
