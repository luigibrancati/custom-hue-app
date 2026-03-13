package Da;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LDa/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Landroid/content/Context;", "b", "Landroid/content/Context;", "context", "push_notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Context context;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        this.context = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.signify.push_notifications_plugin");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
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
        Integer numValueOf;
        Resources resources;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (!AbstractC4862t.a(str, "getTranslatedResourceNameWithParams")) {
            if (AbstractC4862t.a(str, "getFormattedTime")) {
                try {
                    Object obj = call.arguments;
                    AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Long");
                    result.success(new SimpleDateFormat(DateFormat.is24HourFormat(this.context) ? "HH:mm" : "h:mm a", Locale.getDefault()).format(new Date(((Long) obj).longValue())));
                    return;
                } catch (Exception e10) {
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    String message2 = e10.getMessage();
                    result.error(message, message2 != null ? message2 : "", null);
                    return;
                }
            }
            return;
        }
        try {
            Object obj2 = call.arguments;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
            Map map = (Map) obj2;
            Object obj3 = map.get("arguments");
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list = (List) obj3;
            Context context = this.context;
            if (context == null || (resources = context.getResources()) == null) {
                numValueOf = null;
            } else {
                String str2 = "android_" + map.get("key");
                Context context2 = this.context;
                AbstractC4862t.b(context2);
                numValueOf = Integer.valueOf(resources.getIdentifier(str2, "string", context2.getPackageName()));
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                Context context3 = this.context;
                String strValueOf = String.valueOf(context3 != null ? context3.getString(iIntValue) : null);
                String[] strArr = (String[]) list.toArray(new String[0]);
                String str3 = String.format(strValueOf, Arrays.copyOf(strArr, strArr.length));
                AbstractC4862t.d(str3, "format(...)");
                result.success(str3);
            }
        } catch (Exception e11) {
            String message3 = e11.getMessage();
            if (message3 == null) {
                message3 = "";
            }
            String message4 = e11.getMessage();
            result.error(message3, message4 != null ? message4 : "", null);
        }
    }
}
