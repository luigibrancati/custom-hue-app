package xa;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.OrientationEventListener;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: xa.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u00101R\u0016\u00105\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lxa/b;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "onListen", "(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V", "onCancel", "(Ljava/lang/Object;)V", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "", "d", "()Z", "c", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "Lio/flutter/plugin/common/EventChannel;", "Lio/flutter/plugin/common/EventChannel;", "eventChannel", "e", "La;", "autoRotationSettingObserver", "Landroid/view/OrientationEventListener;", "f", "Landroid/view/OrientationEventListener;", "orientationEventListener", "Landroid/os/Handler;", "g", "Landroid/os/Handler;", "handler", "device_orientation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C6353b implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel methodChannel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Context applicationContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public EventChannel eventChannel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public defpackage.a autoRotationSettingObserver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public OrientationEventListener orientationEventListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Handler handler;

    /* JADX INFO: renamed from: xa.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends OrientationEventListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EventChannel.EventSink f48099b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EventChannel.EventSink eventSink, Activity activity) {
            super(activity);
            this.f48099b = eventSink;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            Activity activity = C6353b.this.activity;
            AbstractC4862t.b(activity);
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            if (rotation == 0) {
                this.f48099b.success(0);
                return;
            }
            if (rotation == 1) {
                this.f48099b.success(3);
            } else if (rotation == 2) {
                this.f48099b.success(2);
            } else {
                if (rotation != 3) {
                    return;
                }
                this.f48099b.success(1);
            }
        }
    }

    public static final boolean e(C6353b c6353b) {
        return c6353b.c();
    }

    public final boolean c() {
        Activity activity = this.activity;
        return Settings.System.getInt(activity != null ? activity.getContentResolver() : null, "accelerometer_rotation", 0) == 1;
    }

    public final boolean d() {
        Resources resources;
        Activity activity = this.activity;
        if (activity == null || (resources = activity.getResources()) == null) {
            return false;
        }
        return resources.getBoolean(AbstractC6354c.f48100a);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.applicationContext = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "com.signify.device_orientation");
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(binding.getBinaryMessenger(), "com.signify.device_orientation.events");
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
        this.handler = new Handler(Looper.getMainLooper());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object arguments) {
        ContentResolver contentResolver;
        defpackage.a aVar = null;
        if (!AbstractC4862t.a(arguments, "auto_rotation")) {
            if (AbstractC4862t.a(arguments, "display_orientation")) {
                OrientationEventListener orientationEventListener = this.orientationEventListener;
                if (orientationEventListener != null) {
                    orientationEventListener.disable();
                }
                this.orientationEventListener = null;
                return;
            }
            return;
        }
        Context context = this.applicationContext;
        if (context == null || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        defpackage.a aVar2 = this.autoRotationSettingObserver;
        if (aVar2 == null) {
            AbstractC4862t.p("autoRotationSettingObserver");
        } else {
            aVar = aVar2;
        }
        contentResolver.unregisterContentObserver(aVar);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.methodChannel;
        if (methodChannel == null) {
            AbstractC4862t.p("methodChannel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        EventChannel eventChannel = this.eventChannel;
        if (eventChannel == null) {
            AbstractC4862t.p("eventChannel");
            eventChannel = null;
        }
        eventChannel.setStreamHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arguments, EventChannel.EventSink events) {
        ContentResolver contentResolver;
        AbstractC4862t.e(events, "events");
        defpackage.a aVar = null;
        if (!AbstractC4862t.a(arguments, "auto_rotation")) {
            if (AbstractC4862t.a(arguments, "display_orientation")) {
                Activity activity = this.activity;
                if (activity == null) {
                    events.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                    return;
                }
                a aVar2 = new a(events, activity);
                this.orientationEventListener = aVar2;
                aVar2.enable();
                return;
            }
            return;
        }
        Handler handler = this.handler;
        if (handler == null) {
            AbstractC4862t.p("handler");
            handler = null;
        }
        this.autoRotationSettingObserver = new defpackage.a(handler, events, new InterfaceC6082a() { // from class: xa.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(C6353b.e(this.f48090a));
            }
        });
        Context context = this.applicationContext;
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            Uri uriFor = Settings.System.getUriFor("accelerometer_rotation");
            defpackage.a aVar3 = this.autoRotationSettingObserver;
            if (aVar3 == null) {
                AbstractC4862t.p("autoRotationSettingObserver");
            } else {
                aVar = aVar3;
            }
            contentResolver.registerContentObserver(uriFor, false, aVar);
        }
        events.success(Boolean.valueOf(c()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1286937961:
                    if (str.equals("getCurrentDeviceOrientation")) {
                        Activity activity = this.activity;
                        if (activity == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        } else {
                            AbstractC4862t.b(activity);
                            result.success(Integer.valueOf(activity.getRequestedOrientation()));
                            return;
                        }
                    }
                    break;
                case -1131799367:
                    if (str.equals("setOrientationToLandscapeLeft")) {
                        Activity activity2 = this.activity;
                        if (activity2 == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        AbstractC4862t.b(activity2);
                        activity2.setRequestedOrientation(0);
                        result.success(null);
                        return;
                    }
                    break;
                case -720381014:
                    if (str.equals("setOrientationToLandscapeRight")) {
                        Activity activity3 = this.activity;
                        if (activity3 == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        AbstractC4862t.b(activity3);
                        activity3.setRequestedOrientation(8);
                        result.success(null);
                        return;
                    }
                    break;
                case -707452526:
                    if (str.equals("setOrientationToLandscape")) {
                        Activity activity4 = this.activity;
                        if (activity4 == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        AbstractC4862t.b(activity4);
                        activity4.setRequestedOrientation(11);
                        result.success(null);
                        return;
                    }
                    break;
                case -248645974:
                    if (str.equals("isAutoRotationEnabled")) {
                        result.success(Boolean.valueOf(c()));
                        return;
                    }
                    break;
                case -207343568:
                    if (str.equals("isTablet")) {
                        result.success(Boolean.valueOf(d()));
                        return;
                    }
                    break;
                case 174056017:
                    if (str.equals("getCurrentDisplayOrientation")) {
                        Activity activity5 = this.activity;
                        if (activity5 == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        AbstractC4862t.b(activity5);
                        int rotation = activity5.getWindowManager().getDefaultDisplay().getRotation();
                        if (rotation == 0) {
                            result.success(0);
                            return;
                        }
                        if (rotation == 1) {
                            result.success(3);
                            return;
                        } else if (rotation == 2) {
                            result.success(2);
                            return;
                        } else {
                            if (rotation != 3) {
                                return;
                            }
                            result.success(1);
                            return;
                        }
                    }
                    break;
                case 443461646:
                    if (str.equals("setOrientation")) {
                        if (this.activity == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        Integer num = (Integer) call.argument("orientation_id");
                        if (num != null) {
                            Activity activity6 = this.activity;
                            AbstractC4862t.b(activity6);
                            activity6.setRequestedOrientation(num.intValue());
                            result.success(null);
                            return;
                        }
                        result.error("orientation_id_not_found", "The value for the given orientation_id of " + num + " of is not found, which is needed for `setOrientation`", null);
                        return;
                    }
                    break;
                case 596855788:
                    if (str.equals("unlockOrientation")) {
                        Activity activity7 = this.activity;
                        if (activity7 == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        AbstractC4862t.b(activity7);
                        activity7.setRequestedOrientation(-1);
                        result.success(null);
                        return;
                    }
                    break;
                case 711994443:
                    if (str.equals("setOrientationToPortraitOnPhone")) {
                        if (this.activity == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        if (!d()) {
                            Activity activity8 = this.activity;
                            AbstractC4862t.b(activity8);
                            activity8.setRequestedOrientation(12);
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1768674788:
                    if (str.equals("setOrientationToPortrait")) {
                        Activity activity9 = this.activity;
                        if (activity9 == null) {
                            result.error("activity_not_set", "Activity is not set, make sure to call this method only from a foreground UI process.", null);
                            return;
                        }
                        AbstractC4862t.b(activity9);
                        activity9.setRequestedOrientation(12);
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }
}
