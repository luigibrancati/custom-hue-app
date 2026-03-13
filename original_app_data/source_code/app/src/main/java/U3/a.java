package U3;

import Od.C1821a;
import android.util.Log;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.P;
import gc.Q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;
import io.sentry.ProfileChunk;
import io.sentry.protocol.FeatureFlag;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LU3/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/view/TextureRegistry;", "b", "Lio/flutter/view/TextureRegistry;", "textureRegistry", "", "", "LU3/b;", "c", "Ljava/util/Map;", "renderTextures", "d", "rive_native_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public TextureRegistry textureRegistry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Map renderTextures = new LinkedHashMap();

    static {
        System.loadLibrary("rive_native");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "rive_native");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        TextureRegistry textureRegistry = flutterPluginBinding.getTextureRegistry();
        AbstractC4862t.d(textureRegistry, "getTextureRegistry(...)");
        this.textureRegistry = textureRegistry;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Iterator it = this.renderTextures.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).c();
        }
        this.renderTextures.clear();
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
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1057393789) {
                TextureRegistry textureRegistry = null;
                if (iHashCode != -222324745) {
                    if (iHashCode == 828700799 && str.equals("createTexture")) {
                        Integer num = (Integer) call.argument("width");
                        Integer num2 = (Integer) call.argument("height");
                        if (num == null || num2 == null) {
                            result.error("CreateTexture Error", "Width and height are required", null);
                            return;
                        }
                        TextureRegistry textureRegistry2 = this.textureRegistry;
                        if (textureRegistry2 == null) {
                            AbstractC4862t.p("textureRegistry");
                        } else {
                            textureRegistry = textureRegistry2;
                        }
                        TextureRegistry.SurfaceProducer surfaceProducerCreateSurfaceProducer = textureRegistry.createSurfaceProducer();
                        AbstractC4862t.d(surfaceProducerCreateSurfaceProducer, "createSurfaceProducer(...)");
                        b bVar = new b(surfaceProducerCreateSurfaceProducer, num.intValue(), num2.intValue());
                        this.renderTextures.put(Long.valueOf(surfaceProducerCreateSurfaceProducer.id()), bVar);
                        C4034q c4034qA = AbstractC4040w.a("textureId", Long.valueOf(surfaceProducerCreateSurfaceProducer.id()));
                        String string = Long.toString(bVar.a(), C1821a.a(16));
                        AbstractC4862t.d(string, "toString(...)");
                        result.success(Q.l(c4034qA, AbstractC4040w.a("renderer", string)));
                        return;
                    }
                } else if (str.equals("removeTexture")) {
                    Long lValueOf = ((Integer) call.argument("id")) != null ? Long.valueOf(r6.intValue()) : null;
                    if (lValueOf == null) {
                        result.error("removeTexture Error", "Texture ID is required", null);
                        return;
                    }
                    b bVar2 = (b) this.renderTextures.get(lValueOf);
                    if (bVar2 != null) {
                        bVar2.c();
                        this.renderTextures.remove(lValueOf);
                        result.success(null);
                        return;
                    } else {
                        Log.e("RiveNativePlugin", "removeTexture: texture " + lValueOf + " not found");
                        result.error("removeTexture Error", "Texture not found", null);
                        return;
                    }
                }
            } else if (str.equals("getRenderContext")) {
                result.success(P.f(AbstractC4040w.a("rendererContext", ProfileChunk.PLATFORM_ANDROID)));
                return;
            }
        }
        result.notImplemented();
    }
}
