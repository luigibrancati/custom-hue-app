package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3234k1 extends zzcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X6.X3 f29529a;

    public BinderC3234k1(X6.X3 x32) {
        this.f29529a = x32;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3346x0
    public final int e() {
        return System.identityHashCode(this.f29529a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3346x0
    public final void q0(String str, String str2, Bundle bundle, long j10) {
        this.f29529a.a(str, str2, bundle, j10);
    }
}
