package com.signify.widgets;

import Ga.h;
import Ga.l;
import Ga.n;
import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.signify.widgets.ConfigureActivity;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.SentryEvent;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/signify/widgets/ConfigureActivity;", "Lio/flutter/embedding/android/FlutterActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfc/H;", "onCreate", "(Landroid/os/Bundle;)V", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "(Lio/flutter/embedding/engine/FlutterEngine;)V", "onDestroy", "", "getInitialRoute", "()Ljava/lang/String;", "", "c", "()I", FeatureFlag.JsonKeys.RESULT, "d", "(I)V", "LGa/n;", "a", "LGa/n;", SentryEvent.JsonKeys.LOGGER, "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfigureActivity extends FlutterActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public n logger;

    public static final void b(ConfigureActivity configureActivity, MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        String str = call.method;
        n nVar = null;
        if (AbstractC4862t.a(str, "configuration_done")) {
            n nVar2 = configureActivity.logger;
            if (nVar2 == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            } else {
                nVar = nVar2;
            }
            nVar.a("ConfigureActivity -> CONFIGURATION_DONE_METHOD");
            result.success(0);
            configureActivity.d(-1);
            return;
        }
        if (AbstractC4862t.a(str, "abort_creation")) {
            n nVar3 = configureActivity.logger;
            if (nVar3 == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            } else {
                nVar = nVar3;
            }
            nVar.a("ConfigureActivity -> ABORT_CREATION_METHOD");
            result.success(0);
            configureActivity.d(0);
        }
    }

    public final int c() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return 0;
        }
        return extras.getInt("appWidgetId", 0);
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        AbstractC4862t.e(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "com.signify.widgets.main").setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: Ga.a
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                ConfigureActivity.b(this.f4630a, methodCall, result);
            }
        });
    }

    public final void d(int result) {
        int iC = c();
        if (iC != 0) {
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", iC);
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
            AbstractC4862t.d(appWidgetManager, "getInstance(...)");
            l lVar = l.Idle;
            n nVar = this.logger;
            if (nVar == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                nVar = null;
            }
            h.c(this, appWidgetManager, iC, lVar, nVar);
            setResult(result, intent);
            finish();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public String getInitialRoute() {
        return "show_widget_setup/" + c();
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("widgets_plugin_cache", 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.logger = new n(sharedPreferences.getBoolean("showWidgetLogs", false));
    }

    @Override // io.flutter.embedding.android.FlutterActivity, android.app.Activity
    public void onDestroy() {
        sendBroadcast(new Intent("com.signify.widgets.HueWidgetCreationFlowEnded"));
        super.onDestroy();
    }
}
