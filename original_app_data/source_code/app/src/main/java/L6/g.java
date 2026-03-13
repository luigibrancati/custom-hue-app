package L6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC1164a implements h {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // L6.h
    public final void C1(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(20, parcelK);
    }

    @Override // L6.h
    public final void D0(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(14, parcelK);
    }

    @Override // L6.h
    public final void D5(String str) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        X(7, parcelK);
    }

    @Override // L6.h
    public final boolean G() {
        Parcel parcelD = D(13, K());
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.h
    public final void H(IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        s.e(parcelK, iObjectWrapper);
        X(18, parcelK);
    }

    @Override // L6.h
    public final boolean I4(h hVar) {
        Parcel parcelK = K();
        s.e(parcelK, hVar);
        Parcel parcelD = D(16, parcelK);
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.h
    public final void N3(String str) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        X(5, parcelK);
    }

    @Override // L6.h
    public final void Y0(LatLng latLng) {
        Parcel parcelK = K();
        s.c(parcelK, latLng);
        X(3, parcelK);
    }

    @Override // L6.h
    public final void a0(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(9, parcelK);
    }

    @Override // L6.h
    public final String h() {
        Parcel parcelD = D(2, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.h
    public final int i() {
        Parcel parcelD = D(17, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // L6.h
    public final String j() {
        Parcel parcelD = D(8, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.h
    public final LatLng k() {
        Parcel parcelD = D(4, K());
        LatLng latLng = (LatLng) s.a(parcelD, LatLng.CREATOR);
        parcelD.recycle();
        return latLng;
    }

    @Override // L6.h
    public final void m() {
        X(12, K());
    }

    @Override // L6.h
    public final void n() {
        X(1, K());
    }

    @Override // L6.h
    public final String p() {
        Parcel parcelD = D(6, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.h
    public final void p6(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(25, parcelK);
    }

    @Override // L6.h
    public final void r5(float f10, float f11) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        parcelK.writeFloat(f11);
        X(19, parcelK);
    }

    @Override // L6.h
    public final void t(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(22, parcelK);
    }

    @Override // L6.h
    public final void x(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(27, parcelK);
    }

    @Override // L6.h
    public final void x0(float f10, float f11) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        parcelK.writeFloat(f11);
        X(24, parcelK);
    }

    @Override // L6.h
    public final void z() {
        X(11, K());
    }
}
