package X6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X6 implements Parcelable.Creator {
    public static void a(W6 w62, Parcel parcel, int i10) {
        int i11 = w62.f18639a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.w(parcel, 2, w62.f18640b, false);
        w6.c.s(parcel, 3, w62.f18641c);
        w6.c.t(parcel, 4, w62.f18642d, false);
        w6.c.l(parcel, 5, null, false);
        w6.c.w(parcel, 6, w62.f18643e, false);
        w6.c.w(parcel, 7, w62.f18644f, false);
        w6.c.i(parcel, 8, w62.f18645g, false);
        w6.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        Long lA = null;
        Float fT = null;
        String strG2 = null;
        String strG3 = null;
        Double dR = null;
        long jZ = 0;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 3:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 4:
                    lA = w6.b.A(parcel, iU);
                    break;
                case 5:
                    fT = w6.b.t(parcel, iU);
                    break;
                case 6:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 7:
                    strG3 = w6.b.g(parcel, iU);
                    break;
                case 8:
                    dR = w6.b.r(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new W6(iW, strG, jZ, lA, fT, strG2, strG3, dR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new W6[i10];
    }
}
