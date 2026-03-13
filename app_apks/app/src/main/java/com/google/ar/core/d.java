package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
enum d extends ArCoreApk.Availability {
    public /* synthetic */ d() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }
}
