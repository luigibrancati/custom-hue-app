package com.google.android.gms.dynamic;

import J6.n;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface IFragmentWrapper extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new a(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
            switch (i10) {
                case 2:
                    IObjectWrapper iObjectWrapperZzb = zzb();
                    parcel2.writeNoException();
                    n.e(parcel2, iObjectWrapperZzb);
                    return true;
                case 3:
                    Bundle bundleB = b();
                    parcel2.writeNoException();
                    n.d(parcel2, bundleB);
                    return true;
                case 4:
                    int iC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                    return true;
                case 5:
                    IFragmentWrapper iFragmentWrapperD = d();
                    parcel2.writeNoException();
                    n.e(parcel2, iFragmentWrapperD);
                    return true;
                case 6:
                    IObjectWrapper iObjectWrapperE = e();
                    parcel2.writeNoException();
                    n.e(parcel2, iObjectWrapperE);
                    return true;
                case 7:
                    boolean zI = i();
                    parcel2.writeNoException();
                    ClassLoader classLoader = n.f6277a;
                    parcel2.writeInt(zI ? 1 : 0);
                    return true;
                case 8:
                    String strF = f();
                    parcel2.writeNoException();
                    parcel2.writeString(strF);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperG = g();
                    parcel2.writeNoException();
                    n.e(parcel2, iFragmentWrapperG);
                    return true;
                case 10:
                    int iK = k();
                    parcel2.writeNoException();
                    parcel2.writeInt(iK);
                    return true;
                case 11:
                    boolean zH = h();
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = n.f6277a;
                    parcel2.writeInt(zH ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper iObjectWrapperJ = j();
                    parcel2.writeNoException();
                    n.e(parcel2, iObjectWrapperJ);
                    return true;
                case 13:
                    boolean zP = p();
                    parcel2.writeNoException();
                    ClassLoader classLoader3 = n.f6277a;
                    parcel2.writeInt(zP ? 1 : 0);
                    return true;
                case 14:
                    boolean zM = m();
                    parcel2.writeNoException();
                    ClassLoader classLoader4 = n.f6277a;
                    parcel2.writeInt(zM ? 1 : 0);
                    return true;
                case 15:
                    boolean zN = n();
                    parcel2.writeNoException();
                    ClassLoader classLoader5 = n.f6277a;
                    parcel2.writeInt(zN ? 1 : 0);
                    return true;
                case 16:
                    boolean zQ = q();
                    parcel2.writeNoException();
                    ClassLoader classLoader6 = n.f6277a;
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                case 17:
                    boolean zM2 = M();
                    parcel2.writeNoException();
                    ClassLoader classLoader7 = n.f6277a;
                    parcel2.writeInt(zM2 ? 1 : 0);
                    return true;
                case 18:
                    boolean zO = O();
                    parcel2.writeNoException();
                    ClassLoader classLoader8 = n.f6277a;
                    parcel2.writeInt(zO ? 1 : 0);
                    return true;
                case 19:
                    boolean zR = r();
                    parcel2.writeNoException();
                    ClassLoader classLoader9 = n.f6277a;
                    parcel2.writeInt(zR ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    n.f(parcel);
                    H(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zA = n.a(parcel);
                    n.f(parcel);
                    r0(zA);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zA2 = n.a(parcel);
                    n.f(parcel);
                    T0(zA2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zA3 = n.a(parcel);
                    n.f(parcel);
                    F(zA3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zA4 = n.a(parcel);
                    n.f(parcel);
                    I(zA4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) n.b(parcel, Intent.CREATOR);
                    n.f(parcel);
                    U5(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) n.b(parcel, Intent.CREATOR);
                    int i12 = parcel.readInt();
                    n.f(parcel);
                    O1(intent2, i12);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    n.f(parcel);
                    y3(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void F(boolean z10);

    void H(IObjectWrapper iObjectWrapper);

    void I(boolean z10);

    boolean M();

    boolean O();

    void O1(Intent intent, int i10);

    void T0(boolean z10);

    void U5(Intent intent);

    Bundle b();

    int c();

    IFragmentWrapper d();

    IObjectWrapper e();

    String f();

    IFragmentWrapper g();

    boolean h();

    boolean i();

    IObjectWrapper j();

    int k();

    boolean m();

    boolean n();

    boolean p();

    boolean q();

    boolean r();

    void r0(boolean z10);

    void y3(IObjectWrapper iObjectWrapper);

    IObjectWrapper zzb();
}
