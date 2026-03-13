package io.flutter.plugins.webviewflutter;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugins.webviewflutter.FlutterAssetManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class WebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private ProxyApiRegistrar proxyApiRegistrar;

    public AndroidWebkitLibraryPigeonInstanceManager getInstanceManager() {
        return this.proxyApiRegistrar.getInstanceManager();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        ProxyApiRegistrar proxyApiRegistrar = this.proxyApiRegistrar;
        if (proxyApiRegistrar != null) {
            proxyApiRegistrar.setContext(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        this.proxyApiRegistrar = new ProxyApiRegistrar(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugins.flutter.io/webview", new FlutterViewFactory(this.proxyApiRegistrar.getInstanceManager()));
        this.proxyApiRegistrar.setUp();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.proxyApiRegistrar.setContext(this.pluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.proxyApiRegistrar.setContext(this.pluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ProxyApiRegistrar proxyApiRegistrar = this.proxyApiRegistrar;
        if (proxyApiRegistrar != null) {
            proxyApiRegistrar.tearDown();
            this.proxyApiRegistrar.getInstanceManager().stopFinalizationListener();
            this.proxyApiRegistrar = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.proxyApiRegistrar.setContext(activityPluginBinding.getActivity());
    }
}
