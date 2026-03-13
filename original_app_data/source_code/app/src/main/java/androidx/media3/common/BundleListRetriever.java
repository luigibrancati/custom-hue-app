package androidx.media3.common;

import G1.AbstractC0853a;
import K7.AbstractC1081v;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class BundleListRetriever extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f23523b = IBinder.getSuggestedMaxIpcSizeBytes();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f23524a;

    public static AbstractC1081v a(IBinder iBinder) {
        int i10;
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarR.a((Bundle) AbstractC0853a.e(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return aVarR.k();
    }

    public static AbstractC1081v getList(IBinder iBinder) {
        return iBinder instanceof BundleListRetriever ? ((BundleListRetriever) iBinder).f23524a : a(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f23524a.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f23523b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.f23524a.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
