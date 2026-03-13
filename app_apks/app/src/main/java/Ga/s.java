package Ga;

import Ga.i;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.widget.RemoteViews;
import gc.C4179C;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    public static final RemoteViews a(Context context, int i10, n logger) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(logger, "logger");
        logger.a("getRemoteViewPreviewForWidget widget ID: " + i10);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), e.f4639a);
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        List listD = new u(applicationContext).d(i10);
        if (listD.isEmpty()) {
            logger.b("No items found for widget Id: " + i10);
            return remoteViews;
        }
        WidgetItem widgetItem = (WidgetItem) C4179C.h0(listD);
        logger.a("getRemoteViewPreviewForWidget item: " + widgetItem);
        int i11 = d.f4636d;
        i.a aVar = i.f4653a;
        remoteViews.setTextViewText(i11, aVar.a(context, widgetItem.getTitle()));
        remoteViews.setTextViewText(d.f4635c, aVar.a(context, widgetItem.getSubtitle()));
        File filesDir = context.getFilesDir();
        AbstractC4862t.d(filesDir, "getFilesDir(...)");
        File fileR = sc.l.r(filesDir, "../app_flutter/AndroidWidgetsThumbs");
        if (!fileR.exists()) {
            logger.b("thumbsPath " + fileR + " does NOT exist");
            return remoteViews;
        }
        File fileR2 = sc.l.r(fileR, widgetItem.getId() + ".png");
        if (fileR2.exists()) {
            remoteViews.setImageViewBitmap(d.f4638f, BitmapFactory.decodeFile(fileR2.getAbsolutePath()));
            return remoteViews;
        }
        logger.b("thumb " + fileR2 + " does NOT exist");
        return remoteViews;
    }
}
