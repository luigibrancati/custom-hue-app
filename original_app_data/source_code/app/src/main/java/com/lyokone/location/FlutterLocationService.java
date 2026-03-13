package com.lyokone.location;

import android.app.Activity;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import fc.AbstractC4040w;
import gc.Q;
import ha.C4293a;
import ha.f;
import ha.h;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.protocol.App;
import io.sentry.protocol.FeatureFlag;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002\u001bIB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0004J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0004J#\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J/\u0010'\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0011R\u0018\u0010,\u001a\u00060*R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00101R(\u00108\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0013\u0010C\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b:\u0010BR\u0013\u0010F\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010E¨\u0006J"}, d2 = {"Lcom/lyokone/location/FlutterLocationService;", "Landroid/app/Service;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "<init>", "()V", "Lfc/H;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "onUnbind", "(Landroid/content/Intent;)Z", "onDestroy", "b", "()Z", "j", "i", "d", "c", "Lha/h;", RRWebOptionsEvent.EVENT_TAG, "", "", "", "a", "(Lha/h;)Ljava/util/Map;", "Landroid/app/Activity;", "activity", "k", "(Landroid/app/Activity;)V", "", "requestCode", "", App.JsonKeys.APP_PERMISSIONS, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "m", "Lcom/lyokone/location/FlutterLocationService$LocalBinder;", "Lcom/lyokone/location/FlutterLocationService$LocalBinder;", "binder", "Z", "isForeground", "Landroid/app/Activity;", "Lha/a;", "Lha/a;", "backgroundNotification", "Lha/f;", "value", "e", "Lha/f;", "()Lha/f;", "location", "Lio/flutter/plugin/common/MethodChannel$Result;", "f", "Lio/flutter/plugin/common/MethodChannel$Result;", "getResult", "()Lio/flutter/plugin/common/MethodChannel$Result;", "l", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", FeatureFlag.JsonKeys.RESULT, "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "()Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "locationActivityResultListener", "g", "()Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "locationRequestPermissionsResultListener", "h", "serviceRequestPermissionsResultListener", "LocalBinder", "location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlutterLocationService extends Service implements PluginRegistry.RequestPermissionsResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final LocalBinder binder = new LocalBinder();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isForeground;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public C4293a backgroundNotification;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public f location;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public MethodChannel.Result result;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/lyokone/location/FlutterLocationService$LocalBinder;", "Landroid/os/Binder;", "<init>", "(Lcom/lyokone/location/FlutterLocationService;)V", "Lcom/lyokone/location/FlutterLocationService;", "a", "()Lcom/lyokone/location/FlutterLocationService;", "location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FlutterLocationService getF32428a() {
            return FlutterLocationService.this;
        }
    }

    public final Map a(h options) {
        AbstractC4862t.e(options, "options");
        C4293a c4293a = this.backgroundNotification;
        if (c4293a != null) {
            c4293a.f(options, this.isForeground);
        }
        if (this.isForeground) {
            return Q.l(AbstractC4040w.a("channelId", "flutter_location_channel_01"), AbstractC4040w.a("notificationId", 75418));
        }
        return null;
    }

    public final boolean b() {
        Activity activity = this.activity;
        if (activity != null) {
            return L0.a.a(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
        }
        throw new ActivityNotFoundException();
    }

    public final void c() {
        Log.d("FlutterLocationService", "Stop service in foreground.");
        stopForeground(1);
        this.isForeground = false;
    }

    public final void d() {
        if (this.isForeground) {
            Log.d("FlutterLocationService", "Service already in foreground mode.");
            return;
        }
        Log.d("FlutterLocationService", "Start service in foreground mode.");
        C4293a c4293a = this.backgroundNotification;
        AbstractC4862t.b(c4293a);
        startForeground(75418, c4293a.a());
        this.isForeground = true;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getLocation() {
        return this.location;
    }

    public final PluginRegistry.ActivityResultListener f() {
        return this.location;
    }

    public final PluginRegistry.RequestPermissionsResultListener g() {
        return this.location;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsForeground() {
        return this.isForeground;
    }

    public final void j() {
        Activity activity = this.activity;
        if (activity == null) {
            throw new ActivityNotFoundException();
        }
        androidx.core.app.a.v(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 641);
    }

    public final void k(Activity activity) {
        this.activity = activity;
        f fVar = this.location;
        if (fVar != null) {
            fVar.p(activity);
        }
    }

    public final void l(MethodChannel.Result result) {
        this.result = result;
    }

    public final boolean m() {
        Activity activity = this.activity;
        if (activity != null) {
            return androidx.core.app.a.y(activity, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        throw new ActivityNotFoundException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d("FlutterLocationService", "Binding to location service.");
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d("FlutterLocationService", "Creating service.");
        this.location = new f(getApplicationContext(), null);
        Context applicationContext = getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.backgroundNotification = new C4293a(applicationContext, "flutter_location_channel_01", 75418);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d("FlutterLocationService", "Destroying service.");
        this.location = null;
        this.backgroundNotification = null;
        super.onDestroy();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(grantResults, "grantResults");
        if (requestCode == 641 && permissions.length == 2 && AbstractC4862t.a(permissions[0], "android.permission.ACCESS_FINE_LOCATION") && AbstractC4862t.a(permissions[1], "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (grantResults[0] == 0 && grantResults[1] == 0) {
                d();
                MethodChannel.Result result = this.result;
                if (result != null) {
                    result.success(1);
                }
                this.result = null;
            } else {
                if (m()) {
                    MethodChannel.Result result2 = this.result;
                    if (result2 != null) {
                        result2.error("PERMISSION_DENIED", "Background location permission denied", null);
                    }
                } else {
                    MethodChannel.Result result3 = this.result;
                    if (result3 != null) {
                        result3.error("PERMISSION_DENIED_NEVER_ASK", "Background location permission denied forever - please open app settings", null);
                    }
                }
                this.result = null;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d("FlutterLocationService", "Unbinding from location service.");
        return super.onUnbind(intent);
    }

    public final PluginRegistry.RequestPermissionsResultListener h() {
        return this;
    }
}
