package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IListenableWorkerImpl extends IInterface {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f24821s = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');

    void F5(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void I1(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void f6(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IListenableWorkerImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24822a;

            public a(IBinder iBinder) {
                this.f24822a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24822a;
            }
        }

        public Stub() {
            attachInterface(this, IListenableWorkerImpl.f24821s);
        }

        public static IListenableWorkerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IListenableWorkerImpl.f24821s);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IListenableWorkerImpl)) ? new a(iBinder) : (IListenableWorkerImpl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IListenableWorkerImpl.f24821s;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                I1(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i10 == 2) {
                F5(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                f6(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
