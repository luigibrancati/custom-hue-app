package com.google.android.gms.internal.maps;

import L6.l;
import L6.m;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaq extends zzb implements m {
    public static m zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new l(iBinder);
    }
}
