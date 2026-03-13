package io.flutter.embedding.engine.systemchannels;

import android.content.pm.PackageManager;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ProcessTextChannel {
    private static final String CHANNEL_NAME = "flutter/processtext";
    private static final String METHOD_PROCESS_TEXT_ACTION = "ProcessText.processTextAction";
    private static final String METHOD_QUERY_TEXT_ACTIONS = "ProcessText.queryTextActions";
    private static final String TAG = "ProcessTextChannel";
    public final MethodChannel channel;
    public final PackageManager packageManager;
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    private ProcessTextMethodHandler processTextMethodHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ProcessTextMethodHandler {
        void processTextAction(String str, String str2, boolean z10, MethodChannel.Result result);

        Map<String, String> queryTextActions();
    }

    public ProcessTextChannel(DartExecutor dartExecutor, PackageManager packageManager) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (ProcessTextChannel.this.processTextMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                str.getClass();
                if (!str.equals(ProcessTextChannel.METHOD_PROCESS_TEXT_ACTION)) {
                    if (!str.equals(ProcessTextChannel.METHOD_QUERY_TEXT_ACTIONS)) {
                        result.notImplemented();
                        return;
                    }
                    try {
                        result.success(ProcessTextChannel.this.processTextMethodHandler.queryTextActions());
                        return;
                    } catch (IllegalStateException e10) {
                        result.error("error", e10.getMessage(), null);
                        return;
                    }
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ProcessTextChannel.this.processTextMethodHandler.processTextAction((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), result);
                } catch (IllegalStateException e11) {
                    result.error("error", e11.getMessage(), null);
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        this.packageManager = packageManager;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, CHANNEL_NAME, StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setMethodHandler(ProcessTextMethodHandler processTextMethodHandler) {
        this.processTextMethodHandler = processTextMethodHandler;
    }
}
