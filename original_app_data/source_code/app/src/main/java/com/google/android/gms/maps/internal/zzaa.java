package com.google.android.gms.maps.internal;

import L6.InterfaceC1165b;
import L6.s;
import T6.InterfaceC2236i;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzz;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaa extends zzb implements InterfaceC2236i {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzb();
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC1165b interfaceC1165bZzb = zzz.zzb(parcel.readStrongBinder());
            s.b(parcel);
            W2(interfaceC1165bZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
