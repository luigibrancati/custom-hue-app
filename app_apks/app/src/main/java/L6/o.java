package L6;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends AbstractC1164a implements p {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // L6.p
    public final void H4(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(12, parcelK);
    }

    @Override // L6.p
    public final void M3(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(6, parcelK);
    }

    @Override // L6.p
    public final void S3(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(4, parcelK);
    }

    @Override // L6.p
    public final float c() {
        Parcel parcelD = D(13, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.p
    public final float d() {
        Parcel parcelD = D(5, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // L6.p
    public final int e() {
        Parcel parcelD = D(9, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // L6.p
    public final void f() {
        X(2, K());
    }

    @Override // L6.p
    public final void g() {
        X(1, K());
    }

    @Override // L6.p
    public final boolean n() {
        Parcel parcelD = D(11, K());
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.p
    public final boolean q() {
        Parcel parcelD = D(7, K());
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.p
    public final boolean t3(p pVar) {
        Parcel parcelK = K();
        s.e(parcelK, pVar);
        Parcel parcelD = D(8, parcelK);
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.p
    public final void y4(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(10, parcelK);
    }
}
