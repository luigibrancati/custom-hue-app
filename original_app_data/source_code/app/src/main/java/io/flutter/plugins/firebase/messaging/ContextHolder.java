package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ContextHolder {
    private static Context applicationContext;

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        applicationContext = context;
    }
}
