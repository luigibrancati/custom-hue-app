package wa;

import android.content.Context;
import gc.C4204q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lwa/d;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "method", "", "", "args", "a", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lwa/a;", "b", "Lwa/a;", "androidAudioManager", "c", "audio_session_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Map f46486d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public C6180a androidAudioManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f46487e = new ArrayList();

    public final void a(String method, Object... args) {
        for (d dVar : f46487e) {
            List listX0 = C4204q.X0(args);
            MethodChannel methodChannel = dVar.channel;
            AbstractC4862t.b(methodChannel);
            methodChannel.invokeMethod(method, listX0);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.audio_session");
        this.channel = methodChannel;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.androidAudioManager = new C6180a(applicationContext, binaryMessenger);
        f46487e.add(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.channel;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.channel = null;
        C6180a c6180a = this.androidAudioManager;
        AbstractC4862t.b(c6180a);
        c6180a.a();
        this.androidAudioManager = null;
        f46487e.remove(this);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        String str = call.method;
        if (!AbstractC4862t.a(str, "setConfiguration")) {
            if (AbstractC4862t.a(str, "getConfiguration")) {
                result.success(f46486d);
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        f46486d = (Map) list.get(0);
        result.success(null);
        Map map = f46486d;
        AbstractC4862t.b(map);
        a("onConfigurationChanged", map);
    }
}
