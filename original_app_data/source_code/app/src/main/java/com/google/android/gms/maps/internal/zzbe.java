package com.google.android.gms.maps.internal;

import L6.s;
import T6.InterfaceC2252z;
import U6.C2294v;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbe extends zzb implements InterfaceC2252z {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C2294v c2294v = (C2294v) s.a(parcel, C2294v.CREATOR);
        s.b(parcel);
        p5(c2294v);
        parcel2.writeNoException();
        return true;
    }
}
