package com.google.android.gms.internal.mlkit_vision_barcode;

import N6.Qb;
import N6.Rb;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzyn extends zzb implements Rb {
    public static Rb zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof Rb ? (Rb) iInterfaceQueryLocalInterface : new Qb(iBinder);
    }
}
