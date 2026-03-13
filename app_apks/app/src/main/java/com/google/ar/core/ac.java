package com.google.ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class ac extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f31109a;

    public ac(x xVar, v vVar) {
        this.f31109a = vVar;
        Objects.requireNonNull(xVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zEquals = "com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(intent.getAction());
        Bundle extras = intent.getExtras();
        if (zEquals && extras != null && extras.containsKey("install.status")) {
            int i10 = extras.getInt("install.status");
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                this.f31109a.a(w.ACCEPTED);
            } else if (i10 == 4) {
                this.f31109a.a(w.COMPLETED);
            } else {
                if (i10 != 6) {
                    return;
                }
                this.f31109a.a(w.CANCELLED);
            }
        }
    }
}
