package T6;

import L6.AbstractC1164a;
import U6.C2281h;
import U6.C2288o;
import U6.C2290q;
import U6.C2291s;
import U6.C2296x;
import U6.C2298z;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzan;
import com.google.android.gms.internal.maps.zzaq;
import com.google.android.gms.internal.maps.zzav;
import com.google.android.gms.internal.maps.zzm;
import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q extends AbstractC1164a implements InterfaceC2229b {
    public Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // T6.InterfaceC2229b
    public final InterfaceC2232e E() {
        InterfaceC2232e h10;
        Parcel parcelD = D(26, K());
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            h10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            h10 = iInterfaceQueryLocalInterface instanceof InterfaceC2232e ? (InterfaceC2232e) iInterfaceQueryLocalInterface : new H(strongBinder);
        }
        parcelD.recycle();
        return h10;
    }

    @Override // T6.InterfaceC2229b
    public final void F4(IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        X(4, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void H2(r rVar) {
        Parcel parcelK = K();
        L6.s.e(parcelK, rVar);
        X(29, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final InterfaceC2234g H5() {
        InterfaceC2234g k10;
        Parcel parcelD = D(25, K());
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            k10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            k10 = iInterfaceQueryLocalInterface instanceof InterfaceC2234g ? (InterfaceC2234g) iInterfaceQueryLocalInterface : new K(strongBinder);
        }
        parcelD.recycle();
        return k10;
    }

    @Override // T6.InterfaceC2229b
    public final void L0(LatLngBounds latLngBounds) {
        Parcel parcelK = K();
        L6.s.c(parcelK, latLngBounds);
        X(95, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final boolean M5() {
        Parcel parcelD = D(40, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2229b
    public final L6.f N1() {
        Parcel parcelD = D(109, K());
        L6.f fVarZzb = zzaf.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return fVarZzb;
    }

    @Override // T6.InterfaceC2229b
    public final void P2(S s10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, s10);
        X(33, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void P4(Z z10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, z10);
        X(89, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final float Q3() {
        Parcel parcelD = D(3, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // T6.InterfaceC2229b
    public final void Q5(V v10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, v10);
        X(99, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void S4(InterfaceC2237j interfaceC2237j) {
        Parcel parcelK = K();
        L6.s.e(parcelK, interfaceC2237j);
        X(32, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void T1(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(93, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void V2(A a10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, a10);
        X(85, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final L6.w W1(C2281h c2281h) {
        Parcel parcelK = K();
        L6.s.c(parcelK, c2281h);
        Parcel parcelD = D(35, parcelK);
        L6.w wVarZzb = zzm.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return wVarZzb;
    }

    @Override // T6.InterfaceC2229b
    public final void Z2(B b10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, b10);
        X(87, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void a3(IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        X(5, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void e1(InterfaceC2246t interfaceC2246t) {
        Parcel parcelK = K();
        L6.s.e(parcelK, interfaceC2246t);
        X(30, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final L6.D e2(C2288o c2288o) {
        Parcel parcelK = K();
        L6.s.c(parcelK, c2288o);
        Parcel parcelD = D(12, parcelK);
        L6.D dZzb = zzw.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return dZzb;
    }

    @Override // T6.InterfaceC2229b
    public final L6.p e6(U6.K k10) {
        Parcel parcelK = K();
        L6.s.c(parcelK, k10);
        Parcel parcelD = D(13, parcelK);
        L6.p pVarZzb = zzav.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return pVarZzb;
    }

    @Override // T6.InterfaceC2229b
    public final void f5(InterfaceC2243p interfaceC2243p) {
        Parcel parcelK = K();
        L6.s.e(parcelK, interfaceC2243p);
        X(28, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final CameraPosition getCameraPosition() {
        Parcel parcelD = D(1, K());
        CameraPosition cameraPosition = (CameraPosition) L6.s.a(parcelD, CameraPosition.CREATOR);
        parcelD.recycle();
        return cameraPosition;
    }

    @Override // T6.InterfaceC2229b
    public final L6.k h5(C2296x c2296x) {
        Parcel parcelK = K();
        L6.s.c(parcelK, c2296x);
        Parcel parcelD = D(10, parcelK);
        L6.k kVarZzb = zzan.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return kVarZzb;
    }

    @Override // T6.InterfaceC2229b
    public final void i5(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        X(92, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final boolean isTrafficEnabled() {
        Parcel parcelD = D(17, K());
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2229b
    public final void j0(Y y10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, y10);
        X(96, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void j1(InterfaceC2247u interfaceC2247u) {
        Parcel parcelK = K();
        L6.s.e(parcelK, interfaceC2247u);
        X(31, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void j6(InterfaceC2239l interfaceC2239l) {
        Parcel parcelK = K();
        L6.s.e(parcelK, interfaceC2239l);
        X(84, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final boolean n1(C2290q c2290q) {
        Parcel parcelK = K();
        L6.s.c(parcelK, c2290q);
        Parcel parcelD = D(91, parcelK);
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2229b
    public final void o1(a0 a0Var) {
        Parcel parcelK = K();
        L6.s.e(parcelK, a0Var);
        X(83, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final L6.m o6(C2298z c2298z) {
        Parcel parcelK = K();
        L6.s.c(parcelK, c2298z);
        Parcel parcelD = D(9, parcelK);
        L6.m mVarZzb = zzaq.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return mVarZzb;
    }

    @Override // T6.InterfaceC2229b
    public final void p2(I i10, IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        L6.s.e(parcelK, i10);
        L6.s.e(parcelK, iObjectWrapper);
        X(38, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final float q3() {
        Parcel parcelD = D(2, K());
        float f10 = parcelD.readFloat();
        parcelD.recycle();
        return f10;
    }

    @Override // T6.InterfaceC2229b
    public final L6.h q5(C2291s c2291s) {
        Parcel parcelK = K();
        L6.s.c(parcelK, c2291s);
        Parcel parcelD = D(11, parcelK);
        L6.h hVarZzb = zzai.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return hVarZzb;
    }

    @Override // T6.InterfaceC2229b
    public final void r4(int i10, int i11, int i12, int i13) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        parcelK.writeInt(i11);
        parcelK.writeInt(i12);
        parcelK.writeInt(i13);
        X(39, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void s6(X x10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, x10);
        X(97, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void setBuildingsEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(41, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final boolean setIndoorEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        Parcel parcelD = D(20, parcelK);
        boolean zF = L6.s.f(parcelD);
        parcelD.recycle();
        return zF;
    }

    @Override // T6.InterfaceC2229b
    public final void setMapType(int i10) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        X(16, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void setMyLocationEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(22, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void setTrafficEnabled(boolean z10) {
        Parcel parcelK = K();
        ClassLoader classLoader = L6.s.f8585a;
        parcelK.writeInt(z10 ? 1 : 0);
        X(18, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void t6(IObjectWrapper iObjectWrapper, int i10, N n10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        parcelK.writeInt(i10);
        L6.s.e(parcelK, n10);
        X(7, parcelK);
    }

    @Override // T6.InterfaceC2229b
    public final void w5() {
        X(94, K());
    }
}
