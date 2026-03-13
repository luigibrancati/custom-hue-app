package X6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X6.x6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2530x6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        byte[] bArrB = null;
        String strG = null;
        Bundle bundleA = null;
        String strG2 = null;
        long jZ = 0;
        long jZ2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 2:
                    bArrB = w6.b.b(parcel, iU);
                    break;
                case 3:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 4:
                    bundleA = w6.b.a(parcel, iU);
                    break;
                case 5:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 6:
                    jZ2 = w6.b.z(parcel, iU);
                    break;
                case 7:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C2522w6(jZ, bArrB, strG, bundleA, iW, jZ2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2522w6[i10];
    }
}
