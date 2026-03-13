package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbm extends zzb implements N {
    public zzbm() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c();
            parcel2.writeNoException();
        } else if (i10 == 2) {
            e();
            parcel2.writeNoException();
        } else if (i10 == 3) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            C3385d0 c3385d0 = (C3385d0) AbstractC3370a0.a(parcel, C3385d0.CREATOR);
            AbstractC3370a0.b(parcel);
            List listI4 = i4(iObjectWrapperAsInterface, c3385d0);
            parcel2.writeNoException();
            parcel2.writeTypedList(listI4);
        } else if (i10 == 4) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            C3385d0 c3385d02 = (C3385d0) AbstractC3370a0.a(parcel, C3385d0.CREATOR);
            D d10 = (D) AbstractC3370a0.a(parcel, D.CREATOR);
            AbstractC3370a0.b(parcel);
            List listS1 = S1(iObjectWrapperAsInterface2, c3385d02, d10);
            parcel2.writeNoException();
            parcel2.writeTypedList(listS1);
        } else {
            if (i10 != 5) {
                return false;
            }
            F f10 = (F) AbstractC3370a0.a(parcel, F.CREATOR);
            AbstractC3370a0.b(parcel);
            P1(f10);
            parcel2.writeNoException();
        }
        return true;
    }
}
