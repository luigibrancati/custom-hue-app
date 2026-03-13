package com.google.ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.exceptions.FatalException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class ad extends com.google.ar.core.dependencies.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f31110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f31111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f31112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f31113d;

    public ad(af afVar, AtomicBoolean atomicBoolean, v vVar, Activity activity) {
        this.f31110a = atomicBoolean;
        this.f31113d = vVar;
        this.f31111b = activity;
        Objects.requireNonNull(afVar);
        this.f31112c = afVar;
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) {
        if (this.f31110a.getAndSet(true)) {
        }
        int i10 = bundle.getInt("error.code", -100);
        int i11 = bundle.getInt("install.status", 0);
        if (i11 == 4) {
            this.f31113d.a(w.COMPLETED);
            return;
        }
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
            sb2.append("requestInstall = ");
            sb2.append(i10);
            sb2.append(", launching fullscreen.");
            Log.w("ARCore-InstallService", sb2.toString());
            af afVar = this.f31112c;
            afVar.f31120c.i(this.f31111b, this.f31113d);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            af afVar2 = this.f31112c;
            afVar2.f31120c.j(this.f31111b, bundle, this.f31113d);
            return;
        }
        if (i11 == 10) {
            this.f31113d.b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            return;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                this.f31113d.a(w.ACCEPTED);
                break;
            case 4:
                this.f31113d.a(w.COMPLETED);
                break;
            case 5:
                this.f31113d.b(new FatalException("Unexpected FAILED install status without error."));
                break;
            case 6:
                this.f31113d.a(w.CANCELLED);
                break;
            default:
                this.f31113d.b(new FatalException(p.b((byte) 27, i11, "Unexpected install status: ")));
                break;
        }
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) {
    }
}
