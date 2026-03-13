package com.google.ar.core;

import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class z extends com.google.ar.core.dependencies.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f31241a;

    public z(aa aaVar, h hVar) {
        this.f31241a = hVar;
        Objects.requireNonNull(aaVar);
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) {
        int i10 = bundle.getInt("error.code", -100);
        if (i10 == -5) {
            Log.e("ARCore-InstallService", "The device is not supported.");
            this.f31241a.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i10 == -3) {
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.f31241a.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i10 == 0) {
            this.f31241a.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        } else {
            Log.e("ARCore-InstallService", p.b((byte) 22, i10, "requestInfo returned: "));
            this.f31241a.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) {
    }
}
