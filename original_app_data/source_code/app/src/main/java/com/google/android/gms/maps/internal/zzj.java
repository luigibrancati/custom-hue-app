package com.google.android.gms.maps.internal;

import L6.s;
import T6.C2240m;
import T6.InterfaceC2230c;
import T6.InterfaceC2241n;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzj extends zzb implements InterfaceC2230c {
    public zzj() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2241n c2240m;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c2240m = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                c2240m = iInterfaceQueryLocalInterface instanceof InterfaceC2241n ? (InterfaceC2241n) iInterfaceQueryLocalInterface : new C2240m(strongBinder);
            }
            s.b(parcel);
            h0(c2240m);
        } else {
            if (i10 != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}
