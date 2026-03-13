package K6;

import R6.C2074i;
import R6.C2075j;
import R6.C2077l;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends AbstractC1036a implements o0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // K6.o0
    public final void A1(Q q10, m0 m0Var) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, q10);
        AbstractC1047l.c(parcelD, m0Var);
        X(74, parcelD);
    }

    @Override // K6.o0
    public final void L1(C2075j c2075j, I i10) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, c2075j);
        AbstractC1047l.b(parcelD, i10);
        X(90, parcelD);
    }

    @Override // K6.o0
    public final void O3(Q q10, IStatusCallback iStatusCallback) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, q10);
        AbstractC1047l.c(parcelD, iStatusCallback);
        X(98, parcelD);
    }

    @Override // K6.o0
    public final void Q0(M m10) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, m10);
        X(59, parcelD);
    }

    @Override // K6.o0
    public final void d2(C2075j c2075j, q0 q0Var) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, c2075j);
        AbstractC1047l.c(parcelD, q0Var);
        X(82, parcelD);
    }

    @Override // K6.o0
    public final void m3(I i10, LocationRequest locationRequest, IStatusCallback iStatusCallback) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, i10);
        AbstractC1047l.b(parcelD, locationRequest);
        AbstractC1047l.c(parcelD, iStatusCallback);
        X(88, parcelD);
    }

    @Override // K6.o0
    public final void n6(C2074i c2074i, PendingIntent pendingIntent, m0 m0Var) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, c2074i);
        AbstractC1047l.b(parcelD, pendingIntent);
        AbstractC1047l.c(parcelD, m0Var);
        X(57, parcelD);
    }

    @Override // K6.o0
    public final Location r() {
        Parcel parcelK = K(7, D());
        Location location = (Location) AbstractC1047l.a(parcelK, Location.CREATOR);
        parcelK.recycle();
        return location;
    }

    @Override // K6.o0
    public final void x1(C2077l c2077l, InterfaceC1037b interfaceC1037b, String str) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, c2077l);
        AbstractC1047l.c(parcelD, interfaceC1037b);
        parcelD.writeString(null);
        X(63, parcelD);
    }

    @Override // K6.o0
    public final void x5(C2074i c2074i, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, c2074i);
        AbstractC1047l.b(parcelD, pendingIntent);
        AbstractC1047l.c(parcelD, iStatusCallback);
        X(97, parcelD);
    }

    @Override // K6.o0
    public final void z0(I i10, IStatusCallback iStatusCallback) {
        Parcel parcelD = D();
        AbstractC1047l.b(parcelD, i10);
        AbstractC1047l.c(parcelD, iStatusCallback);
        X(89, parcelD);
    }
}
