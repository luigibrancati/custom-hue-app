package ga;

import android.content.Intent;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* JADX INFO: renamed from: ga.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4174b implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware, PluginRegistry.NewIntentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodChannel f35568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EventChannel f35569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EventChannel.EventSink f35570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityPluginBinding f35571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35573f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35574g;

    private boolean a(Intent intent) {
        String strA;
        if (intent == null) {
            return false;
        }
        Log.d("com.llfbandit.app_links", intent.toString());
        if ((intent.getFlags() & ImageMetadata.SHADING_MODE) == 1048576 || (strA = C4173a.a(intent)) == null) {
            return false;
        }
        if (this.f35572e == null) {
            this.f35572e = strA;
        }
        this.f35574g = strA;
        EventChannel.EventSink eventSink = this.f35570c;
        if (eventSink != null) {
            this.f35573f = true;
            eventSink.success(strA);
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f35571d = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
        a(activityPluginBinding.getActivity().getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/messages");
        this.f35568a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/events");
        this.f35569b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        this.f35570c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f35571d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.f35571d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f35568a.setMethodCallHandler(null);
        this.f35569b.setStreamHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        String str;
        this.f35570c = eventSink;
        if (this.f35573f || (str = this.f35572e) == null) {
            return;
        }
        this.f35573f = true;
        eventSink.success(str);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("getLatestLink")) {
            result.success(this.f35574g);
        } else if (methodCall.method.equals("getInitialLink")) {
            result.success(this.f35572e);
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        return a(intent);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f35571d = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
    }
}
