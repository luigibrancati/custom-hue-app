package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.IAuthTabCallback;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f21270g = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void e(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        public static void f(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void B2(ICustomTabsCallback iCustomTabsCallback, List list, Bundle bundle);

    boolean G6(IAuthTabCallback iAuthTabCallback, Bundle bundle);

    boolean H0(ICustomTabsCallback iCustomTabsCallback, int i10, Uri uri, Bundle bundle);

    boolean I5(ICustomTabsCallback iCustomTabsCallback);

    boolean J2(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle);

    boolean Q2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    void V3(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean X3(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list);

    boolean Z0(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i10, Bundle bundle);

    boolean Z4(long j10);

    boolean b6(ICustomTabsCallback iCustomTabsCallback, Uri uri);

    boolean r2(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    Bundle u1(String str, Bundle bundle);

    boolean w2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean x6(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    int z5(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements ICustomTabsService {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements ICustomTabsService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21271a;

            public a(IBinder iBinder) {
                this.f21271a = iBinder;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean I5(ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.f21270g);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    this.f21271a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean X3(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.f21270g);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    a.f(parcelObtain, uri, 0);
                    a.f(parcelObtain, bundle, 0);
                    a.e(parcelObtain, list, 0);
                    this.f21271a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean Z4(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.f21270g);
                    parcelObtain.writeLong(j10);
                    this.f21271a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21271a;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean w2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.f21270g);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    a.f(parcelObtain, bundle, 0);
                    this.f21271a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICustomTabsService.f21270g);
        }

        public static ICustomTabsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.f21270g);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsService)) ? new a(iBinder) : (ICustomTabsService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ICustomTabsService.f21270g;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    boolean zZ4 = Z4(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zZ4 ? 1 : 0);
                    return true;
                case 3:
                    boolean zI5 = I5(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zI5 ? 1 : 0);
                    return true;
                case 4:
                    ICustomTabsCallback iCustomTabsCallbackAsInterface = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) a.d(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zX3 = X3(iCustomTabsCallbackAsInterface, uri, (Bundle) a.d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zX3 ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleU1 = u1(parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.f(parcel2, bundleU1, 1);
                    return true;
                case 6:
                    boolean zQ2 = Q2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ2 ? 1 : 0);
                    return true;
                case 7:
                    boolean zB6 = b6(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zB6 ? 1 : 0);
                    return true;
                case 8:
                    int iZ5 = z5(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iZ5);
                    return true;
                case 9:
                    boolean zH0 = H0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zH0 ? 1 : 0);
                    return true;
                case 10:
                    boolean zW2 = w2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zW2 ? 1 : 0);
                    return true;
                case 11:
                    boolean zR2 = r2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zR2 ? 1 : 0);
                    return true;
                case 12:
                    boolean zZ0 = Z0(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zZ0 ? 1 : 0);
                    return true;
                case 13:
                    boolean zX6 = x6(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zX6 ? 1 : 0);
                    return true;
                case 14:
                    boolean zJ2 = J2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zJ2 ? 1 : 0);
                    return true;
                case 15:
                    V3(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.d(parcel, Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    B2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.createTypedArrayList(Uri.CREATOR), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 18:
                    boolean zG6 = G6(IAuthTabCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG6 ? 1 : 0);
                    return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
