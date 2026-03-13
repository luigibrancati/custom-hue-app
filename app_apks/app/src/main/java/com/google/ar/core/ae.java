package com.google.ar.core;

import android.app.Activity;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f31114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f31115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f31116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f31117d;

    public ae(af afVar, AtomicBoolean atomicBoolean, Activity activity, v vVar) {
        this.f31114a = atomicBoolean;
        this.f31115b = activity;
        this.f31117d = vVar;
        Objects.requireNonNull(afVar);
        this.f31116c = afVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f31114a.getAndSet(true)) {
            return;
        }
        Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
        af afVar = this.f31116c;
        afVar.f31120c.i(this.f31115b, this.f31117d);
    }
}
