package V5;

import U0.h;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodChannel f17264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17265b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17266a;

        public a(String str) {
            this.f17266a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.a(c.this.f17265b.getSystemService(V5.a.a())).setApplicationLocales(LocaleList.forLanguageTags(this.f17266a));
        }
    }

    public final String b() {
        return c(Locale.getDefault());
    }

    public final String c(Locale locale) {
        return locale.toLanguageTag();
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        h hVarD = h.d();
        for (int i10 = 0; i10 < hVarD.g(); i10++) {
            arrayList.add(c(hVarD.c(i10)));
        }
        return arrayList;
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public final boolean f(MethodCall methodCall) {
        new Handler(this.f17265b.getMainLooper()).post(new a((String) methodCall.argument(Device.JsonKeys.LOCALE)));
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17265b = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "uk.spiralarm.flutter/devicelocale");
        this.f17264a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17264a.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "setLanguagePerApp":
                if (Build.VERSION.SDK_INT < 33) {
                    result.success(Boolean.FALSE);
                    break;
                } else {
                    result.success(Boolean.valueOf(f(methodCall)));
                    break;
                }
                break;
            case "isLanguagePerAppSettingSupported":
                result.success(Boolean.valueOf(e()));
                break;
            case "preferredLanguages":
                result.success(d());
                break;
            case "currentLocale":
                result.success(b());
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
