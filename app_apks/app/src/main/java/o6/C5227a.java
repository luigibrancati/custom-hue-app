package o6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import w6.b;

/* JADX INFO: renamed from: o6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5227a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = b.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Uri uri = null;
        String strG5 = null;
        String strG6 = null;
        ArrayList arrayListK = null;
        String strG7 = null;
        String strG8 = null;
        long jZ = 0;
        while (parcel.dataPosition() < iE) {
            int iU = b.u(parcel);
            switch (b.m(iU)) {
                case 2:
                    strG = b.g(parcel, iU);
                    break;
                case 3:
                    strG2 = b.g(parcel, iU);
                    break;
                case 4:
                    strG3 = b.g(parcel, iU);
                    break;
                case 5:
                    strG4 = b.g(parcel, iU);
                    break;
                case 6:
                    uri = (Uri) b.f(parcel, iU, Uri.CREATOR);
                    break;
                case 7:
                    strG5 = b.g(parcel, iU);
                    break;
                case 8:
                    jZ = b.z(parcel, iU);
                    break;
                case 9:
                    strG6 = b.g(parcel, iU);
                    break;
                case 10:
                    arrayListK = b.k(parcel, iU, Scope.CREATOR);
                    break;
                case 11:
                    strG7 = b.g(parcel, iU);
                    break;
                case 12:
                    strG8 = b.g(parcel, iU);
                    break;
                default:
                    b.D(parcel, iU);
                    break;
            }
        }
        b.l(parcel, iE);
        return new GoogleSignInAccount(strG, strG2, strG3, strG4, uri, strG5, jZ, strG6, arrayListK, strG7, strG8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
