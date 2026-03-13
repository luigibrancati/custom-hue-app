package v6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import s6.C5771A;
import s6.C5773C;
import s6.C5775E;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends J6.a implements F {
    public E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // v6.F
    public final C5773C E0(C5771A c5771a) {
        Parcel parcelK = K();
        J6.n.c(parcelK, c5771a);
        Parcel parcelD = D(6, parcelK);
        C5773C c5773c = (C5773C) J6.n.b(parcelD, C5773C.CREATOR);
        parcelD.recycle();
        return c5773c;
    }

    @Override // v6.F
    public final boolean i() {
        Parcel parcelD = D(7, K());
        boolean zA = J6.n.a(parcelD);
        parcelD.recycle();
        return zA;
    }

    @Override // v6.F
    public final C5773C k3(C5771A c5771a) {
        Parcel parcelK = K();
        J6.n.c(parcelK, c5771a);
        Parcel parcelD = D(8, parcelK);
        C5773C c5773c = (C5773C) J6.n.b(parcelD, C5773C.CREATOR);
        parcelD.recycle();
        return c5773c;
    }

    @Override // v6.F
    public final boolean o0(C5775E c5775e, IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        J6.n.c(parcelK, c5775e);
        J6.n.e(parcelK, iObjectWrapper);
        Parcel parcelD = D(5, parcelK);
        boolean zA = J6.n.a(parcelD);
        parcelD.recycle();
        return zA;
    }
}
