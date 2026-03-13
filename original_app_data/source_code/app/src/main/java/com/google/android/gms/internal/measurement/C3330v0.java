package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3330v0 extends N implements InterfaceC3346x0 {
    public C3330v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3346x0
    public final int e() {
        Parcel parcelD = D(2, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3346x0
    public final void q0(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        O.c(parcelK, bundle);
        parcelK.writeLong(j10);
        X(1, parcelK);
    }
}
