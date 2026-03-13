package ya;

import fc.C4015H;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J#\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lya/f;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivity", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "c", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "channel", "b", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "activityBinding", "genesis_authentication_plugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ActivityPluginBinding activityBinding;

    public static final C4015H d(MethodChannel.Result result, String code) {
        AbstractC4862t.e(code, "code");
        result.success(code);
        return C4015H.f34254a;
    }

    public static final C4015H e(MethodChannel.Result result, String errorMessage) {
        AbstractC4862t.e(errorMessage, "errorMessage");
        result.error("401", errorMessage, null);
        return C4015H.f34254a;
    }

    public final void c(MethodCall call, final MethodChannel.Result result) {
        String str = (String) call.argument("clientId");
        String str2 = (String) call.argument("callbackUrl");
        String str3 = (String) call.argument("scope");
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            result.error("400", "Not all required parameters are provided to start the authentication request", null);
        } else {
            if (this.activityBinding == null) {
                throw new IllegalStateException();
            }
            c cVar = new c(str, str2, str3);
            ActivityPluginBinding activityPluginBinding = this.activityBinding;
            AbstractC4862t.b(activityPluginBinding);
            new C6457b(activityPluginBinding).b(cVar, new l() { // from class: ya.d
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return f.d(result, (String) obj);
                }
            }, new l() { // from class: ya.e
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return f.e(result, (String) obj);
                }
            });
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activityBinding = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.signify.genesis");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activityBinding = null;
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
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        if (AbstractC4862t.a(call.method, "getAuthenticationCode")) {
            c(call, result);
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }
}
