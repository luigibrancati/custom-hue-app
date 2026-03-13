package com.google.android.gms.internal.location;

import K6.AbstractC1047l;
import K6.m0;
import android.app.PendingIntent;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzs extends zzb implements m0 {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            AbstractC1047l.d(parcel);
            F6(i12, strArrCreateStringArray);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            AbstractC1047l.d(parcel);
            I0(i13, strArrCreateStringArray2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) AbstractC1047l.a(parcel, PendingIntent.CREATOR);
            AbstractC1047l.d(parcel);
            f3(i14, pendingIntent);
        }
        return true;
    }
}
