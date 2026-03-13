package com.google.android.gms.maps.internal;

import T6.N;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzc extends zzb implements N {
    public zzc() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            b();
        } else {
            if (i10 != 2) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
