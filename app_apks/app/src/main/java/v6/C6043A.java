package v6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: v6.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6043A extends AbstractC6157a {
    public static final Parcelable.Creator<C6043A> CREATOR = new C6044B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f45777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f45779d;

    public C6043A(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f45776a = i10;
        this.f45777b = account;
        this.f45778c = i11;
        this.f45779d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f45776a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.u(parcel, 2, this.f45777b, i10, false);
        w6.c.n(parcel, 3, this.f45778c);
        w6.c.u(parcel, 4, this.f45779d, i10, false);
        w6.c.b(parcel, iA);
    }

    public C6043A(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
