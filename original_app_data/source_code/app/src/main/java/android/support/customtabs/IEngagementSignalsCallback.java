package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IEngagementSignalsCallback extends IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f21272h = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void R4(boolean z10, Bundle bundle);

    void R5(int i10, Bundle bundle);

    void c5(boolean z10, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IEngagementSignalsCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f21273a;

            public a(IBinder iBinder) {
                this.f21273a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f21273a;
            }
        }

        public Stub() {
            attachInterface(this, IEngagementSignalsCallback.f21272h);
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.f21272h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) ? new a(iBinder) : (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IEngagementSignalsCallback.f21272h;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                c5(parcel.readInt() != 0, (Bundle) a.b(parcel, Bundle.CREATOR));
            } else if (i10 == 3) {
                R5(parcel.readInt(), (Bundle) a.b(parcel, Bundle.CREATOR));
            } else {
                if (i10 != 4) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                R4(parcel.readInt() != 0, (Bundle) a.b(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
