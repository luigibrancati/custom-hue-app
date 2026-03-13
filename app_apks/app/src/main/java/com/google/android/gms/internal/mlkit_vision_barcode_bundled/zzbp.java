package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbp extends zzb implements P {
    public zzbp() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static P asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof P ? (P) iInterfaceQueryLocalInterface : new O(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        B b10 = (B) AbstractC3370a0.a(parcel, B.CREATOR);
        AbstractC3370a0.b(parcel);
        N nNewBarcodeScanner = newBarcodeScanner(iObjectWrapperAsInterface, b10);
        parcel2.writeNoException();
        if (nNewBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(nNewBarcodeScanner.asBinder());
        }
        return true;
    }
}
