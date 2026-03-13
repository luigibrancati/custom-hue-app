package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugins.urllauncher.Messages;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UrlLauncherPlugin implements FlutterPlugin, ActivityAware {
    private static final String TAG = "UrlLauncherPlugin";
    private UrlLauncher urlLauncher;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        UrlLauncher urlLauncher = this.urlLauncher;
        if (urlLauncher == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            urlLauncher.setActivity(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.urlLauncher = new UrlLauncher(flutterPluginBinding.getApplicationContext());
        Messages.UrlLauncherApi.setUp(flutterPluginBinding.getBinaryMessenger(), this.urlLauncher);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        UrlLauncher urlLauncher = this.urlLauncher;
        if (urlLauncher == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            urlLauncher.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.urlLauncher == null) {
            Log.wtf(TAG, "Already detached from the engine.");
        } else {
            Messages.UrlLauncherApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
            this.urlLauncher = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
