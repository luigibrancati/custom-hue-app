package androidx.work.impl.diagnostics;

import I3.AbstractC0890u;
import I3.M;
import I3.x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24795a = AbstractC0890u.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC0890u.e().a(f24795a, "Requesting diagnostics");
        try {
            M.e(context).c(x.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC0890u.e().d(f24795a, "WorkManager is not initialized", e10);
        }
    }
}
