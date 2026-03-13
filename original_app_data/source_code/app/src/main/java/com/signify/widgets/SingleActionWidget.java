package com.signify.widgets;

import Ga.h;
import Ga.l;
import Ga.n;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/signify/widgets/SingleActionWidget;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "Lfc/H;", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "LGa/n;", "a", "LGa/n;", SentryEvent.JsonKeys.LOGGER, "native_widgets_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleActionWidget extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public n logger;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r11, android.content.Intent r12) throws android.app.PendingIntent.CanceledException {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.signify.widgets.SingleActionWidget.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(appWidgetManager, "appWidgetManager");
        AbstractC4862t.e(appWidgetIds, "appWidgetIds");
        n nVar = this.logger;
        if (nVar == null) {
            AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
            nVar = null;
        }
        nVar.a("SingleActionWidget.onUpdate");
        for (int i10 : appWidgetIds) {
            l lVar = l.Idle;
            n nVar2 = this.logger;
            if (nVar2 == null) {
                AbstractC4862t.p(SentryEvent.JsonKeys.LOGGER);
                nVar2 = null;
            }
            h.c(context, appWidgetManager, i10, lVar, nVar2);
        }
    }
}
