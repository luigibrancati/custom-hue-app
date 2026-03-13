package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.IMultiInstanceInvalidationCallback;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IMultiInstanceInvalidationService extends IInterface {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f24561r = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    int A4(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);

    void z3(int i10, String[] strArr);

    void z6(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i10);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IMultiInstanceInvalidationService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24562a;

            public a(IBinder iBinder) {
                this.f24562a = iBinder;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int A4(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.f24561r);
                    parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    parcelObtain.writeString(str);
                    this.f24562a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24562a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void z3(int i10, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.f24561r);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f24562a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void z6(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.f24561r);
                    parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    parcelObtain.writeInt(i10);
                    this.f24562a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMultiInstanceInvalidationService.f24561r);
        }

        public static IMultiInstanceInvalidationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationService.f24561r);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) ? new a(iBinder) : (IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IMultiInstanceInvalidationService.f24561r;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iA4 = A4(IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iA4);
            } else if (i10 == 2) {
                z6(IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                z3(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
