package Ga;

import Ga.i;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.signify.widgets.SingleActionWidget;
import fc.C4032o;
import gc.C4179C;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4652a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.Busy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4652a = iArr;
        }
    }

    public static final void a(Context context) {
        File[] fileArrListFiles;
        AbstractC4862t.e(context, "context");
        File filesDir = context.getFilesDir();
        AbstractC4862t.d(filesDir, "getFilesDir(...)");
        File fileR = sc.l.r(filesDir, "../app_flutter/AndroidWidgetsThumbs");
        if (fileR.exists() && (fileArrListFiles = fileR.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) SingleActionWidget.class));
        AbstractC4862t.d(appWidgetIds, "getAppWidgetIds(...)");
        for (int i10 : appWidgetIds) {
            AbstractC4862t.b(appWidgetManager);
            b(context, appWidgetManager, i10);
        }
    }

    public static final void b(Context context, AppWidgetManager appWidgetManager, int i10) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), e.f4639a);
        remoteViews.setTextViewText(d.f4636d, context.getText(f.f4649j));
        remoteViews.setTextViewText(d.f4635c, "");
        remoteViews.setImageViewResource(d.f4638f, c.f4632b);
        remoteViews.setOnClickPendingIntent(d.f4638f, null);
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    public static final void c(Context context, AppWidgetManager appWidgetManager, int i10, l lVar, n logger) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(appWidgetManager, "appWidgetManager");
        AbstractC4862t.e(logger, "logger");
        logger.a("updateAppWidget widget ID: " + i10 + " , state: " + lVar);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), e.f4639a);
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        List listD = new u(applicationContext).d(i10);
        if (listD.isEmpty()) {
            logger.b("No items found for widget Id: " + i10);
            b(context, appWidgetManager, i10);
            return;
        }
        WidgetItem widgetItem = (WidgetItem) C4179C.h0(listD);
        logger.a("item: " + widgetItem);
        File filesDir = context.getFilesDir();
        AbstractC4862t.d(filesDir, "getFilesDir(...)");
        File fileR = sc.l.r(filesDir, "../app_flutter/AndroidWidgetsThumbs");
        if (!fileR.exists()) {
            logger.b("thumbsPath " + fileR + " does NOT exist");
            b(context, appWidgetManager, i10);
            return;
        }
        File fileR2 = sc.l.r(fileR, widgetItem.getId() + ".png");
        if (!fileR2.exists()) {
            logger.b("thumb " + fileR2 + " does NOT exist");
            b(context, appWidgetManager, i10);
            return;
        }
        remoteViews.setImageViewBitmap(d.f4638f, BitmapFactory.decodeFile(fileR2.getAbsolutePath()));
        int i11 = d.f4636d;
        i.a aVar = i.f4653a;
        remoteViews.setTextViewText(i11, aVar.a(context, widgetItem.getTitle()));
        remoteViews.setTextViewText(d.f4635c, aVar.a(context, widgetItem.getSubtitle()));
        if (lVar != null) {
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i10);
            appWidgetOptions.putInt("STATE", lVar.b());
            appWidgetManager.updateAppWidgetOptions(i10, appWidgetOptions);
        }
        if (lVar == null) {
            lVar = l.Companion.a(appWidgetManager.getAppWidgetOptions(i10).getInt("STATE", l.Idle.b()));
        }
        int i12 = a.f4652a[lVar.ordinal()];
        if (i12 == 1) {
            remoteViews.setViewVisibility(d.f4633a, 8);
            remoteViews.setViewVisibility(d.f4634b, widgetItem.getShouldTurnOff() ? 0 : 8);
            remoteViews.setViewVisibility(d.f4637e, widgetItem.getShouldTurnOff() ? 0 : 8);
            Intent intent = new Intent(context, (Class<?>) SingleActionWidget.class);
            intent.setAction("lightControlAction");
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", i10);
            bundle.putString("widgetItemIdActionParam", widgetItem.getId());
            intent.putExtras(bundle);
            intent.setData(Uri.parse(intent.toUri(1)));
            remoteViews.setOnClickPendingIntent(d.f4638f, PendingIntent.getBroadcast(context, 0, intent, 167772160));
        } else {
            if (i12 != 2) {
                throw new C4032o();
            }
            remoteViews.setViewVisibility(d.f4633a, 0);
            remoteViews.setViewVisibility(d.f4634b, 0);
            remoteViews.setOnClickPendingIntent(d.f4638f, null);
        }
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }
}
