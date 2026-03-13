package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsCallback extends IInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f21268f = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

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

    void C2(String str, Bundle bundle);

    void S0(int i10, int i11, int i12, int i13, int i14, Bundle bundle);

    void c0(int i10, Bundle bundle);

    void e5(Bundle bundle);

    void j5(Bundle bundle);

    void q6(String str, Bundle bundle);

    Bundle r1(String str, Bundle bundle);

    void u5(int i10, int i11, Bundle bundle);

    void u6(Bundle bundle);

    void w6(int i10, Uri uri, boolean z10, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements ICustomTabsCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21269a;

            public a(IBinder iBinder) {
                this.f21269a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21269a;
            }
        }

        public Stub() {
            attachInterface(this, ICustomTabsCallback.f21268f);
        }

        public static ICustomTabsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.f21268f);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICustomTabsCallback)) ? new a(iBinder) : (ICustomTabsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ICustomTabsCallback.f21268f;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    c0(parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    C2(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    u6((Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    q6(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    w6(parcel.readInt(), (Uri) a.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleR1 = r1(parcel.readString(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    a.d(parcel2, bundleR1, 1);
                    return true;
                case 8:
                    u5(parcel.readInt(), parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    C((Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    S0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    e5((Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    j5((Bundle) a.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
