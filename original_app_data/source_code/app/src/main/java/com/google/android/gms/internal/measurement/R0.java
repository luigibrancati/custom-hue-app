package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R0 extends zzcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f29322a;

    public R0(S0 s02, Runnable runnable) {
        this.f29322a = runnable;
        Objects.requireNonNull(s02);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3322u0
    public final void d() {
        this.f29322a.run();
    }
}
