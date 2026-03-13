package com.google.android.gms.common.internal;

import J6.n;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import v6.InterfaceC6052g;
import v6.N;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzz extends zzb implements InterfaceC6052g {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) n.b(parcel, Bundle.CREATOR);
            n.f(parcel);
            a2(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) n.b(parcel, Bundle.CREATOR);
            n.f(parcel);
            P(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            N n10 = (N) n.b(parcel, N.CREATOR);
            n.f(parcel);
            a6(i14, strongBinder2, n10);
        }
        parcel2.writeNoException();
        return true;
    }
}
