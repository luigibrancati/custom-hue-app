package com.github.rmtmckenzie.native_device_orientation;

import android.app.Activity;
import com.github.rmtmckenzie.native_device_orientation.a;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f28903a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f28904b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MethodChannel f28905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EventChannel f28906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f28907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f28908f;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f28907e = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "native_device_orientation");
        this.f28905c = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "native_device_orientation_events");
        this.f28906d = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        a aVar = this.f28908f;
        if (aVar != null) {
            aVar.a();
            this.f28908f = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        a aVar = this.f28908f;
        if (aVar != null) {
            aVar.a();
            this.f28908f = null;
        }
        this.f28907e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a aVar = this.f28908f;
        if (aVar != null) {
            aVar.a();
            this.f28908f = null;
        }
        this.f28905c.setMethodCallHandler(null);
        this.f28906d.setStreamHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        Boolean bool;
        if (this.f28907e == null) {
            throw new IllegalStateException("Cannot start listening while activity is detached");
        }
        boolean z10 = false;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey("useSensor") && (bool = (Boolean) map.get("useSensor")) != null && bool.booleanValue()) {
                z10 = true;
            }
        }
        a.InterfaceC0355a interfaceC0355a = new a.InterfaceC0355a() { // from class: com.github.rmtmckenzie.native_device_orientation.b
            @Override // com.github.rmtmckenzie.native_device_orientation.a.InterfaceC0355a
            public final void a(e eVar) {
                eventSink.success(eVar.name());
            }
        };
        if (z10) {
            Log.i("NDOP", "listening using sensor listener");
            this.f28908f = new h(this.f28907e, interfaceC0355a);
        } else {
            Log.i("NDOP", "listening using window listener");
            this.f28908f = new f(this.f28903a, this.f28907e, interfaceC0355a);
        }
        this.f28908f.b();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "getOrientation":
                if (this.f28907e == null) {
                    result.error("detached", "Cannot get orientation while not attached to window", null);
                    break;
                } else {
                    Boolean bool = (Boolean) methodCall.argument("useSensor");
                    if (bool != null && bool.booleanValue()) {
                        this.f28904b.b(this.f28907e, new a.InterfaceC0355a() { // from class: com.github.rmtmckenzie.native_device_orientation.c
                            @Override // com.github.rmtmckenzie.native_device_orientation.a.InterfaceC0355a
                            public final void a(e eVar) {
                                result.success(eVar.name());
                            }
                        });
                    } else {
                        result.success(this.f28903a.a(this.f28907e).name());
                    }
                    break;
                }
                break;
            case "resume":
                a aVar = this.f28908f;
                if (aVar != null) {
                    aVar.b();
                }
                result.success(null);
                break;
            case "pause":
                a aVar2 = this.f28908f;
                if (aVar2 != null) {
                    aVar2.a();
                }
                result.success(null);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
