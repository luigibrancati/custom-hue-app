package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f22642o = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    void d3(boolean z10, boolean z11);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements IUnusedAppRestrictionsBackportCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f22643a;

            public a(IBinder iBinder) {
                this.f22643a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22643a;
            }
        }

        public Stub() {
            attachInterface(this, IUnusedAppRestrictionsBackportCallback.f22642o);
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.f22642o);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new a(iBinder) : (IUnusedAppRestrictionsBackportCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IUnusedAppRestrictionsBackportCallback.f22642o;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            d3(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
