package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
enum b extends ArCoreApk.Availability {
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b() {
        int i10 = 1;
        super("UNKNOWN_CHECKING", i10, i10, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isTransient() {
        return true;
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
