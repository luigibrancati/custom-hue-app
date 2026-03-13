package com.google.android.gms.signin.internal;

import H6.b;
import Z6.d;
import Z6.j;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zad extends zab implements d {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean I6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                b.d(parcel);
                break;
            case 4:
                b.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                b.d(parcel);
                break;
            case 7:
                b.d(parcel);
                break;
            case 8:
                j jVar = (j) b.a(parcel, j.CREATOR);
                b.d(parcel);
                b5(jVar);
                break;
            case 9:
                b.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
