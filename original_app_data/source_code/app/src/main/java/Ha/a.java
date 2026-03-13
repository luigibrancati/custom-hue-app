package Ha;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.Device;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010 \u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010\u001eJ!\u0010!\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010\u001eJ)\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J)\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010\u001eR\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00101¨\u00063"}, d2 = {"LHa/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "a", "b", "", "asAnotherTask", "e", "(Lio/flutter/plugin/common/MethodChannel$Result;Z)V", "d", "c", "f", "g", "h", "", "url", "i", "(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Z)V", "Landroid/content/Intent;", "intent", "j", "(Landroid/content/Intent;Lio/flutter/plugin/common/MethodChannel$Result;Z)V", "k", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "app_settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(MethodCall call, MethodChannel.Result result) {
        Boolean bool = (Boolean) call.argument("asAnotherTask");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str = (String) call.argument("type");
        if (str != null) {
            switch (str.hashCode()) {
                case -2045253606:
                    if (str.equals("batteryOptimization")) {
                        f(result, zBooleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str.equals("generalSettings")) {
                        i("android.settings.SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case -1770066084:
                    if (str.equals("manageUnknownAppSources")) {
                        i("android.settings.MANAGE_UNKNOWN_APP_SOURCES", result, zBooleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str.equals(Device.TYPE)) {
                        i("android.settings.DEVICE_INFO_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str.equals("wireless")) {
                        i("android.settings.WIRELESS_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str.equals("accessibility")) {
                        i("android.settings.ACCESSIBILITY_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str.equals("dataRoaming")) {
                        i("android.settings.DATA_ROAMING_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str.equals("developer")) {
                        i("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str.equals("apn")) {
                        i("android.settings.APN_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str.equals("nfc")) {
                        i("android.settings.NFC_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str.equals("vpn")) {
                        k(result, zBooleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str.equals("date")) {
                        i("android.settings.DATE_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str.equals("wifi")) {
                        i("android.settings.WIFI_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str.equals("alarm")) {
                        c(result, zBooleanValue);
                        return;
                    }
                    break;
                case 109627663:
                    if (str.equals("sound")) {
                        i("android.settings.SOUND_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str.equals("notification")) {
                        h(result, zBooleanValue);
                        return;
                    }
                    break;
                case 949122880:
                    if (str.equals("security")) {
                        i("android.settings.SECURITY_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str.equals("internalStorage")) {
                        i("android.settings.INTERNAL_STORAGE_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str.equals("hotspot")) {
                        g(result, zBooleanValue);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str.equals("lockAndPassword")) {
                        i("android.app.action.SET_NEW_PASSWORD", result, zBooleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str.equals("appLocale")) {
                        d(result, zBooleanValue);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
                        e(result, zBooleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str.equals("display")) {
                        i("android.settings.DISPLAY_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        i("android.settings.LOCATION_SOURCE_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str.equals("bluetooth")) {
                        i("android.settings.BLUETOOTH_SETTINGS", result, zBooleanValue);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(MethodCall call, MethodChannel.Result result) {
        Activity activity = this.activity;
        if (activity == null) {
            result.success(null);
            return;
        }
        String str = (String) call.argument("type");
        if (str != null) {
            switch (str.hashCode()) {
                case -810883302:
                    if (str.equals("volume")) {
                        activity.startActivity(new Intent("android.settings.panel.action.VOLUME"));
                        result.success(null);
                        return;
                    }
                    break;
                case 108971:
                    if (str.equals("nfc")) {
                        activity.startActivity(new Intent("android.settings.panel.action.NFC"));
                        result.success(null);
                        return;
                    }
                    break;
                case 3649301:
                    if (str.equals("wifi")) {
                        activity.startActivity(new Intent("android.settings.panel.action.WIFI"));
                        result.success(null);
                        return;
                    }
                    break;
                case 21015448:
                    if (str.equals("internetConnectivity")) {
                        activity.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    public final void c(MethodChannel.Result result, boolean asAnotherTask) {
        Activity activity = this.activity;
        Uri uriFromParts = activity != null ? Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity.getPackageName(), null) : null;
        if (uriFromParts == null) {
            result.success(null);
        } else {
            j(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", uriFromParts), result, asAnotherTask);
        }
    }

    public final void d(MethodChannel.Result result, boolean asAnotherTask) {
        if (Build.VERSION.SDK_INT < 33) {
            result.success(null);
            return;
        }
        Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
        if (asAnotherTask) {
            intent.addFlags(268435456);
        }
        Activity activity = this.activity;
        if (activity != null) {
            intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity.getPackageName(), null));
            activity.startActivity(intent);
        }
        result.success(null);
    }

    public final void e(MethodChannel.Result result, boolean asAnotherTask) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (asAnotherTask) {
            intent.addFlags(268435456);
        }
        Activity activity = this.activity;
        if (activity != null) {
            intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, activity.getPackageName(), null));
            activity.startActivity(intent);
        }
        result.success(null);
    }

    public final void f(MethodChannel.Result result, boolean asAnotherTask) {
        i("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", result, asAnotherTask);
    }

    public final void g(MethodChannel.Result result, boolean asAnotherTask) {
        Intent className = new Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings");
        AbstractC4862t.d(className, "setClassName(...)");
        j(className, result, asAnotherTask);
    }

    public final void h(MethodChannel.Result result, boolean asAnotherTask) {
        Activity activity = this.activity;
        if (activity != null) {
            Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            AbstractC4862t.d(intentPutExtra, "putExtra(...)");
            if (asAnotherTask) {
                intentPutExtra.addFlags(268435456);
            }
            activity.startActivity(intentPutExtra);
        }
        result.success(null);
    }

    public final void i(String url, MethodChannel.Result result, boolean asAnotherTask) {
        try {
            Intent intent = new Intent(url);
            if (asAnotherTask) {
                intent.addFlags(268435456);
            }
            Activity activity = this.activity;
            if (activity != null) {
                activity.startActivity(intent);
            }
            result.success(null);
        } catch (Exception unused) {
            e(result, asAnotherTask);
        }
    }

    public final void j(Intent intent, MethodChannel.Result result, boolean asAnotherTask) {
        if (asAnotherTask) {
            try {
                intent.addFlags(268435456);
            } catch (Exception unused) {
                e(result, asAnotherTask);
                return;
            }
        }
        Activity activity = this.activity;
        if (activity != null) {
            activity.startActivity(intent);
        }
        result.success(null);
    }

    public final void k(MethodChannel.Result result, boolean asAnotherTask) {
        i("android.settings.VPN_SETTINGS", result, asAnotherTask);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.spencerccf.app_settings/methods");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
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
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (AbstractC4862t.a(str, "openSettings")) {
            a(call, result);
        } else if (AbstractC4862t.a(str, "openSettingsPanel")) {
            b(call, result);
        } else {
            result.notImplemented();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.activity = binding.getActivity();
    }
}
