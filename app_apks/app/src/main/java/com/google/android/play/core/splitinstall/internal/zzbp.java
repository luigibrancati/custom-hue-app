package com.google.android.play.core.splitinstall.internal;

import B7.D;
import B7.X;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbp extends zzl implements D {
    public zzbp() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzl
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                int i12 = parcel.readInt();
                Bundle bundle = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                t2(i12, bundle);
                return true;
            case 3:
                int i13 = parcel.readInt();
                Bundle bundle2 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                Y1(i13, bundle2);
                return true;
            case 4:
                int i14 = parcel.readInt();
                Bundle bundle3 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                P(i14, bundle3);
                return true;
            case 5:
                int i15 = parcel.readInt();
                Bundle bundle4 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                h3(i15, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                o2(bundle5);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                X.b(parcel);
                t0(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                m4(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                m5(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                Z1(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                N2(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                V4(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) X.a(parcel, Bundle.CREATOR);
                X.b(parcel);
                Q(bundle11);
                return true;
            default:
                return false;
        }
    }
}
