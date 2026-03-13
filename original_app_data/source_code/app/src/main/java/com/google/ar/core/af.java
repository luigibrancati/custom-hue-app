package com.google.ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class af implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f31118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f31119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f31120c;

    public af(x xVar, Activity activity, v vVar) {
        this.f31118a = activity;
        this.f31119b = vVar;
        Objects.requireNonNull(xVar);
        this.f31120c = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.ar.core.dependencies.h hVarF = this.f31120c.f();
            Activity activity = this.f31118a;
            String str = activity.getApplicationInfo().packageName;
            List listSingletonList = Collections.singletonList(x.k());
            Bundle bundle = new Bundle();
            v vVar = this.f31119b;
            hVarF.d(str, listSingletonList, bundle, new ad(this, atomicBoolean, vVar, activity));
            new Handler().postDelayed(new ae(this, atomicBoolean, activity, vVar), 3000L);
        } catch (RemoteException e10) {
            Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e10);
            this.f31120c.i(this.f31118a, this.f31119b);
        }
    }
}
