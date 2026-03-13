package com.google.android.gms.measurement;

import X6.R2;
import X6.S2;
import android.content.Context;
import android.content.Intent;
import v1.AbstractC6034a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends AbstractC6034a implements R2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S2 f30369c;

    @Override // X6.R2
    public void a(Context context, Intent intent) {
        AbstractC6034a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f30369c == null) {
            this.f30369c = new S2(this);
        }
        this.f30369c.a(context, intent);
    }
}
