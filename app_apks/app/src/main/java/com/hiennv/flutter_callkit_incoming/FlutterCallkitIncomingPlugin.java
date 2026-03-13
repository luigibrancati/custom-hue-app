package com.hiennv.flutter_callkit_incoming;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.hiennv.flutter_callkit_incoming.CallkitEventCallback;
import com.hiennv.flutter_callkit_incoming.CallkitIncomingBroadcastReceiver;
import com.hiennv.flutter_callkit_incoming.FlutterCallkitIncomingPlugin;
import fc.AbstractC4040w;
import gc.P;
import gc.Q;
import gc.y;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.App;
import io.sentry.protocol.FeatureFlag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002ABB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0006J!\u0010\u001e\u001a\u00020\u000f2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u00020\u000f2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u0011J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010\u0006J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010\u0006J/\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020.2\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b002\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "<init>", "()V", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "getCallkitNotificationManager", "()Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;", "getCallkitSoundPlayerManager", "()Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lcom/hiennv/flutter_callkit_incoming/Data;", "data", "showIncomingNotification", "(Lcom/hiennv/flutter_callkit_incoming/Data;)V", "showMissCallNotification", "startCall", "endCall", "endAllCalls", "", "", "", SentryLogEvent.JsonKeys.BODY, "sendEventCustom", "(Ljava/util/Map;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "", "requestCode", "", App.JsonKeys.APP_PERMISSIONS, "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "callkitNotificationManager", "Lcom/hiennv/flutter_callkit_incoming/CallkitNotificationManager;", "callkitSoundPlayerManager", "Lcom/hiennv/flutter_callkit_incoming/CallkitSoundPlayerManager;", "Companion", "EventCallbackHandler", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlutterCallkitIncomingPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.RequestPermissionsResultListener {
    public static final String EXTRA_CALLKIT_CALL_DATA = "EXTRA_CALLKIT_CALL_DATA";

    @SuppressLint({"StaticFieldLeak"})
    private static FlutterCallkitIncomingPlugin instance;
    private Activity activity;
    private CallkitNotificationManager callkitNotificationManager;
    private CallkitSoundPlayerManager callkitSoundPlayerManager;
    private Context context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<BinaryMessenger, MethodChannel> methodChannels = new LinkedHashMap();
    private static final Map<BinaryMessenger, EventChannel> eventChannels = new LinkedHashMap();
    private static final List<WeakReference<EventCallbackHandler>> eventHandlers = new ArrayList();
    private static final List<WeakReference<CallkitEventCallback>> eventCallbacks = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b)\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020/0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105¨\u00067"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin$Companion;", "", "<init>", "()V", "Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin;", "getInstance", "()Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin;", "", "hasInstance", "()Z", "", "event", "", SentryLogEvent.JsonKeys.BODY, "Lfc/H;", "sendEvent", "(Ljava/lang/String;Ljava/util/Map;)V", "sendEventCustom", "Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback;", "callback", "registerEventCallback", "(Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback;)V", "unregisterEventCallback", "Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback$CallEvent;", "Landroid/os/Bundle;", "callData", "notifyEventCallbacks$flutter_callkit_incoming_release", "(Lcom/hiennv/flutter_callkit_incoming/CallkitEventCallback$CallEvent;Landroid/os/Bundle;)V", "notifyEventCallbacks", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "sharePluginWithRegister", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Landroid/content/Context;", "context", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "initSharedInstance", "(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V", FlutterCallkitIncomingPlugin.EXTRA_CALLKIT_CALL_DATA, "Ljava/lang/String;", "instance", "Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin;", "", "Lio/flutter/plugin/common/MethodChannel;", "methodChannels", "Ljava/util/Map;", "Lio/flutter/plugin/common/EventChannel;", "eventChannels", "", "Ljava/lang/ref/WeakReference;", "Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin$EventCallbackHandler;", "eventHandlers", "Ljava/util/List;", "eventCallbacks", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean unregisterEventCallback$lambda$2(CallkitEventCallback callkitEventCallback, WeakReference it) {
            AbstractC4862t.e(it, "it");
            return AbstractC4862t.a(it.get(), callkitEventCallback) || it.get() == null;
        }

        public final FlutterCallkitIncomingPlugin getInstance() {
            if (!hasInstance()) {
                return null;
            }
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = FlutterCallkitIncomingPlugin.instance;
            if (flutterCallkitIncomingPlugin != null) {
                return flutterCallkitIncomingPlugin;
            }
            AbstractC4862t.p("instance");
            return null;
        }

        public final boolean hasInstance() {
            return FlutterCallkitIncomingPlugin.instance != null;
        }

        public final void initSharedInstance(Context context, BinaryMessenger binaryMessenger) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(binaryMessenger, "binaryMessenger");
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = null;
            if (FlutterCallkitIncomingPlugin.instance == null) {
                FlutterCallkitIncomingPlugin.instance = new FlutterCallkitIncomingPlugin();
                FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin2 = FlutterCallkitIncomingPlugin.instance;
                if (flutterCallkitIncomingPlugin2 == null) {
                    AbstractC4862t.p("instance");
                    flutterCallkitIncomingPlugin2 = null;
                }
                flutterCallkitIncomingPlugin2.callkitSoundPlayerManager = new CallkitSoundPlayerManager(context);
                FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin3 = FlutterCallkitIncomingPlugin.instance;
                if (flutterCallkitIncomingPlugin3 == null) {
                    AbstractC4862t.p("instance");
                    flutterCallkitIncomingPlugin3 = null;
                }
                FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin4 = FlutterCallkitIncomingPlugin.instance;
                if (flutterCallkitIncomingPlugin4 == null) {
                    AbstractC4862t.p("instance");
                    flutterCallkitIncomingPlugin4 = null;
                }
                flutterCallkitIncomingPlugin3.callkitNotificationManager = new CallkitNotificationManager(context, flutterCallkitIncomingPlugin4.callkitSoundPlayerManager);
                FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin5 = FlutterCallkitIncomingPlugin.instance;
                if (flutterCallkitIncomingPlugin5 == null) {
                    AbstractC4862t.p("instance");
                    flutterCallkitIncomingPlugin5 = null;
                }
                flutterCallkitIncomingPlugin5.context = context;
            } else {
                FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin6 = FlutterCallkitIncomingPlugin.instance;
                if (flutterCallkitIncomingPlugin6 == null) {
                    AbstractC4862t.p("instance");
                    flutterCallkitIncomingPlugin6 = null;
                }
                if (flutterCallkitIncomingPlugin6.callkitNotificationManager == null) {
                    FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin7 = FlutterCallkitIncomingPlugin.instance;
                    if (flutterCallkitIncomingPlugin7 == null) {
                        AbstractC4862t.p("instance");
                        flutterCallkitIncomingPlugin7 = null;
                    }
                    flutterCallkitIncomingPlugin7.callkitSoundPlayerManager = new CallkitSoundPlayerManager(context);
                    FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin8 = FlutterCallkitIncomingPlugin.instance;
                    if (flutterCallkitIncomingPlugin8 == null) {
                        AbstractC4862t.p("instance");
                        flutterCallkitIncomingPlugin8 = null;
                    }
                    FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin9 = FlutterCallkitIncomingPlugin.instance;
                    if (flutterCallkitIncomingPlugin9 == null) {
                        AbstractC4862t.p("instance");
                        flutterCallkitIncomingPlugin9 = null;
                    }
                    flutterCallkitIncomingPlugin8.callkitNotificationManager = new CallkitNotificationManager(context, flutterCallkitIncomingPlugin9.callkitSoundPlayerManager);
                }
            }
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter_callkit_incoming");
            FlutterCallkitIncomingPlugin.methodChannels.put(binaryMessenger, methodChannel);
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin10 = FlutterCallkitIncomingPlugin.instance;
            if (flutterCallkitIncomingPlugin10 == null) {
                AbstractC4862t.p("instance");
            } else {
                flutterCallkitIncomingPlugin = flutterCallkitIncomingPlugin10;
            }
            methodChannel.setMethodCallHandler(flutterCallkitIncomingPlugin);
            EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter_callkit_incoming_events");
            FlutterCallkitIncomingPlugin.eventChannels.put(binaryMessenger, eventChannel);
            EventCallbackHandler eventCallbackHandler = new EventCallbackHandler();
            FlutterCallkitIncomingPlugin.eventHandlers.add(new WeakReference(eventCallbackHandler));
            eventChannel.setStreamHandler(eventCallbackHandler);
        }

        public final void notifyEventCallbacks$flutter_callkit_incoming_release(CallkitEventCallback.CallEvent event, Bundle callData) {
            AbstractC4862t.e(event, "event");
            AbstractC4862t.e(callData, "callData");
            Iterator it = Utils.INSTANCE.reapCollection(FlutterCallkitIncomingPlugin.eventCallbacks).iterator();
            while (it.hasNext()) {
                CallkitEventCallback callkitEventCallback = (CallkitEventCallback) ((WeakReference) it.next()).get();
                if (callkitEventCallback != null) {
                    callkitEventCallback.onCallEvent(event, callData);
                }
            }
        }

        public final void registerEventCallback(CallkitEventCallback callback) {
            AbstractC4862t.e(callback, "callback");
            FlutterCallkitIncomingPlugin.eventCallbacks.add(new WeakReference(callback));
        }

        public final void sendEvent(String event, Map<String, ? extends Object> body) {
            AbstractC4862t.e(event, "event");
            AbstractC4862t.e(body, "body");
            Iterator it = Utils.INSTANCE.reapCollection(FlutterCallkitIncomingPlugin.eventHandlers).iterator();
            while (it.hasNext()) {
                EventCallbackHandler eventCallbackHandler = (EventCallbackHandler) ((WeakReference) it.next()).get();
                if (eventCallbackHandler != null) {
                    eventCallbackHandler.send(event, body);
                }
            }
        }

        public final void sendEventCustom(String event, Map<String, ? extends Object> body) {
            AbstractC4862t.e(event, "event");
            AbstractC4862t.e(body, "body");
            Iterator it = Utils.INSTANCE.reapCollection(FlutterCallkitIncomingPlugin.eventHandlers).iterator();
            while (it.hasNext()) {
                EventCallbackHandler eventCallbackHandler = (EventCallbackHandler) ((WeakReference) it.next()).get();
                if (eventCallbackHandler != null) {
                    eventCallbackHandler.send(event, body);
                }
            }
        }

        public final void sharePluginWithRegister(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
            AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
            Context applicationContext = flutterPluginBinding.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
            AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
            initSharedInstance(applicationContext, binaryMessenger);
        }

        public final void unregisterEventCallback(final CallkitEventCallback callback) {
            AbstractC4862t.e(callback, "callback");
            y.I(FlutterCallkitIncomingPlugin.eventCallbacks, new vc.l() { // from class: com.hiennv.flutter_callkit_incoming.n
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FlutterCallkitIncomingPlugin.Companion.unregisterEventCallback$lambda$2(callback, (WeakReference) obj));
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/FlutterCallkitIncomingPlugin$EventCallbackHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "<init>", "()V", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "sink", "Lfc/H;", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "", "event", "", SentryLogEvent.JsonKeys.BODY, "send", "(Ljava/lang/String;Ljava/util/Map;)V", "onCancel", "(Ljava/lang/Object;)V", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EventCallbackHandler implements EventChannel.StreamHandler {
        private EventChannel.EventSink eventSink;

        /* JADX INFO: Access modifiers changed from: private */
        public static final void send$lambda$0(EventCallbackHandler eventCallbackHandler, Map map) {
            EventChannel.EventSink eventSink = eventCallbackHandler.eventSink;
            if (eventSink != null) {
                eventSink.success(map);
            }
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object arguments) {
            this.eventSink = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object arguments, EventChannel.EventSink sink) {
            AbstractC4862t.e(sink, "sink");
            this.eventSink = sink;
        }

        public final void send(String event, Map<String, ? extends Object> body) {
            AbstractC4862t.e(event, "event");
            AbstractC4862t.e(body, "body");
            final Map mapL = Q.l(AbstractC4040w.a("event", event), AbstractC4040w.a(SentryLogEvent.JsonKeys.BODY, body));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.hiennv.flutter_callkit_incoming.o
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterCallkitIncomingPlugin.EventCallbackHandler.send$lambda$0(this.f32396a, mapL);
                }
            });
        }
    }

    public final void endAllCalls() {
        for (Data data : SharedPreferencesUtilsKt.getDataActiveCalls(this.context)) {
            Context context = this.context;
            if (context != null) {
                CallkitIncomingBroadcastReceiver.Companion companion = CallkitIncomingBroadcastReceiver.INSTANCE;
                if (context == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                context.sendBroadcast(companion.getIntentEnded(context, data.toBundle()));
            }
        }
        SharedPreferencesUtilsKt.removeAllCalls(this.context);
    }

    public final void endCall(Data data) {
        AbstractC4862t.e(data, "data");
        Context context = this.context;
        if (context != null) {
            CallkitIncomingBroadcastReceiver.Companion companion = CallkitIncomingBroadcastReceiver.INSTANCE;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            context.sendBroadcast(companion.getIntentEnded(context, data.toBundle()));
        }
    }

    public final CallkitNotificationManager getCallkitNotificationManager() {
        return this.callkitNotificationManager;
    }

    public final CallkitSoundPlayerManager getCallkitSoundPlayerManager() {
        return this.callkitSoundPlayerManager;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = instance;
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin2 = null;
        if (flutterCallkitIncomingPlugin == null) {
            AbstractC4862t.p("instance");
            flutterCallkitIncomingPlugin = null;
        }
        flutterCallkitIncomingPlugin.context = binding.getActivity().getApplicationContext();
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin3 = instance;
        if (flutterCallkitIncomingPlugin3 == null) {
            AbstractC4862t.p("instance");
        } else {
            flutterCallkitIncomingPlugin2 = flutterCallkitIncomingPlugin3;
        }
        flutterCallkitIncomingPlugin2.activity = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        INSTANCE.sharePluginWithRegister(flutterPluginBinding);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        new InAppCallManager(applicationContext).registerPhoneAccount();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = instance;
        if (flutterCallkitIncomingPlugin == null) {
            AbstractC4862t.p("instance");
            flutterCallkitIncomingPlugin = null;
        }
        flutterCallkitIncomingPlugin.context = null;
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin2 = instance;
        if (flutterCallkitIncomingPlugin2 == null) {
            AbstractC4862t.p("instance");
            flutterCallkitIncomingPlugin2 = null;
        }
        flutterCallkitIncomingPlugin2.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Map<BinaryMessenger, MethodChannel> map = methodChannels;
        MethodChannel methodChannelRemove = map.remove(binding.getBinaryMessenger());
        if (methodChannelRemove != null) {
            methodChannelRemove.setMethodCallHandler(null);
        }
        Map<BinaryMessenger, EventChannel> map2 = eventChannels;
        EventChannel eventChannelRemove = map2.remove(binding.getBinaryMessenger());
        if (eventChannelRemove != null) {
            eventChannelRemove.setStreamHandler(null);
        }
        if (map.isEmpty() && map2.isEmpty()) {
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = instance;
            if (flutterCallkitIncomingPlugin == null) {
                AbstractC4862t.p("instance");
                flutterCallkitIncomingPlugin = null;
            }
            CallkitSoundPlayerManager callkitSoundPlayerManager = flutterCallkitIncomingPlugin.callkitSoundPlayerManager;
            if (callkitSoundPlayerManager != null) {
                callkitSoundPlayerManager.destroy();
            }
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin2 = instance;
            if (flutterCallkitIncomingPlugin2 == null) {
                AbstractC4862t.p("instance");
                flutterCallkitIncomingPlugin2 = null;
            }
            CallkitNotificationManager callkitNotificationManager = flutterCallkitIncomingPlugin2.callkitNotificationManager;
            if (callkitNotificationManager != null) {
                callkitNotificationManager.destroy();
            }
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin3 = instance;
            if (flutterCallkitIncomingPlugin3 == null) {
                AbstractC4862t.p("instance");
                flutterCallkitIncomingPlugin3 = null;
            }
            flutterCallkitIncomingPlugin3.callkitSoundPlayerManager = null;
            FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin4 = instance;
            if (flutterCallkitIncomingPlugin4 == null) {
                AbstractC4862t.p("instance");
                flutterCallkitIncomingPlugin4 = null;
            }
            flutterCallkitIncomingPlugin4.callkitNotificationManager = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Context context;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        try {
            String str = call.method;
            if (str != null) {
                Object obj = null;
                Object obj2 = null;
                switch (str.hashCode()) {
                    case -2129808928:
                        if (str.equals("startCall")) {
                            Map map = (Map) call.arguments();
                            if (map == null) {
                                map = new HashMap();
                            }
                            Data data = new Data(map);
                            Context context2 = this.context;
                            if (context2 != null) {
                                CallkitIncomingBroadcastReceiver.Companion companion = CallkitIncomingBroadcastReceiver.INSTANCE;
                                if (context2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                context2.sendBroadcast(companion.getIntentStart(context2, data.toBundle()));
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -1607757351:
                        if (str.equals("endCall")) {
                            ArrayList<Data> dataActiveCalls = SharedPreferencesUtilsKt.getDataActiveCalls(this.context);
                            Map map2 = (Map) call.arguments();
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            Data data2 = new Data(map2);
                            Iterator<T> it = dataActiveCalls.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (AbstractC4862t.a(((Data) next).getId(), data2.getId())) {
                                        obj = next;
                                    }
                                }
                            }
                            Data data3 = (Data) obj;
                            if (data3 != null && this.context != null) {
                                if (data3.getIsAccepted()) {
                                    Context context3 = this.context;
                                    if (context3 != null) {
                                        CallkitIncomingBroadcastReceiver.Companion companion2 = CallkitIncomingBroadcastReceiver.INSTANCE;
                                        if (context3 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        context3.sendBroadcast(companion2.getIntentEnded(context3, data3.toBundle()));
                                    }
                                } else {
                                    Context context4 = this.context;
                                    if (context4 != null) {
                                        CallkitIncomingBroadcastReceiver.Companion companion3 = CallkitIncomingBroadcastReceiver.INSTANCE;
                                        if (context4 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        context4.sendBroadcast(companion3.getIntentDecline(context4, data3.toBundle()));
                                    }
                                }
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -1324570815:
                        if (str.equals("showCallkitIncoming")) {
                            Map map3 = (Map) call.arguments();
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            Data data4 = new Data(map3);
                            data4.setFrom("notification");
                            Context context5 = this.context;
                            if (context5 != null) {
                                CallkitIncomingBroadcastReceiver.Companion companion4 = CallkitIncomingBroadcastReceiver.INSTANCE;
                                if (context5 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                context5.sendBroadcast(companion4.getIntentIncoming(context5, data4.toBundle()));
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -1260657399:
                        if (str.equals("endNativeSubsystemOnly")) {
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -1158937318:
                        if (str.equals("silenceEvents")) {
                            Object obj3 = call.arguments;
                            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            CallkitIncomingBroadcastReceiver.INSTANCE.setSilenceEvents(bool != null ? bool.booleanValue() : false);
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -1077750161:
                        if (str.equals("activeCalls")) {
                            result.success(SharedPreferencesUtilsKt.getDataActiveCallsForFlutter(this.context));
                            return;
                        }
                        return;
                    case -830276983:
                        if (str.equals("requestNotificationPermission")) {
                            Map mapC = P.c();
                            Object obj4 = call.arguments;
                            if (obj4 instanceof Map) {
                                mapC.putAll((Map) obj4);
                            }
                            Map<String, ? extends Object> mapB = P.b(mapC);
                            CallkitNotificationManager callkitNotificationManager = this.callkitNotificationManager;
                            if (callkitNotificationManager != null) {
                                callkitNotificationManager.requestNotificationPermission(this.activity, mapB);
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -516265027:
                        if (str.equals("holdCall")) {
                            Map mapC2 = P.c();
                            Object obj5 = call.arguments;
                            if (obj5 instanceof Map) {
                                mapC2.putAll((Map) obj5);
                            }
                            INSTANCE.sendEvent(CallkitConstants.ACTION_CALL_TOGGLE_HOLD, P.b(mapC2));
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -114952343:
                        if (str.equals("requestFullIntentPermission")) {
                            CallkitNotificationManager callkitNotificationManager2 = this.callkitNotificationManager;
                            if (callkitNotificationManager2 != null) {
                                callkitNotificationManager2.requestFullIntentPermission(this.activity);
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case -105894898:
                        if (str.equals("canUseFullScreenIntent")) {
                            CallkitNotificationManager callkitNotificationManager3 = this.callkitNotificationManager;
                            result.success(Boolean.valueOf(callkitNotificationManager3 != null ? callkitNotificationManager3.canUseFullScreenIntent() : true));
                            return;
                        }
                        return;
                    case 234563247:
                        if (str.equals("endAllCalls")) {
                            for (Data data5 : SharedPreferencesUtilsKt.getDataActiveCalls(this.context)) {
                                if (data5.getIsAccepted()) {
                                    Context context6 = this.context;
                                    if (context6 != null) {
                                        CallkitIncomingBroadcastReceiver.Companion companion5 = CallkitIncomingBroadcastReceiver.INSTANCE;
                                        if (context6 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        context6.sendBroadcast(companion5.getIntentEnded(context6, data5.toBundle()));
                                    } else {
                                        continue;
                                    }
                                } else {
                                    Context context7 = this.context;
                                    if (context7 != null) {
                                        CallkitIncomingBroadcastReceiver.Companion companion6 = CallkitIncomingBroadcastReceiver.INSTANCE;
                                        if (context7 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        context7.sendBroadcast(companion6.getIntentDecline(context7, data5.toBundle()));
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            SharedPreferencesUtilsKt.removeAllCalls(this.context);
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 867863575:
                        if (str.equals("muteCall")) {
                            Map mapC3 = P.c();
                            Object obj6 = call.arguments;
                            if (obj6 instanceof Map) {
                                mapC3.putAll((Map) obj6);
                            }
                            INSTANCE.sendEvent(CallkitConstants.ACTION_CALL_TOGGLE_MUTE, P.b(mapC3));
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 1136941602:
                        if (str.equals("showMissCallNotification")) {
                            Map map4 = (Map) call.arguments();
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            Data data6 = new Data(map4);
                            data6.setFrom("notification");
                            CallkitNotificationManager callkitNotificationManager4 = this.callkitNotificationManager;
                            if (callkitNotificationManager4 != null) {
                                callkitNotificationManager4.showMissCallNotification(data6.toBundle());
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 1270755932:
                        if (str.equals("hideCallkitIncoming")) {
                            Map map5 = (Map) call.arguments();
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            Data data7 = new Data(map5);
                            CallkitSoundPlayerManager callkitSoundPlayerManager = this.callkitSoundPlayerManager;
                            if (callkitSoundPlayerManager != null) {
                                callkitSoundPlayerManager.stop();
                            }
                            CallkitNotificationManager callkitNotificationManager5 = this.callkitNotificationManager;
                            if (callkitNotificationManager5 != null) {
                                callkitNotificationManager5.clearIncomingNotification(data7.toBundle(), false);
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 1297357571:
                        if (str.equals("showCallkitIncomingSilently")) {
                            Map map6 = (Map) call.arguments();
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            new Data(map6).setFrom("notification");
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 1532912203:
                        if (str.equals("callConnected")) {
                            ArrayList<Data> dataActiveCalls2 = SharedPreferencesUtilsKt.getDataActiveCalls(this.context);
                            Map map7 = (Map) call.arguments();
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            Data data8 = new Data(map7);
                            Iterator<T> it2 = dataActiveCalls2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (AbstractC4862t.a(((Data) next2).getId(), data8.getId())) {
                                        obj2 = next2;
                                    }
                                }
                            }
                            Data data9 = (Data) obj2;
                            if (data9 != null && (context = this.context) != null && context != null) {
                                CallkitIncomingBroadcastReceiver.Companion companion7 = CallkitIncomingBroadcastReceiver.INSTANCE;
                                if (context == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                context.sendBroadcast(companion7.getIntentConnected(context, data9.toBundle()));
                            }
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 2013602325:
                        if (str.equals("setAudioRoute")) {
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    case 2036207443:
                        if (str.equals("getDevicePushTokenVoIP")) {
                            result.success("");
                            return;
                        }
                        return;
                    case 2065669729:
                        if (str.equals("isMuted")) {
                            result.success(Boolean.TRUE);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Exception e10) {
            result.error("error", e10.getMessage(), "");
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = instance;
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin2 = null;
        if (flutterCallkitIncomingPlugin == null) {
            AbstractC4862t.p("instance");
            flutterCallkitIncomingPlugin = null;
        }
        flutterCallkitIncomingPlugin.context = binding.getActivity().getApplicationContext();
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin3 = instance;
        if (flutterCallkitIncomingPlugin3 == null) {
            AbstractC4862t.p("instance");
        } else {
            flutterCallkitIncomingPlugin2 = flutterCallkitIncomingPlugin3;
        }
        flutterCallkitIncomingPlugin2.activity = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(grantResults, "grantResults");
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin = instance;
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin2 = null;
        if (flutterCallkitIncomingPlugin == null) {
            AbstractC4862t.p("instance");
            flutterCallkitIncomingPlugin = null;
        }
        CallkitNotificationManager callkitNotificationManager = flutterCallkitIncomingPlugin.callkitNotificationManager;
        if (callkitNotificationManager == null) {
            return true;
        }
        FlutterCallkitIncomingPlugin flutterCallkitIncomingPlugin3 = instance;
        if (flutterCallkitIncomingPlugin3 == null) {
            AbstractC4862t.p("instance");
        } else {
            flutterCallkitIncomingPlugin2 = flutterCallkitIncomingPlugin3;
        }
        callkitNotificationManager.onRequestPermissionsResult(flutterCallkitIncomingPlugin2.activity, requestCode, grantResults);
        return true;
    }

    public final void sendEventCustom(Map<String, ? extends Object> body) {
        AbstractC4862t.e(body, "body");
        Iterator it = Utils.INSTANCE.reapCollection(eventHandlers).iterator();
        while (it.hasNext()) {
            EventCallbackHandler eventCallbackHandler = (EventCallbackHandler) ((WeakReference) it.next()).get();
            if (eventCallbackHandler != null) {
                eventCallbackHandler.send(CallkitConstants.ACTION_CALL_CUSTOM, body);
            }
        }
    }

    public final void showIncomingNotification(Data data) {
        AbstractC4862t.e(data, "data");
        data.setFrom("notification");
        Context context = this.context;
        if (context != null) {
            CallkitIncomingBroadcastReceiver.Companion companion = CallkitIncomingBroadcastReceiver.INSTANCE;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            context.sendBroadcast(companion.getIntentIncoming(context, data.toBundle()));
        }
    }

    public final void showMissCallNotification(Data data) {
        AbstractC4862t.e(data, "data");
        CallkitNotificationManager callkitNotificationManager = this.callkitNotificationManager;
        if (callkitNotificationManager != null) {
            callkitNotificationManager.showMissCallNotification(data.toBundle());
        }
    }

    public final void startCall(Data data) {
        AbstractC4862t.e(data, "data");
        Context context = this.context;
        if (context != null) {
            CallkitIncomingBroadcastReceiver.Companion companion = CallkitIncomingBroadcastReceiver.INSTANCE;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            context.sendBroadcast(companion.getIntentStart(context, data.toBundle()));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }
}
