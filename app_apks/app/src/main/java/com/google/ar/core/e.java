package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
enum e extends ArCoreApk.Availability {
    public /* synthetic */ e() {
        super("SUPPORTED_NOT_INSTALLED", 4, 201, null);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
