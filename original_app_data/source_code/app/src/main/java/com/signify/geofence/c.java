package com.signify.geofence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import za.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\"¨\u0006%"}, d2 = {"Lcom/signify/geofence/c;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Landroid/content/Context;", "context", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "d", "(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V", "a", "Landroid/content/Context;", "Landroid/content/BroadcastReceiver;", "b", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Lcom/signify/geofence/a;", "c", "Lcom/signify/geofence/a;", "geofenceClient", "Lio/flutter/plugin/common/EventChannel;", "Lio/flutter/plugin/common/EventChannel;", "eventChannel", "e", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f32467f = "geofence_handle_key";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f32468g = "GeofencingPlugin";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f32469h = "geofencing_plugin_cache";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f32470i = "callback_dispatch_handler";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver broadcastReceiver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a geofenceClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public EventChannel eventChannel;

    /* JADX INFO: renamed from: com.signify.geofence.c$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String b() {
            return c.f32470i;
        }

        public final String c() {
            return c.f32467f;
        }

        public final String d() {
            return c.f32469h;
        }

        public final void e(Context context, long j10) {
            context.getSharedPreferences(d(), 0).edit().putLong(b(), j10).apply();
        }

        public Companion() {
        }
    }

    public final void d(Context context, BinaryMessenger binaryMessenger) {
        this.context = context;
        new MethodChannel(binaryMessenger, "com.signify.geofence.main").setMethodCallHandler(this);
        this.geofenceClient = new a(context);
        GeofenceLocationModeChangedReceiver geofenceLocationModeChangedReceiver = new GeofenceLocationModeChangedReceiver();
        this.broadcastReceiver = geofenceLocationModeChangedReceiver;
        context.registerReceiver(geofenceLocationModeChangedReceiver, new IntentFilter("android.location.MODE_CHANGED"));
        EventChannel eventChannel = new EventChannel(binaryMessenger, "com.signify.geofence.event.enabled");
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(new n(context));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        d(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver != null) {
            binding.getApplicationContext().unregisterReceiver(broadcastReceiver);
        }
        EventChannel eventChannel = this.eventChannel;
        if (eventChannel == null) {
            AbstractC4862t.p("eventChannel");
            eventChannel = null;
        }
        eventChannel.setStreamHandler(null);
        this.context = null;
        this.broadcastReceiver = null;
        this.geofenceClient = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1532848996:
                    if (str.equals("createGeofence")) {
                        a aVar = this.geofenceClient;
                        AbstractC4862t.b(aVar);
                        Object objArgument = call.argument("appCallbackHandle");
                        AbstractC4862t.b(objArgument);
                        long jLongValue = ((Number) objArgument).longValue();
                        Object objArgument2 = call.argument("regionId");
                        AbstractC4862t.b(objArgument2);
                        Object objArgument3 = call.argument("latitude");
                        AbstractC4862t.b(objArgument3);
                        double dDoubleValue = ((Number) objArgument3).doubleValue();
                        Object objArgument4 = call.argument("longitude");
                        AbstractC4862t.b(objArgument4);
                        double dDoubleValue2 = ((Number) objArgument4).doubleValue();
                        Object objArgument5 = call.argument("radius");
                        AbstractC4862t.b(objArgument5);
                        aVar.l(jLongValue, (String) objArgument2, dDoubleValue, dDoubleValue2, ((Number) objArgument5).doubleValue(), result);
                        return;
                    }
                    break;
                case -213427637:
                    if (str.equals("deleteGeofence")) {
                        a aVar2 = this.geofenceClient;
                        AbstractC4862t.b(aVar2);
                        Object objArgument6 = call.argument("regionId");
                        AbstractC4862t.b(objArgument6);
                        aVar2.r((String) objArgument6, result);
                        return;
                    }
                    break;
                case 468459354:
                    if (str.equals("hasPresenceInGeofence")) {
                        Object objArgument7 = call.argument("regionId");
                        AbstractC4862t.b(objArgument7);
                        a aVar3 = this.geofenceClient;
                        AbstractC4862t.b(aVar3);
                        aVar3.w((String) objArgument7, result);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        Companion companion = INSTANCE;
                        Context context = this.context;
                        AbstractC4862t.b(context);
                        Object objArgument8 = call.argument("pluginCallbackHandle");
                        AbstractC4862t.b(objArgument8);
                        companion.e(context, ((Number) objArgument8).longValue());
                        result.success(0);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }
}
