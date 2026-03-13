package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class RestorationChannel {
    private static final String TAG = "RestorationChannel";
    private MethodChannel channel;
    private boolean engineHasProvidedData;
    private boolean frameworkHasRequestedData;
    private final MethodChannel.MethodCallHandler handler;
    private MethodChannel.Result pendingFrameworkRestorationChannelRequest;
    private byte[] restorationData;
    public final boolean waitForRestorationData;

    public RestorationChannel(DartExecutor dartExecutor, boolean z10) {
        this(new MethodChannel(dartExecutor, "flutter/restoration", StandardMethodCodec.INSTANCE), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> packageData(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void clearData() {
        this.restorationData = null;
    }

    public byte[] getRestorationData() {
        return this.restorationData;
    }

    public void setRestorationData(final byte[] bArr) {
        this.engineHasProvidedData = true;
        MethodChannel.Result result = this.pendingFrameworkRestorationChannelRequest;
        if (result != null) {
            result.success(packageData(bArr));
            this.pendingFrameworkRestorationChannelRequest = null;
            this.restorationData = bArr;
        } else if (this.frameworkHasRequestedData) {
            this.channel.invokeMethod("push", packageData(bArr), new MethodChannel.Result() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.1
                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                    Log.e(RestorationChannel.TAG, "Error " + str + " while sending restoration data to framework: " + str2);
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    RestorationChannel.this.restorationData = bArr;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                }
            });
        } else {
            this.restorationData = bArr;
        }
    }

    public RestorationChannel(MethodChannel methodChannel, boolean z10) {
        this.engineHasProvidedData = false;
        this.frameworkHasRequestedData = false;
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.2
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                str.getClass();
                if (!str.equals("get")) {
                    if (!str.equals("put")) {
                        result.notImplemented();
                        return;
                    }
                    RestorationChannel.this.restorationData = (byte[]) obj;
                    result.success(null);
                    return;
                }
                RestorationChannel.this.frameworkHasRequestedData = true;
                if (!RestorationChannel.this.engineHasProvidedData) {
                    RestorationChannel restorationChannel = RestorationChannel.this;
                    if (restorationChannel.waitForRestorationData) {
                        restorationChannel.pendingFrameworkRestorationChannelRequest = result;
                        return;
                    }
                }
                RestorationChannel restorationChannel2 = RestorationChannel.this;
                result.success(restorationChannel2.packageData(restorationChannel2.restorationData));
            }
        };
        this.handler = methodCallHandler;
        this.channel = methodChannel;
        this.waitForRestorationData = z10;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }
}
