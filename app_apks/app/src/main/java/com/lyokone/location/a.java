package com.lyokone.location;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.lyokone.location.FlutterLocationService;
import ha.g;
import ha.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a implements FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f32429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f32430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FlutterLocationService f32431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityPluginBinding f32432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ServiceConnection f32433e = new ServiceConnectionC0385a();

    /* JADX INFO: renamed from: com.lyokone.location.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class ServiceConnectionC0385a implements ServiceConnection {
        public ServiceConnectionC0385a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("LocationPlugin", "Service connected: " + componentName);
            if (iBinder instanceof FlutterLocationService.LocalBinder) {
                a.this.e(((FlutterLocationService.LocalBinder) iBinder).getF32428a());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("LocationPlugin", "Service disconnected:" + componentName);
        }
    }

    private void d() {
        this.f32430b.a(null);
        this.f32429a.j(null);
        this.f32429a.i(null);
        FlutterLocationService flutterLocationService = this.f32431c;
        if (flutterLocationService != null) {
            this.f32432d.removeRequestPermissionsResultListener(flutterLocationService.h());
            this.f32432d.removeRequestPermissionsResultListener(this.f32431c.g());
            this.f32432d.removeActivityResultListener(this.f32431c.f());
            this.f32431c.k(null);
            this.f32431c = null;
        }
    }

    public final void b(ActivityPluginBinding activityPluginBinding) {
        this.f32432d = activityPluginBinding;
        activityPluginBinding.getActivity().bindService(new Intent(activityPluginBinding.getActivity(), (Class<?>) FlutterLocationService.class), this.f32433e, 1);
    }

    public final void c() {
        d();
        this.f32432d.getActivity().unbindService(this.f32433e);
        this.f32432d = null;
    }

    public final void e(FlutterLocationService flutterLocationService) {
        this.f32431c = flutterLocationService;
        flutterLocationService.k(this.f32432d.getActivity());
        this.f32432d.addActivityResultListener(this.f32431c.f());
        this.f32432d.addRequestPermissionsResultListener(this.f32431c.g());
        this.f32432d.addRequestPermissionsResultListener(this.f32431c.h());
        this.f32429a.i(this.f32431c.getLocation());
        this.f32429a.j(this.f32431c);
        this.f32430b.a(this.f32431c.getLocation());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        g gVar = new g();
        this.f32429a = gVar;
        gVar.k(flutterPluginBinding.getBinaryMessenger());
        i iVar = new i();
        this.f32430b = iVar;
        iVar.b(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        c();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        c();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        g gVar = this.f32429a;
        if (gVar != null) {
            gVar.l();
            this.f32429a = null;
        }
        i iVar = this.f32430b;
        if (iVar != null) {
            iVar.c();
            this.f32430b = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding);
    }
}
