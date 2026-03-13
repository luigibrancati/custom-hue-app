package com.google.android.gms.internal.maps;

import L6.C1166c;
import L6.InterfaceC1167d;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzac extends zzb implements InterfaceC1167d {
    public static InterfaceC1167d zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1167d ? (InterfaceC1167d) iInterfaceQueryLocalInterface : new C1166c(iBinder);
    }
}
