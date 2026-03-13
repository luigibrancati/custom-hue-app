package com.google.android.gms.measurement.internal;

import X6.C2388g;
import X6.C2404i;
import X6.C2415j2;
import X6.C2431l2;
import X6.C2460p;
import X6.C2538y6;
import X6.I;
import X6.InterfaceC2407i2;
import X6.InterfaceC2423k2;
import X6.InterfaceC2439m2;
import X6.W6;
import X6.c7;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.zzbm;
import io.flutter.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzga extends zzbm implements InterfaceC2407i2 {
    public zzga() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2439m2 c2431l2 = null;
        InterfaceC2423k2 c2415j2 = null;
        switch (i10) {
            case 1:
                I i12 = (I) O.b(parcel, I.CREATOR);
                c7 c7Var = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                M4(i12, c7Var);
                parcel2.writeNoException();
                return true;
            case 2:
                W6 w62 = (W6) O.b(parcel, W6.CREATOR);
                c7 c7Var2 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                z4(w62, c7Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                c7 c7Var3 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                b2(c7Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                I i13 = (I) O.b(parcel, I.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                O.f(parcel);
                i0(i13, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                c7 c7Var4 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                W5(c7Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                c7 c7Var5 = (c7) O.b(parcel, c7.CREATOR);
                boolean zA = O.a(parcel);
                O.f(parcel);
                List listK0 = K0(c7Var5, zA);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK0);
                return true;
            case 9:
                I i14 = (I) O.b(parcel, I.CREATOR);
                String string3 = parcel.readString();
                O.f(parcel);
                byte[] bArrE4 = E4(i14, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrE4);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                O.f(parcel);
                n4(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                c7 c7Var6 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                String strO4 = o4(c7Var6);
                parcel2.writeNoException();
                parcel2.writeString(strO4);
                return true;
            case 12:
                C2404i c2404i = (C2404i) O.b(parcel, C2404i.CREATOR);
                c7 c7Var7 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                Q4(c2404i, c7Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C2404i c2404i2 = (C2404i) O.b(parcel, C2404i.CREATOR);
                O.f(parcel);
                s2(c2404i2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA2 = O.a(parcel);
                c7 c7Var8 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                List listL3 = l3(string7, string8, zA2, c7Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL3);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zA3 = O.a(parcel);
                O.f(parcel);
                List listP0 = p0(string9, string10, string11, zA3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP0);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                c7 c7Var9 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                List listU4 = u4(string12, string13, c7Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU4);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                O.f(parcel);
                List listP1 = p1(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP1);
                return true;
            case 18:
                c7 c7Var10 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                B3(c7Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) O.b(parcel, Bundle.CREATOR);
                c7 c7Var11 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                k0(bundle, c7Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                c7 c7Var12 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                N0(c7Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                c7 c7Var13 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                C2460p c2460pG0 = G0(c7Var13);
                parcel2.writeNoException();
                if (c2460pG0 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c2460pG0.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                c7 c7Var14 = (c7) O.b(parcel, c7.CREATOR);
                Bundle bundle2 = (Bundle) O.b(parcel, Bundle.CREATOR);
                O.f(parcel);
                List listK1 = K1(c7Var14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK1);
                return true;
            case 25:
                c7 c7Var15 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                E1(c7Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                c7 c7Var16 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                V5(c7Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                c7 c7Var17 = (c7) O.b(parcel, c7.CREATOR);
                O.f(parcel);
                E3(c7Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                c7 c7Var18 = (c7) O.b(parcel, c7.CREATOR);
                C2538y6 c2538y6 = (C2538y6) O.b(parcel, C2538y6.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c2431l2 = iInterfaceQueryLocalInterface instanceof InterfaceC2439m2 ? (InterfaceC2439m2) iInterfaceQueryLocalInterface : new C2431l2(strongBinder);
                }
                O.f(parcel);
                k4(c7Var18, c2538y6, c2431l2);
                parcel2.writeNoException();
                return true;
            case Build.API_LEVELS.API_30 /* 30 */:
                c7 c7Var19 = (c7) O.b(parcel, c7.CREATOR);
                C2388g c2388g = (C2388g) O.b(parcel, C2388g.CREATOR);
                O.f(parcel);
                G3(c7Var19, c2388g);
                parcel2.writeNoException();
                return true;
            case 31:
                c7 c7Var20 = (c7) O.b(parcel, c7.CREATOR);
                Bundle bundle3 = (Bundle) O.b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c2415j2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2423k2 ? (InterfaceC2423k2) iInterfaceQueryLocalInterface2 : new C2415j2(strongBinder2);
                }
                O.f(parcel);
                D6(c7Var20, bundle3, c2415j2);
                parcel2.writeNoException();
                return true;
        }
    }
}
