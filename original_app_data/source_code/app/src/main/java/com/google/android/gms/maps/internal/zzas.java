package com.google.android.gms.maps.internal;

import L6.s;
import T6.InterfaceC2229b;
import T6.InterfaceC2245s;
import T6.Q;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzas extends zzb implements InterfaceC2245s {
    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2229b q10;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            q10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            q10 = iInterfaceQueryLocalInterface instanceof InterfaceC2229b ? (InterfaceC2229b) iInterfaceQueryLocalInterface : new Q(strongBinder);
        }
        s.b(parcel);
        y2(q10);
        parcel2.writeNoException();
        return true;
    }
}
