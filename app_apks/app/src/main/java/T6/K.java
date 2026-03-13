package T6;

import L6.AbstractC1164a;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC1164a implements InterfaceC2234g {
    public K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // T6.InterfaceC2234g
    public final boolean F3() {
        Parcel parcelD = D(9, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final boolean d6() {
        Parcel parcelD = D(12, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final boolean isCompassEnabled() {
        Parcel parcelD = D(10, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final boolean isMapToolbarEnabled() {
        Parcel parcelD = D(19, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final boolean isMyLocationButtonEnabled() {
        Parcel parcelD = D(11, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final boolean j4() {
        Parcel parcelD = D(15, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final boolean s4() {
        Parcel parcelD = D(14, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2234g
    public final void setCompassEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(2, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setMapToolbarEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(18, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setMyLocationButtonEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(3, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setRotateGesturesEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(7, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setScrollGesturesEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(4, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setTiltGesturesEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(6, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setZoomControlsEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(1, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final void setZoomGesturesEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(5, parcelK);
    }

    @Override // T6.InterfaceC2234g
    public final boolean v4() {
        Parcel parcelD = D(13, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }
}
