package io.flutter.plugins.quickactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.quickactions.Messages;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class QuickActionsPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.NewIntentListener {
    private static final String TAG = "QuickActionsAndroid";
    private QuickActions quickActions;
    private Messages.AndroidQuickActionsFlutterApi quickActionsFlutterApi;
    private final AndroidSdkChecker sdkChecker;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface AndroidSdkChecker {
        boolean sdkIsAtLeast(int i10);
    }

    public QuickActionsPlugin() {
        this(new AndroidSdkChecker() { // from class: io.flutter.plugins.quickactions.g
            @Override // io.flutter.plugins.quickactions.QuickActionsPlugin.AndroidSdkChecker
            public final boolean sdkIsAtLeast(int i10) {
                return QuickActionsPlugin.a(i10);
            }
        });
    }

    public static /* synthetic */ boolean a(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        if (this.quickActions == null) {
            Log.wtf(TAG, "quickActions was never set.");
            return;
        }
        Activity activity = activityPluginBinding.getActivity();
        this.quickActions.setActivity(activity);
        activityPluginBinding.addOnNewIntentListener(this);
        onNewIntent(activity.getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.quickActions = new QuickActions(flutterPluginBinding.getApplicationContext());
        Messages.AndroidQuickActionsApi.setUp(flutterPluginBinding.getBinaryMessenger(), this.quickActions);
        this.quickActionsFlutterApi = new Messages.AndroidQuickActionsFlutterApi(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.quickActions.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.AndroidQuickActionsApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
        this.quickActions = null;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        if (!this.sdkChecker.sdkIsAtLeast(25)) {
            return false;
        }
        Activity activity = this.quickActions.getActivity();
        if (intent.hasExtra("some unique action key") && activity != null) {
            Context applicationContext = activity.getApplicationContext();
            String stringExtra = intent.getStringExtra("some unique action key");
            if (stringExtra != null) {
                this.quickActionsFlutterApi.launchAction(stringExtra, new Messages.VoidResult() { // from class: io.flutter.plugins.quickactions.QuickActionsPlugin.1
                    @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                    public void error(Throwable th) {
                        Log.e(QuickActionsPlugin.TAG, "Failed to handle launch action: " + th.getMessage());
                    }

                    @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                    public void success() {
                    }
                });
                M0.e.e(applicationContext, stringExtra);
            }
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.removeOnNewIntentListener(this);
        onAttachedToActivity(activityPluginBinding);
    }

    public QuickActionsPlugin(AndroidSdkChecker androidSdkChecker) {
        this.sdkChecker = androidSdkChecker;
    }
}
