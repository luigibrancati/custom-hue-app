package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: x7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6317a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f47484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47485b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public AbstractC6317a(IBinder iBinder, String str) {
        this.f47484a = iBinder;
    }

    public final Parcel D() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f47485b);
        return parcelObtain;
    }

    public final void K(int i10, Parcel parcel) {
        try {
            this.f47484a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f47484a;
    }
}
