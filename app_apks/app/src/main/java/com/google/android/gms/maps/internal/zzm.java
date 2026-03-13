package com.google.android.gms.maps.internal;

import L6.s;
import T6.U;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzm extends zzb implements U {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) s.a(parcel, CameraPosition.CREATOR);
        s.b(parcel);
        I2(cameraPosition);
        parcel2.writeNoException();
        return true;
    }
}
