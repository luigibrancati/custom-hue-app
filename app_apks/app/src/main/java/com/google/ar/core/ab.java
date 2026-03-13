package com.google.ar.core;

import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class ab extends PackageInstaller.SessionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f31106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f31107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f31108c;

    public ab(x xVar, v vVar) {
        this.f31107b = vVar;
        Objects.requireNonNull(xVar);
        this.f31108c = xVar;
        this.f31106a = new HashMap();
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i10) {
        this.f31106a.put(Integer.valueOf(i10), this.f31108c.g().getSessionInfo(i10));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i10, boolean z10) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.f31106a.remove(Integer.valueOf(i10));
        if (sessionInfo == null || !"com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            return;
        }
        Log.i("ARCore-InstallService", "Detected ARCore install completion");
        this.f31107b.a(w.COMPLETED);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i10) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i10, boolean z10) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i10, float f10) {
    }
}
