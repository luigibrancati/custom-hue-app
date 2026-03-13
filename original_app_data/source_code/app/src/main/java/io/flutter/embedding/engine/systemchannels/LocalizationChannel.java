package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";
    public final MethodChannel channel;
    public final MethodChannel.MethodCallHandler handler;
    private LocalizationMessageHandler localizationMessageHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface LocalizationMessageHandler {
        String getStringResource(String str, String str2);
    }

    public LocalizationChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (LocalizationChannel.this.localizationMessageHandler == null) {
                    return;
                }
                String str = methodCall.method;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    result.notImplemented();
                    return;
                }
                JSONObject jSONObject = (JSONObject) methodCall.arguments();
                try {
                    result.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(jSONObject.getString("key"), jSONObject.has(Device.JsonKeys.LOCALE) ? jSONObject.getString(Device.JsonKeys.LOCALE) : null));
                } catch (JSONException e10) {
                    result.error("error", e10.getMessage(), null);
                }
            }
        };
        this.handler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void sendLocales(List<Locale> list) {
        Log.v(TAG, "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            Log.v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.channel.invokeMethod("setLocale", arrayList);
    }

    public void setLocalizationMessageHandler(LocalizationMessageHandler localizationMessageHandler) {
        this.localizationMessageHandler = localizationMessageHandler;
    }
}
