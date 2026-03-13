package com.signify.widgets;

import Ga.WidgetItem;
import Ga.h;
import Ga.n;
import Ga.u;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/signify/widgets/WidgetItemResetReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfc/H;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "LGa/n;", "a", "LGa/n;", SentryEvent.JsonKeys.LOGGER, "b", "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetItemResetReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public n logger;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        n nVar = new n(context.getSharedPreferences("widgets_plugin_cache", 0).getBoolean("showWidgetLogs", false));
        this.logger = nVar;
        nVar.a("WidgetItemResetReceiver: WidgetItemResetReceiver.onReceive");
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        u uVar = new u(applicationContext);
        String stringExtra = intent.getStringExtra("widgetItemIdActionParam");
        AbstractC4862t.b(stringExtra);
        int intExtra = intent.getIntExtra("widgetIdParam", 0);
        WidgetItem widgetItemC = uVar.c(stringExtra);
        if (widgetItemC == null || !widgetItemC.getShouldTurnOff()) {
            return;
        }
        uVar.j(stringExtra, false);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        AbstractC4862t.d(appWidgetManager, "getInstance(...)");
        n nVar2 = this.logger;
        n nVar3 = null;
        if (nVar2 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar2 = null;
        }
        h.c(context, appWidgetManager, intExtra, null, nVar2);
        n nVar4 = this.logger;
        if (nVar4 == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
        } else {
            nVar3 = nVar4;
        }
        nVar3.a("WidgetItemResetReceiver: " + stringExtra + " timer expired, widget reset to normal");
    }
}
