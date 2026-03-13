package com.google.android.gms.measurement;

import X6.C2363c6;
import X6.Y5;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import v1.AbstractC6034a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2363c6 f30370a;

    private final C2363c6 a() {
        if (this.f30370a == null) {
            this.f30370a = new C2363c6(this);
        }
        return this.f30370a;
    }

    @Override // X6.Y5
    public final boolean o(int i10) {
        return stopSelfResult(i10);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return a().d(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        a();
        C2363c6.i(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        a().c(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a();
        C2363c6.j(intent);
        return true;
    }

    @Override // X6.Y5
    public final void p(Intent intent) {
        AbstractC6034a.b(intent);
    }

    @Override // X6.Y5
    public final void q(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }
}
