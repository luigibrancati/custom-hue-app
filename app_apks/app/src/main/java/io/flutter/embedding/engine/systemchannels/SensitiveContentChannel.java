package io.flutter.embedding.engine.systemchannels;

import android.annotation.SuppressLint;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SensitiveContentChannel {
    public static final int AUTO_SENSITIVE_CONTENT_SENSITIVITY = 0;
    public static final int NOT_SENSITIVE_CONTENT_SENSITIVITY = 2;
    public static final int SENSITIVE_CONTENT_SENSITIVITY = 1;
    private static final String TAG = "SensitiveContentChannel";
    public static final int UNKNOWN_CONTENT_SENSITIVITY = 3;
    public final MethodChannel channel;
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    private SensitiveContentMethodHandler sensitiveContentMethodHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SensitiveContentMethodHandler {
        int getContentSensitivity();

        boolean isSupported();

        void setContentSensitivity(int i10);
    }

    public SensitiveContentChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                String str;
                if (SensitiveContentChannel.this.sensitiveContentMethodHandler == null) {
                    return;
                }
                str = methodCall.method;
                Log.v(SensitiveContentChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                switch (str) {
                    case "SensitiveContent.getContentSensitivity":
                        try {
                            result.success(Integer.valueOf(SensitiveContentChannel.this.serializeContentSensitivity(SensitiveContentChannel.this.sensitiveContentMethodHandler.getContentSensitivity())));
                            break;
                        } catch (IllegalArgumentException | IllegalStateException e10) {
                            result.error("error", e10.getMessage(), null);
                            return;
                        }
                        break;
                    case "SensitiveContent.setContentSensitivity":
                        try {
                            SensitiveContentChannel.this.sensitiveContentMethodHandler.setContentSensitivity(SensitiveContentChannel.this.deserializeContentSensitivity(((Integer) methodCall.arguments()).intValue()));
                            break;
                        } catch (IllegalArgumentException | IllegalStateException e11) {
                            result.error("error", e11.getMessage(), null);
                            return;
                        }
                        break;
                    case "SensitiveContent.isSupported":
                        result.success(Boolean.valueOf(SensitiveContentChannel.this.sensitiveContentMethodHandler.isSupported()));
                        break;
                    default:
                        Log.v(SensitiveContentChannel.TAG, "Method " + str + " is not implemented for the SensitiveContentChannel.");
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/sensitivecontent", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public int deserializeContentSensitivity(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i10 + " not known to the SensitiveContentChannel.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public int serializeContentSensitivity(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != 1) {
            return i10 != 2 ? 3 : 2;
        }
        return 1;
    }

    public void setSensitiveContentMethodHandler(SensitiveContentMethodHandler sensitiveContentMethodHandler) {
        this.sensitiveContentMethodHandler = sensitiveContentMethodHandler;
    }
}
