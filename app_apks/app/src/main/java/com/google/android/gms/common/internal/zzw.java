package com.google.android.gms.common.internal;

import J6.n;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import v6.Y;
import v6.Z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzw extends zzb implements Z {
    public zzw() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static Z zzg(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof Z ? (Z) iInterfaceQueryLocalInterface : new Y(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperC = c();
            parcel2.writeNoException();
            n.e(parcel2, iObjectWrapperC);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
