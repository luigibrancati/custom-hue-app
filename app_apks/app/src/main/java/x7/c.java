package x7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC6317a implements d {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.d
    public final void n5(String str, Bundle bundle, e eVar) {
        Parcel parcelD = D();
        parcelD.writeString(str);
        int i10 = b.f47486a;
        parcelD.writeInt(1);
        bundle.writeToParcel(parcelD, 0);
        parcelD.writeStrongBinder(eVar);
        K(2, parcelD);
    }
}
