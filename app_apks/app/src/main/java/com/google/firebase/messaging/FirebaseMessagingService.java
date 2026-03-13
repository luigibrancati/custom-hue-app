package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import r6.C5645a;
import r6.C5647c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC3686h {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private C5647c rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public final boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    public final void f(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (M.t(extras)) {
            M m10 = new M(extras);
            ExecutorService executorServiceE = AbstractC3692n.e();
            try {
                if (new C3683e(this, m10, executorServiceE).a()) {
                    return;
                }
                executorServiceE.shutdown();
                if (K.E(intent)) {
                    K.w(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        onMessageReceived(new T(extras));
    }

    public final String g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3686h
    public Intent getStartCommandIntent(Intent intent) {
        return Y.b().c();
    }

    public final C5647c h(Context context) {
        if (this.rpc == null) {
            this.rpc = new C5647c(context.getApplicationContext());
        }
        return this.rpc;
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3686h
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            i(intent);
            return;
        }
        if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public final void i(Intent intent) {
        if (!e(intent.getStringExtra("google.message_id"))) {
            j(intent);
        }
        h(this).b(new C5645a(intent));
    }

    public final void j(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                K.y(intent);
                f(intent);
                break;
            case "send_error":
                onSendError(g(intent), new X(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    public void setRpcForTesting(C5647c c5647c) {
        this.rpc = c5647c;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(T t10) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }
}
