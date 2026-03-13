package X6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements Parcelable.Creator {
    public static void a(I i10, Parcel parcel, int i11) {
        String str = i10.f18343a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, str, false);
        w6.c.u(parcel, 3, i10.f18344b, i11, false);
        w6.c.w(parcel, 4, i10.f18345c, false);
        w6.c.s(parcel, 5, i10.f18346d);
        w6.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        long jZ = 0;
        String strG = null;
        G g10 = null;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 3) {
                g10 = (G) w6.b.f(parcel, iU, G.CREATOR);
            } else if (iM == 4) {
                strG2 = w6.b.g(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                jZ = w6.b.z(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new I(strG, g10, strG2, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new I[i10];
    }
}
