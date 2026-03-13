package ba;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.INativeLibraryLoader;
import com.google.vr.dynamite.client.IObjectWrapper;

/* JADX INFO: renamed from: ba.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2899a extends com.google.ar.core.dependencies.c implements ILoadedInstanceCreator {
    public C2899a(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader c2900b;
        Parcel parcelA = a();
        com.google.ar.core.dependencies.e.c(parcelA, iObjectWrapper);
        com.google.ar.core.dependencies.e.c(parcelA, iObjectWrapper2);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c2900b = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            c2900b = iInterfaceQueryLocalInterface instanceof INativeLibraryLoader ? (INativeLibraryLoader) iInterfaceQueryLocalInterface : new C2900b(strongBinder);
        }
        parcelB.recycle();
        return c2900b;
    }
}
