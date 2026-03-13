package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3691m;
import com.google.firebase.messaging.K;
import java.util.concurrent.ExecutionException;
import r6.AbstractC5646b;
import r6.C5645a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC5646b {
    public static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // r6.AbstractC5646b
    public int b(Context context, C5645a c5645a) {
        try {
            return ((Integer) Tasks.await(new C3691m(context).g(c5645a.d()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // r6.AbstractC5646b
    public void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (K.E(intentF)) {
            K.v(intentF);
        }
    }
}
