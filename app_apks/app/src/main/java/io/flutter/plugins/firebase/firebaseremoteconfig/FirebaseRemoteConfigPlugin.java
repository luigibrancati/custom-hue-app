package io.flutter.plugins.firebase.firebaseremoteconfig;

import Od.F;
import android.os.Handler;
import android.os.Looper;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import h8.C4288f;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import k9.AbstractC4814b;
import k9.e;
import k9.u;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001`B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001c0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0006J?\u00101\u001a\u00020\u0010\"\u0004\b\u0000\u0010*2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0012\u0004\u0012\u00020\u00100+2\u000e\u00100\u001a\n\u0018\u00010.j\u0004\u0018\u0001`/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bC\u0010DJ1\u0010E\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bE\u0010FJ1\u0010H\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bH\u0010FJ1\u0010I\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bI\u0010FJ9\u0010L\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010K\u001a\u00020J2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bL\u0010MJG\u0010O\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0014\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bO\u0010PJ1\u0010Q\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bQ\u0010FJG\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\b\u001a\u0010PJ?\u0010S\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2&\u0010-\u001a\"\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t0,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bS\u0010FJ=\u0010T\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2$\u0010-\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0,\u0012\u0004\u0012\u00020\u00100+H\u0016¢\u0006\u0004\bT\u0010FR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010_¨\u0006a"}, d2 = {"Lio/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigPlugin;", "Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lio/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigHostApi;", "<init>", "()V", "Lk9/o;", "remoteConfig", "", "", "", "getConfigProperties", "(Lk9/o;)Ljava/util/Map;", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Lfc/H;", "setupChannel", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "tearDownChannel", "appName", "getRemoteConfig", "(Ljava/lang/String;)Lk9/o;", "customSignalsArguments", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "setCustomSignals", "(Lk9/o;Ljava/util/Map;)Lcom/google/android/gms/tasks/Task;", "Lk9/v;", Constants.PARAMETERS, "parseParameters", "(Ljava/util/Map;)Ljava/util/Map;", "remoteConfigValue", "createRemoteConfigValueMap", "(Lk9/v;)Ljava/util/Map;", "", "status", "mapLastFetchStatus", "(I)Ljava/lang/String;", "source", "mapValueSource", "removeEventListeners", "T", "Lkotlin/Function1;", "Lfc/r;", "callback", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "handleFailure", "(Lvc/l;Ljava/lang/Exception;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lh8/f;", "firebaseApp", "getPluginConstantsForFirebaseApp", "(Lh8/f;)Lcom/google/android/gms/tasks/Task;", "didReinitializeFirebaseCore", "()Lcom/google/android/gms/tasks/Task;", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "fetch", "(Ljava/lang/String;Lvc/l;)V", "", "fetchAndActivate", "activate", "Lio/flutter/plugins/firebase/firebaseremoteconfig/RemoteConfigPigeonSettings;", "settings", "setConfigSettings", "(Ljava/lang/String;Lio/flutter/plugins/firebase/firebaseremoteconfig/RemoteConfigPigeonSettings;Lvc/l;)V", "defaultParameters", "setDefaults", "(Ljava/lang/String;Ljava/util/Map;Lvc/l;)V", "ensureInitialized", "customSignals", "getAll", "getProperties", "", "Lk9/d;", "listenersMap", "Ljava/util/Map;", "Lio/flutter/plugin/common/EventChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "Lio/flutter/plugin/common/BinaryMessenger;", "Companion", "firebase_remote_config_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FirebaseRemoteConfigPlugin implements FlutterFirebasePlugin, FlutterPlugin, EventChannel.StreamHandler, FirebaseRemoteConfigHostApi {
    public static final String EVENT_CHANNEL = "plugins.flutter.io/firebase_remote_config_updated";
    public static final String METHOD_CHANNEL = "plugins.flutter.io/firebase_remote_config";
    public static final String TAG = "FRCPlugin";
    private EventChannel eventChannel;
    private final Map<String, k9.d> listenersMap = new HashMap();
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private BinaryMessenger messenger;

    /* JADX INFO: renamed from: io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin$onListen$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"io/flutter/plugins/firebase/firebaseremoteconfig/FirebaseRemoteConfigPlugin$onListen$1", "Lk9/c;", "Lk9/b;", "configUpdate", "Lfc/H;", "onUpdate", "(Lk9/b;)V", "Lk9/q;", "error", "onError", "(Lk9/q;)V", "firebase_remote_config_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 implements k9.c {
        final /* synthetic */ EventChannel.EventSink $events;

        public AnonymousClass1(EventChannel.EventSink eventSink) {
            this.$events = eventSink;
        }

        @Override // k9.c
        public void onError(k9.q error) {
            AbstractC4862t.e(error, "error");
            this.$events.error("firebase_remote_config", error.getMessage(), null);
        }

        @Override // k9.c
        public void onUpdate(AbstractC4814b configUpdate) {
            AbstractC4862t.e(configUpdate, "configUpdate");
            final ArrayList arrayList = new ArrayList(configUpdate.b());
            Handler handler = FirebaseRemoteConfigPlugin.this.mainThreadHandler;
            final EventChannel.EventSink eventSink = this.$events;
            handler.post(new Runnable() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.D
                @Override // java.lang.Runnable
                public final void run() {
                    eventSink.success(arrayList);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activate$lambda$5(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(task.m())));
        }
    }

    private final Map<String, Object> createRemoteConfigValueMap(k9.v remoteConfigValue) {
        HashMap map = new HashMap();
        map.put("value", remoteConfigValue.a());
        map.put("source", mapValueSource(remoteConfigValue.j()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void didReinitializeFirebaseCore$lambda$1(FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, C2878l c2878l) {
        try {
            firebaseRemoteConfigPlugin.removeEventListeners();
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureInitialized$lambda$8(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetch$lambda$3(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchAndActivate$lambda$4(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(task.m())));
        }
    }

    private final Map<String, Object> getConfigProperties(k9.o remoteConfig) {
        HashMap map = new HashMap();
        map.put("fetchTimeout", Long.valueOf(remoteConfig.o().b().a()));
        map.put("minimumFetchInterval", Long.valueOf(remoteConfig.o().b().b()));
        map.put("lastFetchTime", Long.valueOf(remoteConfig.o().a()));
        map.put("lastFetchStatus", mapLastFetchStatus(remoteConfig.o().c()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPluginConstantsForFirebaseApp$lambda$0(C4288f c4288f, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, C2878l c2878l) {
        try {
            k9.o oVarP = k9.o.p(c4288f);
            AbstractC4862t.d(oVarP, "getInstance(...)");
            HashMap map = new HashMap(firebaseRemoteConfigPlugin.getConfigProperties(oVarP));
            Map mapN = oVarP.n();
            AbstractC4862t.d(mapN, "getAll(...)");
            map.put(Constants.PARAMETERS, firebaseRemoteConfigPlugin.parseParameters(mapN));
            c2878l.c(map);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private final k9.o getRemoteConfig(String appName) {
        C4288f c4288fP = C4288f.p(appName);
        AbstractC4862t.d(c4288fP, "getInstance(...)");
        k9.o oVarP = k9.o.p(c4288fP);
        AbstractC4862t.d(oVarP, "getInstance(...)");
        return oVarP;
    }

    private final <T> void handleFailure(vc.l callback, Exception exception) {
        String message;
        HashMap map = new HashMap();
        if (exception instanceof k9.r) {
            map.put("code", "throttled");
            map.put("message", "frequency of requests exceeds throttled limits");
        } else if (exception instanceof k9.p) {
            map.put("code", "internal");
            map.put("message", "internal remote config fetch error");
        } else if (exception instanceof k9.t) {
            map.put("code", "remote-config-server-error");
            k9.t tVar = (k9.t) exception;
            map.put("message", tVar.getMessage());
            Throwable cause = tVar.getCause();
            if (cause != null && (message = cause.getMessage()) != null && F.V(message, "Forbidden", false, 2, null)) {
                map.put("code", "forbidden");
            }
        } else {
            map.put("code", "unknown");
            map.put("message", "unknown remote config error");
        }
        C4035r.a aVar = C4035r.f34274b;
        callback.invoke(C4035r.a(C4035r.b(AbstractC4036s.a(new FlutterError("firebase_remote_config", exception != null ? exception.getMessage() : null, map)))));
    }

    private final String mapLastFetchStatus(int status) {
        return status != -1 ? status != 0 ? (status == 1 || status != 2) ? "failure" : "throttled" : "noFetchYet" : "success";
    }

    private final String mapValueSource(int source) {
        return source != 0 ? source != 1 ? source != 2 ? "static" : "remote" : "default" : "static";
    }

    private final Map<String, Object> parseParameters(Map<String, ? extends k9.v> parameters) {
        HashMap map = new HashMap();
        for (String str : parameters.keySet()) {
            k9.v vVar = parameters.get(str);
            AbstractC4862t.b(vVar);
            map.put(str, createRemoteConfigValueMap(vVar));
        }
        return map;
    }

    private final void removeEventListeners() {
        Iterator<k9.d> it = this.listenersMap.values().iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.listenersMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConfigSettings$lambda$6(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        }
    }

    private final Task<Void> setCustomSignals(final k9.o remoteConfig, final Map<String, ? extends Object> customSignalsArguments) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseRemoteConfigPlugin.setCustomSignals$lambda$2(customSignalsArguments, remoteConfig, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCustomSignals$lambda$2(Map map, k9.o oVar, C2878l c2878l) {
        try {
            e.a aVar = new e.a();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    aVar.e(str, (String) value);
                } else if (value instanceof Long) {
                    aVar.d(str, ((Number) value).longValue());
                } else if (value instanceof Integer) {
                    aVar.d(str, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    aVar.c(str, ((Number) value).doubleValue());
                } else if (value == null) {
                    aVar.e(str, null);
                }
            }
            Tasks.await(oVar.v(aVar.b()));
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCustomSignals$lambda$9(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDefaults$lambda$7(vc.l lVar, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            firebaseRemoteConfigPlugin.handleFailure(lVar, task.l());
        } else {
            C4035r.a aVar = C4035r.f34274b;
            lVar.invoke(C4035r.a(C4035r.b(C4015H.f34254a)));
        }
    }

    private final void setupChannel(BinaryMessenger messenger) {
        FirebaseRemoteConfigHostApi.Companion.setUp$default(FirebaseRemoteConfigHostApi.INSTANCE, messenger, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL, this);
        EventChannel eventChannel = new EventChannel(messenger, EVENT_CHANNEL);
        this.eventChannel = eventChannel;
        AbstractC4862t.b(eventChannel);
        eventChannel.setStreamHandler(this);
        this.messenger = messenger;
    }

    private final void tearDownChannel() {
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FirebaseRemoteConfigHostApi.Companion companion = FirebaseRemoteConfigHostApi.INSTANCE;
        AbstractC4862t.b(binaryMessenger);
        FirebaseRemoteConfigHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.messenger = null;
        EventChannel eventChannel = this.eventChannel;
        AbstractC4862t.b(eventChannel);
        eventChannel.setStreamHandler(null);
        this.eventChannel = null;
        removeEventListeners();
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void activate(String appName, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(callback, "callback");
        getRemoteConfig(appName).i().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.C
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.activate$lambda$5(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseRemoteConfigPlugin.didReinitializeFirebaseCore$lambda$1(this.f37774a, c2878l);
            }
        });
        Task<Void> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void ensureInitialized(String appName, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(callback, "callback");
        getRemoteConfig(appName).k().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.A
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.ensureInitialized$lambda$8(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void fetch(String appName, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(callback, "callback");
        getRemoteConfig(appName).l().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.v
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.fetch$lambda$3(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void fetchAndActivate(String appName, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(callback, "callback");
        getRemoteConfig(appName).m().b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.z
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.fetchAndActivate$lambda$4(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void getAll(String appName, vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(callback, "callback");
        k9.o remoteConfig = getRemoteConfig(appName);
        C4035r.a aVar = C4035r.f34274b;
        Map mapN = remoteConfig.n();
        AbstractC4862t.d(mapN, "getAll(...)");
        callback.invoke(C4035r.a(C4035r.b(parseParameters(mapN))));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final C4288f firebaseApp) {
        AbstractC4862t.e(firebaseApp, "firebaseApp");
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseRemoteConfigPlugin.getPluginConstantsForFirebaseApp$lambda$0(firebaseApp, this, c2878l);
            }
        });
        Task<Map<String, Object>> taskA = c2878l.a();
        AbstractC4862t.d(taskA, "getTask(...)");
        return taskA;
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void getProperties(String appName, vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(callback, "callback");
        callback.invoke(C4035r.a(C4035r.b(getConfigProperties(getRemoteConfig(appName)))));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        setupChannel(binaryMessenger);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object arguments) {
        Map map = arguments instanceof Map ? (Map) arguments : null;
        if (map == null) {
            return;
        }
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        k9.d dVar = this.listenersMap.get(str);
        if (dVar != null) {
            dVar.remove();
            this.listenersMap.remove(str);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        tearDownChannel();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arguments, EventChannel.EventSink events) {
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(events, "events");
        Object obj = ((Map) arguments).get("appName");
        Objects.requireNonNull(obj);
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        this.listenersMap.put(str, getRemoteConfig(str).j(new AnonymousClass1(events)));
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void setConfigSettings(String appName, RemoteConfigPigeonSettings settings, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(settings, "settings");
        AbstractC4862t.e(callback, "callback");
        k9.u uVarC = new u.b().d(settings.getFetchTimeoutSeconds()).e(settings.getMinimumFetchIntervalSeconds()).c();
        AbstractC4862t.d(uVarC, "build(...)");
        getRemoteConfig(appName).t(uVarC).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.w
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.setConfigSettings$lambda$6(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void setDefaults(String appName, Map<String, ? extends Object> defaultParameters, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(defaultParameters, "defaultParameters");
        AbstractC4862t.e(callback, "callback");
        getRemoteConfig(appName).w(defaultParameters).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.B
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.setDefaults$lambda$7(callback, this, task);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void setCustomSignals(String appName, Map<String, ? extends Object> customSignals, final vc.l callback) {
        AbstractC4862t.e(appName, "appName");
        AbstractC4862t.e(customSignals, "customSignals");
        AbstractC4862t.e(callback, "callback");
        setCustomSignals(getRemoteConfig(appName), customSignals).b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.firebaseremoteconfig.y
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FirebaseRemoteConfigPlugin.setCustomSignals$lambda$9(callback, this, task);
            }
        });
    }
}
