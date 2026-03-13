package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import io.flutter.embedding.engine.FlutterShellArgs;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseMessagingBackgroundService extends JobIntentService {
    private static final String TAG = "FLTFireMsgService";
    private static FlutterFirebaseMessagingBackgroundExecutor flutterBackgroundExecutor;
    private static final List<Intent> messagingQueue = Collections.synchronizedList(new LinkedList());

    public static void enqueueMessageProcessing(Context context, Intent intent, boolean z10) {
        JobIntentService.enqueueWork(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, z10);
    }

    public static void onInitialized() {
        Log.i(TAG, "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = messagingQueue;
        synchronized (list) {
            try {
                Iterator<Intent> it = list.iterator();
                while (it.hasNext()) {
                    flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(it.next(), null);
                }
                messagingQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setCallbackDispatcher(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setCallbackDispatcher(j10);
    }

    public static void setUserCallbackHandle(long j10) {
        FlutterFirebaseMessagingBackgroundExecutor.setUserCallbackHandle(j10);
    }

    public static void startBackgroundIsolate(long j10, FlutterShellArgs flutterShellArgs) {
        if (flutterBackgroundExecutor != null) {
            Log.w(TAG, "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        flutterBackgroundExecutor = flutterFirebaseMessagingBackgroundExecutor;
        flutterFirebaseMessagingBackgroundExecutor.startBackgroundIsolate(j10, flutterShellArgs);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ boolean isStopped() {
        return super.isStopped();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (flutterBackgroundExecutor == null) {
            flutterBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
        }
        flutterBackgroundExecutor.startBackgroundIsolate();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public void onHandleWork(final Intent intent) {
        if (!flutterBackgroundExecutor.isDartBackgroundHandlerRegistered()) {
            Log.w(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = messagingQueue;
        synchronized (list) {
            try {
                if (flutterBackgroundExecutor.isNotRunning()) {
                    Log.i(TAG, "Service has not yet started, messages will be queued.");
                    list.add(intent);
                    return;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterFirebaseMessagingBackgroundService.flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(intent, countDownLatch);
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e10) {
                    Log.i(TAG, "Exception waiting to execute Dart callback", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // io.flutter.plugins.firebase.messaging.JobIntentService
    public /* bridge */ /* synthetic */ boolean onStopCurrentWork() {
        return super.onStopCurrentWork();
    }
}
