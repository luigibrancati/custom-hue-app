package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.AbstractC2763t;
import androidx.lifecycle.x;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.ar.core.ImageMetadata;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import h8.C4288f;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseMessagingPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    private MethodChannel channel;
    private T initialMessage;
    private Map<String, Object> initialMessageNotification;
    private Activity mainActivity;
    FlutterFirebasePermissionManager permissionManager;
    private x remoteMessageObserver;
    private x tokenObserver;
    private final HashMap<String, Boolean> consumedInitialMessages = new HashMap<>();
    private final AbstractC2763t liveDataRemoteMessage = FlutterFirebaseRemoteMessageLiveData.getInstance();
    private final AbstractC2763t liveDataToken = FlutterFirebaseTokenLiveData.getInstance();

    public static /* synthetic */ void a(Map map, C2878l c2878l) {
        try {
            FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map).send(FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(map));
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void c(Map map, C2878l c2878l) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.subscribeToTopic((String) obj));
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private Boolean checkPermissions() {
        return Boolean.valueOf(ContextHolder.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private Task<Void> deleteToken() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.o
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.h(c2878l);
            }
        });
        return c2878l.a();
    }

    public static /* synthetic */ void e(Map map, C2878l c2878l) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.unsubscribeFromTopic((String) obj));
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap map = new HashMap();
        map.put("code", "unknown");
        if (exc != null) {
            map.put("message", exc.getMessage());
            return map;
        }
        map.put("message", "An unknown error has occurred.");
        return map;
    }

    private Task<Map<String, Object>> getInitialMessage() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f37829a.lambda$getInitialMessage$9(c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Map<String, Integer>> getPermissions() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f37825a.lambda$getPermissions$13(c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Map<String, Object>> getToken() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f37820a.lambda$getToken$3(c2878l);
            }
        });
        return c2878l.a();
    }

    public static /* synthetic */ void h(C2878l c2878l) {
        try {
            Tasks.await(FirebaseMessaging.getInstance().deleteToken());
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.permissionManager = new FlutterFirebasePermissionManager();
        this.remoteMessageObserver = new x() { // from class: io.flutter.plugins.firebase.messaging.p
            @Override // androidx.lifecycle.x
            public final void b(Object obj) {
                this.f37823a.lambda$initInstance$0((T) obj);
            }
        };
        this.tokenObserver = new x() { // from class: io.flutter.plugins.firebase.messaging.q
            @Override // androidx.lifecycle.x
            public final void b(Object obj) {
                this.f37824a.lambda$initInstance$1((String) obj);
            }
        };
        this.liveDataRemoteMessage.observeForever(this.remoteMessageObserver);
        this.liveDataToken.observeForever(this.tokenObserver);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public static /* synthetic */ void k(C4288f c4288f, C2878l c2878l) {
        try {
            HashMap map = new HashMap();
            if (c4288f.q().equals("[DEFAULT]")) {
                map.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.getInstance().isAutoInitEnabled()));
            }
            c2878l.c(map);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r0
      0x007c: PHI (r0v10 com.google.firebase.messaging.T) = (r0v7 com.google.firebase.messaging.T), (r0v12 com.google.firebase.messaging.T) binds: [B:31:0x0067, B:33:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$getInitialMessage$9(b7.C2878l r7) {
        /*
            r6 = this;
            com.google.firebase.messaging.T r0 = r6.initialMessage     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "notification"
            r2 = 0
            if (r0 == 0) goto L1e
            java.util.Map r0 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils.remoteMessageToMap(r0)     // Catch: java.lang.Exception -> L13
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.initialMessageNotification     // Catch: java.lang.Exception -> L13
            if (r3 == 0) goto L16
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L13
            goto L16
        L13:
            r6 = move-exception
            goto Lae
        L16:
            r7.c(r0)     // Catch: java.lang.Exception -> L13
            r6.initialMessage = r2     // Catch: java.lang.Exception -> L13
            r6.initialMessageNotification = r2     // Catch: java.lang.Exception -> L13
            return
        L1e:
            android.app.Activity r0 = r6.mainActivity     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto L26
            r7.c(r2)     // Catch: java.lang.Exception -> L13
            return
        L26:
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto Laa
            android.os.Bundle r3 = r0.getExtras()     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L34
            goto Laa
        L34:
            android.os.Bundle r3 = r0.getExtras()     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = "google.message_id"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L4a
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L13
            java.lang.String r3 = "message_id"
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Exception -> L13
        L4a:
            if (r3 == 0) goto La6
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r6.consumedInitialMessages     // Catch: java.lang.Exception -> L13
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L55
            goto La6
        L55:
            java.util.HashMap<java.lang.String, com.google.firebase.messaging.T> r0 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver.notifications     // Catch: java.lang.Exception -> L13
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L13
            com.google.firebase.messaging.T r0 = (com.google.firebase.messaging.T) r0     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto L85
            io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingStore r4 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingStore.getInstance()     // Catch: java.lang.Exception -> L13
            java.util.Map r4 = r4.getFirebaseMessageMap(r3)     // Catch: java.lang.Exception -> L13
            if (r4 == 0) goto L7c
            com.google.firebase.messaging.T r0 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(r4)     // Catch: java.lang.Exception -> L13
            java.lang.Object r5 = r4.get(r1)     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L7c
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Exception -> L13
            java.util.Map r4 = r6.uncheckedCastToMap(r4)     // Catch: java.lang.Exception -> L13
            goto L7d
        L7c:
            r4 = r2
        L7d:
            io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingStore r5 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingStore.getInstance()     // Catch: java.lang.Exception -> L13
            r5.removeFirebaseMessage(r3)     // Catch: java.lang.Exception -> L13
            goto L86
        L85:
            r4 = r2
        L86:
            if (r0 != 0) goto L8c
            r7.c(r2)     // Catch: java.lang.Exception -> L13
            return
        L8c:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r6 = r6.consumedInitialMessages     // Catch: java.lang.Exception -> L13
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L13
            r6.put(r3, r2)     // Catch: java.lang.Exception -> L13
            java.util.Map r6 = io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils.remoteMessageToMap(r0)     // Catch: java.lang.Exception -> L13
            com.google.firebase.messaging.T$c r0 = r0.n()     // Catch: java.lang.Exception -> L13
            if (r0 != 0) goto La2
            if (r4 == 0) goto La2
            r6.put(r1, r4)     // Catch: java.lang.Exception -> L13
        La2:
            r7.c(r6)     // Catch: java.lang.Exception -> L13
            return
        La6:
            r7.c(r2)     // Catch: java.lang.Exception -> L13
            return
        Laa:
            r7.c(r2)     // Catch: java.lang.Exception -> L13
            return
        Lae:
            r7.b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.lambda$getInitialMessage$9(b7.l):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$getPermissions$13(C2878l c2878l) {
        try {
            HashMap map = new HashMap();
            map.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? checkPermissions().booleanValue() : NotificationManagerCompat.from(this.mainActivity).areNotificationsEnabled()));
            c2878l.c(map);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$3(C2878l c2878l) {
        try {
            c2878l.c(new HashMap<String, Object>((String) Tasks.await(FirebaseMessaging.getInstance().getToken())) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.1
                final /* synthetic */ String val$token;

                {
                    this.val$token = str;
                    put("token", str);
                }
            });
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstance$0(T t10) {
        this.channel.invokeMethod("Messaging#onMessage", FlutterFirebaseMessagingUtils.remoteMessageToMap(t10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstance$1(String str) {
        this.channel.invokeMethod("Messaging#onTokenRefresh", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMethodCall$14(MethodChannel.Result result, Task task) {
        if (task.q()) {
            result.success(task.m());
        } else {
            Exception excL = task.l();
            result.error("firebase_messaging", excL != null ? excL.getMessage() : null, getExceptionDetails(excL));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissions$12(final C2878l c2878l) {
        final HashMap map = new HashMap();
        try {
            if (!checkPermissions().booleanValue()) {
                this.permissionManager.requestPermissions(this.mainActivity, new FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback
                    public final void onSuccess(int i10) {
                        FlutterFirebaseMessagingPlugin.o(map, c2878l, i10);
                    }
                }, new ErrorCallback() { // from class: io.flutter.plugins.firebase.messaging.h
                    @Override // io.flutter.plugins.firebase.messaging.ErrorCallback
                    public final void onError(String str) {
                        c2878l.b(new Exception(str));
                    }
                });
            } else {
                map.put("authorizationStatus", 1);
                c2878l.c(map);
            }
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoInitEnabled$7(Map map, C2878l c2878l) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.setAutoInitEnabled(((Boolean) obj).booleanValue());
            c2878l.c(new HashMap<String, Object>(firebaseMessagingForArguments) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.2
                final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

                {
                    this.val$firebaseMessaging = firebaseMessagingForArguments;
                    put("isAutoInitEnabled", Boolean.valueOf(firebaseMessagingForArguments.isAutoInitEnabled()));
                }
            });
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void m(Map map, C2878l c2878l) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.setDeliveryMetricsExportToBigQuery(((Boolean) obj).booleanValue());
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ void o(Map map, C2878l c2878l, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        c2878l.c(map);
    }

    private Task<Map<String, Integer>> requestPermissions() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f37816a.lambda$requestPermissions$12(c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Void> sendMessage(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.m
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.a(map, c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Map<String, Object>> setAutoInitEnabled(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f37810a.lambda$setAutoInitEnabled$7(map, c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Void> setDeliveryMetricsExportToBigQuery(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.f
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.m(map, c2878l);
            }
        });
        return c2878l.a();
    }

    private Task<Void> subscribeToTopic(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.c(map, c2878l);
            }
        });
        return c2878l.a();
    }

    private Map<String, Object> uncheckedCastToMap(Object obj) {
        return (Map) obj;
    }

    private Task<Void> unsubscribeFromTopic(final Map<String, Object> map) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.e
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.e(map, c2878l);
            }
        });
        return c2878l.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.j
            @Override // java.lang.Runnable
            public final void run() {
                c2878l.c(null);
            }
        });
        return c2878l.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final C4288f c4288f) {
        final C2878l c2878l = new C2878l();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.d
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.k(c4288f, c2878l);
            }
        });
        return c2878l.a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this.permissionManager);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        if (activity.getIntent() == null || this.mainActivity.getIntent().getExtras() == null || (this.mainActivity.getIntent().getFlags() & ImageMetadata.SHADING_MODE) == 1048576) {
            return;
        }
        onNewIntent(this.mainActivity.getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ContextHolder.setApplicationContext(flutterPluginBinding.getApplicationContext());
        initInstance(flutterPluginBinding.getBinaryMessenger());
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
        this.liveDataToken.removeObserver(this.tokenObserver);
        this.liveDataRemoteMessage.removeObserver(this.remoteMessageObserver);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        Task initialMessage;
        long jIntValue;
        long jIntValue2;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "Messaging#getInitialMessage":
                initialMessage = getInitialMessage();
                break;
            case "Messaging#setAutoInitEnabled":
                initialMessage = setAutoInitEnabled((Map) methodCall.arguments());
                break;
            case "Messaging#deleteToken":
                initialMessage = deleteToken();
                break;
            case "Messaging#unsubscribeFromTopic":
                initialMessage = unsubscribeFromTopic((Map) methodCall.arguments());
                break;
            case "Messaging#subscribeToTopic":
                initialMessage = subscribeToTopic((Map) methodCall.arguments());
                break;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                initialMessage = setDeliveryMetricsExportToBigQuery((Map) methodCall.arguments());
                break;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) methodCall.arguments;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    jIntValue = ((Long) obj).longValue();
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    jIntValue = ((Integer) obj).intValue();
                }
                if (obj2 instanceof Long) {
                    jIntValue2 = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    jIntValue2 = ((Integer) obj2).intValue();
                }
                Activity activity = this.mainActivity;
                FlutterShellArgs flutterShellArgsFromIntent = activity != null ? FlutterShellArgs.fromIntent(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(jIntValue);
                FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(jIntValue2);
                FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(jIntValue, flutterShellArgsFromIntent);
                initialMessage = Tasks.e(null);
                break;
            case "Messaging#sendMessage":
                initialMessage = sendMessage((Map) methodCall.arguments());
                break;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT < 33) {
                    initialMessage = getPermissions();
                    break;
                } else {
                    initialMessage = requestPermissions();
                    break;
                }
                break;
            case "Messaging#getNotificationSettings":
                initialMessage = getPermissions();
                break;
            case "Messaging#getToken":
                initialMessage = getToken();
                break;
            default:
                result.notImplemented();
                return;
        }
        initialMessage.b(new InterfaceC2872f() { // from class: io.flutter.plugins.firebase.messaging.s
            @Override // b7.InterfaceC2872f
            public final void a(Task task) {
                this.f37827a.lambda$onMethodCall$14(result, task);
            }
        });
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Map<String, Object> remoteMessageNotificationForArguments;
        Map<String, Object> map;
        Map<String, Object> firebaseMessageMap;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        T remoteMessageForArguments = FlutterFirebaseMessagingReceiver.notifications.get(string);
        if (remoteMessageForArguments != null || (firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string)) == null) {
            remoteMessageNotificationForArguments = null;
        } else {
            remoteMessageForArguments = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
            remoteMessageNotificationForArguments = FlutterFirebaseMessagingUtils.getRemoteMessageNotificationForArguments(firebaseMessageMap);
        }
        if (remoteMessageForArguments == null) {
            return false;
        }
        this.initialMessage = remoteMessageForArguments;
        this.initialMessageNotification = remoteMessageNotificationForArguments;
        FlutterFirebaseMessagingReceiver.notifications.remove(string);
        Map<String, Object> mapRemoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(remoteMessageForArguments);
        if (remoteMessageForArguments.n() == null && (map = this.initialMessageNotification) != null) {
            mapRemoteMessageToMap.put("notification", map);
        }
        this.channel.invokeMethod("Messaging#onMessageOpenedApp", mapRemoteMessageToMap);
        this.mainActivity.setIntent(intent);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }
}
