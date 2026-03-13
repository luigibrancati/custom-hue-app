package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IWorkManagerImpl extends IInterface {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f24823t = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');

    void F0(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void J3(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void L3(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void P0(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void W0(IWorkManagerImplCallback iWorkManagerImplCallback);

    void Z5(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void d5(byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void e3(String str, byte[] bArr, IWorkManagerImplCallback iWorkManagerImplCallback);

    void r6(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    void x2(String str, IWorkManagerImplCallback iWorkManagerImplCallback);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IWorkManagerImpl {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24824a;

            public a(IBinder iBinder) {
                this.f24824a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24824a;
            }
        }

        public Stub() {
            attachInterface(this, IWorkManagerImpl.f24823t);
        }

        public static IWorkManagerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImpl.f24823t);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWorkManagerImpl)) ? new a(iBinder) : (IWorkManagerImpl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IWorkManagerImpl.f24823t;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 1:
                    P0(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    e3(parcel.readString(), parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    L3(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    x2(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    r6(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    F0(parcel.readString(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    W0(IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    d5(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    J3(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    Z5(parcel.createByteArray(), IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder()));
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
