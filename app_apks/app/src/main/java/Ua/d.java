package Ua;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import w7.AbstractC6159b;
import w7.AbstractC6161d;
import w7.InterfaceC6160c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u0006/"}, d2 = {"LUa/d;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "d", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "i", "h", "", "f", "(Lio/flutter/plugin/common/MethodChannel$Result;)Z", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Landroid/content/Context;", "b", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "c", "Landroid/app/Activity;", "activity", "", "Ljava/lang/String;", "TAG", "in_app_review_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String TAG = "InAppReviewPlugin";

    public static final void e(MethodChannel.Result result, Task task) {
        AbstractC4862t.e(task, "task");
        if (task.q()) {
            result.success(Boolean.TRUE);
        } else {
            result.success(Boolean.FALSE);
        }
    }

    public static /* synthetic */ boolean g(d dVar, MethodChannel.Result result, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result = null;
        }
        return dVar.f(result);
    }

    public static final void j(d dVar, InterfaceC6160c interfaceC6160c, final MethodChannel.Result result, Task task) {
        AbstractC4862t.e(task, "task");
        if (!task.q()) {
            Log.w(dVar.TAG, "onComplete: Unsuccessfully requested review flow");
            result.error("error", "In-App Review API unavailable", null);
            return;
        }
        Log.i(dVar.TAG, "onComplete: Successfully requested review flow");
        AbstractC6159b abstractC6159b = (AbstractC6159b) task.m();
        Activity activity = dVar.activity;
        AbstractC4862t.b(activity);
        Task taskA = interfaceC6160c.a(activity, abstractC6159b);
        AbstractC4862t.d(taskA, "launchReviewFlow(...)");
        taskA.b(new InterfaceC2872f() { // from class: Ua.c
            @Override // b7.InterfaceC2872f
            public final void a(Task task2) {
                d.k(result, task2);
            }
        });
    }

    public static final void k(MethodChannel.Result result, Task it) {
        AbstractC4862t.e(it, "it");
        result.success(null);
    }

    public final void d(final MethodChannel.Result result) {
        Log.i(this.TAG, "isAvailable: called");
        if (g(this, null, 1, null)) {
            result.success(Boolean.FALSE);
            return;
        }
        try {
            Context context = this.context;
            AbstractC4862t.b(context);
            InterfaceC6160c interfaceC6160cA = AbstractC6161d.a(context);
            AbstractC4862t.d(interfaceC6160cA, "create(...)");
            Task taskB = interfaceC6160cA.b();
            AbstractC4862t.d(taskB, "requestReviewFlow(...)");
            AbstractC4862t.b(taskB.b(new InterfaceC2872f() { // from class: Ua.b
                @Override // b7.InterfaceC2872f
                public final void a(Task task) {
                    d.e(result, task);
                }
            }));
        } catch (Exception e10) {
            Log.e(this.TAG, "isAvailable: error", e10);
            result.success(Boolean.FALSE);
        }
    }

    public final boolean f(MethodChannel.Result result) {
        Log.i(this.TAG, "noContextOrActivity: called");
        if (this.context == null) {
            Log.e(this.TAG, "noContextOrActivity: Android context not available");
            if (result != null) {
                result.error("error", "Android context not available", null);
            }
            return true;
        }
        if (this.activity != null) {
            return false;
        }
        Log.e(this.TAG, "noContextOrActivity: Android activity not available");
        if (result != null) {
            result.error("error", "Android activity not available", null);
        }
        return true;
    }

    public final void h(MethodChannel.Result result) {
        Log.i(this.TAG, "openStoreListing: called");
        if (f(result)) {
            return;
        }
        try {
            Context context = this.context;
            AbstractC4862t.b(context);
            String packageName = context.getPackageName();
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
            AbstractC4862t.d(data, "setData(...)");
            Activity activity = this.activity;
            AbstractC4862t.b(activity);
            activity.startActivity(data);
            result.success(null);
        } catch (Exception e10) {
            Log.e(this.TAG, "openStoreListing: error", e10);
            result.error("error", "An error occurred while opening the play store", null);
        }
    }

    public final void i(final MethodChannel.Result result) {
        Log.i(this.TAG, "requestReview: called");
        if (f(result)) {
            return;
        }
        try {
            Context context = this.context;
            AbstractC4862t.b(context);
            final InterfaceC6160c interfaceC6160cA = AbstractC6161d.a(context);
            AbstractC4862t.d(interfaceC6160cA, "create(...)");
            Task taskB = interfaceC6160cA.b();
            AbstractC4862t.d(taskB, "requestReviewFlow(...)");
            AbstractC4862t.b(taskB.b(new InterfaceC2872f() { // from class: Ua.a
                @Override // b7.InterfaceC2872f
                public final void a(Task task) {
                    d.j(this.f16806a, interfaceC6160cA, result, task);
                }
            }));
        } catch (Exception e10) {
            Log.e(this.TAG, "requestReview: error", e10);
            result.error("error", "An error occurred during the request review flow", null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.britannio.in_app_review");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.context = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
        this.context = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        Log.i(this.TAG, "onMethodCall: " + call.method);
        String str = call.method;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 159262157) {
                if (iHashCode != 444517567) {
                    if (iHashCode == 1361080007 && str.equals("requestReview")) {
                        i(result);
                        return;
                    }
                } else if (str.equals("isAvailable")) {
                    d(result);
                    return;
                }
            } else if (str.equals("openStoreListing")) {
                h(result);
                return;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = binding.getActivity();
    }
}
