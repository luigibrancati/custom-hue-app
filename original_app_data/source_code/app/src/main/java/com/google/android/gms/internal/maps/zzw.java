package com.google.android.gms.internal.maps;

import L6.C;
import L6.D;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzw extends zzb implements D {
    public static D zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return iInterfaceQueryLocalInterface instanceof D ? (D) iInterfaceQueryLocalInterface : new C(iBinder);
    }
}
