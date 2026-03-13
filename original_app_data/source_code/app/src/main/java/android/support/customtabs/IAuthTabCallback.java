package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IAuthTabCallback extends IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f21266e = "android$support$customtabs$IAuthTabCallback".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void C(Bundle bundle);

    Bundle D1(String str, Bundle bundle);

    void c0(int i10, Bundle bundle);

    void f0(String str, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IAuthTabCallback {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IAuthTabCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21267a;

            public a(IBinder iBinder) {
                this.f21267a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21267a;
            }
        }

        public Stub() {
            attachInterface(this, IAuthTabCallback.f21266e);
        }

        public static IAuthTabCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAuthTabCallback.f21266e);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAuthTabCallback)) ? new a(iBinder) : (IAuthTabCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IAuthTabCallback.f21266e;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                c0(parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                f0(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
            } else if (i10 == 4) {
                Bundle bundleD1 = D1(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                a.d(parcel2, bundleD1, 1);
            } else {
                if (i10 != 5) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                C((Bundle) a.c(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
