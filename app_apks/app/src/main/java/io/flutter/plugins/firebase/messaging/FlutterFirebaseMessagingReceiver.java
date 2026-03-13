package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.firebase.messaging.T;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {
    private static final String TAG = "FLTFireMsgReceiver";
    static HashMap<String, T> notifications = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "broadcast received for message");
        if (ContextHolder.getApplicationContext() == null) {
            ContextHolder.setApplicationContext(context.getApplicationContext() != null ? context.getApplicationContext() : context);
        }
        if (intent.getExtras() == null) {
            Log.d(TAG, "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        T t10 = new T(intent.getExtras());
        if (t10.n() != null) {
            notifications.put(t10.h(), t10);
            FlutterFirebaseMessagingStore.getInstance().storeFirebaseMessage(t10);
        }
        if (FlutterFirebaseMessagingUtils.isApplicationForeground(context)) {
            FlutterFirebaseRemoteMessageLiveData.getInstance().postRemoteMessage(t10);
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) FlutterFirebaseMessagingBackgroundService.class);
        Parcel parcelObtain = Parcel.obtain();
        t10.writeToParcel(parcelObtain, 0);
        intent2.putExtra("notification", parcelObtain.marshall());
        FlutterFirebaseMessagingBackgroundService.enqueueMessageProcessing(context, intent2, t10.r() == 1);
    }
}
