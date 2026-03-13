package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationManagerCompat;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.EventChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f28855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static FlutterEngine f28856c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public R5.a f28857a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements EventChannel.StreamHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f28858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EventChannel.EventSink f28859b;

        public void a(Map map) {
            EventChannel.EventSink eventSink = this.f28859b;
            if (eventSink != null) {
                eventSink.success(map);
            } else {
                this.f28858a.add(map);
            }
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            this.f28859b = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            Iterator it = this.f28858a.iterator();
            while (it.hasNext()) {
                eventSink.success((Map) it.next());
            }
            this.f28858a.clear();
            this.f28859b = eventSink;
        }

        public a() {
            this.f28858a = new ArrayList();
        }
    }

    @Keep
    public ActionBroadcastReceiver() {
    }

    public final void a(DartExecutor dartExecutor) {
        new EventChannel(dartExecutor.getBinaryMessenger(), "dexterous.com/flutter/local_notifications/actions").setStreamHandler(f28855b);
    }

    public final void b(Context context) {
        if (f28856c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        flutterLoader.startInitialization(context);
        flutterLoader.ensureInitializationComplete(context, null);
        f28856c = new FlutterEngine(context);
        FlutterCallbackInformation flutterCallbackInformationD = this.f28857a.d();
        if (flutterCallbackInformationD == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        DartExecutor dartExecutor = f28856c.getDartExecutor();
        a(dartExecutor);
        dartExecutor.executeDartCallback(new DartExecutor.DartCallback(context.getAssets(), flutterLoader.findAppBundlePath(), flutterCallbackInformationD));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            R5.a aVar = this.f28857a;
            if (aVar == null) {
                aVar = new R5.a(context);
            }
            this.f28857a = aVar;
            Map<String, Object> mapExtractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
            if (intent.getBooleanExtra("cancelNotification", false)) {
                int iIntValue = ((Integer) mapExtractNotificationResponseMap.get("notificationId")).intValue();
                Object obj = mapExtractNotificationResponseMap.get("notificationTag");
                if (obj instanceof String) {
                    NotificationManagerCompat.from(context).cancel((String) obj, iIntValue);
                } else {
                    NotificationManagerCompat.from(context).cancel(iIntValue);
                }
            }
            if (f28855b == null) {
                f28855b = new a();
            }
            f28855b.a(mapExtractNotificationResponseMap);
            b(context);
        }
    }
}
