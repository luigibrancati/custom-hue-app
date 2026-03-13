package s6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: s6.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5772B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        boolean zN5 = false;
        String strG = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 2:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 3:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 4:
                    iBinderV = w6.b.v(parcel, iU);
                    break;
                case 5:
                    zN3 = w6.b.n(parcel, iU);
                    break;
                case 6:
                    zN4 = w6.b.n(parcel, iU);
                    break;
                case 7:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 8:
                    zN5 = w6.b.n(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C5771A(strG, zN, zN2, iBinderV, zN3, zN4, zN5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5771A[i10];
    }
}
