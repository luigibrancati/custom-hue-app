package com.google.android.gms.measurement;

import X6.C2363c6;
import X6.Y5;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements Y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2363c6 f30368a;

    public final C2363c6 a() {
        if (this.f30368a == null) {
            this.f30368a = new C2363c6(this);
        }
        return this.f30368a;
    }

    @Override // X6.Y5
    public final boolean o(int i10) {
        throw new UnsupportedOperationException();
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

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a();
        C2363c6.j(intent);
        return true;
    }

    @Override // X6.Y5
    public final void q(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // X6.Y5
    public final void p(Intent intent) {
    }
}
