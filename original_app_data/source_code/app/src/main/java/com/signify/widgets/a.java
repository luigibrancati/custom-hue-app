package com.signify.widgets;

import Ga.h;
import Ga.l;
import Ga.n;
import Ga.s;
import Ga.u;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.RemoteViews;
import fc.C4015H;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.SentryEvent;
import io.sentry.protocol.FeatureFlag;
import kc.AbstractC4837a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/signify/widgets/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "onDetachedFromActivityForConfigChanges", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "argumentName", "", "c", "(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)J", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lio/flutter/plugin/common/MethodChannel;", "b", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "widgetSharedPreferences", "LGa/n;", "d", "LGa/n;", SentryEvent.JsonKeys.LOGGER, "e", "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static MethodChannel f32669f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public SharedPreferences widgetSharedPreferences;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public n logger;

    /* JADX INFO: renamed from: com.signify.widgets.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final MethodChannel a() {
            return a.f32669f;
        }

        public Companion() {
        }
    }

    public static final C4015H d(a aVar, MethodChannel.Result result) {
        Context context = aVar.context;
        AbstractC4862t.b(context);
        result.success(Boolean.valueOf(AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported()));
        return C4015H.f34254a;
    }

    public final long c(MethodCall call, String argumentName) {
        Object objArgument = call.argument(argumentName);
        AbstractC4862t.b(objArgument);
        if (objArgument instanceof Integer) {
            return ((Number) objArgument).intValue();
        }
        if (objArgument instanceof Long) {
            return ((Number) objArgument).longValue();
        }
        throw new ClassCastException("Failed to cast argument (" + argumentName + ") to Long");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        f32669f = this.channel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        Context applicationContext = binding.getApplicationContext();
        this.context = applicationContext;
        AbstractC4862t.b(applicationContext);
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("widgets_plugin_cache", 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.widgetSharedPreferences = sharedPreferences;
        SharedPreferences sharedPreferences2 = this.widgetSharedPreferences;
        if (sharedPreferences2 == null) {
            AbstractC4862t.p("widgetSharedPreferences");
            sharedPreferences2 = null;
        }
        this.logger = new n(sharedPreferences2.getBoolean("showWidgetLogs", false));
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "com.signify.widgets.configure");
        methodChannel.setMethodCallHandler(this);
        this.channel = methodChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.context = null;
        this.channel = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, final MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        if (str != null) {
            SharedPreferences sharedPreferences = null;
            n nVar = null;
            switch (str.hashCode()) {
                case -1721207046:
                    if (str.equals("useWidgetLogs")) {
                        Object obj = call.arguments;
                        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        SharedPreferences sharedPreferences2 = this.widgetSharedPreferences;
                        if (sharedPreferences2 == null) {
                            AbstractC4862t.p("widgetSharedPreferences");
                        } else {
                            sharedPreferences = sharedPreferences2;
                        }
                        sharedPreferences.edit().putBoolean("showWidgetLogs", zBooleanValue).apply();
                        result.success(0);
                        return;
                    }
                    break;
                case -1634578561:
                    if (str.equals("initWidgets")) {
                        Context context = this.context;
                        AbstractC4862t.b(context);
                        Context applicationContext = context.getApplicationContext();
                        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
                        u uVar = new u(applicationContext);
                        uVar.i(c(call, "pluginCallbackHandle"));
                        uVar.h(c(call, "appCallbackHandle"));
                        result.success(0);
                        return;
                    }
                    break;
                case -1485660932:
                    if (str.equals("updateAppWidget")) {
                        Integer num = (Integer) call.argument("widgetId");
                        Object objArgument = call.argument("widgetItemId");
                        AbstractC4862t.b(objArgument);
                        String str2 = (String) objArgument;
                        n nVar2 = this.logger;
                        if (nVar2 == null) {
                            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                            nVar2 = null;
                        }
                        nVar2.a("WidgetsPlugin: update widget widgetItemId: " + str2 + " into widgetId: " + num);
                        Context context2 = this.context;
                        AbstractC4862t.b(context2);
                        Context context3 = this.context;
                        AbstractC4862t.b(context3);
                        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context3);
                        AbstractC4862t.d(appWidgetManager, "getInstance(...)");
                        AbstractC4862t.b(num);
                        int iIntValue = num.intValue();
                        l lVar = l.Idle;
                        n nVar3 = this.logger;
                        if (nVar3 == null) {
                            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                        } else {
                            nVar = nVar3;
                        }
                        h.c(context2, appWidgetManager, iIntValue, lVar, nVar);
                        result.success(0);
                        return;
                    }
                    break;
                case -546764675:
                    if (str.equals("resetAllWidgets")) {
                        Context context4 = this.context;
                        AbstractC4862t.b(context4);
                        h.a(context4);
                        result.success(0);
                        return;
                    }
                    break;
                case -453089480:
                    if (str.equals("getActiveWidgetIds")) {
                        Context context5 = this.context;
                        AbstractC4862t.b(context5);
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context5);
                        Context context6 = this.context;
                        AbstractC4862t.b(context6);
                        result.success(appWidgetManager2.getAppWidgetIds(new ComponentName(context6, (Class<?>) SingleActionWidget.class)));
                        return;
                    }
                    break;
                case 1495462005:
                    if (str.equals("pinWidgetSupported")) {
                        AbstractC4837a.b(false, false, null, "widgets/thread", 0, new InterfaceC6082a() { // from class: Ga.r
                            @Override // vc.InterfaceC6082a
                            public final Object invoke() {
                                return com.signify.widgets.a.d(this.f4670a, result);
                            }
                        }, 23, null);
                        return;
                    }
                    break;
                case 2122273386:
                    if (str.equals("requestPinWidget")) {
                        Object objArgument2 = call.argument("widgetId");
                        AbstractC4862t.b(objArgument2);
                        int iIntValue2 = ((Number) objArgument2).intValue();
                        n nVar4 = this.logger;
                        if (nVar4 == null) {
                            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                            nVar4 = null;
                        }
                        nVar4.a("WidgetsPlugin: REQUEST PIN WIDGET WITH ID: " + iIntValue2);
                        Context context7 = this.context;
                        AbstractC4862t.b(context7);
                        AppWidgetManager appWidgetManager3 = AppWidgetManager.getInstance(context7);
                        if (!appWidgetManager3.isRequestPinAppWidgetSupported()) {
                            n nVar5 = this.logger;
                            if (nVar5 == null) {
                                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                                nVar5 = null;
                            }
                            nVar5.a("WidgetsPlugin: NOT SUPPORTED");
                            result.error("", "Widget pinning is not supported", null);
                            return;
                        }
                        try {
                            Context context8 = this.context;
                            AbstractC4862t.b(context8);
                            ComponentName componentName = new ComponentName(context8, (Class<?>) SingleActionWidget.class);
                            Context context9 = this.context;
                            AbstractC4862t.b(context9);
                            Intent intent = new Intent(context9, (Class<?>) WidgetPinnedReceiver.class);
                            intent.putExtra("widgetId", iIntValue2);
                            Context context10 = this.context;
                            AbstractC4862t.b(context10);
                            PendingIntent broadcast = PendingIntent.getBroadcast(context10, 0, intent, 167772160);
                            Context context11 = this.context;
                            AbstractC4862t.b(context11);
                            n nVar6 = this.logger;
                            if (nVar6 == null) {
                                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                                nVar6 = null;
                            }
                            RemoteViews remoteViewsA = s.a(context11, iIntValue2, nVar6);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("appWidgetPreview", remoteViewsA);
                            boolean zRequestPinAppWidget = appWidgetManager3.requestPinAppWidget(componentName, bundle, broadcast);
                            n nVar7 = this.logger;
                            if (nVar7 == null) {
                                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                                nVar7 = null;
                            }
                            nVar7.a("WidgetsPlugin: RESULT: " + zRequestPinAppWidget);
                            result.success(Boolean.valueOf(zRequestPinAppWidget));
                            return;
                        } catch (Exception e10) {
                            result.error("", e10.getMessage(), null);
                            return;
                        }
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }
}
