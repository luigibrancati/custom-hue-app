package com.google.android.gms.internal.maps;

import L6.n;
import L6.s;
import L6.y;
import L6.z;
import U6.C2285l;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzas extends zzb implements n {
    public zzas() {
        super("com.google.android.gms.maps.model.internal.IStyleFactory");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        z yVar;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            yVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureDelegate");
            yVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new y(strongBinder);
        }
        s.b(parcel);
        C2285l c2285lR3 = r3(yVar);
        parcel2.writeNoException();
        s.d(parcel2, c2285lR3);
        return true;
    }
}
