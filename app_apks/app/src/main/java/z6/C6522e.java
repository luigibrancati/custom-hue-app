package z6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: z6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6522e extends H6.a implements IInterface {
    public C6522e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void I6(InterfaceC6521d interfaceC6521d, C6518a c6518a) {
        Parcel parcelD = D();
        H6.b.c(parcelD, interfaceC6521d);
        H6.b.b(parcelD, c6518a);
        K(1, parcelD);
    }

    public final void J6(InterfaceC6521d interfaceC6521d, C6518a c6518a, InterfaceC6523f interfaceC6523f) {
        Parcel parcelD = D();
        H6.b.c(parcelD, interfaceC6521d);
        H6.b.b(parcelD, c6518a);
        H6.b.c(parcelD, interfaceC6523f);
        K(2, parcelD);
    }
}
