package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2294v extends AbstractC6157a {
    public static final Parcelable.Creator<C2294v> CREATOR = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f16737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16739c;

    public C2294v(LatLng latLng, String str, String str2) {
        this.f16737a = latLng;
        this.f16738b = str;
        this.f16739c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f16737a;
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 2, latLng, i10, false);
        w6.c.w(parcel, 3, this.f16738b, false);
        w6.c.w(parcel, 4, this.f16739c, false);
        w6.c.b(parcel, iA);
    }
}
