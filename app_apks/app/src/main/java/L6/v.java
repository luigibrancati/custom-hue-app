package L6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends AbstractC1164a implements w {
    public v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // L6.w
    public final void F(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(15, parcelK);
    }

    @Override // L6.w
    public final void G5(double d10) {
        Parcel parcelK = K();
        parcelK.writeDouble(d10);
        X(5, parcelK);
    }

    @Override // L6.w
    public final boolean M0(w wVar) {
        Parcel parcelK = K();
        s.e(parcelK, wVar);
        Parcel parcelD = D(17, parcelK);
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.w
    public final void U(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(11, parcelK);
    }

    @Override // L6.w
    public final void X1(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(7, parcelK);
    }

    @Override // L6.w
    public final int g() {
        Parcel parcelD = D(18, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // L6.w
    public final String j() {
        Parcel parcelD = D(2, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.w
    public final void m() {
        X(1, K());
    }

    @Override // L6.w
    public final void q1(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(9, parcelK);
    }

    @Override // L6.w
    public final void t(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(13, parcelK);
    }

    @Override // L6.w
    public final void t4(LatLng latLng) {
        Parcel parcelK = K();
        s.c(parcelK, latLng);
        X(3, parcelK);
    }

    @Override // L6.w
    public final void w(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(19, parcelK);
    }
}
