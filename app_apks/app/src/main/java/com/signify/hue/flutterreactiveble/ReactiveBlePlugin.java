package com.signify.hue.flutterreactiveble;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ReactiveBlePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Companion", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactiveBlePlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static PluginController pluginController;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u0003R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/signify/hue/flutterreactiveble/ReactiveBlePlugin$Companion;", "", "<init>", "()V", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", "context", "Lcom/signify/hue/flutterreactiveble/ReactiveBlePlugin;", "plugin", "Lfc/H;", "initializePlugin", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;Lcom/signify/hue/flutterreactiveble/ReactiveBlePlugin;)V", "deinitializePlugin", "Lcom/signify/hue/flutterreactiveble/PluginController;", "pluginController", "Lcom/signify/hue/flutterreactiveble/PluginController;", "getPluginController", "()Lcom/signify/hue/flutterreactiveble/PluginController;", "setPluginController", "(Lcom/signify/hue/flutterreactiveble/PluginController;)V", "reactive_ble_mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void deinitializePlugin() {
            getPluginController().deinitialize$reactive_ble_mobile_release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initializePlugin(BinaryMessenger messenger, Context context, ReactiveBlePlugin plugin) {
            new MethodChannel(messenger, "flutter_reactive_ble_method").setMethodCallHandler(plugin);
            setPluginController(new PluginController());
            getPluginController().initialize$reactive_ble_mobile_release(messenger, context);
        }

        public final PluginController getPluginController() {
            PluginController pluginController = ReactiveBlePlugin.pluginController;
            if (pluginController != null) {
                return pluginController;
            }
            AbstractC4862t.p("pluginController");
            return null;
        }

        public final void setPluginController(PluginController pluginController) {
            AbstractC4862t.e(pluginController, "<set-?>");
            ReactiveBlePlugin.pluginController = pluginController;
        }

        private Companion() {
        }
    }

    private static final void deinitializePlugin() {
        INSTANCE.deinitializePlugin();
    }

    private static final void initializePlugin(BinaryMessenger binaryMessenger, Context context, ReactiveBlePlugin reactiveBlePlugin) {
        INSTANCE.initializePlugin(binaryMessenger, context, reactiveBlePlugin);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Companion companion = INSTANCE;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        companion.initializePlugin(binaryMessenger, applicationContext, this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        INSTANCE.deinitializePlugin();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        INSTANCE.getPluginController().execute$reactive_ble_mobile_release(call, result);
    }
}
