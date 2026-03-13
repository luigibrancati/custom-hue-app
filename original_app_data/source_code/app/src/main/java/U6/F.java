package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import v6.AbstractC6055j;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class F extends AbstractC6157a {
    public static final Parcelable.Creator<F> CREATOR = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E[] f16633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLng f16634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16635c;

    public F(E[] eArr, LatLng latLng, String str) {
        this.f16633a = eArr;
        this.f16634b = latLng;
        this.f16635c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return this.f16635c.equals(f10.f16635c) && this.f16634b.equals(f10.f16634b);
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f16634b, this.f16635c);
    }

    public String toString() {
        return AbstractC6055j.c(this).a("panoId", this.f16635c).a("position", this.f16634b.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        E[] eArr = this.f16633a;
        int iA = w6.c.a(parcel);
        w6.c.z(parcel, 2, eArr, i10, false);
        w6.c.u(parcel, 3, this.f16634b, i10, false);
        w6.c.w(parcel, 4, this.f16635c, false);
        w6.c.b(parcel, iA);
    }
}
