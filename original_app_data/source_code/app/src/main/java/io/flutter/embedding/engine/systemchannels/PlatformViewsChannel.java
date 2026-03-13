package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.sentry.protocol.Message;
import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    private PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class AnonymousClass1 implements MethodChannel.MethodCallHandler {
        public AnonymousClass1() {
        }

        public static /* synthetic */ void a(MethodChannel.Result result, PlatformViewBufferSize platformViewBufferSize) {
            if (platformViewBufferSize == null) {
                result.error("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(platformViewBufferSize.width));
            map.put("height", Double.valueOf(platformViewBufferSize.height));
            result.success(map);
        }

        private void clearFocus(MethodCall methodCall, MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void create(MethodCall methodCall, MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            boolean z10 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey(Message.JsonKeys.PARAMS) ? ByteBuffer.wrap((byte[]) map.get(Message.JsonKeys.PARAMS)) : null;
            try {
                if (z10) {
                    PlatformViewsChannel.this.handler.createForPlatformViewLayer(PlatformViewCreationRequest.createHybridCompositionRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ((Integer) map.get("direction")).intValue(), byteBufferWrap));
                    result.success(null);
                    return;
                }
                boolean z11 = map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue();
                long jCreateForTextureLayer = PlatformViewsChannel.this.handler.createForTextureLayer(PlatformViewCreationRequest.createTLHCWithFallbackRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey(RRWebVideoEvent.JsonKeys.TOP) ? ((Double) map.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue() : 0.0d, map.containsKey(RRWebVideoEvent.JsonKeys.LEFT) ? ((Double) map.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z11, byteBufferWrap));
                if (jCreateForTextureLayer != -2) {
                    result.success(Long.valueOf(jCreateForTextureLayer));
                } else {
                    if (!z11) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    result.success(null);
                }
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void dispose(MethodCall methodCall, MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void offset(MethodCall methodCall, MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue(), ((Double) map.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void resize(MethodCall methodCall, final MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new PlatformViewBufferResized() { // from class: io.flutter.embedding.engine.systemchannels.b
                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
                    public final void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
                        PlatformViewsChannel.AnonymousClass1.a(result, platformViewBufferSize);
                    }
                });
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void setDirection(MethodCall methodCall, MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void synchronizeToNativeViewHierarchy(MethodCall methodCall, MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        private void touch(MethodCall methodCall, MethodChannel.Result result) {
            List list = (List) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                result.success(null);
            } catch (IllegalStateException e10) {
                result.error("error", PlatformViewsChannel.detailedExceptionString(e10), null);
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            if (PlatformViewsChannel.this.handler == null) {
            }
            Log.v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
            String str = methodCall.method;
            str.getClass();
            switch (str) {
                case "create":
                    create(methodCall, result);
                    break;
                case "offset":
                    offset(methodCall, result);
                    break;
                case "resize":
                    resize(methodCall, result);
                    break;
                case "clearFocus":
                    clearFocus(methodCall, result);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    synchronizeToNativeViewHierarchy(methodCall, result);
                    break;
                case "touch":
                    touch(methodCall, result);
                    break;
                case "setDirection":
                    setDirection(methodCall, result);
                    break;
                case "dispose":
                    dispose(methodCall, result);
                    break;
                default:
                    result.notImplemented();
                    break;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface PlatformViewBufferResized {
        void run(PlatformViewBufferSize platformViewBufferSize);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i10, double d10, double d11) {
            this.viewId = i10;
            this.newLogicalWidth = d10;
            this.newLogicalHeight = d11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface PlatformViewsHandler {
        public static final long NON_TEXTURE_FALLBACK = -2;

        void clearFocus(int i10);

        void createForPlatformViewLayer(PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(PlatformViewCreationRequest platformViewCreationRequest);

        void createPlatformViewHcpp(PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i10);

        boolean isHcppEnabled();

        void offset(int i10, double d10, double d11);

        void onTouch(PlatformViewTouch platformViewTouch);

        void resize(PlatformViewResizeRequest platformViewResizeRequest, PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i10, int i11);

        void synchronizeToNativeViewHierarchy(boolean z10);
    }

    public PlatformViewsChannel(DartExecutor dartExecutor) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.parsingHandler = anonymousClass1;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }

    public void invokeViewFocused(int i10) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", Integer.valueOf(i10));
    }

    public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
