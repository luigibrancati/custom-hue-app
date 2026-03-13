package com.google.android.gms.maps.internal;

import L6.s;
import T6.I;
import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbv extends zzb implements I {
    public zzbv() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Bitmap bitmap = (Bitmap) s.a(parcel, Bitmap.CREATOR);
            s.b(parcel);
            G4(bitmap);
        } else {
            if (i10 != 2) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            s.b(parcel);
            A3(iObjectWrapperAsInterface);
        }
        parcel2.writeNoException();
        return true;
    }
}
