package P4;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f13114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodChannel f13115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActivityPluginBinding f13116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f13117d;

    private void e() {
        this.f13115b.setMethodCallHandler(null);
        this.f13115b = null;
        this.f13117d = null;
    }

    public final void a() {
        ActivityPluginBinding activityPluginBinding = this.f13116c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f13114a);
            this.f13116c.removeRequestPermissionsResultListener(this.f13114a);
        }
    }

    public final void b() {
        ActivityPluginBinding activityPluginBinding = this.f13116c;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f13114a);
            this.f13116c.addRequestPermissionsResultListener(this.f13114a);
        }
    }

    public final void c(Context context, BinaryMessenger binaryMessenger) {
        this.f13115b = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f13114a, new p());
        this.f13117d = lVar;
        this.f13115b.setMethodCallHandler(lVar);
    }

    public final void d(Activity activity) {
        n nVar = this.f13114a;
        if (nVar != null) {
            nVar.h(activity);
        }
    }

    public final void f() {
        n nVar = this.f13114a;
        if (nVar != null) {
            nVar.h(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        d(activityPluginBinding.getActivity());
        this.f13116c = activityPluginBinding;
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13114a = new n(flutterPluginBinding.getApplicationContext());
        c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        f();
        a();
        this.f13116c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
