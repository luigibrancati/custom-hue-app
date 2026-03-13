package L6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends AbstractC1164a implements D {
    public C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // L6.D
    public final void I(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(15, parcelK);
    }

    @Override // L6.D
    public final void I3(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(13, parcelK);
    }

    @Override // L6.D
    public final void J5(float f10, float f11) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        parcelK.writeFloat(f11);
        X(6, parcelK);
    }

    @Override // L6.D
    public final boolean N4(D d10) {
        Parcel parcelK = K();
        s.e(parcelK, d10);
        Parcel parcelD = D(19, parcelK);
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.D
    public final boolean V() {
        Parcel parcelD = D(16, K());
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.D
    public final void Y5(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(11, parcelK);
    }

    @Override // L6.D
    public final float c() {
        Parcel parcelD = D(12, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.D
    public final float d() {
        Parcel parcelD = D(8, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.D
    public final float e() {
        Parcel parcelD = D(18, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.D
    public final float f() {
        Parcel parcelD = D(14, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.D
    public final int g() {
        Parcel parcelD = D(20, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // L6.D
    public final boolean g0() {
        Parcel parcelD = D(23, K());
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.D
    public final void g2(IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        s.e(parcelK, iObjectWrapper);
        X(21, parcelK);
    }

    @Override // L6.D
    public final LatLng h() {
        Parcel parcelD = D(4, K());
        LatLng latLng = (LatLng) s.a(parcelD, LatLng.CREATOR);
        parcelD.recycle();
        return latLng;
    }

    @Override // L6.D
    public final float i() {
        Parcel parcelD = D(7, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.D
    public final void i1(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(17, parcelK);
    }

    @Override // L6.D
    public final void i2(LatLng latLng) {
        Parcel parcelK = K();
        s.c(parcelK, latLng);
        X(3, parcelK);
    }

    @Override // L6.D
    public final LatLngBounds j() {
        Parcel parcelD = D(10, K());
        LatLngBounds latLngBounds = (LatLngBounds) s.a(parcelD, LatLngBounds.CREATOR);
        parcelD.recycle();
        return latLngBounds;
    }

    @Override // L6.D
    public final void m() {
        X(1, K());
    }

    @Override // L6.D
    public final String p() {
        Parcel parcelD = D(2, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.D
    public final void s5(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(5, parcelK);
    }

    @Override // L6.D
    public final void u0(LatLngBounds latLngBounds) {
        Parcel parcelK = K();
        s.c(parcelK, latLngBounds);
        X(9, parcelK);
    }

    @Override // L6.D
    public final void w(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(22, parcelK);
    }
}
