package L6;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC1164a implements k {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // L6.k
    public final void R1(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(13, parcelK);
    }

    @Override // L6.k
    public final boolean R3(k kVar) {
        Parcel parcelK = K();
        s.e(parcelK, kVar);
        Parcel parcelD = D(19, parcelK);
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.k
    public final void S2(List list) {
        Parcel parcelK = K();
        parcelK.writeList(list);
        X(5, parcelK);
    }

    @Override // L6.k
    public final void U(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(11, parcelK);
    }

    @Override // L6.k
    public final void a0(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(17, parcelK);
    }

    @Override // L6.k
    public final int g() {
        Parcel parcelD = D(20, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // L6.k
    public final String h() {
        Parcel parcelD = D(2, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.k
    public final void n() {
        X(1, K());
    }

    @Override // L6.k
    public final void q2(List list) {
        Parcel parcelK = K();
        parcelK.writeTypedList(list);
        X(3, parcelK);
    }

    @Override // L6.k
    public final void s(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(9, parcelK);
    }

    @Override // L6.k
    public final void t(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(7, parcelK);
    }

    @Override // L6.k
    public final void v2(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(15, parcelK);
    }

    @Override // L6.k
    public final void w(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(21, parcelK);
    }
}
