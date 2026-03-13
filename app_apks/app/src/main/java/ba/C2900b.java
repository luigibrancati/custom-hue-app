package ba;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.dynamite.client.INativeLibraryLoader;

/* JADX INFO: renamed from: ba.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2900b extends com.google.ar.core.dependencies.c implements INativeLibraryLoader {
    public C2900b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(2, parcelA);
        int i10 = parcelB.readInt();
        parcelB.recycle();
        return i10;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(1, parcelA);
        long j10 = parcelB.readLong();
        parcelB.recycle();
        return j10;
    }
}
