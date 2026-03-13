package L6;

import U6.C2279f;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractC1164a implements m {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // L6.m
    public final void A5(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(17, parcelK);
    }

    @Override // L6.m
    public final void F2(C2279f c2279f) {
        Parcel parcelK = K();
        s.c(parcelK, c2279f);
        X(21, parcelK);
    }

    @Override // L6.m
    public final void L5(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(7, parcelK);
    }

    @Override // L6.m
    public final boolean Q1(m mVar) {
        Parcel parcelK = K();
        s.e(parcelK, mVar);
        Parcel parcelD = D(15, parcelK);
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // L6.m
    public final void U1(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(11, parcelK);
    }

    @Override // L6.m
    public final void V1(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(13, parcelK);
    }

    @Override // L6.m
    public final void b1(List list) {
        Parcel parcelK = K();
        parcelK.writeTypedList(list);
        X(3, parcelK);
    }

    @Override // L6.m
    public final int f() {
        Parcel parcelD = D(16, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // L6.m
    public final void g3(List list) {
        Parcel parcelK = K();
        parcelK.writeTypedList(list);
        X(25, parcelK);
    }

    @Override // L6.m
    public final String j() {
        Parcel parcelD = D(2, K());
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // L6.m
    public final void l0(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(5, parcelK);
    }

    @Override // L6.m
    public final void q() {
        X(1, K());
    }

    @Override // L6.m
    public final void s(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(23, parcelK);
    }

    @Override // L6.m
    public final void x(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(9, parcelK);
    }

    @Override // L6.m
    public final void y6(C2279f c2279f) {
        Parcel parcelK = K();
        s.c(parcelK, c2279f);
        X(19, parcelK);
    }
}
