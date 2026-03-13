package com.google.android.gms.internal.maps;

import L6.E;
import L6.InterfaceC1165b;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzz extends zzb implements InterfaceC1165b {
    public static InterfaceC1165b zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1165b ? (InterfaceC1165b) iInterfaceQueryLocalInterface : new E(iBinder);
    }
}
