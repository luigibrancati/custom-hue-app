package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ScribeChannel {
    public static final String METHOD_IS_FEATURE_AVAILABLE = "Scribe.isFeatureAvailable";
    public static final String METHOD_IS_STYLUS_HANDWRITING_AVAILABLE = "Scribe.isStylusHandwritingAvailable";
    public static final String METHOD_START_STYLUS_HANDWRITING = "Scribe.startStylusHandwriting";
    private static final String TAG = "ScribeChannel";
    public final MethodChannel channel;
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    private ScribeMethodHandler scribeMethodHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ScribeMethodHandler {
        boolean isFeatureAvailable();

        boolean isStylusHandwritingAvailable();

        void startStylusHandwriting();
    }

    public ScribeChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ScribeChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (ScribeChannel.this.scribeMethodHandler == null) {
                    Log.v(ScribeChannel.TAG, "No ScribeMethodHandler registered. Scribe call not handled.");
                }
                String str = methodCall.method;
                Log.v(ScribeChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                switch (str) {
                    case "Scribe.isFeatureAvailable":
                        ScribeChannel.this.isFeatureAvailable(methodCall, result);
                        break;
                    case "Scribe.startStylusHandwriting":
                        ScribeChannel.this.startStylusHandwriting(methodCall, result);
                        break;
                    case "Scribe.isStylusHandwritingAvailable":
                        ScribeChannel.this.isStylusHandwritingAvailable(methodCall, result);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/scribe", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isFeatureAvailable(MethodCall methodCall, MethodChannel.Result result) {
        try {
            result.success(Boolean.valueOf(this.scribeMethodHandler.isFeatureAvailable()));
        } catch (IllegalStateException e10) {
            result.error("error", e10.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isStylusHandwritingAvailable(MethodCall methodCall, MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT < 34) {
            result.error("error", "Requires API level 34 or higher.", null);
            return;
        }
        try {
            result.success(Boolean.valueOf(this.scribeMethodHandler.isStylusHandwritingAvailable()));
        } catch (IllegalStateException e10) {
            result.error("error", e10.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startStylusHandwriting(MethodCall methodCall, MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT < 33) {
            result.error("error", "Requires API level 33 or higher.", null);
            return;
        }
        try {
            this.scribeMethodHandler.startStylusHandwriting();
            result.success(null);
        } catch (IllegalStateException e10) {
            result.error("error", e10.getMessage(), null);
        }
    }

    public void setScribeMethodHandler(ScribeMethodHandler scribeMethodHandler) {
        this.scribeMethodHandler = scribeMethodHandler;
    }
}
