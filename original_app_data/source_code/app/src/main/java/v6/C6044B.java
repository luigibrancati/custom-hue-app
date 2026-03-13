package v6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: renamed from: v6.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6044B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        Account account = null;
        int iW = 0;
        int iW2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                account = (Account) w6.b.f(parcel, iU, Account.CREATOR);
            } else if (iM == 3) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                googleSignInAccount = (GoogleSignInAccount) w6.b.f(parcel, iU, GoogleSignInAccount.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new C6043A(iW, account, iW2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6043A[i10];
    }
}
