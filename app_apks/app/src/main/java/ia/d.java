package ia;

import Od.F;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u0002 \u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J/\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\b\u0018\u00010/R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lia/d;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lfc/H;", "b", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "rawResult", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/app/Application;", "application", "Landroid/app/Activity;", "activity", "activityBinding", "a", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/app/Application;Landroid/app/Activity;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "Lia/c;", "Lia/c;", "delegate", "c", "Landroid/app/Application;", "d", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "pluginBinding", "Landroidx/lifecycle/j;", "e", "Landroidx/lifecycle/j;", "lifecycle", "Lia/d$b;", "f", "Lia/d$b;", "observer", "g", "Landroid/app/Activity;", "Lio/flutter/plugin/common/MethodChannel;", "h", "Lio/flutter/plugin/common/MethodChannel;", "channel", "i", "file_picker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ActivityPluginBinding activityBinding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ia.c delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Application application;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public FlutterPlugin.FlutterPluginBinding pluginBinding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public AbstractC2754j lifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public b observer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: ia.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final String b(String str) {
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        return "*/*";
                    }
                    return null;
                case 96748:
                    if (str.equals("any")) {
                        return "*/*";
                    }
                    return null;
                case 99469:
                    if (str.equals("dir")) {
                        return "dir";
                    }
                    return null;
                case 93166550:
                    if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        return "audio/*";
                    }
                    return null;
                case 100313435:
                    if (str.equals("image")) {
                        return "image/*";
                    }
                    return null;
                case 103772132:
                    if (str.equals("media")) {
                        return "image/*,video/*";
                    }
                    return null;
                case 112202875:
                    if (str.equals("video")) {
                        return "video/*";
                    }
                    return null;
                default:
                    return null;
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f37356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f37357b;

        public b(d dVar, Activity thisActivity) {
            AbstractC4862t.e(thisActivity, "thisActivity");
            this.f37357b = dVar;
            this.f37356a = thisActivity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC4862t.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC4862t.e(activity, "activity");
            if (this.f37356a != activity || activity.getApplicationContext() == null) {
                return;
            }
            Context applicationContext = activity.getApplicationContext();
            AbstractC4862t.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC4862t.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC4862t.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC4862t.e(activity, "activity");
            AbstractC4862t.e(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC4862t.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC4862t.e(activity, "activity");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            onActivityDestroyed(this.f37356a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC2758n owner) {
            AbstractC4862t.e(owner, "owner");
            onActivityStopped(this.f37356a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements EventChannel.StreamHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ia.c f37358a;

        public c(ia.c cVar) {
            this.f37358a = cVar;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            this.f37358a.s(null);
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            this.f37358a.s(eventSink);
        }
    }

    private final void b() {
        ActivityPluginBinding activityPluginBinding;
        ia.c cVar = this.delegate;
        if (cVar != null && (activityPluginBinding = this.activityBinding) != null) {
            activityPluginBinding.removeActivityResultListener(cVar);
        }
        this.activityBinding = null;
        b bVar = this.observer;
        if (bVar != null) {
            AbstractC2754j abstractC2754j = this.lifecycle;
            if (abstractC2754j != null) {
                abstractC2754j.c(bVar);
            }
            Application application = this.application;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(bVar);
            }
        }
        this.lifecycle = null;
        ia.c cVar2 = this.delegate;
        if (cVar2 != null) {
            cVar2.s(null);
        }
        this.delegate = null;
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.channel = null;
        this.application = null;
    }

    public final void a(BinaryMessenger messenger, Application application, Activity activity, ActivityPluginBinding activityBinding) {
        this.activity = activity;
        this.application = application;
        this.delegate = new ia.c(activity, null, 2, null);
        MethodChannel methodChannel = new MethodChannel(messenger, "miguelruivo.flutter.plugins.filepicker");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        ia.c cVar = this.delegate;
        if (cVar != null) {
            new EventChannel(messenger, "miguelruivo.flutter.plugins.filepickerevent").setStreamHandler(new c(cVar));
            this.observer = new b(this, activity);
            activityBinding.addActivityResultListener(cVar);
            AbstractC2754j activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityBinding);
            this.lifecycle = activityLifecycle;
            b bVar = this.observer;
            if (bVar == null || activityLifecycle == null) {
                return;
            }
            activityLifecycle.a(bVar);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activityBinding = binding;
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.pluginBinding;
        if (flutterPluginBinding != null) {
            BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
            AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
            Context applicationContext = flutterPluginBinding.getApplicationContext();
            AbstractC4862t.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ActivityPluginBinding activityPluginBinding = this.activityBinding;
            AbstractC4862t.b(activityPluginBinding);
            Activity activity = activityPluginBinding.getActivity();
            AbstractC4862t.d(activity, "getActivity(...)");
            ActivityPluginBinding activityPluginBinding2 = this.activityBinding;
            AbstractC4862t.b(activityPluginBinding2);
            a(binaryMessenger, (Application) applicationContext, activity, activityPluginBinding2);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.pluginBinding = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.pluginBinding = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result rawResult) {
        Context applicationContext;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(rawResult, "rawResult");
        if (this.activity == null) {
            rawResult.error("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        i iVar = new i(rawResult);
        Object obj = call.arguments;
        HashMap map = obj instanceof HashMap ? (HashMap) obj : null;
        String str = call.method;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1349088399) {
                if (iHashCode != 3522941) {
                    if (iHashCode == 94746189 && str.equals("clear")) {
                        Activity activity = this.activity;
                        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                            objValueOf = Boolean.valueOf(e.f(applicationContext));
                        }
                        iVar.success(objValueOf);
                        return;
                    }
                } else if (str.equals("save")) {
                    Companion companion = INSTANCE;
                    Object obj2 = map != null ? map.get("fileType") : null;
                    AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    String strB = companion.b((String) obj2);
                    String str2 = (String) (map != null ? map.get("initialDirectory") : null);
                    byte[] bArr = (byte[]) (map != null ? map.get("bytes") : null);
                    String strValueOf = String.valueOf(map != null ? map.get("fileName") : null);
                    if (strValueOf.length() > 0 && !F.V(strValueOf, ".", false, 2, null)) {
                        strValueOf = strValueOf + "." + e.f37359a.m(bArr);
                    }
                    String str3 = strValueOf;
                    ia.c cVar = this.delegate;
                    if (cVar != null) {
                        e.f37359a.A(cVar, str3, strB, str2, bArr, iVar);
                        return;
                    }
                    return;
                }
            } else if (str.equals("custom")) {
                e eVar = e.f37359a;
                ArrayList arrayListQ = eVar.q((ArrayList) (map != null ? map.get("allowedExtensions") : null));
                ia.c cVar2 = this.delegate;
                if (cVar2 != null) {
                    eVar.C(cVar2, INSTANCE.b(str), (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), arrayListQ, (Integer) (map != null ? map.get("compressionQuality") : null), iVar);
                    return;
                }
                return;
            }
        }
        Companion companion2 = INSTANCE;
        AbstractC4862t.b(str);
        String strB2 = companion2.b(str);
        if (strB2 == null) {
            iVar.notImplemented();
            return;
        }
        ia.c cVar3 = this.delegate;
        if (cVar3 != null) {
            e eVar2 = e.f37359a;
            eVar2.C(cVar3, strB2, (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), eVar2.q((ArrayList) (map != null ? map.get("allowedExtensions") : null)), (Integer) (map != null ? map.get("compressionQuality") : null), iVar);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
