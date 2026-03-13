package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseCrashlyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    public static final String TAG = "FLTFirebaseCrashlytics";
    private MethodChannel channel;
    private EventChannel testEventChannel;
    private EventChannel.EventSink testEventSink;

    public static /* synthetic */ void c(MethodChannel.Result result, Task task) {
        if (task.q()) {
            result.success(task.m());
        } else {
            Exception excL = task.l();
            result.error("firebase_crashlytics", excL != null ? excL.getMessage() : "An unknown error occurred", null);
        }
    }

    private Task<Map<String, Object>> checkForUnsentReports() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f37734a.lambda$checkForUnsentReports$0(c2878l);
            }
        });
        return c2878l.a();
    }

    private void crash() {
        new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.e
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.e();
            }
        }, 50L);
    }

    private Task<Void> deleteUnsentReports() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.l(c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Map<String, Object>> didCrashOnPreviousExecution() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f37743a.lambda$didCrashOnPreviousExecution$3(c2878l);
            }
        });
        return c2878l.a();
    }

    public static /* synthetic */ void e() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static /* synthetic */ void f(Map map, C2878l c2878l) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            q8.h.e().g((String) obj);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void g(Map map, C2878l c2878l) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            q8.h.e().l((String) obj);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private StackTraceElement generateStackTraceElement(Map<String, String> map) {
        try {
            String str = map.get(Constants.FILE);
            String str2 = map.get(Constants.LINE);
            String str3 = map.get(Constants.CLASS);
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(TAG, "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences getCrashlyticsSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_crashlytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "plugins.flutter.io/firebase_crashlytics_test_stream");
        this.testEventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCrashlyticsCollectionEnabled(C4288f c4288f) {
        SharedPreferences crashlyticsSharedPrefs = getCrashlyticsSharedPrefs(c4288f.m());
        if (crashlyticsSharedPrefs.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            return crashlyticsSharedPrefs.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true);
        }
        Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(c4288f.m());
        q8.h.e().j(crashlyticsDataCollectionEnabledFromManifest);
        return crashlyticsDataCollectionEnabledFromManifest.booleanValue();
    }

    public static /* synthetic */ void j(C2878l c2878l) {
        try {
            q8.h.e().i();
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void k(Map map, C2878l c2878l) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            q8.h.e().k((String) obj, (String) obj2);
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void l(C2878l c2878l) {
        try {
            q8.h.e().c();
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForUnsentReports$0(C2878l c2878l) {
        try {
            c2878l.c(new HashMap<String, Object>(((Boolean) Tasks.await(q8.h.e().b())).booleanValue()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.1
                final /* synthetic */ boolean val$unsentReports;

                {
                    this.val$unsentReports = z;
                    put(Constants.UNSENT_REPORTS, Boolean.valueOf(z));
                }
            });
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didCrashOnPreviousExecution$3(C2878l c2878l) {
        try {
            c2878l.c(new HashMap<String, Object>(q8.h.e().d()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.2
                final /* synthetic */ boolean val$didCrashOnPreviousExecution;

                {
                    this.val$didCrashOnPreviousExecution = z;
                    put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z));
                }
            });
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$12(C2878l c2878l, C4288f c4288f) {
        try {
            c2878l.c(new HashMap<String, Object>(c4288f) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.4
                final /* synthetic */ C4288f val$firebaseApp;

                {
                    this.val$firebaseApp = c4288f;
                    if (c4288f.q().equals("[DEFAULT]")) {
                        put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(C4288f.o())));
                    }
                }
            });
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordError$4(String str) {
        this.testEventSink.success(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$recordError$5(Map map, Handler handler, C2878l c2878l) {
        FlutterError flutterError;
        try {
            q8.h hVarE = q8.h.e();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get(Constants.INFORMATION);
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get(Constants.FATAL);
            Objects.requireNonNull(obj3);
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get(Constants.BUILD_ID);
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            Object obj5 = map.get(Constants.LOADING_UNITS);
            Objects.requireNonNull(obj5);
            List list = (List) obj5;
            if (str4.length() > 0) {
                q8.i.b(str4);
            }
            q8.i.c(list);
            if (str2 != null) {
                final String str5 = "thrown " + str2;
                if (this.testEventSink != null) {
                    handler.post(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37729a.lambda$recordError$4(str5);
                        }
                    });
                }
                hVarE.k(Constants.FLUTTER_ERROR_REASON, str5);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            hVarE.k(Constants.FLUTTER_ERROR_EXCEPTION, str);
            ArrayList arrayList = new ArrayList();
            Object obj6 = map.get(Constants.STACK_TRACE_ELEMENTS);
            Objects.requireNonNull(obj6);
            Iterator it = ((List) obj6).iterator();
            while (it.hasNext()) {
                StackTraceElement stackTraceElementGenerateStackTraceElement = generateStackTraceElement((Map) it.next());
                if (stackTraceElementGenerateStackTraceElement != null) {
                    arrayList.add(stackTraceElementGenerateStackTraceElement);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                hVarE.g(str3);
            }
            if (zBooleanValue) {
                q8.i.a(flutterError);
            } else {
                hVarE.h(flutterError);
            }
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCrashlyticsCollectionEnabled$8(Map map, C2878l c2878l) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            q8.h.e().j((Boolean) obj);
            c2878l.c(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.3
                {
                    put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(C4288f.o())));
                }
            });
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private Task<Void> log(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.b
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.f(map, c2878l);
            }
        });
        return c2878l.a();
    }

    public static /* synthetic */ void m(C2878l c2878l) {
        try {
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED));
            }
        } catch (PackageManager.NameNotFoundException e10) {
            r8.g.f().e("Could not read data collection permission from manifest", e10);
        }
        return Boolean.TRUE;
    }

    private Task<Void> recordError(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        final Handler handler = new Handler(Looper.getMainLooper());
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f37722a.lambda$recordError$5(map, handler, c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Void> sendUnsentReports() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.j(c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f37731a.lambda$setCrashlyticsCollectionEnabled$8(map, c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Void> setCustomKey(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.m
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.k(map, c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Void> setUserIdentifier(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.h
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.g(map, c2878l);
            }
        });
        return c2878l.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.n
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.m(c2878l);
            }
        });
        return c2878l.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final C4288f c4288f) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f37738a.lambda$getPluginConstantsForFirebaseApp$12(c2878l, c4288f);
            }
        });
        return c2878l.a();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.testEventSink = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
        EventChannel eventChannel = this.testEventChannel;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
            this.testEventChannel = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.testEventSink = eventSink;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        Task taskDidCrashOnPreviousExecution;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                taskDidCrashOnPreviousExecution = didCrashOnPreviousExecution();
                break;
            case "Crashlytics#recordError":
                taskDidCrashOnPreviousExecution = recordError((Map) methodCall.arguments());
                break;
            case "Crashlytics#checkForUnsentReports":
                taskDidCrashOnPreviousExecution = checkForUnsentReports();
                break;
            case "Crashlytics#sendUnsentReports":
                taskDidCrashOnPreviousExecution = sendUnsentReports();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                taskDidCrashOnPreviousExecution = setCrashlyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case "Crashlytics#log":
                taskDidCrashOnPreviousExecution = log((Map) methodCall.arguments());
                break;
            case "Crashlytics#setCustomKey":
                taskDidCrashOnPreviousExecution = setCustomKey((Map) methodCall.arguments());
                break;
            case "Crashlytics#deleteUnsentReports":
                taskDidCrashOnPreviousExecution = deleteUnsentReports();
                break;
            case "Crashlytics#setUserIdentifier":
                taskDidCrashOnPreviousExecution = setUserIdentifier((Map) methodCall.arguments());
                break;
            case "Crashlytics#crash":
                crash();
                return;
            default:
                result.notImplemented();
                return;
        }
        taskDidCrashOnPreviousExecution.b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.crashlytics.c
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                FlutterFirebaseCrashlyticsPlugin.c(result, task);
            }
        });
    }
}
