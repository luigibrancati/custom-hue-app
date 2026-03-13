package com.google.android.gms.internal.mlkit_vision_barcode;

import N6.C1383l;
import N6.InterfaceC1396m;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzal extends zzb implements InterfaceC1396m {
    public static InterfaceC1396m zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1396m ? (InterfaceC1396m) iInterfaceQueryLocalInterface : new C1383l(iBinder);
    }
}
