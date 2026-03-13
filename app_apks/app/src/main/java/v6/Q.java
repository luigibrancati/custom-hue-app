package v6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import s6.C5785d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Parcelable.Creator {
    public static void a(com.google.android.gms.common.internal.b bVar, Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, bVar.f29074a);
        w6.c.n(parcel, 2, bVar.f29075b);
        w6.c.n(parcel, 3, bVar.f29076c);
        w6.c.w(parcel, 4, bVar.f29077d, false);
        w6.c.m(parcel, 5, bVar.f29078e, false);
        w6.c.z(parcel, 6, bVar.f29079f, i10, false);
        w6.c.e(parcel, 7, bVar.f29080g, false);
        w6.c.u(parcel, 8, bVar.f29081h, i10, false);
        w6.c.z(parcel, 10, bVar.f29082i, i10, false);
        w6.c.z(parcel, 11, bVar.f29083j, i10, false);
        w6.c.c(parcel, 12, bVar.f29084k);
        w6.c.n(parcel, 13, bVar.f29085l);
        w6.c.c(parcel, 14, bVar.f29086m);
        w6.c.w(parcel, 15, bVar.d(), false);
        w6.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        Scope[] scopeArr = com.google.android.gms.common.internal.b.f29072o;
        Bundle bundle = new Bundle();
        C5785d[] c5785dArr = com.google.android.gms.common.internal.b.f29073p;
        C5785d[] c5785dArr2 = c5785dArr;
        String strG = null;
        IBinder iBinderV = null;
        Account account = null;
        String strG2 = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zN = false;
        int iW4 = 0;
        boolean zN2 = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 3:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 4:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 5:
                    iBinderV = w6.b.v(parcel, iU);
                    break;
                case 6:
                    scopeArr = (Scope[]) w6.b.j(parcel, iU, Scope.CREATOR);
                    break;
                case 7:
                    bundle = w6.b.a(parcel, iU);
                    break;
                case 8:
                    account = (Account) w6.b.f(parcel, iU, Account.CREATOR);
                    break;
                case 9:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 10:
                    c5785dArr = (C5785d[]) w6.b.j(parcel, iU, C5785d.CREATOR);
                    break;
                case 11:
                    c5785dArr2 = (C5785d[]) w6.b.j(parcel, iU, C5785d.CREATOR);
                    break;
                case 12:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 13:
                    iW4 = w6.b.w(parcel, iU);
                    break;
                case 14:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 15:
                    strG2 = w6.b.g(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new com.google.android.gms.common.internal.b(iW, iW2, iW3, strG, iBinderV, scopeArr, bundle, account, c5785dArr, c5785dArr2, zN, iW4, zN2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new com.google.android.gms.common.internal.b[i10];
    }
}
