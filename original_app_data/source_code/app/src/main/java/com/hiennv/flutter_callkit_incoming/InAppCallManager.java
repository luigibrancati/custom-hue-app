package com.hiennv.flutter_callkit_incoming;

import android.content.ComponentName;
import android.content.Context;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/InAppCallManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lfc/H;", "registerPhoneAccount", "()V", "unregisterPhoneAccount", "Landroid/telecom/PhoneAccountHandle;", "getPhoneAccountHandle", "()Landroid/telecom/PhoneAccountHandle;", "Landroid/content/Context;", "Companion", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InAppCallManager {
    private static final String ACCOUNT_ID = "flutter_callkit_incoming_in_app_call_account";
    private static final String TAG = "InAppCallManager";
    private final Context context;

    public InAppCallManager(Context context) {
        AbstractC4862t.e(context, "context");
        this.context = context;
    }

    public final PhoneAccountHandle getPhoneAccountHandle() {
        return new PhoneAccountHandle(new ComponentName(this.context, (Class<?>) CallkitConnectionService.class), ACCOUNT_ID);
    }

    public final void registerPhoneAccount() {
        Object systemService = this.context.getSystemService("telecom");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
        ((TelecomManager) systemService).registerPhoneAccount(PhoneAccount.builder(new PhoneAccountHandle(new ComponentName(this.context, (Class<?>) CallkitConnectionService.class), ACCOUNT_ID), "Callkit Incoming In-App Call").setCapabilities(RecognitionOptions.PDF417).build());
        Log.d(TAG, "PhoneAccount registered.");
    }

    public final void unregisterPhoneAccount() {
        Object systemService = this.context.getSystemService("telecom");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
        ((TelecomManager) systemService).unregisterPhoneAccount(new PhoneAccountHandle(new ComponentName(this.context, (Class<?>) CallkitConnectionService.class), ACCOUNT_ID));
        Log.d(TAG, "PhoneAccount unregistered.");
    }
}
