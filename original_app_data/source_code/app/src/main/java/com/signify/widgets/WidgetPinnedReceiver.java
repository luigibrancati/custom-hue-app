package com.signify.widgets;

import Ga.h;
import Ga.n;
import Ga.u;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import fc.AbstractC4040w;
import gc.Q;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.SentryEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/signify/widgets/WidgetPinnedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/SharedPreferences;", "a", "Landroid/content/SharedPreferences;", "widgetSharedPreferences", "LGa/n;", "b", "LGa/n;", SentryEvent.JsonKeys.LOGGER, "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetPinnedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public SharedPreferences widgetSharedPreferences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public n logger;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        SharedPreferences sharedPreferences = context.getSharedPreferences("widgets_plugin_cache", 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.widgetSharedPreferences = sharedPreferences;
        SharedPreferences sharedPreferences2 = this.widgetSharedPreferences;
        n nVar = null;
        if (sharedPreferences2 == null) {
            AbstractC4862t.p("widgetSharedPreferences");
            sharedPreferences2 = null;
        }
        this.logger = new n(sharedPreferences2.getBoolean("showWidgetLogs", false));
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        int intExtra2 = intent.getIntExtra("widgetId", -1);
        n nVar2 = this.logger;
        if (nVar2 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar2 = null;
        }
        nVar2.a("WidgetPinnedReceiver: NEW ID: " + intExtra + " | OLD ID: " + intExtra2);
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        new u(applicationContext).l(intExtra2, intExtra);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        AbstractC4862t.d(appWidgetManager, "getInstance(...)");
        n nVar3 = this.logger;
        if (nVar3 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar3 = null;
        }
        h.c(context, appWidgetManager, intExtra, null, nVar3);
        HashMap mapK = Q.k(AbstractC4040w.a("oldId", Integer.valueOf(intExtra2)), AbstractC4040w.a("newId", Integer.valueOf(intExtra)));
        MethodChannel methodChannelA = a.INSTANCE.a();
        AbstractC4862t.b(methodChannelA);
        methodChannelA.invokeMethod("widgetIsPinned", mapK);
        n nVar4 = this.logger;
        if (nVar4 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar4 = null;
        }
        nVar4.a("WidgetPinnedReceiver: WIDGET_IS_PINNED invoked: " + mapK);
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("hue://widget_added"));
        intent2.addFlags(268566528);
        context.startActivity(intent2);
        n nVar5 = this.logger;
        if (nVar5 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
        } else {
            nVar = nVar5;
        }
        nVar.a("WidgetPinnedReceiver: DEEPLINK INTENT LAUNCHED: hue://widget_added");
    }
}
