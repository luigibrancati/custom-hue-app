package com.google.android.gms.internal.maps;

import L6.q;
import L6.r;
import L6.s;
import U6.I;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzay extends zzb implements r {
    public zzay() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static r zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new q(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        s.b(parcel);
        I iZ2 = z2(i12, i13, i14);
        parcel2.writeNoException();
        s.d(parcel2, iZ2);
        return true;
    }
}
