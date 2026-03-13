package X6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X6.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2391g2 extends com.google.android.gms.internal.measurement.N implements InterfaceC2407i2 {
    public C2391g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // X6.InterfaceC2407i2
    public final void B3(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(18, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void D6(c7 c7Var, Bundle bundle, InterfaceC2423k2 interfaceC2423k2) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        com.google.android.gms.internal.measurement.O.c(parcelK, bundle);
        com.google.android.gms.internal.measurement.O.d(parcelK, interfaceC2423k2);
        X(31, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void E1(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(25, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void E3(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(27, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final byte[] E4(I i10, String str) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, i10);
        parcelK.writeString(str);
        Parcel parcelD = D(9, parcelK);
        byte[] bArrCreateByteArray = parcelD.createByteArray();
        parcelD.recycle();
        return bArrCreateByteArray;
    }

    @Override // X6.InterfaceC2407i2
    public final C2460p G0(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        Parcel parcelD = D(21, parcelK);
        C2460p c2460p = (C2460p) com.google.android.gms.internal.measurement.O.b(parcelD, C2460p.CREATOR);
        parcelD.recycle();
        return c2460p;
    }

    @Override // X6.InterfaceC2407i2
    public final void G3(c7 c7Var, C2388g c2388g) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        com.google.android.gms.internal.measurement.O.c(parcelK, c2388g);
        X(30, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void M4(I i10, c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, i10);
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(1, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void N0(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(20, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void Q4(C2404i c2404i, c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c2404i);
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(12, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void V5(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(26, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void W5(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(6, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void b2(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(4, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void k0(Bundle bundle, c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, bundle);
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(19, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final void k4(c7 c7Var, C2538y6 c2538y6, InterfaceC2439m2 interfaceC2439m2) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        com.google.android.gms.internal.measurement.O.c(parcelK, c2538y6);
        com.google.android.gms.internal.measurement.O.d(parcelK, interfaceC2439m2);
        X(29, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final List l3(String str, String str2, boolean z10, c7 c7Var) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.O.f29293a;
        parcelK.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        Parcel parcelD = D(14, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(W6.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X6.InterfaceC2407i2
    public final void n4(long j10, String str, String str2, String str3) {
        Parcel parcelK = K();
        parcelK.writeLong(j10);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        X(10, parcelK);
    }

    @Override // X6.InterfaceC2407i2
    public final String o4(c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        Parcel parcelD = D(11, parcelK);
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }

    @Override // X6.InterfaceC2407i2
    public final List p0(String str, String str2, String str3, boolean z10) {
        Parcel parcelK = K();
        parcelK.writeString(null);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.O.f29293a;
        parcelK.writeInt(z10 ? 1 : 0);
        Parcel parcelD = D(15, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(W6.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X6.InterfaceC2407i2
    public final List p1(String str, String str2, String str3) {
        Parcel parcelK = K();
        parcelK.writeString(null);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        Parcel parcelD = D(17, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(C2404i.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X6.InterfaceC2407i2
    public final List u4(String str, String str2, c7 c7Var) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        Parcel parcelD = D(16, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(C2404i.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X6.InterfaceC2407i2
    public final void z4(W6 w62, c7 c7Var) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, w62);
        com.google.android.gms.internal.measurement.O.c(parcelK, c7Var);
        X(2, parcelK);
    }
}
