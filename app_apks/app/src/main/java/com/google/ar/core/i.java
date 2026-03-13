package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f31191a;

    public i(k kVar) {
        Objects.requireNonNull(kVar);
        this.f31191a = kVar;
    }

    @Override // com.google.ar.core.h
    public final void a(ArCoreApk.Availability availability) {
        k kVar = this.f31191a;
        synchronized (kVar) {
            kVar.f(availability);
            kVar.g();
        }
    }
}
