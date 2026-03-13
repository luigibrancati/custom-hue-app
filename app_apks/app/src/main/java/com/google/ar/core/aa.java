package com.google.ar.core;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f31103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f31104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f31105c;

    public aa(x xVar, Context context, h hVar) {
        this.f31103a = context;
        this.f31104b = hVar;
        Objects.requireNonNull(xVar);
        this.f31105c = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31105c.f().e(this.f31103a.getApplicationInfo().packageName, x.k(), new z(this, this.f31104b));
        } catch (RemoteException e10) {
            Log.e("ARCore-InstallService", "requestInfo threw", e10);
            this.f31104b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
