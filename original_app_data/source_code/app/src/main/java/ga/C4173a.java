package ga;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: renamed from: ga.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4173a {
    public static String a(Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SENDTO".equals(action)) {
            return null;
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            Log.d("com.llfbandit.app_links", "Handled intent: action: " + action + " / data: " + dataString);
        }
        return dataString;
    }
}
