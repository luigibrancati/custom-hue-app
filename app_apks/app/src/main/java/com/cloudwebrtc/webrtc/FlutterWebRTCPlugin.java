package com.cloudwebrtc.webrtc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import com.cloudwebrtc.webrtc.audio.AudioProcessingController;
import com.cloudwebrtc.webrtc.audio.AudioSwitchManager;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import fc.C4015H;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class FlutterWebRTCPlugin implements FlutterPlugin, ActivityAware, EventChannel.StreamHandler {
    public static final String TAG = "FlutterWebRTCPlugin";
    private static Application application;
    public static EventChannel.EventSink eventSink;
    public static FlutterWebRTCPlugin sharedSingleton;
    private EventChannel eventChannel;
    private AbstractC2754j lifecycle;
    private MethodCallHandlerImpl methodCallHandler;
    private MethodChannel methodChannel;
    private LifeCycleObserver observer;

    public FlutterWebRTCPlugin() {
        sharedSingleton = this;
    }

    public static /* synthetic */ C4015H a(FlutterWebRTCPlugin flutterWebRTCPlugin, List list, Oa.c cVar) {
        flutterWebRTCPlugin.getClass();
        Log.w("FlutterWebRTCPlugin", "audioFocusChangeListener " + list + StringUtils.SPACE + cVar);
        ConstraintsMap constraintsMap = new ConstraintsMap();
        constraintsMap.putString("event", "onDeviceChange");
        flutterWebRTCPlugin.sendEvent(constraintsMap.toMap());
        return null;
    }

    private void startListening(Context context, BinaryMessenger binaryMessenger, TextureRegistry textureRegistry) {
        AudioSwitchManager.instance = new AudioSwitchManager(context);
        this.methodCallHandler = new MethodCallHandlerImpl(context, binaryMessenger, textureRegistry);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "FlutterWebRTC.Method");
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this.methodCallHandler);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "FlutterWebRTC.Event");
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
        AudioSwitchManager.instance.audioDeviceChangeListener = new vc.p() { // from class: com.cloudwebrtc.webrtc.a
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return FlutterWebRTCPlugin.a(this.f28771a, (List) obj, (Oa.c) obj2);
            }
        };
    }

    private void stopListening() {
        this.methodCallHandler.dispose();
        this.methodCallHandler = null;
        this.methodChannel.setMethodCallHandler(null);
        this.eventChannel.setStreamHandler(null);
        if (AudioSwitchManager.instance != null) {
            Log.d("FlutterWebRTCPlugin", "Stopping the audio manager...");
            AudioSwitchManager.instance.stop();
        }
    }

    public AudioProcessingController getAudioProcessingController() {
        return this.methodCallHandler.audioProcessingController;
    }

    public LocalTrack getLocalTrack(String str) {
        return this.methodCallHandler.getLocalTrack(str);
    }

    public MediaStreamTrack getRemoteTrack(String str) {
        return this.methodCallHandler.getRemoteTrack(str);
    }

    public MediaStreamTrack getTrackForId(String str, String str2) {
        return this.methodCallHandler.getTrackForId(str, str2);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.methodCallHandler.setActivity(activityPluginBinding.getActivity());
        this.observer = new LifeCycleObserver();
        AbstractC2754j lifecycle = ((HiddenLifecycleReference) activityPluginBinding.getLifecycle()).getLifecycle();
        this.lifecycle = lifecycle;
        lifecycle.a(this.observer);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        startListening(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getTextureRegistry());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        eventSink = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.methodCallHandler.setActivity(null);
        LifeCycleObserver lifeCycleObserver = this.observer;
        if (lifeCycleObserver != null) {
            this.lifecycle.c(lifeCycleObserver);
            Application application2 = application;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(this.observer);
            }
        }
        this.lifecycle = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.methodCallHandler.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        stopListening();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink2) {
        eventSink = new AnyThreadSink(eventSink2);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.methodCallHandler.setActivity(activityPluginBinding.getActivity());
    }

    public void sendEvent(Object obj) {
        EventChannel.EventSink eventSink2 = eventSink;
        if (eventSink2 != null) {
            eventSink2.success(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private LifeCycleObserver() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (FlutterWebRTCPlugin.this.methodCallHandler != null) {
                FlutterWebRTCPlugin.this.methodCallHandler.reStartCamera();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n interfaceC2758n) {
            if (FlutterWebRTCPlugin.this.methodCallHandler != null) {
                FlutterWebRTCPlugin.this.methodCallHandler.reStartCamera();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
