package com.google.android.gms.common.internal;

import J6.n;
import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends J6.a implements IAccountAccessor {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel parcelD = D(2, K());
        Account account = (Account) n.b(parcelD, Account.CREATOR);
        parcelD.recycle();
        return account;
    }
}
