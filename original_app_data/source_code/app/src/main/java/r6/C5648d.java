package r6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: r6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5648d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            if (w6.b.m(iU) != 1) {
                w6.b.D(parcel, iU);
            } else {
                intent = (Intent) w6.b.f(parcel, iU, Intent.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new C5645a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5645a[i10];
    }
}
