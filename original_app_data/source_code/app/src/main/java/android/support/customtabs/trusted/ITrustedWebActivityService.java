package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface ITrustedWebActivityService extends IInterface {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f21278k = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

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

    Bundle G1(String str, Bundle bundle, IBinder iBinder);

    Bundle L2(Bundle bundle);

    void O5(Bundle bundle);

    Bundle f4();

    Bundle j2();

    int v5();

    Bundle y5(Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements ITrustedWebActivityService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21279a;

            public a(IBinder iBinder) {
                this.f21279a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21279a;
            }
        }

        public Stub() {
            attachInterface(this, ITrustedWebActivityService.f21278k);
        }

        public static ITrustedWebActivityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.f21278k);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityService)) ? new a(iBinder) : (ITrustedWebActivityService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ITrustedWebActivityService.f21278k;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    Bundle bundleL2 = L2((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleL2, 1);
                    return true;
                case 3:
                    O5((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iV5 = v5();
                    parcel2.writeNoException();
                    parcel2.writeInt(iV5);
                    return true;
                case 5:
                    Bundle bundleF4 = f4();
                    parcel2.writeNoException();
                    a.d(parcel2, bundleF4, 1);
                    return true;
                case 6:
                    Bundle bundleY5 = y5((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleY5, 1);
                    return true;
                case 7:
                    Bundle bundleJ2 = j2();
                    parcel2.writeNoException();
                    a.d(parcel2, bundleJ2, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 9:
                    Bundle bundleG1 = G1(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    a.d(parcel2, bundleG1, 1);
                    return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
