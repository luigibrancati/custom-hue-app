package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.ar.core.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class C3653r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f31217a;

    public C3653r(InstallActivity installActivity, AtomicReference atomicReference) {
        this.f31217a = atomicReference;
        Objects.requireNonNull(installActivity);
    }

    @Override // com.google.ar.core.h
    public final void a(ArCoreApk.Availability availability) {
        this.f31217a.set(availability);
    }
}
