package com.google.android.gms.location;

import K6.AbstractC1047l;
import R6.C2066a;
import R6.H;
import R6.I;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzs extends zzb implements I {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static I zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof I ? (I) iInterfaceQueryLocalInterface : new H(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C2066a c2066a = (C2066a) AbstractC1047l.a(parcel, C2066a.CREATOR);
        AbstractC1047l.d(parcel);
        m6(c2066a);
        return true;
    }
}
