package com.google.ar.core.dependencies;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends c implements h {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    @Override // com.google.ar.core.dependencies.h
    public final void d(String str, List list, Bundle bundle, j jVar) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeTypedList(list);
        e.b(parcelA, bundle);
        e.c(parcelA, jVar);
        c(1, parcelA);
    }

    @Override // com.google.ar.core.dependencies.h
    public final void e(String str, Bundle bundle, j jVar) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        e.b(parcelA, bundle);
        e.c(parcelA, jVar);
        c(2, parcelA);
    }
}
