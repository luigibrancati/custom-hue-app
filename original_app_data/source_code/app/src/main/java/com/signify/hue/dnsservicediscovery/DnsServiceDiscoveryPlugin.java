package com.signify.hue.dnsservicediscovery;

import android.content.Context;
import fc.C4015H;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.Session;
import io.sentry.protocol.FeatureFlag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/signify/hue/dnsservicediscovery/DnsServiceDiscoveryPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Landroid/content/Context;", "context", "Lfc/H;", Session.JsonKeys.INIT, "(Lio/flutter/plugin/common/MethodChannel;Landroid/content/Context;)V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodChannel;", "Landroid/content/Context;", "Lcom/signify/hue/dnsservicediscovery/NetworkServiceDiscovery;", "discovery", "Lcom/signify/hue/dnsservicediscovery/NetworkServiceDiscovery;", "getDiscovery", "()Lcom/signify/hue/dnsservicediscovery/NetworkServiceDiscovery;", "setDiscovery", "(Lcom/signify/hue/dnsservicediscovery/NetworkServiceDiscovery;)V", "Companion", "dns_service_discovery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DnsServiceDiscoveryPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String methodChannelName = "dns_service_discovery";
    private MethodChannel channel;
    private Context context;
    private NetworkServiceDiscovery discovery;

    private final void init(MethodChannel channel, Context context) {
        this.channel = channel;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$3$lambda$0(DnsServiceDiscoveryPlugin dnsServiceDiscoveryPlugin, ServiceInfo serviceInfo) {
        AbstractC4862t.e(serviceInfo, "serviceInfo");
        MethodChannel methodChannel = dnsServiceDiscoveryPlugin.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("onServiceResolved", serviceInfo.toMap());
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$3$lambda$1(DnsServiceDiscoveryPlugin dnsServiceDiscoveryPlugin, String name) {
        AbstractC4862t.e(name, "name");
        MethodChannel methodChannel = dnsServiceDiscoveryPlugin.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("onServiceLost", name);
        return C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4015H onMethodCall$lambda$3$lambda$2(DnsServiceDiscoveryPlugin dnsServiceDiscoveryPlugin, String name) {
        AbstractC4862t.e(name, "name");
        MethodChannel methodChannel = dnsServiceDiscoveryPlugin.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.invokeMethod("onDiscoveryFailed", name);
        return C4015H.f34254a;
    }

    public final NetworkServiceDiscovery getDiscovery() {
        return this.discovery;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), methodChannelName);
        DnsServiceDiscoveryPlugin dnsServiceDiscoveryPlugin = new DnsServiceDiscoveryPlugin();
        Context applicationContext = binding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        dnsServiceDiscoveryPlugin.init(methodChannel, applicationContext);
        methodChannel.setMethodCallHandler(dnsServiceDiscoveryPlugin);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (!AbstractC4862t.a(str, "start")) {
            if (!AbstractC4862t.a(str, "stop")) {
                result.notImplemented();
                return;
            }
            NetworkServiceDiscovery networkServiceDiscovery = this.discovery;
            if (networkServiceDiscovery != null) {
                networkServiceDiscovery.stop();
            }
            result.success(null);
            return;
        }
        Context context = this.context;
        if (context == null) {
            AbstractC4862t.p("context");
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        Object objArgument = call.argument("serviceTypes");
        AbstractC4862t.b(objArgument);
        NetworkServiceDiscovery networkServiceDiscovery2 = new NetworkServiceDiscovery(applicationContext, (List) objArgument);
        networkServiceDiscovery2.start(new l() { // from class: com.signify.hue.dnsservicediscovery.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DnsServiceDiscoveryPlugin.onMethodCall$lambda$3$lambda$0(this.f32475a, (ServiceInfo) obj);
            }
        }, new l() { // from class: com.signify.hue.dnsservicediscovery.b
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DnsServiceDiscoveryPlugin.onMethodCall$lambda$3$lambda$1(this.f32476a, (String) obj);
            }
        }, new l() { // from class: com.signify.hue.dnsservicediscovery.c
            @Override // vc.l
            public final Object invoke(Object obj) {
                return DnsServiceDiscoveryPlugin.onMethodCall$lambda$3$lambda$2(this.f32477a, (String) obj);
            }
        });
        this.discovery = networkServiceDiscovery2;
        result.success(null);
    }

    public final void setDiscovery(NetworkServiceDiscovery networkServiceDiscovery) {
        this.discovery = networkServiceDiscovery;
    }
}
