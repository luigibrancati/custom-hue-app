package com.google.android.gms.maps.internal;

import L6.s;
import T6.G;
import T6.InterfaceC2233f;
import T6.J;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbs extends zzb implements G {
    public zzbs() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2233f j10;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            j10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            j10 = iInterfaceQueryLocalInterface instanceof InterfaceC2233f ? (InterfaceC2233f) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        s.b(parcel);
        i3(j10);
        parcel2.writeNoException();
        return true;
    }
}
