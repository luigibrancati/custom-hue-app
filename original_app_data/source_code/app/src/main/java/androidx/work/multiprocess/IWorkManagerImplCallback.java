package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IWorkManagerImplCallback extends IInterface {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f24825u = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');

    void a5(String str);

    void c6(byte[] bArr);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IWorkManagerImplCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f24826a;

            public a(IBinder iBinder) {
                this.f24826a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24826a;
            }
        }

        public Stub() {
            attachInterface(this, IWorkManagerImplCallback.f24825u);
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImplCallback.f24825u);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWorkManagerImplCallback)) ? new a(iBinder) : (IWorkManagerImplCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IWorkManagerImplCallback.f24825u;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                c6(parcel.createByteArray());
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                a5(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
