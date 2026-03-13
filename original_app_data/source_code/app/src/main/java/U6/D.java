package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class D extends AbstractC6157a {
    public static final Parcelable.Creator<D> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2276c f16630a;

    public D(IBinder iBinder) {
        this.f16630a = new C2276c(IObjectWrapper.Stub.asInterface(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C2276c c2276c = this.f16630a;
        int iA = w6.c.a(parcel);
        w6.c.m(parcel, 2, c2276c.a().asBinder(), false);
        w6.c.b(parcel, iA);
    }
}
